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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * GetCouponCollection
 */
@JsonPropertyOrder({
  GetCouponCollection.JSON_PROPERTY_ID,
  GetCouponCollection.JSON_PROPERTY_NAME,
  GetCouponCollection.JSON_PROPERTY_DEFAULT_COUPON,
  GetCouponCollection.JSON_PROPERTY_CREATED_AT,
  GetCouponCollection.JSON_PROPERTY_TOTAL_COUPONS,
  GetCouponCollection.JSON_PROPERTY_REMAINING_COUPONS
})
@JsonTypeName("getCouponCollection")
public class GetCouponCollection {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DEFAULT_COUPON = "defaultCoupon";
  private String defaultCoupon;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_TOTAL_COUPONS = "totalCoupons";
  private Long totalCoupons;

  public static final String JSON_PROPERTY_REMAINING_COUPONS = "remainingCoupons";
  private Long remainingCoupons;

  public GetCouponCollection() {
  }

  public GetCouponCollection id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The id of the collection
   * @return id
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public GetCouponCollection name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the collection
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


  public GetCouponCollection defaultCoupon(String defaultCoupon) {
    
    this.defaultCoupon = defaultCoupon;
    return this;
  }

   /**
   * The default coupon of the collection
   * @return defaultCoupon
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DEFAULT_COUPON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDefaultCoupon() {
    return defaultCoupon;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_COUPON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDefaultCoupon(String defaultCoupon) {
    this.defaultCoupon = defaultCoupon;
  }


  public GetCouponCollection createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Datetime on which the collection was created
   * @return createdAt
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public GetCouponCollection totalCoupons(Long totalCoupons) {
    
    this.totalCoupons = totalCoupons;
    return this;
  }

   /**
   * Total coupons in the collection
   * @return totalCoupons
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTAL_COUPONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getTotalCoupons() {
    return totalCoupons;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_COUPONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalCoupons(Long totalCoupons) {
    this.totalCoupons = totalCoupons;
  }


  public GetCouponCollection remainingCoupons(Long remainingCoupons) {
    
    this.remainingCoupons = remainingCoupons;
    return this;
  }

   /**
   * Not sent coupons in the collection
   * @return remainingCoupons
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REMAINING_COUPONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getRemainingCoupons() {
    return remainingCoupons;
  }


  @JsonProperty(JSON_PROPERTY_REMAINING_COUPONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRemainingCoupons(Long remainingCoupons) {
    this.remainingCoupons = remainingCoupons;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCouponCollection getCouponCollection = (GetCouponCollection) o;
    return Objects.equals(this.id, getCouponCollection.id) &&
        Objects.equals(this.name, getCouponCollection.name) &&
        Objects.equals(this.defaultCoupon, getCouponCollection.defaultCoupon) &&
        Objects.equals(this.createdAt, getCouponCollection.createdAt) &&
        Objects.equals(this.totalCoupons, getCouponCollection.totalCoupons) &&
        Objects.equals(this.remainingCoupons, getCouponCollection.remainingCoupons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, defaultCoupon, createdAt, totalCoupons, remainingCoupons);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCouponCollection {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    defaultCoupon: ").append(toIndentedString(defaultCoupon)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    totalCoupons: ").append(toIndentedString(totalCoupons)).append("\n");
    sb.append("    remainingCoupons: ").append(toIndentedString(remainingCoupons)).append("\n");
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

    // add `defaultCoupon` to the URL query string
    if (getDefaultCoupon() != null) {
      try {
        joiner.add(String.format("%sdefaultCoupon%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDefaultCoupon()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `createdAt` to the URL query string
    if (getCreatedAt() != null) {
      try {
        joiner.add(String.format("%screatedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `totalCoupons` to the URL query string
    if (getTotalCoupons() != null) {
      try {
        joiner.add(String.format("%stotalCoupons%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTotalCoupons()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `remainingCoupons` to the URL query string
    if (getRemainingCoupons() != null) {
      try {
        joiner.add(String.format("%sremainingCoupons%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRemainingCoupons()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

