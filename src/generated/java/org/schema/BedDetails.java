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
 * An entity holding detailed information about the available bed types, e.g. the quantity of twin beds for a hotel room. For the single case of just one bed of a certain type, you can use bed directly with a text. See also [[BedType]] (under development).Source: https://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#STI_Accommodation_Ontology
 */
public class BedDetails extends Intangible {
  /**
   * The type of bed to which the BedDetail refers, i.e. the type of bed available in the quantity indicated by quantity.
   */
  @JsonIgnore public BedType getTypeOfBedBedType() {
    return (BedType) getValue("typeOfBed");
  }
  /**
   * The type of bed to which the BedDetail refers, i.e. the type of bed available in the quantity indicated by quantity.
   */
  @JsonIgnore public Collection<BedType> getTypeOfBedBedTypes() {
    final Object current = myData.get("typeOfBed");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<BedType>) current;
    }
    return Arrays.asList((BedType) current);
  }
  /**
   * The type of bed to which the BedDetail refers, i.e. the type of bed available in the quantity indicated by quantity.
   */
  @JsonIgnore public String getTypeOfBedString() {
    return (String) getValue("typeOfBed");
  }
  /**
   * The type of bed to which the BedDetail refers, i.e. the type of bed available in the quantity indicated by quantity.
   */
  @JsonIgnore public Collection<String> getTypeOfBedStrings() {
    final Object current = myData.get("typeOfBed");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The quantity of the given bed type available in the HotelRoom, Suite, House, or Apartment.
   */
  @JsonIgnore public Integer getNumberOfBedsInteger() {
    return (Integer) getValue("numberOfBeds");
  }
  /**
   * The quantity of the given bed type available in the HotelRoom, Suite, House, or Apartment.
   */
  @JsonIgnore public Collection<Integer> getNumberOfBedsIntegers() {
    final Object current = myData.get("numberOfBeds");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Integer>) current;
    }
    return Arrays.asList((Integer) current);
  }
  /**
   * The quantity of the given bed type available in the HotelRoom, Suite, House, or Apartment.
   */
  @JsonIgnore public Long getNumberOfBedsLong() {
    return (Long) getValue("numberOfBeds");
  }
  /**
   * The quantity of the given bed type available in the HotelRoom, Suite, House, or Apartment.
   */
  @JsonIgnore public Collection<Long> getNumberOfBedsLongs() {
    final Object current = myData.get("numberOfBeds");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Long>) current;
    }
    return Arrays.asList((Long) current);
  }
  /**
   * The quantity of the given bed type available in the HotelRoom, Suite, House, or Apartment.
   */
  @JsonIgnore public Float getNumberOfBedsFloat() {
    return (Float) getValue("numberOfBeds");
  }
  /**
   * The quantity of the given bed type available in the HotelRoom, Suite, House, or Apartment.
   */
  @JsonIgnore public Collection<Float> getNumberOfBedsFloats() {
    final Object current = myData.get("numberOfBeds");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Float>) current;
    }
    return Arrays.asList((Float) current);
  }
  /**
   * The quantity of the given bed type available in the HotelRoom, Suite, House, or Apartment.
   */
  @JsonIgnore public Double getNumberOfBedsDouble() {
    return (Double) getValue("numberOfBeds");
  }
  /**
   * The quantity of the given bed type available in the HotelRoom, Suite, House, or Apartment.
   */
  @JsonIgnore public Collection<Double> getNumberOfBedsDoubles() {
    final Object current = myData.get("numberOfBeds");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Double>) current;
    }
    return Arrays.asList((Double) current);
  }
  /**
   * The quantity of the given bed type available in the HotelRoom, Suite, House, or Apartment.
   */
  @JsonIgnore public String getNumberOfBedsString() {
    return (String) getValue("numberOfBeds");
  }
  /**
   * The quantity of the given bed type available in the HotelRoom, Suite, House, or Apartment.
   */
  @JsonIgnore public Collection<String> getNumberOfBedsStrings() {
    final Object current = myData.get("numberOfBeds");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected BedDetails(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link BedDetails}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public BedDetails build() {
      return new BedDetails(myData);
    }
    /**
     * The type of bed to which the BedDetail refers, i.e. the type of bed available in the quantity indicated by quantity.
     */
    @NotNull public Builder typeOfBed(@NotNull BedType bedType) {
      putValue("typeOfBed", bedType);
      return this;
    }
    /**
     * The type of bed to which the BedDetail refers, i.e. the type of bed available in the quantity indicated by quantity.
     */
    @NotNull public Builder typeOfBed(@NotNull BedType.Builder bedType) {
      putValue("typeOfBed", bedType.build());
      return this;
    }
    /**
     * The type of bed to which the BedDetail refers, i.e. the type of bed available in the quantity indicated by quantity.
     */
    @NotNull public Builder typeOfBed(@NotNull String typeOfBed) {
      putValue("typeOfBed", typeOfBed);
      return this;
    }
    /**
     * The quantity of the given bed type available in the HotelRoom, Suite, House, or Apartment.
     */
    @NotNull public Builder numberOfBeds(@NotNull Integer integer) {
      putValue("numberOfBeds", integer);
      return this;
    }
    /**
     * The quantity of the given bed type available in the HotelRoom, Suite, House, or Apartment.
     */
    @NotNull public Builder numberOfBeds(@NotNull Long numberOfBeds) {
      putValue("numberOfBeds", numberOfBeds);
      return this;
    }
    /**
     * The quantity of the given bed type available in the HotelRoom, Suite, House, or Apartment.
     */
    @NotNull public Builder numberOfBeds(@NotNull Float numberOfBeds) {
      putValue("numberOfBeds", numberOfBeds);
      return this;
    }
    /**
     * The quantity of the given bed type available in the HotelRoom, Suite, House, or Apartment.
     */
    @NotNull public Builder numberOfBeds(@NotNull Double numberOfBeds) {
      putValue("numberOfBeds", numberOfBeds);
      return this;
    }
    /**
     * The quantity of the given bed type available in the HotelRoom, Suite, House, or Apartment.
     */
    @NotNull public Builder numberOfBeds(@NotNull String numberOfBeds) {
      putValue("numberOfBeds", numberOfBeds);
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
      if ("typeOfBed".equals(key) && value instanceof BedType) { typeOfBed((BedType)value); return; }
      if ("typeOfBeds".equals(key) && value instanceof BedType) { typeOfBed((BedType)value); return; }
      if ("typeOfBed".equals(key) && value instanceof String) { typeOfBed((String)value); return; }
      if ("typeOfBeds".equals(key) && value instanceof String) { typeOfBed((String)value); return; }
      if ("numberOfBeds".equals(key) && value instanceof Integer) { numberOfBeds((Integer)value); return; }
      if ("numberOfBedss".equals(key) && value instanceof Integer) { numberOfBeds((Integer)value); return; }
      if ("numberOfBeds".equals(key) && value instanceof Long) { numberOfBeds((Long)value); return; }
      if ("numberOfBedss".equals(key) && value instanceof Long) { numberOfBeds((Long)value); return; }
      if ("numberOfBeds".equals(key) && value instanceof Float) { numberOfBeds((Float)value); return; }
      if ("numberOfBedss".equals(key) && value instanceof Float) { numberOfBeds((Float)value); return; }
      if ("numberOfBeds".equals(key) && value instanceof Double) { numberOfBeds((Double)value); return; }
      if ("numberOfBedss".equals(key) && value instanceof Double) { numberOfBeds((Double)value); return; }
      if ("numberOfBeds".equals(key) && value instanceof String) { numberOfBeds((String)value); return; }
      if ("numberOfBedss".equals(key) && value instanceof String) { numberOfBeds((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}