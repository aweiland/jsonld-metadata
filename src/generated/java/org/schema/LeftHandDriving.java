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
 * The steering position is on the left side of the vehicle (viewed from the main direction of driving).Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#Automotive_Ontology_Working_Group
 */
public class LeftHandDriving extends SteeringPositionValue {
  protected LeftHandDriving(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link LeftHandDriving}
   */
  public static class Builder extends SteeringPositionValue.Builder {
    public Builder(@NotNull HashMap<String,Object> data) {
      super(data);
    }
    @NotNull public LeftHandDriving build() {
      return new LeftHandDriving(myData);
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is equal to the object.
     */
    @NotNull public Builder equal(@NotNull QualitativeValue qualitativeValue) {
      putValue("equal", qualitativeValue);
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is equal to the object.
     */
    @NotNull public Builder equal(@NotNull QualitativeValue.Builder qualitativeValue) {
      putValue("equal", qualitativeValue.build());
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is greater than the object.
     */
    @NotNull public Builder greater(@NotNull QualitativeValue qualitativeValue) {
      putValue("greater", qualitativeValue);
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is greater than the object.
     */
    @NotNull public Builder greater(@NotNull QualitativeValue.Builder qualitativeValue) {
      putValue("greater", qualitativeValue.build());
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is greater than or equal to the object.
     */
    @NotNull public Builder greaterOrEqual(@NotNull QualitativeValue qualitativeValue) {
      putValue("greaterOrEqual", qualitativeValue);
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is greater than or equal to the object.
     */
    @NotNull public Builder greaterOrEqual(@NotNull QualitativeValue.Builder qualitativeValue) {
      putValue("greaterOrEqual", qualitativeValue.build());
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is lesser than the object.
     */
    @NotNull public Builder lesser(@NotNull QualitativeValue qualitativeValue) {
      putValue("lesser", qualitativeValue);
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is lesser than the object.
     */
    @NotNull public Builder lesser(@NotNull QualitativeValue.Builder qualitativeValue) {
      putValue("lesser", qualitativeValue.build());
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is lesser than or equal to the object.
     */
    @NotNull public Builder lesserOrEqual(@NotNull QualitativeValue qualitativeValue) {
      putValue("lesserOrEqual", qualitativeValue);
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is lesser than or equal to the object.
     */
    @NotNull public Builder lesserOrEqual(@NotNull QualitativeValue.Builder qualitativeValue) {
      putValue("lesserOrEqual", qualitativeValue.build());
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is not equal to the object.
     */
    @NotNull public Builder nonEqual(@NotNull QualitativeValue qualitativeValue) {
      putValue("nonEqual", qualitativeValue);
      return this;
    }
    /**
     * This ordering relation for qualitative values indicates that the subject is not equal to the object.
     */
    @NotNull public Builder nonEqual(@NotNull QualitativeValue.Builder qualitativeValue) {
      putValue("nonEqual", qualitativeValue.build());
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @NotNull public Builder valueReference(@NotNull Enumeration enumeration) {
      putValue("valueReference", enumeration);
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @NotNull public Builder valueReference(@NotNull Enumeration.Builder enumeration) {
      putValue("valueReference", enumeration.build());
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @NotNull public Builder valueReference(@NotNull PropertyValue propertyValue) {
      putValue("valueReference", propertyValue);
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @NotNull public Builder valueReference(@NotNull PropertyValue.Builder propertyValue) {
      putValue("valueReference", propertyValue.build());
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @NotNull public Builder valueReference(@NotNull QualitativeValue qualitativeValue) {
      putValue("valueReference", qualitativeValue);
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @NotNull public Builder valueReference(@NotNull QualitativeValue.Builder qualitativeValue) {
      putValue("valueReference", qualitativeValue.build());
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @NotNull public Builder valueReference(@NotNull QuantitativeValue quantitativeValue) {
      putValue("valueReference", quantitativeValue);
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @NotNull public Builder valueReference(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("valueReference", quantitativeValue.build());
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @NotNull public Builder valueReference(@NotNull StructuredValue structuredValue) {
      putValue("valueReference", structuredValue);
      return this;
    }
    /**
     * A pointer to a secondary value that provides additional information on the original value, e.g. a reference temperature.
     */
    @NotNull public Builder valueReference(@NotNull StructuredValue.Builder structuredValue) {
      putValue("valueReference", structuredValue.build());
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
      super.fromMap(key, value);
    }
  }
  
}