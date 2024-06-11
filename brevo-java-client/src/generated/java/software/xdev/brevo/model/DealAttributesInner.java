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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * List of attributes
 */
@JsonPropertyOrder({
  DealAttributesInner.JSON_PROPERTY_INTERNAL_NAME,
  DealAttributesInner.JSON_PROPERTY_LABEL,
  DealAttributesInner.JSON_PROPERTY_ATTRIBUTE_TYPE_NAME,
  DealAttributesInner.JSON_PROPERTY_ATTRIBUTE_OPTIONS,
  DealAttributesInner.JSON_PROPERTY_IS_REQUIRED
})
@JsonTypeName("DealAttributes_inner")
public class DealAttributesInner {
  public static final String JSON_PROPERTY_INTERNAL_NAME = "internalName";
  private String internalName;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_ATTRIBUTE_TYPE_NAME = "attributeTypeName";
  private String attributeTypeName;

  public static final String JSON_PROPERTY_ATTRIBUTE_OPTIONS = "attributeOptions";
  private List<Object> attributeOptions = new ArrayList<>();

  public static final String JSON_PROPERTY_IS_REQUIRED = "isRequired";
  private Boolean isRequired;

  public DealAttributesInner() {
  }

  public DealAttributesInner internalName(String internalName) {
    
    this.internalName = internalName;
    return this;
  }

   /**
   * Get internalName
   * @return internalName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERNAL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInternalName() {
    return internalName;
  }


  @JsonProperty(JSON_PROPERTY_INTERNAL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInternalName(String internalName) {
    this.internalName = internalName;
  }

  public DealAttributesInner label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLabel() {
    return label;
  }


  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabel(String label) {
    this.label = label;
  }

  public DealAttributesInner attributeTypeName(String attributeTypeName) {
    
    this.attributeTypeName = attributeTypeName;
    return this;
  }

   /**
   * Get attributeTypeName
   * @return attributeTypeName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTE_TYPE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAttributeTypeName() {
    return attributeTypeName;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIBUTE_TYPE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttributeTypeName(String attributeTypeName) {
    this.attributeTypeName = attributeTypeName;
  }

  public DealAttributesInner attributeOptions(List<Object> attributeOptions) {
    
    this.attributeOptions = attributeOptions;
    return this;
  }

  public DealAttributesInner addAttributeOptionsItem(Object attributeOptionsItem) {
    if (this.attributeOptions == null) {
      this.attributeOptions = new ArrayList<>();
    }
    this.attributeOptions.add(attributeOptionsItem);
    return this;
  }

   /**
   * Get attributeOptions
   * @return attributeOptions
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTE_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getAttributeOptions() {
    return attributeOptions;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIBUTE_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttributeOptions(List<Object> attributeOptions) {
    this.attributeOptions = attributeOptions;
  }

  public DealAttributesInner isRequired(Boolean isRequired) {
    
    this.isRequired = isRequired;
    return this;
  }

   /**
   * Get isRequired
   * @return isRequired
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsRequired() {
    return isRequired;
  }


  @JsonProperty(JSON_PROPERTY_IS_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DealAttributesInner dealAttributesInner = (DealAttributesInner) o;
    return Objects.equals(this.internalName, dealAttributesInner.internalName) &&
        Objects.equals(this.label, dealAttributesInner.label) &&
        Objects.equals(this.attributeTypeName, dealAttributesInner.attributeTypeName) &&
        Objects.equals(this.attributeOptions, dealAttributesInner.attributeOptions) &&
        Objects.equals(this.isRequired, dealAttributesInner.isRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internalName, label, attributeTypeName, attributeOptions, isRequired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DealAttributesInner {\n");
    sb.append("    internalName: ").append(toIndentedString(internalName)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    attributeTypeName: ").append(toIndentedString(attributeTypeName)).append("\n");
    sb.append("    attributeOptions: ").append(toIndentedString(attributeOptions)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
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

    // add `internalName` to the URL query string
    if (getInternalName() != null) {
      try {
        joiner.add(String.format("%sinternalName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInternalName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `label` to the URL query string
    if (getLabel() != null) {
      try {
        joiner.add(String.format("%slabel%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLabel()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `attributeTypeName` to the URL query string
    if (getAttributeTypeName() != null) {
      try {
        joiner.add(String.format("%sattributeTypeName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAttributeTypeName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `attributeOptions` to the URL query string
    if (getAttributeOptions() != null) {
      for (int i = 0; i < getAttributeOptions().size(); i++) {
        try {
          joiner.add(String.format("%sattributeOptions%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getAttributeOptions().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `isRequired` to the URL query string
    if (getIsRequired() != null) {
      try {
        joiner.add(String.format("%sisRequired%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsRequired()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

