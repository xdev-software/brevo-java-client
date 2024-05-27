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
import software.xdev.brevo.model.SubAccountDetailsResponsePlanInfoCredits;
import software.xdev.brevo.model.SubAccountDetailsResponsePlanInfoFeatures;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Sub-account plan details
 */
@JsonPropertyOrder({
  SubAccountDetailsResponsePlanInfo.JSON_PROPERTY_CREDITS,
  SubAccountDetailsResponsePlanInfo.JSON_PROPERTY_FEATURES,
  SubAccountDetailsResponsePlanInfo.JSON_PROPERTY_PLAN_TYPE
})
@JsonTypeName("subAccountDetailsResponse_planInfo")
public class SubAccountDetailsResponsePlanInfo {
  public static final String JSON_PROPERTY_CREDITS = "credits";
  private SubAccountDetailsResponsePlanInfoCredits credits;

  public static final String JSON_PROPERTY_FEATURES = "features";
  private SubAccountDetailsResponsePlanInfoFeatures features;

  public static final String JSON_PROPERTY_PLAN_TYPE = "planType";
  private String planType;

  public SubAccountDetailsResponsePlanInfo() {
  }

  public SubAccountDetailsResponsePlanInfo credits(SubAccountDetailsResponsePlanInfoCredits credits) {
    
    this.credits = credits;
    return this;
  }

   /**
   * Get credits
   * @return credits
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREDITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubAccountDetailsResponsePlanInfoCredits getCredits() {
    return credits;
  }


  @JsonProperty(JSON_PROPERTY_CREDITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCredits(SubAccountDetailsResponsePlanInfoCredits credits) {
    this.credits = credits;
  }


  public SubAccountDetailsResponsePlanInfo features(SubAccountDetailsResponsePlanInfoFeatures features) {
    
    this.features = features;
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FEATURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubAccountDetailsResponsePlanInfoFeatures getFeatures() {
    return features;
  }


  @JsonProperty(JSON_PROPERTY_FEATURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeatures(SubAccountDetailsResponsePlanInfoFeatures features) {
    this.features = features;
  }


  public SubAccountDetailsResponsePlanInfo planType(String planType) {
    
    this.planType = planType;
    return this;
  }

   /**
   * type of the plan
   * @return planType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLAN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlanType() {
    return planType;
  }


  @JsonProperty(JSON_PROPERTY_PLAN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlanType(String planType) {
    this.planType = planType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubAccountDetailsResponsePlanInfo subAccountDetailsResponsePlanInfo = (SubAccountDetailsResponsePlanInfo) o;
    return Objects.equals(this.credits, subAccountDetailsResponsePlanInfo.credits) &&
        Objects.equals(this.features, subAccountDetailsResponsePlanInfo.features) &&
        Objects.equals(this.planType, subAccountDetailsResponsePlanInfo.planType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credits, features, planType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubAccountDetailsResponsePlanInfo {\n");
    sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    planType: ").append(toIndentedString(planType)).append("\n");
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

    // add `credits` to the URL query string
    if (getCredits() != null) {
      joiner.add(getCredits().toUrlQueryString(prefix + "credits" + suffix));
    }

    // add `features` to the URL query string
    if (getFeatures() != null) {
      joiner.add(getFeatures().toUrlQueryString(prefix + "features" + suffix));
    }

    // add `planType` to the URL query string
    if (getPlanType() != null) {
      try {
        joiner.add(String.format("%splanType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlanType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}
