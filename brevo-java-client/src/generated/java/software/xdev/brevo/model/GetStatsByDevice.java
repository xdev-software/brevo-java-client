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
import java.util.HashMap;
import java.util.Map;
import software.xdev.brevo.model.GetDeviceBrowserStats;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * GetStatsByDevice
 */
@JsonPropertyOrder({
  GetStatsByDevice.JSON_PROPERTY_DESKTOP,
  GetStatsByDevice.JSON_PROPERTY_MOBILE,
  GetStatsByDevice.JSON_PROPERTY_TABLET,
  GetStatsByDevice.JSON_PROPERTY_UNKNOWN
})
@JsonTypeName("getStatsByDevice")
public class GetStatsByDevice {
  public static final String JSON_PROPERTY_DESKTOP = "desktop";
  private Map<String, GetDeviceBrowserStats> desktop = new HashMap<>();

  public static final String JSON_PROPERTY_MOBILE = "mobile";
  private Map<String, GetDeviceBrowserStats> mobile = new HashMap<>();

  public static final String JSON_PROPERTY_TABLET = "tablet";
  private Map<String, GetDeviceBrowserStats> tablet = new HashMap<>();

  public static final String JSON_PROPERTY_UNKNOWN = "unknown";
  private Map<String, GetDeviceBrowserStats> unknown = new HashMap<>();

  public GetStatsByDevice() {
  }

  public GetStatsByDevice desktop(Map<String, GetDeviceBrowserStats> desktop) {
    
    this.desktop = desktop;
    return this;
  }

  public GetStatsByDevice putDesktopItem(String key, GetDeviceBrowserStats desktopItem) {
    if (this.desktop == null) {
      this.desktop = new HashMap<>();
    }
    this.desktop.put(key, desktopItem);
    return this;
  }

   /**
   * Statistics of the campaign on the basis of desktop devices
   * @return desktop
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESKTOP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, GetDeviceBrowserStats> getDesktop() {
    return desktop;
  }


  @JsonProperty(JSON_PROPERTY_DESKTOP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDesktop(Map<String, GetDeviceBrowserStats> desktop) {
    this.desktop = desktop;
  }

  public GetStatsByDevice mobile(Map<String, GetDeviceBrowserStats> mobile) {
    
    this.mobile = mobile;
    return this;
  }

  public GetStatsByDevice putMobileItem(String key, GetDeviceBrowserStats mobileItem) {
    if (this.mobile == null) {
      this.mobile = new HashMap<>();
    }
    this.mobile.put(key, mobileItem);
    return this;
  }

   /**
   * Statistics of the campaign on the basis of mobile devices
   * @return mobile
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOBILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, GetDeviceBrowserStats> getMobile() {
    return mobile;
  }


  @JsonProperty(JSON_PROPERTY_MOBILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMobile(Map<String, GetDeviceBrowserStats> mobile) {
    this.mobile = mobile;
  }

  public GetStatsByDevice tablet(Map<String, GetDeviceBrowserStats> tablet) {
    
    this.tablet = tablet;
    return this;
  }

  public GetStatsByDevice putTabletItem(String key, GetDeviceBrowserStats tabletItem) {
    if (this.tablet == null) {
      this.tablet = new HashMap<>();
    }
    this.tablet.put(key, tabletItem);
    return this;
  }

   /**
   * Statistics of the campaign on the basis of tablet devices
   * @return tablet
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TABLET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, GetDeviceBrowserStats> getTablet() {
    return tablet;
  }


  @JsonProperty(JSON_PROPERTY_TABLET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTablet(Map<String, GetDeviceBrowserStats> tablet) {
    this.tablet = tablet;
  }

  public GetStatsByDevice unknown(Map<String, GetDeviceBrowserStats> unknown) {
    
    this.unknown = unknown;
    return this;
  }

  public GetStatsByDevice putUnknownItem(String key, GetDeviceBrowserStats unknownItem) {
    if (this.unknown == null) {
      this.unknown = new HashMap<>();
    }
    this.unknown.put(key, unknownItem);
    return this;
  }

   /**
   * Statistics of the campaign on the basis of unknown devices
   * @return unknown
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNKNOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, GetDeviceBrowserStats> getUnknown() {
    return unknown;
  }


  @JsonProperty(JSON_PROPERTY_UNKNOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnknown(Map<String, GetDeviceBrowserStats> unknown) {
    this.unknown = unknown;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStatsByDevice getStatsByDevice = (GetStatsByDevice) o;
    return Objects.equals(this.desktop, getStatsByDevice.desktop) &&
        Objects.equals(this.mobile, getStatsByDevice.mobile) &&
        Objects.equals(this.tablet, getStatsByDevice.tablet) &&
        Objects.equals(this.unknown, getStatsByDevice.unknown);
  }

  @Override
  public int hashCode() {
    return Objects.hash(desktop, mobile, tablet, unknown);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStatsByDevice {\n");
    sb.append("    desktop: ").append(toIndentedString(desktop)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    tablet: ").append(toIndentedString(tablet)).append("\n");
    sb.append("    unknown: ").append(toIndentedString(unknown)).append("\n");
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

    // add `desktop` to the URL query string
    if (getDesktop() != null) {
      for (String _key : getDesktop().keySet()) {
        if (getDesktop().get(_key) != null) {
          joiner.add(getDesktop().get(_key).toUrlQueryString(String.format("%sdesktop%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
    }

    // add `mobile` to the URL query string
    if (getMobile() != null) {
      for (String _key : getMobile().keySet()) {
        if (getMobile().get(_key) != null) {
          joiner.add(getMobile().get(_key).toUrlQueryString(String.format("%smobile%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
    }

    // add `tablet` to the URL query string
    if (getTablet() != null) {
      for (String _key : getTablet().keySet()) {
        if (getTablet().get(_key) != null) {
          joiner.add(getTablet().get(_key).toUrlQueryString(String.format("%stablet%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
    }

    // add `unknown` to the URL query string
    if (getUnknown() != null) {
      for (String _key : getUnknown().keySet()) {
        if (getUnknown().get(_key) != null) {
          joiner.add(getUnknown().get(_key).toUrlQueryString(String.format("%sunknown%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

