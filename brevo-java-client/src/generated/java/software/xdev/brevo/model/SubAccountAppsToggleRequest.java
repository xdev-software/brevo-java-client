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
 * List of enable/disable applications on the sub-account
 */
@JsonPropertyOrder({
  SubAccountAppsToggleRequest.JSON_PROPERTY_INBOX,
  SubAccountAppsToggleRequest.JSON_PROPERTY_WHATSAPP,
  SubAccountAppsToggleRequest.JSON_PROPERTY_AUTOMATION,
  SubAccountAppsToggleRequest.JSON_PROPERTY_EMAIL_CAMPAIGNS,
  SubAccountAppsToggleRequest.JSON_PROPERTY_SMS_CAMPAIGNS,
  SubAccountAppsToggleRequest.JSON_PROPERTY_LANDING_PAGES,
  SubAccountAppsToggleRequest.JSON_PROPERTY_TRANSACTIONAL_EMAILS,
  SubAccountAppsToggleRequest.JSON_PROPERTY_TRANSACTIONAL_SMS,
  SubAccountAppsToggleRequest.JSON_PROPERTY_FACEBOOK_ADS,
  SubAccountAppsToggleRequest.JSON_PROPERTY_WEB_PUSH,
  SubAccountAppsToggleRequest.JSON_PROPERTY_MEETINGS,
  SubAccountAppsToggleRequest.JSON_PROPERTY_CONVERSATIONS,
  SubAccountAppsToggleRequest.JSON_PROPERTY_CRM
})
@JsonTypeName("subAccountAppsToggleRequest")
public class SubAccountAppsToggleRequest {
  public static final String JSON_PROPERTY_INBOX = "inbox";
  private Boolean inbox;

  public static final String JSON_PROPERTY_WHATSAPP = "whatsapp";
  private Boolean whatsapp;

  public static final String JSON_PROPERTY_AUTOMATION = "automation";
  private Boolean automation;

  public static final String JSON_PROPERTY_EMAIL_CAMPAIGNS = "email-campaigns";
  private Boolean emailCampaigns;

  public static final String JSON_PROPERTY_SMS_CAMPAIGNS = "sms-campaigns";
  private Boolean smsCampaigns;

  public static final String JSON_PROPERTY_LANDING_PAGES = "landing-pages";
  private Boolean landingPages;

  public static final String JSON_PROPERTY_TRANSACTIONAL_EMAILS = "transactional-emails";
  private Boolean transactionalEmails;

  public static final String JSON_PROPERTY_TRANSACTIONAL_SMS = "transactional-sms";
  private Boolean transactionalSms;

  public static final String JSON_PROPERTY_FACEBOOK_ADS = "facebook-ads";
  private Boolean facebookAds;

  public static final String JSON_PROPERTY_WEB_PUSH = "web-push";
  private Boolean webPush;

  public static final String JSON_PROPERTY_MEETINGS = "meetings";
  private Boolean meetings;

  public static final String JSON_PROPERTY_CONVERSATIONS = "conversations";
  private Boolean conversations;

  public static final String JSON_PROPERTY_CRM = "crm";
  private Boolean crm;

  public SubAccountAppsToggleRequest() {
  }

  public SubAccountAppsToggleRequest inbox(Boolean inbox) {
    
    this.inbox = inbox;
    return this;
  }

   /**
   * Set this field to enable or disable Inbox on the sub-account / Not applicable on ENTv2
   * @return inbox
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INBOX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getInbox() {
    return inbox;
  }


  @JsonProperty(JSON_PROPERTY_INBOX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInbox(Boolean inbox) {
    this.inbox = inbox;
  }

  public SubAccountAppsToggleRequest whatsapp(Boolean whatsapp) {
    
    this.whatsapp = whatsapp;
    return this;
  }

   /**
   * Set this field to enable or disable Whatsapp campaigns on the sub-account
   * @return whatsapp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WHATSAPP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getWhatsapp() {
    return whatsapp;
  }


  @JsonProperty(JSON_PROPERTY_WHATSAPP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWhatsapp(Boolean whatsapp) {
    this.whatsapp = whatsapp;
  }

  public SubAccountAppsToggleRequest automation(Boolean automation) {
    
    this.automation = automation;
    return this;
  }

   /**
   * Set this field to enable or disable Automation on the sub-account
   * @return automation
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTOMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutomation() {
    return automation;
  }


  @JsonProperty(JSON_PROPERTY_AUTOMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutomation(Boolean automation) {
    this.automation = automation;
  }

  public SubAccountAppsToggleRequest emailCampaigns(Boolean emailCampaigns) {
    
    this.emailCampaigns = emailCampaigns;
    return this;
  }

   /**
   * Set this field to enable or disable Email Campaigns on the sub-account
   * @return emailCampaigns
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL_CAMPAIGNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEmailCampaigns() {
    return emailCampaigns;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_CAMPAIGNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmailCampaigns(Boolean emailCampaigns) {
    this.emailCampaigns = emailCampaigns;
  }

  public SubAccountAppsToggleRequest smsCampaigns(Boolean smsCampaigns) {
    
    this.smsCampaigns = smsCampaigns;
    return this;
  }

   /**
   * Set this field to enable or disable SMS Marketing on the sub-account
   * @return smsCampaigns
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SMS_CAMPAIGNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSmsCampaigns() {
    return smsCampaigns;
  }


  @JsonProperty(JSON_PROPERTY_SMS_CAMPAIGNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSmsCampaigns(Boolean smsCampaigns) {
    this.smsCampaigns = smsCampaigns;
  }

  public SubAccountAppsToggleRequest landingPages(Boolean landingPages) {
    
    this.landingPages = landingPages;
    return this;
  }

   /**
   * Set this field to enable or disable Landing pages on the sub-account
   * @return landingPages
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANDING_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLandingPages() {
    return landingPages;
  }


  @JsonProperty(JSON_PROPERTY_LANDING_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLandingPages(Boolean landingPages) {
    this.landingPages = landingPages;
  }

  public SubAccountAppsToggleRequest transactionalEmails(Boolean transactionalEmails) {
    
    this.transactionalEmails = transactionalEmails;
    return this;
  }

   /**
   * Set this field to enable or disable Transactional Email on the sub-account
   * @return transactionalEmails
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSACTIONAL_EMAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTransactionalEmails() {
    return transactionalEmails;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTIONAL_EMAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransactionalEmails(Boolean transactionalEmails) {
    this.transactionalEmails = transactionalEmails;
  }

  public SubAccountAppsToggleRequest transactionalSms(Boolean transactionalSms) {
    
    this.transactionalSms = transactionalSms;
    return this;
  }

   /**
   * Set this field to enable or disable Transactional SMS on the sub-account
   * @return transactionalSms
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSACTIONAL_SMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTransactionalSms() {
    return transactionalSms;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTIONAL_SMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransactionalSms(Boolean transactionalSms) {
    this.transactionalSms = transactionalSms;
  }

  public SubAccountAppsToggleRequest facebookAds(Boolean facebookAds) {
    
    this.facebookAds = facebookAds;
    return this;
  }

   /**
   * Set this field to enable or disable Facebook ads on the sub-account
   * @return facebookAds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FACEBOOK_ADS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFacebookAds() {
    return facebookAds;
  }


  @JsonProperty(JSON_PROPERTY_FACEBOOK_ADS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFacebookAds(Boolean facebookAds) {
    this.facebookAds = facebookAds;
  }

  public SubAccountAppsToggleRequest webPush(Boolean webPush) {
    
    this.webPush = webPush;
    return this;
  }

   /**
   * Set this field to enable or disable Web Push on the sub-account
   * @return webPush
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEB_PUSH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getWebPush() {
    return webPush;
  }


  @JsonProperty(JSON_PROPERTY_WEB_PUSH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebPush(Boolean webPush) {
    this.webPush = webPush;
  }

  public SubAccountAppsToggleRequest meetings(Boolean meetings) {
    
    this.meetings = meetings;
    return this;
  }

   /**
   * Set this field to enable or disable Meetings on the sub-account
   * @return meetings
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEETINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMeetings() {
    return meetings;
  }


  @JsonProperty(JSON_PROPERTY_MEETINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeetings(Boolean meetings) {
    this.meetings = meetings;
  }

  public SubAccountAppsToggleRequest conversations(Boolean conversations) {
    
    this.conversations = conversations;
    return this;
  }

   /**
   * Set this field to enable or disable Conversations on the sub-account
   * @return conversations
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONVERSATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getConversations() {
    return conversations;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversations(Boolean conversations) {
    this.conversations = conversations;
  }

  public SubAccountAppsToggleRequest crm(Boolean crm) {
    
    this.crm = crm;
    return this;
  }

   /**
   * Set this field to enable or disable Sales CRM on the sub-account
   * @return crm
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CRM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCrm() {
    return crm;
  }


  @JsonProperty(JSON_PROPERTY_CRM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCrm(Boolean crm) {
    this.crm = crm;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubAccountAppsToggleRequest subAccountAppsToggleRequest = (SubAccountAppsToggleRequest) o;
    return Objects.equals(this.inbox, subAccountAppsToggleRequest.inbox) &&
        Objects.equals(this.whatsapp, subAccountAppsToggleRequest.whatsapp) &&
        Objects.equals(this.automation, subAccountAppsToggleRequest.automation) &&
        Objects.equals(this.emailCampaigns, subAccountAppsToggleRequest.emailCampaigns) &&
        Objects.equals(this.smsCampaigns, subAccountAppsToggleRequest.smsCampaigns) &&
        Objects.equals(this.landingPages, subAccountAppsToggleRequest.landingPages) &&
        Objects.equals(this.transactionalEmails, subAccountAppsToggleRequest.transactionalEmails) &&
        Objects.equals(this.transactionalSms, subAccountAppsToggleRequest.transactionalSms) &&
        Objects.equals(this.facebookAds, subAccountAppsToggleRequest.facebookAds) &&
        Objects.equals(this.webPush, subAccountAppsToggleRequest.webPush) &&
        Objects.equals(this.meetings, subAccountAppsToggleRequest.meetings) &&
        Objects.equals(this.conversations, subAccountAppsToggleRequest.conversations) &&
        Objects.equals(this.crm, subAccountAppsToggleRequest.crm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inbox, whatsapp, automation, emailCampaigns, smsCampaigns, landingPages, transactionalEmails, transactionalSms, facebookAds, webPush, meetings, conversations, crm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubAccountAppsToggleRequest {\n");
    sb.append("    inbox: ").append(toIndentedString(inbox)).append("\n");
    sb.append("    whatsapp: ").append(toIndentedString(whatsapp)).append("\n");
    sb.append("    automation: ").append(toIndentedString(automation)).append("\n");
    sb.append("    emailCampaigns: ").append(toIndentedString(emailCampaigns)).append("\n");
    sb.append("    smsCampaigns: ").append(toIndentedString(smsCampaigns)).append("\n");
    sb.append("    landingPages: ").append(toIndentedString(landingPages)).append("\n");
    sb.append("    transactionalEmails: ").append(toIndentedString(transactionalEmails)).append("\n");
    sb.append("    transactionalSms: ").append(toIndentedString(transactionalSms)).append("\n");
    sb.append("    facebookAds: ").append(toIndentedString(facebookAds)).append("\n");
    sb.append("    webPush: ").append(toIndentedString(webPush)).append("\n");
    sb.append("    meetings: ").append(toIndentedString(meetings)).append("\n");
    sb.append("    conversations: ").append(toIndentedString(conversations)).append("\n");
    sb.append("    crm: ").append(toIndentedString(crm)).append("\n");
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

    // add `inbox` to the URL query string
    if (getInbox() != null) {
      try {
        joiner.add(String.format("%sinbox%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInbox()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `whatsapp` to the URL query string
    if (getWhatsapp() != null) {
      try {
        joiner.add(String.format("%swhatsapp%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWhatsapp()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `automation` to the URL query string
    if (getAutomation() != null) {
      try {
        joiner.add(String.format("%sautomation%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAutomation()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `email-campaigns` to the URL query string
    if (getEmailCampaigns() != null) {
      try {
        joiner.add(String.format("%semail-campaigns%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmailCampaigns()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sms-campaigns` to the URL query string
    if (getSmsCampaigns() != null) {
      try {
        joiner.add(String.format("%ssms-campaigns%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSmsCampaigns()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `landing-pages` to the URL query string
    if (getLandingPages() != null) {
      try {
        joiner.add(String.format("%slanding-pages%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLandingPages()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `transactional-emails` to the URL query string
    if (getTransactionalEmails() != null) {
      try {
        joiner.add(String.format("%stransactional-emails%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTransactionalEmails()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `transactional-sms` to the URL query string
    if (getTransactionalSms() != null) {
      try {
        joiner.add(String.format("%stransactional-sms%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTransactionalSms()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `facebook-ads` to the URL query string
    if (getFacebookAds() != null) {
      try {
        joiner.add(String.format("%sfacebook-ads%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFacebookAds()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `web-push` to the URL query string
    if (getWebPush() != null) {
      try {
        joiner.add(String.format("%sweb-push%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWebPush()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `meetings` to the URL query string
    if (getMeetings() != null) {
      try {
        joiner.add(String.format("%smeetings%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMeetings()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `conversations` to the URL query string
    if (getConversations() != null) {
      try {
        joiner.add(String.format("%sconversations%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConversations()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `crm` to the URL query string
    if (getCrm() != null) {
      try {
        joiner.add(String.format("%scrm%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCrm()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

