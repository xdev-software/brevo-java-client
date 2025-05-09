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
 * CreateReseller
 */
@JsonPropertyOrder({
  CreateReseller.JSON_PROPERTY_AUTH_KEY,
  CreateReseller.JSON_PROPERTY_ID
})
@JsonTypeName("createReseller")
public class CreateReseller {
  public static final String JSON_PROPERTY_AUTH_KEY = "authKey";
  @jakarta.annotation.Nonnull
  private String authKey;

  public static final String JSON_PROPERTY_ID = "id";
  @jakarta.annotation.Nullable
  private Long id;

  public CreateReseller() {
  }

  public CreateReseller authKey(@jakarta.annotation.Nonnull String authKey) {
    
    this.authKey = authKey;
    return this;
  }

  /**
   * AuthKey of Reseller child created
   * @return authKey
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AUTH_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAuthKey() {
    return authKey;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAuthKey(@jakarta.annotation.Nonnull String authKey) {
    this.authKey = authKey;
  }

  public CreateReseller id(@jakarta.annotation.Nullable Long id) {
    
    this.id = id;
    return this;
  }

  /**
   * Id of Reseller child created
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@jakarta.annotation.Nullable Long id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateReseller createReseller = (CreateReseller) o;
    return Objects.equals(this.authKey, createReseller.authKey) &&
        Objects.equals(this.id, createReseller.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authKey, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateReseller {\n");
    sb.append("    authKey: ").append(toIndentedString(authKey)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

    // add `authKey` to the URL query string
    if (getAuthKey() != null) {
      try {
        joiner.add(String.format("%sauthKey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuthKey()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

