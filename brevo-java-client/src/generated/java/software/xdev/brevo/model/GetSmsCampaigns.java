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
import software.xdev.brevo.model.GetSmsCampaignsCampaignsInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * GetSmsCampaigns
 */
@JsonPropertyOrder({
  GetSmsCampaigns.JSON_PROPERTY_CAMPAIGNS,
  GetSmsCampaigns.JSON_PROPERTY_COUNT
})
@JsonTypeName("getSmsCampaigns")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetSmsCampaigns {
  public static final String JSON_PROPERTY_CAMPAIGNS = "campaigns";
  private List<GetSmsCampaignsCampaignsInner> campaigns;

  public static final String JSON_PROPERTY_COUNT = "count";
  private Long count;

  public GetSmsCampaigns() {
  }

  public GetSmsCampaigns campaigns(List<GetSmsCampaignsCampaignsInner> campaigns) {
    
    this.campaigns = campaigns;
    return this;
  }

  public GetSmsCampaigns addCampaignsItem(GetSmsCampaignsCampaignsInner campaignsItem) {
    if (this.campaigns == null) {
      this.campaigns = new ArrayList<>();
    }
    this.campaigns.add(campaignsItem);
    return this;
  }

   /**
   * Get campaigns
   * @return campaigns
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPAIGNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetSmsCampaignsCampaignsInner> getCampaigns() {
    return campaigns;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaigns(List<GetSmsCampaignsCampaignsInner> campaigns) {
    this.campaigns = campaigns;
  }


  public GetSmsCampaigns count(Long count) {
    
    this.count = count;
    return this;
  }

   /**
   * Number of SMS campaigns retrieved
   * @return count
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCount() {
    return count;
  }


  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCount(Long count) {
    this.count = count;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSmsCampaigns getSmsCampaigns = (GetSmsCampaigns) o;
    return Objects.equals(this.campaigns, getSmsCampaigns.campaigns) &&
        Objects.equals(this.count, getSmsCampaigns.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaigns, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSmsCampaigns {\n");
    sb.append("    campaigns: ").append(toIndentedString(campaigns)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

    // add `campaigns` to the URL query string
    if (getCampaigns() != null) {
      for (int i = 0; i < getCampaigns().size(); i++) {
        if (getCampaigns().get(i) != null) {
          joiner.add(getCampaigns().get(i).toUrlQueryString(String.format("%scampaigns%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `count` to the URL query string
    if (getCount() != null) {
      try {
        joiner.add(String.format("%scount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

