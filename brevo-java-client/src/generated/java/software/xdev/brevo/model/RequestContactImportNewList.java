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
 * To create a new list and import the contacts into it, pass the listName and an optional folderId.
 */
@JsonPropertyOrder({
  RequestContactImportNewList.JSON_PROPERTY_LIST_NAME,
  RequestContactImportNewList.JSON_PROPERTY_FOLDER_ID
})
@JsonTypeName("requestContactImport_newList")
public class RequestContactImportNewList {
  public static final String JSON_PROPERTY_LIST_NAME = "listName";
  private String listName;

  public static final String JSON_PROPERTY_FOLDER_ID = "folderId";
  private Long folderId;

  public RequestContactImportNewList() {
  }

  public RequestContactImportNewList listName(String listName) {
    
    this.listName = listName;
    return this;
  }

   /**
   * List with listName will be created first and users will be imported in it. **Mandatory if listIds is empty**. 
   * @return listName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getListName() {
    return listName;
  }


  @JsonProperty(JSON_PROPERTY_LIST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setListName(String listName) {
    this.listName = listName;
  }

  public RequestContactImportNewList folderId(Long folderId) {
    
    this.folderId = folderId;
    return this;
  }

   /**
   * Id of the folder where this new list shall be created. **Mandatory if listName is not empty** 
   * @return folderId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FOLDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFolderId() {
    return folderId;
  }


  @JsonProperty(JSON_PROPERTY_FOLDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFolderId(Long folderId) {
    this.folderId = folderId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestContactImportNewList requestContactImportNewList = (RequestContactImportNewList) o;
    return Objects.equals(this.listName, requestContactImportNewList.listName) &&
        Objects.equals(this.folderId, requestContactImportNewList.folderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listName, folderId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestContactImportNewList {\n");
    sb.append("    listName: ").append(toIndentedString(listName)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
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

    // add `listName` to the URL query string
    if (getListName() != null) {
      try {
        joiner.add(String.format("%slistName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getListName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `folderId` to the URL query string
    if (getFolderId() != null) {
      try {
        joiner.add(String.format("%sfolderId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFolderId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

