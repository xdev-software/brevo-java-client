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
 * CompaniesLinkUnlinkIdPatchRequest
 */
@JsonPropertyOrder({
  CompaniesLinkUnlinkIdPatchRequest.JSON_PROPERTY_LINK_CONTACT_IDS,
  CompaniesLinkUnlinkIdPatchRequest.JSON_PROPERTY_UNLINK_CONTACT_IDS,
  CompaniesLinkUnlinkIdPatchRequest.JSON_PROPERTY_LINK_DEALS_IDS,
  CompaniesLinkUnlinkIdPatchRequest.JSON_PROPERTY_UNLINK_DEALS_IDS
})
@JsonTypeName("_companies_link_unlink__id__patch_request")
public class CompaniesLinkUnlinkIdPatchRequest {
  public static final String JSON_PROPERTY_LINK_CONTACT_IDS = "linkContactIds";
  @jakarta.annotation.Nullable
  private List<Long> linkContactIds = new ArrayList<>();

  public static final String JSON_PROPERTY_UNLINK_CONTACT_IDS = "unlinkContactIds";
  @jakarta.annotation.Nullable
  private List<Long> unlinkContactIds = new ArrayList<>();

  public static final String JSON_PROPERTY_LINK_DEALS_IDS = "linkDealsIds";
  @jakarta.annotation.Nullable
  private List<String> linkDealsIds = new ArrayList<>();

  public static final String JSON_PROPERTY_UNLINK_DEALS_IDS = "unlinkDealsIds";
  @jakarta.annotation.Nullable
  private List<String> unlinkDealsIds = new ArrayList<>();

  public CompaniesLinkUnlinkIdPatchRequest() {
  }

  public CompaniesLinkUnlinkIdPatchRequest linkContactIds(@jakarta.annotation.Nullable List<Long> linkContactIds) {
    
    this.linkContactIds = linkContactIds;
    return this;
  }

  public CompaniesLinkUnlinkIdPatchRequest addLinkContactIdsItem(Long linkContactIdsItem) {
    if (this.linkContactIds == null) {
      this.linkContactIds = new ArrayList<>();
    }
    this.linkContactIds.add(linkContactIdsItem);
    return this;
  }

  /**
   * Contact ids for contacts to be linked with company
   * @return linkContactIds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINK_CONTACT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getLinkContactIds() {
    return linkContactIds;
  }


  @JsonProperty(JSON_PROPERTY_LINK_CONTACT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkContactIds(@jakarta.annotation.Nullable List<Long> linkContactIds) {
    this.linkContactIds = linkContactIds;
  }

  public CompaniesLinkUnlinkIdPatchRequest unlinkContactIds(@jakarta.annotation.Nullable List<Long> unlinkContactIds) {
    
    this.unlinkContactIds = unlinkContactIds;
    return this;
  }

  public CompaniesLinkUnlinkIdPatchRequest addUnlinkContactIdsItem(Long unlinkContactIdsItem) {
    if (this.unlinkContactIds == null) {
      this.unlinkContactIds = new ArrayList<>();
    }
    this.unlinkContactIds.add(unlinkContactIdsItem);
    return this;
  }

  /**
   * Contact ids for contacts to be unlinked from company
   * @return unlinkContactIds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNLINK_CONTACT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getUnlinkContactIds() {
    return unlinkContactIds;
  }


  @JsonProperty(JSON_PROPERTY_UNLINK_CONTACT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnlinkContactIds(@jakarta.annotation.Nullable List<Long> unlinkContactIds) {
    this.unlinkContactIds = unlinkContactIds;
  }

  public CompaniesLinkUnlinkIdPatchRequest linkDealsIds(@jakarta.annotation.Nullable List<String> linkDealsIds) {
    
    this.linkDealsIds = linkDealsIds;
    return this;
  }

  public CompaniesLinkUnlinkIdPatchRequest addLinkDealsIdsItem(String linkDealsIdsItem) {
    if (this.linkDealsIds == null) {
      this.linkDealsIds = new ArrayList<>();
    }
    this.linkDealsIds.add(linkDealsIdsItem);
    return this;
  }

  /**
   * Deal ids for deals to be linked with company
   * @return linkDealsIds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINK_DEALS_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getLinkDealsIds() {
    return linkDealsIds;
  }


  @JsonProperty(JSON_PROPERTY_LINK_DEALS_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkDealsIds(@jakarta.annotation.Nullable List<String> linkDealsIds) {
    this.linkDealsIds = linkDealsIds;
  }

  public CompaniesLinkUnlinkIdPatchRequest unlinkDealsIds(@jakarta.annotation.Nullable List<String> unlinkDealsIds) {
    
    this.unlinkDealsIds = unlinkDealsIds;
    return this;
  }

  public CompaniesLinkUnlinkIdPatchRequest addUnlinkDealsIdsItem(String unlinkDealsIdsItem) {
    if (this.unlinkDealsIds == null) {
      this.unlinkDealsIds = new ArrayList<>();
    }
    this.unlinkDealsIds.add(unlinkDealsIdsItem);
    return this;
  }

  /**
   * Deal ids for deals to be unlinked from company
   * @return unlinkDealsIds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNLINK_DEALS_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getUnlinkDealsIds() {
    return unlinkDealsIds;
  }


  @JsonProperty(JSON_PROPERTY_UNLINK_DEALS_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnlinkDealsIds(@jakarta.annotation.Nullable List<String> unlinkDealsIds) {
    this.unlinkDealsIds = unlinkDealsIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompaniesLinkUnlinkIdPatchRequest companiesLinkUnlinkIdPatchRequest = (CompaniesLinkUnlinkIdPatchRequest) o;
    return Objects.equals(this.linkContactIds, companiesLinkUnlinkIdPatchRequest.linkContactIds) &&
        Objects.equals(this.unlinkContactIds, companiesLinkUnlinkIdPatchRequest.unlinkContactIds) &&
        Objects.equals(this.linkDealsIds, companiesLinkUnlinkIdPatchRequest.linkDealsIds) &&
        Objects.equals(this.unlinkDealsIds, companiesLinkUnlinkIdPatchRequest.unlinkDealsIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkContactIds, unlinkContactIds, linkDealsIds, unlinkDealsIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompaniesLinkUnlinkIdPatchRequest {\n");
    sb.append("    linkContactIds: ").append(toIndentedString(linkContactIds)).append("\n");
    sb.append("    unlinkContactIds: ").append(toIndentedString(unlinkContactIds)).append("\n");
    sb.append("    linkDealsIds: ").append(toIndentedString(linkDealsIds)).append("\n");
    sb.append("    unlinkDealsIds: ").append(toIndentedString(unlinkDealsIds)).append("\n");
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

    // add `linkDealsIds` to the URL query string
    if (getLinkDealsIds() != null) {
      for (int i = 0; i < getLinkDealsIds().size(); i++) {
        try {
          joiner.add(String.format("%slinkDealsIds%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getLinkDealsIds().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `unlinkDealsIds` to the URL query string
    if (getUnlinkDealsIds() != null) {
      for (int i = 0; i < getUnlinkDealsIds().size(); i++) {
        try {
          joiner.add(String.format("%sunlinkDealsIds%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getUnlinkDealsIds().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

