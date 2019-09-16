package org.schema.kotlin
import org.schema.*
class MutableOrderItem {
  private val map = HashMap<String,Any>()
  var orderQuantity: Any
    get() = map["orderQuantity"]!!
    set(value) { map["orderQuantity"] = value }
  var orderItemStatus: OrderStatus
    get() = map["orderItemStatus"] as OrderStatus
    set(value) { map["orderItemStatus"] = value }
  var orderItemNumber: String
    get() = map["orderItemNumber"] as String
    set(value) { map["orderItemNumber"] = value }
  var orderDelivery: ParcelDelivery
    get() = map["orderDelivery"] as ParcelDelivery
    set(value) { map["orderDelivery"] = value }
  fun orderDelivery(builder: MutableParcelDelivery.() -> Unit) { map["orderDelivery"] = MutableParcelDelivery().apply(builder).build() }
  var orderedItem: Any
    get() = map["orderedItem"]!!
    set(value) { map["orderedItem"] = value }
  fun orderedItemOrderItem(builder: MutableOrderItem.() -> Unit) { map["orderedItem"] = MutableOrderItem().apply(builder).build() }
  fun orderedItemProduct(builder: MutableProduct.() -> Unit) { map["orderedItem"] = MutableProduct().apply(builder).build() }
  fun orderedItemService(builder: MutableService.() -> Unit) { map["orderedItem"] = MutableService().apply(builder).build() }
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
  fun build() = org.schema.OrderItem.Builder(map).build()
}