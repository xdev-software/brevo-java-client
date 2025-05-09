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
import software.xdev.brevo.model.GetTransacEmailContentEventsInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * GetTransacEmailContent
 */
@JsonPropertyOrder({
  GetTransacEmailContent.JSON_PROPERTY_EMAIL,
  GetTransacEmailContent.JSON_PROPERTY_SUBJECT,
  GetTransacEmailContent.JSON_PROPERTY_TEMPLATE_ID,
  GetTransacEmailContent.JSON_PROPERTY_DATE,
  GetTransacEmailContent.JSON_PROPERTY_EVENTS,
  GetTransacEmailContent.JSON_PROPERTY_BODY,
  GetTransacEmailContent.JSON_PROPERTY_ATTACHMENT_COUNT
})
@JsonTypeName("getTransacEmailContent")
public class GetTransacEmailContent {
  public static final String JSON_PROPERTY_EMAIL = "email";
  @jakarta.annotation.Nonnull
  private String email;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  @jakarta.annotation.Nonnull
  private String subject;

  public static final String JSON_PROPERTY_TEMPLATE_ID = "templateId";
  @jakarta.annotation.Nullable
  private Long templateId;

  public static final String JSON_PROPERTY_DATE = "date";
  @jakarta.annotation.Nonnull
  private String date;

  public static final String JSON_PROPERTY_EVENTS = "events";
  @jakarta.annotation.Nonnull
  private List<GetTransacEmailContentEventsInner> events = new ArrayList<>();

  public static final String JSON_PROPERTY_BODY = "body";
  @jakarta.annotation.Nonnull
  private String body;

  public static final String JSON_PROPERTY_ATTACHMENT_COUNT = "attachmentCount";
  @jakarta.annotation.Nonnull
  private Long attachmentCount;

  public GetTransacEmailContent() {
  }

  public GetTransacEmailContent email(@jakarta.annotation.Nonnull String email) {
    
    this.email = email;
    return this;
  }

  /**
   * Email address to which transactional email has been sent
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

  public GetTransacEmailContent subject(@jakarta.annotation.Nonnull String subject) {
    
    this.subject = subject;
    return this;
  }

  /**
   * Subject of the sent email
   * @return subject
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSubject() {
    return subject;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubject(@jakarta.annotation.Nonnull String subject) {
    this.subject = subject;
  }

  public GetTransacEmailContent templateId(@jakarta.annotation.Nullable Long templateId) {
    
    this.templateId = templateId;
    return this;
  }

  /**
   * Id of the template
   * @return templateId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTemplateId() {
    return templateId;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplateId(@jakarta.annotation.Nullable Long templateId) {
    this.templateId = templateId;
  }

  public GetTransacEmailContent date(@jakarta.annotation.Nonnull String date) {
    
    this.date = date;
    return this;
  }

  /**
   * Date on which transactional email was sent
   * @return date
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDate(@jakarta.annotation.Nonnull String date) {
    this.date = date;
  }

  public GetTransacEmailContent events(@jakarta.annotation.Nonnull List<GetTransacEmailContentEventsInner> events) {
    
    this.events = events;
    return this;
  }

  public GetTransacEmailContent addEventsItem(GetTransacEmailContentEventsInner eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

  /**
   * Series of events which occurred on the transactional email
   * @return events
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<GetTransacEmailContentEventsInner> getEvents() {
    return events;
  }


  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEvents(@jakarta.annotation.Nonnull List<GetTransacEmailContentEventsInner> events) {
    this.events = events;
  }

  public GetTransacEmailContent body(@jakarta.annotation.Nonnull String body) {
    
    this.body = body;
    return this;
  }

  /**
   * Actual content of the transactional email that has been sent
   * @return body
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBody() {
    return body;
  }


  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBody(@jakarta.annotation.Nonnull String body) {
    this.body = body;
  }

  public GetTransacEmailContent attachmentCount(@jakarta.annotation.Nonnull Long attachmentCount) {
    
    this.attachmentCount = attachmentCount;
    return this;
  }

  /**
   * Count of the attachments that were sent in the email
   * @return attachmentCount
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ATTACHMENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getAttachmentCount() {
    return attachmentCount;
  }


  @JsonProperty(JSON_PROPERTY_ATTACHMENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAttachmentCount(@jakarta.annotation.Nonnull Long attachmentCount) {
    this.attachmentCount = attachmentCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTransacEmailContent getTransacEmailContent = (GetTransacEmailContent) o;
    return Objects.equals(this.email, getTransacEmailContent.email) &&
        Objects.equals(this.subject, getTransacEmailContent.subject) &&
        Objects.equals(this.templateId, getTransacEmailContent.templateId) &&
        Objects.equals(this.date, getTransacEmailContent.date) &&
        Objects.equals(this.events, getTransacEmailContent.events) &&
        Objects.equals(this.body, getTransacEmailContent.body) &&
        Objects.equals(this.attachmentCount, getTransacEmailContent.attachmentCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, subject, templateId, date, events, body, attachmentCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTransacEmailContent {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    attachmentCount: ").append(toIndentedString(attachmentCount)).append("\n");
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

    // add `subject` to the URL query string
    if (getSubject() != null) {
      try {
        joiner.add(String.format("%ssubject%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSubject()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `templateId` to the URL query string
    if (getTemplateId() != null) {
      try {
        joiner.add(String.format("%stemplateId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTemplateId()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `events` to the URL query string
    if (getEvents() != null) {
      for (int i = 0; i < getEvents().size(); i++) {
        if (getEvents().get(i) != null) {
          joiner.add(getEvents().get(i).toUrlQueryString(String.format("%sevents%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
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

    // add `attachmentCount` to the URL query string
    if (getAttachmentCount() != null) {
      try {
        joiner.add(String.format("%sattachmentCount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAttachmentCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

