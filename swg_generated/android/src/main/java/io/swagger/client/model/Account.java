/**
 * Upbit Open API
 * ## REST API for Upbit Exchange - Base URL: [https://api.upbit.com] - Official Upbit API Documents: [https://docs.upbit.com] - Official Support email: [open-api@upbit.com] 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: ujhin942@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * 사용자의 계좌 정보
 **/
@ApiModel(description = "사용자의 계좌 정보")
public class Account {
  
  @SerializedName("currency")
  private String currency = null;
  @SerializedName("balance")
  private String balance = null;
  @SerializedName("locked")
  private String locked = null;
  @SerializedName("avg_buy_price")
  private String avgBuyPrice = null;
  @SerializedName("avg_buy_price_modified")
  private Boolean avgBuyPriceModified = null;
  @SerializedName("unit_currency")
  private String unitCurrency = null;

  /**
   * 화폐를 의미하는 영문 대문자 코드
   **/
  @ApiModelProperty(value = "화폐를 의미하는 영문 대문자 코드")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * 주문가능 금액/수량
   **/
  @ApiModelProperty(value = "주문가능 금액/수량")
  public String getBalance() {
    return balance;
  }
  public void setBalance(String balance) {
    this.balance = balance;
  }

  /**
   * 주문 중 묶여있는 금액/수량
   **/
  @ApiModelProperty(value = "주문 중 묶여있는 금액/수량")
  public String getLocked() {
    return locked;
  }
  public void setLocked(String locked) {
    this.locked = locked;
  }

  /**
   * 매수평균가
   **/
  @ApiModelProperty(value = "매수평균가")
  public String getAvgBuyPrice() {
    return avgBuyPrice;
  }
  public void setAvgBuyPrice(String avgBuyPrice) {
    this.avgBuyPrice = avgBuyPrice;
  }

  /**
   * 매수평균가 수정 여부
   **/
  @ApiModelProperty(value = "매수평균가 수정 여부")
  public Boolean getAvgBuyPriceModified() {
    return avgBuyPriceModified;
  }
  public void setAvgBuyPriceModified(Boolean avgBuyPriceModified) {
    this.avgBuyPriceModified = avgBuyPriceModified;
  }

  /**
   * 평단가 기준 화폐
   **/
  @ApiModelProperty(value = "평단가 기준 화폐")
  public String getUnitCurrency() {
    return unitCurrency;
  }
  public void setUnitCurrency(String unitCurrency) {
    this.unitCurrency = unitCurrency;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return (this.currency == null ? account.currency == null : this.currency.equals(account.currency)) &&
        (this.balance == null ? account.balance == null : this.balance.equals(account.balance)) &&
        (this.locked == null ? account.locked == null : this.locked.equals(account.locked)) &&
        (this.avgBuyPrice == null ? account.avgBuyPrice == null : this.avgBuyPrice.equals(account.avgBuyPrice)) &&
        (this.avgBuyPriceModified == null ? account.avgBuyPriceModified == null : this.avgBuyPriceModified.equals(account.avgBuyPriceModified)) &&
        (this.unitCurrency == null ? account.unitCurrency == null : this.unitCurrency.equals(account.unitCurrency));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.currency == null ? 0: this.currency.hashCode());
    result = 31 * result + (this.balance == null ? 0: this.balance.hashCode());
    result = 31 * result + (this.locked == null ? 0: this.locked.hashCode());
    result = 31 * result + (this.avgBuyPrice == null ? 0: this.avgBuyPrice.hashCode());
    result = 31 * result + (this.avgBuyPriceModified == null ? 0: this.avgBuyPriceModified.hashCode());
    result = 31 * result + (this.unitCurrency == null ? 0: this.unitCurrency.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  balance: ").append(balance).append("\n");
    sb.append("  locked: ").append(locked).append("\n");
    sb.append("  avgBuyPrice: ").append(avgBuyPrice).append("\n");
    sb.append("  avgBuyPriceModified: ").append(avgBuyPriceModified).append("\n");
    sb.append("  unitCurrency: ").append(unitCurrency).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
