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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * CreateSenderModel
 */
@JsonPropertyOrder({
  CreateSenderModel.JSON_PROPERTY_ID,
  CreateSenderModel.JSON_PROPERTY_SPF_ERROR,
  CreateSenderModel.JSON_PROPERTY_DKIM_ERROR
})
@JsonTypeName("createSenderModel")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateSenderModel {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_SPF_ERROR = "spfError";
  private Boolean spfError;

  public static final String JSON_PROPERTY_DKIM_ERROR = "dkimError";
  private Boolean dkimError;

  public CreateSenderModel() {
  }

  public CreateSenderModel id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the Sender created
   * @return id
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(Long id) {
    this.id = id;
  }


  public CreateSenderModel spfError(Boolean spfError) {
    
    this.spfError = spfError;
    return this;
  }

   /**
   * Status of SPF configuration for the sender (true &#x3D; SPF not well configured, false &#x3D; SPF well configured)
   * @return spfError
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPF_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSpfError() {
    return spfError;
  }


  @JsonProperty(JSON_PROPERTY_SPF_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpfError(Boolean spfError) {
    this.spfError = spfError;
  }


  public CreateSenderModel dkimError(Boolean dkimError) {
    
    this.dkimError = dkimError;
    return this;
  }

   /**
   * Status of DKIM configuration for the sender (true &#x3D; DKIM not well configured, false &#x3D; DKIM well configured)
   * @return dkimError
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DKIM_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDkimError() {
    return dkimError;
  }


  @JsonProperty(JSON_PROPERTY_DKIM_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDkimError(Boolean dkimError) {
    this.dkimError = dkimError;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSenderModel createSenderModel = (CreateSenderModel) o;
    return Objects.equals(this.id, createSenderModel.id) &&
        Objects.equals(this.spfError, createSenderModel.spfError) &&
        Objects.equals(this.dkimError, createSenderModel.dkimError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, spfError, dkimError);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSenderModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    spfError: ").append(toIndentedString(spfError)).append("\n");
    sb.append("    dkimError: ").append(toIndentedString(dkimError)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `spfError` to the URL query string
    if (getSpfError() != null) {
      try {
        joiner.add(String.format("%sspfError%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSpfError()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `dkimError` to the URL query string
    if (getDkimError() != null) {
      try {
        joiner.add(String.format("%sdkimError%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDkimError()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

