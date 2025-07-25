/*
 * Brevo API
 * Brevo API documentation by XDEV Software based on https://api.brevo.com/v3/swagger_definition_v3.yml
 *
 * The version of the OpenAPI document: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package software.xdev.brevo.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import software.xdev.brevo.model.UpdateAttributeEnumerationInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * UpdateAttribute
 */
@JsonPropertyOrder({
  UpdateAttribute.JSON_PROPERTY_VALUE,
  UpdateAttribute.JSON_PROPERTY_ENUMERATION,
  UpdateAttribute.JSON_PROPERTY_MULTI_CATEGORY_OPTIONS
})
@JsonTypeName("updateAttribute")
public class UpdateAttribute {
  public static final String JSON_PROPERTY_VALUE = "value";
  @jakarta.annotation.Nullable
  private String value;

  public static final String JSON_PROPERTY_ENUMERATION = "enumeration";
  @jakarta.annotation.Nullable
  private List<UpdateAttributeEnumerationInner> enumeration = new ArrayList<>();

  public static final String JSON_PROPERTY_MULTI_CATEGORY_OPTIONS = "multiCategoryOptions";
  @jakarta.annotation.Nullable
  private List<String> multiCategoryOptions = new ArrayList<>();

  public UpdateAttribute() {
  }

  public UpdateAttribute value(@jakarta.annotation.Nullable String value) {
    
    this.value = value;
    return this;
  }

  /**
   * Value of the attribute to update. **Use only if the attribute&#39;s category is &#39;calculated&#39; or &#39;global&#39;** 
   * @return value
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(@jakarta.annotation.Nullable String value) {
    this.value = value;
  }

  public UpdateAttribute enumeration(@jakarta.annotation.Nullable List<UpdateAttributeEnumerationInner> enumeration) {
    
    this.enumeration = enumeration;
    return this;
  }

  public UpdateAttribute addEnumerationItem(UpdateAttributeEnumerationInner enumerationItem) {
    if (this.enumeration == null) {
      this.enumeration = new ArrayList<>();
    }
    this.enumeration.add(enumerationItem);
    return this;
  }

  /**
   * List of the values and labels that the attribute can take. **Use only if the attribute&#39;s category is \&quot;category\&quot;**. None of the category options can exceed max 200 characters. For example, **[{\&quot;value\&quot;:1, \&quot;label\&quot;:\&quot;male\&quot;}, {\&quot;value\&quot;:2, \&quot;label\&quot;:\&quot;female\&quot;}]** 
   * @return enumeration
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENUMERATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UpdateAttributeEnumerationInner> getEnumeration() {
    return enumeration;
  }


  @JsonProperty(JSON_PROPERTY_ENUMERATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnumeration(@jakarta.annotation.Nullable List<UpdateAttributeEnumerationInner> enumeration) {
    this.enumeration = enumeration;
  }

  public UpdateAttribute multiCategoryOptions(@jakarta.annotation.Nullable List<String> multiCategoryOptions) {
    
    this.multiCategoryOptions = multiCategoryOptions;
    return this;
  }

  public UpdateAttribute addMultiCategoryOptionsItem(String multiCategoryOptionsItem) {
    if (this.multiCategoryOptions == null) {
      this.multiCategoryOptions = new ArrayList<>();
    }
    this.multiCategoryOptions.add(multiCategoryOptionsItem);
    return this;
  }

  /**
   * Use this option to add multiple-choice attributes options only if the attribute&#39;s category is \&quot;normal\&quot;. **This option is specifically designed for updating multiple-choice attributes. None of the multicategory options can exceed max 200 characters.** For example: **[\&quot;USA\&quot;,\&quot;INDIA\&quot;]** 
   * @return multiCategoryOptions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MULTI_CATEGORY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getMultiCategoryOptions() {
    return multiCategoryOptions;
  }


  @JsonProperty(JSON_PROPERTY_MULTI_CATEGORY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMultiCategoryOptions(@jakarta.annotation.Nullable List<String> multiCategoryOptions) {
    this.multiCategoryOptions = multiCategoryOptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAttribute updateAttribute = (UpdateAttribute) o;
    return Objects.equals(this.value, updateAttribute.value) &&
        Objects.equals(this.enumeration, updateAttribute.enumeration) &&
        Objects.equals(this.multiCategoryOptions, updateAttribute.multiCategoryOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, enumeration, multiCategoryOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAttribute {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    enumeration: ").append(toIndentedString(enumeration)).append("\n");
    sb.append("    multiCategoryOptions: ").append(toIndentedString(multiCategoryOptions)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `value` to the URL query string
    if (getValue() != null) {
      try {
        joiner.add(String.format("%svalue%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getValue()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `enumeration` to the URL query string
    if (getEnumeration() != null) {
      for (int i = 0; i < getEnumeration().size(); i++) {
        if (getEnumeration().get(i) != null) {
          joiner.add(getEnumeration().get(i).toUrlQueryString(String.format("%senumeration%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `multiCategoryOptions` to the URL query string
    if (getMultiCategoryOptions() != null) {
      for (int i = 0; i < getMultiCategoryOptions().size(); i++) {
        try {
          joiner.add(String.format("%smultiCategoryOptions%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getMultiCategoryOptions().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

