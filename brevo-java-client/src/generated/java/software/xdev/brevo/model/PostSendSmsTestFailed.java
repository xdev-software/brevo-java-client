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
 * PostSendSmsTestFailed
 */
@JsonPropertyOrder({
  PostSendSmsTestFailed.JSON_PROPERTY_CODE,
  PostSendSmsTestFailed.JSON_PROPERTY_MESSAGE,
  PostSendSmsTestFailed.JSON_PROPERTY_UNEXISTING_SMS,
  PostSendSmsTestFailed.JSON_PROPERTY_WITHOUT_LIST_SMS
})
@JsonTypeName("postSendSmsTestFailed")
public class PostSendSmsTestFailed {
  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_UNEXISTING_SMS = "unexistingSms";
  private List<String> unexistingSms = new ArrayList<>();

  public static final String JSON_PROPERTY_WITHOUT_LIST_SMS = "withoutListSms";
  private List<String> withoutListSms = new ArrayList<>();

  public PostSendSmsTestFailed() {
  }

  public PostSendSmsTestFailed code(String code) {
    
    this.code = code;
    return this;
  }

  /**
   * Response code
   * @return code
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCode(String code) {
    this.code = code;
  }

  public PostSendSmsTestFailed message(String message) {
    
    this.message = message;
    return this;
  }

  /**
   * Response message
   * @return message
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessage(String message) {
    this.message = message;
  }

  public PostSendSmsTestFailed unexistingSms(List<String> unexistingSms) {
    
    this.unexistingSms = unexistingSms;
    return this;
  }

  public PostSendSmsTestFailed addUnexistingSmsItem(String unexistingSmsItem) {
    if (this.unexistingSms == null) {
      this.unexistingSms = new ArrayList<>();
    }
    this.unexistingSms.add(unexistingSmsItem);
    return this;
  }

  /**
   * Get unexistingSms
   * @return unexistingSms
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNEXISTING_SMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getUnexistingSms() {
    return unexistingSms;
  }


  @JsonProperty(JSON_PROPERTY_UNEXISTING_SMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnexistingSms(List<String> unexistingSms) {
    this.unexistingSms = unexistingSms;
  }

  public PostSendSmsTestFailed withoutListSms(List<String> withoutListSms) {
    
    this.withoutListSms = withoutListSms;
    return this;
  }

  public PostSendSmsTestFailed addWithoutListSmsItem(String withoutListSmsItem) {
    if (this.withoutListSms == null) {
      this.withoutListSms = new ArrayList<>();
    }
    this.withoutListSms.add(withoutListSmsItem);
    return this;
  }

  /**
   * Get withoutListSms
   * @return withoutListSms
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WITHOUT_LIST_SMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getWithoutListSms() {
    return withoutListSms;
  }


  @JsonProperty(JSON_PROPERTY_WITHOUT_LIST_SMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWithoutListSms(List<String> withoutListSms) {
    this.withoutListSms = withoutListSms;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostSendSmsTestFailed postSendSmsTestFailed = (PostSendSmsTestFailed) o;
    return Objects.equals(this.code, postSendSmsTestFailed.code) &&
        Objects.equals(this.message, postSendSmsTestFailed.message) &&
        Objects.equals(this.unexistingSms, postSendSmsTestFailed.unexistingSms) &&
        Objects.equals(this.withoutListSms, postSendSmsTestFailed.withoutListSms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, unexistingSms, withoutListSms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostSendSmsTestFailed {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    unexistingSms: ").append(toIndentedString(unexistingSms)).append("\n");
    sb.append("    withoutListSms: ").append(toIndentedString(withoutListSms)).append("\n");
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

    // add `code` to the URL query string
    if (getCode() != null) {
      try {
        joiner.add(String.format("%scode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `message` to the URL query string
    if (getMessage() != null) {
      try {
        joiner.add(String.format("%smessage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMessage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `unexistingSms` to the URL query string
    if (getUnexistingSms() != null) {
      for (int i = 0; i < getUnexistingSms().size(); i++) {
        try {
          joiner.add(String.format("%sunexistingSms%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getUnexistingSms().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `withoutListSms` to the URL query string
    if (getWithoutListSms() != null) {
      for (int i = 0; i < getWithoutListSms().size(); i++) {
        try {
          joiner.add(String.format("%swithoutListSms%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getWithoutListSms().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

