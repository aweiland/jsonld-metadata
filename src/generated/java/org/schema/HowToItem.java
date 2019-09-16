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
 * An item used as either a tool or supply when performing the instructions for how to to achieve a result.
 */
public class HowToItem extends ListItem {
  /**
   * The required quantity of the item(s).
   */
  @JsonIgnore public Number getRequiredQuantityNumber() {
    return (Number) getValue("requiredQuantity");
  }
  /**
   * The required quantity of the item(s).
   */
  @JsonIgnore public Collection<Number> getRequiredQuantityNumbers() {
    final Object current = myData.get("requiredQuantity");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Number>) current;
    }
    return Arrays.asList((Number) current);
  }
  /**
   * The required quantity of the item(s).
   */
  @JsonIgnore public QuantitativeValue getRequiredQuantityQuantitativeValue() {
    return (QuantitativeValue) getValue("requiredQuantity");
  }
  /**
   * The required quantity of the item(s).
   */
  @JsonIgnore public Collection<QuantitativeValue> getRequiredQuantityQuantitativeValues() {
    final Object current = myData.get("requiredQuantity");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The required quantity of the item(s).
   */
  @JsonIgnore public String getRequiredQuantityString() {
    return (String) getValue("requiredQuantity");
  }
  /**
   * The required quantity of the item(s).
   */
  @JsonIgnore public Collection<String> getRequiredQuantityStrings() {
    final Object current = myData.get("requiredQuantity");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  protected HowToItem(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link HowToItem}
   */
  public static class Builder extends ListItem.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public HowToItem build() {
      return new HowToItem(myData);
    }
    /**
     * The required quantity of the item(s).
     */
    @NotNull public Builder requiredQuantity(@NotNull Number number) {
      putValue("requiredQuantity", number);
      return this;
    }
    /**
     * The required quantity of the item(s).
     */
    @NotNull public Builder requiredQuantity(@NotNull QuantitativeValue quantitativeValue) {
      putValue("requiredQuantity", quantitativeValue);
      return this;
    }
    /**
     * The required quantity of the item(s).
     */
    @NotNull public Builder requiredQuantity(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("requiredQuantity", quantitativeValue.build());
      return this;
    }
    /**
     * The required quantity of the item(s).
     */
    @NotNull public Builder requiredQuantity(@NotNull String requiredQuantity) {
      putValue("requiredQuantity", requiredQuantity);
      return this;
    }
    /**
     * An entity represented by an entry in a list or data feed (e.g. an 'artist' in a list of 'artists')’.
     */
    @NotNull public Builder item(@NotNull Thing thing) {
      putValue("item", thing);
      return this;
    }
    /**
     * An entity represented by an entry in a list or data feed (e.g. an 'artist' in a list of 'artists')’.
     */
    @NotNull public Builder item(@NotNull Thing.Builder thing) {
      putValue("item", thing.build());
      return this;
    }
    /**
     * A link to the ListItem that preceeds the current one.
     */
    @NotNull public Builder previousItem(@NotNull ListItem listItem) {
      putValue("previousItem", listItem);
      return this;
    }
    /**
     * A link to the ListItem that preceeds the current one.
     */
    @NotNull public Builder previousItem(@NotNull ListItem.Builder listItem) {
      putValue("previousItem", listItem.build());
      return this;
    }
    /**
     * A link to the ListItem that follows the current one.
     */
    @NotNull public Builder nextItem(@NotNull ListItem listItem) {
      putValue("nextItem", listItem);
      return this;
    }
    /**
     * A link to the ListItem that follows the current one.
     */
    @NotNull public Builder nextItem(@NotNull ListItem.Builder listItem) {
      putValue("nextItem", listItem.build());
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
      if ("requiredQuantity".equals(key) && value instanceof Number) { requiredQuantity((Number)value); return; }
      if ("requiredQuantitys".equals(key) && value instanceof Number) { requiredQuantity((Number)value); return; }
      if ("requiredQuantity".equals(key) && value instanceof QuantitativeValue) { requiredQuantity((QuantitativeValue)value); return; }
      if ("requiredQuantitys".equals(key) && value instanceof QuantitativeValue) { requiredQuantity((QuantitativeValue)value); return; }
      if ("requiredQuantity".equals(key) && value instanceof String) { requiredQuantity((String)value); return; }
      if ("requiredQuantitys".equals(key) && value instanceof String) { requiredQuantity((String)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
