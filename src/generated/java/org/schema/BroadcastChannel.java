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
 * A unique instance of a BroadcastService on a CableOrSatelliteService lineup.
 */
public class BroadcastChannel extends Intangible {
  /**
   * The unique address by which the BroadcastService can be identified in a provider lineup. In US, this is typically a number.
   */
  @JsonIgnore public String getBroadcastChannelId() {
    return (String) getValue("broadcastChannelId");
  }
  /**
   * The unique address by which the BroadcastService can be identified in a provider lineup. In US, this is typically a number.
   */
  @JsonIgnore public Collection<String> getBroadcastChannelIds() {
    final Object current = myData.get("broadcastChannelId");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The CableOrSatelliteService offering the channel.
   */
  @JsonIgnore public CableOrSatelliteService getInBroadcastLineup() {
    return (CableOrSatelliteService) getValue("inBroadcastLineup");
  }
  /**
   * The CableOrSatelliteService offering the channel.
   */
  @JsonIgnore public Collection<CableOrSatelliteService> getInBroadcastLineups() {
    final Object current = myData.get("inBroadcastLineup");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<CableOrSatelliteService>) current;
    }
    return Arrays.asList((CableOrSatelliteService) current);
  }
  /**
   * The type of service required to have access to the channel (e.g. Standard or Premium).
   */
  @JsonIgnore public String getBroadcastServiceTier() {
    return (String) getValue("broadcastServiceTier");
  }
  /**
   * The type of service required to have access to the channel (e.g. Standard or Premium).
   */
  @JsonIgnore public Collection<String> getBroadcastServiceTiers() {
    final Object current = myData.get("broadcastServiceTier");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The BroadcastService offered on this channel.
   */
  @JsonIgnore public BroadcastService getProvidesBroadcastService() {
    return (BroadcastService) getValue("providesBroadcastService");
  }
  /**
   * The BroadcastService offered on this channel.
   */
  @JsonIgnore public Collection<BroadcastService> getProvidesBroadcastServices() {
    final Object current = myData.get("providesBroadcastService");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<BroadcastService>) current;
    }
    return Arrays.asList((BroadcastService) current);
  }
  /**
   * The frequency used for over-the-air broadcasts. Numeric values or simple ranges e.g. 87-99. In addition a shortcut idiom is supported for frequences of AM and FM radio channels, e.g. "87 FM".
   */
  @JsonIgnore public BroadcastFrequencySpecification getBroadcastFrequencyBroadcastFrequencySpecification() {
    return (BroadcastFrequencySpecification) getValue("broadcastFrequency");
  }
  /**
   * The frequency used for over-the-air broadcasts. Numeric values or simple ranges e.g. 87-99. In addition a shortcut idiom is supported for frequences of AM and FM radio channels, e.g. "87 FM".
   */
  @JsonIgnore public Collection<BroadcastFrequencySpecification> getBroadcastFrequencyBroadcastFrequencySpecifications() {
    final Object current = myData.get("broadcastFrequency");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<BroadcastFrequencySpecification>) current;
    }
    return Arrays.asList((BroadcastFrequencySpecification) current);
  }
  /**
   * The frequency used for over-the-air broadcasts. Numeric values or simple ranges e.g. 87-99. In addition a shortcut idiom is supported for frequences of AM and FM radio channels, e.g. "87 FM".
   */
  @JsonIgnore public String getBroadcastFrequencyString() {
    return (String) getValue("broadcastFrequency");
  }
  /**
   * The frequency used for over-the-air broadcasts. Numeric values or simple ranges e.g. 87-99. In addition a shortcut idiom is supported for frequences of AM and FM radio channels, e.g. "87 FM".
   */
  @JsonIgnore public Collection<String> getBroadcastFrequencyStrings() {
    final Object current = myData.get("broadcastFrequency");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected BroadcastChannel(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link BroadcastChannel}
   */
  public static class Builder extends Intangible.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public BroadcastChannel build() {
      return new BroadcastChannel(myData);
    }
    /**
     * The unique address by which the BroadcastService can be identified in a provider lineup. In US, this is typically a number.
     */
    @NotNull public Builder broadcastChannelId(@NotNull String broadcastChannelId) {
      putValue("broadcastChannelId", broadcastChannelId);
      return this;
    }
    /**
     * The CableOrSatelliteService offering the channel.
     */
    @NotNull public Builder inBroadcastLineup(@NotNull CableOrSatelliteService cableOrSatelliteService) {
      putValue("inBroadcastLineup", cableOrSatelliteService);
      return this;
    }
    /**
     * The CableOrSatelliteService offering the channel.
     */
    @NotNull public Builder inBroadcastLineup(@NotNull CableOrSatelliteService.Builder cableOrSatelliteService) {
      putValue("inBroadcastLineup", cableOrSatelliteService.build());
      return this;
    }
    /**
     * The type of service required to have access to the channel (e.g. Standard or Premium).
     */
    @NotNull public Builder broadcastServiceTier(@NotNull String broadcastServiceTier) {
      putValue("broadcastServiceTier", broadcastServiceTier);
      return this;
    }
    /**
     * The BroadcastService offered on this channel.
     */
    @NotNull public Builder providesBroadcastService(@NotNull BroadcastService broadcastService) {
      putValue("providesBroadcastService", broadcastService);
      return this;
    }
    /**
     * The BroadcastService offered on this channel.
     */
    @NotNull public Builder providesBroadcastService(@NotNull BroadcastService.Builder broadcastService) {
      putValue("providesBroadcastService", broadcastService.build());
      return this;
    }
    /**
     * The frequency used for over-the-air broadcasts. Numeric values or simple ranges e.g. 87-99. In addition a shortcut idiom is supported for frequences of AM and FM radio channels, e.g. "87 FM".
     */
    @NotNull public Builder broadcastFrequency(@NotNull BroadcastFrequencySpecification broadcastFrequencySpecification) {
      putValue("broadcastFrequency", broadcastFrequencySpecification);
      return this;
    }
    /**
     * The frequency used for over-the-air broadcasts. Numeric values or simple ranges e.g. 87-99. In addition a shortcut idiom is supported for frequences of AM and FM radio channels, e.g. "87 FM".
     */
    @NotNull public Builder broadcastFrequency(@NotNull BroadcastFrequencySpecification.Builder broadcastFrequencySpecification) {
      putValue("broadcastFrequency", broadcastFrequencySpecification.build());
      return this;
    }
    /**
     * The frequency used for over-the-air broadcasts. Numeric values or simple ranges e.g. 87-99. In addition a shortcut idiom is supported for frequences of AM and FM radio channels, e.g. "87 FM".
     */
    @NotNull public Builder broadcastFrequency(@NotNull String broadcastFrequency) {
      putValue("broadcastFrequency", broadcastFrequency);
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
      if ("broadcastChannelId".equals(key) && value instanceof String) { broadcastChannelId((String)value); return; }
      if ("broadcastChannelIds".equals(key) && value instanceof String) { broadcastChannelId((String)value); return; }
      if ("inBroadcastLineup".equals(key) && value instanceof CableOrSatelliteService) { inBroadcastLineup((CableOrSatelliteService)value); return; }
      if ("inBroadcastLineups".equals(key) && value instanceof CableOrSatelliteService) { inBroadcastLineup((CableOrSatelliteService)value); return; }
      if ("broadcastServiceTier".equals(key) && value instanceof String) { broadcastServiceTier((String)value); return; }
      if ("broadcastServiceTiers".equals(key) && value instanceof String) { broadcastServiceTier((String)value); return; }
      if ("providesBroadcastService".equals(key) && value instanceof BroadcastService) { providesBroadcastService((BroadcastService)value); return; }
      if ("providesBroadcastServices".equals(key) && value instanceof BroadcastService) { providesBroadcastService((BroadcastService)value); return; }
      if ("broadcastFrequency".equals(key) && value instanceof BroadcastFrequencySpecification) { broadcastFrequency((BroadcastFrequencySpecification)value); return; }
      if ("broadcastFrequencys".equals(key) && value instanceof BroadcastFrequencySpecification) { broadcastFrequency((BroadcastFrequencySpecification)value); return; }
      if ("broadcastFrequency".equals(key) && value instanceof String) { broadcastFrequency((String)value); return; }
      if ("broadcastFrequencys".equals(key) && value instanceof String) { broadcastFrequency((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}