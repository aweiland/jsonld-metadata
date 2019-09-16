package org.schema.kotlin
import org.schema.*
class MutableInvoice {
  private val map = HashMap<String,Any>()
  var customer: Any
    get() = map["customer"]!!
    set(value) { map["customer"] = value }
  fun customerOrganization(builder: MutableOrganization.() -> Unit) { map["customer"] = MutableOrganization().apply(builder).build() }
  fun customerPerson(builder: MutablePerson.() -> Unit) { map["customer"] = MutablePerson().apply(builder).build() }
  var paymentMethod: PaymentMethod
    get() = map["paymentMethod"] as PaymentMethod
    set(value) { map["paymentMethod"] = value }
  var paymentMethodId: String
    get() = map["paymentMethodId"] as String
    set(value) { map["paymentMethodId"] = value }
  var paymentDueDate: java.util.Date
    get() = map["paymentDueDate"] as java.util.Date
    set(value) { map["paymentDueDate"] = value }
  var provider: Any
    get() = map["provider"]!!
    set(value) { map["provider"] = value }
  fun providerOrganization(builder: MutableOrganization.() -> Unit) { map["provider"] = MutableOrganization().apply(builder).build() }
  fun providerPerson(builder: MutablePerson.() -> Unit) { map["provider"] = MutablePerson().apply(builder).build() }
  var broker: Any
    get() = map["broker"]!!
    set(value) { map["broker"] = value }
  fun brokerOrganization(builder: MutableOrganization.() -> Unit) { map["broker"] = MutableOrganization().apply(builder).build() }
  fun brokerPerson(builder: MutablePerson.() -> Unit) { map["broker"] = MutablePerson().apply(builder).build() }
  var totalPaymentDue: Any
    get() = map["totalPaymentDue"]!!
    set(value) { map["totalPaymentDue"] = value }
  fun totalPaymentDueMonetaryAmount(builder: MutableMonetaryAmount.() -> Unit) { map["totalPaymentDue"] = MutableMonetaryAmount().apply(builder).build() }
  fun totalPaymentDuePriceSpecification(builder: MutablePriceSpecification.() -> Unit) { map["totalPaymentDue"] = MutablePriceSpecification().apply(builder).build() }
  var minimumPaymentDue: Any
    get() = map["minimumPaymentDue"]!!
    set(value) { map["minimumPaymentDue"] = value }
  fun minimumPaymentDueMonetaryAmount(builder: MutableMonetaryAmount.() -> Unit) { map["minimumPaymentDue"] = MutableMonetaryAmount().apply(builder).build() }
  fun minimumPaymentDuePriceSpecification(builder: MutablePriceSpecification.() -> Unit) { map["minimumPaymentDue"] = MutablePriceSpecification().apply(builder).build() }
  var scheduledPaymentDate: java.util.Date
    get() = map["scheduledPaymentDate"] as java.util.Date
    set(value) { map["scheduledPaymentDate"] = value }
  var billingPeriod: Duration
    get() = map["billingPeriod"] as Duration
    set(value) { map["billingPeriod"] = value }
  fun billingPeriod(builder: MutableDuration.() -> Unit) { map["billingPeriod"] = MutableDuration().apply(builder).build() }
  var paymentStatus: Any
    get() = map["paymentStatus"]!!
    set(value) { map["paymentStatus"] = value }
  var referencesOrder: Order
    get() = map["referencesOrder"] as Order
    set(value) { map["referencesOrder"] = value }
  fun referencesOrder(builder: MutableOrder.() -> Unit) { map["referencesOrder"] = MutableOrder().apply(builder).build() }
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
  fun build() = org.schema.Invoice.Builder(map).build()
}
