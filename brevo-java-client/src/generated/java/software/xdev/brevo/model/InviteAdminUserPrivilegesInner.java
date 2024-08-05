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
 * Privileges given to the user
 */
@JsonPropertyOrder({
  InviteAdminUserPrivilegesInner.JSON_PROPERTY_FEATURE,
  InviteAdminUserPrivilegesInner.JSON_PROPERTY_PERMISSIONS
})
@JsonTypeName("inviteAdminUser_privileges_inner")
public class InviteAdminUserPrivilegesInner {
  /**
   * Feature name
   */
  public enum FeatureEnum {
    MY_PLAN("my_plan"),
    
    API("api"),
    
    USER_MANAGEMENT("user_management"),
    
    APP_MANAGEMENT("app_management");

    private String value;

    FeatureEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FeatureEnum fromValue(String value) {
      for (FeatureEnum b : FeatureEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FEATURE = "feature";
  private FeatureEnum feature;

  /**
   * Gets or Sets permissions
   */
  public enum PermissionsEnum {
    ALL("all"),
    
    NONE("none");

    private String value;

    PermissionsEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PermissionsEnum fromValue(String value) {
      for (PermissionsEnum b : PermissionsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PERMISSIONS = "permissions";
  private List<PermissionsEnum> permissions = new ArrayList<>();

  public InviteAdminUserPrivilegesInner() {
  }

  public InviteAdminUserPrivilegesInner feature(FeatureEnum feature) {
    
    this.feature = feature;
    return this;
  }

   /**
   * Feature name
   * @return feature
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeatureEnum getFeature() {
    return feature;
  }


  @JsonProperty(JSON_PROPERTY_FEATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeature(FeatureEnum feature) {
    this.feature = feature;
  }

  public InviteAdminUserPrivilegesInner permissions(List<PermissionsEnum> permissions) {
    
    this.permissions = permissions;
    return this;
  }

  public InviteAdminUserPrivilegesInner addPermissionsItem(PermissionsEnum permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Permissions for a given feature
   * @return permissions
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PermissionsEnum> getPermissions() {
    return permissions;
  }


  @JsonProperty(JSON_PROPERTY_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPermissions(List<PermissionsEnum> permissions) {
    this.permissions = permissions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InviteAdminUserPrivilegesInner inviteAdminUserPrivilegesInner = (InviteAdminUserPrivilegesInner) o;
    return Objects.equals(this.feature, inviteAdminUserPrivilegesInner.feature) &&
        Objects.equals(this.permissions, inviteAdminUserPrivilegesInner.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feature, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteAdminUserPrivilegesInner {\n");
    sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

    // add `feature` to the URL query string
    if (getFeature() != null) {
      try {
        joiner.add(String.format("%sfeature%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFeature()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `permissions` to the URL query string
    if (getPermissions() != null) {
      for (int i = 0; i < getPermissions().size(); i++) {
        try {
          joiner.add(String.format("%spermissions%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getPermissions().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

