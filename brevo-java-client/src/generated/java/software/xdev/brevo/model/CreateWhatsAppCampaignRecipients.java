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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Segment ids and List ids to include/exclude from campaign
 */
@JsonPropertyOrder({
  CreateWhatsAppCampaignRecipients.JSON_PROPERTY_EXCLUDED_LIST_IDS,
  CreateWhatsAppCampaignRecipients.JSON_PROPERTY_LIST_IDS,
  CreateWhatsAppCampaignRecipients.JSON_PROPERTY_SEGMENTS
})
@JsonTypeName("createWhatsAppCampaign_recipients")
public class CreateWhatsAppCampaignRecipients {
  public static final String JSON_PROPERTY_EXCLUDED_LIST_IDS = "excludedListIds";
  private List<Long> excludedListIds;

  public static final String JSON_PROPERTY_LIST_IDS = "listIds";
  private List<Long> listIds;

  public static final String JSON_PROPERTY_SEGMENTS = "segments";
  private List<Long> segments;

  public CreateWhatsAppCampaignRecipients() {
  }

  public CreateWhatsAppCampaignRecipients excludedListIds(List<Long> excludedListIds) {
    
    this.excludedListIds = excludedListIds;
    return this;
  }

  public CreateWhatsAppCampaignRecipients addExcludedListIdsItem(Long excludedListIdsItem) {
    if (this.excludedListIds == null) {
      this.excludedListIds = new ArrayList<>();
    }
    this.excludedListIds.add(excludedListIdsItem);
    return this;
  }

   /**
   * List ids to exclude from the campaign
   * @return excludedListIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCLUDED_LIST_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getExcludedListIds() {
    return excludedListIds;
  }


  @JsonProperty(JSON_PROPERTY_EXCLUDED_LIST_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExcludedListIds(List<Long> excludedListIds) {
    this.excludedListIds = excludedListIds;
  }


  public CreateWhatsAppCampaignRecipients listIds(List<Long> listIds) {
    
    this.listIds = listIds;
    return this;
  }

  public CreateWhatsAppCampaignRecipients addListIdsItem(Long listIdsItem) {
    if (this.listIds == null) {
      this.listIds = new ArrayList<>();
    }
    this.listIds.add(listIdsItem);
    return this;
  }

   /**
   * **Mandatory if scheduledAt is not empty**. List Ids to send the campaign to 
   * @return listIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIST_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getListIds() {
    return listIds;
  }


  @JsonProperty(JSON_PROPERTY_LIST_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setListIds(List<Long> listIds) {
    this.listIds = listIds;
  }


  public CreateWhatsAppCampaignRecipients segments(List<Long> segments) {
    
    this.segments = segments;
    return this;
  }

  public CreateWhatsAppCampaignRecipients addSegmentsItem(Long segmentsItem) {
    if (this.segments == null) {
      this.segments = new ArrayList<>();
    }
    this.segments.add(segmentsItem);
    return this;
  }

   /**
   * **Mandatory if listIds are not used**. Segment ids to send the campaign to. 
   * @return segments
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEGMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getSegments() {
    return segments;
  }


  @JsonProperty(JSON_PROPERTY_SEGMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSegments(List<Long> segments) {
    this.segments = segments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWhatsAppCampaignRecipients createWhatsAppCampaignRecipients = (CreateWhatsAppCampaignRecipients) o;
    return Objects.equals(this.excludedListIds, createWhatsAppCampaignRecipients.excludedListIds) &&
        Objects.equals(this.listIds, createWhatsAppCampaignRecipients.listIds) &&
        Objects.equals(this.segments, createWhatsAppCampaignRecipients.segments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excludedListIds, listIds, segments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWhatsAppCampaignRecipients {\n");
    sb.append("    excludedListIds: ").append(toIndentedString(excludedListIds)).append("\n");
    sb.append("    listIds: ").append(toIndentedString(listIds)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
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

    // add `excludedListIds` to the URL query string
    if (getExcludedListIds() != null) {
      for (int i = 0; i < getExcludedListIds().size(); i++) {
        try {
          joiner.add(String.format("%sexcludedListIds%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getExcludedListIds().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `listIds` to the URL query string
    if (getListIds() != null) {
      for (int i = 0; i < getListIds().size(); i++) {
        try {
          joiner.add(String.format("%slistIds%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getListIds().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `segments` to the URL query string
    if (getSegments() != null) {
      for (int i = 0; i < getSegments().size(); i++) {
        try {
          joiner.add(String.format("%ssegments%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getSegments().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

