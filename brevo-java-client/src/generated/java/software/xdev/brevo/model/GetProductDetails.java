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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * GetProductDetails
 */
@JsonPropertyOrder({
  GetProductDetails.JSON_PROPERTY_ID,
  GetProductDetails.JSON_PROPERTY_NAME,
  GetProductDetails.JSON_PROPERTY_CREATED_AT,
  GetProductDetails.JSON_PROPERTY_MODIFIED_AT,
  GetProductDetails.JSON_PROPERTY_URL,
  GetProductDetails.JSON_PROPERTY_IMAGE_URL,
  GetProductDetails.JSON_PROPERTY_SKU,
  GetProductDetails.JSON_PROPERTY_PRICE,
  GetProductDetails.JSON_PROPERTY_CATEGORIES,
  GetProductDetails.JSON_PROPERTY_PARENT_ID,
  GetProductDetails.JSON_PROPERTY_S3_ORIGINAL,
  GetProductDetails.JSON_PROPERTY_S3_THUMB_ANALYTICS,
  GetProductDetails.JSON_PROPERTY_S3_THUMB_EDITOR,
  GetProductDetails.JSON_PROPERTY_META_INFO,
  GetProductDetails.JSON_PROPERTY_IS_DELETED
})
@JsonTypeName("getProductDetails")
public class GetProductDetails {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private String createdAt;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modifiedAt";
  private String modifiedAt;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_IMAGE_URL = "imageUrl";
  private String imageUrl;

  public static final String JSON_PROPERTY_SKU = "sku";
  private String sku;

  public static final String JSON_PROPERTY_PRICE = "price";
  private Float price;

  public static final String JSON_PROPERTY_CATEGORIES = "categories";
  private List<String> categories;

  public static final String JSON_PROPERTY_PARENT_ID = "parentId";
  private String parentId;

  public static final String JSON_PROPERTY_S3_ORIGINAL = "s3Original";
  private String s3Original;

  public static final String JSON_PROPERTY_S3_THUMB_ANALYTICS = "s3ThumbAnalytics";
  private String s3ThumbAnalytics;

  public static final String JSON_PROPERTY_S3_THUMB_EDITOR = "s3ThumbEditor";
  private String s3ThumbEditor;

  public static final String JSON_PROPERTY_META_INFO = "metaInfo";
  private Object metaInfo;

  public static final String JSON_PROPERTY_IS_DELETED = "isDeleted";
  private Boolean isDeleted;

  public GetProductDetails() {
  }

  public GetProductDetails id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Product ID for which you requested the details
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


  public GetProductDetails name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the product for which you requested the details
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


  public GetProductDetails createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation UTC date-time of the product (YYYY-MM-DDTHH:mm:ss.SSSZ)
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


  public GetProductDetails modifiedAt(String modifiedAt) {
    
    this.modifiedAt = modifiedAt;
    return this;
  }

   /**
   * Last modification UTC date-time of the product (YYYY-MM-DDTHH:mm:ss.SSSZ)
   * @return modifiedAt
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getModifiedAt() {
    return modifiedAt;
  }


  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setModifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
  }


  public GetProductDetails url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * URL to the product
   * @return url
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public GetProductDetails imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Absolute URL to the cover image of the product
   * @return imageUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImageUrl() {
    return imageUrl;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public GetProductDetails sku(String sku) {
    
    this.sku = sku;
    return this;
  }

   /**
   * Product identifier from the shop
   * @return sku
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSku() {
    return sku;
  }


  @JsonProperty(JSON_PROPERTY_SKU)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSku(String sku) {
    this.sku = sku;
  }


  public GetProductDetails price(Float price) {
    
    this.price = price;
    return this;
  }

   /**
   * Price of the product
   * @return price
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getPrice() {
    return price;
  }


  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrice(Float price) {
    this.price = price;
  }


  public GetProductDetails categories(List<String> categories) {
    
    this.categories = categories;
    return this;
  }

  public GetProductDetails addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Category ID-s of the product
   * @return categories
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCategories() {
    return categories;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategories(List<String> categories) {
    this.categories = categories;
  }


  public GetProductDetails parentId(String parentId) {
    
    this.parentId = parentId;
    return this;
  }

   /**
   * Parent product id of the product
   * @return parentId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParentId() {
    return parentId;
  }


  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  public GetProductDetails s3Original(String s3Original) {
    
    this.s3Original = s3Original;
    return this;
  }

   /**
   * S3 url of original image
   * @return s3Original
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_S3_ORIGINAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getS3Original() {
    return s3Original;
  }


  @JsonProperty(JSON_PROPERTY_S3_ORIGINAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setS3Original(String s3Original) {
    this.s3Original = s3Original;
  }


  public GetProductDetails s3ThumbAnalytics(String s3ThumbAnalytics) {
    
    this.s3ThumbAnalytics = s3ThumbAnalytics;
    return this;
  }

   /**
   * S3 thumbnail url of original image in 120x120 dimension for analytics section
   * @return s3ThumbAnalytics
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_S3_THUMB_ANALYTICS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getS3ThumbAnalytics() {
    return s3ThumbAnalytics;
  }


  @JsonProperty(JSON_PROPERTY_S3_THUMB_ANALYTICS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setS3ThumbAnalytics(String s3ThumbAnalytics) {
    this.s3ThumbAnalytics = s3ThumbAnalytics;
  }


  public GetProductDetails s3ThumbEditor(String s3ThumbEditor) {
    
    this.s3ThumbEditor = s3ThumbEditor;
    return this;
  }

   /**
   * S3 thumbnail url of original image in 600x400 dimension for editor section
   * @return s3ThumbEditor
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_S3_THUMB_EDITOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getS3ThumbEditor() {
    return s3ThumbEditor;
  }


  @JsonProperty(JSON_PROPERTY_S3_THUMB_EDITOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setS3ThumbEditor(String s3ThumbEditor) {
    this.s3ThumbEditor = s3ThumbEditor;
  }


  public GetProductDetails metaInfo(Object metaInfo) {
    
    this.metaInfo = metaInfo;
    return this;
  }

   /**
   * Meta data of product such as description, vendor, producer, stock level, etc.
   * @return metaInfo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getMetaInfo() {
    return metaInfo;
  }


  @JsonProperty(JSON_PROPERTY_META_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetaInfo(Object metaInfo) {
    this.metaInfo = metaInfo;
  }


  public GetProductDetails isDeleted(Boolean isDeleted) {
    
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * product deleted from the shop&#39;s database
   * @return isDeleted
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDeleted() {
    return isDeleted;
  }


  @JsonProperty(JSON_PROPERTY_IS_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetProductDetails getProductDetails = (GetProductDetails) o;
    return Objects.equals(this.id, getProductDetails.id) &&
        Objects.equals(this.name, getProductDetails.name) &&
        Objects.equals(this.createdAt, getProductDetails.createdAt) &&
        Objects.equals(this.modifiedAt, getProductDetails.modifiedAt) &&
        Objects.equals(this.url, getProductDetails.url) &&
        Objects.equals(this.imageUrl, getProductDetails.imageUrl) &&
        Objects.equals(this.sku, getProductDetails.sku) &&
        Objects.equals(this.price, getProductDetails.price) &&
        Objects.equals(this.categories, getProductDetails.categories) &&
        Objects.equals(this.parentId, getProductDetails.parentId) &&
        Objects.equals(this.s3Original, getProductDetails.s3Original) &&
        Objects.equals(this.s3ThumbAnalytics, getProductDetails.s3ThumbAnalytics) &&
        Objects.equals(this.s3ThumbEditor, getProductDetails.s3ThumbEditor) &&
        Objects.equals(this.metaInfo, getProductDetails.metaInfo) &&
        Objects.equals(this.isDeleted, getProductDetails.isDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, createdAt, modifiedAt, url, imageUrl, sku, price, categories, parentId, s3Original, s3ThumbAnalytics, s3ThumbEditor, metaInfo, isDeleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetProductDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    s3Original: ").append(toIndentedString(s3Original)).append("\n");
    sb.append("    s3ThumbAnalytics: ").append(toIndentedString(s3ThumbAnalytics)).append("\n");
    sb.append("    s3ThumbEditor: ").append(toIndentedString(s3ThumbEditor)).append("\n");
    sb.append("    metaInfo: ").append(toIndentedString(metaInfo)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
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

    // add `createdAt` to the URL query string
    if (getCreatedAt() != null) {
      try {
        joiner.add(String.format("%screatedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `modifiedAt` to the URL query string
    if (getModifiedAt() != null) {
      try {
        joiner.add(String.format("%smodifiedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getModifiedAt()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `imageUrl` to the URL query string
    if (getImageUrl() != null) {
      try {
        joiner.add(String.format("%simageUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getImageUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sku` to the URL query string
    if (getSku() != null) {
      try {
        joiner.add(String.format("%ssku%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSku()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `categories` to the URL query string
    if (getCategories() != null) {
      for (int i = 0; i < getCategories().size(); i++) {
        try {
          joiner.add(String.format("%scategories%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getCategories().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `parentId` to the URL query string
    if (getParentId() != null) {
      try {
        joiner.add(String.format("%sparentId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getParentId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `s3Original` to the URL query string
    if (getS3Original() != null) {
      try {
        joiner.add(String.format("%ss3Original%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getS3Original()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `s3ThumbAnalytics` to the URL query string
    if (getS3ThumbAnalytics() != null) {
      try {
        joiner.add(String.format("%ss3ThumbAnalytics%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getS3ThumbAnalytics()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `s3ThumbEditor` to the URL query string
    if (getS3ThumbEditor() != null) {
      try {
        joiner.add(String.format("%ss3ThumbEditor%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getS3ThumbEditor()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `metaInfo` to the URL query string
    if (getMetaInfo() != null) {
      try {
        joiner.add(String.format("%smetaInfo%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMetaInfo()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `isDeleted` to the URL query string
    if (getIsDeleted() != null) {
      try {
        joiner.add(String.format("%sisDeleted%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsDeleted()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

