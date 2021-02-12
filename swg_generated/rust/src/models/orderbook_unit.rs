/* 
 * Upbit Open API
 *
 * ## REST API for Upbit Exchange - Base URL: [https://api.upbit.com] - Official Upbit API Documents: [https://docs.upbit.com] - Official Support email: [open-api@upbit.com] 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: ujhin942@gmail.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */


#[allow(unused_imports)]
use serde_json::Value;

#[derive(Debug, Serialize, Deserialize)]
pub struct OrderbookUnit {
  /// 매도호가
  #[serde(rename = "ask_price")]
  ask_price: Option<f64>,
  /// 매수호가
  #[serde(rename = "bid_price")]
  bid_price: Option<f64>,
  /// 매도 잔량
  #[serde(rename = "ask_size")]
  ask_size: Option<f64>,
  /// 매수 잔량
  #[serde(rename = "bid_size")]
  bid_size: Option<f64>
}

impl OrderbookUnit {
  pub fn new() -> OrderbookUnit {
    OrderbookUnit {
      ask_price: None,
      bid_price: None,
      ask_size: None,
      bid_size: None
    }
  }

  pub fn set_ask_price(&mut self, ask_price: f64) {
    self.ask_price = Some(ask_price);
  }

  pub fn with_ask_price(mut self, ask_price: f64) -> OrderbookUnit {
    self.ask_price = Some(ask_price);
    self
  }

  pub fn ask_price(&self) -> Option<&f64> {
    self.ask_price.as_ref()
  }

  pub fn reset_ask_price(&mut self) {
    self.ask_price = None;
  }

  pub fn set_bid_price(&mut self, bid_price: f64) {
    self.bid_price = Some(bid_price);
  }

  pub fn with_bid_price(mut self, bid_price: f64) -> OrderbookUnit {
    self.bid_price = Some(bid_price);
    self
  }

  pub fn bid_price(&self) -> Option<&f64> {
    self.bid_price.as_ref()
  }

  pub fn reset_bid_price(&mut self) {
    self.bid_price = None;
  }

  pub fn set_ask_size(&mut self, ask_size: f64) {
    self.ask_size = Some(ask_size);
  }

  pub fn with_ask_size(mut self, ask_size: f64) -> OrderbookUnit {
    self.ask_size = Some(ask_size);
    self
  }

  pub fn ask_size(&self) -> Option<&f64> {
    self.ask_size.as_ref()
  }

  pub fn reset_ask_size(&mut self) {
    self.ask_size = None;
  }

  pub fn set_bid_size(&mut self, bid_size: f64) {
    self.bid_size = Some(bid_size);
  }

  pub fn with_bid_size(mut self, bid_size: f64) -> OrderbookUnit {
    self.bid_size = Some(bid_size);
    self
  }

  pub fn bid_size(&self) -> Option<&f64> {
    self.bid_size.as_ref()
  }

  pub fn reset_bid_size(&mut self) {
    self.bid_size = None;
  }

}



