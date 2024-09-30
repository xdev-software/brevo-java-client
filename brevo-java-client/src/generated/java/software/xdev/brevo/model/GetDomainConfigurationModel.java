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
import software.xdev.brevo.model.CreateDomainModelDnsRecords;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * GetDomainConfigurationModel
 */
@JsonPropertyOrder({
  GetDomainConfigurationModel.JSON_PROPERTY_DOMAIN,
  GetDomainConfigurationModel.JSON_PROPERTY_VERIFIED,
  GetDomainConfigurationModel.JSON_PROPERTY_AUTHENTICATED,
  GetDomainConfigurationModel.JSON_PROPERTY_DNS_RECORDS
})
@JsonTypeName("getDomainConfigurationModel")
public class GetDomainConfigurationModel {
  public static final String JSON_PROPERTY_DOMAIN = "domain";
  private String domain;

  public static final String JSON_PROPERTY_VERIFIED = "verified";
  private Boolean verified;

  public static final String JSON_PROPERTY_AUTHENTICATED = "authenticated";
  private Boolean authenticated;

  public static final String JSON_PROPERTY_DNS_RECORDS = "dns_records";
  private CreateDomainModelDnsRecords dnsRecords;

  public GetDomainConfigurationModel() {
  }

  public GetDomainConfigurationModel domain(String domain) {
    
    this.domain = domain;
    return this;
  }

  /**
   * Domain
   * @return domain
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDomain() {
    return domain;
  }


  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDomain(String domain) {
    this.domain = domain;
  }

  public GetDomainConfigurationModel verified(Boolean verified) {
    
    this.verified = verified;
    return this;
  }

  /**
   * Status of domain verification (true&#x3D;verified, false&#x3D;non verified)
   * @return verified
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VERIFIED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getVerified() {
    return verified;
  }


  @JsonProperty(JSON_PROPERTY_VERIFIED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVerified(Boolean verified) {
    this.verified = verified;
  }

  public GetDomainConfigurationModel authenticated(Boolean authenticated) {
    
    this.authenticated = authenticated;
    return this;
  }

  /**
   * Status of domain authentication (true&#x3D;authenticated, false&#x3D;non authenticated)
   * @return authenticated
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AUTHENTICATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getAuthenticated() {
    return authenticated;
  }


  @JsonProperty(JSON_PROPERTY_AUTHENTICATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAuthenticated(Boolean authenticated) {
    this.authenticated = authenticated;
  }

  public GetDomainConfigurationModel dnsRecords(CreateDomainModelDnsRecords dnsRecords) {
    
    this.dnsRecords = dnsRecords;
    return this;
  }

  /**
   * Get dnsRecords
   * @return dnsRecords
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DNS_RECORDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CreateDomainModelDnsRecords getDnsRecords() {
    return dnsRecords;
  }


  @JsonProperty(JSON_PROPERTY_DNS_RECORDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDnsRecords(CreateDomainModelDnsRecords dnsRecords) {
    this.dnsRecords = dnsRecords;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDomainConfigurationModel getDomainConfigurationModel = (GetDomainConfigurationModel) o;
    return Objects.equals(this.domain, getDomainConfigurationModel.domain) &&
        Objects.equals(this.verified, getDomainConfigurationModel.verified) &&
        Objects.equals(this.authenticated, getDomainConfigurationModel.authenticated) &&
        Objects.equals(this.dnsRecords, getDomainConfigurationModel.dnsRecords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, verified, authenticated, dnsRecords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDomainConfigurationModel {\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
    sb.append("    authenticated: ").append(toIndentedString(authenticated)).append("\n");
    sb.append("    dnsRecords: ").append(toIndentedString(dnsRecords)).append("\n");
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

    // add `domain` to the URL query string
    if (getDomain() != null) {
      try {
        joiner.add(String.format("%sdomain%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDomain()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `verified` to the URL query string
    if (getVerified() != null) {
      try {
        joiner.add(String.format("%sverified%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVerified()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `authenticated` to the URL query string
    if (getAuthenticated() != null) {
      try {
        joiner.add(String.format("%sauthenticated%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuthenticated()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `dns_records` to the URL query string
    if (getDnsRecords() != null) {
      joiner.add(getDnsRecords().toUrlQueryString(prefix + "dns_records" + suffix));
    }

    return joiner.toString();
  }

}

