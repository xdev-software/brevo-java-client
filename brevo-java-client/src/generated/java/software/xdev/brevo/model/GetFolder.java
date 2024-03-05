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
 * GetFolder
 */
@JsonPropertyOrder({
  GetFolder.JSON_PROPERTY_ID,
  GetFolder.JSON_PROPERTY_NAME,
  GetFolder.JSON_PROPERTY_TOTAL_BLACKLISTED,
  GetFolder.JSON_PROPERTY_TOTAL_SUBSCRIBERS,
  GetFolder.JSON_PROPERTY_UNIQUE_SUBSCRIBERS
})
@JsonTypeName("getFolder")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetFolder {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TOTAL_BLACKLISTED = "totalBlacklisted";
  private Long totalBlacklisted;

  public static final String JSON_PROPERTY_TOTAL_SUBSCRIBERS = "totalSubscribers";
  private Long totalSubscribers;

  public static final String JSON_PROPERTY_UNIQUE_SUBSCRIBERS = "uniqueSubscribers";
  private Long uniqueSubscribers;

  public GetFolder() {
  }

  public GetFolder id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the folder
   * @return id
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(Long id) {
    this.id = id;
  }


  public GetFolder name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the folder
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public GetFolder totalBlacklisted(Long totalBlacklisted) {
    
    this.totalBlacklisted = totalBlacklisted;
    return this;
  }

   /**
   * Number of blacklisted contacts in the folder
   * @return totalBlacklisted
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTAL_BLACKLISTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getTotalBlacklisted() {
    return totalBlacklisted;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_BLACKLISTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalBlacklisted(Long totalBlacklisted) {
    this.totalBlacklisted = totalBlacklisted;
  }


  public GetFolder totalSubscribers(Long totalSubscribers) {
    
    this.totalSubscribers = totalSubscribers;
    return this;
  }

   /**
   * Number of contacts in the folder
   * @return totalSubscribers
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTAL_SUBSCRIBERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getTotalSubscribers() {
    return totalSubscribers;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_SUBSCRIBERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalSubscribers(Long totalSubscribers) {
    this.totalSubscribers = totalSubscribers;
  }


  public GetFolder uniqueSubscribers(Long uniqueSubscribers) {
    
    this.uniqueSubscribers = uniqueSubscribers;
    return this;
  }

   /**
   * Number of unique contacts in the folder
   * @return uniqueSubscribers
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UNIQUE_SUBSCRIBERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getUniqueSubscribers() {
    return uniqueSubscribers;
  }


  @JsonProperty(JSON_PROPERTY_UNIQUE_SUBSCRIBERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUniqueSubscribers(Long uniqueSubscribers) {
    this.uniqueSubscribers = uniqueSubscribers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFolder getFolder = (GetFolder) o;
    return Objects.equals(this.id, getFolder.id) &&
        Objects.equals(this.name, getFolder.name) &&
        Objects.equals(this.totalBlacklisted, getFolder.totalBlacklisted) &&
        Objects.equals(this.totalSubscribers, getFolder.totalSubscribers) &&
        Objects.equals(this.uniqueSubscribers, getFolder.uniqueSubscribers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, totalBlacklisted, totalSubscribers, uniqueSubscribers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFolder {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    totalBlacklisted: ").append(toIndentedString(totalBlacklisted)).append("\n");
    sb.append("    totalSubscribers: ").append(toIndentedString(totalSubscribers)).append("\n");
    sb.append("    uniqueSubscribers: ").append(toIndentedString(uniqueSubscribers)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `totalBlacklisted` to the URL query string
    if (getTotalBlacklisted() != null) {
      try {
        joiner.add(String.format("%stotalBlacklisted%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTotalBlacklisted()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `totalSubscribers` to the URL query string
    if (getTotalSubscribers() != null) {
      try {
        joiner.add(String.format("%stotalSubscribers%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTotalSubscribers()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `uniqueSubscribers` to the URL query string
    if (getUniqueSubscribers() != null) {
      try {
        joiner.add(String.format("%suniqueSubscribers%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUniqueSubscribers()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

