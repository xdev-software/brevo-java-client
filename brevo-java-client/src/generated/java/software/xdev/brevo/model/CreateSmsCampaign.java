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
import software.xdev.brevo.model.CreateSmsCampaignRecipients;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * CreateSmsCampaign
 */
@JsonPropertyOrder({
  CreateSmsCampaign.JSON_PROPERTY_NAME,
  CreateSmsCampaign.JSON_PROPERTY_SENDER,
  CreateSmsCampaign.JSON_PROPERTY_CONTENT,
  CreateSmsCampaign.JSON_PROPERTY_RECIPIENTS,
  CreateSmsCampaign.JSON_PROPERTY_SCHEDULED_AT,
  CreateSmsCampaign.JSON_PROPERTY_UNICODE_ENABLED,
  CreateSmsCampaign.JSON_PROPERTY_ORGANISATION_PREFIX,
  CreateSmsCampaign.JSON_PROPERTY_UNSUBSCRIBE_INSTRUCTION
})
@JsonTypeName("createSmsCampaign")
public class CreateSmsCampaign {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SENDER = "sender";
  private String sender;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  public static final String JSON_PROPERTY_RECIPIENTS = "recipients";
  private CreateSmsCampaignRecipients recipients;

  public static final String JSON_PROPERTY_SCHEDULED_AT = "scheduledAt";
  private String scheduledAt;

  public static final String JSON_PROPERTY_UNICODE_ENABLED = "unicodeEnabled";
  private Boolean unicodeEnabled = false;

  public static final String JSON_PROPERTY_ORGANISATION_PREFIX = "organisationPrefix";
  private String organisationPrefix;

  public static final String JSON_PROPERTY_UNSUBSCRIBE_INSTRUCTION = "unsubscribeInstruction";
  private String unsubscribeInstruction;

  public CreateSmsCampaign() {
  }

  public CreateSmsCampaign name(String name) {
    
    this.name = name;
    return this;
  }

  /**
   * Name of the campaign
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

  public CreateSmsCampaign sender(String sender) {
    
    this.sender = sender;
    return this;
  }

  /**
   * Name of the sender. **The number of characters is limited to 11 for alphanumeric characters and 15 for numeric characters** 
   * @return sender
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SENDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSender() {
    return sender;
  }


  @JsonProperty(JSON_PROPERTY_SENDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSender(String sender) {
    this.sender = sender;
  }

  public CreateSmsCampaign content(String content) {
    
    this.content = content;
    return this;
  }

  /**
   * Content of the message. The **maximum characters used per SMS is 160**, if used more than that, it will be counted as more than one SMS 
   * @return content
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContent(String content) {
    this.content = content;
  }

  public CreateSmsCampaign recipients(CreateSmsCampaignRecipients recipients) {
    
    this.recipients = recipients;
    return this;
  }

  /**
   * Get recipients
   * @return recipients
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECIPIENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CreateSmsCampaignRecipients getRecipients() {
    return recipients;
  }


  @JsonProperty(JSON_PROPERTY_RECIPIENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecipients(CreateSmsCampaignRecipients recipients) {
    this.recipients = recipients;
  }

  public CreateSmsCampaign scheduledAt(String scheduledAt) {
    
    this.scheduledAt = scheduledAt;
    return this;
  }

  /**
   * UTC date-time on which the campaign has to run (YYYY-MM-DDTHH:mm:ss.SSSZ). **Prefer to pass your timezone in date-time format for accurate result.** 
   * @return scheduledAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEDULED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getScheduledAt() {
    return scheduledAt;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScheduledAt(String scheduledAt) {
    this.scheduledAt = scheduledAt;
  }

  public CreateSmsCampaign unicodeEnabled(Boolean unicodeEnabled) {
    
    this.unicodeEnabled = unicodeEnabled;
    return this;
  }

  /**
   * Format of the message. It indicates whether the content should be treated as unicode or not. 
   * @return unicodeEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNICODE_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUnicodeEnabled() {
    return unicodeEnabled;
  }


  @JsonProperty(JSON_PROPERTY_UNICODE_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnicodeEnabled(Boolean unicodeEnabled) {
    this.unicodeEnabled = unicodeEnabled;
  }

  public CreateSmsCampaign organisationPrefix(String organisationPrefix) {
    
    this.organisationPrefix = organisationPrefix;
    return this;
  }

  /**
   * A recognizable prefix will ensure your audience knows who you are. Recommended by U.S. carriers. This will be added as your Brand Name before the message content. **Prefer verifying maximum length of 160 characters including this prefix in message content to avoid multiple sending of same sms.**
   * @return organisationPrefix
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORGANISATION_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrganisationPrefix() {
    return organisationPrefix;
  }


  @JsonProperty(JSON_PROPERTY_ORGANISATION_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrganisationPrefix(String organisationPrefix) {
    this.organisationPrefix = organisationPrefix;
  }

  public CreateSmsCampaign unsubscribeInstruction(String unsubscribeInstruction) {
    
    this.unsubscribeInstruction = unsubscribeInstruction;
    return this;
  }

  /**
   * Instructions to unsubscribe from future communications. Recommended by U.S. carriers. Must include **STOP** keyword. This will be added as instructions after the end of message content. **Prefer verifying maximum length of 160 characters including this instructions in message content to avoid multiple sending of same sms.**
   * @return unsubscribeInstruction
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNSUBSCRIBE_INSTRUCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUnsubscribeInstruction() {
    return unsubscribeInstruction;
  }


  @JsonProperty(JSON_PROPERTY_UNSUBSCRIBE_INSTRUCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnsubscribeInstruction(String unsubscribeInstruction) {
    this.unsubscribeInstruction = unsubscribeInstruction;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSmsCampaign createSmsCampaign = (CreateSmsCampaign) o;
    return Objects.equals(this.name, createSmsCampaign.name) &&
        Objects.equals(this.sender, createSmsCampaign.sender) &&
        Objects.equals(this.content, createSmsCampaign.content) &&
        Objects.equals(this.recipients, createSmsCampaign.recipients) &&
        Objects.equals(this.scheduledAt, createSmsCampaign.scheduledAt) &&
        Objects.equals(this.unicodeEnabled, createSmsCampaign.unicodeEnabled) &&
        Objects.equals(this.organisationPrefix, createSmsCampaign.organisationPrefix) &&
        Objects.equals(this.unsubscribeInstruction, createSmsCampaign.unsubscribeInstruction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, sender, content, recipients, scheduledAt, unicodeEnabled, organisationPrefix, unsubscribeInstruction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSmsCampaign {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
    sb.append("    unicodeEnabled: ").append(toIndentedString(unicodeEnabled)).append("\n");
    sb.append("    organisationPrefix: ").append(toIndentedString(organisationPrefix)).append("\n");
    sb.append("    unsubscribeInstruction: ").append(toIndentedString(unsubscribeInstruction)).append("\n");
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

    // add `sender` to the URL query string
    if (getSender() != null) {
      try {
        joiner.add(String.format("%ssender%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSender()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `content` to the URL query string
    if (getContent() != null) {
      try {
        joiner.add(String.format("%scontent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getContent()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `recipients` to the URL query string
    if (getRecipients() != null) {
      joiner.add(getRecipients().toUrlQueryString(prefix + "recipients" + suffix));
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

    // add `unicodeEnabled` to the URL query string
    if (getUnicodeEnabled() != null) {
      try {
        joiner.add(String.format("%sunicodeEnabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUnicodeEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `organisationPrefix` to the URL query string
    if (getOrganisationPrefix() != null) {
      try {
        joiner.add(String.format("%sorganisationPrefix%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOrganisationPrefix()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `unsubscribeInstruction` to the URL query string
    if (getUnsubscribeInstruction() != null) {
      try {
        joiner.add(String.format("%sunsubscribeInstruction%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUnsubscribeInstruction()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

