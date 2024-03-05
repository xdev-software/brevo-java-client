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
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * GetTransacSmsReportReportsInner
 */
@JsonPropertyOrder({
  GetTransacSmsReportReportsInner.JSON_PROPERTY_DATE,
  GetTransacSmsReportReportsInner.JSON_PROPERTY_REQUESTS,
  GetTransacSmsReportReportsInner.JSON_PROPERTY_DELIVERED,
  GetTransacSmsReportReportsInner.JSON_PROPERTY_HARD_BOUNCES,
  GetTransacSmsReportReportsInner.JSON_PROPERTY_SOFT_BOUNCES,
  GetTransacSmsReportReportsInner.JSON_PROPERTY_BLOCKED,
  GetTransacSmsReportReportsInner.JSON_PROPERTY_UNSUBSCRIBED,
  GetTransacSmsReportReportsInner.JSON_PROPERTY_REPLIED,
  GetTransacSmsReportReportsInner.JSON_PROPERTY_ACCEPTED,
  GetTransacSmsReportReportsInner.JSON_PROPERTY_REJECTED
})
@JsonTypeName("getTransacSmsReport_reports_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetTransacSmsReportReportsInner {
  public static final String JSON_PROPERTY_DATE = "date";
  private LocalDate date;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private Long requests;

  public static final String JSON_PROPERTY_DELIVERED = "delivered";
  private Long delivered;

  public static final String JSON_PROPERTY_HARD_BOUNCES = "hardBounces";
  private Long hardBounces;

  public static final String JSON_PROPERTY_SOFT_BOUNCES = "softBounces";
  private Long softBounces;

  public static final String JSON_PROPERTY_BLOCKED = "blocked";
  private Long blocked;

  public static final String JSON_PROPERTY_UNSUBSCRIBED = "unsubscribed";
  private Long unsubscribed;

  public static final String JSON_PROPERTY_REPLIED = "replied";
  private Long replied;

  public static final String JSON_PROPERTY_ACCEPTED = "accepted";
  private Long accepted;

  public static final String JSON_PROPERTY_REJECTED = "rejected";
  private Long rejected;

  public GetTransacSmsReportReportsInner() {
  }

  public GetTransacSmsReportReportsInner date(LocalDate date) {
    
    this.date = date;
    return this;
  }

   /**
   * Date for which statistics are retrieved
   * @return date
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(LocalDate date) {
    this.date = date;
  }


  public GetTransacSmsReportReportsInner requests(Long requests) {
    
    this.requests = requests;
    return this;
  }

   /**
   * Number of requests for the date
   * @return requests
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getRequests() {
    return requests;
  }


  @JsonProperty(JSON_PROPERTY_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequests(Long requests) {
    this.requests = requests;
  }


  public GetTransacSmsReportReportsInner delivered(Long delivered) {
    
    this.delivered = delivered;
    return this;
  }

   /**
   * Number of delivered SMS for the date
   * @return delivered
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELIVERED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDelivered() {
    return delivered;
  }


  @JsonProperty(JSON_PROPERTY_DELIVERED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDelivered(Long delivered) {
    this.delivered = delivered;
  }


  public GetTransacSmsReportReportsInner hardBounces(Long hardBounces) {
    
    this.hardBounces = hardBounces;
    return this;
  }

   /**
   * Number of hardbounces for the date
   * @return hardBounces
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HARD_BOUNCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getHardBounces() {
    return hardBounces;
  }


  @JsonProperty(JSON_PROPERTY_HARD_BOUNCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHardBounces(Long hardBounces) {
    this.hardBounces = hardBounces;
  }


  public GetTransacSmsReportReportsInner softBounces(Long softBounces) {
    
    this.softBounces = softBounces;
    return this;
  }

   /**
   * Number of softbounces for the date
   * @return softBounces
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOFT_BOUNCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSoftBounces() {
    return softBounces;
  }


  @JsonProperty(JSON_PROPERTY_SOFT_BOUNCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSoftBounces(Long softBounces) {
    this.softBounces = softBounces;
  }


  public GetTransacSmsReportReportsInner blocked(Long blocked) {
    
    this.blocked = blocked;
    return this;
  }

   /**
   * Number of blocked contact for the date
   * @return blocked
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BLOCKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBlocked() {
    return blocked;
  }


  @JsonProperty(JSON_PROPERTY_BLOCKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlocked(Long blocked) {
    this.blocked = blocked;
  }


  public GetTransacSmsReportReportsInner unsubscribed(Long unsubscribed) {
    
    this.unsubscribed = unsubscribed;
    return this;
  }

   /**
   * Number of unsubscription for the date
   * @return unsubscribed
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNSUBSCRIBED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUnsubscribed() {
    return unsubscribed;
  }


  @JsonProperty(JSON_PROPERTY_UNSUBSCRIBED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnsubscribed(Long unsubscribed) {
    this.unsubscribed = unsubscribed;
  }


  public GetTransacSmsReportReportsInner replied(Long replied) {
    
    this.replied = replied;
    return this;
  }

   /**
   * Number of answered SMS for the date
   * @return replied
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPLIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getReplied() {
    return replied;
  }


  @JsonProperty(JSON_PROPERTY_REPLIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReplied(Long replied) {
    this.replied = replied;
  }


  public GetTransacSmsReportReportsInner accepted(Long accepted) {
    
    this.accepted = accepted;
    return this;
  }

   /**
   * Number of accepted for the date
   * @return accepted
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCEPTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAccepted() {
    return accepted;
  }


  @JsonProperty(JSON_PROPERTY_ACCEPTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccepted(Long accepted) {
    this.accepted = accepted;
  }


  public GetTransacSmsReportReportsInner rejected(Long rejected) {
    
    this.rejected = rejected;
    return this;
  }

   /**
   * Number of rejected for the date
   * @return rejected
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REJECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getRejected() {
    return rejected;
  }


  @JsonProperty(JSON_PROPERTY_REJECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRejected(Long rejected) {
    this.rejected = rejected;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTransacSmsReportReportsInner getTransacSmsReportReportsInner = (GetTransacSmsReportReportsInner) o;
    return Objects.equals(this.date, getTransacSmsReportReportsInner.date) &&
        Objects.equals(this.requests, getTransacSmsReportReportsInner.requests) &&
        Objects.equals(this.delivered, getTransacSmsReportReportsInner.delivered) &&
        Objects.equals(this.hardBounces, getTransacSmsReportReportsInner.hardBounces) &&
        Objects.equals(this.softBounces, getTransacSmsReportReportsInner.softBounces) &&
        Objects.equals(this.blocked, getTransacSmsReportReportsInner.blocked) &&
        Objects.equals(this.unsubscribed, getTransacSmsReportReportsInner.unsubscribed) &&
        Objects.equals(this.replied, getTransacSmsReportReportsInner.replied) &&
        Objects.equals(this.accepted, getTransacSmsReportReportsInner.accepted) &&
        Objects.equals(this.rejected, getTransacSmsReportReportsInner.rejected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, requests, delivered, hardBounces, softBounces, blocked, unsubscribed, replied, accepted, rejected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTransacSmsReportReportsInner {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    delivered: ").append(toIndentedString(delivered)).append("\n");
    sb.append("    hardBounces: ").append(toIndentedString(hardBounces)).append("\n");
    sb.append("    softBounces: ").append(toIndentedString(softBounces)).append("\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
    sb.append("    unsubscribed: ").append(toIndentedString(unsubscribed)).append("\n");
    sb.append("    replied: ").append(toIndentedString(replied)).append("\n");
    sb.append("    accepted: ").append(toIndentedString(accepted)).append("\n");
    sb.append("    rejected: ").append(toIndentedString(rejected)).append("\n");
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

    // add `date` to the URL query string
    if (getDate() != null) {
      try {
        joiner.add(String.format("%sdate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `requests` to the URL query string
    if (getRequests() != null) {
      try {
        joiner.add(String.format("%srequests%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRequests()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `delivered` to the URL query string
    if (getDelivered() != null) {
      try {
        joiner.add(String.format("%sdelivered%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDelivered()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `hardBounces` to the URL query string
    if (getHardBounces() != null) {
      try {
        joiner.add(String.format("%shardBounces%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHardBounces()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `softBounces` to the URL query string
    if (getSoftBounces() != null) {
      try {
        joiner.add(String.format("%ssoftBounces%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSoftBounces()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `blocked` to the URL query string
    if (getBlocked() != null) {
      try {
        joiner.add(String.format("%sblocked%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBlocked()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `unsubscribed` to the URL query string
    if (getUnsubscribed() != null) {
      try {
        joiner.add(String.format("%sunsubscribed%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUnsubscribed()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `replied` to the URL query string
    if (getReplied() != null) {
      try {
        joiner.add(String.format("%sreplied%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReplied()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `accepted` to the URL query string
    if (getAccepted() != null) {
      try {
        joiner.add(String.format("%saccepted%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAccepted()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `rejected` to the URL query string
    if (getRejected() != null) {
      try {
        joiner.add(String.format("%srejected%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRejected()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

