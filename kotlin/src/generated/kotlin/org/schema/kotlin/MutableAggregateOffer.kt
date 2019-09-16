package org.schema.kotlin
import org.schema.*
class MutableAggregateOffer {
  private val map = HashMap<String,Any>()
  var highPrice: Any
    get() = map["highPrice"]!!
    set(value) { map["highPrice"] = value }
  var lowPrice: Any
    get() = map["lowPrice"]!!
    set(value) { map["lowPrice"] = value }
  var offerCount: Int
    get() = map["offerCount"] as Int
    set(value) { map["offerCount"] = value }
  var offers: Offer
    get() = map["offers"] as Offer
    set(value) { map["offers"] = value }
  fun offers(builder: MutableOffer.() -> Unit) { map["offers"] = MutableOffer().apply(builder).build() }
  var acceptedPaymentMethod: Any
    get() = map["acceptedPaymentMethod"]!!
    set(value) { map["acceptedPaymentMethod"] = value }
  fun acceptedPaymentMethodLoanOrCredit(builder: MutableLoanOrCredit.() -> Unit) { map["acceptedPaymentMethod"] = MutableLoanOrCredit().apply(builder).build() }
  var addOn: Offer
    get() = map["addOn"] as Offer
    set(value) { map["addOn"] = value }
  fun addOn(builder: MutableOffer.() -> Unit) { map["addOn"] = MutableOffer().apply(builder).build() }
  var advanceBookingRequirement: QuantitativeValue
    get() = map["advanceBookingRequirement"] as QuantitativeValue
    set(value) { map["advanceBookingRequirement"] = value }
  fun advanceBookingRequirement(builder: MutableQuantitativeValue.() -> Unit) { map["advanceBookingRequirement"] = MutableQuantitativeValue().apply(builder).build() }
  var aggregateRating: AggregateRating
    get() = map["aggregateRating"] as AggregateRating
    set(value) { map["aggregateRating"] = value }
  fun aggregateRating(builder: MutableAggregateRating.() -> Unit) { map["aggregateRating"] = MutableAggregateRating().apply(builder).build() }
  var areaServed: AvailableAtOrFrom
    get() = map["areaServed"] as AvailableAtOrFrom
    set(value) { map["areaServed"] = value }
  var availability: ItemAvailability
    get() = map["availability"] as ItemAvailability
    set(value) { map["availability"] = value }
  var availabilityEnds: java.util.Date
    get() = map["availabilityEnds"] as java.util.Date
    set(value) { map["availabilityEnds"] = value }
  var availabilityStarts: java.util.Date
    get() = map["availabilityStarts"] as java.util.Date
    set(value) { map["availabilityStarts"] = value }
  var availableAtOrFrom: AvailableAtOrFrom
    get() = map["availableAtOrFrom"] as AvailableAtOrFrom
    set(value) { map["availableAtOrFrom"] = value }
  var availableDeliveryMethod: DeliveryMethod
    get() = map["availableDeliveryMethod"] as DeliveryMethod
    set(value) { map["availableDeliveryMethod"] = value }
  var businessFunction: BusinessFunction
    get() = map["businessFunction"] as BusinessFunction
    set(value) { map["businessFunction"] = value }
  var category: Any
    get() = map["category"]!!
    set(value) { map["category"] = value }
  fun categoryThing(builder: MutableThing.() -> Unit) { map["category"] = MutableThing().apply(builder).build() }
  var deliveryLeadTime: QuantitativeValue
    get() = map["deliveryLeadTime"] as QuantitativeValue
    set(value) { map["deliveryLeadTime"] = value }
  fun deliveryLeadTime(builder: MutableQuantitativeValue.() -> Unit) { map["deliveryLeadTime"] = MutableQuantitativeValue().apply(builder).build() }
  var eligibleCustomerType: BusinessEntityType
    get() = map["eligibleCustomerType"] as BusinessEntityType
    set(value) { map["eligibleCustomerType"] = value }
  var eligibleDuration: QuantitativeValue
    get() = map["eligibleDuration"] as QuantitativeValue
    set(value) { map["eligibleDuration"] = value }
  fun eligibleDuration(builder: MutableQuantitativeValue.() -> Unit) { map["eligibleDuration"] = MutableQuantitativeValue().apply(builder).build() }
  var eligibleQuantity: QuantitativeValue
    get() = map["eligibleQuantity"] as QuantitativeValue
    set(value) { map["eligibleQuantity"] = value }
  fun eligibleQuantity(builder: MutableQuantitativeValue.() -> Unit) { map["eligibleQuantity"] = MutableQuantitativeValue().apply(builder).build() }
  var eligibleRegion: EligibleRegion
    get() = map["eligibleRegion"] as EligibleRegion
    set(value) { map["eligibleRegion"] = value }
  var ineligibleRegion: Any
    get() = map["ineligibleRegion"]!!
    set(value) { map["ineligibleRegion"] = value }
  fun ineligibleRegionGeoShape(builder: MutableGeoShape.() -> Unit) { map["ineligibleRegion"] = MutableGeoShape().apply(builder).build() }
  fun ineligibleRegionPlace(builder: MutablePlace.() -> Unit) { map["ineligibleRegion"] = MutablePlace().apply(builder).build() }
  var eligibleTransactionVolume: PriceSpecification
    get() = map["eligibleTransactionVolume"] as PriceSpecification
    set(value) { map["eligibleTransactionVolume"] = value }
  fun eligibleTransactionVolume(builder: MutablePriceSpecification.() -> Unit) { map["eligibleTransactionVolume"] = MutablePriceSpecification().apply(builder).build() }
  var includesObject: TypeAndQuantityNode
    get() = map["includesObject"] as TypeAndQuantityNode
    set(value) { map["includesObject"] = value }
  fun includesObject(builder: MutableTypeAndQuantityNode.() -> Unit) { map["includesObject"] = MutableTypeAndQuantityNode().apply(builder).build() }
  var inventoryLevel: QuantitativeValue
    get() = map["inventoryLevel"] as QuantitativeValue
    set(value) { map["inventoryLevel"] = value }
  fun inventoryLevel(builder: MutableQuantitativeValue.() -> Unit) { map["inventoryLevel"] = MutableQuantitativeValue().apply(builder).build() }
  var itemCondition: OfferItemCondition
    get() = map["itemCondition"] as OfferItemCondition
    set(value) { map["itemCondition"] = value }
  var itemOffered: Any
    get() = map["itemOffered"]!!
    set(value) { map["itemOffered"] = value }
  fun itemOfferedProduct(builder: MutableProduct.() -> Unit) { map["itemOffered"] = MutableProduct().apply(builder).build() }
  fun itemOfferedService(builder: MutableService.() -> Unit) { map["itemOffered"] = MutableService().apply(builder).build() }
  var offeredBy: Any
    get() = map["offeredBy"]!!
    set(value) { map["offeredBy"] = value }
  fun offeredByOrganization(builder: MutableOrganization.() -> Unit) { map["offeredBy"] = MutableOrganization().apply(builder).build() }
  fun offeredByPerson(builder: MutablePerson.() -> Unit) { map["offeredBy"] = MutablePerson().apply(builder).build() }
  var mpn: String
    get() = map["mpn"] as String
    set(value) { map["mpn"] = value }
  var price: Any
    get() = map["price"]!!
    set(value) { map["price"] = value }
  var priceSpecification: PriceSpecification
    get() = map["priceSpecification"] as PriceSpecification
    set(value) { map["priceSpecification"] = value }
  fun priceSpecification(builder: MutablePriceSpecification.() -> Unit) { map["priceSpecification"] = MutablePriceSpecification().apply(builder).build() }
  var priceValidUntil: java.util.Date
    get() = map["priceValidUntil"] as java.util.Date
    set(value) { map["priceValidUntil"] = value }
  var review: Review
    get() = map["review"] as Review
    set(value) { map["review"] = value }
  fun review(builder: MutableReview.() -> Unit) { map["review"] = MutableReview().apply(builder).build() }
  var validFrom: java.util.Date
    get() = map["validFrom"] as java.util.Date
    set(value) { map["validFrom"] = value }
  var validThrough: java.util.Date
    get() = map["validThrough"] as java.util.Date
    set(value) { map["validThrough"] = value }
  var warranty: WarrantyPromise
    get() = map["warranty"] as WarrantyPromise
    set(value) { map["warranty"] = value }
  fun warranty(builder: MutableWarrantyPromise.() -> Unit) { map["warranty"] = MutableWarrantyPromise().apply(builder).build() }
  var priceCurrency: String
    get() = map["priceCurrency"] as String
    set(value) { map["priceCurrency"] = value }
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
  fun build() = org.schema.AggregateOffer.Builder(map).build()
}
