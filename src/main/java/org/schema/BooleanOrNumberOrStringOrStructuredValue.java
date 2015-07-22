/*
 * Copyright 2015 JetBrains s.r.o.
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

@com.fasterxml.jackson.databind.annotation.JsonSerialize(include = com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_NULL)
class BooleanOrNumberOrStringOrStructuredValue {
  @com.fasterxml.jackson.annotation.JsonValue
  public Object getJsonLdValue() {
    if (myBoolean != null) return myBoolean;
    if (myNumber != null) return myNumber;
    if (myString != null) return myString;
    if (myStructuredValue != null) return myStructuredValue;
    return null;
  }
  public Thing getThing() {
    if (myStructuredValue != null) return myStructuredValue;
    return null;
  }
  public void setBoolean(Boolean value) { clear(); myBoolean = value; }
  public Boolean getBoolean() { return myBoolean; }
  private Boolean myBoolean;
  public void setNumber(Number number) { clear(); myNumber = number; }
  public Number getNumber() { return myNumber; }
  private Number myNumber;
  public void setString(String value) { clear(); myString = value; }
  public String getString() { return myString; }
  private String myString;
  public void setStructuredValue(StructuredValue structuredValue) { clear(); myStructuredValue = structuredValue; }
  public StructuredValue getStructuredValue() { return myStructuredValue; }
  private StructuredValue myStructuredValue;
  private void clear() {
    myBoolean = null;
    myNumber = null;
    myString = null;
    myStructuredValue = null;
  }
}