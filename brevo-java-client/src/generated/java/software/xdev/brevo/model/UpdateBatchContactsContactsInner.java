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
 * UpdateBatchContactsContactsInner
 */
@JsonPropertyOrder({
  UpdateBatchContactsContactsInner.JSON_PROPERTY_EMAIL,
  UpdateBatchContactsContactsInner.JSON_PROPERTY_ID,
  UpdateBatchContactsContactsInner.JSON_PROPERTY_SMS,
  UpdateBatchContactsContactsInner.JSON_PROPERTY_EXT_ID,
  UpdateBatchContactsContactsInner.JSON_PROPERTY_ATTRIBUTES,
  UpdateBatchContactsContactsInner.JSON_PROPERTY_EMAIL_BLACKLISTED,
  UpdateBatchContactsContactsInner.JSON_PROPERTY_SMS_BLACKLISTED,
  UpdateBatchContactsContactsInner.JSON_PROPERTY_LIST_IDS,
  UpdateBatchContactsContactsInner.JSON_PROPERTY_UNLINK_LIST_IDS,
  UpdateBatchContactsContactsInner.JSON_PROPERTY_SMTP_BLACKLIST_SENDER
})
@JsonTypeName("updateBatchContacts_contacts_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateBatchContactsContactsInner {
  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_SMS = "sms";
  private String sms;

  public static final String JSON_PROPERTY_EXT_ID = "ext_id";
  private String extId;

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private Map<String, Object> attributes = new HashMap<>();

  public static final String JSON_PROPERTY_EMAIL_BLACKLISTED = "emailBlacklisted";
  private Boolean emailBlacklisted;

  public static final String JSON_PROPERTY_SMS_BLACKLISTED = "smsBlacklisted";
  private Boolean smsBlacklisted;

  public static final String JSON_PROPERTY_LIST_IDS = "listIds";
  private List<Long> listIds;

  public static final String JSON_PROPERTY_UNLINK_LIST_IDS = "unlinkListIds";
  private List<Long> unlinkListIds;

  public static final String JSON_PROPERTY_SMTP_BLACKLIST_SENDER = "smtpBlacklistSender";
  private List<String> smtpBlacklistSender;

  public UpdateBatchContactsContactsInner() {
  }

  public UpdateBatchContactsContactsInner email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Email address of the user to be updated (For each operation only pass one of the supported contact identifiers. Email, id or sms)
   * @return email
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }


  public UpdateBatchContactsContactsInner id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * id of the user to be updated (For each operation only pass one of the supported contact identifiers. Email, id or sms)
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Long id) {
    this.id = id;
  }


  public UpdateBatchContactsContactsInner sms(String sms) {
    
    this.sms = sms;
    return this;
  }

   /**
   * SMS of the user to be updated (For each operation only pass one of the supported contact identifiers. Email, id or sms)
   * @return sms
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSms() {
    return sms;
  }


  @JsonProperty(JSON_PROPERTY_SMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSms(String sms) {
    this.sms = sms;
  }


  public UpdateBatchContactsContactsInner extId(String extId) {
    
    this.extId = extId;
    return this;
  }

   /**
   * Pass your own Id to update ext_id of a contact.
   * @return extId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExtId() {
    return extId;
  }


  @JsonProperty(JSON_PROPERTY_EXT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExtId(String extId) {
    this.extId = extId;
  }


  public UpdateBatchContactsContactsInner attributes(Map<String, Object> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public UpdateBatchContactsContactsInner putAttributesItem(String key, Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Pass the set of attributes to be updated. **These attributes must be present in your account**. To update existing email address of a contact with the new one please pass EMAIL in attribtes. For example, **{ \&quot;EMAIL\&quot;:\&quot;newemail@domain.com\&quot;, \&quot;FNAME\&quot;:\&quot;Ellie\&quot;, \&quot;LNAME\&quot;:\&quot;Roger\&quot;}**. Keep in mind transactional attributes can be updated the same way as normal attributes. Mobile Number in **SMS** field should be passed with proper country code. For example: **{\&quot;SMS\&quot;:\&quot;+91xxxxxxxxxx\&quot;} or {\&quot;SMS\&quot;:\&quot;0091xxxxxxxxxx\&quot;}** 
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


  public UpdateBatchContactsContactsInner emailBlacklisted(Boolean emailBlacklisted) {
    
    this.emailBlacklisted = emailBlacklisted;
    return this;
  }

   /**
   * Set/unset this field to blacklist/allow the contact for emails (emailBlacklisted &#x3D; true)
   * @return emailBlacklisted
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL_BLACKLISTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEmailBlacklisted() {
    return emailBlacklisted;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_BLACKLISTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmailBlacklisted(Boolean emailBlacklisted) {
    this.emailBlacklisted = emailBlacklisted;
  }


  public UpdateBatchContactsContactsInner smsBlacklisted(Boolean smsBlacklisted) {
    
    this.smsBlacklisted = smsBlacklisted;
    return this;
  }

   /**
   * Set/unset this field to blacklist/allow the contact for SMS (smsBlacklisted &#x3D; true)
   * @return smsBlacklisted
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SMS_BLACKLISTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSmsBlacklisted() {
    return smsBlacklisted;
  }


  @JsonProperty(JSON_PROPERTY_SMS_BLACKLISTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSmsBlacklisted(Boolean smsBlacklisted) {
    this.smsBlacklisted = smsBlacklisted;
  }


  public UpdateBatchContactsContactsInner listIds(List<Long> listIds) {
    
    this.listIds = listIds;
    return this;
  }

  public UpdateBatchContactsContactsInner addListIdsItem(Long listIdsItem) {
    if (this.listIds == null) {
      this.listIds = new ArrayList<>();
    }
    this.listIds.add(listIdsItem);
    return this;
  }

   /**
   * Ids of the lists to add the contact to
   * @return listIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIST_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getListIds() {
    return listIds;
  }


  @JsonProperty(JSON_PROPERTY_LIST_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setListIds(List<Long> listIds) {
    this.listIds = listIds;
  }


  public UpdateBatchContactsContactsInner unlinkListIds(List<Long> unlinkListIds) {
    
    this.unlinkListIds = unlinkListIds;
    return this;
  }

  public UpdateBatchContactsContactsInner addUnlinkListIdsItem(Long unlinkListIdsItem) {
    if (this.unlinkListIds == null) {
      this.unlinkListIds = new ArrayList<>();
    }
    this.unlinkListIds.add(unlinkListIdsItem);
    return this;
  }

   /**
   * Ids of the lists to remove the contact from
   * @return unlinkListIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNLINK_LIST_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getUnlinkListIds() {
    return unlinkListIds;
  }


  @JsonProperty(JSON_PROPERTY_UNLINK_LIST_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnlinkListIds(List<Long> unlinkListIds) {
    this.unlinkListIds = unlinkListIds;
  }


  public UpdateBatchContactsContactsInner smtpBlacklistSender(List<String> smtpBlacklistSender) {
    
    this.smtpBlacklistSender = smtpBlacklistSender;
    return this;
  }

  public UpdateBatchContactsContactsInner addSmtpBlacklistSenderItem(String smtpBlacklistSenderItem) {
    if (this.smtpBlacklistSender == null) {
      this.smtpBlacklistSender = new ArrayList<>();
    }
    this.smtpBlacklistSender.add(smtpBlacklistSenderItem);
    return this;
  }

   /**
   * transactional email forbidden sender for contact. Use only for email Contact
   * @return smtpBlacklistSender
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SMTP_BLACKLIST_SENDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSmtpBlacklistSender() {
    return smtpBlacklistSender;
  }


  @JsonProperty(JSON_PROPERTY_SMTP_BLACKLIST_SENDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSmtpBlacklistSender(List<String> smtpBlacklistSender) {
    this.smtpBlacklistSender = smtpBlacklistSender;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateBatchContactsContactsInner updateBatchContactsContactsInner = (UpdateBatchContactsContactsInner) o;
    return Objects.equals(this.email, updateBatchContactsContactsInner.email) &&
        Objects.equals(this.id, updateBatchContactsContactsInner.id) &&
        Objects.equals(this.sms, updateBatchContactsContactsInner.sms) &&
        Objects.equals(this.extId, updateBatchContactsContactsInner.extId) &&
        Objects.equals(this.attributes, updateBatchContactsContactsInner.attributes) &&
        Objects.equals(this.emailBlacklisted, updateBatchContactsContactsInner.emailBlacklisted) &&
        Objects.equals(this.smsBlacklisted, updateBatchContactsContactsInner.smsBlacklisted) &&
        Objects.equals(this.listIds, updateBatchContactsContactsInner.listIds) &&
        Objects.equals(this.unlinkListIds, updateBatchContactsContactsInner.unlinkListIds) &&
        Objects.equals(this.smtpBlacklistSender, updateBatchContactsContactsInner.smtpBlacklistSender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, id, sms, extId, attributes, emailBlacklisted, smsBlacklisted, listIds, unlinkListIds, smtpBlacklistSender);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateBatchContactsContactsInner {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
    sb.append("    extId: ").append(toIndentedString(extId)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    emailBlacklisted: ").append(toIndentedString(emailBlacklisted)).append("\n");
    sb.append("    smsBlacklisted: ").append(toIndentedString(smsBlacklisted)).append("\n");
    sb.append("    listIds: ").append(toIndentedString(listIds)).append("\n");
    sb.append("    unlinkListIds: ").append(toIndentedString(unlinkListIds)).append("\n");
    sb.append("    smtpBlacklistSender: ").append(toIndentedString(smtpBlacklistSender)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sms` to the URL query string
    if (getSms() != null) {
      try {
        joiner.add(String.format("%ssms%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSms()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `ext_id` to the URL query string
    if (getExtId() != null) {
      try {
        joiner.add(String.format("%sext_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExtId()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `emailBlacklisted` to the URL query string
    if (getEmailBlacklisted() != null) {
      try {
        joiner.add(String.format("%semailBlacklisted%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmailBlacklisted()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `smsBlacklisted` to the URL query string
    if (getSmsBlacklisted() != null) {
      try {
        joiner.add(String.format("%ssmsBlacklisted%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSmsBlacklisted()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `listIds` to the URL query string
    if (getListIds() != null) {
      for (int i = 0; i < getListIds().size(); i++) {
        try {
          joiner.add(String.format("%slistIds%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getListIds().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `unlinkListIds` to the URL query string
    if (getUnlinkListIds() != null) {
      for (int i = 0; i < getUnlinkListIds().size(); i++) {
        try {
          joiner.add(String.format("%sunlinkListIds%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getUnlinkListIds().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `smtpBlacklistSender` to the URL query string
    if (getSmtpBlacklistSender() != null) {
      for (int i = 0; i < getSmtpBlacklistSender().size(); i++) {
        try {
          joiner.add(String.format("%ssmtpBlacklistSender%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getSmtpBlacklistSender().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}
