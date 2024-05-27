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
import software.xdev.brevo.model.CreateWhatsAppCampaignRecipients;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * CreateWhatsAppCampaign
 */
@JsonPropertyOrder({
  CreateWhatsAppCampaign.JSON_PROPERTY_NAME,
  CreateWhatsAppCampaign.JSON_PROPERTY_TEMPLATE_ID,
  CreateWhatsAppCampaign.JSON_PROPERTY_SCHEDULED_AT,
  CreateWhatsAppCampaign.JSON_PROPERTY_RECIPIENTS
})
@JsonTypeName("createWhatsAppCampaign")
public class CreateWhatsAppCampaign {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TEMPLATE_ID = "templateId";
  private Integer templateId;

  public static final String JSON_PROPERTY_SCHEDULED_AT = "scheduledAt";
  private String scheduledAt;

  public static final String JSON_PROPERTY_RECIPIENTS = "recipients";
  private CreateWhatsAppCampaignRecipients recipients;

  public CreateWhatsAppCampaign() {
  }

  public CreateWhatsAppCampaign name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the WhatsApp campaign creation
   * @return name
  **/
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


  public CreateWhatsAppCampaign templateId(Integer templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * Id of the WhatsApp template in **approved** state
   * @return templateId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTemplateId() {
    return templateId;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTemplateId(Integer templateId) {
    this.templateId = templateId;
  }


  public CreateWhatsAppCampaign scheduledAt(String scheduledAt) {
    
    this.scheduledAt = scheduledAt;
    return this;
  }

   /**
   * Sending UTC date-time (YYYY-MM-DDTHH:mm:ss.SSSZ). **Prefer to pass your timezone in date-time format for accurate result.For example: **2017-06-01T12:30:00+02:00** 
   * @return scheduledAt
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SCHEDULED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getScheduledAt() {
    return scheduledAt;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScheduledAt(String scheduledAt) {
    this.scheduledAt = scheduledAt;
  }


  public CreateWhatsAppCampaign recipients(CreateWhatsAppCampaignRecipients recipients) {
    
    this.recipients = recipients;
    return this;
  }

   /**
   * Get recipients
   * @return recipients
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RECIPIENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CreateWhatsAppCampaignRecipients getRecipients() {
    return recipients;
  }


  @JsonProperty(JSON_PROPERTY_RECIPIENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRecipients(CreateWhatsAppCampaignRecipients recipients) {
    this.recipients = recipients;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWhatsAppCampaign createWhatsAppCampaign = (CreateWhatsAppCampaign) o;
    return Objects.equals(this.name, createWhatsAppCampaign.name) &&
        Objects.equals(this.templateId, createWhatsAppCampaign.templateId) &&
        Objects.equals(this.scheduledAt, createWhatsAppCampaign.scheduledAt) &&
        Objects.equals(this.recipients, createWhatsAppCampaign.recipients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, templateId, scheduledAt, recipients);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWhatsAppCampaign {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `scheduledAt` to the URL query string
    if (getScheduledAt() != null) {
      try {
        joiner.add(String.format("%sscheduledAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getScheduledAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `recipients` to the URL query string
    if (getRecipients() != null) {
      joiner.add(getRecipients().toUrlQueryString(prefix + "recipients" + suffix));
    }

    return joiner.toString();
  }

}
