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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import software.xdev.brevo.model.GetExtendedContactDetailsAllOfStatisticsLinks;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * GetExtendedContactDetailsAllOfStatisticsClicked
 */
@JsonPropertyOrder({
  GetExtendedContactDetailsAllOfStatisticsClicked.JSON_PROPERTY_CAMPAIGN_ID,
  GetExtendedContactDetailsAllOfStatisticsClicked.JSON_PROPERTY_LINKS
})
@JsonTypeName("getExtendedContactDetails_allOf_statistics_clicked")
public class GetExtendedContactDetailsAllOfStatisticsClicked {
  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  @jakarta.annotation.Nonnull
  private Long campaignId;

  public static final String JSON_PROPERTY_LINKS = "links";
  @jakarta.annotation.Nonnull
  private List<GetExtendedContactDetailsAllOfStatisticsLinks> links = new ArrayList<>();

  public GetExtendedContactDetailsAllOfStatisticsClicked() {
  }

  public GetExtendedContactDetailsAllOfStatisticsClicked campaignId(@jakarta.annotation.Nonnull Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

  /**
   * ID of the campaign which generated the event
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

  public GetExtendedContactDetailsAllOfStatisticsClicked links(@jakarta.annotation.Nonnull List<GetExtendedContactDetailsAllOfStatisticsLinks> links) {
    
    this.links = links;
    return this;
  }

  public GetExtendedContactDetailsAllOfStatisticsClicked addLinksItem(GetExtendedContactDetailsAllOfStatisticsLinks linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Listing of the clicked links for the campaign
   * @return links
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<GetExtendedContactDetailsAllOfStatisticsLinks> getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLinks(@jakarta.annotation.Nonnull List<GetExtendedContactDetailsAllOfStatisticsLinks> links) {
    this.links = links;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetExtendedContactDetailsAllOfStatisticsClicked getExtendedContactDetailsAllOfStatisticsClicked = (GetExtendedContactDetailsAllOfStatisticsClicked) o;
    return Objects.equals(this.campaignId, getExtendedContactDetailsAllOfStatisticsClicked.campaignId) &&
        Objects.equals(this.links, getExtendedContactDetailsAllOfStatisticsClicked.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetExtendedContactDetailsAllOfStatisticsClicked {\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

    // add `links` to the URL query string
    if (getLinks() != null) {
      for (int i = 0; i < getLinks().size(); i++) {
        if (getLinks().get(i) != null) {
          joiner.add(getLinks().get(i).toUrlQueryString(String.format("%slinks%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

