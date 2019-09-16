package org.schema.kotlin
import org.schema.*
class MutableJobPosting {
  private val map = HashMap<String,Any>()
  var baseSalary: Any
    get() = map["baseSalary"]!!
    set(value) { map["baseSalary"] = value }
  var jobBenefits: String
    get() = map["jobBenefits"] as String
    set(value) { map["jobBenefits"] = value }
  var datePosted: java.util.Date
    get() = map["datePosted"] as java.util.Date
    set(value) { map["datePosted"] = value }
  var employmentType: String
    get() = map["employmentType"] as String
    set(value) { map["employmentType"] = value }
  var hiringOrganization: Organization
    get() = map["hiringOrganization"] as Organization
    set(value) { map["hiringOrganization"] = value }
  fun hiringOrganization(builder: MutableOrganization.() -> Unit) { map["hiringOrganization"] = MutableOrganization().apply(builder).build() }
  var incentiveCompensation: String
    get() = map["incentiveCompensation"] as String
    set(value) { map["incentiveCompensation"] = value }
  var industry: String
    get() = map["industry"] as String
    set(value) { map["industry"] = value }
  var jobLocation: Place
    get() = map["jobLocation"] as Place
    set(value) { map["jobLocation"] = value }
  fun jobLocation(builder: MutablePlace.() -> Unit) { map["jobLocation"] = MutablePlace().apply(builder).build() }
  var salaryCurrency: String
    get() = map["salaryCurrency"] as String
    set(value) { map["salaryCurrency"] = value }
  var specialCommitments: String
    get() = map["specialCommitments"] as String
    set(value) { map["specialCommitments"] = value }
  var title: String
    get() = map["title"] as String
    set(value) { map["title"] = value }
  var validThrough: java.util.Date
    get() = map["validThrough"] as java.util.Date
    set(value) { map["validThrough"] = value }
  var workHours: String
    get() = map["workHours"] as String
    set(value) { map["workHours"] = value }
  var educationRequirements: String
    get() = map["educationRequirements"] as String
    set(value) { map["educationRequirements"] = value }
  var estimatedSalary: Any
    get() = map["estimatedSalary"]!!
    set(value) { map["estimatedSalary"] = value }
  var experienceRequirements: String
    get() = map["experienceRequirements"] as String
    set(value) { map["experienceRequirements"] = value }
  var occupationalCategory: String
    get() = map["occupationalCategory"] as String
    set(value) { map["occupationalCategory"] = value }
  var qualifications: String
    get() = map["qualifications"] as String
    set(value) { map["qualifications"] = value }
  var responsibilities: String
    get() = map["responsibilities"] as String
    set(value) { map["responsibilities"] = value }
  var skills: String
    get() = map["skills"] as String
    set(value) { map["skills"] = value }
  var relevantOccupation: Occupation
    get() = map["relevantOccupation"] as Occupation
    set(value) { map["relevantOccupation"] = value }
  fun relevantOccupation(builder: MutableOccupation.() -> Unit) { map["relevantOccupation"] = MutableOccupation().apply(builder).build() }
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
  fun build() = org.schema.JobPosting.Builder(map).build()
}
