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
 * CrmDealsLinkUnlinkIdPatchRequest
 */
@JsonPropertyOrder({
  CrmDealsLinkUnlinkIdPatchRequest.JSON_PROPERTY_LINK_CONTACT_IDS,
  CrmDealsLinkUnlinkIdPatchRequest.JSON_PROPERTY_UNLINK_CONTACT_IDS,
  CrmDealsLinkUnlinkIdPatchRequest.JSON_PROPERTY_LINK_COMPANY_IDS,
  CrmDealsLinkUnlinkIdPatchRequest.JSON_PROPERTY_UNLINK_COMPANY_IDS
})
@JsonTypeName("_crm_deals_link_unlink__id__patch_request")
public class CrmDealsLinkUnlinkIdPatchRequest {
  public static final String JSON_PROPERTY_LINK_CONTACT_IDS = "linkContactIds";
  private List<Long> linkContactIds = new ArrayList<>();

  public static final String JSON_PROPERTY_UNLINK_CONTACT_IDS = "unlinkContactIds";
  private List<Long> unlinkContactIds = new ArrayList<>();

  public static final String JSON_PROPERTY_LINK_COMPANY_IDS = "linkCompanyIds";
  private List<String> linkCompanyIds = new ArrayList<>();

  public static final String JSON_PROPERTY_UNLINK_COMPANY_IDS = "unlinkCompanyIds";
  private List<String> unlinkCompanyIds = new ArrayList<>();

  public CrmDealsLinkUnlinkIdPatchRequest() {
  }

  public CrmDealsLinkUnlinkIdPatchRequest linkContactIds(List<Long> linkContactIds) {
    
    this.linkContactIds = linkContactIds;
    return this;
  }

  public CrmDealsLinkUnlinkIdPatchRequest addLinkContactIdsItem(Long linkContactIdsItem) {
    if (this.linkContactIds == null) {
      this.linkContactIds = new ArrayList<>();
    }
    this.linkContactIds.add(linkContactIdsItem);
    return this;
  }

   /**
   * Contact ids for contacts to be linked with deal
   * @return linkContactIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINK_CONTACT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getLinkContactIds() {
    return linkContactIds;
  }


  @JsonProperty(JSON_PROPERTY_LINK_CONTACT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkContactIds(List<Long> linkContactIds) {
    this.linkContactIds = linkContactIds;
  }


  public CrmDealsLinkUnlinkIdPatchRequest unlinkContactIds(List<Long> unlinkContactIds) {
    
    this.unlinkContactIds = unlinkContactIds;
    return this;
  }

  public CrmDealsLinkUnlinkIdPatchRequest addUnlinkContactIdsItem(Long unlinkContactIdsItem) {
    if (this.unlinkContactIds == null) {
      this.unlinkContactIds = new ArrayList<>();
    }
    this.unlinkContactIds.add(unlinkContactIdsItem);
    return this;
  }

   /**
   * Contact ids for contacts to be unlinked from deal
   * @return unlinkContactIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNLINK_CONTACT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getUnlinkContactIds() {
    return unlinkContactIds;
  }


  @JsonProperty(JSON_PROPERTY_UNLINK_CONTACT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnlinkContactIds(List<Long> unlinkContactIds) {
    this.unlinkContactIds = unlinkContactIds;
  }


  public CrmDealsLinkUnlinkIdPatchRequest linkCompanyIds(List<String> linkCompanyIds) {
    
    this.linkCompanyIds = linkCompanyIds;
    return this;
  }

  public CrmDealsLinkUnlinkIdPatchRequest addLinkCompanyIdsItem(String linkCompanyIdsItem) {
    if (this.linkCompanyIds == null) {
      this.linkCompanyIds = new ArrayList<>();
    }
    this.linkCompanyIds.add(linkCompanyIdsItem);
    return this;
  }

   /**
   * Company ids to be linked with deal
   * @return linkCompanyIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINK_COMPANY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getLinkCompanyIds() {
    return linkCompanyIds;
  }


  @JsonProperty(JSON_PROPERTY_LINK_COMPANY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkCompanyIds(List<String> linkCompanyIds) {
    this.linkCompanyIds = linkCompanyIds;
  }


  public CrmDealsLinkUnlinkIdPatchRequest unlinkCompanyIds(List<String> unlinkCompanyIds) {
    
    this.unlinkCompanyIds = unlinkCompanyIds;
    return this;
  }

  public CrmDealsLinkUnlinkIdPatchRequest addUnlinkCompanyIdsItem(String unlinkCompanyIdsItem) {
    if (this.unlinkCompanyIds == null) {
      this.unlinkCompanyIds = new ArrayList<>();
    }
    this.unlinkCompanyIds.add(unlinkCompanyIdsItem);
    return this;
  }

   /**
   * Company ids to be unlinked from deal
   * @return unlinkCompanyIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNLINK_COMPANY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getUnlinkCompanyIds() {
    return unlinkCompanyIds;
  }


  @JsonProperty(JSON_PROPERTY_UNLINK_COMPANY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnlinkCompanyIds(List<String> unlinkCompanyIds) {
    this.unlinkCompanyIds = unlinkCompanyIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrmDealsLinkUnlinkIdPatchRequest crmDealsLinkUnlinkIdPatchRequest = (CrmDealsLinkUnlinkIdPatchRequest) o;
    return Objects.equals(this.linkContactIds, crmDealsLinkUnlinkIdPatchRequest.linkContactIds) &&
        Objects.equals(this.unlinkContactIds, crmDealsLinkUnlinkIdPatchRequest.unlinkContactIds) &&
        Objects.equals(this.linkCompanyIds, crmDealsLinkUnlinkIdPatchRequest.linkCompanyIds) &&
        Objects.equals(this.unlinkCompanyIds, crmDealsLinkUnlinkIdPatchRequest.unlinkCompanyIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkContactIds, unlinkContactIds, linkCompanyIds, unlinkCompanyIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrmDealsLinkUnlinkIdPatchRequest {\n");
    sb.append("    linkContactIds: ").append(toIndentedString(linkContactIds)).append("\n");
    sb.append("    unlinkContactIds: ").append(toIndentedString(unlinkContactIds)).append("\n");
    sb.append("    linkCompanyIds: ").append(toIndentedString(linkCompanyIds)).append("\n");
    sb.append("    unlinkCompanyIds: ").append(toIndentedString(unlinkCompanyIds)).append("\n");
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

    // add `linkContactIds` to the URL query string
    if (getLinkContactIds() != null) {
      for (int i = 0; i < getLinkContactIds().size(); i++) {
        try {
          joiner.add(String.format("%slinkContactIds%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getLinkContactIds().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `unlinkContactIds` to the URL query string
    if (getUnlinkContactIds() != null) {
      for (int i = 0; i < getUnlinkContactIds().size(); i++) {
        try {
          joiner.add(String.format("%sunlinkContactIds%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getUnlinkContactIds().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `linkCompanyIds` to the URL query string
    if (getLinkCompanyIds() != null) {
      for (int i = 0; i < getLinkCompanyIds().size(); i++) {
        try {
          joiner.add(String.format("%slinkCompanyIds%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getLinkCompanyIds().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `unlinkCompanyIds` to the URL query string
    if (getUnlinkCompanyIds() != null) {
      for (int i = 0; i < getUnlinkCompanyIds().size(); i++) {
        try {
          joiner.add(String.format("%sunlinkCompanyIds%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getUnlinkCompanyIds().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}
