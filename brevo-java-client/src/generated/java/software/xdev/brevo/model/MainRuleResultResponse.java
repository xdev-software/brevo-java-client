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
import software.xdev.brevo.model.MainResultParameterResponse;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * MainRuleResultResponse
 */
@JsonPropertyOrder({
  MainRuleResultResponse.JSON_PROPERTY_ACTION,
  MainRuleResultResponse.JSON_PROPERTY_PARAMETERS,
  MainRuleResultResponse.JSON_PROPERTY_SERVICE
})
@JsonTypeName("main.ruleResultResponse")
public class MainRuleResultResponse {
  public static final String JSON_PROPERTY_ACTION = "action";
  @jakarta.annotation.Nullable
  private String action;

  public static final String JSON_PROPERTY_PARAMETERS = "parameters";
  @jakarta.annotation.Nullable
  private List<MainResultParameterResponse> parameters = new ArrayList<>();

  public static final String JSON_PROPERTY_SERVICE = "service";
  @jakarta.annotation.Nullable
  private String service;

  public MainRuleResultResponse() {
  }

  public MainRuleResultResponse action(@jakarta.annotation.Nullable String action) {
    
    this.action = action;
    return this;
  }

  /**
   * Action for the defined rule
   * @return action
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAction() {
    return action;
  }


  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAction(@jakarta.annotation.Nullable String action) {
    this.action = action;
  }

  public MainRuleResultResponse parameters(@jakarta.annotation.Nullable List<MainResultParameterResponse> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public MainRuleResultResponse addParametersItem(MainResultParameterResponse parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

  /**
   * Parameters to define the reward
   * @return parameters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MainResultParameterResponse> getParameters() {
    return parameters;
  }


  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParameters(@jakarta.annotation.Nullable List<MainResultParameterResponse> parameters) {
    this.parameters = parameters;
  }

  public MainRuleResultResponse service(@jakarta.annotation.Nullable String service) {
    
    this.service = service;
    return this;
  }

  /**
   * Selected service to define the reward
   * @return service
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getService() {
    return service;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setService(@jakarta.annotation.Nullable String service) {
    this.service = service;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MainRuleResultResponse mainRuleResultResponse = (MainRuleResultResponse) o;
    return Objects.equals(this.action, mainRuleResultResponse.action) &&
        Objects.equals(this.parameters, mainRuleResultResponse.parameters) &&
        Objects.equals(this.service, mainRuleResultResponse.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, parameters, service);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MainRuleResultResponse {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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

    // add `action` to the URL query string
    if (getAction() != null) {
      try {
        joiner.add(String.format("%saction%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAction()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `parameters` to the URL query string
    if (getParameters() != null) {
      for (int i = 0; i < getParameters().size(); i++) {
        if (getParameters().get(i) != null) {
          joiner.add(getParameters().get(i).toUrlQueryString(String.format("%sparameters%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `service` to the URL query string
    if (getService() != null) {
      try {
        joiner.add(String.format("%sservice%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getService()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

