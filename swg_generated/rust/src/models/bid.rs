/* 
 * Upbit Open API
 *
 * ## REST API for Upbit Exchange - Base URL: [https://api.upbit.com] - Official Upbit API Documents: [https://docs.upbit.com] - Official Support email: [open-api@upbit.com] 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: ujhin942@gmail.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

/// Bid : 매수 시 제약사항

#[allow(unused_imports)]
use serde_json::Value;

#[derive(Debug, Serialize, Deserialize)]
pub struct Bid {
  /// 화폐를 의미하는 영문 대문자 코드
  #[serde(rename = "currency")]
  currency: Option<String>,
  /// 주문금액 단위
  #[serde(rename = "price_unit")]
  price_unit: Option<String>,
  /// 최소 매도/매수 금액
  #[serde(rename = "min_total")]
  min_total: Option<f32>
}

impl Bid {
  /// 매수 시 제약사항
  pub fn new() -> Bid {
    Bid {
      currency: None,
      price_unit: None,
      min_total: None
    }
  }

  pub fn set_currency(&mut self, currency: String) {
    self.currency = Some(currency);
  }

  pub fn with_currency(mut self, currency: String) -> Bid {
    self.currency = Some(currency);
    self
  }

  pub fn currency(&self) -> Option<&String> {
    self.currency.as_ref()
  }

  pub fn reset_currency(&mut self) {
    self.currency = None;
  }

  pub fn set_price_unit(&mut self, price_unit: String) {
    self.price_unit = Some(price_unit);
  }

  pub fn with_price_unit(mut self, price_unit: String) -> Bid {
    self.price_unit = Some(price_unit);
    self
  }

  pub fn price_unit(&self) -> Option<&String> {
    self.price_unit.as_ref()
  }

  pub fn reset_price_unit(&mut self) {
    self.price_unit = None;
  }

  pub fn set_min_total(&mut self, min_total: f32) {
    self.min_total = Some(min_total);
  }

  pub fn with_min_total(mut self, min_total: f32) -> Bid {
    self.min_total = Some(min_total);
    self
  }

  pub fn min_total(&self) -> Option<&f32> {
    self.min_total.as_ref()
  }

  pub fn reset_min_total(&mut self) {
    self.min_total = None;
  }

}



