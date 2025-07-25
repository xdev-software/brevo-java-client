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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Attribution list aggregated totals
 */
@JsonPropertyOrder({
  EcommerceAttributionMetricsGet200ResponseTotals.JSON_PROPERTY_ORDERS_COUNT,
  EcommerceAttributionMetricsGet200ResponseTotals.JSON_PROPERTY_REVENUE,
  EcommerceAttributionMetricsGet200ResponseTotals.JSON_PROPERTY_AVERAGE_BASKET
})
@JsonTypeName("_ecommerce_attribution_metrics_get_200_response_totals")
public class EcommerceAttributionMetricsGet200ResponseTotals {
  public static final String JSON_PROPERTY_ORDERS_COUNT = "ordersCount";
  @jakarta.annotation.Nonnull
  private BigDecimal ordersCount;

  public static final String JSON_PROPERTY_REVENUE = "revenue";
  @jakarta.annotation.Nonnull
  private Float revenue;

  public static final String JSON_PROPERTY_AVERAGE_BASKET = "averageBasket";
  @jakarta.annotation.Nonnull
  private Float averageBasket;

  public EcommerceAttributionMetricsGet200ResponseTotals() {
  }

  public EcommerceAttributionMetricsGet200ResponseTotals ordersCount(@jakarta.annotation.Nonnull BigDecimal ordersCount) {
    
    this.ordersCount = ordersCount;
    return this;
  }

  /**
   * Get ordersCount
   * @return ordersCount
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ORDERS_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getOrdersCount() {
    return ordersCount;
  }


  @JsonProperty(JSON_PROPERTY_ORDERS_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrdersCount(@jakarta.annotation.Nonnull BigDecimal ordersCount) {
    this.ordersCount = ordersCount;
  }

  public EcommerceAttributionMetricsGet200ResponseTotals revenue(@jakarta.annotation.Nonnull Float revenue) {
    
    this.revenue = revenue;
    return this;
  }

  /**
   * Get revenue
   * @return revenue
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REVENUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getRevenue() {
    return revenue;
  }


  @JsonProperty(JSON_PROPERTY_REVENUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRevenue(@jakarta.annotation.Nonnull Float revenue) {
    this.revenue = revenue;
  }

  public EcommerceAttributionMetricsGet200ResponseTotals averageBasket(@jakarta.annotation.Nonnull Float averageBasket) {
    
    this.averageBasket = averageBasket;
    return this;
  }

  /**
   * Get averageBasket
   * @return averageBasket
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AVERAGE_BASKET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getAverageBasket() {
    return averageBasket;
  }


  @JsonProperty(JSON_PROPERTY_AVERAGE_BASKET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAverageBasket(@jakarta.annotation.Nonnull Float averageBasket) {
    this.averageBasket = averageBasket;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EcommerceAttributionMetricsGet200ResponseTotals ecommerceAttributionMetricsGet200ResponseTotals = (EcommerceAttributionMetricsGet200ResponseTotals) o;
    return Objects.equals(this.ordersCount, ecommerceAttributionMetricsGet200ResponseTotals.ordersCount) &&
        Objects.equals(this.revenue, ecommerceAttributionMetricsGet200ResponseTotals.revenue) &&
        Objects.equals(this.averageBasket, ecommerceAttributionMetricsGet200ResponseTotals.averageBasket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ordersCount, revenue, averageBasket);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EcommerceAttributionMetricsGet200ResponseTotals {\n");
    sb.append("    ordersCount: ").append(toIndentedString(ordersCount)).append("\n");
    sb.append("    revenue: ").append(toIndentedString(revenue)).append("\n");
    sb.append("    averageBasket: ").append(toIndentedString(averageBasket)).append("\n");
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

    // add `ordersCount` to the URL query string
    if (getOrdersCount() != null) {
      try {
        joiner.add(String.format("%sordersCount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOrdersCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `revenue` to the URL query string
    if (getRevenue() != null) {
      try {
        joiner.add(String.format("%srevenue%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRevenue()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `averageBasket` to the URL query string
    if (getAverageBasket() != null) {
      try {
        joiner.add(String.format("%saverageBasket%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAverageBasket()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

