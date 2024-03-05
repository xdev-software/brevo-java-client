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
 * Details for the Products in an order.
 */
@JsonPropertyOrder({
  OrderProductsInner.JSON_PROPERTY_PRODUCT_ID,
  OrderProductsInner.JSON_PROPERTY_QUANTITY,
  OrderProductsInner.JSON_PROPERTY_VARIANT_ID,
  OrderProductsInner.JSON_PROPERTY_PRICE
})
@JsonTypeName("order_products_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrderProductsInner {
  public static final String JSON_PROPERTY_PRODUCT_ID = "productId";
  private String productId;

  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  private BigDecimal quantity;

  public static final String JSON_PROPERTY_VARIANT_ID = "variantId";
  private String variantId;

  public static final String JSON_PROPERTY_PRICE = "price";
  private BigDecimal price;

  public OrderProductsInner() {
  }

  public OrderProductsInner productId(String productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * ID of the product.
   * @return productId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProductId() {
    return productId;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProductId(String productId) {
    this.productId = productId;
  }


  public OrderProductsInner quantity(BigDecimal quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * How many pieces of the product the visitor has added to the cart.
   * @return quantity
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getQuantity() {
    return quantity;
  }


  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }


  public OrderProductsInner variantId(String variantId) {
    
    this.variantId = variantId;
    return this;
  }

   /**
   * Product ID of the red color shirts.
   * @return variantId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VARIANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVariantId() {
    return variantId;
  }


  @JsonProperty(JSON_PROPERTY_VARIANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVariantId(String variantId) {
    this.variantId = variantId;
  }


  public OrderProductsInner price(BigDecimal price) {
    
    this.price = price;
    return this;
  }

   /**
   * The price of a unit of product
   * @return price
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getPrice() {
    return price;
  }


  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderProductsInner orderProductsInner = (OrderProductsInner) o;
    return Objects.equals(this.productId, orderProductsInner.productId) &&
        Objects.equals(this.quantity, orderProductsInner.quantity) &&
        Objects.equals(this.variantId, orderProductsInner.variantId) &&
        Objects.equals(this.price, orderProductsInner.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, quantity, variantId, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderProductsInner {\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    variantId: ").append(toIndentedString(variantId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

    // add `productId` to the URL query string
    if (getProductId() != null) {
      try {
        joiner.add(String.format("%sproductId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProductId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `quantity` to the URL query string
    if (getQuantity() != null) {
      try {
        joiner.add(String.format("%squantity%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getQuantity()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `variantId` to the URL query string
    if (getVariantId() != null) {
      try {
        joiner.add(String.format("%svariantId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVariantId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `price` to the URL query string
    if (getPrice() != null) {
      try {
        joiner.add(String.format("%sprice%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPrice()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

