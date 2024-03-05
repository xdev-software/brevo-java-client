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
 * Set the filter for the contacts to be exported. 
 */
@JsonPropertyOrder({
  RequestContactExportCustomContactFilter.JSON_PROPERTY_ACTION_FOR_CONTACTS,
  RequestContactExportCustomContactFilter.JSON_PROPERTY_ACTION_FOR_EMAIL_CAMPAIGNS,
  RequestContactExportCustomContactFilter.JSON_PROPERTY_ACTION_FOR_SMS_CAMPAIGNS,
  RequestContactExportCustomContactFilter.JSON_PROPERTY_LIST_ID,
  RequestContactExportCustomContactFilter.JSON_PROPERTY_EMAIL_CAMPAIGN_ID,
  RequestContactExportCustomContactFilter.JSON_PROPERTY_SMS_CAMPAIGN_ID
})
@JsonTypeName("requestContactExport_customContactFilter")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RequestContactExportCustomContactFilter {
  /**
   * **Mandatory if neither actionForEmailCampaigns nor actionForSmsCampaigns is passed.** This will export the contacts on the basis of provided action applied on contacts as per the list id. * **allContacts** - Fetch the list of all contacts for a particular list. * **subscribed &amp; unsubscribed** - Fetch the list of subscribed / unsubscribed (blacklisted via any means) contacts for a particular list. * **unsubscribedPerList** - Fetch the list of contacts that are unsubscribed from a particular list only. 
   */
  public enum ActionForContactsEnum {
    ALLCONTACTS("allContacts"),
    
    SUBSCRIBED("subscribed"),
    
    UNSUBSCRIBED("unsubscribed"),
    
    UNSUBSCRIBEDPERLIST("unsubscribedPerList");

    private String value;

    ActionForContactsEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ActionForContactsEnum fromValue(String value) {
      for (ActionForContactsEnum b : ActionForContactsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ACTION_FOR_CONTACTS = "actionForContacts";
  private ActionForContactsEnum actionForContacts;

  /**
   * **Mandatory if neither actionForContacts nor actionForSmsCampaigns is passed.** This will export the contacts on the basis of provided action applied on email campaigns. * **openers &amp; nonOpeners** - emailCampaignId is mandatory. Fetch the list of readers / non-readers for a particular email campaign. * **clickers &amp; nonClickers** - emailCampaignId is mandatory. Fetch the list of clickers / non-clickers for a particular email campaign. * **unsubscribed** - emailCampaignId is mandatory. Fetch the list of all unsubscribed (blacklisted via any means) contacts for a particular email campaign. * **hardBounces &amp; softBounces** - emailCampaignId is optional. Fetch the list of hard bounces / soft bounces for a particular / all email campaign(s). 
   */
  public enum ActionForEmailCampaignsEnum {
    OPENERS("openers"),
    
    NONOPENERS("nonOpeners"),
    
    CLICKERS("clickers"),
    
    NONCLICKERS("nonClickers"),
    
    UNSUBSCRIBED("unsubscribed"),
    
    HARDBOUNCES("hardBounces"),
    
    SOFTBOUNCES("softBounces");

    private String value;

    ActionForEmailCampaignsEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ActionForEmailCampaignsEnum fromValue(String value) {
      for (ActionForEmailCampaignsEnum b : ActionForEmailCampaignsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ACTION_FOR_EMAIL_CAMPAIGNS = "actionForEmailCampaigns";
  private ActionForEmailCampaignsEnum actionForEmailCampaigns;

  /**
   * **Mandatory if neither actionForContacts nor actionForEmailCampaigns is passed.** This will export the contacts on the basis of provided action applied on sms campaigns. * **unsubscribed** - Fetch the list of all unsubscribed (blacklisted via any means) contacts for all / particular sms campaigns. * **hardBounces &amp; softBounces** - Fetch the list of hard bounces / soft bounces for all / particular sms campaigns. 
   */
  public enum ActionForSmsCampaignsEnum {
    HARDBOUNCES("hardBounces"),
    
    SOFTBOUNCES("softBounces"),
    
    UNSUBSCRIBED("unsubscribed");

    private String value;

    ActionForSmsCampaignsEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ActionForSmsCampaignsEnum fromValue(String value) {
      for (ActionForSmsCampaignsEnum b : ActionForSmsCampaignsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ACTION_FOR_SMS_CAMPAIGNS = "actionForSmsCampaigns";
  private ActionForSmsCampaignsEnum actionForSmsCampaigns;

  public static final String JSON_PROPERTY_LIST_ID = "listId";
  private Long listId;

  public static final String JSON_PROPERTY_EMAIL_CAMPAIGN_ID = "emailCampaignId";
  private Long emailCampaignId;

  public static final String JSON_PROPERTY_SMS_CAMPAIGN_ID = "smsCampaignId";
  private Long smsCampaignId;

  public RequestContactExportCustomContactFilter() {
  }

  public RequestContactExportCustomContactFilter actionForContacts(ActionForContactsEnum actionForContacts) {
    
    this.actionForContacts = actionForContacts;
    return this;
  }

   /**
   * **Mandatory if neither actionForEmailCampaigns nor actionForSmsCampaigns is passed.** This will export the contacts on the basis of provided action applied on contacts as per the list id. * **allContacts** - Fetch the list of all contacts for a particular list. * **subscribed &amp; unsubscribed** - Fetch the list of subscribed / unsubscribed (blacklisted via any means) contacts for a particular list. * **unsubscribedPerList** - Fetch the list of contacts that are unsubscribed from a particular list only. 
   * @return actionForContacts
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTION_FOR_CONTACTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ActionForContactsEnum getActionForContacts() {
    return actionForContacts;
  }


  @JsonProperty(JSON_PROPERTY_ACTION_FOR_CONTACTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActionForContacts(ActionForContactsEnum actionForContacts) {
    this.actionForContacts = actionForContacts;
  }


  public RequestContactExportCustomContactFilter actionForEmailCampaigns(ActionForEmailCampaignsEnum actionForEmailCampaigns) {
    
    this.actionForEmailCampaigns = actionForEmailCampaigns;
    return this;
  }

   /**
   * **Mandatory if neither actionForContacts nor actionForSmsCampaigns is passed.** This will export the contacts on the basis of provided action applied on email campaigns. * **openers &amp; nonOpeners** - emailCampaignId is mandatory. Fetch the list of readers / non-readers for a particular email campaign. * **clickers &amp; nonClickers** - emailCampaignId is mandatory. Fetch the list of clickers / non-clickers for a particular email campaign. * **unsubscribed** - emailCampaignId is mandatory. Fetch the list of all unsubscribed (blacklisted via any means) contacts for a particular email campaign. * **hardBounces &amp; softBounces** - emailCampaignId is optional. Fetch the list of hard bounces / soft bounces for a particular / all email campaign(s). 
   * @return actionForEmailCampaigns
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTION_FOR_EMAIL_CAMPAIGNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ActionForEmailCampaignsEnum getActionForEmailCampaigns() {
    return actionForEmailCampaigns;
  }


  @JsonProperty(JSON_PROPERTY_ACTION_FOR_EMAIL_CAMPAIGNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActionForEmailCampaigns(ActionForEmailCampaignsEnum actionForEmailCampaigns) {
    this.actionForEmailCampaigns = actionForEmailCampaigns;
  }


  public RequestContactExportCustomContactFilter actionForSmsCampaigns(ActionForSmsCampaignsEnum actionForSmsCampaigns) {
    
    this.actionForSmsCampaigns = actionForSmsCampaigns;
    return this;
  }

   /**
   * **Mandatory if neither actionForContacts nor actionForEmailCampaigns is passed.** This will export the contacts on the basis of provided action applied on sms campaigns. * **unsubscribed** - Fetch the list of all unsubscribed (blacklisted via any means) contacts for all / particular sms campaigns. * **hardBounces &amp; softBounces** - Fetch the list of hard bounces / soft bounces for all / particular sms campaigns. 
   * @return actionForSmsCampaigns
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTION_FOR_SMS_CAMPAIGNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ActionForSmsCampaignsEnum getActionForSmsCampaigns() {
    return actionForSmsCampaigns;
  }


  @JsonProperty(JSON_PROPERTY_ACTION_FOR_SMS_CAMPAIGNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActionForSmsCampaigns(ActionForSmsCampaignsEnum actionForSmsCampaigns) {
    this.actionForSmsCampaigns = actionForSmsCampaigns;
  }


  public RequestContactExportCustomContactFilter listId(Long listId) {
    
    this.listId = listId;
    return this;
  }

   /**
   * **Mandatory if actionForContacts is passed, ignored otherwise.** Id of the list for which the corresponding action shall be applied in the filter. 
   * @return listId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getListId() {
    return listId;
  }


  @JsonProperty(JSON_PROPERTY_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setListId(Long listId) {
    this.listId = listId;
  }


  public RequestContactExportCustomContactFilter emailCampaignId(Long emailCampaignId) {
    
    this.emailCampaignId = emailCampaignId;
    return this;
  }

   /**
   * Considered only if **actionForEmailCampaigns** is passed, ignored otherwise. **Mandatory if action is one of the following - openers, nonOpeners, clickers, nonClickers, unsubscribed.** The id of the email campaign for which the corresponding action shall be applied in the filter. 
   * @return emailCampaignId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getEmailCampaignId() {
    return emailCampaignId;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmailCampaignId(Long emailCampaignId) {
    this.emailCampaignId = emailCampaignId;
  }


  public RequestContactExportCustomContactFilter smsCampaignId(Long smsCampaignId) {
    
    this.smsCampaignId = smsCampaignId;
    return this;
  }

   /**
   * Considered only if **actionForSmsCampaigns** is passed, ignored otherwise. The id of sms campaign for which the corresponding action shall be applied in the filter. 
   * @return smsCampaignId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SMS_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSmsCampaignId() {
    return smsCampaignId;
  }


  @JsonProperty(JSON_PROPERTY_SMS_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSmsCampaignId(Long smsCampaignId) {
    this.smsCampaignId = smsCampaignId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestContactExportCustomContactFilter requestContactExportCustomContactFilter = (RequestContactExportCustomContactFilter) o;
    return Objects.equals(this.actionForContacts, requestContactExportCustomContactFilter.actionForContacts) &&
        Objects.equals(this.actionForEmailCampaigns, requestContactExportCustomContactFilter.actionForEmailCampaigns) &&
        Objects.equals(this.actionForSmsCampaigns, requestContactExportCustomContactFilter.actionForSmsCampaigns) &&
        Objects.equals(this.listId, requestContactExportCustomContactFilter.listId) &&
        Objects.equals(this.emailCampaignId, requestContactExportCustomContactFilter.emailCampaignId) &&
        Objects.equals(this.smsCampaignId, requestContactExportCustomContactFilter.smsCampaignId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionForContacts, actionForEmailCampaigns, actionForSmsCampaigns, listId, emailCampaignId, smsCampaignId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestContactExportCustomContactFilter {\n");
    sb.append("    actionForContacts: ").append(toIndentedString(actionForContacts)).append("\n");
    sb.append("    actionForEmailCampaigns: ").append(toIndentedString(actionForEmailCampaigns)).append("\n");
    sb.append("    actionForSmsCampaigns: ").append(toIndentedString(actionForSmsCampaigns)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    emailCampaignId: ").append(toIndentedString(emailCampaignId)).append("\n");
    sb.append("    smsCampaignId: ").append(toIndentedString(smsCampaignId)).append("\n");
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

    // add `actionForContacts` to the URL query string
    if (getActionForContacts() != null) {
      try {
        joiner.add(String.format("%sactionForContacts%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getActionForContacts()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `actionForEmailCampaigns` to the URL query string
    if (getActionForEmailCampaigns() != null) {
      try {
        joiner.add(String.format("%sactionForEmailCampaigns%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getActionForEmailCampaigns()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `actionForSmsCampaigns` to the URL query string
    if (getActionForSmsCampaigns() != null) {
      try {
        joiner.add(String.format("%sactionForSmsCampaigns%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getActionForSmsCampaigns()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `listId` to the URL query string
    if (getListId() != null) {
      try {
        joiner.add(String.format("%slistId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getListId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `emailCampaignId` to the URL query string
    if (getEmailCampaignId() != null) {
      try {
        joiner.add(String.format("%semailCampaignId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmailCampaignId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `smsCampaignId` to the URL query string
    if (getSmsCampaignId() != null) {
      try {
        joiner.add(String.format("%ssmsCampaignId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSmsCampaignId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}
