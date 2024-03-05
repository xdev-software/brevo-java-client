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
 * PostSendFailed
 */
@JsonPropertyOrder({
  PostSendFailed.JSON_PROPERTY_CODE,
  PostSendFailed.JSON_PROPERTY_MESSAGE,
  PostSendFailed.JSON_PROPERTY_UNEXISTING_EMAILS,
  PostSendFailed.JSON_PROPERTY_WITHOUT_LIST_EMAILS,
  PostSendFailed.JSON_PROPERTY_BLACK_LISTED_EMAILS
})
@JsonTypeName("postSendFailed")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PostSendFailed {
  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_UNEXISTING_EMAILS = "unexistingEmails";
  private List<String> unexistingEmails;

  public static final String JSON_PROPERTY_WITHOUT_LIST_EMAILS = "withoutListEmails";
  private List<String> withoutListEmails;

  public static final String JSON_PROPERTY_BLACK_LISTED_EMAILS = "blackListedEmails";
  private List<String> blackListedEmails;

  public PostSendFailed() {
  }

  public PostSendFailed code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Response code
   * @return code
  **/
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


  public PostSendFailed message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Response message
   * @return message
  **/
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


  public PostSendFailed unexistingEmails(List<String> unexistingEmails) {
    
    this.unexistingEmails = unexistingEmails;
    return this;
  }

  public PostSendFailed addUnexistingEmailsItem(String unexistingEmailsItem) {
    if (this.unexistingEmails == null) {
      this.unexistingEmails = new ArrayList<>();
    }
    this.unexistingEmails.add(unexistingEmailsItem);
    return this;
  }

   /**
   * Get unexistingEmails
   * @return unexistingEmails
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNEXISTING_EMAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getUnexistingEmails() {
    return unexistingEmails;
  }


  @JsonProperty(JSON_PROPERTY_UNEXISTING_EMAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnexistingEmails(List<String> unexistingEmails) {
    this.unexistingEmails = unexistingEmails;
  }


  public PostSendFailed withoutListEmails(List<String> withoutListEmails) {
    
    this.withoutListEmails = withoutListEmails;
    return this;
  }

  public PostSendFailed addWithoutListEmailsItem(String withoutListEmailsItem) {
    if (this.withoutListEmails == null) {
      this.withoutListEmails = new ArrayList<>();
    }
    this.withoutListEmails.add(withoutListEmailsItem);
    return this;
  }

   /**
   * Get withoutListEmails
   * @return withoutListEmails
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WITHOUT_LIST_EMAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getWithoutListEmails() {
    return withoutListEmails;
  }


  @JsonProperty(JSON_PROPERTY_WITHOUT_LIST_EMAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWithoutListEmails(List<String> withoutListEmails) {
    this.withoutListEmails = withoutListEmails;
  }


  public PostSendFailed blackListedEmails(List<String> blackListedEmails) {
    
    this.blackListedEmails = blackListedEmails;
    return this;
  }

  public PostSendFailed addBlackListedEmailsItem(String blackListedEmailsItem) {
    if (this.blackListedEmails == null) {
      this.blackListedEmails = new ArrayList<>();
    }
    this.blackListedEmails.add(blackListedEmailsItem);
    return this;
  }

   /**
   * Get blackListedEmails
   * @return blackListedEmails
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BLACK_LISTED_EMAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getBlackListedEmails() {
    return blackListedEmails;
  }


  @JsonProperty(JSON_PROPERTY_BLACK_LISTED_EMAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlackListedEmails(List<String> blackListedEmails) {
    this.blackListedEmails = blackListedEmails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostSendFailed postSendFailed = (PostSendFailed) o;
    return Objects.equals(this.code, postSendFailed.code) &&
        Objects.equals(this.message, postSendFailed.message) &&
        Objects.equals(this.unexistingEmails, postSendFailed.unexistingEmails) &&
        Objects.equals(this.withoutListEmails, postSendFailed.withoutListEmails) &&
        Objects.equals(this.blackListedEmails, postSendFailed.blackListedEmails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, unexistingEmails, withoutListEmails, blackListedEmails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostSendFailed {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    unexistingEmails: ").append(toIndentedString(unexistingEmails)).append("\n");
    sb.append("    withoutListEmails: ").append(toIndentedString(withoutListEmails)).append("\n");
    sb.append("    blackListedEmails: ").append(toIndentedString(blackListedEmails)).append("\n");
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

    // add `unexistingEmails` to the URL query string
    if (getUnexistingEmails() != null) {
      for (int i = 0; i < getUnexistingEmails().size(); i++) {
        try {
          joiner.add(String.format("%sunexistingEmails%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getUnexistingEmails().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `withoutListEmails` to the URL query string
    if (getWithoutListEmails() != null) {
      for (int i = 0; i < getWithoutListEmails().size(); i++) {
        try {
          joiner.add(String.format("%swithoutListEmails%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getWithoutListEmails().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `blackListedEmails` to the URL query string
    if (getBlackListedEmails() != null) {
      for (int i = 0; i < getBlackListedEmails().size(); i++) {
        try {
          joiner.add(String.format("%sblackListedEmails%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getBlackListedEmails().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

