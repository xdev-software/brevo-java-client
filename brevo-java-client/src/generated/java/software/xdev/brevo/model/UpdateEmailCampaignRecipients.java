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
  UpdateEmailCampaignRecipients.JSON_PROPERTY_EXCLUSION_LIST_IDS,
  UpdateEmailCampaignRecipients.JSON_PROPERTY_LIST_IDS,
  UpdateEmailCampaignRecipients.JSON_PROPERTY_SEGMENT_IDS,
  UpdateEmailCampaignRecipients.JSON_PROPERTY_EXCLUSION_SEGMENT_IDS
})
@JsonTypeName("updateEmailCampaign_recipients")
public class UpdateEmailCampaignRecipients {
  public static final String JSON_PROPERTY_EXCLUSION_LIST_IDS = "exclusionListIds";
  @jakarta.annotation.Nullable
  private List<Long> exclusionListIds = new ArrayList<>();

  public static final String JSON_PROPERTY_LIST_IDS = "listIds";
  @jakarta.annotation.Nullable
  private List<Long> listIds = new ArrayList<>();

  public static final String JSON_PROPERTY_SEGMENT_IDS = "segmentIds";
  @jakarta.annotation.Nullable
  private List<Long> segmentIds = new ArrayList<>();

  public static final String JSON_PROPERTY_EXCLUSION_SEGMENT_IDS = "exclusionSegmentIds";
  @jakarta.annotation.Nullable
  private List<Long> exclusionSegmentIds = new ArrayList<>();

  public UpdateEmailCampaignRecipients() {
  }

  public UpdateEmailCampaignRecipients exclusionListIds(@jakarta.annotation.Nullable List<Long> exclusionListIds) {
    
    this.exclusionListIds = exclusionListIds;
    return this;
  }

  public UpdateEmailCampaignRecipients addExclusionListIdsItem(Long exclusionListIdsItem) {
    if (this.exclusionListIds == null) {
      this.exclusionListIds = new ArrayList<>();
    }
    this.exclusionListIds.add(exclusionListIdsItem);
    return this;
  }

  /**
   * List ids which have to be excluded from a campaign
   * @return exclusionListIds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCLUSION_LIST_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getExclusionListIds() {
    return exclusionListIds;
  }


  @JsonProperty(JSON_PROPERTY_EXCLUSION_LIST_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExclusionListIds(@jakarta.annotation.Nullable List<Long> exclusionListIds) {
    this.exclusionListIds = exclusionListIds;
  }

  public UpdateEmailCampaignRecipients listIds(@jakarta.annotation.Nullable List<Long> listIds) {
    
    this.listIds = listIds;
    return this;
  }

  public UpdateEmailCampaignRecipients addListIdsItem(Long listIdsItem) {
    if (this.listIds == null) {
      this.listIds = new ArrayList<>();
    }
    this.listIds.add(listIdsItem);
    return this;
  }

  /**
   * Lists Ids to send the campaign to. **Campaign should only be updated with listIds if listIds were used to create it. REQUIRED if already not present in campaign and scheduledAt is not empty** 
   * @return listIds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIST_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getListIds() {
    return listIds;
  }


  @JsonProperty(JSON_PROPERTY_LIST_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setListIds(@jakarta.annotation.Nullable List<Long> listIds) {
    this.listIds = listIds;
  }

  public UpdateEmailCampaignRecipients segmentIds(@jakarta.annotation.Nullable List<Long> segmentIds) {
    
    this.segmentIds = segmentIds;
    return this;
  }

  public UpdateEmailCampaignRecipients addSegmentIdsItem(Long segmentIdsItem) {
    if (this.segmentIds == null) {
      this.segmentIds = new ArrayList<>();
    }
    this.segmentIds.add(segmentIdsItem);
    return this;
  }

  /**
   * **Mandatory if listIds are not used. Campaign should only be updated with segmentIds if segmentIds were used to create it.** Segment ids to send the campaign to. 
   * @return segmentIds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEGMENT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getSegmentIds() {
    return segmentIds;
  }


  @JsonProperty(JSON_PROPERTY_SEGMENT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSegmentIds(@jakarta.annotation.Nullable List<Long> segmentIds) {
    this.segmentIds = segmentIds;
  }

  public UpdateEmailCampaignRecipients exclusionSegmentIds(@jakarta.annotation.Nullable List<Long> exclusionSegmentIds) {
    
    this.exclusionSegmentIds = exclusionSegmentIds;
    return this;
  }

  public UpdateEmailCampaignRecipients addExclusionSegmentIdsItem(Long exclusionSegmentIdsItem) {
    if (this.exclusionSegmentIds == null) {
      this.exclusionSegmentIds = new ArrayList<>();
    }
    this.exclusionSegmentIds.add(exclusionSegmentIdsItem);
    return this;
  }

  /**
   * Segment ids which have to be excluded from a campaign. 
   * @return exclusionSegmentIds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCLUSION_SEGMENT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getExclusionSegmentIds() {
    return exclusionSegmentIds;
  }


  @JsonProperty(JSON_PROPERTY_EXCLUSION_SEGMENT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExclusionSegmentIds(@jakarta.annotation.Nullable List<Long> exclusionSegmentIds) {
    this.exclusionSegmentIds = exclusionSegmentIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateEmailCampaignRecipients updateEmailCampaignRecipients = (UpdateEmailCampaignRecipients) o;
    return Objects.equals(this.exclusionListIds, updateEmailCampaignRecipients.exclusionListIds) &&
        Objects.equals(this.listIds, updateEmailCampaignRecipients.listIds) &&
        Objects.equals(this.segmentIds, updateEmailCampaignRecipients.segmentIds) &&
        Objects.equals(this.exclusionSegmentIds, updateEmailCampaignRecipients.exclusionSegmentIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exclusionListIds, listIds, segmentIds, exclusionSegmentIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateEmailCampaignRecipients {\n");
    sb.append("    exclusionListIds: ").append(toIndentedString(exclusionListIds)).append("\n");
    sb.append("    listIds: ").append(toIndentedString(listIds)).append("\n");
    sb.append("    segmentIds: ").append(toIndentedString(segmentIds)).append("\n");
    sb.append("    exclusionSegmentIds: ").append(toIndentedString(exclusionSegmentIds)).append("\n");
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

    // add `exclusionListIds` to the URL query string
    if (getExclusionListIds() != null) {
      for (int i = 0; i < getExclusionListIds().size(); i++) {
        try {
          joiner.add(String.format("%sexclusionListIds%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getExclusionListIds().get(i)), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `segmentIds` to the URL query string
    if (getSegmentIds() != null) {
      for (int i = 0; i < getSegmentIds().size(); i++) {
        try {
          joiner.add(String.format("%ssegmentIds%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getSegmentIds().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `exclusionSegmentIds` to the URL query string
    if (getExclusionSegmentIds() != null) {
      for (int i = 0; i < getExclusionSegmentIds().size(); i++) {
        try {
          joiner.add(String.format("%sexclusionSegmentIds%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getExclusionSegmentIds().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

