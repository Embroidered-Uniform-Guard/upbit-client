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
 * Order
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-22T16:02:42.285Z")
public class Order {
  @SerializedName("uuid")
  private String uuid = null;

  @SerializedName("side")
  private String side = null;

  @SerializedName("ord_type")
  private String ordType = null;

  @SerializedName("price")
  private String price = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("market")
  private String market = null;

  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("volume")
  private String volume = null;

  @SerializedName("remaining_volume")
  private String remainingVolume = null;

  @SerializedName("reserved_fee")
  private String reservedFee = null;

  @SerializedName("remaining_fee")
  private String remainingFee = null;

  @SerializedName("paid_fee")
  private String paidFee = null;

  @SerializedName("locked")
  private String locked = null;

  @SerializedName("executed_volume")
  private String executedVolume = null;

  @SerializedName("trades_count")
  private BigDecimal tradesCount = null;

  public Order uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * 주문의 고유 아이디
   * @return uuid
  **/
  @ApiModelProperty(example = "9ca023a5-851b-4fec-9f0a-48cd83c2eaae", value = "주문의 고유 아이디")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public Order side(String side) {
    this.side = side;
    return this;
  }

   /**
   * 주문 종류
   * @return side
  **/
  @ApiModelProperty(example = "ask", value = "주문 종류")
  public String getSide() {
    return side;
  }

  public void setSide(String side) {
    this.side = side;
  }

  public Order ordType(String ordType) {
    this.ordType = ordType;
    return this;
  }

   /**
   * 주문 방식
   * @return ordType
  **/
  @ApiModelProperty(example = "limit", value = "주문 방식")
  public String getOrdType() {
    return ordType;
  }

  public void setOrdType(String ordType) {
    this.ordType = ordType;
  }

  public Order price(String price) {
    this.price = price;
    return this;
  }

   /**
   * 주문 당시 화폐 가격
   * @return price
  **/
  @ApiModelProperty(example = "4280000", value = "주문 당시 화폐 가격")
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public Order state(String state) {
    this.state = state;
    return this;
  }

   /**
   * 주문 상태
   * @return state
  **/
  @ApiModelProperty(example = "done", value = "주문 상태")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Order market(String market) {
    this.market = market;
    return this;
  }

   /**
   * 마켓의 유일키
   * @return market
  **/
  @ApiModelProperty(example = "KRW-BTC", value = "마켓의 유일키")
  public String getMarket() {
    return market;
  }

  public void setMarket(String market) {
    this.market = market;
  }

  public Order createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * 주문 생성 시간
   * @return createdAt
  **/
  @ApiModelProperty(example = "", value = "주문 생성 시간")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Order volume(String volume) {
    this.volume = volume;
    return this;
  }

   /**
   * 사용자가 입력한 주문 양
   * @return volume
  **/
  @ApiModelProperty(example = "1", value = "사용자가 입력한 주문 양")
  public String getVolume() {
    return volume;
  }

  public void setVolume(String volume) {
    this.volume = volume;
  }

  public Order remainingVolume(String remainingVolume) {
    this.remainingVolume = remainingVolume;
    return this;
  }

   /**
   * 체결 후 남은 주문 양
   * @return remainingVolume
  **/
  @ApiModelProperty(example = "0", value = "체결 후 남은 주문 양")
  public String getRemainingVolume() {
    return remainingVolume;
  }

  public void setRemainingVolume(String remainingVolume) {
    this.remainingVolume = remainingVolume;
  }

  public Order reservedFee(String reservedFee) {
    this.reservedFee = reservedFee;
    return this;
  }

   /**
   * 수수료로 예약된 비용
   * @return reservedFee
  **/
  @ApiModelProperty(example = "0", value = "수수료로 예약된 비용")
  public String getReservedFee() {
    return reservedFee;
  }

  public void setReservedFee(String reservedFee) {
    this.reservedFee = reservedFee;
  }

  public Order remainingFee(String remainingFee) {
    this.remainingFee = remainingFee;
    return this;
  }

   /**
   * 남은 수수료
   * @return remainingFee
  **/
  @ApiModelProperty(example = "0", value = "남은 수수료")
  public String getRemainingFee() {
    return remainingFee;
  }

  public void setRemainingFee(String remainingFee) {
    this.remainingFee = remainingFee;
  }

  public Order paidFee(String paidFee) {
    this.paidFee = paidFee;
    return this;
  }

   /**
   * 사용된 수수료
   * @return paidFee
  **/
  @ApiModelProperty(example = "2140", value = "사용된 수수료")
  public String getPaidFee() {
    return paidFee;
  }

  public void setPaidFee(String paidFee) {
    this.paidFee = paidFee;
  }

  public Order locked(String locked) {
    this.locked = locked;
    return this;
  }

   /**
   * 거래에 사용중인 비용
   * @return locked
  **/
  @ApiModelProperty(example = "0", value = "거래에 사용중인 비용")
  public String getLocked() {
    return locked;
  }

  public void setLocked(String locked) {
    this.locked = locked;
  }

  public Order executedVolume(String executedVolume) {
    this.executedVolume = executedVolume;
    return this;
  }

   /**
   * 체결된 양
   * @return executedVolume
  **/
  @ApiModelProperty(example = "1", value = "체결된 양")
  public String getExecutedVolume() {
    return executedVolume;
  }

  public void setExecutedVolume(String executedVolume) {
    this.executedVolume = executedVolume;
  }

  public Order tradesCount(BigDecimal tradesCount) {
    this.tradesCount = tradesCount;
    return this;
  }

   /**
   * 해당 주문에 걸린 체결 수
   * @return tradesCount
  **/
  @ApiModelProperty(example = "1.0", value = "해당 주문에 걸린 체결 수")
  public BigDecimal getTradesCount() {
    return tradesCount;
  }

  public void setTradesCount(BigDecimal tradesCount) {
    this.tradesCount = tradesCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.uuid, order.uuid) &&
        Objects.equals(this.side, order.side) &&
        Objects.equals(this.ordType, order.ordType) &&
        Objects.equals(this.price, order.price) &&
        Objects.equals(this.state, order.state) &&
        Objects.equals(this.market, order.market) &&
        Objects.equals(this.createdAt, order.createdAt) &&
        Objects.equals(this.volume, order.volume) &&
        Objects.equals(this.remainingVolume, order.remainingVolume) &&
        Objects.equals(this.reservedFee, order.reservedFee) &&
        Objects.equals(this.remainingFee, order.remainingFee) &&
        Objects.equals(this.paidFee, order.paidFee) &&
        Objects.equals(this.locked, order.locked) &&
        Objects.equals(this.executedVolume, order.executedVolume) &&
        Objects.equals(this.tradesCount, order.tradesCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, side, ordType, price, state, market, createdAt, volume, remainingVolume, reservedFee, remainingFee, paidFee, locked, executedVolume, tradesCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    ordType: ").append(toIndentedString(ordType)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    market: ").append(toIndentedString(market)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    remainingVolume: ").append(toIndentedString(remainingVolume)).append("\n");
    sb.append("    reservedFee: ").append(toIndentedString(reservedFee)).append("\n");
    sb.append("    remainingFee: ").append(toIndentedString(remainingFee)).append("\n");
    sb.append("    paidFee: ").append(toIndentedString(paidFee)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    executedVolume: ").append(toIndentedString(executedVolume)).append("\n");
    sb.append("    tradesCount: ").append(toIndentedString(tradesCount)).append("\n");
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

