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
import software.xdev.brevo.model.ExportWebhooksHistory;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ExportWebhooksHistoryRequest
 */
@JsonPropertyOrder({
  ExportWebhooksHistoryRequest.JSON_PROPERTY_DAYS,
  ExportWebhooksHistoryRequest.JSON_PROPERTY_START_DATE,
  ExportWebhooksHistoryRequest.JSON_PROPERTY_END_DATE,
  ExportWebhooksHistoryRequest.JSON_PROPERTY_SORT,
  ExportWebhooksHistoryRequest.JSON_PROPERTY_TYPE,
  ExportWebhooksHistoryRequest.JSON_PROPERTY_EVENT,
  ExportWebhooksHistoryRequest.JSON_PROPERTY_NOTIFY_U_R_L,
  ExportWebhooksHistoryRequest.JSON_PROPERTY_WEBHOOK_ID,
  ExportWebhooksHistoryRequest.JSON_PROPERTY_EMAIL,
  ExportWebhooksHistoryRequest.JSON_PROPERTY_MESSAGE_ID
})
@JsonTypeName("exportWebhooksHistory_request")
public class ExportWebhooksHistoryRequest {
  public static final String JSON_PROPERTY_DAYS = "days";
  private Integer days;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

  public static final String JSON_PROPERTY_SORT = "sort";
  private String sort;

  /**
   * Filter the history based on webhook type
   */
  public enum TypeEnum {
    TRANSACTIONAL("transactional"),
    
    MARKETING("marketing");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  /**
   * Filter the history for a specific event type
   */
  public enum EventEnum {
    INVALID_PARAMETER("invalid_parameter"),
    
    MISSING_PARAMETER("missing_parameter"),
    
    HARDBOUNCE("hardBounce"),
    
    SOFTBOUNCE("softBounce"),
    
    DELIVERED("delivered"),
    
    SPAM("spam"),
    
    REQUEST("request"),
    
    OPENED("opened"),
    
    CLICK("click"),
    
    INVALID("invalid"),
    
    DEFERRED("deferred"),
    
    BLOCKED("blocked"),
    
    UNSUBSCRIBED("unsubscribed"),
    
    ERROR("error"),
    
    UNIQUEOPENED("uniqueOpened"),
    
    LOADEDBYPROXY("loadedByProxy"),
    
    ALLEVENTS("allEvents");

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

  public static final String JSON_PROPERTY_NOTIFY_U_R_L = "notifyURL";
  private String notifyURL;

  public static final String JSON_PROPERTY_WEBHOOK_ID = "webhookId";
  private Integer webhookId;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_MESSAGE_ID = "messageId";
  private Integer messageId;

  public ExportWebhooksHistoryRequest() {
  }

  public ExportWebhooksHistoryRequest days(Integer days) {
    
    this.days = days;
    return this;
  }

   /**
   * Number of days in the past including today (positive integer). _Not compatible with &#39;startDate&#39; and &#39;endDate&#39;_
   * @return days
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDays() {
    return days;
  }


  @JsonProperty(JSON_PROPERTY_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDays(Integer days) {
    this.days = days;
  }

  public ExportWebhooksHistoryRequest startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Mandatory if endDate is used. Starting date of the history (YYYY-MM-DD). Must be lower than equal to endDate
   * @return startDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public ExportWebhooksHistoryRequest endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Mandatory if startDate is used. Ending date of the report (YYYY-MM-DD). Must be greater than equal to startDate
   * @return endDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public ExportWebhooksHistoryRequest sort(String sort) {
    
    this.sort = sort;
    return this;
  }

   /**
   * Sorting order of records (asc or desc)
   * @return sort
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSort() {
    return sort;
  }


  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSort(String sort) {
    this.sort = sort;
  }

  public ExportWebhooksHistoryRequest type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Filter the history based on webhook type
   * @return type
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ExportWebhooksHistoryRequest event(EventEnum event) {
    
    this.event = event;
    return this;
  }

   /**
   * Filter the history for a specific event type
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

  public ExportWebhooksHistoryRequest notifyURL(String notifyURL) {
    
    this.notifyURL = notifyURL;
    return this;
  }

   /**
   * Webhook URL to receive CSV file link
   * @return notifyURL
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NOTIFY_U_R_L)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNotifyURL() {
    return notifyURL;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFY_U_R_L)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNotifyURL(String notifyURL) {
    this.notifyURL = notifyURL;
  }

  public ExportWebhooksHistoryRequest webhookId(Integer webhookId) {
    
    this.webhookId = webhookId;
    return this;
  }

   /**
   * Filter the history for a specific webhook id
   * @return webhookId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEBHOOK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWebhookId() {
    return webhookId;
  }


  @JsonProperty(JSON_PROPERTY_WEBHOOK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebhookId(Integer webhookId) {
    this.webhookId = webhookId;
  }

  public ExportWebhooksHistoryRequest email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Filter the history for a specific email
   * @return email
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }

  public ExportWebhooksHistoryRequest messageId(Integer messageId) {
    
    this.messageId = messageId;
    return this;
  }

   /**
   * Filter the history for a specific message id. Applicable only for transactional webhooks.
   * @return messageId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMessageId() {
    return messageId;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessageId(Integer messageId) {
    this.messageId = messageId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportWebhooksHistoryRequest exportWebhooksHistoryRequest = (ExportWebhooksHistoryRequest) o;
    return Objects.equals(this.days, exportWebhooksHistoryRequest.days) &&
        Objects.equals(this.startDate, exportWebhooksHistoryRequest.startDate) &&
        Objects.equals(this.endDate, exportWebhooksHistoryRequest.endDate) &&
        Objects.equals(this.sort, exportWebhooksHistoryRequest.sort) &&
        Objects.equals(this.type, exportWebhooksHistoryRequest.type) &&
        Objects.equals(this.event, exportWebhooksHistoryRequest.event) &&
        Objects.equals(this.notifyURL, exportWebhooksHistoryRequest.notifyURL) &&
        Objects.equals(this.webhookId, exportWebhooksHistoryRequest.webhookId) &&
        Objects.equals(this.email, exportWebhooksHistoryRequest.email) &&
        Objects.equals(this.messageId, exportWebhooksHistoryRequest.messageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(days, startDate, endDate, sort, type, event, notifyURL, webhookId, email, messageId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportWebhooksHistoryRequest {\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    notifyURL: ").append(toIndentedString(notifyURL)).append("\n");
    sb.append("    webhookId: ").append(toIndentedString(webhookId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
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

    // add `days` to the URL query string
    if (getDays() != null) {
      try {
        joiner.add(String.format("%sdays%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDays()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `startDate` to the URL query string
    if (getStartDate() != null) {
      try {
        joiner.add(String.format("%sstartDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStartDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `endDate` to the URL query string
    if (getEndDate() != null) {
      try {
        joiner.add(String.format("%sendDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEndDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sort` to the URL query string
    if (getSort() != null) {
      try {
        joiner.add(String.format("%ssort%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSort()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `notifyURL` to the URL query string
    if (getNotifyURL() != null) {
      try {
        joiner.add(String.format("%snotifyURL%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNotifyURL()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `webhookId` to the URL query string
    if (getWebhookId() != null) {
      try {
        joiner.add(String.format("%swebhookId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWebhookId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `email` to the URL query string
    if (getEmail() != null) {
      try {
        joiner.add(String.format("%semail%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmail()), "UTF-8").replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }

}

