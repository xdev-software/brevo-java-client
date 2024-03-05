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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * CreateCouponsRequest
 */
@JsonPropertyOrder({
  CreateCouponsRequest.JSON_PROPERTY_COLLECTION_ID,
  CreateCouponsRequest.JSON_PROPERTY_COUPONS
})
@JsonTypeName("createCoupons_request")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateCouponsRequest {
  public static final String JSON_PROPERTY_COLLECTION_ID = "collectionId";
  private String collectionId;

  public static final String JSON_PROPERTY_COUPONS = "coupons";
  private Set<String> coupons = new LinkedHashSet<>();

  public CreateCouponsRequest() {
  }

  public CreateCouponsRequest collectionId(String collectionId) {
    
    this.collectionId = collectionId;
    return this;
  }

   /**
   * The id of the coupon collection for which the coupons will be created
   * @return collectionId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COLLECTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCollectionId() {
    return collectionId;
  }


  @JsonProperty(JSON_PROPERTY_COLLECTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCollectionId(String collectionId) {
    this.collectionId = collectionId;
  }


  public CreateCouponsRequest coupons(Set<String> coupons) {
    
    this.coupons = coupons;
    return this;
  }

  public CreateCouponsRequest addCouponsItem(String couponsItem) {
    if (this.coupons == null) {
      this.coupons = new LinkedHashSet<>();
    }
    this.coupons.add(couponsItem);
    return this;
  }

   /**
   * Get coupons
   * @return coupons
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COUPONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Set<String> getCoupons() {
    return coupons;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_COUPONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCoupons(Set<String> coupons) {
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
    CreateCouponsRequest createCouponsRequest = (CreateCouponsRequest) o;
    return Objects.equals(this.collectionId, createCouponsRequest.collectionId) &&
        Objects.equals(this.coupons, createCouponsRequest.coupons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectionId, coupons);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCouponsRequest {\n");
    sb.append("    collectionId: ").append(toIndentedString(collectionId)).append("\n");
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

    // add `collectionId` to the URL query string
    if (getCollectionId() != null) {
      try {
        joiner.add(String.format("%scollectionId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCollectionId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `coupons` to the URL query string
    if (getCoupons() != null) {
      int i = 0;
      for (String _item : getCoupons()) {
        try {
          joiner.add(String.format("%scoupons%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(_item), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
      i++;
    }

    return joiner.toString();
  }

}

