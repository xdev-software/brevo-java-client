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
 * GetSharedTemplateUrl
 */
@JsonPropertyOrder({
  GetSharedTemplateUrl.JSON_PROPERTY_SHARED_URL
})
@JsonTypeName("getSharedTemplateUrl")
public class GetSharedTemplateUrl {
  public static final String JSON_PROPERTY_SHARED_URL = "sharedUrl";
  @jakarta.annotation.Nonnull
  private String sharedUrl;

  public GetSharedTemplateUrl() {
  }

  public GetSharedTemplateUrl sharedUrl(@jakarta.annotation.Nonnull String sharedUrl) {
    
    this.sharedUrl = sharedUrl;
    return this;
  }

  /**
   * A unique URL for the email campaign or transactional template. This URL can be shared with other Brevo users.
   * @return sharedUrl
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SHARED_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSharedUrl() {
    return sharedUrl;
  }


  @JsonProperty(JSON_PROPERTY_SHARED_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSharedUrl(@jakarta.annotation.Nonnull String sharedUrl) {
    this.sharedUrl = sharedUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSharedTemplateUrl getSharedTemplateUrl = (GetSharedTemplateUrl) o;
    return Objects.equals(this.sharedUrl, getSharedTemplateUrl.sharedUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sharedUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSharedTemplateUrl {\n");
    sb.append("    sharedUrl: ").append(toIndentedString(sharedUrl)).append("\n");
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

    // add `sharedUrl` to the URL query string
    if (getSharedUrl() != null) {
      try {
        joiner.add(String.format("%ssharedUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSharedUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

