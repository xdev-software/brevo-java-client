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
import software.xdev.brevo.model.PostContactInfoContactsFailure;
import software.xdev.brevo.model.PostContactInfoContactsSuccess;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * PostContactInfoContacts
 */
@JsonPropertyOrder({
  PostContactInfoContacts.JSON_PROPERTY_SUCCESS,
  PostContactInfoContacts.JSON_PROPERTY_FAILURE,
  PostContactInfoContacts.JSON_PROPERTY_TOTAL,
  PostContactInfoContacts.JSON_PROPERTY_PROCESS_ID
})
@JsonTypeName("postContactInfo_contacts")
public class PostContactInfoContacts {
  public static final String JSON_PROPERTY_SUCCESS = "success";
  private PostContactInfoContactsSuccess success;

  public static final String JSON_PROPERTY_FAILURE = "failure";
  private PostContactInfoContactsFailure failure;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Long total;

  public static final String JSON_PROPERTY_PROCESS_ID = "processId";
  private Long processId;

  public PostContactInfoContacts() {
  }

  public PostContactInfoContacts success(PostContactInfoContactsSuccess success) {
    
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostContactInfoContactsSuccess getSuccess() {
    return success;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccess(PostContactInfoContactsSuccess success) {
    this.success = success;
  }

  public PostContactInfoContacts failure(PostContactInfoContactsFailure failure) {
    
    this.failure = failure;
    return this;
  }

   /**
   * Get failure
   * @return failure
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostContactInfoContactsFailure getFailure() {
    return failure;
  }


  @JsonProperty(JSON_PROPERTY_FAILURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailure(PostContactInfoContactsFailure failure) {
    this.failure = failure;
  }

  public PostContactInfoContacts total(Long total) {
    
    this.total = total;
    return this;
  }

   /**
   * Displays the count of total number of contacts removed from list when user opts for \&quot;all\&quot; option.
   * @return total
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTotal() {
    return total;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotal(Long total) {
    this.total = total;
  }

  public PostContactInfoContacts processId(Long processId) {
    
    this.processId = processId;
    return this;
  }

   /**
   * Id of the process created to remove contacts from list when user opts for \&quot;all\&quot; option.
   * @return processId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROCESS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getProcessId() {
    return processId;
  }


  @JsonProperty(JSON_PROPERTY_PROCESS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProcessId(Long processId) {
    this.processId = processId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostContactInfoContacts postContactInfoContacts = (PostContactInfoContacts) o;
    return Objects.equals(this.success, postContactInfoContacts.success) &&
        Objects.equals(this.failure, postContactInfoContacts.failure) &&
        Objects.equals(this.total, postContactInfoContacts.total) &&
        Objects.equals(this.processId, postContactInfoContacts.processId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, failure, total, processId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostContactInfoContacts {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    failure: ").append(toIndentedString(failure)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    processId: ").append(toIndentedString(processId)).append("\n");
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

    // add `success` to the URL query string
    if (getSuccess() != null) {
      joiner.add(getSuccess().toUrlQueryString(prefix + "success" + suffix));
    }

    // add `failure` to the URL query string
    if (getFailure() != null) {
      joiner.add(getFailure().toUrlQueryString(prefix + "failure" + suffix));
    }

    // add `total` to the URL query string
    if (getTotal() != null) {
      try {
        joiner.add(String.format("%stotal%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTotal()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `processId` to the URL query string
    if (getProcessId() != null) {
      try {
        joiner.add(String.format("%sprocessId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProcessId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}
