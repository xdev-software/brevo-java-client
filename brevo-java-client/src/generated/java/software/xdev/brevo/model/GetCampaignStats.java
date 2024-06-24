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
 * GetCampaignStats
 */
@JsonPropertyOrder({
  GetCampaignStats.JSON_PROPERTY_LIST_ID,
  GetCampaignStats.JSON_PROPERTY_UNIQUE_CLICKS,
  GetCampaignStats.JSON_PROPERTY_CLICKERS,
  GetCampaignStats.JSON_PROPERTY_COMPLAINTS,
  GetCampaignStats.JSON_PROPERTY_DELIVERED,
  GetCampaignStats.JSON_PROPERTY_SENT,
  GetCampaignStats.JSON_PROPERTY_SOFT_BOUNCES,
  GetCampaignStats.JSON_PROPERTY_HARD_BOUNCES,
  GetCampaignStats.JSON_PROPERTY_UNIQUE_VIEWS,
  GetCampaignStats.JSON_PROPERTY_TRACKABLE_VIEWS,
  GetCampaignStats.JSON_PROPERTY_TRACKABLE_VIEWS_RATE,
  GetCampaignStats.JSON_PROPERTY_ESTIMATED_VIEWS,
  GetCampaignStats.JSON_PROPERTY_UNSUBSCRIPTIONS,
  GetCampaignStats.JSON_PROPERTY_VIEWED,
  GetCampaignStats.JSON_PROPERTY_DEFERRED,
  GetCampaignStats.JSON_PROPERTY_RETURN_BOUNCE
})
@JsonTypeName("getCampaignStats")
public class GetCampaignStats {
  public static final String JSON_PROPERTY_LIST_ID = "listId";
  private Long listId;

  public static final String JSON_PROPERTY_UNIQUE_CLICKS = "uniqueClicks";
  private Long uniqueClicks;

  public static final String JSON_PROPERTY_CLICKERS = "clickers";
  private Long clickers;

  public static final String JSON_PROPERTY_COMPLAINTS = "complaints";
  private Long complaints;

  public static final String JSON_PROPERTY_DELIVERED = "delivered";
  private Long delivered;

  public static final String JSON_PROPERTY_SENT = "sent";
  private Long sent;

  public static final String JSON_PROPERTY_SOFT_BOUNCES = "softBounces";
  private Long softBounces;

  public static final String JSON_PROPERTY_HARD_BOUNCES = "hardBounces";
  private Long hardBounces;

  public static final String JSON_PROPERTY_UNIQUE_VIEWS = "uniqueViews";
  private Long uniqueViews;

  public static final String JSON_PROPERTY_TRACKABLE_VIEWS = "trackableViews";
  private Long trackableViews;

  public static final String JSON_PROPERTY_TRACKABLE_VIEWS_RATE = "trackableViewsRate";
  private Float trackableViewsRate;

  public static final String JSON_PROPERTY_ESTIMATED_VIEWS = "estimatedViews";
  private Long estimatedViews;

  public static final String JSON_PROPERTY_UNSUBSCRIPTIONS = "unsubscriptions";
  private Long unsubscriptions;

  public static final String JSON_PROPERTY_VIEWED = "viewed";
  private Long viewed;

  public static final String JSON_PROPERTY_DEFERRED = "deferred";
  private Long deferred;

  public static final String JSON_PROPERTY_RETURN_BOUNCE = "returnBounce";
  private Long returnBounce;

  public GetCampaignStats() {
  }

  public GetCampaignStats listId(Long listId) {
    
    this.listId = listId;
    return this;
  }

   /**
   * List Id of email campaign (only in case of get email campaign(s)(not for global stats))
   * @return listId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getListId() {
    return listId;
  }


  @JsonProperty(JSON_PROPERTY_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setListId(Long listId) {
    this.listId = listId;
  }

  public GetCampaignStats uniqueClicks(Long uniqueClicks) {
    
    this.uniqueClicks = uniqueClicks;
    return this;
  }

   /**
   * Number of unique clicks for the campaign
   * @return uniqueClicks
  **/
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

  public GetCampaignStats clickers(Long clickers) {
    
    this.clickers = clickers;
    return this;
  }

   /**
   * Number of total clicks for the campaign
   * @return clickers
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CLICKERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getClickers() {
    return clickers;
  }


  @JsonProperty(JSON_PROPERTY_CLICKERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClickers(Long clickers) {
    this.clickers = clickers;
  }

  public GetCampaignStats complaints(Long complaints) {
    
    this.complaints = complaints;
    return this;
  }

   /**
   * Number of complaints (Spam reports) for the campaign
   * @return complaints
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COMPLAINTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getComplaints() {
    return complaints;
  }


  @JsonProperty(JSON_PROPERTY_COMPLAINTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setComplaints(Long complaints) {
    this.complaints = complaints;
  }

  public GetCampaignStats delivered(Long delivered) {
    
    this.delivered = delivered;
    return this;
  }

   /**
   * Number of delivered emails for the campaign
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

  public GetCampaignStats sent(Long sent) {
    
    this.sent = sent;
    return this;
  }

   /**
   * Number of sent emails for the campaign
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

  public GetCampaignStats softBounces(Long softBounces) {
    
    this.softBounces = softBounces;
    return this;
  }

   /**
   * Number of softbounce for the campaign
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

  public GetCampaignStats hardBounces(Long hardBounces) {
    
    this.hardBounces = hardBounces;
    return this;
  }

   /**
   * Number of harbounce for the campaign
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

  public GetCampaignStats uniqueViews(Long uniqueViews) {
    
    this.uniqueViews = uniqueViews;
    return this;
  }

   /**
   * Number of unique openings for the campaign
   * @return uniqueViews
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UNIQUE_VIEWS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getUniqueViews() {
    return uniqueViews;
  }


  @JsonProperty(JSON_PROPERTY_UNIQUE_VIEWS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUniqueViews(Long uniqueViews) {
    this.uniqueViews = uniqueViews;
  }

  public GetCampaignStats trackableViews(Long trackableViews) {
    
    this.trackableViews = trackableViews;
    return this;
  }

   /**
   * Recipients without any privacy protection option enabled in their email client
   * @return trackableViews
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TRACKABLE_VIEWS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getTrackableViews() {
    return trackableViews;
  }


  @JsonProperty(JSON_PROPERTY_TRACKABLE_VIEWS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTrackableViews(Long trackableViews) {
    this.trackableViews = trackableViews;
  }

  public GetCampaignStats trackableViewsRate(Float trackableViewsRate) {
    
    this.trackableViewsRate = trackableViewsRate;
    return this;
  }

   /**
   * Rate of recipients without any privacy protection option enabled in their email client
   * @return trackableViewsRate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACKABLE_VIEWS_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getTrackableViewsRate() {
    return trackableViewsRate;
  }


  @JsonProperty(JSON_PROPERTY_TRACKABLE_VIEWS_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackableViewsRate(Float trackableViewsRate) {
    this.trackableViewsRate = trackableViewsRate;
  }

  public GetCampaignStats estimatedViews(Long estimatedViews) {
    
    this.estimatedViews = estimatedViews;
    return this;
  }

   /**
   * Rate of recipients without any privacy protection option enabled in their email client, applied to all delivered emails
   * @return estimatedViews
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ESTIMATED_VIEWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getEstimatedViews() {
    return estimatedViews;
  }


  @JsonProperty(JSON_PROPERTY_ESTIMATED_VIEWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEstimatedViews(Long estimatedViews) {
    this.estimatedViews = estimatedViews;
  }

  public GetCampaignStats unsubscriptions(Long unsubscriptions) {
    
    this.unsubscriptions = unsubscriptions;
    return this;
  }

   /**
   * Number of unsubscription for the campaign
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

  public GetCampaignStats viewed(Long viewed) {
    
    this.viewed = viewed;
    return this;
  }

   /**
   * Number of openings for the campaign
   * @return viewed
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VIEWED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getViewed() {
    return viewed;
  }


  @JsonProperty(JSON_PROPERTY_VIEWED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setViewed(Long viewed) {
    this.viewed = viewed;
  }

  public GetCampaignStats deferred(Long deferred) {
    
    this.deferred = deferred;
    return this;
  }

   /**
   * Number of deferred emails for the campaign
   * @return deferred
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFERRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDeferred() {
    return deferred;
  }


  @JsonProperty(JSON_PROPERTY_DEFERRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeferred(Long deferred) {
    this.deferred = deferred;
  }

  public GetCampaignStats returnBounce(Long returnBounce) {
    
    this.returnBounce = returnBounce;
    return this;
  }

   /**
   * Total number of non-delivered campaigns for a particular campaign id.
   * @return returnBounce
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETURN_BOUNCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getReturnBounce() {
    return returnBounce;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_BOUNCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnBounce(Long returnBounce) {
    this.returnBounce = returnBounce;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCampaignStats getCampaignStats = (GetCampaignStats) o;
    return Objects.equals(this.listId, getCampaignStats.listId) &&
        Objects.equals(this.uniqueClicks, getCampaignStats.uniqueClicks) &&
        Objects.equals(this.clickers, getCampaignStats.clickers) &&
        Objects.equals(this.complaints, getCampaignStats.complaints) &&
        Objects.equals(this.delivered, getCampaignStats.delivered) &&
        Objects.equals(this.sent, getCampaignStats.sent) &&
        Objects.equals(this.softBounces, getCampaignStats.softBounces) &&
        Objects.equals(this.hardBounces, getCampaignStats.hardBounces) &&
        Objects.equals(this.uniqueViews, getCampaignStats.uniqueViews) &&
        Objects.equals(this.trackableViews, getCampaignStats.trackableViews) &&
        Objects.equals(this.trackableViewsRate, getCampaignStats.trackableViewsRate) &&
        Objects.equals(this.estimatedViews, getCampaignStats.estimatedViews) &&
        Objects.equals(this.unsubscriptions, getCampaignStats.unsubscriptions) &&
        Objects.equals(this.viewed, getCampaignStats.viewed) &&
        Objects.equals(this.deferred, getCampaignStats.deferred) &&
        Objects.equals(this.returnBounce, getCampaignStats.returnBounce);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listId, uniqueClicks, clickers, complaints, delivered, sent, softBounces, hardBounces, uniqueViews, trackableViews, trackableViewsRate, estimatedViews, unsubscriptions, viewed, deferred, returnBounce);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCampaignStats {\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    uniqueClicks: ").append(toIndentedString(uniqueClicks)).append("\n");
    sb.append("    clickers: ").append(toIndentedString(clickers)).append("\n");
    sb.append("    complaints: ").append(toIndentedString(complaints)).append("\n");
    sb.append("    delivered: ").append(toIndentedString(delivered)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    softBounces: ").append(toIndentedString(softBounces)).append("\n");
    sb.append("    hardBounces: ").append(toIndentedString(hardBounces)).append("\n");
    sb.append("    uniqueViews: ").append(toIndentedString(uniqueViews)).append("\n");
    sb.append("    trackableViews: ").append(toIndentedString(trackableViews)).append("\n");
    sb.append("    trackableViewsRate: ").append(toIndentedString(trackableViewsRate)).append("\n");
    sb.append("    estimatedViews: ").append(toIndentedString(estimatedViews)).append("\n");
    sb.append("    unsubscriptions: ").append(toIndentedString(unsubscriptions)).append("\n");
    sb.append("    viewed: ").append(toIndentedString(viewed)).append("\n");
    sb.append("    deferred: ").append(toIndentedString(deferred)).append("\n");
    sb.append("    returnBounce: ").append(toIndentedString(returnBounce)).append("\n");
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

    // add `listId` to the URL query string
    if (getListId() != null) {
      try {
        joiner.add(String.format("%slistId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getListId()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `clickers` to the URL query string
    if (getClickers() != null) {
      try {
        joiner.add(String.format("%sclickers%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getClickers()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `complaints` to the URL query string
    if (getComplaints() != null) {
      try {
        joiner.add(String.format("%scomplaints%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getComplaints()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `sent` to the URL query string
    if (getSent() != null) {
      try {
        joiner.add(String.format("%ssent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSent()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `uniqueViews` to the URL query string
    if (getUniqueViews() != null) {
      try {
        joiner.add(String.format("%suniqueViews%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUniqueViews()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `trackableViews` to the URL query string
    if (getTrackableViews() != null) {
      try {
        joiner.add(String.format("%strackableViews%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTrackableViews()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `trackableViewsRate` to the URL query string
    if (getTrackableViewsRate() != null) {
      try {
        joiner.add(String.format("%strackableViewsRate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTrackableViewsRate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `estimatedViews` to the URL query string
    if (getEstimatedViews() != null) {
      try {
        joiner.add(String.format("%sestimatedViews%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEstimatedViews()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `viewed` to the URL query string
    if (getViewed() != null) {
      try {
        joiner.add(String.format("%sviewed%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getViewed()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `deferred` to the URL query string
    if (getDeferred() != null) {
      try {
        joiner.add(String.format("%sdeferred%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDeferred()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `returnBounce` to the URL query string
    if (getReturnBounce() != null) {
      try {
        joiner.add(String.format("%sreturnBounce%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReturnBounce()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

