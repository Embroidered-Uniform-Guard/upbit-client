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

import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CandleMinutes {
  
  @SerializedName("market")
  private String market = null;
  @SerializedName("candle_date_time_utc")
  private String candleDateTimeUtc = null;
  @SerializedName("candle_date_time_kst")
  private String candleDateTimeKst = null;
  @SerializedName("opening_price")
  private Double openingPrice = null;
  @SerializedName("high_price")
  private Double highPrice = null;
  @SerializedName("low_price")
  private Double lowPrice = null;
  @SerializedName("trade_price")
  private Double tradePrice = null;
  @SerializedName("timestamp")
  private BigDecimal timestamp = null;
  @SerializedName("candle_acc_trade_price")
  private Double candleAccTradePrice = null;
  @SerializedName("candle_acc_trade_volume")
  private Double candleAccTradeVolume = null;
  @SerializedName("unit")
  private BigDecimal unit = null;

  /**
   * 마켓명
   **/
  @ApiModelProperty(value = "마켓명")
  public String getMarket() {
    return market;
  }
  public void setMarket(String market) {
    this.market = market;
  }

  /**
   * 캔들 기준 시각 (UTC 기준)
   **/
  @ApiModelProperty(value = "캔들 기준 시각 (UTC 기준)")
  public String getCandleDateTimeUtc() {
    return candleDateTimeUtc;
  }
  public void setCandleDateTimeUtc(String candleDateTimeUtc) {
    this.candleDateTimeUtc = candleDateTimeUtc;
  }

  /**
   * 캔들 기준 시각 (KST 기준)
   **/
  @ApiModelProperty(value = "캔들 기준 시각 (KST 기준)")
  public String getCandleDateTimeKst() {
    return candleDateTimeKst;
  }
  public void setCandleDateTimeKst(String candleDateTimeKst) {
    this.candleDateTimeKst = candleDateTimeKst;
  }

  /**
   * 시가
   **/
  @ApiModelProperty(value = "시가")
  public Double getOpeningPrice() {
    return openingPrice;
  }
  public void setOpeningPrice(Double openingPrice) {
    this.openingPrice = openingPrice;
  }

  /**
   * 고가
   **/
  @ApiModelProperty(value = "고가")
  public Double getHighPrice() {
    return highPrice;
  }
  public void setHighPrice(Double highPrice) {
    this.highPrice = highPrice;
  }

  /**
   * 저가
   **/
  @ApiModelProperty(value = "저가")
  public Double getLowPrice() {
    return lowPrice;
  }
  public void setLowPrice(Double lowPrice) {
    this.lowPrice = lowPrice;
  }

  /**
   * 종가
   **/
  @ApiModelProperty(value = "종가")
  public Double getTradePrice() {
    return tradePrice;
  }
  public void setTradePrice(Double tradePrice) {
    this.tradePrice = tradePrice;
  }

  /**
   * 해당 캔들에서 마지막 틱이 저장된 시각
   **/
  @ApiModelProperty(value = "해당 캔들에서 마지막 틱이 저장된 시각")
  public BigDecimal getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * 누적 거래 금액
   **/
  @ApiModelProperty(value = "누적 거래 금액")
  public Double getCandleAccTradePrice() {
    return candleAccTradePrice;
  }
  public void setCandleAccTradePrice(Double candleAccTradePrice) {
    this.candleAccTradePrice = candleAccTradePrice;
  }

  /**
   * 누적 거래량
   **/
  @ApiModelProperty(value = "누적 거래량")
  public Double getCandleAccTradeVolume() {
    return candleAccTradeVolume;
  }
  public void setCandleAccTradeVolume(Double candleAccTradeVolume) {
    this.candleAccTradeVolume = candleAccTradeVolume;
  }

  /**
   * 분 단위(유닛)
   **/
  @ApiModelProperty(value = "분 단위(유닛)")
  public BigDecimal getUnit() {
    return unit;
  }
  public void setUnit(BigDecimal unit) {
    this.unit = unit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CandleMinutes candleMinutes = (CandleMinutes) o;
    return (this.market == null ? candleMinutes.market == null : this.market.equals(candleMinutes.market)) &&
        (this.candleDateTimeUtc == null ? candleMinutes.candleDateTimeUtc == null : this.candleDateTimeUtc.equals(candleMinutes.candleDateTimeUtc)) &&
        (this.candleDateTimeKst == null ? candleMinutes.candleDateTimeKst == null : this.candleDateTimeKst.equals(candleMinutes.candleDateTimeKst)) &&
        (this.openingPrice == null ? candleMinutes.openingPrice == null : this.openingPrice.equals(candleMinutes.openingPrice)) &&
        (this.highPrice == null ? candleMinutes.highPrice == null : this.highPrice.equals(candleMinutes.highPrice)) &&
        (this.lowPrice == null ? candleMinutes.lowPrice == null : this.lowPrice.equals(candleMinutes.lowPrice)) &&
        (this.tradePrice == null ? candleMinutes.tradePrice == null : this.tradePrice.equals(candleMinutes.tradePrice)) &&
        (this.timestamp == null ? candleMinutes.timestamp == null : this.timestamp.equals(candleMinutes.timestamp)) &&
        (this.candleAccTradePrice == null ? candleMinutes.candleAccTradePrice == null : this.candleAccTradePrice.equals(candleMinutes.candleAccTradePrice)) &&
        (this.candleAccTradeVolume == null ? candleMinutes.candleAccTradeVolume == null : this.candleAccTradeVolume.equals(candleMinutes.candleAccTradeVolume)) &&
        (this.unit == null ? candleMinutes.unit == null : this.unit.equals(candleMinutes.unit));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.market == null ? 0: this.market.hashCode());
    result = 31 * result + (this.candleDateTimeUtc == null ? 0: this.candleDateTimeUtc.hashCode());
    result = 31 * result + (this.candleDateTimeKst == null ? 0: this.candleDateTimeKst.hashCode());
    result = 31 * result + (this.openingPrice == null ? 0: this.openingPrice.hashCode());
    result = 31 * result + (this.highPrice == null ? 0: this.highPrice.hashCode());
    result = 31 * result + (this.lowPrice == null ? 0: this.lowPrice.hashCode());
    result = 31 * result + (this.tradePrice == null ? 0: this.tradePrice.hashCode());
    result = 31 * result + (this.timestamp == null ? 0: this.timestamp.hashCode());
    result = 31 * result + (this.candleAccTradePrice == null ? 0: this.candleAccTradePrice.hashCode());
    result = 31 * result + (this.candleAccTradeVolume == null ? 0: this.candleAccTradeVolume.hashCode());
    result = 31 * result + (this.unit == null ? 0: this.unit.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CandleMinutes {\n");
    
    sb.append("  market: ").append(market).append("\n");
    sb.append("  candleDateTimeUtc: ").append(candleDateTimeUtc).append("\n");
    sb.append("  candleDateTimeKst: ").append(candleDateTimeKst).append("\n");
    sb.append("  openingPrice: ").append(openingPrice).append("\n");
    sb.append("  highPrice: ").append(highPrice).append("\n");
    sb.append("  lowPrice: ").append(lowPrice).append("\n");
    sb.append("  tradePrice: ").append(tradePrice).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("  candleAccTradePrice: ").append(candleAccTradePrice).append("\n");
    sb.append("  candleAccTradeVolume: ").append(candleAccTradeVolume).append("\n");
    sb.append("  unit: ").append(unit).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
