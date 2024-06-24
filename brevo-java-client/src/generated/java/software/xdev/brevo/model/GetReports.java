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
import software.xdev.brevo.model.GetReportsReportsInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * GetReports
 */
@JsonPropertyOrder({
  GetReports.JSON_PROPERTY_REPORTS
})
@JsonTypeName("getReports")
public class GetReports {
  public static final String JSON_PROPERTY_REPORTS = "reports";
  private List<GetReportsReportsInner> reports = new ArrayList<>();

  public GetReports() {
  }

  public GetReports reports(List<GetReportsReportsInner> reports) {
    
    this.reports = reports;
    return this;
  }

  public GetReports addReportsItem(GetReportsReportsInner reportsItem) {
    if (this.reports == null) {
      this.reports = new ArrayList<>();
    }
    this.reports.add(reportsItem);
    return this;
  }

   /**
   * Get reports
   * @return reports
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GetReportsReportsInner> getReports() {
    return reports;
  }


  @JsonProperty(JSON_PROPERTY_REPORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReports(List<GetReportsReportsInner> reports) {
    this.reports = reports;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetReports getReports = (GetReports) o;
    return Objects.equals(this.reports, getReports.reports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reports);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetReports {\n");
    sb.append("    reports: ").append(toIndentedString(reports)).append("\n");
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

    // add `reports` to the URL query string
    if (getReports() != null) {
      for (int i = 0; i < getReports().size(); i++) {
        if (getReports().get(i) != null) {
          joiner.add(getReports().get(i).toUrlQueryString(String.format("%sreports%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

