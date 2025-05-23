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
import software.xdev.brevo.model.CorporateGroupDetailsResponseGroup;
import software.xdev.brevo.model.CorporateGroupDetailsResponseSubAccountsInner;
import software.xdev.brevo.model.CorporateGroupDetailsResponseUsersInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * CorporateGroupDetailsResponse
 */
@JsonPropertyOrder({
  CorporateGroupDetailsResponse.JSON_PROPERTY_GROUP,
  CorporateGroupDetailsResponse.JSON_PROPERTY_SUB_ACCOUNTS,
  CorporateGroupDetailsResponse.JSON_PROPERTY_USERS
})
@JsonTypeName("corporateGroupDetailsResponse")
public class CorporateGroupDetailsResponse {
  public static final String JSON_PROPERTY_GROUP = "group";
  @jakarta.annotation.Nullable
  private CorporateGroupDetailsResponseGroup group;

  public static final String JSON_PROPERTY_SUB_ACCOUNTS = "sub-accounts";
  @jakarta.annotation.Nullable
  private List<CorporateGroupDetailsResponseSubAccountsInner> subAccounts = new ArrayList<>();

  public static final String JSON_PROPERTY_USERS = "users";
  @jakarta.annotation.Nullable
  private List<CorporateGroupDetailsResponseUsersInner> users = new ArrayList<>();

  public CorporateGroupDetailsResponse() {
  }

  public CorporateGroupDetailsResponse group(@jakarta.annotation.Nullable CorporateGroupDetailsResponseGroup group) {
    
    this.group = group;
    return this;
  }

  /**
   * Get group
   * @return group
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CorporateGroupDetailsResponseGroup getGroup() {
    return group;
  }


  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroup(@jakarta.annotation.Nullable CorporateGroupDetailsResponseGroup group) {
    this.group = group;
  }

  public CorporateGroupDetailsResponse subAccounts(@jakarta.annotation.Nullable List<CorporateGroupDetailsResponseSubAccountsInner> subAccounts) {
    
    this.subAccounts = subAccounts;
    return this;
  }

  public CorporateGroupDetailsResponse addSubAccountsItem(CorporateGroupDetailsResponseSubAccountsInner subAccountsItem) {
    if (this.subAccounts == null) {
      this.subAccounts = new ArrayList<>();
    }
    this.subAccounts.add(subAccountsItem);
    return this;
  }

  /**
   * Get subAccounts
   * @return subAccounts
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUB_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CorporateGroupDetailsResponseSubAccountsInner> getSubAccounts() {
    return subAccounts;
  }


  @JsonProperty(JSON_PROPERTY_SUB_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubAccounts(@jakarta.annotation.Nullable List<CorporateGroupDetailsResponseSubAccountsInner> subAccounts) {
    this.subAccounts = subAccounts;
  }

  public CorporateGroupDetailsResponse users(@jakarta.annotation.Nullable List<CorporateGroupDetailsResponseUsersInner> users) {
    
    this.users = users;
    return this;
  }

  public CorporateGroupDetailsResponse addUsersItem(CorporateGroupDetailsResponseUsersInner usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * Get users
   * @return users
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CorporateGroupDetailsResponseUsersInner> getUsers() {
    return users;
  }


  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsers(@jakarta.annotation.Nullable List<CorporateGroupDetailsResponseUsersInner> users) {
    this.users = users;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorporateGroupDetailsResponse corporateGroupDetailsResponse = (CorporateGroupDetailsResponse) o;
    return Objects.equals(this.group, corporateGroupDetailsResponse.group) &&
        Objects.equals(this.subAccounts, corporateGroupDetailsResponse.subAccounts) &&
        Objects.equals(this.users, corporateGroupDetailsResponse.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, subAccounts, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorporateGroupDetailsResponse {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    subAccounts: ").append(toIndentedString(subAccounts)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

    // add `group` to the URL query string
    if (getGroup() != null) {
      joiner.add(getGroup().toUrlQueryString(prefix + "group" + suffix));
    }

    // add `sub-accounts` to the URL query string
    if (getSubAccounts() != null) {
      for (int i = 0; i < getSubAccounts().size(); i++) {
        if (getSubAccounts().get(i) != null) {
          joiner.add(getSubAccounts().get(i).toUrlQueryString(String.format("%ssub-accounts%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `users` to the URL query string
    if (getUsers() != null) {
      for (int i = 0; i < getUsers().size(); i++) {
        if (getUsers().get(i) != null) {
          joiner.add(getUsers().get(i).toUrlQueryString(String.format("%susers%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

