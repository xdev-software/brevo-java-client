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
import software.xdev.brevo.model.MasterDetailsResponseBillingInfoAddress;
import software.xdev.brevo.model.MasterDetailsResponseBillingInfoName;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Billing details of the master account organization
 */
@JsonPropertyOrder({
  MasterDetailsResponseBillingInfo.JSON_PROPERTY_EMAIL,
  MasterDetailsResponseBillingInfo.JSON_PROPERTY_COMPANY_NAME,
  MasterDetailsResponseBillingInfo.JSON_PROPERTY_NAME,
  MasterDetailsResponseBillingInfo.JSON_PROPERTY_ADDRESS
})
@JsonTypeName("masterDetailsResponse_billingInfo")
public class MasterDetailsResponseBillingInfo {
  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_COMPANY_NAME = "companyName";
  private String companyName;

  public static final String JSON_PROPERTY_NAME = "name";
  private MasterDetailsResponseBillingInfoName name;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private MasterDetailsResponseBillingInfoAddress address;

  public MasterDetailsResponseBillingInfo() {
  }

  public MasterDetailsResponseBillingInfo email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Billing email id of master account
   * @return email
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }

  public MasterDetailsResponseBillingInfo companyName(String companyName) {
    
    this.companyName = companyName;
    return this;
  }

   /**
   * Company name of master account
   * @return companyName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyName() {
    return companyName;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public MasterDetailsResponseBillingInfo name(MasterDetailsResponseBillingInfoName name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MasterDetailsResponseBillingInfoName getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(MasterDetailsResponseBillingInfoName name) {
    this.name = name;
  }

  public MasterDetailsResponseBillingInfo address(MasterDetailsResponseBillingInfoAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MasterDetailsResponseBillingInfoAddress getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(MasterDetailsResponseBillingInfoAddress address) {
    this.address = address;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MasterDetailsResponseBillingInfo masterDetailsResponseBillingInfo = (MasterDetailsResponseBillingInfo) o;
    return Objects.equals(this.email, masterDetailsResponseBillingInfo.email) &&
        Objects.equals(this.companyName, masterDetailsResponseBillingInfo.companyName) &&
        Objects.equals(this.name, masterDetailsResponseBillingInfo.name) &&
        Objects.equals(this.address, masterDetailsResponseBillingInfo.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, companyName, name, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MasterDetailsResponseBillingInfo {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

    // add `companyName` to the URL query string
    if (getCompanyName() != null) {
      try {
        joiner.add(String.format("%scompanyName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCompanyName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(getName().toUrlQueryString(prefix + "name" + suffix));
    }

    // add `address` to the URL query string
    if (getAddress() != null) {
      joiner.add(getAddress().toUrlQueryString(prefix + "address" + suffix));
    }

    return joiner.toString();
  }

}

