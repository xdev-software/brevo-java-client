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
import software.xdev.brevo.model.CreateSmtpTemplateSender;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * CreateSmtpTemplate
 */
@JsonPropertyOrder({
  CreateSmtpTemplate.JSON_PROPERTY_TAG,
  CreateSmtpTemplate.JSON_PROPERTY_SENDER,
  CreateSmtpTemplate.JSON_PROPERTY_TEMPLATE_NAME,
  CreateSmtpTemplate.JSON_PROPERTY_HTML_CONTENT,
  CreateSmtpTemplate.JSON_PROPERTY_HTML_URL,
  CreateSmtpTemplate.JSON_PROPERTY_SUBJECT,
  CreateSmtpTemplate.JSON_PROPERTY_REPLY_TO,
  CreateSmtpTemplate.JSON_PROPERTY_TO_FIELD,
  CreateSmtpTemplate.JSON_PROPERTY_ATTACHMENT_URL,
  CreateSmtpTemplate.JSON_PROPERTY_IS_ACTIVE
})
@JsonTypeName("createSmtpTemplate")
public class CreateSmtpTemplate {
  public static final String JSON_PROPERTY_TAG = "tag";
  @jakarta.annotation.Nullable
  private String tag;

  public static final String JSON_PROPERTY_SENDER = "sender";
  @jakarta.annotation.Nonnull
  private CreateSmtpTemplateSender sender;

  public static final String JSON_PROPERTY_TEMPLATE_NAME = "templateName";
  @jakarta.annotation.Nonnull
  private String templateName;

  public static final String JSON_PROPERTY_HTML_CONTENT = "htmlContent";
  @jakarta.annotation.Nullable
  private String htmlContent;

  public static final String JSON_PROPERTY_HTML_URL = "htmlUrl";
  @jakarta.annotation.Nullable
  private String htmlUrl;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  @jakarta.annotation.Nonnull
  private String subject;

  public static final String JSON_PROPERTY_REPLY_TO = "replyTo";
  @jakarta.annotation.Nullable
  private String replyTo;

  public static final String JSON_PROPERTY_TO_FIELD = "toField";
  @jakarta.annotation.Nullable
  private String toField;

  public static final String JSON_PROPERTY_ATTACHMENT_URL = "attachmentUrl";
  @jakarta.annotation.Nullable
  private String attachmentUrl;

  public static final String JSON_PROPERTY_IS_ACTIVE = "isActive";
  @jakarta.annotation.Nullable
  private Boolean isActive;

  public CreateSmtpTemplate() {
  }

  public CreateSmtpTemplate tag(@jakarta.annotation.Nullable String tag) {
    
    this.tag = tag;
    return this;
  }

  /**
   * Tag of the template
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

  public CreateSmtpTemplate sender(@jakarta.annotation.Nonnull CreateSmtpTemplateSender sender) {
    
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

  public CreateSmtpTemplateSender getSender() {
    return sender;
  }


  @JsonProperty(JSON_PROPERTY_SENDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSender(@jakarta.annotation.Nonnull CreateSmtpTemplateSender sender) {
    this.sender = sender;
  }

  public CreateSmtpTemplate templateName(@jakarta.annotation.Nonnull String templateName) {
    
    this.templateName = templateName;
    return this;
  }

  /**
   * Name of the template
   * @return templateName
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TEMPLATE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTemplateName() {
    return templateName;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTemplateName(@jakarta.annotation.Nonnull String templateName) {
    this.templateName = templateName;
  }

  public CreateSmtpTemplate htmlContent(@jakarta.annotation.Nullable String htmlContent) {
    
    this.htmlContent = htmlContent;
    return this;
  }

  /**
   * Body of the message (HTML version). The field must have more than 10 characters. **REQUIRED if htmlUrl is empty** 
   * @return htmlContent
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTML_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHtmlContent() {
    return htmlContent;
  }


  @JsonProperty(JSON_PROPERTY_HTML_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHtmlContent(@jakarta.annotation.Nullable String htmlContent) {
    this.htmlContent = htmlContent;
  }

  public CreateSmtpTemplate htmlUrl(@jakarta.annotation.Nullable String htmlUrl) {
    
    this.htmlUrl = htmlUrl;
    return this;
  }

  /**
   * Url which contents the body of the email message. REQUIRED if htmlContent is empty
   * @return htmlUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTML_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHtmlUrl() {
    return htmlUrl;
  }


  @JsonProperty(JSON_PROPERTY_HTML_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHtmlUrl(@jakarta.annotation.Nullable String htmlUrl) {
    this.htmlUrl = htmlUrl;
  }

  public CreateSmtpTemplate subject(@jakarta.annotation.Nonnull String subject) {
    
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
  public void setSubject(@jakarta.annotation.Nonnull String subject) {
    this.subject = subject;
  }

  public CreateSmtpTemplate replyTo(@jakarta.annotation.Nullable String replyTo) {
    
    this.replyTo = replyTo;
    return this;
  }

  /**
   * Email on which campaign recipients will be able to reply to
   * @return replyTo
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPLY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReplyTo() {
    return replyTo;
  }


  @JsonProperty(JSON_PROPERTY_REPLY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReplyTo(@jakarta.annotation.Nullable String replyTo) {
    this.replyTo = replyTo;
  }

  public CreateSmtpTemplate toField(@jakarta.annotation.Nullable String toField) {
    
    this.toField = toField;
    return this;
  }

  /**
   * To personalize the **To** Field. If you want to include the first name and last name of your recipient, add **{FNAME} {LNAME}**. These contact attributes must already exist in your Brevo account. If input parameter **params** used please use **{{contact.FNAME}} {{contact.LNAME}}** for personalization 
   * @return toField
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getToField() {
    return toField;
  }


  @JsonProperty(JSON_PROPERTY_TO_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToField(@jakarta.annotation.Nullable String toField) {
    this.toField = toField;
  }

  public CreateSmtpTemplate attachmentUrl(@jakarta.annotation.Nullable String attachmentUrl) {
    
    this.attachmentUrl = attachmentUrl;
    return this;
  }

  /**
   * Absolute url of the attachment (**no local file**). Extension allowed: #### xlsx, xls, ods, docx, docm, doc, csv, pdf, txt, gif, jpg, jpeg, png, tif, tiff, rtf, bmp, cgm, css, shtml, html, htm, zip, xml, ppt, pptx, tar, ez, ics, mobi, msg, pub and eps&#39; 
   * @return attachmentUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTACHMENT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAttachmentUrl() {
    return attachmentUrl;
  }


  @JsonProperty(JSON_PROPERTY_ATTACHMENT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttachmentUrl(@jakarta.annotation.Nullable String attachmentUrl) {
    this.attachmentUrl = attachmentUrl;
  }

  public CreateSmtpTemplate isActive(@jakarta.annotation.Nullable Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

  /**
   * Status of template. isActive &#x3D; true means template is active and isActive &#x3D; false means template is inactive
   * @return isActive
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsActive() {
    return isActive;
  }


  @JsonProperty(JSON_PROPERTY_IS_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsActive(@jakarta.annotation.Nullable Boolean isActive) {
    this.isActive = isActive;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSmtpTemplate createSmtpTemplate = (CreateSmtpTemplate) o;
    return Objects.equals(this.tag, createSmtpTemplate.tag) &&
        Objects.equals(this.sender, createSmtpTemplate.sender) &&
        Objects.equals(this.templateName, createSmtpTemplate.templateName) &&
        Objects.equals(this.htmlContent, createSmtpTemplate.htmlContent) &&
        Objects.equals(this.htmlUrl, createSmtpTemplate.htmlUrl) &&
        Objects.equals(this.subject, createSmtpTemplate.subject) &&
        Objects.equals(this.replyTo, createSmtpTemplate.replyTo) &&
        Objects.equals(this.toField, createSmtpTemplate.toField) &&
        Objects.equals(this.attachmentUrl, createSmtpTemplate.attachmentUrl) &&
        Objects.equals(this.isActive, createSmtpTemplate.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag, sender, templateName, htmlContent, htmlUrl, subject, replyTo, toField, attachmentUrl, isActive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSmtpTemplate {\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    htmlContent: ").append(toIndentedString(htmlContent)).append("\n");
    sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    replyTo: ").append(toIndentedString(replyTo)).append("\n");
    sb.append("    toField: ").append(toIndentedString(toField)).append("\n");
    sb.append("    attachmentUrl: ").append(toIndentedString(attachmentUrl)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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

    // add `tag` to the URL query string
    if (getTag() != null) {
      try {
        joiner.add(String.format("%stag%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTag()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sender` to the URL query string
    if (getSender() != null) {
      joiner.add(getSender().toUrlQueryString(prefix + "sender" + suffix));
    }

    // add `templateName` to the URL query string
    if (getTemplateName() != null) {
      try {
        joiner.add(String.format("%stemplateName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTemplateName()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `htmlUrl` to the URL query string
    if (getHtmlUrl() != null) {
      try {
        joiner.add(String.format("%shtmlUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHtmlUrl()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `attachmentUrl` to the URL query string
    if (getAttachmentUrl() != null) {
      try {
        joiner.add(String.format("%sattachmentUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAttachmentUrl()), "UTF-8").replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }

}

