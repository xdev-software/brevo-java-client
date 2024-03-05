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
import software.xdev.brevo.model.GetSmtpTemplateOverview;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * GetSmtpTemplates
 */
@JsonPropertyOrder({
  GetSmtpTemplates.JSON_PROPERTY_COUNT,
  GetSmtpTemplates.JSON_PROPERTY_TEMPLATES
})
@JsonTypeName("getSmtpTemplates")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetSmtpTemplates {
  public static final String JSON_PROPERTY_COUNT = "count";
  private Long count;

  public static final String JSON_PROPERTY_TEMPLATES = "templates";
  private List<GetSmtpTemplateOverview> templates;

  public GetSmtpTemplates() {
  }

  public GetSmtpTemplates count(Long count) {
    
    this.count = count;
    return this;
  }

   /**
   * Count of transactional email templates
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


  public GetSmtpTemplates templates(List<GetSmtpTemplateOverview> templates) {
    
    this.templates = templates;
    return this;
  }

  public GetSmtpTemplates addTemplatesItem(GetSmtpTemplateOverview templatesItem) {
    if (this.templates == null) {
      this.templates = new ArrayList<>();
    }
    this.templates.add(templatesItem);
    return this;
  }

   /**
   * Get templates
   * @return templates
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMPLATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetSmtpTemplateOverview> getTemplates() {
    return templates;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplates(List<GetSmtpTemplateOverview> templates) {
    this.templates = templates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSmtpTemplates getSmtpTemplates = (GetSmtpTemplates) o;
    return Objects.equals(this.count, getSmtpTemplates.count) &&
        Objects.equals(this.templates, getSmtpTemplates.templates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, templates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSmtpTemplates {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
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

    // add `count` to the URL query string
    if (getCount() != null) {
      try {
        joiner.add(String.format("%scount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `templates` to the URL query string
    if (getTemplates() != null) {
      for (int i = 0; i < getTemplates().size(); i++) {
        if (getTemplates().get(i) != null) {
          joiner.add(getTemplates().get(i).toUrlQueryString(String.format("%stemplates%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

