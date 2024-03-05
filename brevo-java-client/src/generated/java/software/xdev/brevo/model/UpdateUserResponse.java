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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * UpdateUserResponse
 */
@JsonPropertyOrder({
  UpdateUserResponse.JSON_PROPERTY_STATUS,
  UpdateUserResponse.JSON_PROPERTY_CREDIT_NOTES,
  UpdateUserResponse.JSON_PROPERTY_INVOICE_ID
})
@JsonTypeName("updateUserResponse")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateUserResponse {
  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_CREDIT_NOTES = "credit_notes";
  private List<String> creditNotes;

  public static final String JSON_PROPERTY_INVOICE_ID = "invoice_id";
  private List<String> invoiceId;

  public UpdateUserResponse() {
  }

  public UpdateUserResponse status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status of the API operation.
   * @return status
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(String status) {
    this.status = status;
  }


  public UpdateUserResponse creditNotes(List<String> creditNotes) {
    
    this.creditNotes = creditNotes;
    return this;
  }

  public UpdateUserResponse addCreditNotesItem(String creditNotesItem) {
    if (this.creditNotes == null) {
      this.creditNotes = new ArrayList<>();
    }
    this.creditNotes.add(creditNotesItem);
    return this;
  }

   /**
   * Credit note
   * @return creditNotes
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREDIT_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCreditNotes() {
    return creditNotes;
  }


  @JsonProperty(JSON_PROPERTY_CREDIT_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreditNotes(List<String> creditNotes) {
    this.creditNotes = creditNotes;
  }


  public UpdateUserResponse invoiceId(List<String> invoiceId) {
    
    this.invoiceId = invoiceId;
    return this;
  }

  public UpdateUserResponse addInvoiceIdItem(String invoiceIdItem) {
    if (this.invoiceId == null) {
      this.invoiceId = new ArrayList<>();
    }
    this.invoiceId.add(invoiceIdItem);
    return this;
  }

   /**
   * Invoice id
   * @return invoiceId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVOICE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getInvoiceId() {
    return invoiceId;
  }


  @JsonProperty(JSON_PROPERTY_INVOICE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvoiceId(List<String> invoiceId) {
    this.invoiceId = invoiceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserResponse updateUserResponse = (UpdateUserResponse) o;
    return Objects.equals(this.status, updateUserResponse.status) &&
        Objects.equals(this.creditNotes, updateUserResponse.creditNotes) &&
        Objects.equals(this.invoiceId, updateUserResponse.invoiceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, creditNotes, invoiceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    creditNotes: ").append(toIndentedString(creditNotes)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
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

    // add `status` to the URL query string
    if (getStatus() != null) {
      try {
        joiner.add(String.format("%sstatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `credit_notes` to the URL query string
    if (getCreditNotes() != null) {
      for (int i = 0; i < getCreditNotes().size(); i++) {
        try {
          joiner.add(String.format("%scredit_notes%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getCreditNotes().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `invoice_id` to the URL query string
    if (getInvoiceId() != null) {
      for (int i = 0; i < getInvoiceId().size(); i++) {
        try {
          joiner.add(String.format("%sinvoice_id%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getInvoiceId().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

