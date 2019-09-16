/*
 * Copyright 2015-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * This is auto-generated file. Do not edit.
 */

package org.schema;

import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.*;
import org.jetbrains.annotations.NotNull;
import java.util.*;

/**
 * An accommodation is a place that can accommodate human beings, e.g. a hotel room, a camping pitch, or a meeting room. Many accommodations are for overnight stays, but this is not a mandatory requirement.
 * For more specific types of accommodations not defined in schema.org, one can use additionalType with external vocabularies.
 * <br /><br />
 * See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.
 * Source: https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology
 */
public class Accommodation extends Place {
  /**
   * An amenity feature (e.g. a characteristic or service) of the Accommodation. This generic property does not make a statement about whether the feature is included in an offer for the main accommodation or available at extra costs.
   */
  @JsonIgnore public LocationFeatureSpecification getAmenityFeature() {
    return (LocationFeatureSpecification) getValue("amenityFeature");
  }
  /**
   * An amenity feature (e.g. a characteristic or service) of the Accommodation. This generic property does not make a statement about whether the feature is included in an offer for the main accommodation or available at extra costs.
   */
  @JsonIgnore public Collection<LocationFeatureSpecification> getAmenityFeatures() {
    final Object current = myData.get("amenityFeature");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<LocationFeatureSpecification>) current;
    }
    return Arrays.asList((LocationFeatureSpecification) current);
  }
  /**
   * The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
   * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
   */
  @JsonIgnore public Integer getNumberOfRoomsInteger() {
    return (Integer) getValue("numberOfRooms");
  }
  /**
   * The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
   * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
   */
  @JsonIgnore public Collection<Integer> getNumberOfRoomsIntegers() {
    final Object current = myData.get("numberOfRooms");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
   * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
   */
  @JsonIgnore public Long getNumberOfRoomsLong() {
    return (Long) getValue("numberOfRooms");
  }
  /**
   * The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
   * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
   */
  @JsonIgnore public Collection<Long> getNumberOfRoomsLongs() {
    final Object current = myData.get("numberOfRooms");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
   * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
   */
  @JsonIgnore public Float getNumberOfRoomsFloat() {
    return (Float) getValue("numberOfRooms");
  }
  /**
   * The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
   * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
   */
  @JsonIgnore public Collection<Float> getNumberOfRoomsFloats() {
    final Object current = myData.get("numberOfRooms");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
   * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
   */
  @JsonIgnore public Double getNumberOfRoomsDouble() {
    return (Double) getValue("numberOfRooms");
  }
  /**
   * The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
   * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
   */
  @JsonIgnore public Collection<Double> getNumberOfRoomsDoubles() {
    final Object current = myData.get("numberOfRooms");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
   * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
   */
  @JsonIgnore public String getNumberOfRoomsString() {
    return (String) getValue("numberOfRooms");
  }
  /**
   * The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
   * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
   */
  @JsonIgnore public Collection<String> getNumberOfRoomsStrings() {
    final Object current = myData.get("numberOfRooms");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The size of the accommodation, e.g. in square meter or squarefoot.
   * Typical unit code(s): MTK for square meter, FTK for square foot, or YDK for square yard 
   */
  @JsonIgnore public QuantitativeValue getFloorSize() {
    return (QuantitativeValue) getValue("floorSize");
  }
  /**
   * The size of the accommodation, e.g. in square meter or squarefoot.
   * Typical unit code(s): MTK for square meter, FTK for square foot, or YDK for square yard 
   */
  @JsonIgnore public Collection<QuantitativeValue> getFloorSizes() {
    final Object current = myData.get("floorSize");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * Indications regarding the permitted usage of the accommodation.
   */
  @JsonIgnore public String getPermittedUsage() {
    return (String) getValue("permittedUsage");
  }
  /**
   * Indications regarding the permitted usage of the accommodation.
   */
  @JsonIgnore public Collection<String> getPermittedUsages() {
    final Object current = myData.get("permittedUsage");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * Indicates whether pets are allowed to enter the accommodation or lodging business. More detailed information can be put in a text value.
   */
  @JsonIgnore public Boolean getPetsAllowedBoolean() {
    return (Boolean) getValue("petsAllowed");
  }
  /**
   * Indicates whether pets are allowed to enter the accommodation or lodging business. More detailed information can be put in a text value.
   */
  @JsonIgnore public Collection<Boolean> getPetsAllowedBooleans() {
    final Object current = myData.get("petsAllowed");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Boolean>) current;
    }
    return Arrays.asList((Boolean) current);
  }
  /**
   * Indicates whether pets are allowed to enter the accommodation or lodging business. More detailed information can be put in a text value.
   */
  @JsonIgnore public String getPetsAllowedString() {
    return (String) getValue("petsAllowed");
  }
  /**
   * Indicates whether pets are allowed to enter the accommodation or lodging business. More detailed information can be put in a text value.
   */
  @JsonIgnore public Collection<String> getPetsAllowedStrings() {
    final Object current = myData.get("petsAllowed");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected Accommodation(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Accommodation}
   */
  public static class Builder extends Place.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public Accommodation build() {
      return new Accommodation(myData);
    }
    /**
     * An amenity feature (e.g. a characteristic or service) of the Accommodation. This generic property does not make a statement about whether the feature is included in an offer for the main accommodation or available at extra costs.
     */
    @NotNull public Builder amenityFeature(@NotNull LocationFeatureSpecification locationFeatureSpecification) {
      putValue("amenityFeature", locationFeatureSpecification);
      return this;
    }
    /**
     * An amenity feature (e.g. a characteristic or service) of the Accommodation. This generic property does not make a statement about whether the feature is included in an offer for the main accommodation or available at extra costs.
     */
    @NotNull public Builder amenityFeature(@NotNull LocationFeatureSpecification.Builder locationFeatureSpecification) {
      putValue("amenityFeature", locationFeatureSpecification.build());
      return this;
    }
    /**
     * The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
     * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
     */
    @NotNull public Builder numberOfRooms(@NotNull Integer integer) {
      putValue("numberOfRooms", integer);
      return this;
    }
    /**
     * The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
     * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
     */
    @NotNull public Builder numberOfRooms(@NotNull Long numberOfRooms) {
      putValue("numberOfRooms", numberOfRooms);
      return this;
    }
    /**
     * The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
     * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
     */
    @NotNull public Builder numberOfRooms(@NotNull Float numberOfRooms) {
      putValue("numberOfRooms", numberOfRooms);
      return this;
    }
    /**
     * The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
     * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
     */
    @NotNull public Builder numberOfRooms(@NotNull Double numberOfRooms) {
      putValue("numberOfRooms", numberOfRooms);
      return this;
    }
    /**
     * The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
     * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
     */
    @NotNull public Builder numberOfRooms(@NotNull String numberOfRooms) {
      putValue("numberOfRooms", numberOfRooms);
      return this;
    }
    /**
     * The size of the accommodation, e.g. in square meter or squarefoot.
     * Typical unit code(s): MTK for square meter, FTK for square foot, or YDK for square yard 
     */
    @NotNull public Builder floorSize(@NotNull QuantitativeValue quantitativeValue) {
      putValue("floorSize", quantitativeValue);
      return this;
    }
    /**
     * The size of the accommodation, e.g. in square meter or squarefoot.
     * Typical unit code(s): MTK for square meter, FTK for square foot, or YDK for square yard 
     */
    @NotNull public Builder floorSize(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("floorSize", quantitativeValue.build());
      return this;
    }
    /**
     * Indications regarding the permitted usage of the accommodation.
     */
    @NotNull public Builder permittedUsage(@NotNull String permittedUsage) {
      putValue("permittedUsage", permittedUsage);
      return this;
    }
    /**
     * Indicates whether pets are allowed to enter the accommodation or lodging business. More detailed information can be put in a text value.
     */
    @NotNull public Builder petsAllowed(@NotNull Boolean petsAllowed) {
      putValue("petsAllowed", petsAllowed);
      return this;
    }
    /**
     * Indicates whether pets are allowed to enter the accommodation or lodging business. More detailed information can be put in a text value.
     */
    @NotNull public Builder petsAllowed(@NotNull String petsAllowed) {
      putValue("petsAllowed", petsAllowed);
      return this;
    }
    /**
     * Physical address of the item.
     */
    @NotNull public Builder address(@NotNull PostalAddress postalAddress) {
      putValue("address", postalAddress);
      return this;
    }
    /**
     * Physical address of the item.
     */
    @NotNull public Builder address(@NotNull PostalAddress.Builder postalAddress) {
      putValue("address", postalAddress.build());
      return this;
    }
    /**
     * Physical address of the item.
     */
    @NotNull public Builder address(@NotNull String address) {
      putValue("address", address);
      return this;
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    @NotNull public Builder aggregateRating(@NotNull AggregateRating aggregateRating) {
      putValue("aggregateRating", aggregateRating);
      return this;
    }
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    @NotNull public Builder aggregateRating(@NotNull AggregateRating.Builder aggregateRating) {
      putValue("aggregateRating", aggregateRating.build());
      return this;
    }
    /**
     * A short textual code (also called "store code") that uniquely identifies a place of business. The code is typically assigned by the parentOrganization and used in structured URLs.\n\nFor example, in the URL http://www.starbucks.co.uk/store-locator/etc/detail/3047 the code "3047" is a branchCode for a particular branch.
     *       
     */
    @NotNull public Builder branchCode(@NotNull String branchCode) {
      putValue("branchCode", branchCode);
      return this;
    }
    /**
     * The basic containment relation between a place and one that contains it.
     */
    @NotNull public Builder containedInPlace(@NotNull Place place) {
      putValue("containedInPlace", place);
      return this;
    }
    /**
     * The basic containment relation between a place and one that contains it.
     */
    @NotNull public Builder containedInPlace(@NotNull Place.Builder place) {
      putValue("containedInPlace", place.build());
      return this;
    }
    /**
     * The basic containment relation between a place and another that it contains.
     */
    @NotNull public Builder containsPlace(@NotNull Place place) {
      putValue("containsPlace", place);
      return this;
    }
    /**
     * The basic containment relation between a place and another that it contains.
     */
    @NotNull public Builder containsPlace(@NotNull Place.Builder place) {
      putValue("containsPlace", place.build());
      return this;
    }
    /**
     * Upcoming or past event associated with this place, organization, or action.
     */
    @NotNull public Builder event(@NotNull Event event) {
      putValue("event", event);
      return this;
    }
    /**
     * Upcoming or past event associated with this place, organization, or action.
     */
    @NotNull public Builder event(@NotNull Event.Builder event) {
      putValue("event", event.build());
      return this;
    }
    /**
     * The fax number.
     */
    @NotNull public Builder faxNumber(@NotNull String faxNumber) {
      putValue("faxNumber", faxNumber);
      return this;
    }
    /**
     * A flag to signal that the item, event, or place is accessible for free.
     */
    @NotNull public Builder isAccessibleForFree(@NotNull Boolean isAccessibleForFree) {
      putValue("isAccessibleForFree", isAccessibleForFree);
      return this;
    }
    /**
     * A flag to signal that the [[Place]] is open to public visitors.  If this property is omitted there is no assumed default boolean value
     */
    @NotNull public Builder publicAccess(@NotNull Boolean publicAccess) {
      putValue("publicAccess", publicAccess);
      return this;
    }
    /**
     * The geo coordinates of the place.
     */
    @NotNull public Builder geo(@NotNull GeoCoordinates geoCoordinates) {
      putValue("geo", geoCoordinates);
      return this;
    }
    /**
     * The geo coordinates of the place.
     */
    @NotNull public Builder geo(@NotNull GeoCoordinates.Builder geoCoordinates) {
      putValue("geo", geoCoordinates.build());
      return this;
    }
    /**
     * The geo coordinates of the place.
     */
    @NotNull public Builder geo(@NotNull GeoShape geoShape) {
      putValue("geo", geoShape);
      return this;
    }
    /**
     * The geo coordinates of the place.
     */
    @NotNull public Builder geo(@NotNull GeoShape.Builder geoShape) {
      putValue("geo", geoShape.build());
      return this;
    }
    /**
     * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
     */
    @NotNull public Builder isicV4(@NotNull String isicV4) {
      putValue("isicV4", isicV4);
      return this;
    }
    @NotNull public Builder logo(@NotNull Logo logo) {
      putValue("logo", logo);
      return this;
    }
    /**
     * A URL to a map of the place.
     */
    @NotNull public Builder hasMap(@NotNull Map map) {
      putValue("hasMap", map);
      return this;
    }
    /**
     * A URL to a map of the place.
     */
    @NotNull public Builder hasMap(@NotNull Map.Builder map) {
      putValue("hasMap", map.build());
      return this;
    }
    /**
     * A URL to a map of the place.
     */
    @NotNull public Builder hasMap(@NotNull String hasMap) {
      putValue("hasMap", hasMap);
      return this;
    }
    /**
     * The total number of individuals that may attend an event or venue.
     */
    @NotNull public Builder maximumAttendeeCapacity(@NotNull Integer integer) {
      putValue("maximumAttendeeCapacity", integer);
      return this;
    }
    /**
     * The opening hours of a certain place.
     */
    @NotNull public Builder openingHoursSpecification(@NotNull OpeningHoursSpecification openingHoursSpecification) {
      putValue("openingHoursSpecification", openingHoursSpecification);
      return this;
    }
    /**
     * The opening hours of a certain place.
     */
    @NotNull public Builder openingHoursSpecification(@NotNull OpeningHoursSpecification.Builder openingHoursSpecification) {
      putValue("openingHoursSpecification", openingHoursSpecification.build());
      return this;
    }
    /**
     * The special opening hours of a certain place.\n\nUse this to explicitly override general opening hours brought in scope by [[openingHoursSpecification]] or [[openingHours]].
     *       
     */
    @NotNull public Builder specialOpeningHoursSpecification(@NotNull OpeningHoursSpecification openingHoursSpecification) {
      putValue("specialOpeningHoursSpecification", openingHoursSpecification);
      return this;
    }
    /**
     * The special opening hours of a certain place.\n\nUse this to explicitly override general opening hours brought in scope by [[openingHoursSpecification]] or [[openingHours]].
     *       
     */
    @NotNull public Builder specialOpeningHoursSpecification(@NotNull OpeningHoursSpecification.Builder openingHoursSpecification) {
      putValue("specialOpeningHoursSpecification", openingHoursSpecification.build());
      return this;
    }
    @NotNull public Builder photo(@NotNull Photo photo) {
      putValue("photo", photo);
      return this;
    }
    /**
     * A review of the item.
     */
    @NotNull public Builder review(@NotNull Review review) {
      putValue("review", review);
      return this;
    }
    /**
     * A review of the item.
     */
    @NotNull public Builder review(@NotNull Review.Builder review) {
      putValue("review", review.build());
      return this;
    }
    /**
     * A slogan or motto associated with the item.
     */
    @NotNull public Builder slogan(@NotNull String slogan) {
      putValue("slogan", slogan);
      return this;
    }
    /**
     * The telephone number.
     */
    @NotNull public Builder telephone(@NotNull String telephone) {
      putValue("telephone", telephone);
      return this;
    }
    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.\n\nNote: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
     * 
     */
    @NotNull public Builder additionalProperty(@NotNull PropertyValue propertyValue) {
      putValue("additionalProperty", propertyValue);
      return this;
    }
    /**
     * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.\n\nNote: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
     * 
     */
    @NotNull public Builder additionalProperty(@NotNull PropertyValue.Builder propertyValue) {
      putValue("additionalProperty", propertyValue.build());
      return this;
    }
    /**
     * Indicates whether it is allowed to smoke in the place, e.g. in the restaurant, hotel or hotel room.
     */
    @NotNull public Builder smokingAllowed(@NotNull Boolean smokingAllowed) {
      putValue("smokingAllowed", smokingAllowed);
      return this;
    }
    @NotNull public Builder additionalType(@NotNull AdditionalType additionalType) {
      putValue("additionalType", additionalType);
      return this;
    }
    /**
     * An alias for the item.
     */
    @NotNull public Builder alternateName(@NotNull String alternateName) {
      putValue("alternateName", alternateName);
      return this;
    }
    /**
     * A description of the item.
     */
    @NotNull public Builder description(@NotNull DisambiguatingDescription disambiguatingDescription) {
      putValue("description", disambiguatingDescription);
      return this;
    }
    @NotNull public Builder disambiguatingDescription(@NotNull DisambiguatingDescription disambiguatingDescription) {
      putValue("disambiguatingDescription", disambiguatingDescription);
      return this;
    }
    /**
     * An image of the item. This can be a [[URL]] or a fully described [[ImageObject]].
     */
    @NotNull public Builder image(@NotNull Logo logo) {
      putValue("image", logo);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork creativeWork) {
      putValue("mainEntityOfPage", creativeWork);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork.Builder creativeWork) {
      putValue("mainEntityOfPage", creativeWork.build());
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details.
     */
    @NotNull public Builder mainEntityOfPage(@NotNull String mainEntityOfPage) {
      putValue("mainEntityOfPage", mainEntityOfPage);
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
     */
    @NotNull public Builder sameAs(@NotNull String sameAs) {
      putValue("sameAs", sameAs);
      return this;
    }
    /**
     * URL of the item.
     */
    @NotNull public Builder url(@NotNull String url) {
      putValue("url", url);
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(@NotNull Action action) {
      putValue("potentialAction", action);
      return this;
    }
    /**
     * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
     */
    @NotNull public Builder potentialAction(@NotNull Action.Builder action) {
      putValue("potentialAction", action.build());
      return this;
    }
    /**
     * The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
     *         
     */
    @NotNull public Builder identifier(@NotNull Isbn isbn) {
      putValue("identifier", isbn);
      return this;
    }
    /**
     * A CreativeWork or Event about this Thing.
     */
    @NotNull public Builder subjectOf(@NotNull CreativeWork creativeWork) {
      putValue("subjectOf", creativeWork);
      return this;
    }
    /**
     * A CreativeWork or Event about this Thing.
     */
    @NotNull public Builder subjectOf(@NotNull CreativeWork.Builder creativeWork) {
      putValue("subjectOf", creativeWork.build());
      return this;
    }
    /**
     * A CreativeWork or Event about this Thing.
     */
    @NotNull public Builder subjectOf(@NotNull Event event) {
      putValue("subjectOf", event);
      return this;
    }
    /**
     * A CreativeWork or Event about this Thing.
     */
    @NotNull public Builder subjectOf(@NotNull Event.Builder event) {
      putValue("subjectOf", event.build());
      return this;
    }
    @NotNull public Builder id(@NotNull String id) {
      myData.put("id", id);
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    @Override protected void fromMap(String key, Object value) {
      if ("amenityFeature".equals(key) && value instanceof LocationFeatureSpecification) { amenityFeature((LocationFeatureSpecification)value); return; }
      if ("amenityFeatures".equals(key) && value instanceof LocationFeatureSpecification) { amenityFeature((LocationFeatureSpecification)value); return; }
      if ("numberOfRooms".equals(key) && value instanceof Integer) { numberOfRooms((Integer)value); return; }
      if ("numberOfRoomss".equals(key) && value instanceof Integer) { numberOfRooms((Integer)value); return; }
      if ("numberOfRooms".equals(key) && value instanceof Long) { numberOfRooms((Long)value); return; }
      if ("numberOfRoomss".equals(key) && value instanceof Long) { numberOfRooms((Long)value); return; }
      if ("numberOfRooms".equals(key) && value instanceof Float) { numberOfRooms((Float)value); return; }
      if ("numberOfRoomss".equals(key) && value instanceof Float) { numberOfRooms((Float)value); return; }
      if ("numberOfRooms".equals(key) && value instanceof Double) { numberOfRooms((Double)value); return; }
      if ("numberOfRoomss".equals(key) && value instanceof Double) { numberOfRooms((Double)value); return; }
      if ("numberOfRooms".equals(key) && value instanceof String) { numberOfRooms((String)value); return; }
      if ("numberOfRoomss".equals(key) && value instanceof String) { numberOfRooms((String)value); return; }
      if ("floorSize".equals(key) && value instanceof QuantitativeValue) { floorSize((QuantitativeValue)value); return; }
      if ("floorSizes".equals(key) && value instanceof QuantitativeValue) { floorSize((QuantitativeValue)value); return; }
      if ("permittedUsage".equals(key) && value instanceof String) { permittedUsage((String)value); return; }
      if ("permittedUsages".equals(key) && value instanceof String) { permittedUsage((String)value); return; }
      if ("petsAllowed".equals(key) && value instanceof Boolean) { petsAllowed((Boolean)value); return; }
      if ("petsAlloweds".equals(key) && value instanceof Boolean) { petsAllowed((Boolean)value); return; }
      if ("petsAllowed".equals(key) && value instanceof String) { petsAllowed((String)value); return; }
      if ("petsAlloweds".equals(key) && value instanceof String) { petsAllowed((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
