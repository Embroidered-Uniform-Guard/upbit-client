/*
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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 화폐 정보
 */
@ApiModel(description = "화폐 정보")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-22T16:02:42.285Z")
public class Currency {
  @SerializedName("code")
  private String code = null;

  @SerializedName("withdraw_fee")
  private String withdrawFee = null;

  @SerializedName("is_coin")
  private Boolean isCoin = null;

  @SerializedName("wallet_state")
  private String walletState = null;

  @SerializedName("wallet_support")
  private List<String> walletSupport = null;

  public Currency code(String code) {
    this.code = code;
    return this;
  }

   /**
   * 화폐를 의미하는 영문 대문자 코드
   * @return code
  **/
  @ApiModelProperty(example = "BTC", value = "화폐를 의미하는 영문 대문자 코드")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Currency withdrawFee(String withdrawFee) {
    this.withdrawFee = withdrawFee;
    return this;
  }

   /**
   * 해당 화폐의 출금 수수료
   * @return withdrawFee
  **/
  @ApiModelProperty(example = "5.0E-4", value = "해당 화폐의 출금 수수료")
  public String getWithdrawFee() {
    return withdrawFee;
  }

  public void setWithdrawFee(String withdrawFee) {
    this.withdrawFee = withdrawFee;
  }

  public Currency isCoin(Boolean isCoin) {
    this.isCoin = isCoin;
    return this;
  }

   /**
   * 화폐의 코인 여부
   * @return isCoin
  **/
  @ApiModelProperty(example = "true", value = "화폐의 코인 여부")
  public Boolean isIsCoin() {
    return isCoin;
  }

  public void setIsCoin(Boolean isCoin) {
    this.isCoin = isCoin;
  }

  public Currency walletState(String walletState) {
    this.walletState = walletState;
    return this;
  }

   /**
   * 해당 화폐의 지갑 상태
   * @return walletState
  **/
  @ApiModelProperty(example = "working", value = "해당 화폐의 지갑 상태")
  public String getWalletState() {
    return walletState;
  }

  public void setWalletState(String walletState) {
    this.walletState = walletState;
  }

  public Currency walletSupport(List<String> walletSupport) {
    this.walletSupport = walletSupport;
    return this;
  }

  public Currency addWalletSupportItem(String walletSupportItem) {
    if (this.walletSupport == null) {
      this.walletSupport = new ArrayList<String>();
    }
    this.walletSupport.add(walletSupportItem);
    return this;
  }

   /**
   * 해당 화폐가 지원하는 입출금 정보
   * @return walletSupport
  **/
  @ApiModelProperty(example = "[\"deposit\",\"withdraw\"]", value = "해당 화폐가 지원하는 입출금 정보")
  public List<String> getWalletSupport() {
    return walletSupport;
  }

  public void setWalletSupport(List<String> walletSupport) {
    this.walletSupport = walletSupport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Currency currency = (Currency) o;
    return Objects.equals(this.code, currency.code) &&
        Objects.equals(this.withdrawFee, currency.withdrawFee) &&
        Objects.equals(this.isCoin, currency.isCoin) &&
        Objects.equals(this.walletState, currency.walletState) &&
        Objects.equals(this.walletSupport, currency.walletSupport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, withdrawFee, isCoin, walletState, walletSupport);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Currency {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    withdrawFee: ").append(toIndentedString(withdrawFee)).append("\n");
    sb.append("    isCoin: ").append(toIndentedString(isCoin)).append("\n");
    sb.append("    walletState: ").append(toIndentedString(walletState)).append("\n");
    sb.append("    walletSupport: ").append(toIndentedString(walletSupport)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

