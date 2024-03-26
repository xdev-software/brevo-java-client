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
import software.xdev.brevo.model.GetChildInfoAllOfApiKeys;
import software.xdev.brevo.model.GetChildInfoAllOfCredits;
import software.xdev.brevo.model.GetChildInfoAllOfStatistics;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * GetChildInfo
 */
@JsonPropertyOrder({
  GetChildInfo.JSON_PROPERTY_EMAIL,
  GetChildInfo.JSON_PROPERTY_FIRST_NAME,
  GetChildInfo.JSON_PROPERTY_LAST_NAME,
  GetChildInfo.JSON_PROPERTY_COMPANY_NAME,
  GetChildInfo.JSON_PROPERTY_CREDITS,
  GetChildInfo.JSON_PROPERTY_STATISTICS,
  GetChildInfo.JSON_PROPERTY_PASSWORD,
  GetChildInfo.JSON_PROPERTY_IPS,
  GetChildInfo.JSON_PROPERTY_API_KEYS
})
@JsonTypeName("getChildInfo")
public class GetChildInfo {
  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  private String lastName;

  public static final String JSON_PROPERTY_COMPANY_NAME = "companyName";
  private String companyName;

  public static final String JSON_PROPERTY_CREDITS = "credits";
  private GetChildInfoAllOfCredits credits;

  public static final String JSON_PROPERTY_STATISTICS = "statistics";
  private GetChildInfoAllOfStatistics statistics;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_IPS = "ips";
  private List<String> ips;

  public static final String JSON_PROPERTY_API_KEYS = "apiKeys";
  private GetChildInfoAllOfApiKeys apiKeys;

  public GetChildInfo() {
  }

  public GetChildInfo email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Login Email
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


  public GetChildInfo firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * First Name
   * @return firstName
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFirstName() {
    return firstName;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public GetChildInfo lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Last Name
   * @return lastName
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLastName() {
    return lastName;
  }


  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public GetChildInfo companyName(String companyName) {
    
    this.companyName = companyName;
    return this;
  }

   /**
   * Name of the company
   * @return companyName
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCompanyName() {
    return companyName;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public GetChildInfo credits(GetChildInfoAllOfCredits credits) {
    
    this.credits = credits;
    return this;
  }

   /**
   * Get credits
   * @return credits
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREDITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetChildInfoAllOfCredits getCredits() {
    return credits;
  }


  @JsonProperty(JSON_PROPERTY_CREDITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCredits(GetChildInfoAllOfCredits credits) {
    this.credits = credits;
  }


  public GetChildInfo statistics(GetChildInfoAllOfStatistics statistics) {
    
    this.statistics = statistics;
    return this;
  }

   /**
   * Get statistics
   * @return statistics
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATISTICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetChildInfoAllOfStatistics getStatistics() {
    return statistics;
  }


  @JsonProperty(JSON_PROPERTY_STATISTICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatistics(GetChildInfoAllOfStatistics statistics) {
    this.statistics = statistics;
  }


  public GetChildInfo password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * The encrypted password of child account
   * @return password
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPassword(String password) {
    this.password = password;
  }


  public GetChildInfo ips(List<String> ips) {
    
    this.ips = ips;
    return this;
  }

  public GetChildInfo addIpsItem(String ipsItem) {
    if (this.ips == null) {
      this.ips = new ArrayList<>();
    }
    this.ips.add(ipsItem);
    return this;
  }

   /**
   * IP(s) associated to a child account user
   * @return ips
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getIps() {
    return ips;
  }


  @JsonProperty(JSON_PROPERTY_IPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIps(List<String> ips) {
    this.ips = ips;
  }


  public GetChildInfo apiKeys(GetChildInfoAllOfApiKeys apiKeys) {
    
    this.apiKeys = apiKeys;
    return this;
  }

   /**
   * Get apiKeys
   * @return apiKeys
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_API_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GetChildInfoAllOfApiKeys getApiKeys() {
    return apiKeys;
  }


  @JsonProperty(JSON_PROPERTY_API_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApiKeys(GetChildInfoAllOfApiKeys apiKeys) {
    this.apiKeys = apiKeys;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetChildInfo getChildInfo = (GetChildInfo) o;
    return Objects.equals(this.email, getChildInfo.email) &&
        Objects.equals(this.firstName, getChildInfo.firstName) &&
        Objects.equals(this.lastName, getChildInfo.lastName) &&
        Objects.equals(this.companyName, getChildInfo.companyName) &&
        Objects.equals(this.credits, getChildInfo.credits) &&
        Objects.equals(this.statistics, getChildInfo.statistics) &&
        Objects.equals(this.password, getChildInfo.password) &&
        Objects.equals(this.ips, getChildInfo.ips) &&
        Objects.equals(this.apiKeys, getChildInfo.apiKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, firstName, lastName, companyName, credits, statistics, password, ips, apiKeys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetChildInfo {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
    sb.append("    password: ").append("*").append("\n");
    sb.append("    ips: ").append(toIndentedString(ips)).append("\n");
    sb.append("    apiKeys: ").append(toIndentedString(apiKeys)).append("\n");
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

    // add `firstName` to the URL query string
    if (getFirstName() != null) {
      try {
        joiner.add(String.format("%sfirstName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFirstName()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `companyName` to the URL query string
    if (getCompanyName() != null) {
      try {
        joiner.add(String.format("%scompanyName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCompanyName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `credits` to the URL query string
    if (getCredits() != null) {
      joiner.add(getCredits().toUrlQueryString(prefix + "credits" + suffix));
    }

    // add `statistics` to the URL query string
    if (getStatistics() != null) {
      joiner.add(getStatistics().toUrlQueryString(prefix + "statistics" + suffix));
    }

    // add `password` to the URL query string
    if (getPassword() != null) {
      try {
        joiner.add(String.format("%spassword%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPassword()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `ips` to the URL query string
    if (getIps() != null) {
      for (int i = 0; i < getIps().size(); i++) {
        try {
          joiner.add(String.format("%sips%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getIps().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `apiKeys` to the URL query string
    if (getApiKeys() != null) {
      joiner.add(getApiKeys().toUrlQueryString(prefix + "apiKeys" + suffix));
    }

    return joiner.toString();
  }

}

