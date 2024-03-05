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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import software.xdev.brevo.model.GetScheduledEmailByBatchId;
import software.xdev.brevo.model.GetScheduledEmailByBatchIdBatchesInner;
import software.xdev.brevo.model.GetScheduledEmailByMessageId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * GetScheduledEmailById200Response
 */
@JsonPropertyOrder({
  GetScheduledEmailById200Response.JSON_PROPERTY_COUNT,
  GetScheduledEmailById200Response.JSON_PROPERTY_BATCHES,
  GetScheduledEmailById200Response.JSON_PROPERTY_SCHEDULED_AT,
  GetScheduledEmailById200Response.JSON_PROPERTY_CREATED_AT,
  GetScheduledEmailById200Response.JSON_PROPERTY_STATUS
})
@JsonTypeName("getScheduledEmailById_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetScheduledEmailById200Response {
  public static final String JSON_PROPERTY_COUNT = "count";
  private Integer count;

  public static final String JSON_PROPERTY_BATCHES = "batches";
  private List<GetScheduledEmailByBatchIdBatchesInner> batches;

  public static final String JSON_PROPERTY_SCHEDULED_AT = "scheduledAt";
  private OffsetDateTime scheduledAt;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  /**
   * Current status of the scheduled email
   */
  public enum StatusEnum {
    INPROGRESS("inProgress"),
    
    QUEUED("queued"),
    
    PROCESSED("processed"),
    
    ERROR("error");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public GetScheduledEmailById200Response() {
  }

  public GetScheduledEmailById200Response count(Integer count) {
    
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


  public GetScheduledEmailById200Response batches(List<GetScheduledEmailByBatchIdBatchesInner> batches) {
    
    this.batches = batches;
    return this;
  }

  public GetScheduledEmailById200Response addBatchesItem(GetScheduledEmailByBatchIdBatchesInner batchesItem) {
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


  public GetScheduledEmailById200Response scheduledAt(OffsetDateTime scheduledAt) {
    
    this.scheduledAt = scheduledAt;
    return this;
  }

   /**
   * Datetime for which the email was scheduled
   * @return scheduledAt
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SCHEDULED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getScheduledAt() {
    return scheduledAt;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScheduledAt(OffsetDateTime scheduledAt) {
    this.scheduledAt = scheduledAt;
  }


  public GetScheduledEmailById200Response createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Datetime on which the email was scheduled
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


  public GetScheduledEmailById200Response status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Current status of the scheduled email
   * @return status
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetScheduledEmailById200Response getScheduledEmailById200Response = (GetScheduledEmailById200Response) o;
    return Objects.equals(this.count, getScheduledEmailById200Response.count) &&
        Objects.equals(this.batches, getScheduledEmailById200Response.batches) &&
        Objects.equals(this.scheduledAt, getScheduledEmailById200Response.scheduledAt) &&
        Objects.equals(this.createdAt, getScheduledEmailById200Response.createdAt) &&
        Objects.equals(this.status, getScheduledEmailById200Response.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, batches, scheduledAt, createdAt, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetScheduledEmailById200Response {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    batches: ").append(toIndentedString(batches)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

    // add `scheduledAt` to the URL query string
    if (getScheduledAt() != null) {
      try {
        joiner.add(String.format("%sscheduledAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getScheduledAt()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `status` to the URL query string
    if (getStatus() != null) {
      try {
        joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

