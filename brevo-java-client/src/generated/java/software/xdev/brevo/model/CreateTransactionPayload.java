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
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Payload for creating a transaction, specifying balance details and optional expiration.
 */
@JsonPropertyOrder({
  CreateTransactionPayload.JSON_PROPERTY_LOYALTY_SUBSCRIPTION_ID,
  CreateTransactionPayload.JSON_PROPERTY_AMOUNT,
  CreateTransactionPayload.JSON_PROPERTY_AUTO_COMPLETE,
  CreateTransactionPayload.JSON_PROPERTY_BALANCE_DEFINITION_ID,
  CreateTransactionPayload.JSON_PROPERTY_BALANCE_EXPIRY_IN_MINUTES,
  CreateTransactionPayload.JSON_PROPERTY_CONTACT_ID,
  CreateTransactionPayload.JSON_PROPERTY_EVENT_TIME,
  CreateTransactionPayload.JSON_PROPERTY_META,
  CreateTransactionPayload.JSON_PROPERTY_TTL
})
@JsonTypeName("createTransactionPayload")
public class CreateTransactionPayload {
  public static final String JSON_PROPERTY_LOYALTY_SUBSCRIPTION_ID = "LoyaltySubscriptionId";
  @jakarta.annotation.Nullable
  private String loyaltySubscriptionId;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  @jakarta.annotation.Nonnull
  private BigDecimal amount;

  public static final String JSON_PROPERTY_AUTO_COMPLETE = "autoComplete";
  @jakarta.annotation.Nullable
  private Boolean autoComplete;

  public static final String JSON_PROPERTY_BALANCE_DEFINITION_ID = "balanceDefinitionId";
  @jakarta.annotation.Nonnull
  private String balanceDefinitionId;

  public static final String JSON_PROPERTY_BALANCE_EXPIRY_IN_MINUTES = "balanceExpiryInMinutes";
  @jakarta.annotation.Nullable
  private Integer balanceExpiryInMinutes;

  public static final String JSON_PROPERTY_CONTACT_ID = "contactId";
  @jakarta.annotation.Nullable
  private Integer contactId;

  public static final String JSON_PROPERTY_EVENT_TIME = "eventTime";
  @jakarta.annotation.Nullable
  private String eventTime;

  public static final String JSON_PROPERTY_META = "meta";
  @jakarta.annotation.Nullable
  private Map<String, Object> meta = new HashMap<>();

  public static final String JSON_PROPERTY_TTL = "ttl";
  @jakarta.annotation.Nullable
  private Integer ttl;

  public CreateTransactionPayload() {
  }

  public CreateTransactionPayload loyaltySubscriptionId(@jakarta.annotation.Nullable String loyaltySubscriptionId) {
    
    this.loyaltySubscriptionId = loyaltySubscriptionId;
    return this;
  }

  /**
   * Unique identifier for the loyalty subscription (required unless &#x60;contactId&#x60; is provided).
   * @return loyaltySubscriptionId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOYALTY_SUBSCRIPTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLoyaltySubscriptionId() {
    return loyaltySubscriptionId;
  }


  @JsonProperty(JSON_PROPERTY_LOYALTY_SUBSCRIPTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoyaltySubscriptionId(@jakarta.annotation.Nullable String loyaltySubscriptionId) {
    this.loyaltySubscriptionId = loyaltySubscriptionId;
  }

  public CreateTransactionPayload amount(@jakarta.annotation.Nonnull BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

  /**
   * Transaction amount (must be provided).
   * @return amount
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(@jakarta.annotation.Nonnull BigDecimal amount) {
    this.amount = amount;
  }

  public CreateTransactionPayload autoComplete(@jakarta.annotation.Nullable Boolean autoComplete) {
    
    this.autoComplete = autoComplete;
    return this;
  }

  /**
   * Whether the transaction should be automatically completed.
   * @return autoComplete
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTO_COMPLETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutoComplete() {
    return autoComplete;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_COMPLETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoComplete(@jakarta.annotation.Nullable Boolean autoComplete) {
    this.autoComplete = autoComplete;
  }

  public CreateTransactionPayload balanceDefinitionId(@jakarta.annotation.Nonnull String balanceDefinitionId) {
    
    this.balanceDefinitionId = balanceDefinitionId;
    return this;
  }

  /**
   * Unique identifier (UUID) of the associated balance definition.
   * @return balanceDefinitionId
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BALANCE_DEFINITION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBalanceDefinitionId() {
    return balanceDefinitionId;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE_DEFINITION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBalanceDefinitionId(@jakarta.annotation.Nonnull String balanceDefinitionId) {
    this.balanceDefinitionId = balanceDefinitionId;
  }

  public CreateTransactionPayload balanceExpiryInMinutes(@jakarta.annotation.Nullable Integer balanceExpiryInMinutes) {
    
    this.balanceExpiryInMinutes = balanceExpiryInMinutes;
    return this;
  }

  /**
   * Optional expiry time for the balance in minutes (must be greater than 0 if provided).
   * @return balanceExpiryInMinutes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BALANCE_EXPIRY_IN_MINUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBalanceExpiryInMinutes() {
    return balanceExpiryInMinutes;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE_EXPIRY_IN_MINUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalanceExpiryInMinutes(@jakarta.annotation.Nullable Integer balanceExpiryInMinutes) {
    this.balanceExpiryInMinutes = balanceExpiryInMinutes;
  }

  public CreateTransactionPayload contactId(@jakarta.annotation.Nullable Integer contactId) {
    
    this.contactId = contactId;
    return this;
  }

  /**
   * Unique identifier of the contact involved in the transaction (required unless &#x60;LoyaltySubscriptionId&#x60; is provided).
   * minimum: 1
   * @return contactId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTACT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getContactId() {
    return contactId;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContactId(@jakarta.annotation.Nullable Integer contactId) {
    this.contactId = contactId;
  }

  public CreateTransactionPayload eventTime(@jakarta.annotation.Nullable String eventTime) {
    
    this.eventTime = eventTime;
    return this;
  }

  /**
   * Optional timestamp specifying when the transaction occurred.
   * @return eventTime
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEventTime() {
    return eventTime;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventTime(@jakarta.annotation.Nullable String eventTime) {
    this.eventTime = eventTime;
  }

  public CreateTransactionPayload meta(@jakarta.annotation.Nullable Map<String, Object> meta) {
    
    this.meta = meta;
    return this;
  }

  public CreateTransactionPayload putMetaItem(String key, Object metaItem) {
    if (this.meta == null) {
      this.meta = new HashMap<>();
    }
    this.meta.put(key, metaItem);
    return this;
  }

  /**
   * Optional metadata associated with the transaction.
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeta(@jakarta.annotation.Nullable Map<String, Object> meta) {
    this.meta = meta;
  }

  public CreateTransactionPayload ttl(@jakarta.annotation.Nullable Integer ttl) {
    
    this.ttl = ttl;
    return this;
  }

  /**
   * Optional time-to-live for the transaction (must be greater than 0 if provided).
   * @return ttl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TTL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTtl() {
    return ttl;
  }


  @JsonProperty(JSON_PROPERTY_TTL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTtl(@jakarta.annotation.Nullable Integer ttl) {
    this.ttl = ttl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTransactionPayload createTransactionPayload = (CreateTransactionPayload) o;
    return Objects.equals(this.loyaltySubscriptionId, createTransactionPayload.loyaltySubscriptionId) &&
        Objects.equals(this.amount, createTransactionPayload.amount) &&
        Objects.equals(this.autoComplete, createTransactionPayload.autoComplete) &&
        Objects.equals(this.balanceDefinitionId, createTransactionPayload.balanceDefinitionId) &&
        Objects.equals(this.balanceExpiryInMinutes, createTransactionPayload.balanceExpiryInMinutes) &&
        Objects.equals(this.contactId, createTransactionPayload.contactId) &&
        Objects.equals(this.eventTime, createTransactionPayload.eventTime) &&
        Objects.equals(this.meta, createTransactionPayload.meta) &&
        Objects.equals(this.ttl, createTransactionPayload.ttl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loyaltySubscriptionId, amount, autoComplete, balanceDefinitionId, balanceExpiryInMinutes, contactId, eventTime, meta, ttl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTransactionPayload {\n");
    sb.append("    loyaltySubscriptionId: ").append(toIndentedString(loyaltySubscriptionId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    autoComplete: ").append(toIndentedString(autoComplete)).append("\n");
    sb.append("    balanceDefinitionId: ").append(toIndentedString(balanceDefinitionId)).append("\n");
    sb.append("    balanceExpiryInMinutes: ").append(toIndentedString(balanceExpiryInMinutes)).append("\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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

    // add `LoyaltySubscriptionId` to the URL query string
    if (getLoyaltySubscriptionId() != null) {
      try {
        joiner.add(String.format("%sLoyaltySubscriptionId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLoyaltySubscriptionId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `amount` to the URL query string
    if (getAmount() != null) {
      try {
        joiner.add(String.format("%samount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAmount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `autoComplete` to the URL query string
    if (getAutoComplete() != null) {
      try {
        joiner.add(String.format("%sautoComplete%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAutoComplete()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `balanceDefinitionId` to the URL query string
    if (getBalanceDefinitionId() != null) {
      try {
        joiner.add(String.format("%sbalanceDefinitionId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBalanceDefinitionId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `balanceExpiryInMinutes` to the URL query string
    if (getBalanceExpiryInMinutes() != null) {
      try {
        joiner.add(String.format("%sbalanceExpiryInMinutes%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBalanceExpiryInMinutes()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `eventTime` to the URL query string
    if (getEventTime() != null) {
      try {
        joiner.add(String.format("%seventTime%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEventTime()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `meta` to the URL query string
    if (getMeta() != null) {
      for (String _key : getMeta().keySet()) {
        try {
          joiner.add(String.format("%smeta%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getMeta().get(_key), URLEncoder.encode(String.valueOf(getMeta().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `ttl` to the URL query string
    if (getTtl() != null) {
      try {
        joiner.add(String.format("%sttl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTtl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

