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
 * RequestSmsRecipientExport
 */
@JsonPropertyOrder({
  RequestSmsRecipientExport.JSON_PROPERTY_NOTIFY_U_R_L,
  RequestSmsRecipientExport.JSON_PROPERTY_RECIPIENTS_TYPE
})
@JsonTypeName("requestSmsRecipientExport")
public class RequestSmsRecipientExport {
  public static final String JSON_PROPERTY_NOTIFY_U_R_L = "notifyURL";
  private String notifyURL;

  /**
   * Filter the recipients based on how they interacted with the campaign
   */
  public enum RecipientsTypeEnum {
    ALL("all"),
    
    DELIVERED("delivered"),
    
    ANSWERED("answered"),
    
    SOFTBOUNCES("softBounces"),
    
    HARDBOUNCES("hardBounces"),
    
    UNSUBSCRIBED("unsubscribed");

    private String value;

    RecipientsTypeEnum(String value) {
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
    public static RecipientsTypeEnum fromValue(String value) {
      for (RecipientsTypeEnum b : RecipientsTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RECIPIENTS_TYPE = "recipientsType";
  private RecipientsTypeEnum recipientsType;

  public RequestSmsRecipientExport() {
  }

  public RequestSmsRecipientExport notifyURL(String notifyURL) {
    
    this.notifyURL = notifyURL;
    return this;
  }

   /**
   * URL that will be called once the export process is finished. For reference, https://help.brevo.com/hc/en-us/articles/360007666479
   * @return notifyURL
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFY_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNotifyURL() {
    return notifyURL;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFY_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotifyURL(String notifyURL) {
    this.notifyURL = notifyURL;
  }


  public RequestSmsRecipientExport recipientsType(RecipientsTypeEnum recipientsType) {
    
    this.recipientsType = recipientsType;
    return this;
  }

   /**
   * Filter the recipients based on how they interacted with the campaign
   * @return recipientsType
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RECIPIENTS_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RecipientsTypeEnum getRecipientsType() {
    return recipientsType;
  }


  @JsonProperty(JSON_PROPERTY_RECIPIENTS_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRecipientsType(RecipientsTypeEnum recipientsType) {
    this.recipientsType = recipientsType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestSmsRecipientExport requestSmsRecipientExport = (RequestSmsRecipientExport) o;
    return Objects.equals(this.notifyURL, requestSmsRecipientExport.notifyURL) &&
        Objects.equals(this.recipientsType, requestSmsRecipientExport.recipientsType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notifyURL, recipientsType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestSmsRecipientExport {\n");
    sb.append("    notifyURL: ").append(toIndentedString(notifyURL)).append("\n");
    sb.append("    recipientsType: ").append(toIndentedString(recipientsType)).append("\n");
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

    // add `notifyURL` to the URL query string
    if (getNotifyURL() != null) {
      try {
        joiner.add(String.format("%snotifyURL%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNotifyURL()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `recipientsType` to the URL query string
    if (getRecipientsType() != null) {
      try {
        joiner.add(String.format("%srecipientsType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRecipientsType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

