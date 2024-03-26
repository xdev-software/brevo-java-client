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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import software.xdev.brevo.model.OrderBilling;
import software.xdev.brevo.model.OrderProductsInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Order
 */
@JsonPropertyOrder({
  Order.JSON_PROPERTY_ID,
  Order.JSON_PROPERTY_CREATED_AT,
  Order.JSON_PROPERTY_UPDATED_AT,
  Order.JSON_PROPERTY_STATUS,
  Order.JSON_PROPERTY_AMOUNT,
  Order.JSON_PROPERTY_PRODUCTS,
  Order.JSON_PROPERTY_EMAIL,
  Order.JSON_PROPERTY_BILLING,
  Order.JSON_PROPERTY_COUPONS
})
@JsonTypeName("order")
public class Order {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
  private String updatedAt;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private BigDecimal amount;

  public static final String JSON_PROPERTY_PRODUCTS = "products";
  private List<OrderProductsInner> products = new ArrayList<>();

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_BILLING = "billing";
  private OrderBilling billing;

  public static final String JSON_PROPERTY_COUPONS = "coupons";
  private List<String> coupons;

  public Order() {
  }

  public Order id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique ID of the order.
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


  public Order createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Event occurrence UTC date-time (YYYY-MM-DDTHH:mm:ssZ), when order is actually created.
   * @return createdAt
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public Order updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Event updated UTC date-time (YYYY-MM-DDTHH:mm:ssZ), when the status of the order is actually changed/updated.
   * @return updatedAt
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public Order status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * State of the order.
   * @return status
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(String status) {
    this.status = status;
  }


  public Order amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Total amount of the order, including all shipping expenses, tax and the price of items.
   * @return amount
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public Order products(List<OrderProductsInner> products) {
    
    this.products = products;
    return this;
  }

  public Order addProductsItem(OrderProductsInner productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * Get products
   * @return products
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PRODUCTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<OrderProductsInner> getProducts() {
    return products;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProducts(List<OrderProductsInner> products) {
    this.products = products;
  }


  public Order email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Email of the contact, Mandatory if \&quot;phone\&quot; field is not passed in \&quot;billing\&quot; parameter.
   * @return email
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }


  public Order billing(OrderBilling billing) {
    
    this.billing = billing;
    return this;
  }

   /**
   * Get billing
   * @return billing
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BILLING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OrderBilling getBilling() {
    return billing;
  }


  @JsonProperty(JSON_PROPERTY_BILLING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBilling(OrderBilling billing) {
    this.billing = billing;
  }


  public Order coupons(List<String> coupons) {
    
    this.coupons = coupons;
    return this;
  }

  public Order addCouponsItem(String couponsItem) {
    if (this.coupons == null) {
      this.coupons = new ArrayList<>();
    }
    this.coupons.add(couponsItem);
    return this;
  }

   /**
   * Coupons applied to the order. Stored case insensitive.
   * @return coupons
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUPONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCoupons() {
    return coupons;
  }


  @JsonProperty(JSON_PROPERTY_COUPONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCoupons(List<String> coupons) {
    this.coupons = coupons;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.id, order.id) &&
        Objects.equals(this.createdAt, order.createdAt) &&
        Objects.equals(this.updatedAt, order.updatedAt) &&
        Objects.equals(this.status, order.status) &&
        Objects.equals(this.amount, order.amount) &&
        Objects.equals(this.products, order.products) &&
        Objects.equals(this.email, order.email) &&
        Objects.equals(this.billing, order.billing) &&
        Objects.equals(this.coupons, order.coupons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, updatedAt, status, amount, products, email, billing, coupons);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
    sb.append("    coupons: ").append(toIndentedString(coupons)).append("\n");
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

    // add `createdAt` to the URL query string
    if (getCreatedAt() != null) {
      try {
        joiner.add(String.format("%screatedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `updatedAt` to the URL query string
    if (getUpdatedAt() != null) {
      try {
        joiner.add(String.format("%supdatedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUpdatedAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `status` to the URL query string
    if (getStatus() != null) {
      try {
        joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `amount` to the URL query string
    if (getAmount() != null) {
      try {
        joiner.add(String.format("%samount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAmount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `products` to the URL query string
    if (getProducts() != null) {
      for (int i = 0; i < getProducts().size(); i++) {
        if (getProducts().get(i) != null) {
          joiner.add(getProducts().get(i).toUrlQueryString(String.format("%sproducts%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `email` to the URL query string
    if (getEmail() != null) {
      try {
        joiner.add(String.format("%semail%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmail()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `billing` to the URL query string
    if (getBilling() != null) {
      joiner.add(getBilling().toUrlQueryString(prefix + "billing" + suffix));
    }

    // add `coupons` to the URL query string
    if (getCoupons() != null) {
      for (int i = 0; i < getCoupons().size(); i++) {
        try {
          joiner.add(String.format("%scoupons%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getCoupons().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

