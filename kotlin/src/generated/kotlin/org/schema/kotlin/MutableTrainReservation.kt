package org.schema.kotlin
import org.schema.*
class MutableTrainReservation {
  private val map = HashMap<String,Any>()
  var reservationId: String
    get() = map["reservationId"] as String
    set(value) { map["reservationId"] = value }
  var reservationStatus: ReservationStatusType
    get() = map["reservationStatus"] as ReservationStatusType
    set(value) { map["reservationStatus"] = value }
  var reservationFor: Thing
    get() = map["reservationFor"] as Thing
    set(value) { map["reservationFor"] = value }
  fun reservationFor(builder: MutableThing.() -> Unit) { map["reservationFor"] = MutableThing().apply(builder).build() }
  var underName: Any
    get() = map["underName"]!!
    set(value) { map["underName"] = value }
  fun underNameOrganization(builder: MutableOrganization.() -> Unit) { map["underName"] = MutableOrganization().apply(builder).build() }
  fun underNamePerson(builder: MutablePerson.() -> Unit) { map["underName"] = MutablePerson().apply(builder).build() }
  var provider: Any
    get() = map["provider"]!!
    set(value) { map["provider"] = value }
  fun providerOrganization(builder: MutableOrganization.() -> Unit) { map["provider"] = MutableOrganization().apply(builder).build() }
  fun providerPerson(builder: MutablePerson.() -> Unit) { map["provider"] = MutablePerson().apply(builder).build() }
  var bookingTime: java.util.Date
    get() = map["bookingTime"] as java.util.Date
    set(value) { map["bookingTime"] = value }
  var modifiedTime: java.util.Date
    get() = map["modifiedTime"] as java.util.Date
    set(value) { map["modifiedTime"] = value }
  var programMembershipUsed: ProgramMembership
    get() = map["programMembershipUsed"] as ProgramMembership
    set(value) { map["programMembershipUsed"] = value }
  fun programMembershipUsed(builder: MutableProgramMembership.() -> Unit) { map["programMembershipUsed"] = MutableProgramMembership().apply(builder).build() }
  var reservedTicket: Ticket
    get() = map["reservedTicket"] as Ticket
    set(value) { map["reservedTicket"] = value }
  fun reservedTicket(builder: MutableTicket.() -> Unit) { map["reservedTicket"] = MutableTicket().apply(builder).build() }
  var totalPrice: Any
    get() = map["totalPrice"]!!
    set(value) { map["totalPrice"] = value }
  var priceCurrency: String
    get() = map["priceCurrency"] as String
    set(value) { map["priceCurrency"] = value }
  var broker: Any
    get() = map["broker"]!!
    set(value) { map["broker"] = value }
  fun brokerOrganization(builder: MutableOrganization.() -> Unit) { map["broker"] = MutableOrganization().apply(builder).build() }
  fun brokerPerson(builder: MutablePerson.() -> Unit) { map["broker"] = MutablePerson().apply(builder).build() }
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
  fun build() = org.schema.TrainReservation.Builder(map).build()
}
