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
 * GetSmsCampaignStats
 */
@JsonPropertyOrder({
  GetSmsCampaignStats.JSON_PROPERTY_DELIVERED,
  GetSmsCampaignStats.JSON_PROPERTY_SENT,
  GetSmsCampaignStats.JSON_PROPERTY_PROCESSING,
  GetSmsCampaignStats.JSON_PROPERTY_SOFT_BOUNCES,
  GetSmsCampaignStats.JSON_PROPERTY_HARD_BOUNCES,
  GetSmsCampaignStats.JSON_PROPERTY_UNSUBSCRIPTIONS,
  GetSmsCampaignStats.JSON_PROPERTY_ANSWERED
})
@JsonTypeName("getSmsCampaignStats")
public class GetSmsCampaignStats {
  public static final String JSON_PROPERTY_DELIVERED = "delivered";
  private Long delivered;

  public static final String JSON_PROPERTY_SENT = "sent";
  private Long sent;

  public static final String JSON_PROPERTY_PROCESSING = "processing";
  private Long processing;

  public static final String JSON_PROPERTY_SOFT_BOUNCES = "softBounces";
  private Long softBounces;

  public static final String JSON_PROPERTY_HARD_BOUNCES = "hardBounces";
  private Long hardBounces;

  public static final String JSON_PROPERTY_UNSUBSCRIPTIONS = "unsubscriptions";
  private Long unsubscriptions;

  public static final String JSON_PROPERTY_ANSWERED = "answered";
  private Long answered;

  public GetSmsCampaignStats() {
  }

  public GetSmsCampaignStats delivered(Long delivered) {
    
    this.delivered = delivered;
    return this;
  }

   /**
   * Number of delivered SMS
   * @return delivered
  **/
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


  public GetSmsCampaignStats sent(Long sent) {
    
    this.sent = sent;
    return this;
  }

   /**
   * Number of sent SMS
   * @return sent
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getSent() {
    return sent;
  }


  @JsonProperty(JSON_PROPERTY_SENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSent(Long sent) {
    this.sent = sent;
  }


  public GetSmsCampaignStats processing(Long processing) {
    
    this.processing = processing;
    return this;
  }

   /**
   * Number of processing SMS
   * @return processing
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROCESSING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getProcessing() {
    return processing;
  }


  @JsonProperty(JSON_PROPERTY_PROCESSING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProcessing(Long processing) {
    this.processing = processing;
  }


  public GetSmsCampaignStats softBounces(Long softBounces) {
    
    this.softBounces = softBounces;
    return this;
  }

   /**
   * Number of softbounced SMS
   * @return softBounces
  **/
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


  public GetSmsCampaignStats hardBounces(Long hardBounces) {
    
    this.hardBounces = hardBounces;
    return this;
  }

   /**
   * Number of hardbounced SMS
   * @return hardBounces
  **/
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


  public GetSmsCampaignStats unsubscriptions(Long unsubscriptions) {
    
    this.unsubscriptions = unsubscriptions;
    return this;
  }

   /**
   * Number of unsubscription SMS
   * @return unsubscriptions
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UNSUBSCRIPTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getUnsubscriptions() {
    return unsubscriptions;
  }


  @JsonProperty(JSON_PROPERTY_UNSUBSCRIPTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUnsubscriptions(Long unsubscriptions) {
    this.unsubscriptions = unsubscriptions;
  }


  public GetSmsCampaignStats answered(Long answered) {
    
    this.answered = answered;
    return this;
  }

   /**
   * Number of replies to the SMS
   * @return answered
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ANSWERED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getAnswered() {
    return answered;
  }


  @JsonProperty(JSON_PROPERTY_ANSWERED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAnswered(Long answered) {
    this.answered = answered;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSmsCampaignStats getSmsCampaignStats = (GetSmsCampaignStats) o;
    return Objects.equals(this.delivered, getSmsCampaignStats.delivered) &&
        Objects.equals(this.sent, getSmsCampaignStats.sent) &&
        Objects.equals(this.processing, getSmsCampaignStats.processing) &&
        Objects.equals(this.softBounces, getSmsCampaignStats.softBounces) &&
        Objects.equals(this.hardBounces, getSmsCampaignStats.hardBounces) &&
        Objects.equals(this.unsubscriptions, getSmsCampaignStats.unsubscriptions) &&
        Objects.equals(this.answered, getSmsCampaignStats.answered);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delivered, sent, processing, softBounces, hardBounces, unsubscriptions, answered);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSmsCampaignStats {\n");
    sb.append("    delivered: ").append(toIndentedString(delivered)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    processing: ").append(toIndentedString(processing)).append("\n");
    sb.append("    softBounces: ").append(toIndentedString(softBounces)).append("\n");
    sb.append("    hardBounces: ").append(toIndentedString(hardBounces)).append("\n");
    sb.append("    unsubscriptions: ").append(toIndentedString(unsubscriptions)).append("\n");
    sb.append("    answered: ").append(toIndentedString(answered)).append("\n");
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

    // add `delivered` to the URL query string
    if (getDelivered() != null) {
      try {
        joiner.add(String.format("%sdelivered%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDelivered()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sent` to the URL query string
    if (getSent() != null) {
      try {
        joiner.add(String.format("%ssent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSent()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `processing` to the URL query string
    if (getProcessing() != null) {
      try {
        joiner.add(String.format("%sprocessing%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProcessing()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `hardBounces` to the URL query string
    if (getHardBounces() != null) {
      try {
        joiner.add(String.format("%shardBounces%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getHardBounces()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `unsubscriptions` to the URL query string
    if (getUnsubscriptions() != null) {
      try {
        joiner.add(String.format("%sunsubscriptions%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUnsubscriptions()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `answered` to the URL query string
    if (getAnswered() != null) {
      try {
        joiner.add(String.format("%sanswered%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAnswered()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

