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
import software.xdev.brevo.model.ConversationsMessageFile;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * a Conversations message
 */
@JsonPropertyOrder({
  ConversationsMessage.JSON_PROPERTY_ID,
  ConversationsMessage.JSON_PROPERTY_TYPE,
  ConversationsMessage.JSON_PROPERTY_TEXT,
  ConversationsMessage.JSON_PROPERTY_VISITOR_ID,
  ConversationsMessage.JSON_PROPERTY_AGENT_ID,
  ConversationsMessage.JSON_PROPERTY_AGENT_NAME,
  ConversationsMessage.JSON_PROPERTY_CREATED_AT,
  ConversationsMessage.JSON_PROPERTY_IS_PUSHED,
  ConversationsMessage.JSON_PROPERTY_RECEIVED_FROM,
  ConversationsMessage.JSON_PROPERTY_FILE
})
public class ConversationsMessage {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  /**
   * &#x60;\&quot;agent\&quot;&#x60; for agents’ messages, &#x60;\&quot;visitor\&quot;&#x60; for visitors’ messages.
   */
  public enum TypeEnum {
    AGENT("agent"),
    
    VISITOR("visitor");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_VISITOR_ID = "visitorId";
  private String visitorId;

  public static final String JSON_PROPERTY_AGENT_ID = "agentId";
  private String agentId;

  public static final String JSON_PROPERTY_AGENT_NAME = "agentName";
  private String agentName;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private Long createdAt;

  public static final String JSON_PROPERTY_IS_PUSHED = "isPushed";
  private Boolean isPushed;

  public static final String JSON_PROPERTY_RECEIVED_FROM = "receivedFrom";
  private String receivedFrom;

  public static final String JSON_PROPERTY_FILE = "file";
  private ConversationsMessageFile _file;

  public ConversationsMessage() {
  }

  public ConversationsMessage id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Message ID. It can be used for further manipulations with the message.
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

  public ConversationsMessage type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * &#x60;\&quot;agent\&quot;&#x60; for agents’ messages, &#x60;\&quot;visitor\&quot;&#x60; for visitors’ messages.
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ConversationsMessage text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Message text or name of the attached file
   * @return text
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getText() {
    return text;
  }


  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setText(String text) {
    this.text = text;
  }

  public ConversationsMessage visitorId(String visitorId) {
    
    this.visitorId = visitorId;
    return this;
  }

   /**
   * visitor’s ID
   * @return visitorId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISITOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVisitorId() {
    return visitorId;
  }


  @JsonProperty(JSON_PROPERTY_VISITOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisitorId(String visitorId) {
    this.visitorId = visitorId;
  }

  public ConversationsMessage agentId(String agentId) {
    
    this.agentId = agentId;
    return this;
  }

   /**
   * ID of the agent on whose behalf the message was sent (only in messages sent by an agent).
   * @return agentId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAgentId() {
    return agentId;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }

  public ConversationsMessage agentName(String agentName) {
    
    this.agentName = agentName;
    return this;
  }

   /**
   * Agent’s name as displayed to the visitor. Only in the messages sent by an agent.
   * @return agentName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAgentName() {
    return agentName;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgentName(String agentName) {
    this.agentName = agentName;
  }

  public ConversationsMessage createdAt(Long createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp in milliseconds.
   * minimum: 0
   * @return createdAt
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  public ConversationsMessage isPushed(Boolean isPushed) {
    
    this.isPushed = isPushed;
    return this;
  }

   /**
   * &#x60;true&#x60; for pushed messages
   * @return isPushed
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_PUSHED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsPushed() {
    return isPushed;
  }


  @JsonProperty(JSON_PROPERTY_IS_PUSHED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsPushed(Boolean isPushed) {
    this.isPushed = isPushed;
  }

  public ConversationsMessage receivedFrom(String receivedFrom) {
    
    this.receivedFrom = receivedFrom;
    return this;
  }

   /**
   * In two-way integrations, messages sent via REST API can be marked with receivedFrom property and then filtered out when received in a webhook to avoid infinite loop.
   * @return receivedFrom
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIVED_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReceivedFrom() {
    return receivedFrom;
  }


  @JsonProperty(JSON_PROPERTY_RECEIVED_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceivedFrom(String receivedFrom) {
    this.receivedFrom = receivedFrom;
  }

  public ConversationsMessage _file(ConversationsMessageFile _file) {
    
    this._file = _file;
    return this;
  }

   /**
   * Get _file
   * @return _file
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversationsMessageFile getFile() {
    return _file;
  }


  @JsonProperty(JSON_PROPERTY_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFile(ConversationsMessageFile _file) {
    this._file = _file;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationsMessage conversationsMessage = (ConversationsMessage) o;
    return Objects.equals(this.id, conversationsMessage.id) &&
        Objects.equals(this.type, conversationsMessage.type) &&
        Objects.equals(this.text, conversationsMessage.text) &&
        Objects.equals(this.visitorId, conversationsMessage.visitorId) &&
        Objects.equals(this.agentId, conversationsMessage.agentId) &&
        Objects.equals(this.agentName, conversationsMessage.agentName) &&
        Objects.equals(this.createdAt, conversationsMessage.createdAt) &&
        Objects.equals(this.isPushed, conversationsMessage.isPushed) &&
        Objects.equals(this.receivedFrom, conversationsMessage.receivedFrom) &&
        Objects.equals(this._file, conversationsMessage._file);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, text, visitorId, agentId, agentName, createdAt, isPushed, receivedFrom, _file);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationsMessage {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    visitorId: ").append(toIndentedString(visitorId)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    isPushed: ").append(toIndentedString(isPushed)).append("\n");
    sb.append("    receivedFrom: ").append(toIndentedString(receivedFrom)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `visitorId` to the URL query string
    if (getVisitorId() != null) {
      try {
        joiner.add(String.format("%svisitorId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVisitorId()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `agentName` to the URL query string
    if (getAgentName() != null) {
      try {
        joiner.add(String.format("%sagentName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAgentName()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `isPushed` to the URL query string
    if (getIsPushed() != null) {
      try {
        joiner.add(String.format("%sisPushed%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsPushed()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `file` to the URL query string
    if (getFile() != null) {
      joiner.add(getFile().toUrlQueryString(prefix + "file" + suffix));
    }

    return joiner.toString();
  }

}

