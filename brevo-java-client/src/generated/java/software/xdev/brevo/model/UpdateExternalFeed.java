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
import software.xdev.brevo.model.GetExternalFeedByUUIDHeadersInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * UpdateExternalFeed
 */
@JsonPropertyOrder({
  UpdateExternalFeed.JSON_PROPERTY_NAME,
  UpdateExternalFeed.JSON_PROPERTY_URL,
  UpdateExternalFeed.JSON_PROPERTY_AUTH_TYPE,
  UpdateExternalFeed.JSON_PROPERTY_USERNAME,
  UpdateExternalFeed.JSON_PROPERTY_PASSWORD,
  UpdateExternalFeed.JSON_PROPERTY_TOKEN,
  UpdateExternalFeed.JSON_PROPERTY_HEADERS,
  UpdateExternalFeed.JSON_PROPERTY_MAX_RETRIES,
  UpdateExternalFeed.JSON_PROPERTY_CACHE
})
@JsonTypeName("updateExternalFeed")
public class UpdateExternalFeed {
  public static final String JSON_PROPERTY_NAME = "name";
  @jakarta.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_URL = "url";
  @jakarta.annotation.Nullable
  private String url;

  /**
   * Auth type of the feed:  * &#x60;basic&#x60;  * &#x60;token&#x60;  * &#x60;noAuth&#x60; 
   */
  public enum AuthTypeEnum {
    BASIC(String.valueOf("basic")),
    
    TOKEN(String.valueOf("token")),
    
    NO_AUTH(String.valueOf("noAuth"));

    private String value;

    AuthTypeEnum(String value) {
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
    public static AuthTypeEnum fromValue(String value) {
      for (AuthTypeEnum b : AuthTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_AUTH_TYPE = "authType";
  @jakarta.annotation.Nullable
  private AuthTypeEnum authType;

  public static final String JSON_PROPERTY_USERNAME = "username";
  @jakarta.annotation.Nullable
  private String username;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  @jakarta.annotation.Nullable
  private String password;

  public static final String JSON_PROPERTY_TOKEN = "token";
  @jakarta.annotation.Nullable
  private String token;

  public static final String JSON_PROPERTY_HEADERS = "headers";
  @jakarta.annotation.Nullable
  private List<GetExternalFeedByUUIDHeadersInner> headers = new ArrayList<>();

  public static final String JSON_PROPERTY_MAX_RETRIES = "maxRetries";
  @jakarta.annotation.Nullable
  private Integer maxRetries = 5;

  public static final String JSON_PROPERTY_CACHE = "cache";
  @jakarta.annotation.Nullable
  private Boolean cache = false;

  public UpdateExternalFeed() {
  }

  public UpdateExternalFeed name(@jakarta.annotation.Nullable String name) {
    
    this.name = name;
    return this;
  }

  /**
   * Name of the feed
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(@jakarta.annotation.Nullable String name) {
    this.name = name;
  }

  public UpdateExternalFeed url(@jakarta.annotation.Nullable String url) {
    
    this.url = url;
    return this;
  }

  /**
   * URL of the feed
   * @return url
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(@jakarta.annotation.Nullable String url) {
    this.url = url;
  }

  public UpdateExternalFeed authType(@jakarta.annotation.Nullable AuthTypeEnum authType) {
    
    this.authType = authType;
    return this;
  }

  /**
   * Auth type of the feed:  * &#x60;basic&#x60;  * &#x60;token&#x60;  * &#x60;noAuth&#x60; 
   * @return authType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AuthTypeEnum getAuthType() {
    return authType;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthType(@jakarta.annotation.Nullable AuthTypeEnum authType) {
    this.authType = authType;
  }

  public UpdateExternalFeed username(@jakarta.annotation.Nullable String username) {
    
    this.username = username;
    return this;
  }

  /**
   * Username for authType &#x60;basic&#x60;
   * @return username
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsername() {
    return username;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsername(@jakarta.annotation.Nullable String username) {
    this.username = username;
  }

  public UpdateExternalFeed password(@jakarta.annotation.Nullable String password) {
    
    this.password = password;
    return this;
  }

  /**
   * Password for authType &#x60;basic&#x60;
   * @return password
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassword(@jakarta.annotation.Nullable String password) {
    this.password = password;
  }

  public UpdateExternalFeed token(@jakarta.annotation.Nullable String token) {
    
    this.token = token;
    return this;
  }

  /**
   * Token for authType &#x60;token&#x60;
   * @return token
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getToken() {
    return token;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToken(@jakarta.annotation.Nullable String token) {
    this.token = token;
  }

  public UpdateExternalFeed headers(@jakarta.annotation.Nullable List<GetExternalFeedByUUIDHeadersInner> headers) {
    
    this.headers = headers;
    return this;
  }

  public UpdateExternalFeed addHeadersItem(GetExternalFeedByUUIDHeadersInner headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<>();
    }
    this.headers.add(headersItem);
    return this;
  }

  /**
   * Custom headers for the feed
   * @return headers
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetExternalFeedByUUIDHeadersInner> getHeaders() {
    return headers;
  }


  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeaders(@jakarta.annotation.Nullable List<GetExternalFeedByUUIDHeadersInner> headers) {
    this.headers = headers;
  }

  public UpdateExternalFeed maxRetries(@jakarta.annotation.Nullable Integer maxRetries) {
    
    this.maxRetries = maxRetries;
    return this;
  }

  /**
   * Maximum number of retries on the feed url
   * minimum: 0
   * maximum: 5
   * @return maxRetries
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAX_RETRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxRetries() {
    return maxRetries;
  }


  @JsonProperty(JSON_PROPERTY_MAX_RETRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxRetries(@jakarta.annotation.Nullable Integer maxRetries) {
    this.maxRetries = maxRetries;
  }

  public UpdateExternalFeed cache(@jakarta.annotation.Nullable Boolean cache) {
    
    this.cache = cache;
    return this;
  }

  /**
   * Toggle caching of feed url response
   * @return cache
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CACHE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCache() {
    return cache;
  }


  @JsonProperty(JSON_PROPERTY_CACHE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCache(@jakarta.annotation.Nullable Boolean cache) {
    this.cache = cache;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateExternalFeed updateExternalFeed = (UpdateExternalFeed) o;
    return Objects.equals(this.name, updateExternalFeed.name) &&
        Objects.equals(this.url, updateExternalFeed.url) &&
        Objects.equals(this.authType, updateExternalFeed.authType) &&
        Objects.equals(this.username, updateExternalFeed.username) &&
        Objects.equals(this.password, updateExternalFeed.password) &&
        Objects.equals(this.token, updateExternalFeed.token) &&
        Objects.equals(this.headers, updateExternalFeed.headers) &&
        Objects.equals(this.maxRetries, updateExternalFeed.maxRetries) &&
        Objects.equals(this.cache, updateExternalFeed.cache);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url, authType, username, password, token, headers, maxRetries, cache);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateExternalFeed {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    maxRetries: ").append(toIndentedString(maxRetries)).append("\n");
    sb.append("    cache: ").append(toIndentedString(cache)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `url` to the URL query string
    if (getUrl() != null) {
      try {
        joiner.add(String.format("%surl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `authType` to the URL query string
    if (getAuthType() != null) {
      try {
        joiner.add(String.format("%sauthType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuthType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `username` to the URL query string
    if (getUsername() != null) {
      try {
        joiner.add(String.format("%susername%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUsername()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
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

    // add `token` to the URL query string
    if (getToken() != null) {
      try {
        joiner.add(String.format("%stoken%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getToken()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `headers` to the URL query string
    if (getHeaders() != null) {
      for (int i = 0; i < getHeaders().size(); i++) {
        if (getHeaders().get(i) != null) {
          joiner.add(getHeaders().get(i).toUrlQueryString(String.format("%sheaders%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `maxRetries` to the URL query string
    if (getMaxRetries() != null) {
      try {
        joiner.add(String.format("%smaxRetries%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaxRetries()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `cache` to the URL query string
    if (getCache() != null) {
      try {
        joiner.add(String.format("%scache%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCache()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

