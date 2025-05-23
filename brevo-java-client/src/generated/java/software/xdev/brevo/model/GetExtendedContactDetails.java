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
import software.xdev.brevo.model.GetExtendedContactDetailsAllOfStatistics;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * GetExtendedContactDetails
 */
@JsonPropertyOrder({
  GetExtendedContactDetails.JSON_PROPERTY_EMAIL,
  GetExtendedContactDetails.JSON_PROPERTY_ID,
  GetExtendedContactDetails.JSON_PROPERTY_EMAIL_BLACKLISTED,
  GetExtendedContactDetails.JSON_PROPERTY_SMS_BLACKLISTED,
  GetExtendedContactDetails.JSON_PROPERTY_CREATED_AT,
  GetExtendedContactDetails.JSON_PROPERTY_MODIFIED_AT,
  GetExtendedContactDetails.JSON_PROPERTY_LIST_IDS,
  GetExtendedContactDetails.JSON_PROPERTY_LIST_UNSUBSCRIBED,
  GetExtendedContactDetails.JSON_PROPERTY_ATTRIBUTES,
  GetExtendedContactDetails.JSON_PROPERTY_STATISTICS
})
@JsonTypeName("getExtendedContactDetails")
public class GetExtendedContactDetails {
  public static final String JSON_PROPERTY_EMAIL = "email";
  @jakarta.annotation.Nullable
  private String email;

  public static final String JSON_PROPERTY_ID = "id";
  @jakarta.annotation.Nonnull
  private Long id;

  public static final String JSON_PROPERTY_EMAIL_BLACKLISTED = "emailBlacklisted";
  @jakarta.annotation.Nonnull
  private Boolean emailBlacklisted;

  public static final String JSON_PROPERTY_SMS_BLACKLISTED = "smsBlacklisted";
  @jakarta.annotation.Nonnull
  private Boolean smsBlacklisted;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  @jakarta.annotation.Nonnull
  private String createdAt;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modifiedAt";
  @jakarta.annotation.Nonnull
  private String modifiedAt;

  public static final String JSON_PROPERTY_LIST_IDS = "listIds";
  @jakarta.annotation.Nonnull
  private List<Long> listIds = new ArrayList<>();

  public static final String JSON_PROPERTY_LIST_UNSUBSCRIBED = "listUnsubscribed";
  @jakarta.annotation.Nullable
  private List<Long> listUnsubscribed = new ArrayList<>();

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  @jakarta.annotation.Nonnull
  private Object attributes;

  public static final String JSON_PROPERTY_STATISTICS = "statistics";
  @jakarta.annotation.Nonnull
  private GetExtendedContactDetailsAllOfStatistics statistics;

  public GetExtendedContactDetails() {
  }

  public GetExtendedContactDetails email(@jakarta.annotation.Nullable String email) {
    
    this.email = email;
    return this;
  }

  /**
   * Email address of the contact for which you requested the details
   * @return email
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(@jakarta.annotation.Nullable String email) {
    this.email = email;
  }

  public GetExtendedContactDetails id(@jakarta.annotation.Nonnull Long id) {
    
    this.id = id;
    return this;
  }

  /**
   * ID of the contact for which you requested the details
   * @return id
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(@jakarta.annotation.Nonnull Long id) {
    this.id = id;
  }

  public GetExtendedContactDetails emailBlacklisted(@jakarta.annotation.Nonnull Boolean emailBlacklisted) {
    
    this.emailBlacklisted = emailBlacklisted;
    return this;
  }

  /**
   * Blacklist status for email campaigns (true&#x3D;blacklisted, false&#x3D;not blacklisted)
   * @return emailBlacklisted
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EMAIL_BLACKLISTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getEmailBlacklisted() {
    return emailBlacklisted;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_BLACKLISTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmailBlacklisted(@jakarta.annotation.Nonnull Boolean emailBlacklisted) {
    this.emailBlacklisted = emailBlacklisted;
  }

  public GetExtendedContactDetails smsBlacklisted(@jakarta.annotation.Nonnull Boolean smsBlacklisted) {
    
    this.smsBlacklisted = smsBlacklisted;
    return this;
  }

  /**
   * Blacklist status for SMS campaigns (true&#x3D;blacklisted, false&#x3D;not blacklisted)
   * @return smsBlacklisted
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SMS_BLACKLISTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getSmsBlacklisted() {
    return smsBlacklisted;
  }


  @JsonProperty(JSON_PROPERTY_SMS_BLACKLISTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSmsBlacklisted(@jakarta.annotation.Nonnull Boolean smsBlacklisted) {
    this.smsBlacklisted = smsBlacklisted;
  }

  public GetExtendedContactDetails createdAt(@jakarta.annotation.Nonnull String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Creation UTC date-time of the contact (YYYY-MM-DDTHH:mm:ss.SSSZ)
   * @return createdAt
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(@jakarta.annotation.Nonnull String createdAt) {
    this.createdAt = createdAt;
  }

  public GetExtendedContactDetails modifiedAt(@jakarta.annotation.Nonnull String modifiedAt) {
    
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * Last modification UTC date-time of the contact (YYYY-MM-DDTHH:mm:ss.SSSZ)
   * @return modifiedAt
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getModifiedAt() {
    return modifiedAt;
  }


  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setModifiedAt(@jakarta.annotation.Nonnull String modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public GetExtendedContactDetails listIds(@jakarta.annotation.Nonnull List<Long> listIds) {
    
    this.listIds = listIds;
    return this;
  }

  public GetExtendedContactDetails addListIdsItem(Long listIdsItem) {
    if (this.listIds == null) {
      this.listIds = new ArrayList<>();
    }
    this.listIds.add(listIdsItem);
    return this;
  }

  /**
   * Get listIds
   * @return listIds
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LIST_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Long> getListIds() {
    return listIds;
  }


  @JsonProperty(JSON_PROPERTY_LIST_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setListIds(@jakarta.annotation.Nonnull List<Long> listIds) {
    this.listIds = listIds;
  }

  public GetExtendedContactDetails listUnsubscribed(@jakarta.annotation.Nullable List<Long> listUnsubscribed) {
    
    this.listUnsubscribed = listUnsubscribed;
    return this;
  }

  public GetExtendedContactDetails addListUnsubscribedItem(Long listUnsubscribedItem) {
    if (this.listUnsubscribed == null) {
      this.listUnsubscribed = new ArrayList<>();
    }
    this.listUnsubscribed.add(listUnsubscribedItem);
    return this;
  }

  /**
   * Get listUnsubscribed
   * @return listUnsubscribed
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIST_UNSUBSCRIBED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getListUnsubscribed() {
    return listUnsubscribed;
  }


  @JsonProperty(JSON_PROPERTY_LIST_UNSUBSCRIBED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setListUnsubscribed(@jakarta.annotation.Nullable List<Long> listUnsubscribed) {
    this.listUnsubscribed = listUnsubscribed;
  }

  public GetExtendedContactDetails attributes(@jakarta.annotation.Nonnull Object attributes) {
    
    this.attributes = attributes;
    return this;
  }

  /**
   * Set of attributes of the contact
   * @return attributes
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getAttributes() {
    return attributes;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAttributes(@jakarta.annotation.Nonnull Object attributes) {
    this.attributes = attributes;
  }

  public GetExtendedContactDetails statistics(@jakarta.annotation.Nonnull GetExtendedContactDetailsAllOfStatistics statistics) {
    
    this.statistics = statistics;
    return this;
  }

  /**
   * Get statistics
   * @return statistics
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATISTICS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GetExtendedContactDetailsAllOfStatistics getStatistics() {
    return statistics;
  }


  @JsonProperty(JSON_PROPERTY_STATISTICS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatistics(@jakarta.annotation.Nonnull GetExtendedContactDetailsAllOfStatistics statistics) {
    this.statistics = statistics;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetExtendedContactDetails getExtendedContactDetails = (GetExtendedContactDetails) o;
    return Objects.equals(this.email, getExtendedContactDetails.email) &&
        Objects.equals(this.id, getExtendedContactDetails.id) &&
        Objects.equals(this.emailBlacklisted, getExtendedContactDetails.emailBlacklisted) &&
        Objects.equals(this.smsBlacklisted, getExtendedContactDetails.smsBlacklisted) &&
        Objects.equals(this.createdAt, getExtendedContactDetails.createdAt) &&
        Objects.equals(this.modifiedAt, getExtendedContactDetails.modifiedAt) &&
        Objects.equals(this.listIds, getExtendedContactDetails.listIds) &&
        Objects.equals(this.listUnsubscribed, getExtendedContactDetails.listUnsubscribed) &&
        Objects.equals(this.attributes, getExtendedContactDetails.attributes) &&
        Objects.equals(this.statistics, getExtendedContactDetails.statistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, id, emailBlacklisted, smsBlacklisted, createdAt, modifiedAt, listIds, listUnsubscribed, attributes, statistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetExtendedContactDetails {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    emailBlacklisted: ").append(toIndentedString(emailBlacklisted)).append("\n");
    sb.append("    smsBlacklisted: ").append(toIndentedString(smsBlacklisted)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    listIds: ").append(toIndentedString(listIds)).append("\n");
    sb.append("    listUnsubscribed: ").append(toIndentedString(listUnsubscribed)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
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

    // add `email` to the URL query string
    if (getEmail() != null) {
      try {
        joiner.add(String.format("%semail%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmail()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `emailBlacklisted` to the URL query string
    if (getEmailBlacklisted() != null) {
      try {
        joiner.add(String.format("%semailBlacklisted%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmailBlacklisted()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `smsBlacklisted` to the URL query string
    if (getSmsBlacklisted() != null) {
      try {
        joiner.add(String.format("%ssmsBlacklisted%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSmsBlacklisted()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `modifiedAt` to the URL query string
    if (getModifiedAt() != null) {
      try {
        joiner.add(String.format("%smodifiedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getModifiedAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `listIds` to the URL query string
    if (getListIds() != null) {
      for (int i = 0; i < getListIds().size(); i++) {
        try {
          joiner.add(String.format("%slistIds%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getListIds().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `listUnsubscribed` to the URL query string
    if (getListUnsubscribed() != null) {
      for (int i = 0; i < getListUnsubscribed().size(); i++) {
        try {
          joiner.add(String.format("%slistUnsubscribed%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getListUnsubscribed().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
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

    // add `statistics` to the URL query string
    if (getStatistics() != null) {
      joiner.add(getStatistics().toUrlQueryString(prefix + "statistics" + suffix));
    }

    return joiner.toString();
  }

}

