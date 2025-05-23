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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * CorporateGroupDetailsResponseUsersInner
 */
@JsonPropertyOrder({
  CorporateGroupDetailsResponseUsersInner.JSON_PROPERTY_EMAIL,
  CorporateGroupDetailsResponseUsersInner.JSON_PROPERTY_LAST_NAME,
  CorporateGroupDetailsResponseUsersInner.JSON_PROPERTY_FIRST_NAME
})
@JsonTypeName("corporateGroupDetailsResponse_users_inner")
public class CorporateGroupDetailsResponseUsersInner {
  public static final String JSON_PROPERTY_EMAIL = "email";
  @jakarta.annotation.Nullable
  private String email;

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  @jakarta.annotation.Nullable
  private String lastName;

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  @jakarta.annotation.Nullable
  private String firstName;

  public CorporateGroupDetailsResponseUsersInner() {
  }

  public CorporateGroupDetailsResponseUsersInner email(@jakarta.annotation.Nullable String email) {
    
    this.email = email;
    return this;
  }

  /**
   * Email address of the user
   * @return email
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(@jakarta.annotation.Nullable String email) {
    this.email = email;
  }

  public CorporateGroupDetailsResponseUsersInner lastName(@jakarta.annotation.Nullable String lastName) {
    
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name of the user
   * @return lastName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastName() {
    return lastName;
  }


  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastName(@jakarta.annotation.Nullable String lastName) {
    this.lastName = lastName;
  }

  public CorporateGroupDetailsResponseUsersInner firstName(@jakarta.annotation.Nullable String firstName) {
    
    this.firstName = firstName;
    return this;
  }

  /**
   * First name of the user
   * @return firstName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstName() {
    return firstName;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstName(@jakarta.annotation.Nullable String firstName) {
    this.firstName = firstName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorporateGroupDetailsResponseUsersInner corporateGroupDetailsResponseUsersInner = (CorporateGroupDetailsResponseUsersInner) o;
    return Objects.equals(this.email, corporateGroupDetailsResponseUsersInner.email) &&
        Objects.equals(this.lastName, corporateGroupDetailsResponseUsersInner.lastName) &&
        Objects.equals(this.firstName, corporateGroupDetailsResponseUsersInner.firstName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, lastName, firstName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorporateGroupDetailsResponseUsersInner {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
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

    // add `lastName` to the URL query string
    if (getLastName() != null) {
      try {
        joiner.add(String.format("%slastName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `firstName` to the URL query string
    if (getFirstName() != null) {
      try {
        joiner.add(String.format("%sfirstName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFirstName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

