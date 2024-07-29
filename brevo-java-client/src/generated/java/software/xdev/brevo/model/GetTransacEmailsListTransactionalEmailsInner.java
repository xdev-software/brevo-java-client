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
 * GetTransacEmailsListTransactionalEmailsInner
 */
@JsonPropertyOrder({
  GetTransacEmailsListTransactionalEmailsInner.JSON_PROPERTY_EMAIL,
  GetTransacEmailsListTransactionalEmailsInner.JSON_PROPERTY_SUBJECT,
  GetTransacEmailsListTransactionalEmailsInner.JSON_PROPERTY_TEMPLATE_ID,
  GetTransacEmailsListTransactionalEmailsInner.JSON_PROPERTY_MESSAGE_ID,
  GetTransacEmailsListTransactionalEmailsInner.JSON_PROPERTY_UUID,
  GetTransacEmailsListTransactionalEmailsInner.JSON_PROPERTY_DATE,
  GetTransacEmailsListTransactionalEmailsInner.JSON_PROPERTY_FROM,
  GetTransacEmailsListTransactionalEmailsInner.JSON_PROPERTY_TAGS
})
@JsonTypeName("getTransacEmailsList_transactionalEmails_inner")
public class GetTransacEmailsListTransactionalEmailsInner {
  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  private String subject;

  public static final String JSON_PROPERTY_TEMPLATE_ID = "templateId";
  private Long templateId;

  public static final String JSON_PROPERTY_MESSAGE_ID = "messageId";
  private String messageId;

  public static final String JSON_PROPERTY_UUID = "uuid";
  private String uuid;

  public static final String JSON_PROPERTY_DATE = "date";
  private String date;

  public static final String JSON_PROPERTY_FROM = "from";
  private String from;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = new ArrayList<>();

  public GetTransacEmailsListTransactionalEmailsInner() {
  }

  public GetTransacEmailsListTransactionalEmailsInner email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Email address to which transactional email has been sent
   * @return email
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmail(String email) {
    this.email = email;
  }

  public GetTransacEmailsListTransactionalEmailsInner subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Subject of the sent email
   * @return subject
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSubject() {
    return subject;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubject(String subject) {
    this.subject = subject;
  }

  public GetTransacEmailsListTransactionalEmailsInner templateId(Long templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * Id of the template
   * @return templateId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTemplateId() {
    return templateId;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplateId(Long templateId) {
    this.templateId = templateId;
  }

  public GetTransacEmailsListTransactionalEmailsInner messageId(String messageId) {
    
    this.messageId = messageId;
    return this;
  }

   /**
   * Message Id of the sent email
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

  public GetTransacEmailsListTransactionalEmailsInner uuid(String uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Unique id of the email sent to a particular contact
   * @return uuid
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUuid() {
    return uuid;
  }


  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public GetTransacEmailsListTransactionalEmailsInner date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * Date on which transactional email was sent
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

  public GetTransacEmailsListTransactionalEmailsInner from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * Email address of the sender from which the email was sent
   * @return from
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFrom() {
    return from;
  }


  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFrom(String from) {
    this.from = from;
  }

  public GetTransacEmailsListTransactionalEmailsInner tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public GetTransacEmailsListTransactionalEmailsInner addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Tags used for your email
   * @return tags
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTransacEmailsListTransactionalEmailsInner getTransacEmailsListTransactionalEmailsInner = (GetTransacEmailsListTransactionalEmailsInner) o;
    return Objects.equals(this.email, getTransacEmailsListTransactionalEmailsInner.email) &&
        Objects.equals(this.subject, getTransacEmailsListTransactionalEmailsInner.subject) &&
        Objects.equals(this.templateId, getTransacEmailsListTransactionalEmailsInner.templateId) &&
        Objects.equals(this.messageId, getTransacEmailsListTransactionalEmailsInner.messageId) &&
        Objects.equals(this.uuid, getTransacEmailsListTransactionalEmailsInner.uuid) &&
        Objects.equals(this.date, getTransacEmailsListTransactionalEmailsInner.date) &&
        Objects.equals(this.from, getTransacEmailsListTransactionalEmailsInner.from) &&
        Objects.equals(this.tags, getTransacEmailsListTransactionalEmailsInner.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, subject, templateId, messageId, uuid, date, from, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTransacEmailsListTransactionalEmailsInner {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

    // add `messageId` to the URL query string
    if (getMessageId() != null) {
      try {
        joiner.add(String.format("%smessageId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMessageId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `uuid` to the URL query string
    if (getUuid() != null) {
      try {
        joiner.add(String.format("%suuid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUuid()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `from` to the URL query string
    if (getFrom() != null) {
      try {
        joiner.add(String.format("%sfrom%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFrom()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      for (int i = 0; i < getTags().size(); i++) {
        try {
          joiner.add(String.format("%stags%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getTags().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

