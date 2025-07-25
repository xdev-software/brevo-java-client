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
 * CompaniesPostRequest
 */
@JsonPropertyOrder({
  CompaniesPostRequest.JSON_PROPERTY_NAME,
  CompaniesPostRequest.JSON_PROPERTY_ATTRIBUTES,
  CompaniesPostRequest.JSON_PROPERTY_COUNTRY_CODE,
  CompaniesPostRequest.JSON_PROPERTY_LINKED_CONTACTS_IDS,
  CompaniesPostRequest.JSON_PROPERTY_LINKED_DEALS_IDS
})
@JsonTypeName("_companies_post_request")
public class CompaniesPostRequest {
  public static final String JSON_PROPERTY_NAME = "name";
  @jakarta.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  @jakarta.annotation.Nullable
  private Object attributes;

  public static final String JSON_PROPERTY_COUNTRY_CODE = "countryCode";
  @jakarta.annotation.Nullable
  private Long countryCode;

  public static final String JSON_PROPERTY_LINKED_CONTACTS_IDS = "linkedContactsIds";
  @jakarta.annotation.Nullable
  private List<Long> linkedContactsIds = new ArrayList<>();

  public static final String JSON_PROPERTY_LINKED_DEALS_IDS = "linkedDealsIds";
  @jakarta.annotation.Nullable
  private List<String> linkedDealsIds = new ArrayList<>();

  public CompaniesPostRequest() {
  }

  public CompaniesPostRequest name(@jakarta.annotation.Nonnull String name) {
    
    this.name = name;
    return this;
  }

  /**
   * Name of company
   * @return name
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(@jakarta.annotation.Nonnull String name) {
    this.name = name;
  }

  public CompaniesPostRequest attributes(@jakarta.annotation.Nullable Object attributes) {
    
    this.attributes = attributes;
    return this;
  }

  /**
   * Attributes for company creation
   * @return attributes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getAttributes() {
    return attributes;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttributes(@jakarta.annotation.Nullable Object attributes) {
    this.attributes = attributes;
  }

  public CompaniesPostRequest countryCode(@jakarta.annotation.Nullable Long countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Country code if phone_number is passed in attributes.
   * @return countryCode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCountryCode() {
    return countryCode;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountryCode(@jakarta.annotation.Nullable Long countryCode) {
    this.countryCode = countryCode;
  }

  public CompaniesPostRequest linkedContactsIds(@jakarta.annotation.Nullable List<Long> linkedContactsIds) {
    
    this.linkedContactsIds = linkedContactsIds;
    return this;
  }

  public CompaniesPostRequest addLinkedContactsIdsItem(Long linkedContactsIdsItem) {
    if (this.linkedContactsIds == null) {
      this.linkedContactsIds = new ArrayList<>();
    }
    this.linkedContactsIds.add(linkedContactsIdsItem);
    return this;
  }

  /**
   * Contact ids to be linked with company
   * @return linkedContactsIds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_CONTACTS_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getLinkedContactsIds() {
    return linkedContactsIds;
  }


  @JsonProperty(JSON_PROPERTY_LINKED_CONTACTS_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkedContactsIds(@jakarta.annotation.Nullable List<Long> linkedContactsIds) {
    this.linkedContactsIds = linkedContactsIds;
  }

  public CompaniesPostRequest linkedDealsIds(@jakarta.annotation.Nullable List<String> linkedDealsIds) {
    
    this.linkedDealsIds = linkedDealsIds;
    return this;
  }

  public CompaniesPostRequest addLinkedDealsIdsItem(String linkedDealsIdsItem) {
    if (this.linkedDealsIds == null) {
      this.linkedDealsIds = new ArrayList<>();
    }
    this.linkedDealsIds.add(linkedDealsIdsItem);
    return this;
  }

  /**
   * Deal ids to be linked with company
   * @return linkedDealsIds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_DEALS_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getLinkedDealsIds() {
    return linkedDealsIds;
  }


  @JsonProperty(JSON_PROPERTY_LINKED_DEALS_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkedDealsIds(@jakarta.annotation.Nullable List<String> linkedDealsIds) {
    this.linkedDealsIds = linkedDealsIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompaniesPostRequest companiesPostRequest = (CompaniesPostRequest) o;
    return Objects.equals(this.name, companiesPostRequest.name) &&
        Objects.equals(this.attributes, companiesPostRequest.attributes) &&
        Objects.equals(this.countryCode, companiesPostRequest.countryCode) &&
        Objects.equals(this.linkedContactsIds, companiesPostRequest.linkedContactsIds) &&
        Objects.equals(this.linkedDealsIds, companiesPostRequest.linkedDealsIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, attributes, countryCode, linkedContactsIds, linkedDealsIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompaniesPostRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    linkedContactsIds: ").append(toIndentedString(linkedContactsIds)).append("\n");
    sb.append("    linkedDealsIds: ").append(toIndentedString(linkedDealsIds)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `attributes` to the URL query string
    if (getAttributes() != null) {
      try {
        joiner.add(String.format("%sattributes%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAttributes()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `countryCode` to the URL query string
    if (getCountryCode() != null) {
      try {
        joiner.add(String.format("%scountryCode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCountryCode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `linkedContactsIds` to the URL query string
    if (getLinkedContactsIds() != null) {
      for (int i = 0; i < getLinkedContactsIds().size(); i++) {
        try {
          joiner.add(String.format("%slinkedContactsIds%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getLinkedContactsIds().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `linkedDealsIds` to the URL query string
    if (getLinkedDealsIds() != null) {
      for (int i = 0; i < getLinkedDealsIds().size(); i++) {
        try {
          joiner.add(String.format("%slinkedDealsIds%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getLinkedDealsIds().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

