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
 * A trip on a commercial train line.
 */
public class TrainTrip extends Trip {
  /**
   * The unique identifier for the train.
   */
  @JsonIgnore public String getTrainNumber() {
    return (String) getValue("trainNumber");
  }
  /**
   * The unique identifier for the train.
   */
  @JsonIgnore public Collection<String> getTrainNumbers() {
    final Object current = myData.get("trainNumber");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The name of the train (e.g. The Orient Express).
   */
  @JsonIgnore public String getTrainName() {
    return (String) getValue("trainName");
  }
  /**
   * The name of the train (e.g. The Orient Express).
   */
  @JsonIgnore public Collection<String> getTrainNames() {
    final Object current = myData.get("trainName");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The station from which the train departs.
   */
  @JsonIgnore public TrainStation getDepartureStation() {
    return (TrainStation) getValue("departureStation");
  }
  /**
   * The station from which the train departs.
   */
  @JsonIgnore public Collection<TrainStation> getDepartureStations() {
    final Object current = myData.get("departureStation");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<TrainStation>) current;
    }
    return Arrays.asList((TrainStation) current);
  }
  /**
   * The station where the train trip ends.
   */
  @JsonIgnore public TrainStation getArrivalStation() {
    return (TrainStation) getValue("arrivalStation");
  }
  /**
   * The station where the train trip ends.
   */
  @JsonIgnore public Collection<TrainStation> getArrivalStations() {
    final Object current = myData.get("arrivalStation");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<TrainStation>) current;
    }
    return Arrays.asList((TrainStation) current);
  }
  /**
   * The platform from which the train departs.
   */
  @JsonIgnore public String getDeparturePlatform() {
    return (String) getValue("departurePlatform");
  }
  /**
   * The platform from which the train departs.
   */
  @JsonIgnore public Collection<String> getDeparturePlatforms() {
    final Object current = myData.get("departurePlatform");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The platform where the train arrives.
   */
  @JsonIgnore public String getArrivalPlatform() {
    return (String) getValue("arrivalPlatform");
  }
  /**
   * The platform where the train arrives.
   */
  @JsonIgnore public Collection<String> getArrivalPlatforms() {
    final Object current = myData.get("arrivalPlatform");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected TrainTrip(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link TrainTrip}
   */
  public static class Builder extends Trip.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public TrainTrip build() {
      return new TrainTrip(myData);
    }
    /**
     * The unique identifier for the train.
     */
    @NotNull public Builder trainNumber(@NotNull String trainNumber) {
      putValue("trainNumber", trainNumber);
      return this;
    }
    /**
     * The name of the train (e.g. The Orient Express).
     */
    @NotNull public Builder trainName(@NotNull String trainName) {
      putValue("trainName", trainName);
      return this;
    }
    /**
     * The station from which the train departs.
     */
    @NotNull public Builder departureStation(@NotNull TrainStation trainStation) {
      putValue("departureStation", trainStation);
      return this;
    }
    /**
     * The station from which the train departs.
     */
    @NotNull public Builder departureStation(@NotNull TrainStation.Builder trainStation) {
      putValue("departureStation", trainStation.build());
      return this;
    }
    /**
     * The station where the train trip ends.
     */
    @NotNull public Builder arrivalStation(@NotNull TrainStation trainStation) {
      putValue("arrivalStation", trainStation);
      return this;
    }
    /**
     * The station where the train trip ends.
     */
    @NotNull public Builder arrivalStation(@NotNull TrainStation.Builder trainStation) {
      putValue("arrivalStation", trainStation.build());
      return this;
    }
    /**
     * The platform from which the train departs.
     */
    @NotNull public Builder departurePlatform(@NotNull String departurePlatform) {
      putValue("departurePlatform", departurePlatform);
      return this;
    }
    /**
     * The platform where the train arrives.
     */
    @NotNull public Builder arrivalPlatform(@NotNull String arrivalPlatform) {
      putValue("arrivalPlatform", arrivalPlatform);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Organization organization) {
      putValue("provider", organization);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Organization.Builder organization) {
      putValue("provider", organization.build());
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Person person) {
      putValue("provider", person);
      return this;
    }
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @NotNull public Builder provider(@NotNull Person.Builder person) {
      putValue("provider", person.build());
      return this;
    }
    /**
     * The expected departure time.
     */
    @NotNull public Builder departureTime(@NotNull java.util.Date date) {
      putValue("departureTime", date);
      return this;
    }
    /**
     * The expected arrival time.
     */
    @NotNull public Builder arrivalTime(@NotNull java.util.Date date) {
      putValue("arrivalTime", date);
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
      if ("trainNumber".equals(key) && value instanceof String) { trainNumber((String)value); return; }
      if ("trainNumbers".equals(key) && value instanceof String) { trainNumber((String)value); return; }
      if ("trainName".equals(key) && value instanceof String) { trainName((String)value); return; }
      if ("trainNames".equals(key) && value instanceof String) { trainName((String)value); return; }
      if ("departureStation".equals(key) && value instanceof TrainStation) { departureStation((TrainStation)value); return; }
      if ("departureStations".equals(key) && value instanceof TrainStation) { departureStation((TrainStation)value); return; }
      if ("arrivalStation".equals(key) && value instanceof TrainStation) { arrivalStation((TrainStation)value); return; }
      if ("arrivalStations".equals(key) && value instanceof TrainStation) { arrivalStation((TrainStation)value); return; }
      if ("departurePlatform".equals(key) && value instanceof String) { departurePlatform((String)value); return; }
      if ("departurePlatforms".equals(key) && value instanceof String) { departurePlatform((String)value); return; }
      if ("arrivalPlatform".equals(key) && value instanceof String) { arrivalPlatform((String)value); return; }
      if ("arrivalPlatforms".equals(key) && value instanceof String) { arrivalPlatform((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}