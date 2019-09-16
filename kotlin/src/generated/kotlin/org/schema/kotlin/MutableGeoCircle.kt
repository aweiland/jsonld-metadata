package org.schema.kotlin
import org.schema.*
class MutableGeoCircle {
  private val map = HashMap<String,Any>()
  var geoRadius: Any
    get() = map["geoRadius"]!!
    set(value) { map["geoRadius"] = value }
  fun geoRadiusDistance(builder: MutableDistance.() -> Unit) { map["geoRadius"] = MutableDistance().apply(builder).build() }
  var geoMidpoint: GeoCoordinates
    get() = map["geoMidpoint"] as GeoCoordinates
    set(value) { map["geoMidpoint"] = value }
  fun geoMidpoint(builder: MutableGeoCoordinates.() -> Unit) { map["geoMidpoint"] = MutableGeoCoordinates().apply(builder).build() }
  var address: Any
    get() = map["address"]!!
    set(value) { map["address"] = value }
  fun addressPostalAddress(builder: MutablePostalAddress.() -> Unit) { map["address"] = MutablePostalAddress().apply(builder).build() }
  var addressCountry: Any
    get() = map["addressCountry"]!!
    set(value) { map["addressCountry"] = value }
  fun addressCountryCountry(builder: MutableCountry.() -> Unit) { map["addressCountry"] = MutableCountry().apply(builder).build() }
  var box: String
    get() = map["box"] as String
    set(value) { map["box"] = value }
  var circle: String
    get() = map["circle"] as String
    set(value) { map["circle"] = value }
  var elevation: Any
    get() = map["elevation"]!!
    set(value) { map["elevation"] = value }
  var line: String
    get() = map["line"] as String
    set(value) { map["line"] = value }
  var polygon: String
    get() = map["polygon"] as String
    set(value) { map["polygon"] = value }
  var postalCode: String
    get() = map["postalCode"] as String
    set(value) { map["postalCode"] = value }
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
  fun build() = org.schema.GeoCircle.Builder(map).build()
}
