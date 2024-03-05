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
  InviteuserPrivilegesInner.JSON_PROPERTY_FEATURE,
  InviteuserPrivilegesInner.JSON_PROPERTY_PERMISSIONS
})
@JsonTypeName("inviteuser_privileges_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InviteuserPrivilegesInner {
  /**
   * Feature name
   */
  public enum FeatureEnum {
    EMAIL_CAMPAIGNS("email_campaigns"),
    
    SMS_CAMPAIGNS("sms_campaigns"),
    
    CONTACTS("contacts"),
    
    TEMPLATES("templates"),
    
    WORKFLOWS("workflows"),
    
    FACEBOOK_ADS("facebook_ads"),
    
    LANDING_PAGES("landing_pages"),
    
    TRANSACTIONAL_EMAILS("transactional_emails"),
    
    SMTP_API("smtp_api"),
    
    USER_MANAGEMENT("user_management"),
    
    SALES_PLATFORM("sales_platform"),
    
    PHONE("phone"),
    
    CONVERSATIONS("conversations"),
    
    SENDERS_DOMAINS_DEDICATED_IPS("senders_domains_dedicated_ips"),
    
    PUSH_NOTIFICATIONS("push_notifications");

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
    CREATE_EDIT_DELETE("create_edit_delete"),
    
    SEND_SCHEDULE_SUSPEND("send_schedule_suspend"),
    
    VIEW("view"),
    
    IMPORT("import"),
    
    EXPORT("export"),
    
    LIST_AND_ATTRIBUTES("list_and_attributes"),
    
    FORMS("forms"),
    
    ACTIVATE_DEACTIVATE("activate_deactivate"),
    
    ACTIVATE_DEACTIVATE_PAUSE("activate_deactivate_pause"),
    
    SETTINGS("settings"),
    
    SCHEDULE_PAUSE("schedule_pause"),
    
    ALL("all"),
    
    LOGS("logs"),
    
    ACCESS("access"),
    
    ASSIGN("assign"),
    
    CONFIGURE("configure"),
    
    MANAGE_OWNED_DEALS_TASKS_COMPANIES("manage_owned_deals_tasks_companies"),
    
    MANAGE_OTHERS_DEALS_TASKS_COMPANIES("manage_others_deals_tasks_companies"),
    
    REPORTS("reports"),
    
    SENDERS_MANAGEMENT("senders_management"),
    
    DOMAINS_MANAGEMENT("domains_management"),
    
    DEDICATED_IPS_MANAGEMENT("dedicated_ips_management"),
    
    SEND("send"),
    
    SMTP("smtp"),
    
    API_KEYS("api_keys"),
    
    AUTHORIZED_IPS("authorized_ips"),
    
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
  private List<PermissionsEnum> permissions;

  public InviteuserPrivilegesInner() {
  }

  public InviteuserPrivilegesInner feature(FeatureEnum feature) {
    
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


  public InviteuserPrivilegesInner permissions(List<PermissionsEnum> permissions) {
    
    this.permissions = permissions;
    return this;
  }

  public InviteuserPrivilegesInner addPermissionsItem(PermissionsEnum permissionsItem) {
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
    InviteuserPrivilegesInner inviteuserPrivilegesInner = (InviteuserPrivilegesInner) o;
    return Objects.equals(this.feature, inviteuserPrivilegesInner.feature) &&
        Objects.equals(this.permissions, inviteuserPrivilegesInner.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feature, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteuserPrivilegesInner {\n");
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
