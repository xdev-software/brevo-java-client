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
 * SendSms
 */
@JsonPropertyOrder({
  SendSms.JSON_PROPERTY_REFERENCE,
  SendSms.JSON_PROPERTY_MESSAGE_ID,
  SendSms.JSON_PROPERTY_SMS_COUNT,
  SendSms.JSON_PROPERTY_USED_CREDITS,
  SendSms.JSON_PROPERTY_REMAINING_CREDITS
})
@JsonTypeName("sendSms")
public class SendSms {
  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_MESSAGE_ID = "messageId";
  private Long messageId;

  public static final String JSON_PROPERTY_SMS_COUNT = "smsCount";
  private Long smsCount;

  public static final String JSON_PROPERTY_USED_CREDITS = "usedCredits";
  private Float usedCredits;

  public static final String JSON_PROPERTY_REMAINING_CREDITS = "remainingCredits";
  private Float remainingCredits;

  public SendSms() {
  }

  public SendSms reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getReference() {
    return reference;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReference(String reference) {
    this.reference = reference;
  }


  public SendSms messageId(Long messageId) {
    
    this.messageId = messageId;
    return this;
  }

   /**
   * Get messageId
   * @return messageId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MESSAGE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getMessageId() {
    return messageId;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessageId(Long messageId) {
    this.messageId = messageId;
  }


  public SendSms smsCount(Long smsCount) {
    
    this.smsCount = smsCount;
    return this;
  }

   /**
   * Count of SMS&#39;s to send multiple text messages
   * @return smsCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SMS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSmsCount() {
    return smsCount;
  }


  @JsonProperty(JSON_PROPERTY_SMS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSmsCount(Long smsCount) {
    this.smsCount = smsCount;
  }


  public SendSms usedCredits(Float usedCredits) {
    
    this.usedCredits = usedCredits;
    return this;
  }

   /**
   * SMS credits used per text message
   * @return usedCredits
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USED_CREDITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getUsedCredits() {
    return usedCredits;
  }


  @JsonProperty(JSON_PROPERTY_USED_CREDITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsedCredits(Float usedCredits) {
    this.usedCredits = usedCredits;
  }


  public SendSms remainingCredits(Float remainingCredits) {
    
    this.remainingCredits = remainingCredits;
    return this;
  }

   /**
   * Remaining SMS credits of the user
   * @return remainingCredits
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMAINING_CREDITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getRemainingCredits() {
    return remainingCredits;
  }


  @JsonProperty(JSON_PROPERTY_REMAINING_CREDITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemainingCredits(Float remainingCredits) {
    this.remainingCredits = remainingCredits;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendSms sendSms = (SendSms) o;
    return Objects.equals(this.reference, sendSms.reference) &&
        Objects.equals(this.messageId, sendSms.messageId) &&
        Objects.equals(this.smsCount, sendSms.smsCount) &&
        Objects.equals(this.usedCredits, sendSms.usedCredits) &&
        Objects.equals(this.remainingCredits, sendSms.remainingCredits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference, messageId, smsCount, usedCredits, remainingCredits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendSms {\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    smsCount: ").append(toIndentedString(smsCount)).append("\n");
    sb.append("    usedCredits: ").append(toIndentedString(usedCredits)).append("\n");
    sb.append("    remainingCredits: ").append(toIndentedString(remainingCredits)).append("\n");
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

    // add `reference` to the URL query string
    if (getReference() != null) {
      try {
        joiner.add(String.format("%sreference%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReference()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `messageId` to the URL query string
    if (getMessageId() != null) {
      try {
        joiner.add(String.format("%smessageId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMessageId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `smsCount` to the URL query string
    if (getSmsCount() != null) {
      try {
        joiner.add(String.format("%ssmsCount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSmsCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `usedCredits` to the URL query string
    if (getUsedCredits() != null) {
      try {
        joiner.add(String.format("%susedCredits%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUsedCredits()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `remainingCredits` to the URL query string
    if (getRemainingCredits() != null) {
      try {
        joiner.add(String.format("%sremainingCredits%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRemainingCredits()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}
