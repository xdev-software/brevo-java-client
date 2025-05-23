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
import software.xdev.brevo.model.GetTransacBlockedContactsContactsInnerReason;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * GetTransacBlockedContactsContactsInner
 */
@JsonPropertyOrder({
  GetTransacBlockedContactsContactsInner.JSON_PROPERTY_EMAIL,
  GetTransacBlockedContactsContactsInner.JSON_PROPERTY_SENDER_EMAIL,
  GetTransacBlockedContactsContactsInner.JSON_PROPERTY_REASON,
  GetTransacBlockedContactsContactsInner.JSON_PROPERTY_BLOCKED_AT
})
@JsonTypeName("getTransacBlockedContacts_contacts_inner")
public class GetTransacBlockedContactsContactsInner {
  public static final String JSON_PROPERTY_EMAIL = "email";
  @jakarta.annotation.Nonnull
  private String email;

  public static final String JSON_PROPERTY_SENDER_EMAIL = "senderEmail";
  @jakarta.annotation.Nonnull
  private String senderEmail;

  public static final String JSON_PROPERTY_REASON = "reason";
  @jakarta.annotation.Nonnull
  private GetTransacBlockedContactsContactsInnerReason reason;

  public static final String JSON_PROPERTY_BLOCKED_AT = "blockedAt";
  @jakarta.annotation.Nonnull
  private String blockedAt;

  public GetTransacBlockedContactsContactsInner() {
  }

  public GetTransacBlockedContactsContactsInner email(@jakarta.annotation.Nonnull String email) {
    
    this.email = email;
    return this;
  }

  /**
   * Email address of the blocked or unsubscribed contact
   * @return email
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmail(@jakarta.annotation.Nonnull String email) {
    this.email = email;
  }

  public GetTransacBlockedContactsContactsInner senderEmail(@jakarta.annotation.Nonnull String senderEmail) {
    
    this.senderEmail = senderEmail;
    return this;
  }

  /**
   * Sender email address of the blocked or unsubscribed contact
   * @return senderEmail
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SENDER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSenderEmail() {
    return senderEmail;
  }


  @JsonProperty(JSON_PROPERTY_SENDER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSenderEmail(@jakarta.annotation.Nonnull String senderEmail) {
    this.senderEmail = senderEmail;
  }

  public GetTransacBlockedContactsContactsInner reason(@jakarta.annotation.Nonnull GetTransacBlockedContactsContactsInnerReason reason) {
    
    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   * @return reason
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GetTransacBlockedContactsContactsInnerReason getReason() {
    return reason;
  }


  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReason(@jakarta.annotation.Nonnull GetTransacBlockedContactsContactsInnerReason reason) {
    this.reason = reason;
  }

  public GetTransacBlockedContactsContactsInner blockedAt(@jakarta.annotation.Nonnull String blockedAt) {
    
    this.blockedAt = blockedAt;
    return this;
  }

  /**
   * Date when the contact was blocked or unsubscribed on
   * @return blockedAt
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BLOCKED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBlockedAt() {
    return blockedAt;
  }


  @JsonProperty(JSON_PROPERTY_BLOCKED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBlockedAt(@jakarta.annotation.Nonnull String blockedAt) {
    this.blockedAt = blockedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTransacBlockedContactsContactsInner getTransacBlockedContactsContactsInner = (GetTransacBlockedContactsContactsInner) o;
    return Objects.equals(this.email, getTransacBlockedContactsContactsInner.email) &&
        Objects.equals(this.senderEmail, getTransacBlockedContactsContactsInner.senderEmail) &&
        Objects.equals(this.reason, getTransacBlockedContactsContactsInner.reason) &&
        Objects.equals(this.blockedAt, getTransacBlockedContactsContactsInner.blockedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, senderEmail, reason, blockedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTransacBlockedContactsContactsInner {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    senderEmail: ").append(toIndentedString(senderEmail)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    blockedAt: ").append(toIndentedString(blockedAt)).append("\n");
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

    // add `senderEmail` to the URL query string
    if (getSenderEmail() != null) {
      try {
        joiner.add(String.format("%ssenderEmail%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSenderEmail()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `reason` to the URL query string
    if (getReason() != null) {
      joiner.add(getReason().toUrlQueryString(prefix + "reason" + suffix));
    }

    // add `blockedAt` to the URL query string
    if (getBlockedAt() != null) {
      try {
        joiner.add(String.format("%sblockedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBlockedAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

