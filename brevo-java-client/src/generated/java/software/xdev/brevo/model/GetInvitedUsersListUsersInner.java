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
import software.xdev.brevo.model.GetInvitedUsersListUsersInnerFeatureAccess;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * GetInvitedUsersListUsersInner
 */
@JsonPropertyOrder({
  GetInvitedUsersListUsersInner.JSON_PROPERTY_EMAIL,
  GetInvitedUsersListUsersInner.JSON_PROPERTY_IS_OWNER,
  GetInvitedUsersListUsersInner.JSON_PROPERTY_STATUS,
  GetInvitedUsersListUsersInner.JSON_PROPERTY_FEATURE_ACCESS
})
@JsonTypeName("getInvitedUsersList_users_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetInvitedUsersListUsersInner {
  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_IS_OWNER = "is_owner";
  private String isOwner;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_FEATURE_ACCESS = "feature_access";
  private GetInvitedUsersListUsersInnerFeatureAccess featureAccess;

  public GetInvitedUsersListUsersInner() {
  }

  public GetInvitedUsersListUsersInner email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Email address of the user.
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


  public GetInvitedUsersListUsersInner isOwner(String isOwner) {
    
    this.isOwner = isOwner;
    return this;
  }

   /**
   * Flag for indicating is user owner of the organization.
   * @return isOwner
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_OWNER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIsOwner() {
    return isOwner;
  }


  @JsonProperty(JSON_PROPERTY_IS_OWNER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsOwner(String isOwner) {
    this.isOwner = isOwner;
  }


  public GetInvitedUsersListUsersInner status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status of the invited user.
   * @return status
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(String status) {
    this.status = status;
  }


  public GetInvitedUsersListUsersInner featureAccess(GetInvitedUsersListUsersInnerFeatureAccess featureAccess) {
    
    this.featureAccess = featureAccess;
    return this;
  }

   /**
   * Get featureAccess
   * @return featureAccess
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FEATURE_ACCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GetInvitedUsersListUsersInnerFeatureAccess getFeatureAccess() {
    return featureAccess;
  }


  @JsonProperty(JSON_PROPERTY_FEATURE_ACCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFeatureAccess(GetInvitedUsersListUsersInnerFeatureAccess featureAccess) {
    this.featureAccess = featureAccess;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetInvitedUsersListUsersInner getInvitedUsersListUsersInner = (GetInvitedUsersListUsersInner) o;
    return Objects.equals(this.email, getInvitedUsersListUsersInner.email) &&
        Objects.equals(this.isOwner, getInvitedUsersListUsersInner.isOwner) &&
        Objects.equals(this.status, getInvitedUsersListUsersInner.status) &&
        Objects.equals(this.featureAccess, getInvitedUsersListUsersInner.featureAccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, isOwner, status, featureAccess);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInvitedUsersListUsersInner {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    isOwner: ").append(toIndentedString(isOwner)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    featureAccess: ").append(toIndentedString(featureAccess)).append("\n");
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

    // add `is_owner` to the URL query string
    if (getIsOwner() != null) {
      try {
        joiner.add(String.format("%sis_owner%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsOwner()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      try {
        joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `feature_access` to the URL query string
    if (getFeatureAccess() != null) {
      joiner.add(getFeatureAccess().toUrlQueryString(prefix + "feature_access" + suffix));
    }

    return joiner.toString();
  }

}
