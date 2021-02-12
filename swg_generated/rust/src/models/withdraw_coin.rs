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
pub struct WithdrawCoin {
  /// 입출금 종류
  #[serde(rename = "type")]
  _type: Option<String>,
  /// 출금의 고유 아이디
  #[serde(rename = "uuid")]
  uuid: Option<String>,
  /// 화폐를 의미하는 영문 대문자 코드
  #[serde(rename = "currency")]
  currency: Option<String>,
  /// 출금의 트랜잭션 아이디
  #[serde(rename = "txid")]
  txid: Option<String>,
  /// 출금 상태
  #[serde(rename = "state")]
  state: Option<String>,
  /// 출금 생성 시간
  #[serde(rename = "created_at")]
  created_at: Option<String>,
  /// 출금 완료 시간
  #[serde(rename = "done_at")]
  done_at: Option<String>,
  /// 출금 금액/수량
  #[serde(rename = "amount")]
  amount: Option<String>,
  /// 출금 수수료
  #[serde(rename = "fee")]
  fee: Option<String>,
  /// 원화 환산 가격
  #[serde(rename = "krw_amount")]
  krw_amount: Option<String>,
  /// 출금 유형 - default : 일반출금 - internal : 바로출금  String 
  #[serde(rename = "transaction_type")]
  transaction_type: Option<String>
}

impl WithdrawCoin {
  pub fn new() -> WithdrawCoin {
    WithdrawCoin {
      _type: None,
      uuid: None,
      currency: None,
      txid: None,
      state: None,
      created_at: None,
      done_at: None,
      amount: None,
      fee: None,
      krw_amount: None,
      transaction_type: None
    }
  }

  pub fn set__type(&mut self, _type: String) {
    self._type = Some(_type);
  }

  pub fn with__type(mut self, _type: String) -> WithdrawCoin {
    self._type = Some(_type);
    self
  }

  pub fn _type(&self) -> Option<&String> {
    self._type.as_ref()
  }

  pub fn reset__type(&mut self) {
    self._type = None;
  }

  pub fn set_uuid(&mut self, uuid: String) {
    self.uuid = Some(uuid);
  }

  pub fn with_uuid(mut self, uuid: String) -> WithdrawCoin {
    self.uuid = Some(uuid);
    self
  }

  pub fn uuid(&self) -> Option<&String> {
    self.uuid.as_ref()
  }

  pub fn reset_uuid(&mut self) {
    self.uuid = None;
  }

  pub fn set_currency(&mut self, currency: String) {
    self.currency = Some(currency);
  }

  pub fn with_currency(mut self, currency: String) -> WithdrawCoin {
    self.currency = Some(currency);
    self
  }

  pub fn currency(&self) -> Option<&String> {
    self.currency.as_ref()
  }

  pub fn reset_currency(&mut self) {
    self.currency = None;
  }

  pub fn set_txid(&mut self, txid: String) {
    self.txid = Some(txid);
  }

  pub fn with_txid(mut self, txid: String) -> WithdrawCoin {
    self.txid = Some(txid);
    self
  }

  pub fn txid(&self) -> Option<&String> {
    self.txid.as_ref()
  }

  pub fn reset_txid(&mut self) {
    self.txid = None;
  }

  pub fn set_state(&mut self, state: String) {
    self.state = Some(state);
  }

  pub fn with_state(mut self, state: String) -> WithdrawCoin {
    self.state = Some(state);
    self
  }

  pub fn state(&self) -> Option<&String> {
    self.state.as_ref()
  }

  pub fn reset_state(&mut self) {
    self.state = None;
  }

  pub fn set_created_at(&mut self, created_at: String) {
    self.created_at = Some(created_at);
  }

  pub fn with_created_at(mut self, created_at: String) -> WithdrawCoin {
    self.created_at = Some(created_at);
    self
  }

  pub fn created_at(&self) -> Option<&String> {
    self.created_at.as_ref()
  }

  pub fn reset_created_at(&mut self) {
    self.created_at = None;
  }

  pub fn set_done_at(&mut self, done_at: String) {
    self.done_at = Some(done_at);
  }

  pub fn with_done_at(mut self, done_at: String) -> WithdrawCoin {
    self.done_at = Some(done_at);
    self
  }

  pub fn done_at(&self) -> Option<&String> {
    self.done_at.as_ref()
  }

  pub fn reset_done_at(&mut self) {
    self.done_at = None;
  }

  pub fn set_amount(&mut self, amount: String) {
    self.amount = Some(amount);
  }

  pub fn with_amount(mut self, amount: String) -> WithdrawCoin {
    self.amount = Some(amount);
    self
  }

  pub fn amount(&self) -> Option<&String> {
    self.amount.as_ref()
  }

  pub fn reset_amount(&mut self) {
    self.amount = None;
  }

  pub fn set_fee(&mut self, fee: String) {
    self.fee = Some(fee);
  }

  pub fn with_fee(mut self, fee: String) -> WithdrawCoin {
    self.fee = Some(fee);
    self
  }

  pub fn fee(&self) -> Option<&String> {
    self.fee.as_ref()
  }

  pub fn reset_fee(&mut self) {
    self.fee = None;
  }

  pub fn set_krw_amount(&mut self, krw_amount: String) {
    self.krw_amount = Some(krw_amount);
  }

  pub fn with_krw_amount(mut self, krw_amount: String) -> WithdrawCoin {
    self.krw_amount = Some(krw_amount);
    self
  }

  pub fn krw_amount(&self) -> Option<&String> {
    self.krw_amount.as_ref()
  }

  pub fn reset_krw_amount(&mut self) {
    self.krw_amount = None;
  }

  pub fn set_transaction_type(&mut self, transaction_type: String) {
    self.transaction_type = Some(transaction_type);
  }

  pub fn with_transaction_type(mut self, transaction_type: String) -> WithdrawCoin {
    self.transaction_type = Some(transaction_type);
    self
  }

  pub fn transaction_type(&self) -> Option<&String> {
    self.transaction_type.as_ref()
  }

  pub fn reset_transaction_type(&mut self) {
    self.transaction_type = None;
  }

}



