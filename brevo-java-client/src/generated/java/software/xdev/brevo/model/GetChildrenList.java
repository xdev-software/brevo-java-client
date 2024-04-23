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
import software.xdev.brevo.model.GetChildrenListChildrenInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * GetChildrenList
 */
@JsonPropertyOrder({
  GetChildrenList.JSON_PROPERTY_CHILDREN,
  GetChildrenList.JSON_PROPERTY_COUNT
})
@JsonTypeName("getChildrenList")
public class GetChildrenList {
  public static final String JSON_PROPERTY_CHILDREN = "children";
  private List<GetChildrenListChildrenInner> children = new ArrayList<>();

  public static final String JSON_PROPERTY_COUNT = "count";
  private Long count;

  public GetChildrenList() {
  }

  public GetChildrenList children(List<GetChildrenListChildrenInner> children) {
    
    this.children = children;
    return this;
  }

  public GetChildrenList addChildrenItem(GetChildrenListChildrenInner childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * Your children&#39;s account information
   * @return children
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHILDREN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetChildrenListChildrenInner> getChildren() {
    return children;
  }


  @JsonProperty(JSON_PROPERTY_CHILDREN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChildren(List<GetChildrenListChildrenInner> children) {
    this.children = children;
  }


  public GetChildrenList count(Long count) {
    
    this.count = count;
    return this;
  }

   /**
   * Number of child accounts
   * @return count
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCount() {
    return count;
  }


  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCount(Long count) {
    this.count = count;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetChildrenList getChildrenList = (GetChildrenList) o;
    return Objects.equals(this.children, getChildrenList.children) &&
        Objects.equals(this.count, getChildrenList.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(children, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetChildrenList {\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

    // add `children` to the URL query string
    if (getChildren() != null) {
      for (int i = 0; i < getChildren().size(); i++) {
        if (getChildren().get(i) != null) {
          joiner.add(getChildren().get(i).toUrlQueryString(String.format("%schildren%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `count` to the URL query string
    if (getCount() != null) {
      try {
        joiner.add(String.format("%scount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

