/*
 * Copyright 2015-2016 JetBrains s.r.o.
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
 * A demand entity represents the public, not necessarily binding, not necessarily exclusive, announcement by an organization or person to seek a certain type of goods or services. For describing demand using this type, the very same properties used for Offer apply.Source: http://www.w3.org/wiki/WebSchemas/SchemaDotOrgSources#source_GoodRelationsClass
 */
public class Demand extends Intangible {
  /**
   * The payment method(s) accepted by seller for this offer.
   */
  @JsonIgnore public PaymentMethod getAcceptedPaymentMethod() {
    return (PaymentMethod) getValue("acceptedPaymentMethod");
  }
  /**
   * The payment method(s) accepted by seller for this offer.
   */
  @JsonIgnore public Collection<PaymentMethod> getAcceptedPaymentMethods() {
    final Object current = myData.get("acceptedPaymentMethod");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<PaymentMethod>) current;
    }
    return Arrays.asList((PaymentMethod) current);
  }
  /**
   * The amount of time that is required between accepting the offer and the actual usage of the resource or service.
   */
  @JsonIgnore public QuantitativeValue getAdvanceBookingRequirement() {
    return (QuantitativeValue) getValue("advanceBookingRequirement");
  }
  /**
   * The amount of time that is required between accepting the offer and the actual usage of the resource or service.
   */
  @JsonIgnore public Collection<QuantitativeValue> getAdvanceBookingRequirements() {
    final Object current = myData.get("advanceBookingRequirement");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The availability of this item&#x2014;for example In stock, Out of stock, Pre-order, etc.
   */
  @JsonIgnore public ItemAvailability getAvailability() {
    return (ItemAvailability) getValue("availability");
  }
  /**
   * The availability of this item&#x2014;for example In stock, Out of stock, Pre-order, etc.
   */
  @JsonIgnore public Collection<ItemAvailability> getAvailabilitys() {
    final Object current = myData.get("availability");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<ItemAvailability>) current;
    }
    return Arrays.asList((ItemAvailability) current);
  }
  /**
   * The end of the availability of the product or service included in the offer.
   */
  @JsonIgnore public java.util.Date getAvailabilityEnds() {
    return (java.util.Date) getValue("availabilityEnds");
  }
  /**
   * The end of the availability of the product or service included in the offer.
   */
  @JsonIgnore public Collection<java.util.Date> getAvailabilityEndss() {
    final Object current = myData.get("availabilityEnds");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The beginning of the availability of the product or service included in the offer.
   */
  @JsonIgnore public java.util.Date getAvailabilityStarts() {
    return (java.util.Date) getValue("availabilityStarts");
  }
  /**
   * The beginning of the availability of the product or service included in the offer.
   */
  @JsonIgnore public Collection<java.util.Date> getAvailabilityStartss() {
    final Object current = myData.get("availabilityStarts");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The place(s) from which the offer can be obtained (e.g. store locations).
   */
  @JsonIgnore public Place getAvailableAtOrFrom() {
    return (Place) getValue("availableAtOrFrom");
  }
  /**
   * The place(s) from which the offer can be obtained (e.g. store locations).
   */
  @JsonIgnore public Collection<Place> getAvailableAtOrFroms() {
    final Object current = myData.get("availableAtOrFrom");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * The delivery method(s) available for this offer.
   */
  @JsonIgnore public DeliveryMethod getAvailableDeliveryMethod() {
    return (DeliveryMethod) getValue("availableDeliveryMethod");
  }
  /**
   * The delivery method(s) available for this offer.
   */
  @JsonIgnore public Collection<DeliveryMethod> getAvailableDeliveryMethods() {
    final Object current = myData.get("availableDeliveryMethod");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<DeliveryMethod>) current;
    }
    return Arrays.asList((DeliveryMethod) current);
  }
  /**
   * The business function (e.g. sell, lease, repair, dispose) of the offer or component of a bundle (TypeAndQuantityNode). The default is http://purl.org/goodrelations/v1#Sell.
   */
  @JsonIgnore public BusinessFunction getBusinessFunction() {
    return (BusinessFunction) getValue("businessFunction");
  }
  /**
   * The business function (e.g. sell, lease, repair, dispose) of the offer or component of a bundle (TypeAndQuantityNode). The default is http://purl.org/goodrelations/v1#Sell.
   */
  @JsonIgnore public Collection<BusinessFunction> getBusinessFunctions() {
    final Object current = myData.get("businessFunction");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<BusinessFunction>) current;
    }
    return Arrays.asList((BusinessFunction) current);
  }
  /**
   * The typical delay between the receipt of the order and the goods leaving the warehouse.
   */
  @JsonIgnore public QuantitativeValue getDeliveryLeadTime() {
    return (QuantitativeValue) getValue("deliveryLeadTime");
  }
  /**
   * The typical delay between the receipt of the order and the goods leaving the warehouse.
   */
  @JsonIgnore public Collection<QuantitativeValue> getDeliveryLeadTimes() {
    final Object current = myData.get("deliveryLeadTime");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The type(s) of customers for which the given offer is valid.
   */
  @JsonIgnore public BusinessEntityType getEligibleCustomerType() {
    return (BusinessEntityType) getValue("eligibleCustomerType");
  }
  /**
   * The type(s) of customers for which the given offer is valid.
   */
  @JsonIgnore public Collection<BusinessEntityType> getEligibleCustomerTypes() {
    final Object current = myData.get("eligibleCustomerType");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<BusinessEntityType>) current;
    }
    return Arrays.asList((BusinessEntityType) current);
  }
  /**
   * The duration for which the given offer is valid.
   */
  @JsonIgnore public QuantitativeValue getEligibleDuration() {
    return (QuantitativeValue) getValue("eligibleDuration");
  }
  /**
   * The duration for which the given offer is valid.
   */
  @JsonIgnore public Collection<QuantitativeValue> getEligibleDurations() {
    final Object current = myData.get("eligibleDuration");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
   */
  @JsonIgnore public QuantitativeValue getEligibleQuantity() {
    return (QuantitativeValue) getValue("eligibleQuantity");
  }
  /**
   * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
   */
  @JsonIgnore public Collection<QuantitativeValue> getEligibleQuantitys() {
    final Object current = myData.get("eligibleQuantity");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.
   */
  @JsonIgnore public GeoShape getEligibleRegionGeoShape() {
    return (GeoShape) getValue("eligibleRegion");
  }
  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.
   */
  @JsonIgnore public Collection<GeoShape> getEligibleRegionGeoShapes() {
    final Object current = myData.get("eligibleRegion");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<GeoShape>) current;
    }
    return Arrays.asList((GeoShape) current);
  }
  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.
   */
  @JsonIgnore public Place getEligibleRegionPlace() {
    return (Place) getValue("eligibleRegion");
  }
  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.
   */
  @JsonIgnore public Collection<Place> getEligibleRegionPlaces() {
    final Object current = myData.get("eligibleRegion");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.
   */
  @JsonIgnore public String getEligibleRegionString() {
    return (String) getValue("eligibleRegion");
  }
  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.
   */
  @JsonIgnore public Collection<String> getEligibleRegionStrings() {
    final Object current = myData.get("eligibleRegion");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.
   */
  @JsonIgnore public GeoShape getIneligibleRegionGeoShape() {
    return (GeoShape) getValue("ineligibleRegion");
  }
  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.
   */
  @JsonIgnore public Collection<GeoShape> getIneligibleRegionGeoShapes() {
    final Object current = myData.get("ineligibleRegion");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<GeoShape>) current;
    }
    return Arrays.asList((GeoShape) current);
  }
  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.
   */
  @JsonIgnore public Place getIneligibleRegionPlace() {
    return (Place) getValue("ineligibleRegion");
  }
  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.
   */
  @JsonIgnore public Collection<Place> getIneligibleRegionPlaces() {
    final Object current = myData.get("ineligibleRegion");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Place>) current;
    }
    return Arrays.asList((Place) current);
  }
  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.
   */
  @JsonIgnore public String getIneligibleRegionString() {
    return (String) getValue("ineligibleRegion");
  }
  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.
   */
  @JsonIgnore public Collection<String> getIneligibleRegionStrings() {
    final Object current = myData.get("ineligibleRegion");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
   */
  @JsonIgnore public PriceSpecification getEligibleTransactionVolume() {
    return (PriceSpecification) getValue("eligibleTransactionVolume");
  }
  /**
   * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
   */
  @JsonIgnore public Collection<PriceSpecification> getEligibleTransactionVolumes() {
    final Object current = myData.get("eligibleTransactionVolume");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<PriceSpecification>) current;
    }
    return Arrays.asList((PriceSpecification) current);
  }
  /**
   * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-12.aspx">GTIN-12</a> code of the product, or the product to which the offer refers. The GTIN-12 is the 12-digit GS1 Identification Key composed of a U.P.C. Company Prefix, Item Reference, and Check Digit used to identify trade items. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
   */
  @JsonIgnore public String getGtin12() {
    return (String) getValue("gtin12");
  }
  /**
   * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-12.aspx">GTIN-12</a> code of the product, or the product to which the offer refers. The GTIN-12 is the 12-digit GS1 Identification Key composed of a U.P.C. Company Prefix, Item Reference, and Check Digit used to identify trade items. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
   */
  @JsonIgnore public Collection<String> getGtin12s() {
    final Object current = myData.get("gtin12");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-13.aspx">GTIN-13</a> code of the product, or the product to which the offer refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former 12-digit UPC codes can be converted into a GTIN-13 code by simply adding a preceeding zero. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
   */
  @JsonIgnore public String getGtin13() {
    return (String) getValue("gtin13");
  }
  /**
   * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-13.aspx">GTIN-13</a> code of the product, or the product to which the offer refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former 12-digit UPC codes can be converted into a GTIN-13 code by simply adding a preceeding zero. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
   */
  @JsonIgnore public Collection<String> getGtin13s() {
    final Object current = myData.get("gtin13");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-14.aspx">GTIN-14</a> code of the product, or the product to which the offer refers. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
   */
  @JsonIgnore public String getGtin14() {
    return (String) getValue("gtin14");
  }
  /**
   * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-14.aspx">GTIN-14</a> code of the product, or the product to which the offer refers. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
   */
  @JsonIgnore public Collection<String> getGtin14s() {
    final Object current = myData.get("gtin14");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-8.aspx">GTIN-8</a> code of the product, or the product to which the offer refers. This code is also known as EAN/UCC-8 or 8-digit EAN. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
   */
  @JsonIgnore public String getGtin8() {
    return (String) getValue("gtin8");
  }
  /**
   * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-8.aspx">GTIN-8</a> code of the product, or the product to which the offer refers. This code is also known as EAN/UCC-8 or 8-digit EAN. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
   */
  @JsonIgnore public Collection<String> getGtin8s() {
    final Object current = myData.get("gtin8");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * This links to a node or nodes indicating the exact quantity of the products included in the offer.
   */
  @JsonIgnore public TypeAndQuantityNode getIncludesObject() {
    return (TypeAndQuantityNode) getValue("includesObject");
  }
  /**
   * This links to a node or nodes indicating the exact quantity of the products included in the offer.
   */
  @JsonIgnore public Collection<TypeAndQuantityNode> getIncludesObjects() {
    final Object current = myData.get("includesObject");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<TypeAndQuantityNode>) current;
    }
    return Arrays.asList((TypeAndQuantityNode) current);
  }
  /**
   * The current approximate inventory level for the item or items.
   */
  @JsonIgnore public QuantitativeValue getInventoryLevel() {
    return (QuantitativeValue) getValue("inventoryLevel");
  }
  /**
   * The current approximate inventory level for the item or items.
   */
  @JsonIgnore public Collection<QuantitativeValue> getInventoryLevels() {
    final Object current = myData.get("inventoryLevel");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<QuantitativeValue>) current;
    }
    return Arrays.asList((QuantitativeValue) current);
  }
  /**
   * A predefined value from OfferItemCondition or a textual description of the condition of the product or service, or the products or services included in the offer.
   */
  @JsonIgnore public OfferItemCondition getItemCondition() {
    return (OfferItemCondition) getValue("itemCondition");
  }
  /**
   * A predefined value from OfferItemCondition or a textual description of the condition of the product or service, or the products or services included in the offer.
   */
  @JsonIgnore public Collection<OfferItemCondition> getItemConditions() {
    final Object current = myData.get("itemCondition");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<OfferItemCondition>) current;
    }
    return Arrays.asList((OfferItemCondition) current);
  }
  /**
   * The item being offered.
   */
  @JsonIgnore public Product getItemOffered() {
    return (Product) getValue("itemOffered");
  }
  /**
   * The item being offered.
   */
  @JsonIgnore public Collection<Product> getItemOffereds() {
    final Object current = myData.get("itemOffered");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Product>) current;
    }
    return Arrays.asList((Product) current);
  }
  /**
   * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
   */
  @JsonIgnore public String getMpn() {
    return (String) getValue("mpn");
  }
  /**
   * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
   */
  @JsonIgnore public Collection<String> getMpns() {
    final Object current = myData.get("mpn");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * One or more detailed price specifications, indicating the unit price and delivery or payment charges.
   */
  @JsonIgnore public PriceSpecification getPriceSpecification() {
    return (PriceSpecification) getValue("priceSpecification");
  }
  /**
   * One or more detailed price specifications, indicating the unit price and delivery or payment charges.
   */
  @JsonIgnore public Collection<PriceSpecification> getPriceSpecifications() {
    final Object current = myData.get("priceSpecification");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<PriceSpecification>) current;
    }
    return Arrays.asList((PriceSpecification) current);
  }
  /**
   * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
   */
  @JsonIgnore public Participant getSeller() {
    return (Participant) getValue("seller");
  }
  /**
   * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
   */
  @JsonIgnore public Collection<Participant> getSellers() {
    final Object current = myData.get("seller");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<Participant>) current;
    }
    return Arrays.asList((Participant) current);
  }
  /**
   * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers.
   */
  @JsonIgnore public String getSku() {
    return (String) getValue("sku");
  }
  /**
   * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers.
   */
  @JsonIgnore public Collection<String> getSkus() {
    final Object current = myData.get("sku");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<String>) current;
    }
    return Arrays.asList((String) current);
  }
  /**
   * The date when the item becomes valid.
   */
  @JsonIgnore public java.util.Date getValidFrom() {
    return (java.util.Date) getValue("validFrom");
  }
  /**
   * The date when the item becomes valid.
   */
  @JsonIgnore public Collection<java.util.Date> getValidFroms() {
    final Object current = myData.get("validFrom");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The end of the validity of offer, price specification, or opening hours data.
   */
  @JsonIgnore public java.util.Date getValidThrough() {
    return (java.util.Date) getValue("validThrough");
  }
  /**
   * The end of the validity of offer, price specification, or opening hours data.
   */
  @JsonIgnore public Collection<java.util.Date> getValidThroughs() {
    final Object current = myData.get("validThrough");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<java.util.Date>) current;
    }
    return Arrays.asList((java.util.Date) current);
  }
  /**
   * The warranty promise(s) included in the offer.
   */
  @JsonIgnore public WarrantyPromise getWarranty() {
    return (WarrantyPromise) getValue("warranty");
  }
  /**
   * The warranty promise(s) included in the offer.
   */
  @JsonIgnore public Collection<WarrantyPromise> getWarrantys() {
    final Object current = myData.get("warranty");
    if (current == null) return Collections.emptyList();
    if (current instanceof Collection) {
      return (Collection<WarrantyPromise>) current;
    }
    return Arrays.asList((WarrantyPromise) current);
  }
  protected Demand(java.util.Map<String,Object> data) {
    super(data);
  }
  
  /**
   * Builder for {@link Demand}
   */
  public static class Builder extends Intangible.Builder {
    public Demand build() {
      return new Demand(myData);
    }
    /**
     * The payment method(s) accepted by seller for this offer.
     */
    @NotNull public Builder acceptedPaymentMethod(@NotNull PaymentMethod paymentMethod) {
      putValue("acceptedPaymentMethod", paymentMethod);
      return this;
    }
    /**
     * The payment method(s) accepted by seller for this offer.
     */
    @NotNull public Builder acceptedPaymentMethod(@NotNull PaymentMethod.Builder paymentMethod) {
      putValue("acceptedPaymentMethod", paymentMethod.build());
      return this;
    }
    /**
     * The amount of time that is required between accepting the offer and the actual usage of the resource or service.
     */
    @NotNull public Builder advanceBookingRequirement(@NotNull QuantitativeValue quantitativeValue) {
      putValue("advanceBookingRequirement", quantitativeValue);
      return this;
    }
    /**
     * The amount of time that is required between accepting the offer and the actual usage of the resource or service.
     */
    @NotNull public Builder advanceBookingRequirement(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("advanceBookingRequirement", quantitativeValue.build());
      return this;
    }
    /**
     * The availability of this item&#x2014;for example In stock, Out of stock, Pre-order, etc.
     */
    @NotNull public Builder availability(@NotNull ItemAvailability itemAvailability) {
      putValue("availability", itemAvailability);
      return this;
    }
    /**
     * The availability of this item&#x2014;for example In stock, Out of stock, Pre-order, etc.
     */
    @NotNull public Builder availability(@NotNull ItemAvailability.Builder itemAvailability) {
      putValue("availability", itemAvailability.build());
      return this;
    }
    /**
     * The end of the availability of the product or service included in the offer.
     */
    @NotNull public Builder availabilityEnds(@NotNull java.util.Date date) {
      putValue("availabilityEnds", date);
      return this;
    }
    /**
     * The beginning of the availability of the product or service included in the offer.
     */
    @NotNull public Builder availabilityStarts(@NotNull java.util.Date date) {
      putValue("availabilityStarts", date);
      return this;
    }
    /**
     * The place(s) from which the offer can be obtained (e.g. store locations).
     */
    @NotNull public Builder availableAtOrFrom(@NotNull Place place) {
      putValue("availableAtOrFrom", place);
      return this;
    }
    /**
     * The place(s) from which the offer can be obtained (e.g. store locations).
     */
    @NotNull public Builder availableAtOrFrom(@NotNull Place.Builder place) {
      putValue("availableAtOrFrom", place.build());
      return this;
    }
    /**
     * The delivery method(s) available for this offer.
     */
    @NotNull public Builder availableDeliveryMethod(@NotNull DeliveryMethod deliveryMethod) {
      putValue("availableDeliveryMethod", deliveryMethod);
      return this;
    }
    /**
     * The delivery method(s) available for this offer.
     */
    @NotNull public Builder availableDeliveryMethod(@NotNull DeliveryMethod.Builder deliveryMethod) {
      putValue("availableDeliveryMethod", deliveryMethod.build());
      return this;
    }
    /**
     * The business function (e.g. sell, lease, repair, dispose) of the offer or component of a bundle (TypeAndQuantityNode). The default is http://purl.org/goodrelations/v1#Sell.
     */
    @NotNull public Builder businessFunction(@NotNull BusinessFunction businessFunction) {
      putValue("businessFunction", businessFunction);
      return this;
    }
    /**
     * The business function (e.g. sell, lease, repair, dispose) of the offer or component of a bundle (TypeAndQuantityNode). The default is http://purl.org/goodrelations/v1#Sell.
     */
    @NotNull public Builder businessFunction(@NotNull BusinessFunction.Builder businessFunction) {
      putValue("businessFunction", businessFunction.build());
      return this;
    }
    /**
     * The typical delay between the receipt of the order and the goods leaving the warehouse.
     */
    @NotNull public Builder deliveryLeadTime(@NotNull QuantitativeValue quantitativeValue) {
      putValue("deliveryLeadTime", quantitativeValue);
      return this;
    }
    /**
     * The typical delay between the receipt of the order and the goods leaving the warehouse.
     */
    @NotNull public Builder deliveryLeadTime(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("deliveryLeadTime", quantitativeValue.build());
      return this;
    }
    /**
     * The type(s) of customers for which the given offer is valid.
     */
    @NotNull public Builder eligibleCustomerType(@NotNull BusinessEntityType businessEntityType) {
      putValue("eligibleCustomerType", businessEntityType);
      return this;
    }
    /**
     * The type(s) of customers for which the given offer is valid.
     */
    @NotNull public Builder eligibleCustomerType(@NotNull BusinessEntityType.Builder businessEntityType) {
      putValue("eligibleCustomerType", businessEntityType.build());
      return this;
    }
    /**
     * The duration for which the given offer is valid.
     */
    @NotNull public Builder eligibleDuration(@NotNull QuantitativeValue quantitativeValue) {
      putValue("eligibleDuration", quantitativeValue);
      return this;
    }
    /**
     * The duration for which the given offer is valid.
     */
    @NotNull public Builder eligibleDuration(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("eligibleDuration", quantitativeValue.build());
      return this;
    }
    /**
     * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
     */
    @NotNull public Builder eligibleQuantity(@NotNull QuantitativeValue quantitativeValue) {
      putValue("eligibleQuantity", quantitativeValue);
      return this;
    }
    /**
     * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
     */
    @NotNull public Builder eligibleQuantity(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("eligibleQuantity", quantitativeValue.build());
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.
     */
    @NotNull public Builder eligibleRegion(@NotNull GeoShape geoShape) {
      putValue("eligibleRegion", geoShape);
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.
     */
    @NotNull public Builder eligibleRegion(@NotNull GeoShape.Builder geoShape) {
      putValue("eligibleRegion", geoShape.build());
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.
     */
    @NotNull public Builder eligibleRegion(@NotNull Place place) {
      putValue("eligibleRegion", place);
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.
     */
    @NotNull public Builder eligibleRegion(@NotNull Place.Builder place) {
      putValue("eligibleRegion", place.build());
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.
     */
    @NotNull public Builder eligibleRegion(@NotNull String eligibleRegion) {
      putValue("eligibleRegion", eligibleRegion);
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.
     */
    @NotNull public Builder ineligibleRegion(@NotNull GeoShape geoShape) {
      putValue("ineligibleRegion", geoShape);
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.
     */
    @NotNull public Builder ineligibleRegion(@NotNull GeoShape.Builder geoShape) {
      putValue("ineligibleRegion", geoShape.build());
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.
     */
    @NotNull public Builder ineligibleRegion(@NotNull Place place) {
      putValue("ineligibleRegion", place);
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.
     */
    @NotNull public Builder ineligibleRegion(@NotNull Place.Builder place) {
      putValue("ineligibleRegion", place.build());
      return this;
    }
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.
     */
    @NotNull public Builder ineligibleRegion(@NotNull String ineligibleRegion) {
      putValue("ineligibleRegion", ineligibleRegion);
      return this;
    }
    /**
     * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
     */
    @NotNull public Builder eligibleTransactionVolume(@NotNull PriceSpecification priceSpecification) {
      putValue("eligibleTransactionVolume", priceSpecification);
      return this;
    }
    /**
     * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
     */
    @NotNull public Builder eligibleTransactionVolume(@NotNull PriceSpecification.Builder priceSpecification) {
      putValue("eligibleTransactionVolume", priceSpecification.build());
      return this;
    }
    /**
     * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-12.aspx">GTIN-12</a> code of the product, or the product to which the offer refers. The GTIN-12 is the 12-digit GS1 Identification Key composed of a U.P.C. Company Prefix, Item Reference, and Check Digit used to identify trade items. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
     */
    @NotNull public Builder gtin12(@NotNull String gtin12) {
      putValue("gtin12", gtin12);
      return this;
    }
    /**
     * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-13.aspx">GTIN-13</a> code of the product, or the product to which the offer refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former 12-digit UPC codes can be converted into a GTIN-13 code by simply adding a preceeding zero. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
     */
    @NotNull public Builder gtin13(@NotNull String gtin13) {
      putValue("gtin13", gtin13);
      return this;
    }
    /**
     * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-14.aspx">GTIN-14</a> code of the product, or the product to which the offer refers. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
     */
    @NotNull public Builder gtin14(@NotNull String gtin14) {
      putValue("gtin14", gtin14);
      return this;
    }
    /**
     * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-8.aspx">GTIN-8</a> code of the product, or the product to which the offer refers. This code is also known as EAN/UCC-8 or 8-digit EAN. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details.
     */
    @NotNull public Builder gtin8(@NotNull String gtin8) {
      putValue("gtin8", gtin8);
      return this;
    }
    /**
     * This links to a node or nodes indicating the exact quantity of the products included in the offer.
     */
    @NotNull public Builder includesObject(@NotNull TypeAndQuantityNode typeAndQuantityNode) {
      putValue("includesObject", typeAndQuantityNode);
      return this;
    }
    /**
     * This links to a node or nodes indicating the exact quantity of the products included in the offer.
     */
    @NotNull public Builder includesObject(@NotNull TypeAndQuantityNode.Builder typeAndQuantityNode) {
      putValue("includesObject", typeAndQuantityNode.build());
      return this;
    }
    /**
     * The current approximate inventory level for the item or items.
     */
    @NotNull public Builder inventoryLevel(@NotNull QuantitativeValue quantitativeValue) {
      putValue("inventoryLevel", quantitativeValue);
      return this;
    }
    /**
     * The current approximate inventory level for the item or items.
     */
    @NotNull public Builder inventoryLevel(@NotNull QuantitativeValue.Builder quantitativeValue) {
      putValue("inventoryLevel", quantitativeValue.build());
      return this;
    }
    /**
     * A predefined value from OfferItemCondition or a textual description of the condition of the product or service, or the products or services included in the offer.
     */
    @NotNull public Builder itemCondition(@NotNull OfferItemCondition offerItemCondition) {
      putValue("itemCondition", offerItemCondition);
      return this;
    }
    /**
     * A predefined value from OfferItemCondition or a textual description of the condition of the product or service, or the products or services included in the offer.
     */
    @NotNull public Builder itemCondition(@NotNull OfferItemCondition.Builder offerItemCondition) {
      putValue("itemCondition", offerItemCondition.build());
      return this;
    }
    /**
     * The item being offered.
     */
    @NotNull public Builder itemOffered(@NotNull Product product) {
      putValue("itemOffered", product);
      return this;
    }
    /**
     * The item being offered.
     */
    @NotNull public Builder itemOffered(@NotNull Product.Builder product) {
      putValue("itemOffered", product.build());
      return this;
    }
    /**
     * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
     */
    @NotNull public Builder mpn(@NotNull String mpn) {
      putValue("mpn", mpn);
      return this;
    }
    /**
     * One or more detailed price specifications, indicating the unit price and delivery or payment charges.
     */
    @NotNull public Builder priceSpecification(@NotNull PriceSpecification priceSpecification) {
      putValue("priceSpecification", priceSpecification);
      return this;
    }
    /**
     * One or more detailed price specifications, indicating the unit price and delivery or payment charges.
     */
    @NotNull public Builder priceSpecification(@NotNull PriceSpecification.Builder priceSpecification) {
      putValue("priceSpecification", priceSpecification.build());
      return this;
    }
    /**
     * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
     */
    @NotNull public Builder seller(@NotNull Participant participant) {
      putValue("seller", participant);
      return this;
    }
    /**
     * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers.
     */
    @NotNull public Builder sku(@NotNull String sku) {
      putValue("sku", sku);
      return this;
    }
    /**
     * The date when the item becomes valid.
     */
    @NotNull public Builder validFrom(@NotNull java.util.Date date) {
      putValue("validFrom", date);
      return this;
    }
    /**
     * The end of the validity of offer, price specification, or opening hours data.
     */
    @NotNull public Builder validThrough(@NotNull java.util.Date date) {
      putValue("validThrough", date);
      return this;
    }
    /**
     * The warranty promise(s) included in the offer.
     */
    @NotNull public Builder warranty(@NotNull WarrantyPromise warrantyPromise) {
      putValue("warranty", warrantyPromise);
      return this;
    }
    /**
     * The warranty promise(s) included in the offer.
     */
    @NotNull public Builder warranty(@NotNull WarrantyPromise.Builder warrantyPromise) {
      putValue("warranty", warrantyPromise.build());
      return this;
    }
    /**
     * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
     */
    @NotNull public Builder additionalType(@NotNull String additionalType) {
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
     * A short description of the item.
     */
    @NotNull public Builder description(@NotNull String description) {
      putValue("description", description);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described.
     *       <br /><br />
     *       Many (but not all) pages have a fairly clear primary topic, some entity or thing that the page describes. For
     *       example a restaurant's home page might be primarily about that Restaurant, or an event listing page might
     *       represent a single event. The mainEntity and mainEntityOfPage properties allow you to explicitly express the relationship
     *       between the page and the primary entity.
     *       <br /><br />
     * 
     *       Related properties include sameAs, about, and url.
     *       <br /><br />
     * 
     *       The sameAs and url properties are both similar to mainEntityOfPage. The url property should be reserved to refer to more
     *       official or authoritative web pages, such as the item’s official website. The sameAs property also relates a thing
     *       to a page that indirectly identifies it. Whereas sameAs emphasises well known pages, the mainEntityOfPage property
     *       serves more to clarify which of several entities is the main one for that page.
     *       <br /><br />
     * 
     *       mainEntityOfPage can be used for any page, including those not recognized as authoritative for that entity. For example,
     *       for a product, sameAs might refer to a page on the manufacturer’s official site with specs for the product, while
     *       mainEntityOfPage might be used on pages within various retailers’ sites giving details for the same product.
     *       <br /><br />
     * 
     *       about is similar to mainEntity, with two key differences. First, about can refer to multiple entities/topics,
     *       while mainEntity should be used for only the primary one. Second, some pages have a primary entity that itself
     *       describes some other entity. For example, one web page may display a news article about a particular person.
     *       Another page may display a product review for a particular product. In these cases, mainEntity for the pages
     *       should refer to the news article or review, respectively, while about would more properly refer to the person or product.
     *       
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork creativeWork) {
      putValue("mainEntityOfPage", creativeWork);
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described.
     *       <br /><br />
     *       Many (but not all) pages have a fairly clear primary topic, some entity or thing that the page describes. For
     *       example a restaurant's home page might be primarily about that Restaurant, or an event listing page might
     *       represent a single event. The mainEntity and mainEntityOfPage properties allow you to explicitly express the relationship
     *       between the page and the primary entity.
     *       <br /><br />
     * 
     *       Related properties include sameAs, about, and url.
     *       <br /><br />
     * 
     *       The sameAs and url properties are both similar to mainEntityOfPage. The url property should be reserved to refer to more
     *       official or authoritative web pages, such as the item’s official website. The sameAs property also relates a thing
     *       to a page that indirectly identifies it. Whereas sameAs emphasises well known pages, the mainEntityOfPage property
     *       serves more to clarify which of several entities is the main one for that page.
     *       <br /><br />
     * 
     *       mainEntityOfPage can be used for any page, including those not recognized as authoritative for that entity. For example,
     *       for a product, sameAs might refer to a page on the manufacturer’s official site with specs for the product, while
     *       mainEntityOfPage might be used on pages within various retailers’ sites giving details for the same product.
     *       <br /><br />
     * 
     *       about is similar to mainEntity, with two key differences. First, about can refer to multiple entities/topics,
     *       while mainEntity should be used for only the primary one. Second, some pages have a primary entity that itself
     *       describes some other entity. For example, one web page may display a news article about a particular person.
     *       Another page may display a product review for a particular product. In these cases, mainEntity for the pages
     *       should refer to the news article or review, respectively, while about would more properly refer to the person or product.
     *       
     */
    @NotNull public Builder mainEntityOfPage(@NotNull CreativeWork.Builder creativeWork) {
      putValue("mainEntityOfPage", creativeWork.build());
      return this;
    }
    /**
     * Indicates a page (or other CreativeWork) for which this thing is the main entity being described.
     *       <br /><br />
     *       Many (but not all) pages have a fairly clear primary topic, some entity or thing that the page describes. For
     *       example a restaurant's home page might be primarily about that Restaurant, or an event listing page might
     *       represent a single event. The mainEntity and mainEntityOfPage properties allow you to explicitly express the relationship
     *       between the page and the primary entity.
     *       <br /><br />
     * 
     *       Related properties include sameAs, about, and url.
     *       <br /><br />
     * 
     *       The sameAs and url properties are both similar to mainEntityOfPage. The url property should be reserved to refer to more
     *       official or authoritative web pages, such as the item’s official website. The sameAs property also relates a thing
     *       to a page that indirectly identifies it. Whereas sameAs emphasises well known pages, the mainEntityOfPage property
     *       serves more to clarify which of several entities is the main one for that page.
     *       <br /><br />
     * 
     *       mainEntityOfPage can be used for any page, including those not recognized as authoritative for that entity. For example,
     *       for a product, sameAs might refer to a page on the manufacturer’s official site with specs for the product, while
     *       mainEntityOfPage might be used on pages within various retailers’ sites giving details for the same product.
     *       <br /><br />
     * 
     *       about is similar to mainEntity, with two key differences. First, about can refer to multiple entities/topics,
     *       while mainEntity should be used for only the primary one. Second, some pages have a primary entity that itself
     *       describes some other entity. For example, one web page may display a news article about a particular person.
     *       Another page may display a product review for a particular product. In these cases, mainEntity for the pages
     *       should refer to the news article or review, respectively, while about would more properly refer to the person or product.
     *       
     */
    @NotNull public Builder mainEntityOfPage(@NotNull String mainEntityOfPage) {
      putValue("mainEntityOfPage", mainEntityOfPage);
      return this;
    }
    /**
     * The name of the item.
     */
    @NotNull public Builder name(@NotNull String name) {
      putValue("name", name);
      return this;
    }
    /**
     * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website.
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
    @NotNull public Builder id(@NotNull String id) {
      putValue("id", id);
      return this;
    }
    public Builder id(long id) {
      return id(Long.toString(id));
    }
    @Override protected void fromMap(String key, Object value) {
      if ("acceptedPaymentMethod".equals(key) && value instanceof PaymentMethod) { acceptedPaymentMethod((PaymentMethod)value); return; }
      if ("advanceBookingRequirement".equals(key) && value instanceof QuantitativeValue) { advanceBookingRequirement((QuantitativeValue)value); return; }
      if ("availability".equals(key) && value instanceof ItemAvailability) { availability((ItemAvailability)value); return; }
      if ("availabilityEnds".equals(key) && value instanceof java.util.Date) { availabilityEnds((java.util.Date)value); return; }
      if ("availabilityStarts".equals(key) && value instanceof java.util.Date) { availabilityStarts((java.util.Date)value); return; }
      if ("availableAtOrFrom".equals(key) && value instanceof Place) { availableAtOrFrom((Place)value); return; }
      if ("availableDeliveryMethod".equals(key) && value instanceof DeliveryMethod) { availableDeliveryMethod((DeliveryMethod)value); return; }
      if ("businessFunction".equals(key) && value instanceof BusinessFunction) { businessFunction((BusinessFunction)value); return; }
      if ("deliveryLeadTime".equals(key) && value instanceof QuantitativeValue) { deliveryLeadTime((QuantitativeValue)value); return; }
      if ("eligibleCustomerType".equals(key) && value instanceof BusinessEntityType) { eligibleCustomerType((BusinessEntityType)value); return; }
      if ("eligibleDuration".equals(key) && value instanceof QuantitativeValue) { eligibleDuration((QuantitativeValue)value); return; }
      if ("eligibleQuantity".equals(key) && value instanceof QuantitativeValue) { eligibleQuantity((QuantitativeValue)value); return; }
      if ("eligibleRegion".equals(key) && value instanceof GeoShape) { eligibleRegion((GeoShape)value); return; }
      if ("eligibleRegion".equals(key) && value instanceof Place) { eligibleRegion((Place)value); return; }
      if ("eligibleRegion".equals(key) && value instanceof String) { eligibleRegion((String)value); return; }
      if ("ineligibleRegion".equals(key) && value instanceof GeoShape) { ineligibleRegion((GeoShape)value); return; }
      if ("ineligibleRegion".equals(key) && value instanceof Place) { ineligibleRegion((Place)value); return; }
      if ("ineligibleRegion".equals(key) && value instanceof String) { ineligibleRegion((String)value); return; }
      if ("eligibleTransactionVolume".equals(key) && value instanceof PriceSpecification) { eligibleTransactionVolume((PriceSpecification)value); return; }
      if ("gtin12".equals(key) && value instanceof String) { gtin12((String)value); return; }
      if ("gtin13".equals(key) && value instanceof String) { gtin13((String)value); return; }
      if ("gtin14".equals(key) && value instanceof String) { gtin14((String)value); return; }
      if ("gtin8".equals(key) && value instanceof String) { gtin8((String)value); return; }
      if ("includesObject".equals(key) && value instanceof TypeAndQuantityNode) { includesObject((TypeAndQuantityNode)value); return; }
      if ("inventoryLevel".equals(key) && value instanceof QuantitativeValue) { inventoryLevel((QuantitativeValue)value); return; }
      if ("itemCondition".equals(key) && value instanceof OfferItemCondition) { itemCondition((OfferItemCondition)value); return; }
      if ("itemOffered".equals(key) && value instanceof Product) { itemOffered((Product)value); return; }
      if ("mpn".equals(key) && value instanceof String) { mpn((String)value); return; }
      if ("priceSpecification".equals(key) && value instanceof PriceSpecification) { priceSpecification((PriceSpecification)value); return; }
      if ("seller".equals(key) && value instanceof Participant) { seller((Participant)value); return; }
      if ("sku".equals(key) && value instanceof String) { sku((String)value); return; }
      if ("validFrom".equals(key) && value instanceof java.util.Date) { validFrom((java.util.Date)value); return; }
      if ("validThrough".equals(key) && value instanceof java.util.Date) { validThrough((java.util.Date)value); return; }
      if ("warranty".equals(key) && value instanceof WarrantyPromise) { warranty((WarrantyPromise)value); return; }
      super.fromMap(key, value);
    }
  }
  
}
