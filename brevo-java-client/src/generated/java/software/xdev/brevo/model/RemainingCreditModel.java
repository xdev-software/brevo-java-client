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
import software.xdev.brevo.model.RemainingCreditModelChild;
import software.xdev.brevo.model.RemainingCreditModelReseller;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * RemainingCreditModel
 */
@JsonPropertyOrder({
  RemainingCreditModel.JSON_PROPERTY_CHILD,
  RemainingCreditModel.JSON_PROPERTY_RESELLER
})
@JsonTypeName("remainingCreditModel")
public class RemainingCreditModel {
  public static final String JSON_PROPERTY_CHILD = "child";
  private RemainingCreditModelChild child;

  public static final String JSON_PROPERTY_RESELLER = "reseller";
  private RemainingCreditModelReseller reseller;

  public RemainingCreditModel() {
  }

  public RemainingCreditModel child(RemainingCreditModelChild child) {
    
    this.child = child;
    return this;
  }

  /**
   * Get child
   * @return child
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CHILD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RemainingCreditModelChild getChild() {
    return child;
  }


  @JsonProperty(JSON_PROPERTY_CHILD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChild(RemainingCreditModelChild child) {
    this.child = child;
  }

  public RemainingCreditModel reseller(RemainingCreditModelReseller reseller) {
    
    this.reseller = reseller;
    return this;
  }

  /**
   * Get reseller
   * @return reseller
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RESELLER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RemainingCreditModelReseller getReseller() {
    return reseller;
  }


  @JsonProperty(JSON_PROPERTY_RESELLER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReseller(RemainingCreditModelReseller reseller) {
    this.reseller = reseller;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemainingCreditModel remainingCreditModel = (RemainingCreditModel) o;
    return Objects.equals(this.child, remainingCreditModel.child) &&
        Objects.equals(this.reseller, remainingCreditModel.reseller);
  }

  @Override
  public int hashCode() {
    return Objects.hash(child, reseller);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemainingCreditModel {\n");
    sb.append("    child: ").append(toIndentedString(child)).append("\n");
    sb.append("    reseller: ").append(toIndentedString(reseller)).append("\n");
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

    // add `child` to the URL query string
    if (getChild() != null) {
      joiner.add(getChild().toUrlQueryString(prefix + "child" + suffix));
    }

    // add `reseller` to the URL query string
    if (getReseller() != null) {
      joiner.add(getReseller().toUrlQueryString(prefix + "reseller" + suffix));
    }

    return joiner.toString();
  }

}

