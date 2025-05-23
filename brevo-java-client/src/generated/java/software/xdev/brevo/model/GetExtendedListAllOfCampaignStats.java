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
import software.xdev.brevo.model.GetCampaignStats;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * GetExtendedListAllOfCampaignStats
 */
@JsonPropertyOrder({
  GetExtendedListAllOfCampaignStats.JSON_PROPERTY_CAMPAIGN_ID,
  GetExtendedListAllOfCampaignStats.JSON_PROPERTY_STATS
})
@JsonTypeName("getExtendedList_allOf_campaignStats")
public class GetExtendedListAllOfCampaignStats {
  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  @jakarta.annotation.Nonnull
  private Long campaignId;

  public static final String JSON_PROPERTY_STATS = "stats";
  @jakarta.annotation.Nonnull
  private GetCampaignStats stats;

  public GetExtendedListAllOfCampaignStats() {
  }

  public GetExtendedListAllOfCampaignStats campaignId(@jakarta.annotation.Nonnull Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

  /**
   * ID of the campaign
   * @return campaignId
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getCampaignId() {
    return campaignId;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCampaignId(@jakarta.annotation.Nonnull Long campaignId) {
    this.campaignId = campaignId;
  }

  public GetExtendedListAllOfCampaignStats stats(@jakarta.annotation.Nonnull GetCampaignStats stats) {
    
    this.stats = stats;
    return this;
  }

  /**
   * Get stats
   * @return stats
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GetCampaignStats getStats() {
    return stats;
  }


  @JsonProperty(JSON_PROPERTY_STATS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStats(@jakarta.annotation.Nonnull GetCampaignStats stats) {
    this.stats = stats;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetExtendedListAllOfCampaignStats getExtendedListAllOfCampaignStats = (GetExtendedListAllOfCampaignStats) o;
    return Objects.equals(this.campaignId, getExtendedListAllOfCampaignStats.campaignId) &&
        Objects.equals(this.stats, getExtendedListAllOfCampaignStats.stats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, stats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetExtendedListAllOfCampaignStats {\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
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

    // add `campaignId` to the URL query string
    if (getCampaignId() != null) {
      try {
        joiner.add(String.format("%scampaignId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCampaignId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `stats` to the URL query string
    if (getStats() != null) {
      joiner.add(getStats().toUrlQueryString(prefix + "stats" + suffix));
    }

    return joiner.toString();
  }

}

