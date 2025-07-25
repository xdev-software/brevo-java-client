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
 * GetSmsEventReportEventsInner
 */
@JsonPropertyOrder({
  GetSmsEventReportEventsInner.JSON_PROPERTY_PHONE_NUMBER,
  GetSmsEventReportEventsInner.JSON_PROPERTY_DATE,
  GetSmsEventReportEventsInner.JSON_PROPERTY_MESSAGE_ID,
  GetSmsEventReportEventsInner.JSON_PROPERTY_EVENT,
  GetSmsEventReportEventsInner.JSON_PROPERTY_REASON,
  GetSmsEventReportEventsInner.JSON_PROPERTY_REPLY,
  GetSmsEventReportEventsInner.JSON_PROPERTY_TAG
})
@JsonTypeName("getSmsEventReport_events_inner")
public class GetSmsEventReportEventsInner {
  public static final String JSON_PROPERTY_PHONE_NUMBER = "phoneNumber";
  @jakarta.annotation.Nullable
  private String phoneNumber;

  public static final String JSON_PROPERTY_DATE = "date";
  @jakarta.annotation.Nullable
  private String date;

  public static final String JSON_PROPERTY_MESSAGE_ID = "messageId";
  @jakarta.annotation.Nullable
  private String messageId;

  /**
   * Event which occurred
   */
  public enum EventEnum {
    BOUNCES(String.valueOf("bounces")),
    
    HARD_BOUNCES(String.valueOf("hardBounces")),
    
    SOFT_BOUNCES(String.valueOf("softBounces")),
    
    DELIVERED(String.valueOf("delivered")),
    
    SENT(String.valueOf("sent")),
    
    ACCEPTED(String.valueOf("accepted")),
    
    UNSUBSCRIPTION(String.valueOf("unsubscription")),
    
    REPLIES(String.valueOf("replies")),
    
    BLOCKED(String.valueOf("blocked")),
    
    REJECTED(String.valueOf("rejected")),
    
    SKIPPED(String.valueOf("skipped"));

    private String value;

    EventEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EventEnum fromValue(String value) {
      for (EventEnum b : EventEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_EVENT = "event";
  @jakarta.annotation.Nullable
  private EventEnum event;

  public static final String JSON_PROPERTY_REASON = "reason";
  @jakarta.annotation.Nullable
  private String reason;

  public static final String JSON_PROPERTY_REPLY = "reply";
  @jakarta.annotation.Nullable
  private String reply;

  public static final String JSON_PROPERTY_TAG = "tag";
  @jakarta.annotation.Nullable
  private String tag;

  public GetSmsEventReportEventsInner() {
  }

  public GetSmsEventReportEventsInner phoneNumber(@jakarta.annotation.Nullable String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Phone number which has generated the event
   * @return phoneNumber
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhoneNumber() {
    return phoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhoneNumber(@jakarta.annotation.Nullable String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public GetSmsEventReportEventsInner date(@jakarta.annotation.Nullable String date) {
    
    this.date = date;
    return this;
  }

  /**
   * UTC date-time on which the event has been generated
   * @return date
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(@jakarta.annotation.Nullable String date) {
    this.date = date;
  }

  public GetSmsEventReportEventsInner messageId(@jakarta.annotation.Nullable String messageId) {
    
    this.messageId = messageId;
    return this;
  }

  /**
   * Message ID which generated the event
   * @return messageId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessageId() {
    return messageId;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessageId(@jakarta.annotation.Nullable String messageId) {
    this.messageId = messageId;
  }

  public GetSmsEventReportEventsInner event(@jakarta.annotation.Nullable EventEnum event) {
    
    this.event = event;
    return this;
  }

  /**
   * Event which occurred
   * @return event
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EventEnum getEvent() {
    return event;
  }


  @JsonProperty(JSON_PROPERTY_EVENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEvent(@jakarta.annotation.Nullable EventEnum event) {
    this.event = event;
  }

  public GetSmsEventReportEventsInner reason(@jakarta.annotation.Nullable String reason) {
    
    this.reason = reason;
    return this;
  }

  /**
   * Reason of bounce (only available if the event is hardbounce or softbounce)
   * @return reason
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReason() {
    return reason;
  }


  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReason(@jakarta.annotation.Nullable String reason) {
    this.reason = reason;
  }

  public GetSmsEventReportEventsInner reply(@jakarta.annotation.Nullable String reply) {
    
    this.reply = reply;
    return this;
  }

  /**
   * Get reply
   * @return reply
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReply() {
    return reply;
  }


  @JsonProperty(JSON_PROPERTY_REPLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReply(@jakarta.annotation.Nullable String reply) {
    this.reply = reply;
  }

  public GetSmsEventReportEventsInner tag(@jakarta.annotation.Nullable String tag) {
    
    this.tag = tag;
    return this;
  }

  /**
   * Tag of the SMS which generated the event
   * @return tag
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTag() {
    return tag;
  }


  @JsonProperty(JSON_PROPERTY_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTag(@jakarta.annotation.Nullable String tag) {
    this.tag = tag;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSmsEventReportEventsInner getSmsEventReportEventsInner = (GetSmsEventReportEventsInner) o;
    return Objects.equals(this.phoneNumber, getSmsEventReportEventsInner.phoneNumber) &&
        Objects.equals(this.date, getSmsEventReportEventsInner.date) &&
        Objects.equals(this.messageId, getSmsEventReportEventsInner.messageId) &&
        Objects.equals(this.event, getSmsEventReportEventsInner.event) &&
        Objects.equals(this.reason, getSmsEventReportEventsInner.reason) &&
        Objects.equals(this.reply, getSmsEventReportEventsInner.reply) &&
        Objects.equals(this.tag, getSmsEventReportEventsInner.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, date, messageId, event, reason, reply, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSmsEventReportEventsInner {\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    reply: ").append(toIndentedString(reply)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

    // add `phoneNumber` to the URL query string
    if (getPhoneNumber() != null) {
      try {
        joiner.add(String.format("%sphoneNumber%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPhoneNumber()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `date` to the URL query string
    if (getDate() != null) {
      try {
        joiner.add(String.format("%sdate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDate()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `event` to the URL query string
    if (getEvent() != null) {
      try {
        joiner.add(String.format("%sevent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEvent()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `reason` to the URL query string
    if (getReason() != null) {
      try {
        joiner.add(String.format("%sreason%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReason()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `reply` to the URL query string
    if (getReply() != null) {
      try {
        joiner.add(String.format("%sreply%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReply()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `tag` to the URL query string
    if (getTag() != null) {
      try {
        joiner.add(String.format("%stag%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTag()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

