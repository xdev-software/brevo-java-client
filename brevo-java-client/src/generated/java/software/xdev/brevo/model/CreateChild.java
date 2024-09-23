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
 * CreateChild
 */
@JsonPropertyOrder({
  CreateChild.JSON_PROPERTY_EMAIL,
  CreateChild.JSON_PROPERTY_FIRST_NAME,
  CreateChild.JSON_PROPERTY_LAST_NAME,
  CreateChild.JSON_PROPERTY_COMPANY_NAME,
  CreateChild.JSON_PROPERTY_PASSWORD,
  CreateChild.JSON_PROPERTY_LANGUAGE
})
@JsonTypeName("createChild")
public class CreateChild {
  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  private String lastName;

  public static final String JSON_PROPERTY_COMPANY_NAME = "companyName";
  private String companyName;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  /**
   * Language of the child account
   */
  public enum LanguageEnum {
    FR("fr"),
    
    ES("es"),
    
    PT("pt"),
    
    IT("it"),
    
    DE("de"),
    
    EN("en");

    private String value;

    LanguageEnum(String value) {
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
    public static LanguageEnum fromValue(String value) {
      for (LanguageEnum b : LanguageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private LanguageEnum language;

  public CreateChild() {
  }

  public CreateChild email(String email) {
    
    this.email = email;
    return this;
  }

  /**
   * Email address to create the child account
   * @return email
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmail(String email) {
    this.email = email;
  }

  public CreateChild firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

  /**
   * First name to use to create the child account
   * @return firstName
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFirstName() {
    return firstName;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public CreateChild lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name to use to create the child account
   * @return lastName
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLastName() {
    return lastName;
  }


  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public CreateChild companyName(String companyName) {
    
    this.companyName = companyName;
    return this;
  }

  /**
   * Company name to use to create the child account
   * @return companyName
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCompanyName() {
    return companyName;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public CreateChild password(String password) {
    
    this.password = password;
    return this;
  }

  /**
   * Password for the child account to login
   * @return password
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPassword(String password) {
    this.password = password;
  }

  public CreateChild language(LanguageEnum language) {
    
    this.language = language;
    return this;
  }

  /**
   * Language of the child account
   * @return language
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LanguageEnum getLanguage() {
    return language;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(LanguageEnum language) {
    this.language = language;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChild createChild = (CreateChild) o;
    return Objects.equals(this.email, createChild.email) &&
        Objects.equals(this.firstName, createChild.firstName) &&
        Objects.equals(this.lastName, createChild.lastName) &&
        Objects.equals(this.companyName, createChild.companyName) &&
        Objects.equals(this.password, createChild.password) &&
        Objects.equals(this.language, createChild.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, firstName, lastName, companyName, password, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChild {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    password: ").append("*").append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

    // add `firstName` to the URL query string
    if (getFirstName() != null) {
      try {
        joiner.add(String.format("%sfirstName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFirstName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `lastName` to the URL query string
    if (getLastName() != null) {
      try {
        joiner.add(String.format("%slastName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `companyName` to the URL query string
    if (getCompanyName() != null) {
      try {
        joiner.add(String.format("%scompanyName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCompanyName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `password` to the URL query string
    if (getPassword() != null) {
      try {
        joiner.add(String.format("%spassword%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPassword()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `language` to the URL query string
    if (getLanguage() != null) {
      try {
        joiner.add(String.format("%slanguage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLanguage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

