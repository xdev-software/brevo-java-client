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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * File data that is uploaded
 */
@JsonPropertyOrder({
  FileData.JSON_PROPERTY_NAME,
  FileData.JSON_PROPERTY_AUTHOR_ID,
  FileData.JSON_PROPERTY_CONTACT_ID,
  FileData.JSON_PROPERTY_DEAL_ID,
  FileData.JSON_PROPERTY_COMPANY_ID,
  FileData.JSON_PROPERTY_SIZE,
  FileData.JSON_PROPERTY_CREATED_AT
})
public class FileData {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_AUTHOR_ID = "authorId";
  private String authorId;

  public static final String JSON_PROPERTY_CONTACT_ID = "contactId";
  private Long contactId;

  public static final String JSON_PROPERTY_DEAL_ID = "dealId";
  private String dealId;

  public static final String JSON_PROPERTY_COMPANY_ID = "companyId";
  private String companyId;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Long size;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  public FileData() {
  }

  public FileData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of uploaded file
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }

  public FileData authorId(String authorId) {
    
    this.authorId = authorId;
    return this;
  }

   /**
   * Account id of user which created the file
   * @return authorId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthorId() {
    return authorId;
  }


  @JsonProperty(JSON_PROPERTY_AUTHOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthorId(String authorId) {
    this.authorId = authorId;
  }

  public FileData contactId(Long contactId) {
    
    this.contactId = contactId;
    return this;
  }

   /**
   * Contact id of contact on which file is uploaded
   * @return contactId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTACT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getContactId() {
    return contactId;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContactId(Long contactId) {
    this.contactId = contactId;
  }

  public FileData dealId(String dealId) {
    
    this.dealId = dealId;
    return this;
  }

   /**
   * Deal id linked to a file
   * @return dealId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDealId() {
    return dealId;
  }


  @JsonProperty(JSON_PROPERTY_DEAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDealId(String dealId) {
    this.dealId = dealId;
  }

  public FileData companyId(String companyId) {
    
    this.companyId = companyId;
    return this;
  }

   /**
   * Company id linked to a file
   * @return companyId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPANY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyId() {
    return companyId;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public FileData size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * Size of file in bytes
   * @return size
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSize(Long size) {
    this.size = size;
  }

  public FileData createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * File created date/time
   * @return createdAt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileData fileData = (FileData) o;
    return Objects.equals(this.name, fileData.name) &&
        Objects.equals(this.authorId, fileData.authorId) &&
        Objects.equals(this.contactId, fileData.contactId) &&
        Objects.equals(this.dealId, fileData.dealId) &&
        Objects.equals(this.companyId, fileData.companyId) &&
        Objects.equals(this.size, fileData.size) &&
        Objects.equals(this.createdAt, fileData.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, authorId, contactId, dealId, companyId, size, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileData {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `authorId` to the URL query string
    if (getAuthorId() != null) {
      try {
        joiner.add(String.format("%sauthorId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuthorId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `contactId` to the URL query string
    if (getContactId() != null) {
      try {
        joiner.add(String.format("%scontactId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getContactId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `dealId` to the URL query string
    if (getDealId() != null) {
      try {
        joiner.add(String.format("%sdealId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDealId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `companyId` to the URL query string
    if (getCompanyId() != null) {
      try {
        joiner.add(String.format("%scompanyId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCompanyId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `size` to the URL query string
    if (getSize() != null) {
      try {
        joiner.add(String.format("%ssize%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSize()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `createdAt` to the URL query string
    if (getCreatedAt() != null) {
      try {
        joiner.add(String.format("%screatedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

