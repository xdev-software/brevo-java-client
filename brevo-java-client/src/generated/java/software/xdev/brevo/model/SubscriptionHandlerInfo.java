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
import software.xdev.brevo.model.MemberContact;
import software.xdev.brevo.model.SubscriptionAttributedReward;
import software.xdev.brevo.model.SubscriptionBalances;
import software.xdev.brevo.model.SubscriptionTier;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * SubscriptionHandlerInfo
 */
@JsonPropertyOrder({
  SubscriptionHandlerInfo.JSON_PROPERTY_BALANCE,
  SubscriptionHandlerInfo.JSON_PROPERTY_MEMBERS,
  SubscriptionHandlerInfo.JSON_PROPERTY_REWARD,
  SubscriptionHandlerInfo.JSON_PROPERTY_TIER
})
@JsonTypeName("subscriptionHandlerInfo")
public class SubscriptionHandlerInfo {
  public static final String JSON_PROPERTY_BALANCE = "balance";
  @jakarta.annotation.Nullable
  private SubscriptionBalances balance;

  public static final String JSON_PROPERTY_MEMBERS = "members";
  @jakarta.annotation.Nullable
  private List<MemberContact> members = new ArrayList<>();

  public static final String JSON_PROPERTY_REWARD = "reward";
  @jakarta.annotation.Nullable
  private List<SubscriptionAttributedReward> reward = new ArrayList<>();

  public static final String JSON_PROPERTY_TIER = "tier";
  @jakarta.annotation.Nullable
  private List<SubscriptionTier> tier = new ArrayList<>();

  public SubscriptionHandlerInfo() {
  }

  public SubscriptionHandlerInfo balance(@jakarta.annotation.Nullable SubscriptionBalances balance) {
    
    this.balance = balance;
    return this;
  }

  /**
   * Balance details for the subscription.
   * @return balance
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionBalances getBalance() {
    return balance;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalance(@jakarta.annotation.Nullable SubscriptionBalances balance) {
    this.balance = balance;
  }

  public SubscriptionHandlerInfo members(@jakarta.annotation.Nullable List<MemberContact> members) {
    
    this.members = members;
    return this;
  }

  public SubscriptionHandlerInfo addMembersItem(MemberContact membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<>();
    }
    this.members.add(membersItem);
    return this;
  }

  /**
   * List of members associated with the subscription.
   * @return members
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MemberContact> getMembers() {
    return members;
  }


  @JsonProperty(JSON_PROPERTY_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMembers(@jakarta.annotation.Nullable List<MemberContact> members) {
    this.members = members;
  }

  public SubscriptionHandlerInfo reward(@jakarta.annotation.Nullable List<SubscriptionAttributedReward> reward) {
    
    this.reward = reward;
    return this;
  }

  public SubscriptionHandlerInfo addRewardItem(SubscriptionAttributedReward rewardItem) {
    if (this.reward == null) {
      this.reward = new ArrayList<>();
    }
    this.reward.add(rewardItem);
    return this;
  }

  /**
   * List of rewards associated with the subscription.
   * @return reward
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REWARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SubscriptionAttributedReward> getReward() {
    return reward;
  }


  @JsonProperty(JSON_PROPERTY_REWARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReward(@jakarta.annotation.Nullable List<SubscriptionAttributedReward> reward) {
    this.reward = reward;
  }

  public SubscriptionHandlerInfo tier(@jakarta.annotation.Nullable List<SubscriptionTier> tier) {
    
    this.tier = tier;
    return this;
  }

  public SubscriptionHandlerInfo addTierItem(SubscriptionTier tierItem) {
    if (this.tier == null) {
      this.tier = new ArrayList<>();
    }
    this.tier.add(tierItem);
    return this;
  }

  /**
   * List of tier assignments for the subscription.
   * @return tier
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SubscriptionTier> getTier() {
    return tier;
  }


  @JsonProperty(JSON_PROPERTY_TIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTier(@jakarta.annotation.Nullable List<SubscriptionTier> tier) {
    this.tier = tier;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionHandlerInfo subscriptionHandlerInfo = (SubscriptionHandlerInfo) o;
    return Objects.equals(this.balance, subscriptionHandlerInfo.balance) &&
        Objects.equals(this.members, subscriptionHandlerInfo.members) &&
        Objects.equals(this.reward, subscriptionHandlerInfo.reward) &&
        Objects.equals(this.tier, subscriptionHandlerInfo.tier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, members, reward, tier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionHandlerInfo {\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    reward: ").append(toIndentedString(reward)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
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

    // add `balance` to the URL query string
    if (getBalance() != null) {
      joiner.add(getBalance().toUrlQueryString(prefix + "balance" + suffix));
    }

    // add `members` to the URL query string
    if (getMembers() != null) {
      for (int i = 0; i < getMembers().size(); i++) {
        if (getMembers().get(i) != null) {
          joiner.add(getMembers().get(i).toUrlQueryString(String.format("%smembers%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `reward` to the URL query string
    if (getReward() != null) {
      for (int i = 0; i < getReward().size(); i++) {
        if (getReward().get(i) != null) {
          joiner.add(getReward().get(i).toUrlQueryString(String.format("%sreward%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `tier` to the URL query string
    if (getTier() != null) {
      for (int i = 0; i < getTier().size(); i++) {
        if (getTier().get(i) != null) {
          joiner.add(getTier().get(i).toUrlQueryString(String.format("%stier%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

