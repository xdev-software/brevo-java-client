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
 * ConversationsPushedMessagesPostRequest
 */
@JsonPropertyOrder({
  ConversationsPushedMessagesPostRequest.JSON_PROPERTY_VISITOR_ID,
  ConversationsPushedMessagesPostRequest.JSON_PROPERTY_TEXT,
  ConversationsPushedMessagesPostRequest.JSON_PROPERTY_AGENT_ID,
  ConversationsPushedMessagesPostRequest.JSON_PROPERTY_GROUP_ID
})
@JsonTypeName("_conversations_pushedMessages_post_request")
public class ConversationsPushedMessagesPostRequest {
  public static final String JSON_PROPERTY_VISITOR_ID = "visitorId";
  private Object visitorId = null;

  public static final String JSON_PROPERTY_TEXT = "text";
  private Object text = null;

  public static final String JSON_PROPERTY_AGENT_ID = "agentId";
  private JsonNullable<Object> agentId = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_GROUP_ID = "groupId";
  private JsonNullable<Object> groupId = JsonNullable.<Object>of(null);

  public ConversationsPushedMessagesPostRequest() {
  }

  public ConversationsPushedMessagesPostRequest visitorId(Object visitorId) {
    
    this.visitorId = visitorId;
    return this;
  }

   /**
   * visitor’s ID received &lt;a href&#x3D;\&quot;https://developers.brevo.com/docs/conversations-webhooks\&quot;&gt;from a webhook&lt;/a&gt; or generated by you to &lt;a href&#x3D;\&quot;https://developers.brevo.com/docs/customize-the-widget#identifying-existing-users\&quot;&gt;bind existing user account to Conversations&lt;/a&gt;
   * @return visitorId
  **/
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

  public ConversationsPushedMessagesPostRequest text(Object text) {
    
    this.text = text;
    return this;
  }

   /**
   * message text
   * @return text
  **/
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

  public ConversationsPushedMessagesPostRequest agentId(Object agentId) {
    this.agentId = JsonNullable.<Object>of(agentId);
    
    return this;
  }

   /**
   * agent ID. It can be found on agent’s page or received &lt;a href&#x3D;\&quot;https://developers.brevo.com/docs/conversations-webhooks\&quot;&gt;from a webhook&lt;/a&gt;.
   * @return agentId
  **/
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

  public ConversationsPushedMessagesPostRequest groupId(Object groupId) {
    this.groupId = JsonNullable.<Object>of(groupId);
    
    return this;
  }

   /**
   * group ID. It can be found on group’s page.
   * @return groupId
  **/
  @jakarta.annotation.Nullable
  @JsonIgnore

  public Object getGroupId() {
        return groupId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getGroupId_JsonNullable() {
    return groupId;
  }
  
  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  public void setGroupId_JsonNullable(JsonNullable<Object> groupId) {
    this.groupId = groupId;
  }

  public void setGroupId(Object groupId) {
    this.groupId = JsonNullable.<Object>of(groupId);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationsPushedMessagesPostRequest conversationsPushedMessagesPostRequest = (ConversationsPushedMessagesPostRequest) o;
    return Objects.equals(this.visitorId, conversationsPushedMessagesPostRequest.visitorId) &&
        Objects.equals(this.text, conversationsPushedMessagesPostRequest.text) &&
        equalsNullable(this.agentId, conversationsPushedMessagesPostRequest.agentId) &&
        equalsNullable(this.groupId, conversationsPushedMessagesPostRequest.groupId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(visitorId, text, hashCodeNullable(agentId), hashCodeNullable(groupId));
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
    sb.append("class ConversationsPushedMessagesPostRequest {\n");
    sb.append("    visitorId: ").append(toIndentedString(visitorId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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

    // add `groupId` to the URL query string
    if (getGroupId() != null) {
      try {
        joiner.add(String.format("%sgroupId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGroupId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

