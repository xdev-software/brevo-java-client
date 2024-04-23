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
import software.xdev.brevo.model.InviteAdminUserPrivilegesInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * InviteAdminUser
 */
@JsonPropertyOrder({
  InviteAdminUser.JSON_PROPERTY_EMAIL,
  InviteAdminUser.JSON_PROPERTY_ALL_FEATURES_ACCESS,
  InviteAdminUser.JSON_PROPERTY_GROUP_IDS,
  InviteAdminUser.JSON_PROPERTY_PRIVILEGES
})
@JsonTypeName("inviteAdminUser")
public class InviteAdminUser {
  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_ALL_FEATURES_ACCESS = "all_features_access";
  private Boolean allFeaturesAccess;

  public static final String JSON_PROPERTY_GROUP_IDS = "groupIds";
  private List<String> groupIds = new ArrayList<>();

  public static final String JSON_PROPERTY_PRIVILEGES = "privileges";
  private List<InviteAdminUserPrivilegesInner> privileges = new ArrayList<>();

  public InviteAdminUser() {
  }

  public InviteAdminUser email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Email address for the organization
   * @return email
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmail(String email) {
    this.email = email;
  }


  public InviteAdminUser allFeaturesAccess(Boolean allFeaturesAccess) {
    
    this.allFeaturesAccess = allFeaturesAccess;
    return this;
  }

   /**
   * All access to the features
   * @return allFeaturesAccess
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ALL_FEATURES_ACCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getAllFeaturesAccess() {
    return allFeaturesAccess;
  }


  @JsonProperty(JSON_PROPERTY_ALL_FEATURES_ACCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAllFeaturesAccess(Boolean allFeaturesAccess) {
    this.allFeaturesAccess = allFeaturesAccess;
  }


  public InviteAdminUser groupIds(List<String> groupIds) {
    
    this.groupIds = groupIds;
    return this;
  }

  public InviteAdminUser addGroupIdsItem(String groupIdsItem) {
    if (this.groupIds == null) {
      this.groupIds = new ArrayList<>();
    }
    this.groupIds.add(groupIdsItem);
    return this;
  }

   /**
   * Ids of Group
   * @return groupIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getGroupIds() {
    return groupIds;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupIds(List<String> groupIds) {
    this.groupIds = groupIds;
  }


  public InviteAdminUser privileges(List<InviteAdminUserPrivilegesInner> privileges) {
    
    this.privileges = privileges;
    return this;
  }

  public InviteAdminUser addPrivilegesItem(InviteAdminUserPrivilegesInner privilegesItem) {
    if (this.privileges == null) {
      this.privileges = new ArrayList<>();
    }
    this.privileges.add(privilegesItem);
    return this;
  }

   /**
   * Get privileges
   * @return privileges
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PRIVILEGES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<InviteAdminUserPrivilegesInner> getPrivileges() {
    return privileges;
  }


  @JsonProperty(JSON_PROPERTY_PRIVILEGES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrivileges(List<InviteAdminUserPrivilegesInner> privileges) {
    this.privileges = privileges;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InviteAdminUser inviteAdminUser = (InviteAdminUser) o;
    return Objects.equals(this.email, inviteAdminUser.email) &&
        Objects.equals(this.allFeaturesAccess, inviteAdminUser.allFeaturesAccess) &&
        Objects.equals(this.groupIds, inviteAdminUser.groupIds) &&
        Objects.equals(this.privileges, inviteAdminUser.privileges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, allFeaturesAccess, groupIds, privileges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteAdminUser {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    allFeaturesAccess: ").append(toIndentedString(allFeaturesAccess)).append("\n");
    sb.append("    groupIds: ").append(toIndentedString(groupIds)).append("\n");
    sb.append("    privileges: ").append(toIndentedString(privileges)).append("\n");
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

    // add `email` to the URL query string
    if (getEmail() != null) {
      try {
        joiner.add(String.format("%semail%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmail()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `all_features_access` to the URL query string
    if (getAllFeaturesAccess() != null) {
      try {
        joiner.add(String.format("%sall_features_access%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAllFeaturesAccess()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `groupIds` to the URL query string
    if (getGroupIds() != null) {
      for (int i = 0; i < getGroupIds().size(); i++) {
        try {
          joiner.add(String.format("%sgroupIds%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getGroupIds().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `privileges` to the URL query string
    if (getPrivileges() != null) {
      for (int i = 0; i < getPrivileges().size(); i++) {
        if (getPrivileges().get(i) != null) {
          joiner.add(getPrivileges().get(i).toUrlQueryString(String.format("%sprivileges%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

