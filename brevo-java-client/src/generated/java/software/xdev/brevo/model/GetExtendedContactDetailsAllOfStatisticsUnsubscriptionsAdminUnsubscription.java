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
 * GetExtendedContactDetailsAllOfStatisticsUnsubscriptionsAdminUnsubscription
 */
@JsonPropertyOrder({
  GetExtendedContactDetailsAllOfStatisticsUnsubscriptionsAdminUnsubscription.JSON_PROPERTY_EVENT_TIME,
  GetExtendedContactDetailsAllOfStatisticsUnsubscriptionsAdminUnsubscription.JSON_PROPERTY_IP
})
@JsonTypeName("getExtendedContactDetails_allOf_statistics_unsubscriptions_adminUnsubscription")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetExtendedContactDetailsAllOfStatisticsUnsubscriptionsAdminUnsubscription {
  public static final String JSON_PROPERTY_EVENT_TIME = "eventTime";
  private String eventTime;

  public static final String JSON_PROPERTY_IP = "ip";
  private String ip;

  public GetExtendedContactDetailsAllOfStatisticsUnsubscriptionsAdminUnsubscription() {
  }

  public GetExtendedContactDetailsAllOfStatisticsUnsubscriptionsAdminUnsubscription eventTime(String eventTime) {
    
    this.eventTime = eventTime;
    return this;
  }

   /**
   * UTC date-time of the event
   * @return eventTime
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EVENT_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEventTime() {
    return eventTime;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEventTime(String eventTime) {
    this.eventTime = eventTime;
  }


  public GetExtendedContactDetailsAllOfStatisticsUnsubscriptionsAdminUnsubscription ip(String ip) {
    
    this.ip = ip;
    return this;
  }

   /**
   * IP from which the user has been unsubscribed
   * @return ip
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIp() {
    return ip;
  }


  @JsonProperty(JSON_PROPERTY_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIp(String ip) {
    this.ip = ip;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetExtendedContactDetailsAllOfStatisticsUnsubscriptionsAdminUnsubscription getExtendedContactDetailsAllOfStatisticsUnsubscriptionsAdminUnsubscription = (GetExtendedContactDetailsAllOfStatisticsUnsubscriptionsAdminUnsubscription) o;
    return Objects.equals(this.eventTime, getExtendedContactDetailsAllOfStatisticsUnsubscriptionsAdminUnsubscription.eventTime) &&
        Objects.equals(this.ip, getExtendedContactDetailsAllOfStatisticsUnsubscriptionsAdminUnsubscription.ip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTime, ip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetExtendedContactDetailsAllOfStatisticsUnsubscriptionsAdminUnsubscription {\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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

    // add `eventTime` to the URL query string
    if (getEventTime() != null) {
      try {
        joiner.add(String.format("%seventTime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEventTime()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `ip` to the URL query string
    if (getIp() != null) {
      try {
        joiner.add(String.format("%sip%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIp()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

