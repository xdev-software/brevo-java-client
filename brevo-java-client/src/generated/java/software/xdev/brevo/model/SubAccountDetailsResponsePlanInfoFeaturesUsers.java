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
 * Marketing users to manage the marketing channels
 */
@JsonPropertyOrder({
  SubAccountDetailsResponsePlanInfoFeaturesUsers.JSON_PROPERTY_QUANTITY,
  SubAccountDetailsResponsePlanInfoFeaturesUsers.JSON_PROPERTY_REMAINING
})
@JsonTypeName("subAccountDetailsResponse_planInfo_features_users")
public class SubAccountDetailsResponsePlanInfoFeaturesUsers {
  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  @jakarta.annotation.Nullable
  private Long quantity;

  public static final String JSON_PROPERTY_REMAINING = "remaining";
  @jakarta.annotation.Nullable
  private Long remaining;

  public SubAccountDetailsResponsePlanInfoFeaturesUsers() {
  }

  public SubAccountDetailsResponsePlanInfoFeaturesUsers quantity(@jakarta.annotation.Nullable Long quantity) {
    
    this.quantity = quantity;
    return this;
  }

  /**
   * Quantity of marketing users provided
   * @return quantity
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getQuantity() {
    return quantity;
  }


  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuantity(@jakarta.annotation.Nullable Long quantity) {
    this.quantity = quantity;
  }

  public SubAccountDetailsResponsePlanInfoFeaturesUsers remaining(@jakarta.annotation.Nullable Long remaining) {
    
    this.remaining = remaining;
    return this;
  }

  /**
   * Available marketing users for use
   * @return remaining
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMAINING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getRemaining() {
    return remaining;
  }


  @JsonProperty(JSON_PROPERTY_REMAINING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemaining(@jakarta.annotation.Nullable Long remaining) {
    this.remaining = remaining;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubAccountDetailsResponsePlanInfoFeaturesUsers subAccountDetailsResponsePlanInfoFeaturesUsers = (SubAccountDetailsResponsePlanInfoFeaturesUsers) o;
    return Objects.equals(this.quantity, subAccountDetailsResponsePlanInfoFeaturesUsers.quantity) &&
        Objects.equals(this.remaining, subAccountDetailsResponsePlanInfoFeaturesUsers.remaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, remaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubAccountDetailsResponsePlanInfoFeaturesUsers {\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    remaining: ").append(toIndentedString(remaining)).append("\n");
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

    // add `quantity` to the URL query string
    if (getQuantity() != null) {
      try {
        joiner.add(String.format("%squantity%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getQuantity()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `remaining` to the URL query string
    if (getRemaining() != null) {
      try {
        joiner.add(String.format("%sremaining%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRemaining()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

