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
 * Statistics about your child account activity
 */
@JsonPropertyOrder({
  GetChildInfoAllOfStatistics.JSON_PROPERTY_PREVIOUS_MONTH_TOTAL_SENT,
  GetChildInfoAllOfStatistics.JSON_PROPERTY_CURRENT_MONTH_TOTAL_SENT,
  GetChildInfoAllOfStatistics.JSON_PROPERTY_TOTAL_SENT
})
@JsonTypeName("getChildInfo_allOf_statistics")
public class GetChildInfoAllOfStatistics {
  public static final String JSON_PROPERTY_PREVIOUS_MONTH_TOTAL_SENT = "previousMonthTotalSent";
  @jakarta.annotation.Nullable
  private Long previousMonthTotalSent;

  public static final String JSON_PROPERTY_CURRENT_MONTH_TOTAL_SENT = "currentMonthTotalSent";
  @jakarta.annotation.Nullable
  private Long currentMonthTotalSent;

  public static final String JSON_PROPERTY_TOTAL_SENT = "totalSent";
  @jakarta.annotation.Nullable
  private Long totalSent;

  public GetChildInfoAllOfStatistics() {
  }

  public GetChildInfoAllOfStatistics previousMonthTotalSent(@jakarta.annotation.Nullable Long previousMonthTotalSent) {
    
    this.previousMonthTotalSent = previousMonthTotalSent;
    return this;
  }

  /**
   * Overall emails sent for the previous month
   * @return previousMonthTotalSent
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREVIOUS_MONTH_TOTAL_SENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPreviousMonthTotalSent() {
    return previousMonthTotalSent;
  }


  @JsonProperty(JSON_PROPERTY_PREVIOUS_MONTH_TOTAL_SENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreviousMonthTotalSent(@jakarta.annotation.Nullable Long previousMonthTotalSent) {
    this.previousMonthTotalSent = previousMonthTotalSent;
  }

  public GetChildInfoAllOfStatistics currentMonthTotalSent(@jakarta.annotation.Nullable Long currentMonthTotalSent) {
    
    this.currentMonthTotalSent = currentMonthTotalSent;
    return this;
  }

  /**
   * Overall emails sent for current month
   * @return currentMonthTotalSent
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT_MONTH_TOTAL_SENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCurrentMonthTotalSent() {
    return currentMonthTotalSent;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_MONTH_TOTAL_SENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentMonthTotalSent(@jakarta.annotation.Nullable Long currentMonthTotalSent) {
    this.currentMonthTotalSent = currentMonthTotalSent;
  }

  public GetChildInfoAllOfStatistics totalSent(@jakarta.annotation.Nullable Long totalSent) {
    
    this.totalSent = totalSent;
    return this;
  }

  /**
   * Overall emails sent for since the account exists
   * @return totalSent
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_SENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTotalSent() {
    return totalSent;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_SENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalSent(@jakarta.annotation.Nullable Long totalSent) {
    this.totalSent = totalSent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetChildInfoAllOfStatistics getChildInfoAllOfStatistics = (GetChildInfoAllOfStatistics) o;
    return Objects.equals(this.previousMonthTotalSent, getChildInfoAllOfStatistics.previousMonthTotalSent) &&
        Objects.equals(this.currentMonthTotalSent, getChildInfoAllOfStatistics.currentMonthTotalSent) &&
        Objects.equals(this.totalSent, getChildInfoAllOfStatistics.totalSent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(previousMonthTotalSent, currentMonthTotalSent, totalSent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetChildInfoAllOfStatistics {\n");
    sb.append("    previousMonthTotalSent: ").append(toIndentedString(previousMonthTotalSent)).append("\n");
    sb.append("    currentMonthTotalSent: ").append(toIndentedString(currentMonthTotalSent)).append("\n");
    sb.append("    totalSent: ").append(toIndentedString(totalSent)).append("\n");
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

    // add `previousMonthTotalSent` to the URL query string
    if (getPreviousMonthTotalSent() != null) {
      try {
        joiner.add(String.format("%spreviousMonthTotalSent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPreviousMonthTotalSent()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `currentMonthTotalSent` to the URL query string
    if (getCurrentMonthTotalSent() != null) {
      try {
        joiner.add(String.format("%scurrentMonthTotalSent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCurrentMonthTotalSent()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `totalSent` to the URL query string
    if (getTotalSent() != null) {
      try {
        joiner.add(String.format("%stotalSent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTotalSent()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

