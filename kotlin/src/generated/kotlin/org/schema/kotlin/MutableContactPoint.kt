package org.schema.kotlin
import org.schema.*
class MutableContactPoint {
  private val map = HashMap<String,Any>()
  var availableLanguage: Any
    get() = map["availableLanguage"]!!
    set(value) { map["availableLanguage"] = value }
  fun availableLanguageLanguage(builder: MutableLanguage.() -> Unit) { map["availableLanguage"] = MutableLanguage().apply(builder).build() }
  var contactOption: ContactPointOption
    get() = map["contactOption"] as ContactPointOption
    set(value) { map["contactOption"] = value }
  var contactType: String
    get() = map["contactType"] as String
    set(value) { map["contactType"] = value }
  var email: String
    get() = map["email"] as String
    set(value) { map["email"] = value }
  var faxNumber: String
    get() = map["faxNumber"] as String
    set(value) { map["faxNumber"] = value }
  var hoursAvailable: OpeningHoursSpecification
    get() = map["hoursAvailable"] as OpeningHoursSpecification
    set(value) { map["hoursAvailable"] = value }
  fun hoursAvailable(builder: MutableOpeningHoursSpecification.() -> Unit) { map["hoursAvailable"] = MutableOpeningHoursSpecification().apply(builder).build() }
  var productSupported: Any
    get() = map["productSupported"]!!
    set(value) { map["productSupported"] = value }
  fun productSupportedProduct(builder: MutableProduct.() -> Unit) { map["productSupported"] = MutableProduct().apply(builder).build() }
  var telephone: String
    get() = map["telephone"] as String
    set(value) { map["telephone"] = value }
  var additionalType: String
    get() = map["additionalType"] as String
    set(value) { map["additionalType"] = value }
  var alternateName: String
    get() = map["alternateName"] as String
    set(value) { map["alternateName"] = value }
  var disambiguatingDescription: String
    get() = map["disambiguatingDescription"] as String
    set(value) { map["disambiguatingDescription"] = value }
  var mainEntityOfPage: Any
    get() = map["mainEntityOfPage"]!!
    set(value) { map["mainEntityOfPage"] = value }
  fun mainEntityOfPageCreativeWork(builder: MutableCreativeWork.() -> Unit) { map["mainEntityOfPage"] = MutableCreativeWork().apply(builder).build() }
  var name: String
    get() = map["name"] as String
    set(value) { map["name"] = value }
  var sameAs: String
    get() = map["sameAs"] as String
    set(value) { map["sameAs"] = value }
  var url: String
    get() = map["url"] as String
    set(value) { map["url"] = value }
  var potentialAction: Action
    get() = map["potentialAction"] as Action
    set(value) { map["potentialAction"] = value }
  fun potentialAction(builder: MutableAction.() -> Unit) { map["potentialAction"] = MutableAction().apply(builder).build() }
  var subjectOf: Any
    get() = map["subjectOf"]!!
    set(value) { map["subjectOf"] = value }
  fun subjectOfCreativeWork(builder: MutableCreativeWork.() -> Unit) { map["subjectOf"] = MutableCreativeWork().apply(builder).build() }
  fun subjectOfEvent(builder: MutableEvent.() -> Unit) { map["subjectOf"] = MutableEvent().apply(builder).build() }
  var id: String
    get() = map["id"] as String
    set(value) { map["id"] = value }
  fun build() = org.schema.ContactPoint.Builder(map).build()
}
