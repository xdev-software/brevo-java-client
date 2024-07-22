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
 * RemoveContactFromListByAll
 */
@JsonPropertyOrder({
  RemoveContactFromListByAll.JSON_PROPERTY_ALL
})
@JsonTypeName("removeContactFromListByAll")
public class RemoveContactFromListByAll {
  public static final String JSON_PROPERTY_ALL = "all";
  private Boolean all;

  public RemoveContactFromListByAll() {
  }

  public RemoveContactFromListByAll all(Boolean all) {
    
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
    RemoveContactFromListByAll removeContactFromListByAll = (RemoveContactFromListByAll) o;
    return Objects.equals(this.all, removeContactFromListByAll.all);
  }

  @Override
  public int hashCode() {
    return Objects.hash(all);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveContactFromListByAll {\n");
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

