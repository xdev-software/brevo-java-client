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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Note Details
 */
@JsonPropertyOrder({
  Note.JSON_PROPERTY_ID,
  Note.JSON_PROPERTY_TEXT,
  Note.JSON_PROPERTY_CONTACT_IDS,
  Note.JSON_PROPERTY_DEAL_IDS,
  Note.JSON_PROPERTY_AUTHOR_ID,
  Note.JSON_PROPERTY_CREATED_AT,
  Note.JSON_PROPERTY_UPDATED_AT
})
public class Note {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_CONTACT_IDS = "contactIds";
  private List<Integer> contactIds;

  public static final String JSON_PROPERTY_DEAL_IDS = "dealIds";
  private List<String> dealIds;

  public static final String JSON_PROPERTY_AUTHOR_ID = "authorId";
  private Object authorId;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
  private OffsetDateTime updatedAt;

  public Note() {
  }

  public Note id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique note Id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public Note text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Text content of a note
   * @return text
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getText() {
    return text;
  }


  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setText(String text) {
    this.text = text;
  }


  public Note contactIds(List<Integer> contactIds) {
    
    this.contactIds = contactIds;
    return this;
  }

  public Note addContactIdsItem(Integer contactIdsItem) {
    if (this.contactIds == null) {
      this.contactIds = new ArrayList<>();
    }
    this.contactIds.add(contactIdsItem);
    return this;
  }

   /**
   * Contact ids linked to a note
   * @return contactIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTACT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getContactIds() {
    return contactIds;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContactIds(List<Integer> contactIds) {
    this.contactIds = contactIds;
  }


  public Note dealIds(List<String> dealIds) {
    
    this.dealIds = dealIds;
    return this;
  }

  public Note addDealIdsItem(String dealIdsItem) {
    if (this.dealIds == null) {
      this.dealIds = new ArrayList<>();
    }
    this.dealIds.add(dealIdsItem);
    return this;
  }

   /**
   * Deal ids linked to a note
   * @return dealIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEAL_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getDealIds() {
    return dealIds;
  }


  @JsonProperty(JSON_PROPERTY_DEAL_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDealIds(List<String> dealIds) {
    this.dealIds = dealIds;
  }


  public Note authorId(Object authorId) {
    
    this.authorId = authorId;
    return this;
  }

   /**
   * Account details of user which created the note
   * @return authorId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getAuthorId() {
    return authorId;
  }


  @JsonProperty(JSON_PROPERTY_AUTHOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthorId(Object authorId) {
    this.authorId = authorId;
  }


  public Note createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Note created date/time
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


  public Note updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Note updated date/time
   * @return updatedAt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Note note = (Note) o;
    return Objects.equals(this.id, note.id) &&
        Objects.equals(this.text, note.text) &&
        Objects.equals(this.contactIds, note.contactIds) &&
        Objects.equals(this.dealIds, note.dealIds) &&
        Objects.equals(this.authorId, note.authorId) &&
        Objects.equals(this.createdAt, note.createdAt) &&
        Objects.equals(this.updatedAt, note.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, text, contactIds, dealIds, authorId, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Note {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    contactIds: ").append(toIndentedString(contactIds)).append("\n");
    sb.append("    dealIds: ").append(toIndentedString(dealIds)).append("\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

    // add `text` to the URL query string
    if (getText() != null) {
      try {
        joiner.add(String.format("%stext%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getText()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `contactIds` to the URL query string
    if (getContactIds() != null) {
      for (int i = 0; i < getContactIds().size(); i++) {
        try {
          joiner.add(String.format("%scontactIds%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getContactIds().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `dealIds` to the URL query string
    if (getDealIds() != null) {
      for (int i = 0; i < getDealIds().size(); i++) {
        try {
          joiner.add(String.format("%sdealIds%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getDealIds().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
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

    // add `createdAt` to the URL query string
    if (getCreatedAt() != null) {
      try {
        joiner.add(String.format("%screatedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `updatedAt` to the URL query string
    if (getUpdatedAt() != null) {
      try {
        joiner.add(String.format("%supdatedAt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUpdatedAt()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

