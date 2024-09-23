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
import software.xdev.brevo.model.RequestContactExportCustomContactFilter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * RequestContactExport
 */
@JsonPropertyOrder({
  RequestContactExport.JSON_PROPERTY_EXPORT_ATTRIBUTES,
  RequestContactExport.JSON_PROPERTY_CUSTOM_CONTACT_FILTER,
  RequestContactExport.JSON_PROPERTY_NOTIFY_URL
})
@JsonTypeName("requestContactExport")
public class RequestContactExport {
  public static final String JSON_PROPERTY_EXPORT_ATTRIBUTES = "exportAttributes";
  private List<String> exportAttributes = new ArrayList<>();

  public static final String JSON_PROPERTY_CUSTOM_CONTACT_FILTER = "customContactFilter";
  private RequestContactExportCustomContactFilter customContactFilter;

  public static final String JSON_PROPERTY_NOTIFY_URL = "notifyUrl";
  private String notifyUrl;

  public RequestContactExport() {
  }

  public RequestContactExport exportAttributes(List<String> exportAttributes) {
    
    this.exportAttributes = exportAttributes;
    return this;
  }

  public RequestContactExport addExportAttributesItem(String exportAttributesItem) {
    if (this.exportAttributes == null) {
      this.exportAttributes = new ArrayList<>();
    }
    this.exportAttributes.add(exportAttributesItem);
    return this;
  }

  /**
   * List of all the attributes that you want to export. **These attributes must be present in your contact database.** For example: **[&#39;fname&#39;, &#39;lname&#39;, &#39;email&#39;]** 
   * @return exportAttributes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPORT_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getExportAttributes() {
    return exportAttributes;
  }


  @JsonProperty(JSON_PROPERTY_EXPORT_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExportAttributes(List<String> exportAttributes) {
    this.exportAttributes = exportAttributes;
  }

  public RequestContactExport customContactFilter(RequestContactExportCustomContactFilter customContactFilter) {
    
    this.customContactFilter = customContactFilter;
    return this;
  }

  /**
   * Get customContactFilter
   * @return customContactFilter
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CUSTOM_CONTACT_FILTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RequestContactExportCustomContactFilter getCustomContactFilter() {
    return customContactFilter;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_CONTACT_FILTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCustomContactFilter(RequestContactExportCustomContactFilter customContactFilter) {
    this.customContactFilter = customContactFilter;
  }

  public RequestContactExport notifyUrl(String notifyUrl) {
    
    this.notifyUrl = notifyUrl;
    return this;
  }

  /**
   * Webhook that will be called once the export process is finished. For reference, https://help.brevo.com/hc/en-us/articles/360007666479
   * @return notifyUrl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNotifyUrl() {
    return notifyUrl;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotifyUrl(String notifyUrl) {
    this.notifyUrl = notifyUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestContactExport requestContactExport = (RequestContactExport) o;
    return Objects.equals(this.exportAttributes, requestContactExport.exportAttributes) &&
        Objects.equals(this.customContactFilter, requestContactExport.customContactFilter) &&
        Objects.equals(this.notifyUrl, requestContactExport.notifyUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportAttributes, customContactFilter, notifyUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestContactExport {\n");
    sb.append("    exportAttributes: ").append(toIndentedString(exportAttributes)).append("\n");
    sb.append("    customContactFilter: ").append(toIndentedString(customContactFilter)).append("\n");
    sb.append("    notifyUrl: ").append(toIndentedString(notifyUrl)).append("\n");
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

    // add `exportAttributes` to the URL query string
    if (getExportAttributes() != null) {
      for (int i = 0; i < getExportAttributes().size(); i++) {
        try {
          joiner.add(String.format("%sexportAttributes%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getExportAttributes().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `customContactFilter` to the URL query string
    if (getCustomContactFilter() != null) {
      joiner.add(getCustomContactFilter().toUrlQueryString(prefix + "customContactFilter" + suffix));
    }

    // add `notifyUrl` to the URL query string
    if (getNotifyUrl() != null) {
      try {
        joiner.add(String.format("%snotifyUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNotifyUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

