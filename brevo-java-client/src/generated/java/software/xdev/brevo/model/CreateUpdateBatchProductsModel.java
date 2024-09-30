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
 * CreateUpdateBatchProductsModel
 */
@JsonPropertyOrder({
  CreateUpdateBatchProductsModel.JSON_PROPERTY_CREATED_COUNT,
  CreateUpdateBatchProductsModel.JSON_PROPERTY_UPDATED_COUNT
})
@JsonTypeName("createUpdateBatchProductsModel")
public class CreateUpdateBatchProductsModel {
  public static final String JSON_PROPERTY_CREATED_COUNT = "createdCount";
  private Long createdCount;

  public static final String JSON_PROPERTY_UPDATED_COUNT = "updatedCount";
  private Long updatedCount;

  public CreateUpdateBatchProductsModel() {
  }

  public CreateUpdateBatchProductsModel createdCount(Long createdCount) {
    
    this.createdCount = createdCount;
    return this;
  }

  /**
   * Number of the new created products
   * @return createdCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreatedCount() {
    return createdCount;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedCount(Long createdCount) {
    this.createdCount = createdCount;
  }

  public CreateUpdateBatchProductsModel updatedCount(Long updatedCount) {
    
    this.updatedCount = updatedCount;
    return this;
  }

  /**
   * Number of the existing products updated
   * @return updatedCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUpdatedCount() {
    return updatedCount;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedCount(Long updatedCount) {
    this.updatedCount = updatedCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUpdateBatchProductsModel createUpdateBatchProductsModel = (CreateUpdateBatchProductsModel) o;
    return Objects.equals(this.createdCount, createUpdateBatchProductsModel.createdCount) &&
        Objects.equals(this.updatedCount, createUpdateBatchProductsModel.updatedCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdCount, updatedCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUpdateBatchProductsModel {\n");
    sb.append("    createdCount: ").append(toIndentedString(createdCount)).append("\n");
    sb.append("    updatedCount: ").append(toIndentedString(updatedCount)).append("\n");
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

    // add `createdCount` to the URL query string
    if (getCreatedCount() != null) {
      try {
        joiner.add(String.format("%screatedCount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `updatedCount` to the URL query string
    if (getUpdatedCount() != null) {
      try {
        joiner.add(String.format("%supdatedCount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUpdatedCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

