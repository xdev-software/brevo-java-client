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
 * UpdateContact
 */
@JsonPropertyOrder({
  UpdateContact.JSON_PROPERTY_ATTRIBUTES,
  UpdateContact.JSON_PROPERTY_EXT_ID,
  UpdateContact.JSON_PROPERTY_EMAIL_BLACKLISTED,
  UpdateContact.JSON_PROPERTY_SMS_BLACKLISTED,
  UpdateContact.JSON_PROPERTY_LIST_IDS,
  UpdateContact.JSON_PROPERTY_UNLINK_LIST_IDS,
  UpdateContact.JSON_PROPERTY_SMTP_BLACKLIST_SENDER
})
@JsonTypeName("updateContact")
public class UpdateContact {
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private Map<String, Object> attributes = new HashMap<>();

  public static final String JSON_PROPERTY_EXT_ID = "ext_id";
  private String extId;

  public static final String JSON_PROPERTY_EMAIL_BLACKLISTED = "emailBlacklisted";
  private Boolean emailBlacklisted;

  public static final String JSON_PROPERTY_SMS_BLACKLISTED = "smsBlacklisted";
  private Boolean smsBlacklisted;

  public static final String JSON_PROPERTY_LIST_IDS = "listIds";
  private List<Long> listIds = new ArrayList<>();

  public static final String JSON_PROPERTY_UNLINK_LIST_IDS = "unlinkListIds";
  private List<Long> unlinkListIds = new ArrayList<>();

  public static final String JSON_PROPERTY_SMTP_BLACKLIST_SENDER = "smtpBlacklistSender";
  private List<String> smtpBlacklistSender = new ArrayList<>();

  public UpdateContact() {
  }

  public UpdateContact attributes(Map<String, Object> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public UpdateContact putAttributesItem(String key, Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Pass the set of attributes to be updated. **These attributes must be present in your account**. To update existing email address of a contact with the new one please pass EMAIL in attributes. For example, **{ \&quot;EMAIL\&quot;:\&quot;newemail@domain.com\&quot;, \&quot;FNAME\&quot;:\&quot;Ellie\&quot;, \&quot;LNAME\&quot;:\&quot;Roger\&quot;}**. The attribute&#39;s parameter should be passed in capital letter while updating a contact. Values that don&#39;t match the attribute type (e.g. text or string in a date attribute) will be ignored. Keep in mind transactional attributes can be updated the same way as normal attributes. Mobile Number in **SMS** field should be passed with proper country code. For example: **{\&quot;SMS\&quot;:\&quot;+91xxxxxxxxxx\&quot;} or {\&quot;SMS\&quot;:\&quot;0091xxxxxxxxxx\&quot;}** 
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


  public UpdateContact extId(String extId) {
    
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


  public UpdateContact emailBlacklisted(Boolean emailBlacklisted) {
    
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


  public UpdateContact smsBlacklisted(Boolean smsBlacklisted) {
    
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


  public UpdateContact listIds(List<Long> listIds) {
    
    this.listIds = listIds;
    return this;
  }

  public UpdateContact addListIdsItem(Long listIdsItem) {
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


  public UpdateContact unlinkListIds(List<Long> unlinkListIds) {
    
    this.unlinkListIds = unlinkListIds;
    return this;
  }

  public UpdateContact addUnlinkListIdsItem(Long unlinkListIdsItem) {
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


  public UpdateContact smtpBlacklistSender(List<String> smtpBlacklistSender) {
    
    this.smtpBlacklistSender = smtpBlacklistSender;
    return this;
  }

  public UpdateContact addSmtpBlacklistSenderItem(String smtpBlacklistSenderItem) {
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
    UpdateContact updateContact = (UpdateContact) o;
    return Objects.equals(this.attributes, updateContact.attributes) &&
        Objects.equals(this.extId, updateContact.extId) &&
        Objects.equals(this.emailBlacklisted, updateContact.emailBlacklisted) &&
        Objects.equals(this.smsBlacklisted, updateContact.smsBlacklisted) &&
        Objects.equals(this.listIds, updateContact.listIds) &&
        Objects.equals(this.unlinkListIds, updateContact.unlinkListIds) &&
        Objects.equals(this.smtpBlacklistSender, updateContact.smtpBlacklistSender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, extId, emailBlacklisted, smsBlacklisted, listIds, unlinkListIds, smtpBlacklistSender);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateContact {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    extId: ").append(toIndentedString(extId)).append("\n");
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

    // add `ext_id` to the URL query string
    if (getExtId() != null) {
      try {
        joiner.add(String.format("%sext_id%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExtId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
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

