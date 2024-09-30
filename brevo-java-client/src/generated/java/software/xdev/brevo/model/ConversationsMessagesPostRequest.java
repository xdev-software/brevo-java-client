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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ConversationsMessagesPostRequest
 */
@JsonPropertyOrder({
  ConversationsMessagesPostRequest.JSON_PROPERTY_VISITOR_ID,
  ConversationsMessagesPostRequest.JSON_PROPERTY_TEXT,
  ConversationsMessagesPostRequest.JSON_PROPERTY_AGENT_ID,
  ConversationsMessagesPostRequest.JSON_PROPERTY_RECEIVED_FROM,
  ConversationsMessagesPostRequest.JSON_PROPERTY_AGENT_EMAIL,
  ConversationsMessagesPostRequest.JSON_PROPERTY_AGENT_NAME
})
@JsonTypeName("_conversations_messages_post_request")
public class ConversationsMessagesPostRequest {
  public static final String JSON_PROPERTY_VISITOR_ID = "visitorId";
  private Object visitorId = null;

  public static final String JSON_PROPERTY_TEXT = "text";
  private Object text = null;

  public static final String JSON_PROPERTY_AGENT_ID = "agentId";
  private JsonNullable<Object> agentId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_RECEIVED_FROM = "receivedFrom";
  private JsonNullable<Object> receivedFrom = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_AGENT_EMAIL = "agentEmail";
  private JsonNullable<Object> agentEmail = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_AGENT_NAME = "agentName";
  private JsonNullable<Object> agentName = JsonNullable.<Object>of(null);

  public ConversationsMessagesPostRequest() {
  }

  public ConversationsMessagesPostRequest visitorId(Object visitorId) {
    
    this.visitorId = visitorId;
    return this;
  }

  /**
   * visitor’s ID received &lt;a href&#x3D;\&quot;https://developers.brevo.com/docs/conversations-webhooks\&quot;&gt;from a webhook&lt;/a&gt; or generated by you to &lt;a href&#x3D;\&quot;https://developers.brevo.com/docs/customize-the-widget#identifying-existing-users\&quot;&gt;bind existing user account to Conversations&lt;/a&gt;
   * @return visitorId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISITOR_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getVisitorId() {
    return visitorId;
  }


  @JsonProperty(JSON_PROPERTY_VISITOR_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVisitorId(Object visitorId) {
    this.visitorId = visitorId;
  }

  public ConversationsMessagesPostRequest text(Object text) {
    
    this.text = text;
    return this;
  }

  /**
   * message text
   * @return text
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getText() {
    return text;
  }


  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setText(Object text) {
    this.text = text;
  }

  public ConversationsMessagesPostRequest agentId(Object agentId) {
    this.agentId = JsonNullable.<Object>of(agentId);
    
    return this;
  }

  /**
   * agent ID. It can be found on agent’s page or received &lt;a href&#x3D;\&quot;https://developers.brevo.com/docs/conversations-webhooks\&quot;&gt;from a webhook&lt;/a&gt;. Alternatively, you can use &#x60;agentEmail&#x60; + &#x60;agentName&#x60; + &#x60;receivedFrom&#x60; instead (all 3 fields required).
   * @return agentId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Object getAgentId() {
        return agentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AGENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAgentId_JsonNullable() {
    return agentId;
  }
  
  @JsonProperty(JSON_PROPERTY_AGENT_ID)
  public void setAgentId_JsonNullable(JsonNullable<Object> agentId) {
    this.agentId = agentId;
  }

  public void setAgentId(Object agentId) {
    this.agentId = JsonNullable.<Object>of(agentId);
  }

  public ConversationsMessagesPostRequest receivedFrom(Object receivedFrom) {
    this.receivedFrom = JsonNullable.<Object>of(receivedFrom);
    
    return this;
  }

  /**
   * mark your messages to distinguish messages created by you from the others.
   * @return receivedFrom
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Object getReceivedFrom() {
        return receivedFrom.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RECEIVED_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getReceivedFrom_JsonNullable() {
    return receivedFrom;
  }
  
  @JsonProperty(JSON_PROPERTY_RECEIVED_FROM)
  public void setReceivedFrom_JsonNullable(JsonNullable<Object> receivedFrom) {
    this.receivedFrom = receivedFrom;
  }

  public void setReceivedFrom(Object receivedFrom) {
    this.receivedFrom = JsonNullable.<Object>of(receivedFrom);
  }

  public ConversationsMessagesPostRequest agentEmail(Object agentEmail) {
    this.agentEmail = JsonNullable.<Object>of(agentEmail);
    
    return this;
  }

  /**
   * agent email. When sending messages from a standalone system, it’s hard to maintain a 1-to-1 relationship between the users of both systems. In this case, an agent can be specified by their email address.
   * @return agentEmail
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Object getAgentEmail() {
        return agentEmail.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AGENT_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAgentEmail_JsonNullable() {
    return agentEmail;
  }
  
  @JsonProperty(JSON_PROPERTY_AGENT_EMAIL)
  public void setAgentEmail_JsonNullable(JsonNullable<Object> agentEmail) {
    this.agentEmail = agentEmail;
  }

  public void setAgentEmail(Object agentEmail) {
    this.agentEmail = JsonNullable.<Object>of(agentEmail);
  }

  public ConversationsMessagesPostRequest agentName(Object agentName) {
    this.agentName = JsonNullable.<Object>of(agentName);
    
    return this;
  }

  /**
   * agent name
   * @return agentName
   */
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Object getAgentName() {
        return agentName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AGENT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAgentName_JsonNullable() {
    return agentName;
  }
  
  @JsonProperty(JSON_PROPERTY_AGENT_NAME)
  public void setAgentName_JsonNullable(JsonNullable<Object> agentName) {
    this.agentName = agentName;
  }

  public void setAgentName(Object agentName) {
    this.agentName = JsonNullable.<Object>of(agentName);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationsMessagesPostRequest conversationsMessagesPostRequest = (ConversationsMessagesPostRequest) o;
    return Objects.equals(this.visitorId, conversationsMessagesPostRequest.visitorId) &&
        Objects.equals(this.text, conversationsMessagesPostRequest.text) &&
        equalsNullable(this.agentId, conversationsMessagesPostRequest.agentId) &&
        equalsNullable(this.receivedFrom, conversationsMessagesPostRequest.receivedFrom) &&
        equalsNullable(this.agentEmail, conversationsMessagesPostRequest.agentEmail) &&
        equalsNullable(this.agentName, conversationsMessagesPostRequest.agentName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(visitorId, text, hashCodeNullable(agentId), hashCodeNullable(receivedFrom), hashCodeNullable(agentEmail), hashCodeNullable(agentName));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationsMessagesPostRequest {\n");
    sb.append("    visitorId: ").append(toIndentedString(visitorId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    receivedFrom: ").append(toIndentedString(receivedFrom)).append("\n");
    sb.append("    agentEmail: ").append(toIndentedString(agentEmail)).append("\n");
    sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
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

    // add `visitorId` to the URL query string
    if (getVisitorId() != null) {
      try {
        joiner.add(String.format("%svisitorId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVisitorId()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `agentId` to the URL query string
    if (getAgentId() != null) {
      try {
        joiner.add(String.format("%sagentId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAgentId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `receivedFrom` to the URL query string
    if (getReceivedFrom() != null) {
      try {
        joiner.add(String.format("%sreceivedFrom%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReceivedFrom()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `agentEmail` to the URL query string
    if (getAgentEmail() != null) {
      try {
        joiner.add(String.format("%sagentEmail%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAgentEmail()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `agentName` to the URL query string
    if (getAgentName() != null) {
      try {
        joiner.add(String.format("%sagentName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAgentName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

