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
 * GetSendersListSendersInnerIpsInner
 */
@JsonPropertyOrder({
  GetSendersListSendersInnerIpsInner.JSON_PROPERTY_IP,
  GetSendersListSendersInnerIpsInner.JSON_PROPERTY_DOMAIN,
  GetSendersListSendersInnerIpsInner.JSON_PROPERTY_WEIGHT
})
@JsonTypeName("getSendersList_senders_inner_ips_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetSendersListSendersInnerIpsInner {
  public static final String JSON_PROPERTY_IP = "ip";
  private String ip;

  public static final String JSON_PROPERTY_DOMAIN = "domain";
  private String domain;

  public static final String JSON_PROPERTY_WEIGHT = "weight";
  private Long weight;

  public GetSendersListSendersInnerIpsInner() {
  }

  public GetSendersListSendersInnerIpsInner ip(String ip) {
    
    this.ip = ip;
    return this;
  }

   /**
   * Dedicated IP available in your account
   * @return ip
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIp() {
    return ip;
  }


  @JsonProperty(JSON_PROPERTY_IP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIp(String ip) {
    this.ip = ip;
  }


  public GetSendersListSendersInnerIpsInner domain(String domain) {
    
    this.domain = domain;
    return this;
  }

   /**
   * Domain of the IP
   * @return domain
  **/
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


  public GetSendersListSendersInnerIpsInner weight(Long weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * Weight of the IP for this sender
   * @return weight
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getWeight() {
    return weight;
  }


  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWeight(Long weight) {
    this.weight = weight;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSendersListSendersInnerIpsInner getSendersListSendersInnerIpsInner = (GetSendersListSendersInnerIpsInner) o;
    return Objects.equals(this.ip, getSendersListSendersInnerIpsInner.ip) &&
        Objects.equals(this.domain, getSendersListSendersInnerIpsInner.domain) &&
        Objects.equals(this.weight, getSendersListSendersInnerIpsInner.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ip, domain, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSendersListSendersInnerIpsInner {\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

    // add `ip` to the URL query string
    if (getIp() != null) {
      try {
        joiner.add(String.format("%sip%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIp()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `domain` to the URL query string
    if (getDomain() != null) {
      try {
        joiner.add(String.format("%sdomain%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDomain()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `weight` to the URL query string
    if (getWeight() != null) {
      try {
        joiner.add(String.format("%sweight%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWeight()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

