/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * XmlItem
 */
@JsonPropertyOrder({
  XmlItem.JSON_PROPERTY_ATTRIBUTE_STRING,
  XmlItem.JSON_PROPERTY_ATTRIBUTE_NUMBER,
  XmlItem.JSON_PROPERTY_ATTRIBUTE_INTEGER,
  XmlItem.JSON_PROPERTY_ATTRIBUTE_BOOLEAN,
  XmlItem.JSON_PROPERTY_WRAPPED_ARRAY,
  XmlItem.JSON_PROPERTY_NAME_STRING,
  XmlItem.JSON_PROPERTY_NAME_NUMBER,
  XmlItem.JSON_PROPERTY_NAME_INTEGER,
  XmlItem.JSON_PROPERTY_NAME_BOOLEAN,
  XmlItem.JSON_PROPERTY_NAME_ARRAY,
  XmlItem.JSON_PROPERTY_NAME_WRAPPED_ARRAY,
  XmlItem.JSON_PROPERTY_PREFIX_STRING,
  XmlItem.JSON_PROPERTY_PREFIX_NUMBER,
  XmlItem.JSON_PROPERTY_PREFIX_INTEGER,
  XmlItem.JSON_PROPERTY_PREFIX_BOOLEAN,
  XmlItem.JSON_PROPERTY_PREFIX_ARRAY,
  XmlItem.JSON_PROPERTY_PREFIX_WRAPPED_ARRAY,
  XmlItem.JSON_PROPERTY_NAMESPACE_STRING,
  XmlItem.JSON_PROPERTY_NAMESPACE_NUMBER,
  XmlItem.JSON_PROPERTY_NAMESPACE_INTEGER,
  XmlItem.JSON_PROPERTY_NAMESPACE_BOOLEAN,
  XmlItem.JSON_PROPERTY_NAMESPACE_ARRAY,
  XmlItem.JSON_PROPERTY_NAMESPACE_WRAPPED_ARRAY,
  XmlItem.JSON_PROPERTY_PREFIX_NS_STRING,
  XmlItem.JSON_PROPERTY_PREFIX_NS_NUMBER,
  XmlItem.JSON_PROPERTY_PREFIX_NS_INTEGER,
  XmlItem.JSON_PROPERTY_PREFIX_NS_BOOLEAN,
  XmlItem.JSON_PROPERTY_PREFIX_NS_ARRAY,
  XmlItem.JSON_PROPERTY_PREFIX_NS_WRAPPED_ARRAY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen")
public class XmlItem   {
  public static final String JSON_PROPERTY_ATTRIBUTE_STRING = "attribute_string";
  @JsonProperty(JSON_PROPERTY_ATTRIBUTE_STRING)
  private String attributeString;

  public static final String JSON_PROPERTY_ATTRIBUTE_NUMBER = "attribute_number";
  @JsonProperty(JSON_PROPERTY_ATTRIBUTE_NUMBER)
  private BigDecimal attributeNumber;

  public static final String JSON_PROPERTY_ATTRIBUTE_INTEGER = "attribute_integer";
  @JsonProperty(JSON_PROPERTY_ATTRIBUTE_INTEGER)
  private Integer attributeInteger;

  public static final String JSON_PROPERTY_ATTRIBUTE_BOOLEAN = "attribute_boolean";
  @JsonProperty(JSON_PROPERTY_ATTRIBUTE_BOOLEAN)
  private Boolean attributeBoolean;

  public static final String JSON_PROPERTY_WRAPPED_ARRAY = "wrapped_array";
  @JsonProperty(JSON_PROPERTY_WRAPPED_ARRAY)
  private List<Integer> wrappedArray;

  public static final String JSON_PROPERTY_NAME_STRING = "name_string";
  @JsonProperty(JSON_PROPERTY_NAME_STRING)
  private String nameString;

  public static final String JSON_PROPERTY_NAME_NUMBER = "name_number";
  @JsonProperty(JSON_PROPERTY_NAME_NUMBER)
  private BigDecimal nameNumber;

  public static final String JSON_PROPERTY_NAME_INTEGER = "name_integer";
  @JsonProperty(JSON_PROPERTY_NAME_INTEGER)
  private Integer nameInteger;

  public static final String JSON_PROPERTY_NAME_BOOLEAN = "name_boolean";
  @JsonProperty(JSON_PROPERTY_NAME_BOOLEAN)
  private Boolean nameBoolean;

  public static final String JSON_PROPERTY_NAME_ARRAY = "name_array";
  @JsonProperty(JSON_PROPERTY_NAME_ARRAY)
  private List<Integer> nameArray;

  public static final String JSON_PROPERTY_NAME_WRAPPED_ARRAY = "name_wrapped_array";
  @JsonProperty(JSON_PROPERTY_NAME_WRAPPED_ARRAY)
  private List<Integer> nameWrappedArray;

  public static final String JSON_PROPERTY_PREFIX_STRING = "prefix_string";
  @JsonProperty(JSON_PROPERTY_PREFIX_STRING)
  private String prefixString;

  public static final String JSON_PROPERTY_PREFIX_NUMBER = "prefix_number";
  @JsonProperty(JSON_PROPERTY_PREFIX_NUMBER)
  private BigDecimal prefixNumber;

  public static final String JSON_PROPERTY_PREFIX_INTEGER = "prefix_integer";
  @JsonProperty(JSON_PROPERTY_PREFIX_INTEGER)
  private Integer prefixInteger;

  public static final String JSON_PROPERTY_PREFIX_BOOLEAN = "prefix_boolean";
  @JsonProperty(JSON_PROPERTY_PREFIX_BOOLEAN)
  private Boolean prefixBoolean;

  public static final String JSON_PROPERTY_PREFIX_ARRAY = "prefix_array";
  @JsonProperty(JSON_PROPERTY_PREFIX_ARRAY)
  private List<Integer> prefixArray;

  public static final String JSON_PROPERTY_PREFIX_WRAPPED_ARRAY = "prefix_wrapped_array";
  @JsonProperty(JSON_PROPERTY_PREFIX_WRAPPED_ARRAY)
  private List<Integer> prefixWrappedArray;

  public static final String JSON_PROPERTY_NAMESPACE_STRING = "namespace_string";
  @JsonProperty(JSON_PROPERTY_NAMESPACE_STRING)
  private String namespaceString;

  public static final String JSON_PROPERTY_NAMESPACE_NUMBER = "namespace_number";
  @JsonProperty(JSON_PROPERTY_NAMESPACE_NUMBER)
  private BigDecimal namespaceNumber;

  public static final String JSON_PROPERTY_NAMESPACE_INTEGER = "namespace_integer";
  @JsonProperty(JSON_PROPERTY_NAMESPACE_INTEGER)
  private Integer namespaceInteger;

  public static final String JSON_PROPERTY_NAMESPACE_BOOLEAN = "namespace_boolean";
  @JsonProperty(JSON_PROPERTY_NAMESPACE_BOOLEAN)
  private Boolean namespaceBoolean;

  public static final String JSON_PROPERTY_NAMESPACE_ARRAY = "namespace_array";
  @JsonProperty(JSON_PROPERTY_NAMESPACE_ARRAY)
  private List<Integer> namespaceArray;

  public static final String JSON_PROPERTY_NAMESPACE_WRAPPED_ARRAY = "namespace_wrapped_array";
  @JsonProperty(JSON_PROPERTY_NAMESPACE_WRAPPED_ARRAY)
  private List<Integer> namespaceWrappedArray;

  public static final String JSON_PROPERTY_PREFIX_NS_STRING = "prefix_ns_string";
  @JsonProperty(JSON_PROPERTY_PREFIX_NS_STRING)
  private String prefixNsString;

  public static final String JSON_PROPERTY_PREFIX_NS_NUMBER = "prefix_ns_number";
  @JsonProperty(JSON_PROPERTY_PREFIX_NS_NUMBER)
  private BigDecimal prefixNsNumber;

  public static final String JSON_PROPERTY_PREFIX_NS_INTEGER = "prefix_ns_integer";
  @JsonProperty(JSON_PROPERTY_PREFIX_NS_INTEGER)
  private Integer prefixNsInteger;

  public static final String JSON_PROPERTY_PREFIX_NS_BOOLEAN = "prefix_ns_boolean";
  @JsonProperty(JSON_PROPERTY_PREFIX_NS_BOOLEAN)
  private Boolean prefixNsBoolean;

  public static final String JSON_PROPERTY_PREFIX_NS_ARRAY = "prefix_ns_array";
  @JsonProperty(JSON_PROPERTY_PREFIX_NS_ARRAY)
  private List<Integer> prefixNsArray;

  public static final String JSON_PROPERTY_PREFIX_NS_WRAPPED_ARRAY = "prefix_ns_wrapped_array";
  @JsonProperty(JSON_PROPERTY_PREFIX_NS_WRAPPED_ARRAY)
  private List<Integer> prefixNsWrappedArray;

  public XmlItem attributeString(String attributeString) {
    this.attributeString = attributeString;
    return this;
  }

  /**
   * Get attributeString
   * @return attributeString
   **/
  @JsonProperty(value = "attribute_string")
  @ApiModelProperty(example = "string", value = "")
  
  public String getAttributeString() {
    return attributeString;
  }

  public void setAttributeString(String attributeString) {
    this.attributeString = attributeString;
  }

  public XmlItem attributeNumber(BigDecimal attributeNumber) {
    this.attributeNumber = attributeNumber;
    return this;
  }

  /**
   * Get attributeNumber
   * @return attributeNumber
   **/
  @JsonProperty(value = "attribute_number")
  @ApiModelProperty(example = "1.234", value = "")
  @Valid 
  public BigDecimal getAttributeNumber() {
    return attributeNumber;
  }

  public void setAttributeNumber(BigDecimal attributeNumber) {
    this.attributeNumber = attributeNumber;
  }

  public XmlItem attributeInteger(Integer attributeInteger) {
    this.attributeInteger = attributeInteger;
    return this;
  }

  /**
   * Get attributeInteger
   * @return attributeInteger
   **/
  @JsonProperty(value = "attribute_integer")
  @ApiModelProperty(example = "-2", value = "")
  
  public Integer getAttributeInteger() {
    return attributeInteger;
  }

  public void setAttributeInteger(Integer attributeInteger) {
    this.attributeInteger = attributeInteger;
  }

  public XmlItem attributeBoolean(Boolean attributeBoolean) {
    this.attributeBoolean = attributeBoolean;
    return this;
  }

  /**
   * Get attributeBoolean
   * @return attributeBoolean
   **/
  @JsonProperty(value = "attribute_boolean")
  @ApiModelProperty(example = "true", value = "")
  
  public Boolean getAttributeBoolean() {
    return attributeBoolean;
  }

  public void setAttributeBoolean(Boolean attributeBoolean) {
    this.attributeBoolean = attributeBoolean;
  }

  public XmlItem wrappedArray(List<Integer> wrappedArray) {
    this.wrappedArray = wrappedArray;
    return this;
  }

  public XmlItem addWrappedArrayItem(Integer wrappedArrayItem) {
    if (this.wrappedArray == null) {
      this.wrappedArray = new ArrayList<>();
    }
    this.wrappedArray.add(wrappedArrayItem);
    return this;
  }

  /**
   * Get wrappedArray
   * @return wrappedArray
   **/
  @JsonProperty(value = "wrapped_array")
  @ApiModelProperty(value = "")
  
  public List<Integer> getWrappedArray() {
    return wrappedArray;
  }

  public void setWrappedArray(List<Integer> wrappedArray) {
    this.wrappedArray = wrappedArray;
  }

  public XmlItem nameString(String nameString) {
    this.nameString = nameString;
    return this;
  }

  /**
   * Get nameString
   * @return nameString
   **/
  @JsonProperty(value = "name_string")
  @ApiModelProperty(example = "string", value = "")
  
  public String getNameString() {
    return nameString;
  }

  public void setNameString(String nameString) {
    this.nameString = nameString;
  }

  public XmlItem nameNumber(BigDecimal nameNumber) {
    this.nameNumber = nameNumber;
    return this;
  }

  /**
   * Get nameNumber
   * @return nameNumber
   **/
  @JsonProperty(value = "name_number")
  @ApiModelProperty(example = "1.234", value = "")
  @Valid 
  public BigDecimal getNameNumber() {
    return nameNumber;
  }

  public void setNameNumber(BigDecimal nameNumber) {
    this.nameNumber = nameNumber;
  }

  public XmlItem nameInteger(Integer nameInteger) {
    this.nameInteger = nameInteger;
    return this;
  }

  /**
   * Get nameInteger
   * @return nameInteger
   **/
  @JsonProperty(value = "name_integer")
  @ApiModelProperty(example = "-2", value = "")
  
  public Integer getNameInteger() {
    return nameInteger;
  }

  public void setNameInteger(Integer nameInteger) {
    this.nameInteger = nameInteger;
  }

  public XmlItem nameBoolean(Boolean nameBoolean) {
    this.nameBoolean = nameBoolean;
    return this;
  }

  /**
   * Get nameBoolean
   * @return nameBoolean
   **/
  @JsonProperty(value = "name_boolean")
  @ApiModelProperty(example = "true", value = "")
  
  public Boolean getNameBoolean() {
    return nameBoolean;
  }

  public void setNameBoolean(Boolean nameBoolean) {
    this.nameBoolean = nameBoolean;
  }

  public XmlItem nameArray(List<Integer> nameArray) {
    this.nameArray = nameArray;
    return this;
  }

  public XmlItem addNameArrayItem(Integer nameArrayItem) {
    if (this.nameArray == null) {
      this.nameArray = new ArrayList<>();
    }
    this.nameArray.add(nameArrayItem);
    return this;
  }

  /**
   * Get nameArray
   * @return nameArray
   **/
  @JsonProperty(value = "name_array")
  @ApiModelProperty(value = "")
  
  public List<Integer> getNameArray() {
    return nameArray;
  }

  public void setNameArray(List<Integer> nameArray) {
    this.nameArray = nameArray;
  }

  public XmlItem nameWrappedArray(List<Integer> nameWrappedArray) {
    this.nameWrappedArray = nameWrappedArray;
    return this;
  }

  public XmlItem addNameWrappedArrayItem(Integer nameWrappedArrayItem) {
    if (this.nameWrappedArray == null) {
      this.nameWrappedArray = new ArrayList<>();
    }
    this.nameWrappedArray.add(nameWrappedArrayItem);
    return this;
  }

  /**
   * Get nameWrappedArray
   * @return nameWrappedArray
   **/
  @JsonProperty(value = "name_wrapped_array")
  @ApiModelProperty(value = "")
  
  public List<Integer> getNameWrappedArray() {
    return nameWrappedArray;
  }

  public void setNameWrappedArray(List<Integer> nameWrappedArray) {
    this.nameWrappedArray = nameWrappedArray;
  }

  public XmlItem prefixString(String prefixString) {
    this.prefixString = prefixString;
    return this;
  }

  /**
   * Get prefixString
   * @return prefixString
   **/
  @JsonProperty(value = "prefix_string")
  @ApiModelProperty(example = "string", value = "")
  
  public String getPrefixString() {
    return prefixString;
  }

  public void setPrefixString(String prefixString) {
    this.prefixString = prefixString;
  }

  public XmlItem prefixNumber(BigDecimal prefixNumber) {
    this.prefixNumber = prefixNumber;
    return this;
  }

  /**
   * Get prefixNumber
   * @return prefixNumber
   **/
  @JsonProperty(value = "prefix_number")
  @ApiModelProperty(example = "1.234", value = "")
  @Valid 
  public BigDecimal getPrefixNumber() {
    return prefixNumber;
  }

  public void setPrefixNumber(BigDecimal prefixNumber) {
    this.prefixNumber = prefixNumber;
  }

  public XmlItem prefixInteger(Integer prefixInteger) {
    this.prefixInteger = prefixInteger;
    return this;
  }

  /**
   * Get prefixInteger
   * @return prefixInteger
   **/
  @JsonProperty(value = "prefix_integer")
  @ApiModelProperty(example = "-2", value = "")
  
  public Integer getPrefixInteger() {
    return prefixInteger;
  }

  public void setPrefixInteger(Integer prefixInteger) {
    this.prefixInteger = prefixInteger;
  }

  public XmlItem prefixBoolean(Boolean prefixBoolean) {
    this.prefixBoolean = prefixBoolean;
    return this;
  }

  /**
   * Get prefixBoolean
   * @return prefixBoolean
   **/
  @JsonProperty(value = "prefix_boolean")
  @ApiModelProperty(example = "true", value = "")
  
  public Boolean getPrefixBoolean() {
    return prefixBoolean;
  }

  public void setPrefixBoolean(Boolean prefixBoolean) {
    this.prefixBoolean = prefixBoolean;
  }

  public XmlItem prefixArray(List<Integer> prefixArray) {
    this.prefixArray = prefixArray;
    return this;
  }

  public XmlItem addPrefixArrayItem(Integer prefixArrayItem) {
    if (this.prefixArray == null) {
      this.prefixArray = new ArrayList<>();
    }
    this.prefixArray.add(prefixArrayItem);
    return this;
  }

  /**
   * Get prefixArray
   * @return prefixArray
   **/
  @JsonProperty(value = "prefix_array")
  @ApiModelProperty(value = "")
  
  public List<Integer> getPrefixArray() {
    return prefixArray;
  }

  public void setPrefixArray(List<Integer> prefixArray) {
    this.prefixArray = prefixArray;
  }

  public XmlItem prefixWrappedArray(List<Integer> prefixWrappedArray) {
    this.prefixWrappedArray = prefixWrappedArray;
    return this;
  }

  public XmlItem addPrefixWrappedArrayItem(Integer prefixWrappedArrayItem) {
    if (this.prefixWrappedArray == null) {
      this.prefixWrappedArray = new ArrayList<>();
    }
    this.prefixWrappedArray.add(prefixWrappedArrayItem);
    return this;
  }

  /**
   * Get prefixWrappedArray
   * @return prefixWrappedArray
   **/
  @JsonProperty(value = "prefix_wrapped_array")
  @ApiModelProperty(value = "")
  
  public List<Integer> getPrefixWrappedArray() {
    return prefixWrappedArray;
  }

  public void setPrefixWrappedArray(List<Integer> prefixWrappedArray) {
    this.prefixWrappedArray = prefixWrappedArray;
  }

  public XmlItem namespaceString(String namespaceString) {
    this.namespaceString = namespaceString;
    return this;
  }

  /**
   * Get namespaceString
   * @return namespaceString
   **/
  @JsonProperty(value = "namespace_string")
  @ApiModelProperty(example = "string", value = "")
  
  public String getNamespaceString() {
    return namespaceString;
  }

  public void setNamespaceString(String namespaceString) {
    this.namespaceString = namespaceString;
  }

  public XmlItem namespaceNumber(BigDecimal namespaceNumber) {
    this.namespaceNumber = namespaceNumber;
    return this;
  }

  /**
   * Get namespaceNumber
   * @return namespaceNumber
   **/
  @JsonProperty(value = "namespace_number")
  @ApiModelProperty(example = "1.234", value = "")
  @Valid 
  public BigDecimal getNamespaceNumber() {
    return namespaceNumber;
  }

  public void setNamespaceNumber(BigDecimal namespaceNumber) {
    this.namespaceNumber = namespaceNumber;
  }

  public XmlItem namespaceInteger(Integer namespaceInteger) {
    this.namespaceInteger = namespaceInteger;
    return this;
  }

  /**
   * Get namespaceInteger
   * @return namespaceInteger
   **/
  @JsonProperty(value = "namespace_integer")
  @ApiModelProperty(example = "-2", value = "")
  
  public Integer getNamespaceInteger() {
    return namespaceInteger;
  }

  public void setNamespaceInteger(Integer namespaceInteger) {
    this.namespaceInteger = namespaceInteger;
  }

  public XmlItem namespaceBoolean(Boolean namespaceBoolean) {
    this.namespaceBoolean = namespaceBoolean;
    return this;
  }

  /**
   * Get namespaceBoolean
   * @return namespaceBoolean
   **/
  @JsonProperty(value = "namespace_boolean")
  @ApiModelProperty(example = "true", value = "")
  
  public Boolean getNamespaceBoolean() {
    return namespaceBoolean;
  }

  public void setNamespaceBoolean(Boolean namespaceBoolean) {
    this.namespaceBoolean = namespaceBoolean;
  }

  public XmlItem namespaceArray(List<Integer> namespaceArray) {
    this.namespaceArray = namespaceArray;
    return this;
  }

  public XmlItem addNamespaceArrayItem(Integer namespaceArrayItem) {
    if (this.namespaceArray == null) {
      this.namespaceArray = new ArrayList<>();
    }
    this.namespaceArray.add(namespaceArrayItem);
    return this;
  }

  /**
   * Get namespaceArray
   * @return namespaceArray
   **/
  @JsonProperty(value = "namespace_array")
  @ApiModelProperty(value = "")
  
  public List<Integer> getNamespaceArray() {
    return namespaceArray;
  }

  public void setNamespaceArray(List<Integer> namespaceArray) {
    this.namespaceArray = namespaceArray;
  }

  public XmlItem namespaceWrappedArray(List<Integer> namespaceWrappedArray) {
    this.namespaceWrappedArray = namespaceWrappedArray;
    return this;
  }

  public XmlItem addNamespaceWrappedArrayItem(Integer namespaceWrappedArrayItem) {
    if (this.namespaceWrappedArray == null) {
      this.namespaceWrappedArray = new ArrayList<>();
    }
    this.namespaceWrappedArray.add(namespaceWrappedArrayItem);
    return this;
  }

  /**
   * Get namespaceWrappedArray
   * @return namespaceWrappedArray
   **/
  @JsonProperty(value = "namespace_wrapped_array")
  @ApiModelProperty(value = "")
  
  public List<Integer> getNamespaceWrappedArray() {
    return namespaceWrappedArray;
  }

  public void setNamespaceWrappedArray(List<Integer> namespaceWrappedArray) {
    this.namespaceWrappedArray = namespaceWrappedArray;
  }

  public XmlItem prefixNsString(String prefixNsString) {
    this.prefixNsString = prefixNsString;
    return this;
  }

  /**
   * Get prefixNsString
   * @return prefixNsString
   **/
  @JsonProperty(value = "prefix_ns_string")
  @ApiModelProperty(example = "string", value = "")
  
  public String getPrefixNsString() {
    return prefixNsString;
  }

  public void setPrefixNsString(String prefixNsString) {
    this.prefixNsString = prefixNsString;
  }

  public XmlItem prefixNsNumber(BigDecimal prefixNsNumber) {
    this.prefixNsNumber = prefixNsNumber;
    return this;
  }

  /**
   * Get prefixNsNumber
   * @return prefixNsNumber
   **/
  @JsonProperty(value = "prefix_ns_number")
  @ApiModelProperty(example = "1.234", value = "")
  @Valid 
  public BigDecimal getPrefixNsNumber() {
    return prefixNsNumber;
  }

  public void setPrefixNsNumber(BigDecimal prefixNsNumber) {
    this.prefixNsNumber = prefixNsNumber;
  }

  public XmlItem prefixNsInteger(Integer prefixNsInteger) {
    this.prefixNsInteger = prefixNsInteger;
    return this;
  }

  /**
   * Get prefixNsInteger
   * @return prefixNsInteger
   **/
  @JsonProperty(value = "prefix_ns_integer")
  @ApiModelProperty(example = "-2", value = "")
  
  public Integer getPrefixNsInteger() {
    return prefixNsInteger;
  }

  public void setPrefixNsInteger(Integer prefixNsInteger) {
    this.prefixNsInteger = prefixNsInteger;
  }

  public XmlItem prefixNsBoolean(Boolean prefixNsBoolean) {
    this.prefixNsBoolean = prefixNsBoolean;
    return this;
  }

  /**
   * Get prefixNsBoolean
   * @return prefixNsBoolean
   **/
  @JsonProperty(value = "prefix_ns_boolean")
  @ApiModelProperty(example = "true", value = "")
  
  public Boolean getPrefixNsBoolean() {
    return prefixNsBoolean;
  }

  public void setPrefixNsBoolean(Boolean prefixNsBoolean) {
    this.prefixNsBoolean = prefixNsBoolean;
  }

  public XmlItem prefixNsArray(List<Integer> prefixNsArray) {
    this.prefixNsArray = prefixNsArray;
    return this;
  }

  public XmlItem addPrefixNsArrayItem(Integer prefixNsArrayItem) {
    if (this.prefixNsArray == null) {
      this.prefixNsArray = new ArrayList<>();
    }
    this.prefixNsArray.add(prefixNsArrayItem);
    return this;
  }

  /**
   * Get prefixNsArray
   * @return prefixNsArray
   **/
  @JsonProperty(value = "prefix_ns_array")
  @ApiModelProperty(value = "")
  
  public List<Integer> getPrefixNsArray() {
    return prefixNsArray;
  }

  public void setPrefixNsArray(List<Integer> prefixNsArray) {
    this.prefixNsArray = prefixNsArray;
  }

  public XmlItem prefixNsWrappedArray(List<Integer> prefixNsWrappedArray) {
    this.prefixNsWrappedArray = prefixNsWrappedArray;
    return this;
  }

  public XmlItem addPrefixNsWrappedArrayItem(Integer prefixNsWrappedArrayItem) {
    if (this.prefixNsWrappedArray == null) {
      this.prefixNsWrappedArray = new ArrayList<>();
    }
    this.prefixNsWrappedArray.add(prefixNsWrappedArrayItem);
    return this;
  }

  /**
   * Get prefixNsWrappedArray
   * @return prefixNsWrappedArray
   **/
  @JsonProperty(value = "prefix_ns_wrapped_array")
  @ApiModelProperty(value = "")
  
  public List<Integer> getPrefixNsWrappedArray() {
    return prefixNsWrappedArray;
  }

  public void setPrefixNsWrappedArray(List<Integer> prefixNsWrappedArray) {
    this.prefixNsWrappedArray = prefixNsWrappedArray;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlItem xmlItem = (XmlItem) o;
    return Objects.equals(this.attributeString, xmlItem.attributeString) &&
        Objects.equals(this.attributeNumber, xmlItem.attributeNumber) &&
        Objects.equals(this.attributeInteger, xmlItem.attributeInteger) &&
        Objects.equals(this.attributeBoolean, xmlItem.attributeBoolean) &&
        Objects.equals(this.wrappedArray, xmlItem.wrappedArray) &&
        Objects.equals(this.nameString, xmlItem.nameString) &&
        Objects.equals(this.nameNumber, xmlItem.nameNumber) &&
        Objects.equals(this.nameInteger, xmlItem.nameInteger) &&
        Objects.equals(this.nameBoolean, xmlItem.nameBoolean) &&
        Objects.equals(this.nameArray, xmlItem.nameArray) &&
        Objects.equals(this.nameWrappedArray, xmlItem.nameWrappedArray) &&
        Objects.equals(this.prefixString, xmlItem.prefixString) &&
        Objects.equals(this.prefixNumber, xmlItem.prefixNumber) &&
        Objects.equals(this.prefixInteger, xmlItem.prefixInteger) &&
        Objects.equals(this.prefixBoolean, xmlItem.prefixBoolean) &&
        Objects.equals(this.prefixArray, xmlItem.prefixArray) &&
        Objects.equals(this.prefixWrappedArray, xmlItem.prefixWrappedArray) &&
        Objects.equals(this.namespaceString, xmlItem.namespaceString) &&
        Objects.equals(this.namespaceNumber, xmlItem.namespaceNumber) &&
        Objects.equals(this.namespaceInteger, xmlItem.namespaceInteger) &&
        Objects.equals(this.namespaceBoolean, xmlItem.namespaceBoolean) &&
        Objects.equals(this.namespaceArray, xmlItem.namespaceArray) &&
        Objects.equals(this.namespaceWrappedArray, xmlItem.namespaceWrappedArray) &&
        Objects.equals(this.prefixNsString, xmlItem.prefixNsString) &&
        Objects.equals(this.prefixNsNumber, xmlItem.prefixNsNumber) &&
        Objects.equals(this.prefixNsInteger, xmlItem.prefixNsInteger) &&
        Objects.equals(this.prefixNsBoolean, xmlItem.prefixNsBoolean) &&
        Objects.equals(this.prefixNsArray, xmlItem.prefixNsArray) &&
        Objects.equals(this.prefixNsWrappedArray, xmlItem.prefixNsWrappedArray);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeString, attributeNumber, attributeInteger, attributeBoolean, wrappedArray, nameString, nameNumber, nameInteger, nameBoolean, nameArray, nameWrappedArray, prefixString, prefixNumber, prefixInteger, prefixBoolean, prefixArray, prefixWrappedArray, namespaceString, namespaceNumber, namespaceInteger, namespaceBoolean, namespaceArray, namespaceWrappedArray, prefixNsString, prefixNsNumber, prefixNsInteger, prefixNsBoolean, prefixNsArray, prefixNsWrappedArray);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlItem {\n");
    
    sb.append("    attributeString: ").append(toIndentedString(attributeString)).append("\n");
    sb.append("    attributeNumber: ").append(toIndentedString(attributeNumber)).append("\n");
    sb.append("    attributeInteger: ").append(toIndentedString(attributeInteger)).append("\n");
    sb.append("    attributeBoolean: ").append(toIndentedString(attributeBoolean)).append("\n");
    sb.append("    wrappedArray: ").append(toIndentedString(wrappedArray)).append("\n");
    sb.append("    nameString: ").append(toIndentedString(nameString)).append("\n");
    sb.append("    nameNumber: ").append(toIndentedString(nameNumber)).append("\n");
    sb.append("    nameInteger: ").append(toIndentedString(nameInteger)).append("\n");
    sb.append("    nameBoolean: ").append(toIndentedString(nameBoolean)).append("\n");
    sb.append("    nameArray: ").append(toIndentedString(nameArray)).append("\n");
    sb.append("    nameWrappedArray: ").append(toIndentedString(nameWrappedArray)).append("\n");
    sb.append("    prefixString: ").append(toIndentedString(prefixString)).append("\n");
    sb.append("    prefixNumber: ").append(toIndentedString(prefixNumber)).append("\n");
    sb.append("    prefixInteger: ").append(toIndentedString(prefixInteger)).append("\n");
    sb.append("    prefixBoolean: ").append(toIndentedString(prefixBoolean)).append("\n");
    sb.append("    prefixArray: ").append(toIndentedString(prefixArray)).append("\n");
    sb.append("    prefixWrappedArray: ").append(toIndentedString(prefixWrappedArray)).append("\n");
    sb.append("    namespaceString: ").append(toIndentedString(namespaceString)).append("\n");
    sb.append("    namespaceNumber: ").append(toIndentedString(namespaceNumber)).append("\n");
    sb.append("    namespaceInteger: ").append(toIndentedString(namespaceInteger)).append("\n");
    sb.append("    namespaceBoolean: ").append(toIndentedString(namespaceBoolean)).append("\n");
    sb.append("    namespaceArray: ").append(toIndentedString(namespaceArray)).append("\n");
    sb.append("    namespaceWrappedArray: ").append(toIndentedString(namespaceWrappedArray)).append("\n");
    sb.append("    prefixNsString: ").append(toIndentedString(prefixNsString)).append("\n");
    sb.append("    prefixNsNumber: ").append(toIndentedString(prefixNsNumber)).append("\n");
    sb.append("    prefixNsInteger: ").append(toIndentedString(prefixNsInteger)).append("\n");
    sb.append("    prefixNsBoolean: ").append(toIndentedString(prefixNsBoolean)).append("\n");
    sb.append("    prefixNsArray: ").append(toIndentedString(prefixNsArray)).append("\n");
    sb.append("    prefixNsWrappedArray: ").append(toIndentedString(prefixNsWrappedArray)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

