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
 * SubscriptionMember
 */
@JsonPropertyOrder({
  SubscriptionMember.JSON_PROPERTY_CREATED_AT,
  SubscriptionMember.JSON_PROPERTY_MEMBER_CONTACT_IDS,
  SubscriptionMember.JSON_PROPERTY_ORGANIZATION_ID,
  SubscriptionMember.JSON_PROPERTY_OWNER_CONTACT_ID,
  SubscriptionMember.JSON_PROPERTY_UPDATED_AT
})
@JsonTypeName("subscriptionMember")
public class SubscriptionMember {
  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  @jakarta.annotation.Nullable
  private String createdAt;

  public static final String JSON_PROPERTY_MEMBER_CONTACT_IDS = "memberContactIds";
  @jakarta.annotation.Nullable
  private List<Integer> memberContactIds = new ArrayList<>();

  public static final String JSON_PROPERTY_ORGANIZATION_ID = "organizationId";
  @jakarta.annotation.Nullable
  private Integer organizationId;

  public static final String JSON_PROPERTY_OWNER_CONTACT_ID = "ownerContactId";
  @jakarta.annotation.Nullable
  private Integer ownerContactId;

  public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
  @jakarta.annotation.Nullable
  private String updatedAt;

  public SubscriptionMember() {
  }

  public SubscriptionMember createdAt(@jakarta.annotation.Nullable String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp when the subscription member was created.
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

  public SubscriptionMember memberContactIds(@jakarta.annotation.Nullable List<Integer> memberContactIds) {
    
    this.memberContactIds = memberContactIds;
    return this;
  }

  public SubscriptionMember addMemberContactIdsItem(Integer memberContactIdsItem) {
    if (this.memberContactIds == null) {
      this.memberContactIds = new ArrayList<>();
    }
    this.memberContactIds.add(memberContactIdsItem);
    return this;
  }

  /**
   * List of unique member contact IDs.
   * @return memberContactIds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEMBER_CONTACT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getMemberContactIds() {
    return memberContactIds;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_CONTACT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemberContactIds(@jakarta.annotation.Nullable List<Integer> memberContactIds) {
    this.memberContactIds = memberContactIds;
  }

  public SubscriptionMember organizationId(@jakarta.annotation.Nullable Integer organizationId) {
    
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

  public SubscriptionMember ownerContactId(@jakarta.annotation.Nullable Integer ownerContactId) {
    
    this.ownerContactId = ownerContactId;
    return this;
  }

  /**
   * Unique identifier of the subscription owner.
   * @return ownerContactId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OWNER_CONTACT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOwnerContactId() {
    return ownerContactId;
  }


  @JsonProperty(JSON_PROPERTY_OWNER_CONTACT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwnerContactId(@jakarta.annotation.Nullable Integer ownerContactId) {
    this.ownerContactId = ownerContactId;
  }

  public SubscriptionMember updatedAt(@jakarta.annotation.Nullable String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Timestamp when the subscription member was last updated.
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionMember subscriptionMember = (SubscriptionMember) o;
    return Objects.equals(this.createdAt, subscriptionMember.createdAt) &&
        Objects.equals(this.memberContactIds, subscriptionMember.memberContactIds) &&
        Objects.equals(this.organizationId, subscriptionMember.organizationId) &&
        Objects.equals(this.ownerContactId, subscriptionMember.ownerContactId) &&
        Objects.equals(this.updatedAt, subscriptionMember.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, memberContactIds, organizationId, ownerContactId, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionMember {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    memberContactIds: ").append(toIndentedString(memberContactIds)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    ownerContactId: ").append(toIndentedString(ownerContactId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

    // add `createdAt` to the URL query string
    if (getCreatedAt() != null) {
      try {
        joiner.add(String.format("%screatedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `memberContactIds` to the URL query string
    if (getMemberContactIds() != null) {
      for (int i = 0; i < getMemberContactIds().size(); i++) {
        try {
          joiner.add(String.format("%smemberContactIds%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getMemberContactIds().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
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

    // add `ownerContactId` to the URL query string
    if (getOwnerContactId() != null) {
      try {
        joiner.add(String.format("%sownerContactId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOwnerContactId()), "UTF-8").replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }

}

