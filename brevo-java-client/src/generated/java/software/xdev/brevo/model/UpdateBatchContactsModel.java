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
 * UpdateBatchContactsModel
 */
@JsonPropertyOrder({
  UpdateBatchContactsModel.JSON_PROPERTY_SUCCESS_IDS,
  UpdateBatchContactsModel.JSON_PROPERTY_FAILURE_IDS
})
@JsonTypeName("updateBatchContactsModel")
public class UpdateBatchContactsModel {
  public static final String JSON_PROPERTY_SUCCESS_IDS = "successIds";
  private List<Long> successIds = new ArrayList<>();

  public static final String JSON_PROPERTY_FAILURE_IDS = "failureIds";
  private List<Long> failureIds = new ArrayList<>();

  public UpdateBatchContactsModel() {
  }

  public UpdateBatchContactsModel successIds(List<Long> successIds) {
    
    this.successIds = successIds;
    return this;
  }

  public UpdateBatchContactsModel addSuccessIdsItem(Long successIdsItem) {
    if (this.successIds == null) {
      this.successIds = new ArrayList<>();
    }
    this.successIds.add(successIdsItem);
    return this;
  }

   /**
   * Get successIds
   * @return successIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUCCESS_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getSuccessIds() {
    return successIds;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESS_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccessIds(List<Long> successIds) {
    this.successIds = successIds;
  }

  public UpdateBatchContactsModel failureIds(List<Long> failureIds) {
    
    this.failureIds = failureIds;
    return this;
  }

  public UpdateBatchContactsModel addFailureIdsItem(Long failureIdsItem) {
    if (this.failureIds == null) {
      this.failureIds = new ArrayList<>();
    }
    this.failureIds.add(failureIdsItem);
    return this;
  }

   /**
   * Get failureIds
   * @return failureIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILURE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getFailureIds() {
    return failureIds;
  }


  @JsonProperty(JSON_PROPERTY_FAILURE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailureIds(List<Long> failureIds) {
    this.failureIds = failureIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateBatchContactsModel updateBatchContactsModel = (UpdateBatchContactsModel) o;
    return Objects.equals(this.successIds, updateBatchContactsModel.successIds) &&
        Objects.equals(this.failureIds, updateBatchContactsModel.failureIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successIds, failureIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateBatchContactsModel {\n");
    sb.append("    successIds: ").append(toIndentedString(successIds)).append("\n");
    sb.append("    failureIds: ").append(toIndentedString(failureIds)).append("\n");
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

    // add `successIds` to the URL query string
    if (getSuccessIds() != null) {
      for (int i = 0; i < getSuccessIds().size(); i++) {
        try {
          joiner.add(String.format("%ssuccessIds%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getSuccessIds().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `failureIds` to the URL query string
    if (getFailureIds() != null) {
      for (int i = 0; i < getFailureIds().size(); i++) {
        try {
          joiner.add(String.format("%sfailureIds%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getFailureIds().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

