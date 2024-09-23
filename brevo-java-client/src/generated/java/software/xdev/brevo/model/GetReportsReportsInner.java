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
 * GetReportsReportsInner
 */
@JsonPropertyOrder({
  GetReportsReportsInner.JSON_PROPERTY_DATE,
  GetReportsReportsInner.JSON_PROPERTY_REQUESTS,
  GetReportsReportsInner.JSON_PROPERTY_DELIVERED,
  GetReportsReportsInner.JSON_PROPERTY_HARD_BOUNCES,
  GetReportsReportsInner.JSON_PROPERTY_SOFT_BOUNCES,
  GetReportsReportsInner.JSON_PROPERTY_CLICKS,
  GetReportsReportsInner.JSON_PROPERTY_UNIQUE_CLICKS,
  GetReportsReportsInner.JSON_PROPERTY_OPENS,
  GetReportsReportsInner.JSON_PROPERTY_UNIQUE_OPENS,
  GetReportsReportsInner.JSON_PROPERTY_SPAM_REPORTS,
  GetReportsReportsInner.JSON_PROPERTY_BLOCKED,
  GetReportsReportsInner.JSON_PROPERTY_INVALID,
  GetReportsReportsInner.JSON_PROPERTY_UNSUBSCRIBED
})
@JsonTypeName("getReports_reports_inner")
public class GetReportsReportsInner {
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

  public static final String JSON_PROPERTY_CLICKS = "clicks";
  private Long clicks;

  public static final String JSON_PROPERTY_UNIQUE_CLICKS = "uniqueClicks";
  private Long uniqueClicks;

  public static final String JSON_PROPERTY_OPENS = "opens";
  private Long opens;

  public static final String JSON_PROPERTY_UNIQUE_OPENS = "uniqueOpens";
  private Long uniqueOpens;

  public static final String JSON_PROPERTY_SPAM_REPORTS = "spamReports";
  private Long spamReports;

  public static final String JSON_PROPERTY_BLOCKED = "blocked";
  private Long blocked;

  public static final String JSON_PROPERTY_INVALID = "invalid";
  private Long invalid;

  public static final String JSON_PROPERTY_UNSUBSCRIBED = "unsubscribed";
  private Long unsubscribed;

  public GetReportsReportsInner() {
  }

  public GetReportsReportsInner date(LocalDate date) {
    
    this.date = date;
    return this;
  }

  /**
   * Date of the statistics
   * @return date
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDate(LocalDate date) {
    this.date = date;
  }

  public GetReportsReportsInner requests(Long requests) {
    
    this.requests = requests;
    return this;
  }

  /**
   * Number of requests for the date
   * @return requests
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getRequests() {
    return requests;
  }


  @JsonProperty(JSON_PROPERTY_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRequests(Long requests) {
    this.requests = requests;
  }

  public GetReportsReportsInner delivered(Long delivered) {
    
    this.delivered = delivered;
    return this;
  }

  /**
   * Number of delivered emails for the date
   * @return delivered
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DELIVERED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getDelivered() {
    return delivered;
  }


  @JsonProperty(JSON_PROPERTY_DELIVERED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDelivered(Long delivered) {
    this.delivered = delivered;
  }

  public GetReportsReportsInner hardBounces(Long hardBounces) {
    
    this.hardBounces = hardBounces;
    return this;
  }

  /**
   * Number of hardbounces for the date
   * @return hardBounces
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HARD_BOUNCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getHardBounces() {
    return hardBounces;
  }


  @JsonProperty(JSON_PROPERTY_HARD_BOUNCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHardBounces(Long hardBounces) {
    this.hardBounces = hardBounces;
  }

  public GetReportsReportsInner softBounces(Long softBounces) {
    
    this.softBounces = softBounces;
    return this;
  }

  /**
   * Number of softbounces for the date
   * @return softBounces
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SOFT_BOUNCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getSoftBounces() {
    return softBounces;
  }


  @JsonProperty(JSON_PROPERTY_SOFT_BOUNCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSoftBounces(Long softBounces) {
    this.softBounces = softBounces;
  }

  public GetReportsReportsInner clicks(Long clicks) {
    
    this.clicks = clicks;
    return this;
  }

  /**
   * Number of clicks for the date
   * @return clicks
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CLICKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getClicks() {
    return clicks;
  }


  @JsonProperty(JSON_PROPERTY_CLICKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClicks(Long clicks) {
    this.clicks = clicks;
  }

  public GetReportsReportsInner uniqueClicks(Long uniqueClicks) {
    
    this.uniqueClicks = uniqueClicks;
    return this;
  }

  /**
   * Number of unique clicks for the date
   * @return uniqueClicks
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UNIQUE_CLICKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getUniqueClicks() {
    return uniqueClicks;
  }


  @JsonProperty(JSON_PROPERTY_UNIQUE_CLICKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUniqueClicks(Long uniqueClicks) {
    this.uniqueClicks = uniqueClicks;
  }

  public GetReportsReportsInner opens(Long opens) {
    
    this.opens = opens;
    return this;
  }

  /**
   * Number of openings for the date
   * @return opens
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OPENS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getOpens() {
    return opens;
  }


  @JsonProperty(JSON_PROPERTY_OPENS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOpens(Long opens) {
    this.opens = opens;
  }

  public GetReportsReportsInner uniqueOpens(Long uniqueOpens) {
    
    this.uniqueOpens = uniqueOpens;
    return this;
  }

  /**
   * Number of unique openings for the date
   * @return uniqueOpens
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UNIQUE_OPENS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getUniqueOpens() {
    return uniqueOpens;
  }


  @JsonProperty(JSON_PROPERTY_UNIQUE_OPENS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUniqueOpens(Long uniqueOpens) {
    this.uniqueOpens = uniqueOpens;
  }

  public GetReportsReportsInner spamReports(Long spamReports) {
    
    this.spamReports = spamReports;
    return this;
  }

  /**
   * Number of complaints (spam reports) for the date
   * @return spamReports
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SPAM_REPORTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getSpamReports() {
    return spamReports;
  }


  @JsonProperty(JSON_PROPERTY_SPAM_REPORTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSpamReports(Long spamReports) {
    this.spamReports = spamReports;
  }

  public GetReportsReportsInner blocked(Long blocked) {
    
    this.blocked = blocked;
    return this;
  }

  /**
   * Number of blocked emails for the date
   * @return blocked
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BLOCKED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getBlocked() {
    return blocked;
  }


  @JsonProperty(JSON_PROPERTY_BLOCKED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBlocked(Long blocked) {
    this.blocked = blocked;
  }

  public GetReportsReportsInner invalid(Long invalid) {
    
    this.invalid = invalid;
    return this;
  }

  /**
   * Number of invalid emails for the date
   * @return invalid
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INVALID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getInvalid() {
    return invalid;
  }


  @JsonProperty(JSON_PROPERTY_INVALID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInvalid(Long invalid) {
    this.invalid = invalid;
  }

  public GetReportsReportsInner unsubscribed(Long unsubscribed) {
    
    this.unsubscribed = unsubscribed;
    return this;
  }

  /**
   * Number of unsubscribed emails for the date
   * @return unsubscribed
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UNSUBSCRIBED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getUnsubscribed() {
    return unsubscribed;
  }


  @JsonProperty(JSON_PROPERTY_UNSUBSCRIBED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUnsubscribed(Long unsubscribed) {
    this.unsubscribed = unsubscribed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetReportsReportsInner getReportsReportsInner = (GetReportsReportsInner) o;
    return Objects.equals(this.date, getReportsReportsInner.date) &&
        Objects.equals(this.requests, getReportsReportsInner.requests) &&
        Objects.equals(this.delivered, getReportsReportsInner.delivered) &&
        Objects.equals(this.hardBounces, getReportsReportsInner.hardBounces) &&
        Objects.equals(this.softBounces, getReportsReportsInner.softBounces) &&
        Objects.equals(this.clicks, getReportsReportsInner.clicks) &&
        Objects.equals(this.uniqueClicks, getReportsReportsInner.uniqueClicks) &&
        Objects.equals(this.opens, getReportsReportsInner.opens) &&
        Objects.equals(this.uniqueOpens, getReportsReportsInner.uniqueOpens) &&
        Objects.equals(this.spamReports, getReportsReportsInner.spamReports) &&
        Objects.equals(this.blocked, getReportsReportsInner.blocked) &&
        Objects.equals(this.invalid, getReportsReportsInner.invalid) &&
        Objects.equals(this.unsubscribed, getReportsReportsInner.unsubscribed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, requests, delivered, hardBounces, softBounces, clicks, uniqueClicks, opens, uniqueOpens, spamReports, blocked, invalid, unsubscribed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetReportsReportsInner {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    delivered: ").append(toIndentedString(delivered)).append("\n");
    sb.append("    hardBounces: ").append(toIndentedString(hardBounces)).append("\n");
    sb.append("    softBounces: ").append(toIndentedString(softBounces)).append("\n");
    sb.append("    clicks: ").append(toIndentedString(clicks)).append("\n");
    sb.append("    uniqueClicks: ").append(toIndentedString(uniqueClicks)).append("\n");
    sb.append("    opens: ").append(toIndentedString(opens)).append("\n");
    sb.append("    uniqueOpens: ").append(toIndentedString(uniqueOpens)).append("\n");
    sb.append("    spamReports: ").append(toIndentedString(spamReports)).append("\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
    sb.append("    invalid: ").append(toIndentedString(invalid)).append("\n");
    sb.append("    unsubscribed: ").append(toIndentedString(unsubscribed)).append("\n");
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

    // add `clicks` to the URL query string
    if (getClicks() != null) {
      try {
        joiner.add(String.format("%sclicks%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getClicks()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `uniqueClicks` to the URL query string
    if (getUniqueClicks() != null) {
      try {
        joiner.add(String.format("%suniqueClicks%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUniqueClicks()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `opens` to the URL query string
    if (getOpens() != null) {
      try {
        joiner.add(String.format("%sopens%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOpens()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `uniqueOpens` to the URL query string
    if (getUniqueOpens() != null) {
      try {
        joiner.add(String.format("%suniqueOpens%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUniqueOpens()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `spamReports` to the URL query string
    if (getSpamReports() != null) {
      try {
        joiner.add(String.format("%sspamReports%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSpamReports()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `invalid` to the URL query string
    if (getInvalid() != null) {
      try {
        joiner.add(String.format("%sinvalid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInvalid()), "UTF-8").replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }

}

