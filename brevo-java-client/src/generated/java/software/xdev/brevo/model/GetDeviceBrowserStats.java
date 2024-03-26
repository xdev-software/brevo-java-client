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
 * GetDeviceBrowserStats
 */
@JsonPropertyOrder({
  GetDeviceBrowserStats.JSON_PROPERTY_CLICKERS,
  GetDeviceBrowserStats.JSON_PROPERTY_UNIQUE_CLICKS,
  GetDeviceBrowserStats.JSON_PROPERTY_VIEWED,
  GetDeviceBrowserStats.JSON_PROPERTY_UNIQUE_VIEWS
})
@JsonTypeName("getDeviceBrowserStats")
public class GetDeviceBrowserStats {
  public static final String JSON_PROPERTY_CLICKERS = "clickers";
  private Long clickers;

  public static final String JSON_PROPERTY_UNIQUE_CLICKS = "uniqueClicks";
  private Long uniqueClicks;

  public static final String JSON_PROPERTY_VIEWED = "viewed";
  private Long viewed;

  public static final String JSON_PROPERTY_UNIQUE_VIEWS = "uniqueViews";
  private Long uniqueViews;

  public GetDeviceBrowserStats() {
  }

  public GetDeviceBrowserStats clickers(Long clickers) {
    
    this.clickers = clickers;
    return this;
  }

   /**
   * Number of total clicks for the campaign using the particular browser
   * @return clickers
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CLICKERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getClickers() {
    return clickers;
  }


  @JsonProperty(JSON_PROPERTY_CLICKERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClickers(Long clickers) {
    this.clickers = clickers;
  }


  public GetDeviceBrowserStats uniqueClicks(Long uniqueClicks) {
    
    this.uniqueClicks = uniqueClicks;
    return this;
  }

   /**
   * Number of unique clicks for the campaign using the particular browser
   * @return uniqueClicks
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UNIQUE_CLICKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getUniqueClicks() {
    return uniqueClicks;
  }


  @JsonProperty(JSON_PROPERTY_UNIQUE_CLICKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUniqueClicks(Long uniqueClicks) {
    this.uniqueClicks = uniqueClicks;
  }


  public GetDeviceBrowserStats viewed(Long viewed) {
    
    this.viewed = viewed;
    return this;
  }

   /**
   * Number of openings for the campaign using the particular browser
   * @return viewed
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VIEWED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getViewed() {
    return viewed;
  }


  @JsonProperty(JSON_PROPERTY_VIEWED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setViewed(Long viewed) {
    this.viewed = viewed;
  }


  public GetDeviceBrowserStats uniqueViews(Long uniqueViews) {
    
    this.uniqueViews = uniqueViews;
    return this;
  }

   /**
   * Number of unique openings for the campaign using the particular browser
   * @return uniqueViews
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UNIQUE_VIEWS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getUniqueViews() {
    return uniqueViews;
  }


  @JsonProperty(JSON_PROPERTY_UNIQUE_VIEWS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUniqueViews(Long uniqueViews) {
    this.uniqueViews = uniqueViews;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDeviceBrowserStats getDeviceBrowserStats = (GetDeviceBrowserStats) o;
    return Objects.equals(this.clickers, getDeviceBrowserStats.clickers) &&
        Objects.equals(this.uniqueClicks, getDeviceBrowserStats.uniqueClicks) &&
        Objects.equals(this.viewed, getDeviceBrowserStats.viewed) &&
        Objects.equals(this.uniqueViews, getDeviceBrowserStats.uniqueViews);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clickers, uniqueClicks, viewed, uniqueViews);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDeviceBrowserStats {\n");
    sb.append("    clickers: ").append(toIndentedString(clickers)).append("\n");
    sb.append("    uniqueClicks: ").append(toIndentedString(uniqueClicks)).append("\n");
    sb.append("    viewed: ").append(toIndentedString(viewed)).append("\n");
    sb.append("    uniqueViews: ").append(toIndentedString(uniqueViews)).append("\n");
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

    // add `clickers` to the URL query string
    if (getClickers() != null) {
      try {
        joiner.add(String.format("%sclickers%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getClickers()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `uniqueClicks` to the URL query string
    if (getUniqueClicks() != null) {
      try {
        joiner.add(String.format("%suniqueClicks%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUniqueClicks()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `viewed` to the URL query string
    if (getViewed() != null) {
      try {
        joiner.add(String.format("%sviewed%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getViewed()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `uniqueViews` to the URL query string
    if (getUniqueViews() != null) {
      try {
        joiner.add(String.format("%suniqueViews%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUniqueViews()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

