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
 * GetWhatsappEventReportEventsInner
 */
@JsonPropertyOrder({
  GetWhatsappEventReportEventsInner.JSON_PROPERTY_CONTACT_NUMBER,
  GetWhatsappEventReportEventsInner.JSON_PROPERTY_DATE,
  GetWhatsappEventReportEventsInner.JSON_PROPERTY_MESSAGE_ID,
  GetWhatsappEventReportEventsInner.JSON_PROPERTY_EVENT,
  GetWhatsappEventReportEventsInner.JSON_PROPERTY_REASON,
  GetWhatsappEventReportEventsInner.JSON_PROPERTY_BODY,
  GetWhatsappEventReportEventsInner.JSON_PROPERTY_MEDIA_URL,
  GetWhatsappEventReportEventsInner.JSON_PROPERTY_SENDER_NUMBER
})
@JsonTypeName("getWhatsappEventReport_events_inner")
public class GetWhatsappEventReportEventsInner {
  public static final String JSON_PROPERTY_CONTACT_NUMBER = "contactNumber";
  private String contactNumber;

  public static final String JSON_PROPERTY_DATE = "date";
  private String date;

  public static final String JSON_PROPERTY_MESSAGE_ID = "messageId";
  private String messageId;

  /**
   * Event which occurred
   */
  public enum EventEnum {
    SENT("sent"),
    
    DELIVERED("delivered"),
    
    READ("read"),
    
    ERROR("error"),
    
    UNSUBSCRIBE("unsubscribe"),
    
    REPLY("reply"),
    
    SOFT_BOUNCE("soft-bounce");

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
  private EventEnum event;

  public static final String JSON_PROPERTY_REASON = "reason";
  private String reason;

  public static final String JSON_PROPERTY_BODY = "body";
  private String body;

  public static final String JSON_PROPERTY_MEDIA_URL = "mediaUrl";
  private String mediaUrl;

  public static final String JSON_PROPERTY_SENDER_NUMBER = "senderNumber";
  private String senderNumber;

  public GetWhatsappEventReportEventsInner() {
  }

  public GetWhatsappEventReportEventsInner contactNumber(String contactNumber) {
    
    this.contactNumber = contactNumber;
    return this;
  }

   /**
   * WhatsApp Number with country code. Example, 85264318721
   * @return contactNumber
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONTACT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getContactNumber() {
    return contactNumber;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContactNumber(String contactNumber) {
    this.contactNumber = contactNumber;
  }


  public GetWhatsappEventReportEventsInner date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * UTC date-time on which the event has been generated
   * @return date
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDate(String date) {
    this.date = date;
  }


  public GetWhatsappEventReportEventsInner messageId(String messageId) {
    
    this.messageId = messageId;
    return this;
  }

   /**
   * Message ID which generated the event
   * @return messageId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MESSAGE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMessageId() {
    return messageId;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }


  public GetWhatsappEventReportEventsInner event(EventEnum event) {
    
    this.event = event;
    return this;
  }

   /**
   * Event which occurred
   * @return event
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EVENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EventEnum getEvent() {
    return event;
  }


  @JsonProperty(JSON_PROPERTY_EVENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEvent(EventEnum event) {
    this.event = event;
  }


  public GetWhatsappEventReportEventsInner reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * Reason for the event (will be there in case of &#x60;error&#x60; and &#x60;soft-bounce&#x60; events)
   * @return reason
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReason() {
    return reason;
  }


  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReason(String reason) {
    this.reason = reason;
  }


  public GetWhatsappEventReportEventsInner body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * Text of the reply (will be there only in case of &#x60;reply&#x60; event with text)
   * @return body
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBody() {
    return body;
  }


  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBody(String body) {
    this.body = body;
  }


  public GetWhatsappEventReportEventsInner mediaUrl(String mediaUrl) {
    
    this.mediaUrl = mediaUrl;
    return this;
  }

   /**
   * Url of the media reply (will be there only in case of &#x60;reply&#x60; event with media)
   * @return mediaUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEDIA_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMediaUrl() {
    return mediaUrl;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMediaUrl(String mediaUrl) {
    this.mediaUrl = mediaUrl;
  }


  public GetWhatsappEventReportEventsInner senderNumber(String senderNumber) {
    
    this.senderNumber = senderNumber;
    return this;
  }

   /**
   * WhatsApp Number with country code. Example, 85264318721
   * @return senderNumber
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SENDER_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSenderNumber() {
    return senderNumber;
  }


  @JsonProperty(JSON_PROPERTY_SENDER_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSenderNumber(String senderNumber) {
    this.senderNumber = senderNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetWhatsappEventReportEventsInner getWhatsappEventReportEventsInner = (GetWhatsappEventReportEventsInner) o;
    return Objects.equals(this.contactNumber, getWhatsappEventReportEventsInner.contactNumber) &&
        Objects.equals(this.date, getWhatsappEventReportEventsInner.date) &&
        Objects.equals(this.messageId, getWhatsappEventReportEventsInner.messageId) &&
        Objects.equals(this.event, getWhatsappEventReportEventsInner.event) &&
        Objects.equals(this.reason, getWhatsappEventReportEventsInner.reason) &&
        Objects.equals(this.body, getWhatsappEventReportEventsInner.body) &&
        Objects.equals(this.mediaUrl, getWhatsappEventReportEventsInner.mediaUrl) &&
        Objects.equals(this.senderNumber, getWhatsappEventReportEventsInner.senderNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactNumber, date, messageId, event, reason, body, mediaUrl, senderNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetWhatsappEventReportEventsInner {\n");
    sb.append("    contactNumber: ").append(toIndentedString(contactNumber)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    mediaUrl: ").append(toIndentedString(mediaUrl)).append("\n");
    sb.append("    senderNumber: ").append(toIndentedString(senderNumber)).append("\n");
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

    // add `contactNumber` to the URL query string
    if (getContactNumber() != null) {
      try {
        joiner.add(String.format("%scontactNumber%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getContactNumber()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `body` to the URL query string
    if (getBody() != null) {
      try {
        joiner.add(String.format("%sbody%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBody()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `mediaUrl` to the URL query string
    if (getMediaUrl() != null) {
      try {
        joiner.add(String.format("%smediaUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMediaUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `senderNumber` to the URL query string
    if (getSenderNumber() != null) {
      try {
        joiner.add(String.format("%ssenderNumber%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSenderNumber()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

