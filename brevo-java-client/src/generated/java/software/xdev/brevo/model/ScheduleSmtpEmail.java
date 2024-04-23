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
 * ScheduleSmtpEmail
 */
@JsonPropertyOrder({
  ScheduleSmtpEmail.JSON_PROPERTY_MESSAGE_ID,
  ScheduleSmtpEmail.JSON_PROPERTY_MESSAGE_IDS,
  ScheduleSmtpEmail.JSON_PROPERTY_BATCH_ID
})
@JsonTypeName("scheduleSmtpEmail")
public class ScheduleSmtpEmail {
  public static final String JSON_PROPERTY_MESSAGE_ID = "messageId";
  private String messageId;

  public static final String JSON_PROPERTY_MESSAGE_IDS = "messageIds";
  private List<String> messageIds = new ArrayList<>();

  public static final String JSON_PROPERTY_BATCH_ID = "batchId";
  private String batchId;

  public ScheduleSmtpEmail() {
  }

  public ScheduleSmtpEmail messageId(String messageId) {
    
    this.messageId = messageId;
    return this;
  }

   /**
   * Message ID of the transactional email scheduled
   * @return messageId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessageId() {
    return messageId;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }


  public ScheduleSmtpEmail messageIds(List<String> messageIds) {
    
    this.messageIds = messageIds;
    return this;
  }

  public ScheduleSmtpEmail addMessageIdsItem(String messageIdsItem) {
    if (this.messageIds == null) {
      this.messageIds = new ArrayList<>();
    }
    this.messageIds.add(messageIdsItem);
    return this;
  }

   /**
   * Get messageIds
   * @return messageIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getMessageIds() {
    return messageIds;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessageIds(List<String> messageIds) {
    this.messageIds = messageIds;
  }


  public ScheduleSmtpEmail batchId(String batchId) {
    
    this.batchId = batchId;
    return this;
  }

   /**
   * Batch ID of the batch transactional email scheduled
   * @return batchId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BATCH_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBatchId() {
    return batchId;
  }


  @JsonProperty(JSON_PROPERTY_BATCH_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleSmtpEmail scheduleSmtpEmail = (ScheduleSmtpEmail) o;
    return Objects.equals(this.messageId, scheduleSmtpEmail.messageId) &&
        Objects.equals(this.messageIds, scheduleSmtpEmail.messageIds) &&
        Objects.equals(this.batchId, scheduleSmtpEmail.batchId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageId, messageIds, batchId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleSmtpEmail {\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    messageIds: ").append(toIndentedString(messageIds)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
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

    // add `messageId` to the URL query string
    if (getMessageId() != null) {
      try {
        joiner.add(String.format("%smessageId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMessageId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `messageIds` to the URL query string
    if (getMessageIds() != null) {
      for (int i = 0; i < getMessageIds().size(); i++) {
        try {
          joiner.add(String.format("%smessageIds%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getMessageIds().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `batchId` to the URL query string
    if (getBatchId() != null) {
      try {
        joiner.add(String.format("%sbatchId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBatchId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

