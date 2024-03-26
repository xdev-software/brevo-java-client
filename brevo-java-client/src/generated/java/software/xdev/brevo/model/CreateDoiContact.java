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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * CreateDoiContact
 */
@JsonPropertyOrder({
  CreateDoiContact.JSON_PROPERTY_EMAIL,
  CreateDoiContact.JSON_PROPERTY_ATTRIBUTES,
  CreateDoiContact.JSON_PROPERTY_INCLUDE_LIST_IDS,
  CreateDoiContact.JSON_PROPERTY_EXCLUDE_LIST_IDS,
  CreateDoiContact.JSON_PROPERTY_TEMPLATE_ID,
  CreateDoiContact.JSON_PROPERTY_REDIRECTION_URL
})
@JsonTypeName("createDoiContact")
public class CreateDoiContact {
  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private Map<String, Object> attributes = new HashMap<>();

  public static final String JSON_PROPERTY_INCLUDE_LIST_IDS = "includeListIds";
  private List<Long> includeListIds = new ArrayList<>();

  public static final String JSON_PROPERTY_EXCLUDE_LIST_IDS = "excludeListIds";
  private List<Long> excludeListIds;

  public static final String JSON_PROPERTY_TEMPLATE_ID = "templateId";
  private Long templateId;

  public static final String JSON_PROPERTY_REDIRECTION_URL = "redirectionUrl";
  private String redirectionUrl;

  public CreateDoiContact() {
  }

  public CreateDoiContact email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Email address where the confirmation email will be sent. This email address will be the identifier for all other contact attributes.
   * @return email
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmail(String email) {
    this.email = email;
  }


  public CreateDoiContact attributes(Map<String, Object> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public CreateDoiContact putAttributesItem(String key, Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Pass the set of attributes and their values. **These attributes must be present in your Brevo account**. For eg. **{&#39;FNAME&#39;:&#39;Elly&#39;, &#39;LNAME&#39;:&#39;Roger&#39;}** 
   * @return attributes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getAttributes() {
    return attributes;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }


  public CreateDoiContact includeListIds(List<Long> includeListIds) {
    
    this.includeListIds = includeListIds;
    return this;
  }

  public CreateDoiContact addIncludeListIdsItem(Long includeListIdsItem) {
    if (this.includeListIds == null) {
      this.includeListIds = new ArrayList<>();
    }
    this.includeListIds.add(includeListIdsItem);
    return this;
  }

   /**
   * Lists under user account where contact should be added
   * @return includeListIds
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INCLUDE_LIST_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Long> getIncludeListIds() {
    return includeListIds;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDE_LIST_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIncludeListIds(List<Long> includeListIds) {
    this.includeListIds = includeListIds;
  }


  public CreateDoiContact excludeListIds(List<Long> excludeListIds) {
    
    this.excludeListIds = excludeListIds;
    return this;
  }

  public CreateDoiContact addExcludeListIdsItem(Long excludeListIdsItem) {
    if (this.excludeListIds == null) {
      this.excludeListIds = new ArrayList<>();
    }
    this.excludeListIds.add(excludeListIdsItem);
    return this;
  }

   /**
   * Lists under user account where contact should not be added
   * @return excludeListIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCLUDE_LIST_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getExcludeListIds() {
    return excludeListIds;
  }


  @JsonProperty(JSON_PROPERTY_EXCLUDE_LIST_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExcludeListIds(List<Long> excludeListIds) {
    this.excludeListIds = excludeListIds;
  }


  public CreateDoiContact templateId(Long templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * Id of the Double opt-in (DOI) template
   * @return templateId
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getTemplateId() {
    return templateId;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTemplateId(Long templateId) {
    this.templateId = templateId;
  }


  public CreateDoiContact redirectionUrl(String redirectionUrl) {
    
    this.redirectionUrl = redirectionUrl;
    return this;
  }

   /**
   * URL of the web page that user will be redirected to after clicking on the double opt in URL. When editing your DOI template you can reference this URL by using the tag **{{ params.DOIurl }}**. 
   * @return redirectionUrl
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REDIRECTION_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRedirectionUrl() {
    return redirectionUrl;
  }


  @JsonProperty(JSON_PROPERTY_REDIRECTION_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRedirectionUrl(String redirectionUrl) {
    this.redirectionUrl = redirectionUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDoiContact createDoiContact = (CreateDoiContact) o;
    return Objects.equals(this.email, createDoiContact.email) &&
        Objects.equals(this.attributes, createDoiContact.attributes) &&
        Objects.equals(this.includeListIds, createDoiContact.includeListIds) &&
        Objects.equals(this.excludeListIds, createDoiContact.excludeListIds) &&
        Objects.equals(this.templateId, createDoiContact.templateId) &&
        Objects.equals(this.redirectionUrl, createDoiContact.redirectionUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, attributes, includeListIds, excludeListIds, templateId, redirectionUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDoiContact {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    includeListIds: ").append(toIndentedString(includeListIds)).append("\n");
    sb.append("    excludeListIds: ").append(toIndentedString(excludeListIds)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    redirectionUrl: ").append(toIndentedString(redirectionUrl)).append("\n");
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

    // add `email` to the URL query string
    if (getEmail() != null) {
      try {
        joiner.add(String.format("%semail%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmail()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `attributes` to the URL query string
    if (getAttributes() != null) {
      for (String _key : getAttributes().keySet()) {
        try {
          joiner.add(String.format("%sattributes%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getAttributes().get(_key), URLEncoder.encode(String.valueOf(getAttributes().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `includeListIds` to the URL query string
    if (getIncludeListIds() != null) {
      for (int i = 0; i < getIncludeListIds().size(); i++) {
        try {
          joiner.add(String.format("%sincludeListIds%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getIncludeListIds().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `excludeListIds` to the URL query string
    if (getExcludeListIds() != null) {
      for (int i = 0; i < getExcludeListIds().size(); i++) {
        try {
          joiner.add(String.format("%sexcludeListIds%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getExcludeListIds().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `templateId` to the URL query string
    if (getTemplateId() != null) {
      try {
        joiner.add(String.format("%stemplateId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTemplateId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `redirectionUrl` to the URL query string
    if (getRedirectionUrl() != null) {
      try {
        joiner.add(String.format("%sredirectionUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRedirectionUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

