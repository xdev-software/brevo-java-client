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
 * CreateWebhook
 */
@JsonPropertyOrder({
  CreateWebhook.JSON_PROPERTY_URL,
  CreateWebhook.JSON_PROPERTY_DESCRIPTION,
  CreateWebhook.JSON_PROPERTY_EVENTS,
  CreateWebhook.JSON_PROPERTY_TYPE,
  CreateWebhook.JSON_PROPERTY_DOMAIN,
  CreateWebhook.JSON_PROPERTY_BATCHED,
  CreateWebhook.JSON_PROPERTY_AUTH,
  CreateWebhook.JSON_PROPERTY_HEADERS
})
@JsonTypeName("createWebhook")
public class CreateWebhook {
  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  /**
   * Gets or Sets events
   */
  public enum EventsEnum {
    SENT("sent"),
    
    HARDBOUNCE("hardBounce"),
    
    SOFTBOUNCE("softBounce"),
    
    BLOCKED("blocked"),
    
    SPAM("spam"),
    
    DELIVERED("delivered"),
    
    REQUEST("request"),
    
    CLICK("click"),
    
    INVALID("invalid"),
    
    DEFERRED("deferred"),
    
    OPENED("opened"),
    
    UNIQUEOPENED("uniqueOpened"),
    
    UNSUBSCRIBED("unsubscribed"),
    
    LISTADDITION("listAddition"),
    
    CONTACTUPDATED("contactUpdated"),
    
    CONTACTDELETED("contactDeleted"),
    
    INBOUNDEMAILPROCESSED("inboundEmailProcessed");

    private String value;

    EventsEnum(String value) {
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
    public static EventsEnum fromValue(String value) {
      for (EventsEnum b : EventsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_EVENTS = "events";
  private List<EventsEnum> events = new ArrayList<>();

  /**
   * Type of the webhook
   */
  public enum TypeEnum {
    TRANSACTIONAL("transactional"),
    
    MARKETING("marketing"),
    
    INBOUND("inbound");

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
  private TypeEnum type = TypeEnum.TRANSACTIONAL;

  public static final String JSON_PROPERTY_DOMAIN = "domain";
  private String domain;

  public static final String JSON_PROPERTY_BATCHED = "batched";
  private Boolean batched;

  public static final String JSON_PROPERTY_AUTH = "auth";
  private Object auth;

  public static final String JSON_PROPERTY_HEADERS = "headers";
  private List<Object> headers = new ArrayList<>();

  public CreateWebhook() {
  }

  public CreateWebhook url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * URL of the webhook
   * @return url
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUrl(String url) {
    this.url = url;
  }


  public CreateWebhook description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the webhook
   * @return description
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public CreateWebhook events(List<EventsEnum> events) {
    
    this.events = events;
    return this;
  }

  public CreateWebhook addEventsItem(EventsEnum eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * - Events triggering the webhook. Possible values for **Transactional** type webhook: #### &#x60;sent&#x60; OR &#x60;request&#x60;, &#x60;delivered&#x60;, &#x60;hardBounce&#x60;, &#x60;softBounce&#x60;, &#x60;blocked&#x60;, &#x60;spam&#x60;, &#x60;invalid&#x60;, &#x60;deferred&#x60;, &#x60;click&#x60;, &#x60;opened&#x60;, &#x60;uniqueOpened&#x60; and &#x60;unsubscribed&#x60; - Possible values for **Marketing** type webhook: #### &#x60;spam&#x60;, &#x60;opened&#x60;, &#x60;click&#x60;, &#x60;hardBounce&#x60;, &#x60;softBounce&#x60;, &#x60;unsubscribed&#x60;, &#x60;listAddition&#x60; &amp; &#x60;delivered&#x60; - Possible values for **Inbound** type webhook: #### &#x60;inboundEmailProcessed&#x60; 
   * @return events
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<EventsEnum> getEvents() {
    return events;
  }


  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEvents(List<EventsEnum> events) {
    this.events = events;
  }


  public CreateWebhook type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of the webhook
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


  public CreateWebhook domain(String domain) {
    
    this.domain = domain;
    return this;
  }

   /**
   * Inbound domain of webhook, required in case of event type &#x60;inbound&#x60;
   * @return domain
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDomain() {
    return domain;
  }


  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDomain(String domain) {
    this.domain = domain;
  }


  public CreateWebhook batched(Boolean batched) {
    
    this.batched = batched;
    return this;
  }

   /**
   * Batching configuration of the webhook, we send batched webhooks if its true
   * @return batched
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BATCHED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBatched() {
    return batched;
  }


  @JsonProperty(JSON_PROPERTY_BATCHED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBatched(Boolean batched) {
    this.batched = batched;
  }


  public CreateWebhook auth(Object auth) {
    
    this.auth = auth;
    return this;
  }

   /**
   * Authentication header to be send with the webhook requests
   * @return auth
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getAuth() {
    return auth;
  }


  @JsonProperty(JSON_PROPERTY_AUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuth(Object auth) {
    this.auth = auth;
  }


  public CreateWebhook headers(List<Object> headers) {
    
    this.headers = headers;
    return this;
  }

  public CreateWebhook addHeadersItem(Object headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<>();
    }
    this.headers.add(headersItem);
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getHeaders() {
    return headers;
  }


  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeaders(List<Object> headers) {
    this.headers = headers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWebhook createWebhook = (CreateWebhook) o;
    return Objects.equals(this.url, createWebhook.url) &&
        Objects.equals(this.description, createWebhook.description) &&
        Objects.equals(this.events, createWebhook.events) &&
        Objects.equals(this.type, createWebhook.type) &&
        Objects.equals(this.domain, createWebhook.domain) &&
        Objects.equals(this.batched, createWebhook.batched) &&
        Objects.equals(this.auth, createWebhook.auth) &&
        Objects.equals(this.headers, createWebhook.headers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, description, events, type, domain, batched, auth, headers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWebhook {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    batched: ").append(toIndentedString(batched)).append("\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
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

    // add `url` to the URL query string
    if (getUrl() != null) {
      try {
        joiner.add(String.format("%surl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      try {
        joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `events` to the URL query string
    if (getEvents() != null) {
      for (int i = 0; i < getEvents().size(); i++) {
        try {
          joiner.add(String.format("%sevents%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getEvents().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
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

    // add `domain` to the URL query string
    if (getDomain() != null) {
      try {
        joiner.add(String.format("%sdomain%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDomain()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `batched` to the URL query string
    if (getBatched() != null) {
      try {
        joiner.add(String.format("%sbatched%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBatched()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `auth` to the URL query string
    if (getAuth() != null) {
      try {
        joiner.add(String.format("%sauth%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuth()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `headers` to the URL query string
    if (getHeaders() != null) {
      for (int i = 0; i < getHeaders().size(); i++) {
        try {
          joiner.add(String.format("%sheaders%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getHeaders().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

