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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Subscription
 */
@JsonPropertyOrder({
  Subscription.JSON_PROPERTY_CONTACT_ID,
  Subscription.JSON_PROPERTY_CREATED_AT,
  Subscription.JSON_PROPERTY_LOYALTY_PROGRAM_ID,
  Subscription.JSON_PROPERTY_LOYALTY_SUBSCRIPTION_ID,
  Subscription.JSON_PROPERTY_ORGANIZATION_ID,
  Subscription.JSON_PROPERTY_UPDATED_AT,
  Subscription.JSON_PROPERTY_VERSION_ID
})
@JsonTypeName("subscription")
public class Subscription {
  public static final String JSON_PROPERTY_CONTACT_ID = "contactId";
  @jakarta.annotation.Nullable
  private Integer contactId;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  @jakarta.annotation.Nullable
  private String createdAt;

  public static final String JSON_PROPERTY_LOYALTY_PROGRAM_ID = "loyaltyProgramId";
  @jakarta.annotation.Nullable
  private String loyaltyProgramId;

  public static final String JSON_PROPERTY_LOYALTY_SUBSCRIPTION_ID = "loyaltySubscriptionId";
  @jakarta.annotation.Nullable
  private String loyaltySubscriptionId;

  public static final String JSON_PROPERTY_ORGANIZATION_ID = "organizationId";
  @jakarta.annotation.Nullable
  private Integer organizationId;

  public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
  @jakarta.annotation.Nullable
  private String updatedAt;

  public static final String JSON_PROPERTY_VERSION_ID = "versionId";
  @jakarta.annotation.Nullable
  private Integer versionId;

  public Subscription() {
  }

  public Subscription contactId(@jakarta.annotation.Nullable Integer contactId) {
    
    this.contactId = contactId;
    return this;
  }

  /**
   * Unique identifier of the contact.
   * @return contactId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTACT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getContactId() {
    return contactId;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContactId(@jakarta.annotation.Nullable Integer contactId) {
    this.contactId = contactId;
  }

  public Subscription createdAt(@jakarta.annotation.Nullable String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp when the subscription was created.
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(@jakarta.annotation.Nullable String createdAt) {
    this.createdAt = createdAt;
  }

  public Subscription loyaltyProgramId(@jakarta.annotation.Nullable String loyaltyProgramId) {
    
    this.loyaltyProgramId = loyaltyProgramId;
    return this;
  }

  /**
   * Unique identifier of the loyalty program.
   * @return loyaltyProgramId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOYALTY_PROGRAM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLoyaltyProgramId() {
    return loyaltyProgramId;
  }


  @JsonProperty(JSON_PROPERTY_LOYALTY_PROGRAM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoyaltyProgramId(@jakarta.annotation.Nullable String loyaltyProgramId) {
    this.loyaltyProgramId = loyaltyProgramId;
  }

  public Subscription loyaltySubscriptionId(@jakarta.annotation.Nullable String loyaltySubscriptionId) {
    
    this.loyaltySubscriptionId = loyaltySubscriptionId;
    return this;
  }

  /**
   * Unique identifier of the subscription.
   * @return loyaltySubscriptionId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOYALTY_SUBSCRIPTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLoyaltySubscriptionId() {
    return loyaltySubscriptionId;
  }


  @JsonProperty(JSON_PROPERTY_LOYALTY_SUBSCRIPTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoyaltySubscriptionId(@jakarta.annotation.Nullable String loyaltySubscriptionId) {
    this.loyaltySubscriptionId = loyaltySubscriptionId;
  }

  public Subscription organizationId(@jakarta.annotation.Nullable Integer organizationId) {
    
    this.organizationId = organizationId;
    return this;
  }

  /**
   * Unique identifier of the organization.
   * @return organizationId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORGANIZATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOrganizationId() {
    return organizationId;
  }


  @JsonProperty(JSON_PROPERTY_ORGANIZATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrganizationId(@jakarta.annotation.Nullable Integer organizationId) {
    this.organizationId = organizationId;
  }

  public Subscription updatedAt(@jakarta.annotation.Nullable String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Timestamp when the subscription was last updated.
   * @return updatedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(@jakarta.annotation.Nullable String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Subscription versionId(@jakarta.annotation.Nullable Integer versionId) {
    
    this.versionId = versionId;
    return this;
  }

  /**
   * Version number of the subscription.
   * @return versionId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersionId() {
    return versionId;
  }


  @JsonProperty(JSON_PROPERTY_VERSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersionId(@jakarta.annotation.Nullable Integer versionId) {
    this.versionId = versionId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subscription subscription = (Subscription) o;
    return Objects.equals(this.contactId, subscription.contactId) &&
        Objects.equals(this.createdAt, subscription.createdAt) &&
        Objects.equals(this.loyaltyProgramId, subscription.loyaltyProgramId) &&
        Objects.equals(this.loyaltySubscriptionId, subscription.loyaltySubscriptionId) &&
        Objects.equals(this.organizationId, subscription.organizationId) &&
        Objects.equals(this.updatedAt, subscription.updatedAt) &&
        Objects.equals(this.versionId, subscription.versionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactId, createdAt, loyaltyProgramId, loyaltySubscriptionId, organizationId, updatedAt, versionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscription {\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    loyaltyProgramId: ").append(toIndentedString(loyaltyProgramId)).append("\n");
    sb.append("    loyaltySubscriptionId: ").append(toIndentedString(loyaltySubscriptionId)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
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

    // add `contactId` to the URL query string
    if (getContactId() != null) {
      try {
        joiner.add(String.format("%scontactId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getContactId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `createdAt` to the URL query string
    if (getCreatedAt() != null) {
      try {
        joiner.add(String.format("%screatedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `loyaltyProgramId` to the URL query string
    if (getLoyaltyProgramId() != null) {
      try {
        joiner.add(String.format("%sloyaltyProgramId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLoyaltyProgramId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `loyaltySubscriptionId` to the URL query string
    if (getLoyaltySubscriptionId() != null) {
      try {
        joiner.add(String.format("%sloyaltySubscriptionId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLoyaltySubscriptionId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `organizationId` to the URL query string
    if (getOrganizationId() != null) {
      try {
        joiner.add(String.format("%sorganizationId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOrganizationId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `updatedAt` to the URL query string
    if (getUpdatedAt() != null) {
      try {
        joiner.add(String.format("%supdatedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUpdatedAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `versionId` to the URL query string
    if (getVersionId() != null) {
      try {
        joiner.add(String.format("%sversionId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersionId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

