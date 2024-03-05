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
import software.xdev.brevo.model.GetExtendedContactDetailsAllOfStatisticsUnsubscriptionsAdminUnsubscription;
import software.xdev.brevo.model.GetExtendedContactDetailsAllOfStatisticsUnsubscriptionsUserUnsubscription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * GetContactCampaignStatsUnsubscriptions
 */
@JsonPropertyOrder({
  GetContactCampaignStatsUnsubscriptions.JSON_PROPERTY_USER_UNSUBSCRIPTION,
  GetContactCampaignStatsUnsubscriptions.JSON_PROPERTY_ADMIN_UNSUBSCRIPTION
})
@JsonTypeName("getContactCampaignStats_unsubscriptions")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetContactCampaignStatsUnsubscriptions {
  public static final String JSON_PROPERTY_USER_UNSUBSCRIPTION = "userUnsubscription";
  private List<GetExtendedContactDetailsAllOfStatisticsUnsubscriptionsUserUnsubscription> userUnsubscription = new ArrayList<>();

  public static final String JSON_PROPERTY_ADMIN_UNSUBSCRIPTION = "adminUnsubscription";
  private List<GetExtendedContactDetailsAllOfStatisticsUnsubscriptionsAdminUnsubscription> adminUnsubscription = new ArrayList<>();

  public GetContactCampaignStatsUnsubscriptions() {
  }

  public GetContactCampaignStatsUnsubscriptions userUnsubscription(List<GetExtendedContactDetailsAllOfStatisticsUnsubscriptionsUserUnsubscription> userUnsubscription) {
    
    this.userUnsubscription = userUnsubscription;
    return this;
  }

  public GetContactCampaignStatsUnsubscriptions addUserUnsubscriptionItem(GetExtendedContactDetailsAllOfStatisticsUnsubscriptionsUserUnsubscription userUnsubscriptionItem) {
    if (this.userUnsubscription == null) {
      this.userUnsubscription = new ArrayList<>();
    }
    this.userUnsubscription.add(userUnsubscriptionItem);
    return this;
  }

   /**
   * Contact has unsubscribed via the unsubscription link in the email
   * @return userUnsubscription
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USER_UNSUBSCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<GetExtendedContactDetailsAllOfStatisticsUnsubscriptionsUserUnsubscription> getUserUnsubscription() {
    return userUnsubscription;
  }


  @JsonProperty(JSON_PROPERTY_USER_UNSUBSCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserUnsubscription(List<GetExtendedContactDetailsAllOfStatisticsUnsubscriptionsUserUnsubscription> userUnsubscription) {
    this.userUnsubscription = userUnsubscription;
  }


  public GetContactCampaignStatsUnsubscriptions adminUnsubscription(List<GetExtendedContactDetailsAllOfStatisticsUnsubscriptionsAdminUnsubscription> adminUnsubscription) {
    
    this.adminUnsubscription = adminUnsubscription;
    return this;
  }

  public GetContactCampaignStatsUnsubscriptions addAdminUnsubscriptionItem(GetExtendedContactDetailsAllOfStatisticsUnsubscriptionsAdminUnsubscription adminUnsubscriptionItem) {
    if (this.adminUnsubscription == null) {
      this.adminUnsubscription = new ArrayList<>();
    }
    this.adminUnsubscription.add(adminUnsubscriptionItem);
    return this;
  }

   /**
   * Contact has been unsubscribed from the administrator
   * @return adminUnsubscription
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ADMIN_UNSUBSCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<GetExtendedContactDetailsAllOfStatisticsUnsubscriptionsAdminUnsubscription> getAdminUnsubscription() {
    return adminUnsubscription;
  }


  @JsonProperty(JSON_PROPERTY_ADMIN_UNSUBSCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAdminUnsubscription(List<GetExtendedContactDetailsAllOfStatisticsUnsubscriptionsAdminUnsubscription> adminUnsubscription) {
    this.adminUnsubscription = adminUnsubscription;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetContactCampaignStatsUnsubscriptions getContactCampaignStatsUnsubscriptions = (GetContactCampaignStatsUnsubscriptions) o;
    return Objects.equals(this.userUnsubscription, getContactCampaignStatsUnsubscriptions.userUnsubscription) &&
        Objects.equals(this.adminUnsubscription, getContactCampaignStatsUnsubscriptions.adminUnsubscription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userUnsubscription, adminUnsubscription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetContactCampaignStatsUnsubscriptions {\n");
    sb.append("    userUnsubscription: ").append(toIndentedString(userUnsubscription)).append("\n");
    sb.append("    adminUnsubscription: ").append(toIndentedString(adminUnsubscription)).append("\n");
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

    // add `userUnsubscription` to the URL query string
    if (getUserUnsubscription() != null) {
      for (int i = 0; i < getUserUnsubscription().size(); i++) {
        if (getUserUnsubscription().get(i) != null) {
          joiner.add(getUserUnsubscription().get(i).toUrlQueryString(String.format("%suserUnsubscription%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `adminUnsubscription` to the URL query string
    if (getAdminUnsubscription() != null) {
      for (int i = 0; i < getAdminUnsubscription().size(); i++) {
        if (getAdminUnsubscription().get(i) != null) {
          joiner.add(getAdminUnsubscription().get(i).toUrlQueryString(String.format("%sadminUnsubscription%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

