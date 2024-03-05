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
import software.xdev.brevo.model.RemoveContactFromListByAll;
import software.xdev.brevo.model.RemoveContactFromListByEmails;
import software.xdev.brevo.model.RemoveContactFromListByIDs;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * RemoveContactFromListRequest
 */
@JsonPropertyOrder({
  RemoveContactFromListRequest.JSON_PROPERTY_EMAILS,
  RemoveContactFromListRequest.JSON_PROPERTY_IDS,
  RemoveContactFromListRequest.JSON_PROPERTY_ALL
})
@JsonTypeName("removeContactFromList_request")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RemoveContactFromListRequest {
  public static final String JSON_PROPERTY_EMAILS = "emails";
  private List<String> emails;

  public static final String JSON_PROPERTY_IDS = "ids";
  private List<Long> ids;

  public static final String JSON_PROPERTY_ALL = "all";
  private Boolean all;

  public RemoveContactFromListRequest() {
  }

  public RemoveContactFromListRequest emails(List<String> emails) {
    
    this.emails = emails;
    return this;
  }

  public RemoveContactFromListRequest addEmailsItem(String emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<>();
    }
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * **Required if &#39;all&#39; is false and &#39;ids&#39; is empty.** Emails to remove from a list. You can pass a **maximum of 150 emails** for removal in one request. 
   * @return emails
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getEmails() {
    return emails;
  }


  @JsonProperty(JSON_PROPERTY_EMAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmails(List<String> emails) {
    this.emails = emails;
  }


  public RemoveContactFromListRequest ids(List<Long> ids) {
    
    this.ids = ids;
    return this;
  }

  public RemoveContactFromListRequest addIdsItem(Long idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * **Required if &#39;all&#39; is false and &#39;emails&#39; is empty.** IDs to remove from a list. You can pass a **maximum of 150 IDs** for removal in one request. 
   * @return ids
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getIds() {
    return ids;
  }


  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIds(List<Long> ids) {
    this.ids = ids;
  }


  public RemoveContactFromListRequest all(Boolean all) {
    
    this.all = all;
    return this;
  }

   /**
   * **Required if &#39;emails&#39; and &#39;ids&#39; are empty.** Remove all existing contacts from a list. A process will be created in this scenario. You can fetch the process details to know about the progress 
   * @return all
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAll() {
    return all;
  }


  @JsonProperty(JSON_PROPERTY_ALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAll(Boolean all) {
    this.all = all;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveContactFromListRequest removeContactFromListRequest = (RemoveContactFromListRequest) o;
    return Objects.equals(this.emails, removeContactFromListRequest.emails) &&
        Objects.equals(this.ids, removeContactFromListRequest.ids) &&
        Objects.equals(this.all, removeContactFromListRequest.all);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emails, ids, all);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveContactFromListRequest {\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    all: ").append(toIndentedString(all)).append("\n");
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

    // add `emails` to the URL query string
    if (getEmails() != null) {
      for (int i = 0; i < getEmails().size(); i++) {
        try {
          joiner.add(String.format("%semails%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getEmails().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `ids` to the URL query string
    if (getIds() != null) {
      for (int i = 0; i < getIds().size(); i++) {
        try {
          joiner.add(String.format("%sids%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getIds().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `all` to the URL query string
    if (getAll() != null) {
      try {
        joiner.add(String.format("%sall%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAll()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

