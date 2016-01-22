package org.schema.generator

import java.io.Closeable
import java.io.File

/**
 * @author Victor Kropp
 */

class Klass(private val sourceDirectory: File, val namespace: String, val name: String, val annotations: Collection<String>?, val copyright: String?) {
    internal val text = StringBuilder()

    val fields = arrayListOf<Field>()

    fun field(name: String, type: String, body: Field.() -> Unit = {}) {
        val field = Field(this, name.capitalize(), type)
        fields += field

        field.body()

        text.appendln("  private $type my${field.name};")
    }

    fun method(name: String, type: String = "void", annotations: Collection<String>? = null, body: Method.() -> Unit) {
        Method(this, name, type, annotations).use { it.body() }
    }

    fun hashCodeAndEquals(callSuper: Boolean = true) {
        with(text) {
            // hashCode
            appendln("  @Override public int hashCode() {")
            if (callSuper) {
                appendln("    int result = super.hashCode();")
            } else {
                appendln("    int result = 0;")
            }
            fields.forEach {
                appendln("    result = 31 * result + (my${it.name} != null ? my${it.name}.hashCode() : 0);")
            }
            appendln("    return result;")
            appendln("  }")

            // equals
            appendln("  @Override public boolean equals(Object o) {")
            appendln("    if (this == o) return true;")
            appendln("    if (o == null || getClass() != o.getClass()) return false;")
            val other = name.decapitalize()
            appendln("    $name $other = ($name) o;")
            if (callSuper) {
                appendln("    if (!super.equals(o)) return false;")
            }
            fields.forEach {
                appendln("    if (my${it.name} != null ? !my${it.name}.equals($other.my${it.name}) : $other.my${it.name} != null) return false;")
            }
            appendln("    return true;")
            appendln("  }")
        }
    }

    init {
        with(text) {
            copyright?.let {
                appendln(it)
                appendln()
            }
            appendln("package $namespace;")
            appendln()
            annotations?.forEach {
                appendln(it)
            }
            appendln("public class $name {")
        }
    }

    private fun finish() {
        text.appendln("}")
    }

    fun save() {
        finish()

        val packageDir = namespace.split(Regex("\\.")).fold(sourceDirectory) { d, s -> File(d, s) }
        packageDir.mkdirs()
        File(packageDir, "$name.java").writeText(text.toString())
    }
}

fun klass(sourceDirectory: File, namespace: String, name: String, annotations: Collection<String>? = null, copyright: String? = null, body: Klass.() -> Unit) {
    val c = Klass(sourceDirectory, namespace, name, annotations, copyright)
    c.body()
    c.save()
}

class Field(val c: Klass, val name: String, val type: String) {
    fun getter() {
        c.text.appendln("  public $type get$name() { return my$name; }")
    }
    fun setter(methodCallBefore: String? = null, isPublic: Boolean = true) {
        c.text.append(if (isPublic) "  public" else "  ")
        val paramName = getVariableName(type, "value")
        c.text.append("void set$type($type $paramName) {")
        methodCallBefore?.let { c.text.append(" $it();") }
        c.text.appendln(" my$name = $paramName; }")
    }
    private fun getVariableName(typeName: String, entityName: String? = null): String {
        val indexOfDot = typeName.lastIndexOf('.')
        if (indexOfDot > 0) {
            return typeName.substring(indexOfDot+1).decapitalize()
        }
        if (entityName != null && arrayOf("Boolean", "String", "Class", "Long", "Int", "Double", "Float").contains(typeName)) {
            return entityName.decapitalize()
        }
        return typeName.decapitalize()
    }
}

class Method(val c: Klass, val name: String, val type: String, val annotations: Collection<String>?): Closeable {
    init {
        annotations?.forEach {
            c.text.appendln("  $it")
        }
        c.text.appendln("  public $type $name() {")
    }

    fun line(line: String) {
        c.text.appendln("    " + line)
    }

    override fun close() {
        c.text.appendln("  }")
    }
}