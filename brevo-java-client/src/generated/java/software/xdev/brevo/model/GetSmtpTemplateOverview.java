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
import software.xdev.brevo.model.GetSmtpTemplateOverviewSender;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * GetSmtpTemplateOverview
 */
@JsonPropertyOrder({
  GetSmtpTemplateOverview.JSON_PROPERTY_ID,
  GetSmtpTemplateOverview.JSON_PROPERTY_NAME,
  GetSmtpTemplateOverview.JSON_PROPERTY_SUBJECT,
  GetSmtpTemplateOverview.JSON_PROPERTY_IS_ACTIVE,
  GetSmtpTemplateOverview.JSON_PROPERTY_TEST_SENT,
  GetSmtpTemplateOverview.JSON_PROPERTY_SENDER,
  GetSmtpTemplateOverview.JSON_PROPERTY_REPLY_TO,
  GetSmtpTemplateOverview.JSON_PROPERTY_TO_FIELD,
  GetSmtpTemplateOverview.JSON_PROPERTY_TAG,
  GetSmtpTemplateOverview.JSON_PROPERTY_HTML_CONTENT,
  GetSmtpTemplateOverview.JSON_PROPERTY_CREATED_AT,
  GetSmtpTemplateOverview.JSON_PROPERTY_MODIFIED_AT,
  GetSmtpTemplateOverview.JSON_PROPERTY_DOI_TEMPLATE
})
@JsonTypeName("getSmtpTemplateOverview")
public class GetSmtpTemplateOverview {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  private String subject;

  public static final String JSON_PROPERTY_IS_ACTIVE = "isActive";
  private Boolean isActive;

  public static final String JSON_PROPERTY_TEST_SENT = "testSent";
  private Boolean testSent;

  public static final String JSON_PROPERTY_SENDER = "sender";
  private GetSmtpTemplateOverviewSender sender;

  public static final String JSON_PROPERTY_REPLY_TO = "replyTo";
  private String replyTo;

  public static final String JSON_PROPERTY_TO_FIELD = "toField";
  private String toField;

  public static final String JSON_PROPERTY_TAG = "tag";
  private String tag;

  public static final String JSON_PROPERTY_HTML_CONTENT = "htmlContent";
  private String htmlContent;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private String createdAt;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modifiedAt";
  private String modifiedAt;

  public static final String JSON_PROPERTY_DOI_TEMPLATE = "doiTemplate";
  private Boolean doiTemplate;

  public GetSmtpTemplateOverview() {
  }

  public GetSmtpTemplateOverview id(Long id) {
    
    this.id = id;
    return this;
  }

  /**
   * ID of the template
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
  public void setId(Long id) {
    this.id = id;
  }

  public GetSmtpTemplateOverview name(String name) {
    
    this.name = name;
    return this;
  }

  /**
   * Name of the template
   * @return name
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }

  public GetSmtpTemplateOverview subject(String subject) {
    
    this.subject = subject;
    return this;
  }

  /**
   * Subject of the template
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
  public void setSubject(String subject) {
    this.subject = subject;
  }

  public GetSmtpTemplateOverview isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

  /**
   * Status of template (true&#x3D;active, false&#x3D;inactive)
   * @return isActive
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsActive() {
    return isActive;
  }


  @JsonProperty(JSON_PROPERTY_IS_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public GetSmtpTemplateOverview testSent(Boolean testSent) {
    
    this.testSent = testSent;
    return this;
  }

  /**
   * Status of test sending for the template (true&#x3D;test email has been sent, false&#x3D;test email has not been sent)
   * @return testSent
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TEST_SENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getTestSent() {
    return testSent;
  }


  @JsonProperty(JSON_PROPERTY_TEST_SENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTestSent(Boolean testSent) {
    this.testSent = testSent;
  }

  public GetSmtpTemplateOverview sender(GetSmtpTemplateOverviewSender sender) {
    
    this.sender = sender;
    return this;
  }

  /**
   * Get sender
   * @return sender
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SENDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GetSmtpTemplateOverviewSender getSender() {
    return sender;
  }


  @JsonProperty(JSON_PROPERTY_SENDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSender(GetSmtpTemplateOverviewSender sender) {
    this.sender = sender;
  }

  public GetSmtpTemplateOverview replyTo(String replyTo) {
    
    this.replyTo = replyTo;
    return this;
  }

  /**
   * Email defined as the \&quot;Reply to\&quot; for the template
   * @return replyTo
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REPLY_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getReplyTo() {
    return replyTo;
  }


  @JsonProperty(JSON_PROPERTY_REPLY_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReplyTo(String replyTo) {
    this.replyTo = replyTo;
  }

  public GetSmtpTemplateOverview toField(String toField) {
    
    this.toField = toField;
    return this;
  }

  /**
   * Customisation of the \&quot;to\&quot; field for the template
   * @return toField
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TO_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getToField() {
    return toField;
  }


  @JsonProperty(JSON_PROPERTY_TO_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setToField(String toField) {
    this.toField = toField;
  }

  public GetSmtpTemplateOverview tag(String tag) {
    
    this.tag = tag;
    return this;
  }

  /**
   * Tag of the template
   * @return tag
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TAG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTag() {
    return tag;
  }


  @JsonProperty(JSON_PROPERTY_TAG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTag(String tag) {
    this.tag = tag;
  }

  public GetSmtpTemplateOverview htmlContent(String htmlContent) {
    
    this.htmlContent = htmlContent;
    return this;
  }

  /**
   * HTML content of the template
   * @return htmlContent
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HTML_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getHtmlContent() {
    return htmlContent;
  }


  @JsonProperty(JSON_PROPERTY_HTML_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHtmlContent(String htmlContent) {
    this.htmlContent = htmlContent;
  }

  public GetSmtpTemplateOverview createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Creation UTC date-time of the template (YYYY-MM-DDTHH:mm:ss.SSSZ)
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
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public GetSmtpTemplateOverview modifiedAt(String modifiedAt) {
    
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * Last modification UTC date-time of the template (YYYY-MM-DDTHH:mm:ss.SSSZ)
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
  public void setModifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public GetSmtpTemplateOverview doiTemplate(Boolean doiTemplate) {
    
    this.doiTemplate = doiTemplate;
    return this;
  }

  /**
   * It is true if template is a valid Double opt-in (DOI) template, otherwise it is false. This field will be available only in case of single template detail call.
   * @return doiTemplate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOI_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDoiTemplate() {
    return doiTemplate;
  }


  @JsonProperty(JSON_PROPERTY_DOI_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDoiTemplate(Boolean doiTemplate) {
    this.doiTemplate = doiTemplate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSmtpTemplateOverview getSmtpTemplateOverview = (GetSmtpTemplateOverview) o;
    return Objects.equals(this.id, getSmtpTemplateOverview.id) &&
        Objects.equals(this.name, getSmtpTemplateOverview.name) &&
        Objects.equals(this.subject, getSmtpTemplateOverview.subject) &&
        Objects.equals(this.isActive, getSmtpTemplateOverview.isActive) &&
        Objects.equals(this.testSent, getSmtpTemplateOverview.testSent) &&
        Objects.equals(this.sender, getSmtpTemplateOverview.sender) &&
        Objects.equals(this.replyTo, getSmtpTemplateOverview.replyTo) &&
        Objects.equals(this.toField, getSmtpTemplateOverview.toField) &&
        Objects.equals(this.tag, getSmtpTemplateOverview.tag) &&
        Objects.equals(this.htmlContent, getSmtpTemplateOverview.htmlContent) &&
        Objects.equals(this.createdAt, getSmtpTemplateOverview.createdAt) &&
        Objects.equals(this.modifiedAt, getSmtpTemplateOverview.modifiedAt) &&
        Objects.equals(this.doiTemplate, getSmtpTemplateOverview.doiTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, subject, isActive, testSent, sender, replyTo, toField, tag, htmlContent, createdAt, modifiedAt, doiTemplate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSmtpTemplateOverview {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    testSent: ").append(toIndentedString(testSent)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    replyTo: ").append(toIndentedString(replyTo)).append("\n");
    sb.append("    toField: ").append(toIndentedString(toField)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    htmlContent: ").append(toIndentedString(htmlContent)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    doiTemplate: ").append(toIndentedString(doiTemplate)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `isActive` to the URL query string
    if (getIsActive() != null) {
      try {
        joiner.add(String.format("%sisActive%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsActive()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `testSent` to the URL query string
    if (getTestSent() != null) {
      try {
        joiner.add(String.format("%stestSent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTestSent()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sender` to the URL query string
    if (getSender() != null) {
      joiner.add(getSender().toUrlQueryString(prefix + "sender" + suffix));
    }

    // add `replyTo` to the URL query string
    if (getReplyTo() != null) {
      try {
        joiner.add(String.format("%sreplyTo%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReplyTo()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `toField` to the URL query string
    if (getToField() != null) {
      try {
        joiner.add(String.format("%stoField%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getToField()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `htmlContent` to the URL query string
    if (getHtmlContent() != null) {
      try {
        joiner.add(String.format("%shtmlContent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHtmlContent()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `doiTemplate` to the URL query string
    if (getDoiTemplate() != null) {
      try {
        joiner.add(String.format("%sdoiTemplate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDoiTemplate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

