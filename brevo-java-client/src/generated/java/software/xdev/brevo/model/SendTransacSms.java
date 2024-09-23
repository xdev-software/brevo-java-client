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
 * SendTransacSms
 */
@JsonPropertyOrder({
  SendTransacSms.JSON_PROPERTY_SENDER,
  SendTransacSms.JSON_PROPERTY_RECIPIENT,
  SendTransacSms.JSON_PROPERTY_CONTENT,
  SendTransacSms.JSON_PROPERTY_TYPE,
  SendTransacSms.JSON_PROPERTY_TAG,
  SendTransacSms.JSON_PROPERTY_WEB_URL,
  SendTransacSms.JSON_PROPERTY_UNICODE_ENABLED,
  SendTransacSms.JSON_PROPERTY_ORGANISATION_PREFIX
})
@JsonTypeName("sendTransacSms")
public class SendTransacSms {
  public static final String JSON_PROPERTY_SENDER = "sender";
  private String sender;

  public static final String JSON_PROPERTY_RECIPIENT = "recipient";
  private String recipient;

  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  /**
   * Type of the SMS. Marketing SMS messages are those sent typically with marketing content. Transactional SMS messages are sent to individuals and are triggered in response to some action, such as a sign-up, purchase, etc.
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
  private TypeEnum type = TypeEnum.TRANSACTIONAL;

  public static final String JSON_PROPERTY_TAG = "tag";
  private String tag;

  public static final String JSON_PROPERTY_WEB_URL = "webUrl";
  private String webUrl;

  public static final String JSON_PROPERTY_UNICODE_ENABLED = "unicodeEnabled";
  private Boolean unicodeEnabled = false;

  public static final String JSON_PROPERTY_ORGANISATION_PREFIX = "organisationPrefix";
  private String organisationPrefix;

  public SendTransacSms() {
  }

  public SendTransacSms sender(String sender) {
    
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

  public SendTransacSms recipient(String recipient) {
    
    this.recipient = recipient;
    return this;
  }

  /**
   * Mobile number to send SMS with the country code
   * @return recipient
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RECIPIENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRecipient() {
    return recipient;
  }


  @JsonProperty(JSON_PROPERTY_RECIPIENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }

  public SendTransacSms content(String content) {
    
    this.content = content;
    return this;
  }

  /**
   * Content of the message. If more than **160 characters** long, will be sent as multiple text messages 
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

  public SendTransacSms type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

  /**
   * Type of the SMS. Marketing SMS messages are those sent typically with marketing content. Transactional SMS messages are sent to individuals and are triggered in response to some action, such as a sign-up, purchase, etc.
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }

  public SendTransacSms tag(String tag) {
    
    this.tag = tag;
    return this;
  }

  /**
   * Tag of the message
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
  public void setTag(String tag) {
    this.tag = tag;
  }

  public SendTransacSms webUrl(String webUrl) {
    
    this.webUrl = webUrl;
    return this;
  }

  /**
   * Webhook to call for each event triggered by the message (delivered etc.)
   * @return webUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEB_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWebUrl() {
    return webUrl;
  }


  @JsonProperty(JSON_PROPERTY_WEB_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebUrl(String webUrl) {
    this.webUrl = webUrl;
  }

  public SendTransacSms unicodeEnabled(Boolean unicodeEnabled) {
    
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

  public SendTransacSms organisationPrefix(String organisationPrefix) {
    
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendTransacSms sendTransacSms = (SendTransacSms) o;
    return Objects.equals(this.sender, sendTransacSms.sender) &&
        Objects.equals(this.recipient, sendTransacSms.recipient) &&
        Objects.equals(this.content, sendTransacSms.content) &&
        Objects.equals(this.type, sendTransacSms.type) &&
        Objects.equals(this.tag, sendTransacSms.tag) &&
        Objects.equals(this.webUrl, sendTransacSms.webUrl) &&
        Objects.equals(this.unicodeEnabled, sendTransacSms.unicodeEnabled) &&
        Objects.equals(this.organisationPrefix, sendTransacSms.organisationPrefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sender, recipient, content, type, tag, webUrl, unicodeEnabled, organisationPrefix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendTransacSms {\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
    sb.append("    unicodeEnabled: ").append(toIndentedString(unicodeEnabled)).append("\n");
    sb.append("    organisationPrefix: ").append(toIndentedString(organisationPrefix)).append("\n");
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

    // add `sender` to the URL query string
    if (getSender() != null) {
      try {
        joiner.add(String.format("%ssender%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSender()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `recipient` to the URL query string
    if (getRecipient() != null) {
      try {
        joiner.add(String.format("%srecipient%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRecipient()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `webUrl` to the URL query string
    if (getWebUrl() != null) {
      try {
        joiner.add(String.format("%swebUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWebUrl()), "UTF-8").replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }

}

