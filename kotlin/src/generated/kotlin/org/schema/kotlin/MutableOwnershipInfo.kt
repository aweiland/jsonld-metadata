package org.schema.kotlin
import org.schema.*
class MutableOwnershipInfo {
  private val map = HashMap<String,Any>()
  var acquiredFrom: Any
    get() = map["acquiredFrom"]!!
    set(value) { map["acquiredFrom"] = value }
  fun acquiredFromOrganization(builder: MutableOrganization.() -> Unit) { map["acquiredFrom"] = MutableOrganization().apply(builder).build() }
  fun acquiredFromPerson(builder: MutablePerson.() -> Unit) { map["acquiredFrom"] = MutablePerson().apply(builder).build() }
  var ownedFrom: java.util.Date
    get() = map["ownedFrom"] as java.util.Date
    set(value) { map["ownedFrom"] = value }
  var ownedThrough: java.util.Date
    get() = map["ownedThrough"] as java.util.Date
    set(value) { map["ownedThrough"] = value }
  var typeOfGood: Any
    get() = map["typeOfGood"]!!
    set(value) { map["typeOfGood"] = value }
  fun typeOfGoodProduct(builder: MutableProduct.() -> Unit) { map["typeOfGood"] = MutableProduct().apply(builder).build() }
  fun typeOfGoodService(builder: MutableService.() -> Unit) { map["typeOfGood"] = MutableService().apply(builder).build() }
  var additionalType: AdditionalType
    get() = map["additionalType"] as AdditionalType
    set(value) { map["additionalType"] = value }
  var alternateName: String
    get() = map["alternateName"] as String
    set(value) { map["alternateName"] = value }
  var description: DisambiguatingDescription
    get() = map["description"] as DisambiguatingDescription
    set(value) { map["description"] = value }
  var disambiguatingDescription: DisambiguatingDescription
    get() = map["disambiguatingDescription"] as DisambiguatingDescription
    set(value) { map["disambiguatingDescription"] = value }
  var image: Logo
    get() = map["image"] as Logo
    set(value) { map["image"] = value }
  var mainEntityOfPage: Any
    get() = map["mainEntityOfPage"]!!
    set(value) { map["mainEntityOfPage"] = value }
  fun mainEntityOfPageCreativeWork(builder: MutableCreativeWork.() -> Unit) { map["mainEntityOfPage"] = MutableCreativeWork().apply(builder).build() }
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
  var identifier: Isbn
    get() = map["identifier"] as Isbn
    set(value) { map["identifier"] = value }
  var subjectOf: Any
    get() = map["subjectOf"]!!
    set(value) { map["subjectOf"] = value }
  fun subjectOfCreativeWork(builder: MutableCreativeWork.() -> Unit) { map["subjectOf"] = MutableCreativeWork().apply(builder).build() }
  fun subjectOfEvent(builder: MutableEvent.() -> Unit) { map["subjectOf"] = MutableEvent().apply(builder).build() }
  var id: String
    get() = map["id"] as String
    set(value) { map["id"] = value }
  fun build() = org.schema.OwnershipInfo.Builder(map).build()
}
