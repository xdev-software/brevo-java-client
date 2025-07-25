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
import software.xdev.brevo.model.MainValueResponse;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * MainRuleConditionResponse
 */
@JsonPropertyOrder({
  MainRuleConditionResponse.JSON_PROPERTY_AND,
  MainRuleConditionResponse.JSON_PROPERTY_LHS,
  MainRuleConditionResponse.JSON_PROPERTY_OP,
  MainRuleConditionResponse.JSON_PROPERTY_OR,
  MainRuleConditionResponse.JSON_PROPERTY_RHS
})
@JsonTypeName("main.ruleConditionResponse")
public class MainRuleConditionResponse {
  public static final String JSON_PROPERTY_AND = "and";
  @jakarta.annotation.Nullable
  private List<MainRuleConditionResponse> and = new ArrayList<>();

  public static final String JSON_PROPERTY_LHS = "lhs";
  @jakarta.annotation.Nullable
  private MainValueResponse lhs;

  public static final String JSON_PROPERTY_OP = "op";
  @jakarta.annotation.Nullable
  private String op;

  public static final String JSON_PROPERTY_OR = "or";
  @jakarta.annotation.Nullable
  private List<MainRuleConditionResponse> or = new ArrayList<>();

  public static final String JSON_PROPERTY_RHS = "rhs";
  @jakarta.annotation.Nullable
  private MainValueResponse rhs;

  public MainRuleConditionResponse() {
  }

  public MainRuleConditionResponse and(@jakarta.annotation.Nullable List<MainRuleConditionResponse> and) {
    
    this.and = and;
    return this;
  }

  public MainRuleConditionResponse addAndItem(MainRuleConditionResponse andItem) {
    if (this.and == null) {
      this.and = new ArrayList<>();
    }
    this.and.add(andItem);
    return this;
  }

  /**
   * Metric to indicate AND between rules
   * @return and
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MainRuleConditionResponse> getAnd() {
    return and;
  }


  @JsonProperty(JSON_PROPERTY_AND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnd(@jakarta.annotation.Nullable List<MainRuleConditionResponse> and) {
    this.and = and;
  }

  public MainRuleConditionResponse lhs(@jakarta.annotation.Nullable MainValueResponse lhs) {
    
    this.lhs = lhs;
    return this;
  }

  /**
   * Condition of the rule
   * @return lhs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LHS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MainValueResponse getLhs() {
    return lhs;
  }


  @JsonProperty(JSON_PROPERTY_LHS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLhs(@jakarta.annotation.Nullable MainValueResponse lhs) {
    this.lhs = lhs;
  }

  public MainRuleConditionResponse op(@jakarta.annotation.Nullable String op) {
    
    this.op = op;
    return this;
  }

  /**
   * Selected operator for the rule
   * @return op
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOp() {
    return op;
  }


  @JsonProperty(JSON_PROPERTY_OP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOp(@jakarta.annotation.Nullable String op) {
    this.op = op;
  }

  public MainRuleConditionResponse or(@jakarta.annotation.Nullable List<MainRuleConditionResponse> or) {
    
    this.or = or;
    return this;
  }

  public MainRuleConditionResponse addOrItem(MainRuleConditionResponse orItem) {
    if (this.or == null) {
      this.or = new ArrayList<>();
    }
    this.or.add(orItem);
    return this;
  }

  /**
   * Metric to indicate OR between rules
   * @return or
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MainRuleConditionResponse> getOr() {
    return or;
  }


  @JsonProperty(JSON_PROPERTY_OR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOr(@jakarta.annotation.Nullable List<MainRuleConditionResponse> or) {
    this.or = or;
  }

  public MainRuleConditionResponse rhs(@jakarta.annotation.Nullable MainValueResponse rhs) {
    
    this.rhs = rhs;
    return this;
  }

  /**
   * Action of the rule
   * @return rhs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RHS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MainValueResponse getRhs() {
    return rhs;
  }


  @JsonProperty(JSON_PROPERTY_RHS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRhs(@jakarta.annotation.Nullable MainValueResponse rhs) {
    this.rhs = rhs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MainRuleConditionResponse mainRuleConditionResponse = (MainRuleConditionResponse) o;
    return Objects.equals(this.and, mainRuleConditionResponse.and) &&
        Objects.equals(this.lhs, mainRuleConditionResponse.lhs) &&
        Objects.equals(this.op, mainRuleConditionResponse.op) &&
        Objects.equals(this.or, mainRuleConditionResponse.or) &&
        Objects.equals(this.rhs, mainRuleConditionResponse.rhs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(and, lhs, op, or, rhs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MainRuleConditionResponse {\n");
    sb.append("    and: ").append(toIndentedString(and)).append("\n");
    sb.append("    lhs: ").append(toIndentedString(lhs)).append("\n");
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    or: ").append(toIndentedString(or)).append("\n");
    sb.append("    rhs: ").append(toIndentedString(rhs)).append("\n");
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

    // add `and` to the URL query string
    if (getAnd() != null) {
      for (int i = 0; i < getAnd().size(); i++) {
        if (getAnd().get(i) != null) {
          joiner.add(getAnd().get(i).toUrlQueryString(String.format("%sand%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `lhs` to the URL query string
    if (getLhs() != null) {
      joiner.add(getLhs().toUrlQueryString(prefix + "lhs" + suffix));
    }

    // add `op` to the URL query string
    if (getOp() != null) {
      try {
        joiner.add(String.format("%sop%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOp()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `or` to the URL query string
    if (getOr() != null) {
      for (int i = 0; i < getOr().size(); i++) {
        if (getOr().get(i) != null) {
          joiner.add(getOr().get(i).toUrlQueryString(String.format("%sor%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `rhs` to the URL query string
    if (getRhs() != null) {
      joiner.add(getRhs().toUrlQueryString(prefix + "rhs" + suffix));
    }

    return joiner.toString();
  }

}

