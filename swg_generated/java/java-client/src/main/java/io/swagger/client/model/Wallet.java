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
import java.math.BigDecimal;

/**
 * Wallet
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-22T16:02:42.285Z")
public class Wallet {
  @SerializedName("currency")
  private String currency = null;

  @SerializedName("wallet_state")
  private String walletState = null;

  @SerializedName("block_state")
  private String blockState = null;

  @SerializedName("block_height")
  private BigDecimal blockHeight = null;

  @SerializedName("block_updated_at")
  private String blockUpdatedAt = null;

  public Wallet currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * 화폐를 의미하는 영문 대문자 코드
   * @return currency
  **/
  @ApiModelProperty(example = "BTC", value = "화폐를 의미하는 영문 대문자 코드")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Wallet walletState(String walletState) {
    this.walletState = walletState;
    return this;
  }

   /**
   * 입출금 상태 - working : 입출금 가능 - withdraw_only : 출금만 가능 - deposit_only : 입금만 가능 - paused : 입출금 중단 - unsupported : 입출금 미지원 
   * @return walletState
  **/
  @ApiModelProperty(example = "working", value = "입출금 상태 - working : 입출금 가능 - withdraw_only : 출금만 가능 - deposit_only : 입금만 가능 - paused : 입출금 중단 - unsupported : 입출금 미지원 ")
  public String getWalletState() {
    return walletState;
  }

  public void setWalletState(String walletState) {
    this.walletState = walletState;
  }

  public Wallet blockState(String blockState) {
    this.blockState = blockState;
    return this;
  }

   /**
   * 블록 상태 - normal : 정상 - delayed : 지연 - inactive : 비활성 (점검 등) 
   * @return blockState
  **/
  @ApiModelProperty(example = "normal", value = "블록 상태 - normal : 정상 - delayed : 지연 - inactive : 비활성 (점검 등) ")
  public String getBlockState() {
    return blockState;
  }

  public void setBlockState(String blockState) {
    this.blockState = blockState;
  }

  public Wallet blockHeight(BigDecimal blockHeight) {
    this.blockHeight = blockHeight;
    return this;
  }

   /**
   * 블록 높이
   * @return blockHeight
  **/
  @ApiModelProperty(example = "637432.0", value = "블록 높이")
  public BigDecimal getBlockHeight() {
    return blockHeight;
  }

  public void setBlockHeight(BigDecimal blockHeight) {
    this.blockHeight = blockHeight;
  }

  public Wallet blockUpdatedAt(String blockUpdatedAt) {
    this.blockUpdatedAt = blockUpdatedAt;
    return this;
  }

   /**
   * 블록 갱신 시각
   * @return blockUpdatedAt
  **/
  @ApiModelProperty(example = "", value = "블록 갱신 시각")
  public String getBlockUpdatedAt() {
    return blockUpdatedAt;
  }

  public void setBlockUpdatedAt(String blockUpdatedAt) {
    this.blockUpdatedAt = blockUpdatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Wallet wallet = (Wallet) o;
    return Objects.equals(this.currency, wallet.currency) &&
        Objects.equals(this.walletState, wallet.walletState) &&
        Objects.equals(this.blockState, wallet.blockState) &&
        Objects.equals(this.blockHeight, wallet.blockHeight) &&
        Objects.equals(this.blockUpdatedAt, wallet.blockUpdatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, walletState, blockState, blockHeight, blockUpdatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Wallet {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    walletState: ").append(toIndentedString(walletState)).append("\n");
    sb.append("    blockState: ").append(toIndentedString(blockState)).append("\n");
    sb.append("    blockHeight: ").append(toIndentedString(blockHeight)).append("\n");
    sb.append("    blockUpdatedAt: ").append(toIndentedString(blockUpdatedAt)).append("\n");
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

