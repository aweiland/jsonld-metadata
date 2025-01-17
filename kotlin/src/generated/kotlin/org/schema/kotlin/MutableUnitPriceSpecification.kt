package org.schema.kotlin
import org.schema.*
class MutableUnitPriceSpecification {
  private val map = HashMap<String,Any>()
  var billingIncrement: Any
    get() = map["billingIncrement"]!!
    set(value) { map["billingIncrement"] = value }
  var priceType: String
    get() = map["priceType"] as String
    set(value) { map["priceType"] = value }
  var unitCode: String
    get() = map["unitCode"] as String
    set(value) { map["unitCode"] = value }
  var unitText: String
    get() = map["unitText"] as String
    set(value) { map["unitText"] = value }
  var referenceQuantity: QuantitativeValue
    get() = map["referenceQuantity"] as QuantitativeValue
    set(value) { map["referenceQuantity"] = value }
  fun referenceQuantity(builder: MutableQuantitativeValue.() -> Unit) { map["referenceQuantity"] = MutableQuantitativeValue().apply(builder).build() }
  var eligibleQuantity: QuantitativeValue
    get() = map["eligibleQuantity"] as QuantitativeValue
    set(value) { map["eligibleQuantity"] = value }
  fun eligibleQuantity(builder: MutableQuantitativeValue.() -> Unit) { map["eligibleQuantity"] = MutableQuantitativeValue().apply(builder).build() }
  var eligibleTransactionVolume: PriceSpecification
    get() = map["eligibleTransactionVolume"] as PriceSpecification
    set(value) { map["eligibleTransactionVolume"] = value }
  fun eligibleTransactionVolume(builder: MutablePriceSpecification.() -> Unit) { map["eligibleTransactionVolume"] = MutablePriceSpecification().apply(builder).build() }
  var maxPrice: Any
    get() = map["maxPrice"]!!
    set(value) { map["maxPrice"] = value }
  var minPrice: Any
    get() = map["minPrice"]!!
    set(value) { map["minPrice"] = value }
  var price: Any
    get() = map["price"]!!
    set(value) { map["price"] = value }
  var validFrom: java.util.Date
    get() = map["validFrom"] as java.util.Date
    set(value) { map["validFrom"] = value }
  var validThrough: java.util.Date
    get() = map["validThrough"] as java.util.Date
    set(value) { map["validThrough"] = value }
  var valueAddedTaxIncluded: Boolean
    get() = map["valueAddedTaxIncluded"] as Boolean
    set(value) { map["valueAddedTaxIncluded"] = value }
  var priceCurrency: String
    get() = map["priceCurrency"] as String
    set(value) { map["priceCurrency"] = value }
  var additionalType: String
    get() = map["additionalType"] as String
    set(value) { map["additionalType"] = value }
  var alternateName: String
    get() = map["alternateName"] as String
    set(value) { map["alternateName"] = value }
  var description: Description
    get() = map["description"] as Description
    set(value) { map["description"] = value }
  var disambiguatingDescription: String
    get() = map["disambiguatingDescription"] as String
    set(value) { map["disambiguatingDescription"] = value }
  var image: Image
    get() = map["image"] as Image
    set(value) { map["image"] = value }
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
  var identifier: Identifier
    get() = map["identifier"] as Identifier
    set(value) { map["identifier"] = value }
  var subjectOf: Any
    get() = map["subjectOf"]!!
    set(value) { map["subjectOf"] = value }
  fun subjectOfCreativeWork(builder: MutableCreativeWork.() -> Unit) { map["subjectOf"] = MutableCreativeWork().apply(builder).build() }
  fun subjectOfEvent(builder: MutableEvent.() -> Unit) { map["subjectOf"] = MutableEvent().apply(builder).build() }
  var id: String
    get() = map["id"] as String
    set(value) { map["id"] = value }
  fun build() = org.schema.UnitPriceSpecification.Builder(map).build()
}
