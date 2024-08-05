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
import software.xdev.brevo.model.GetChildInfoAllOfApiKeysV2;
import software.xdev.brevo.model.GetChildInfoAllOfApiKeysV3;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * API Keys associated to child account
 */
@JsonPropertyOrder({
  GetChildInfoAllOfApiKeys.JSON_PROPERTY_V2,
  GetChildInfoAllOfApiKeys.JSON_PROPERTY_V3
})
@JsonTypeName("getChildInfo_allOf_apiKeys")
public class GetChildInfoAllOfApiKeys {
  public static final String JSON_PROPERTY_V2 = "v2";
  private List<GetChildInfoAllOfApiKeysV2> v2 = new ArrayList<>();

  public static final String JSON_PROPERTY_V3 = "v3";
  private List<GetChildInfoAllOfApiKeysV3> v3 = new ArrayList<>();

  public GetChildInfoAllOfApiKeys() {
  }

  public GetChildInfoAllOfApiKeys v2(List<GetChildInfoAllOfApiKeysV2> v2) {
    
    this.v2 = v2;
    return this;
  }

  public GetChildInfoAllOfApiKeys addV2Item(GetChildInfoAllOfApiKeysV2 v2Item) {
    if (this.v2 == null) {
      this.v2 = new ArrayList<>();
    }
    this.v2.add(v2Item);
    return this;
  }

   /**
   * Get v2
   * @return v2
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_V2)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<GetChildInfoAllOfApiKeysV2> getV2() {
    return v2;
  }


  @JsonProperty(JSON_PROPERTY_V2)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setV2(List<GetChildInfoAllOfApiKeysV2> v2) {
    this.v2 = v2;
  }

  public GetChildInfoAllOfApiKeys v3(List<GetChildInfoAllOfApiKeysV3> v3) {
    
    this.v3 = v3;
    return this;
  }

  public GetChildInfoAllOfApiKeys addV3Item(GetChildInfoAllOfApiKeysV3 v3Item) {
    if (this.v3 == null) {
      this.v3 = new ArrayList<>();
    }
    this.v3.add(v3Item);
    return this;
  }

   /**
   * Get v3
   * @return v3
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_V3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetChildInfoAllOfApiKeysV3> getV3() {
    return v3;
  }


  @JsonProperty(JSON_PROPERTY_V3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setV3(List<GetChildInfoAllOfApiKeysV3> v3) {
    this.v3 = v3;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetChildInfoAllOfApiKeys getChildInfoAllOfApiKeys = (GetChildInfoAllOfApiKeys) o;
    return Objects.equals(this.v2, getChildInfoAllOfApiKeys.v2) &&
        Objects.equals(this.v3, getChildInfoAllOfApiKeys.v3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(v2, v3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetChildInfoAllOfApiKeys {\n");
    sb.append("    v2: ").append(toIndentedString(v2)).append("\n");
    sb.append("    v3: ").append(toIndentedString(v3)).append("\n");
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

    // add `v2` to the URL query string
    if (getV2() != null) {
      for (int i = 0; i < getV2().size(); i++) {
        if (getV2().get(i) != null) {
          joiner.add(getV2().get(i).toUrlQueryString(String.format("%sv2%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `v3` to the URL query string
    if (getV3() != null) {
      for (int i = 0; i < getV3().size(); i++) {
        if (getV3().get(i) != null) {
          joiner.add(getV3().get(i).toUrlQueryString(String.format("%sv3%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

