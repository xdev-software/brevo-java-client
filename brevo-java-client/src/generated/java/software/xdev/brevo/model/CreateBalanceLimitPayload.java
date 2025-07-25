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
 * Payload for setting transaction or amount-based limits on a balance.
 */
@JsonPropertyOrder({
  CreateBalanceLimitPayload.JSON_PROPERTY_CONSTRAINT_TYPE,
  CreateBalanceLimitPayload.JSON_PROPERTY_DURATION_UNIT,
  CreateBalanceLimitPayload.JSON_PROPERTY_DURATION_VALUE,
  CreateBalanceLimitPayload.JSON_PROPERTY_SLIDING_SCHEDULE,
  CreateBalanceLimitPayload.JSON_PROPERTY_TRANSACTION_TYPE,
  CreateBalanceLimitPayload.JSON_PROPERTY_VALUE
})
@JsonTypeName("createBalanceLimitPayload")
public class CreateBalanceLimitPayload {
  /**
   * Defines whether the limit applies to transaction count or amount.
   */
  public enum ConstraintTypeEnum {
    TRANSACTION(String.valueOf("transaction")),
    
    AMOUNT(String.valueOf("amount"));

    private String value;

    ConstraintTypeEnum(String value) {
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
    public static ConstraintTypeEnum fromValue(String value) {
      for (ConstraintTypeEnum b : ConstraintTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CONSTRAINT_TYPE = "constraintType";
  @jakarta.annotation.Nonnull
  private ConstraintTypeEnum constraintType;

  /**
   * Unit of time for which the limit is applicable.
   */
  public enum DurationUnitEnum {
    DAY(String.valueOf("day")),
    
    WEEK(String.valueOf("week")),
    
    MONTH(String.valueOf("month")),
    
    YEAR(String.valueOf("year"));

    private String value;

    DurationUnitEnum(String value) {
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
    public static DurationUnitEnum fromValue(String value) {
      for (DurationUnitEnum b : DurationUnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DURATION_UNIT = "durationUnit";
  @jakarta.annotation.Nonnull
  private DurationUnitEnum durationUnit;

  public static final String JSON_PROPERTY_DURATION_VALUE = "durationValue";
  @jakarta.annotation.Nonnull
  private Integer durationValue;

  public static final String JSON_PROPERTY_SLIDING_SCHEDULE = "slidingSchedule";
  @jakarta.annotation.Nullable
  private Boolean slidingSchedule;

  /**
   * Specifies whether the limit applies to credit or debit transactions.
   */
  public enum TransactionTypeEnum {
    CREDIT(String.valueOf("credit")),
    
    DEBIT(String.valueOf("debit"));

    private String value;

    TransactionTypeEnum(String value) {
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
    public static TransactionTypeEnum fromValue(String value) {
      for (TransactionTypeEnum b : TransactionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TRANSACTION_TYPE = "transactionType";
  @jakarta.annotation.Nonnull
  private TransactionTypeEnum transactionType;

  public static final String JSON_PROPERTY_VALUE = "value";
  @jakarta.annotation.Nonnull
  private Integer value;

  public CreateBalanceLimitPayload() {
  }

  public CreateBalanceLimitPayload constraintType(@jakarta.annotation.Nonnull ConstraintTypeEnum constraintType) {
    
    this.constraintType = constraintType;
    return this;
  }

  /**
   * Defines whether the limit applies to transaction count or amount.
   * @return constraintType
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONSTRAINT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ConstraintTypeEnum getConstraintType() {
    return constraintType;
  }


  @JsonProperty(JSON_PROPERTY_CONSTRAINT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConstraintType(@jakarta.annotation.Nonnull ConstraintTypeEnum constraintType) {
    this.constraintType = constraintType;
  }

  public CreateBalanceLimitPayload durationUnit(@jakarta.annotation.Nonnull DurationUnitEnum durationUnit) {
    
    this.durationUnit = durationUnit;
    return this;
  }

  /**
   * Unit of time for which the limit is applicable.
   * @return durationUnit
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DURATION_UNIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DurationUnitEnum getDurationUnit() {
    return durationUnit;
  }


  @JsonProperty(JSON_PROPERTY_DURATION_UNIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDurationUnit(@jakarta.annotation.Nonnull DurationUnitEnum durationUnit) {
    this.durationUnit = durationUnit;
  }

  public CreateBalanceLimitPayload durationValue(@jakarta.annotation.Nonnull Integer durationValue) {
    
    this.durationValue = durationValue;
    return this;
  }

  /**
   * Number of time units for the balance limit.
   * @return durationValue
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DURATION_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDurationValue() {
    return durationValue;
  }


  @JsonProperty(JSON_PROPERTY_DURATION_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDurationValue(@jakarta.annotation.Nonnull Integer durationValue) {
    this.durationValue = durationValue;
  }

  public CreateBalanceLimitPayload slidingSchedule(@jakarta.annotation.Nullable Boolean slidingSchedule) {
    
    this.slidingSchedule = slidingSchedule;
    return this;
  }

  /**
   * Determines if the limit resets on a rolling schedule.
   * @return slidingSchedule
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SLIDING_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSlidingSchedule() {
    return slidingSchedule;
  }


  @JsonProperty(JSON_PROPERTY_SLIDING_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSlidingSchedule(@jakarta.annotation.Nullable Boolean slidingSchedule) {
    this.slidingSchedule = slidingSchedule;
  }

  public CreateBalanceLimitPayload transactionType(@jakarta.annotation.Nonnull TransactionTypeEnum transactionType) {
    
    this.transactionType = transactionType;
    return this;
  }

  /**
   * Specifies whether the limit applies to credit or debit transactions.
   * @return transactionType
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TRANSACTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TransactionTypeEnum getTransactionType() {
    return transactionType;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransactionType(@jakarta.annotation.Nonnull TransactionTypeEnum transactionType) {
    this.transactionType = transactionType;
  }

  public CreateBalanceLimitPayload value(@jakarta.annotation.Nonnull Integer value) {
    
    this.value = value;
    return this;
  }

  /**
   * Maximum allowed value for the specified constraint type.
   * @return value
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValue(@jakarta.annotation.Nonnull Integer value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBalanceLimitPayload createBalanceLimitPayload = (CreateBalanceLimitPayload) o;
    return Objects.equals(this.constraintType, createBalanceLimitPayload.constraintType) &&
        Objects.equals(this.durationUnit, createBalanceLimitPayload.durationUnit) &&
        Objects.equals(this.durationValue, createBalanceLimitPayload.durationValue) &&
        Objects.equals(this.slidingSchedule, createBalanceLimitPayload.slidingSchedule) &&
        Objects.equals(this.transactionType, createBalanceLimitPayload.transactionType) &&
        Objects.equals(this.value, createBalanceLimitPayload.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constraintType, durationUnit, durationValue, slidingSchedule, transactionType, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBalanceLimitPayload {\n");
    sb.append("    constraintType: ").append(toIndentedString(constraintType)).append("\n");
    sb.append("    durationUnit: ").append(toIndentedString(durationUnit)).append("\n");
    sb.append("    durationValue: ").append(toIndentedString(durationValue)).append("\n");
    sb.append("    slidingSchedule: ").append(toIndentedString(slidingSchedule)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

    // add `constraintType` to the URL query string
    if (getConstraintType() != null) {
      try {
        joiner.add(String.format("%sconstraintType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConstraintType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `durationUnit` to the URL query string
    if (getDurationUnit() != null) {
      try {
        joiner.add(String.format("%sdurationUnit%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDurationUnit()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `durationValue` to the URL query string
    if (getDurationValue() != null) {
      try {
        joiner.add(String.format("%sdurationValue%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDurationValue()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `slidingSchedule` to the URL query string
    if (getSlidingSchedule() != null) {
      try {
        joiner.add(String.format("%sslidingSchedule%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSlidingSchedule()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `transactionType` to the URL query string
    if (getTransactionType() != null) {
      try {
        joiner.add(String.format("%stransactionType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTransactionType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `value` to the URL query string
    if (getValue() != null) {
      try {
        joiner.add(String.format("%svalue%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getValue()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

