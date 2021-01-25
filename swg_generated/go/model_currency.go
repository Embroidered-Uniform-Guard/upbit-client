/*
 * Upbit Open API
 *
 * ## REST API for Upbit Exchange - Base URL: [https://api.upbit.com] - Official Upbit API Documents: [https://docs.upbit.com] - Official Support email: [open-api@upbit.com] 
 *
 * API version: 1.0.0
 * Contact: ujhin942@gmail.com
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package swagger

// 화폐 정보
type Currency struct {
	// 화폐를 의미하는 영문 대문자 코드
	Code string `json:"code,omitempty"`
	// 해당 화폐의 출금 수수료
	WithdrawFee string `json:"withdraw_fee,omitempty"`
	// 화폐의 코인 여부
	IsCoin bool `json:"is_coin,omitempty"`
	// 해당 화폐의 지갑 상태
	WalletState string `json:"wallet_state,omitempty"`
	// 해당 화폐가 지원하는 입출금 정보
	WalletSupport []string `json:"wallet_support,omitempty"`
}