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
import software.xdev.brevo.model.GetScheduledEmailByBatchIdBatchesInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * GetScheduledEmailByBatchId
 */
@JsonPropertyOrder({
  GetScheduledEmailByBatchId.JSON_PROPERTY_COUNT,
  GetScheduledEmailByBatchId.JSON_PROPERTY_BATCHES
})
@JsonTypeName("getScheduledEmailByBatchId")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetScheduledEmailByBatchId {
  public static final String JSON_PROPERTY_COUNT = "count";
  private Integer count;

  public static final String JSON_PROPERTY_BATCHES = "batches";
  private List<GetScheduledEmailByBatchIdBatchesInner> batches;

  public GetScheduledEmailByBatchId() {
  }

  public GetScheduledEmailByBatchId count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * Total number of batches
   * @return count
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCount() {
    return count;
  }


  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCount(Integer count) {
    this.count = count;
  }


  public GetScheduledEmailByBatchId batches(List<GetScheduledEmailByBatchIdBatchesInner> batches) {
    
    this.batches = batches;
    return this;
  }

  public GetScheduledEmailByBatchId addBatchesItem(GetScheduledEmailByBatchIdBatchesInner batchesItem) {
    if (this.batches == null) {
      this.batches = new ArrayList<>();
    }
    this.batches.add(batchesItem);
    return this;
  }

   /**
   * Get batches
   * @return batches
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BATCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetScheduledEmailByBatchIdBatchesInner> getBatches() {
    return batches;
  }


  @JsonProperty(JSON_PROPERTY_BATCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBatches(List<GetScheduledEmailByBatchIdBatchesInner> batches) {
    this.batches = batches;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetScheduledEmailByBatchId getScheduledEmailByBatchId = (GetScheduledEmailByBatchId) o;
    return Objects.equals(this.count, getScheduledEmailByBatchId.count) &&
        Objects.equals(this.batches, getScheduledEmailByBatchId.batches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, batches);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetScheduledEmailByBatchId {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    batches: ").append(toIndentedString(batches)).append("\n");
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

    // add `count` to the URL query string
    if (getCount() != null) {
      try {
        joiner.add(String.format("%scount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `batches` to the URL query string
    if (getBatches() != null) {
      for (int i = 0; i < getBatches().size(); i++) {
        if (getBatches().get(i) != null) {
          joiner.add(getBatches().get(i).toUrlQueryString(String.format("%sbatches%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}
