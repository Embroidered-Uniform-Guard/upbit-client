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

// 출금 제약 정보
type WithdrawLimit struct {
	// 화폐를 의미하는 영문 대문자 코드
	Currency string `json:"currency,omitempty"`
	// 출금 최소 금액/수량
	Minimum string `json:"minimum,omitempty"`
	// 1회 출금 한도
	Onetime string `json:"onetime,omitempty"`
	// 1일 출금 한도
	Daily string `json:"daily,omitempty"`
	// 1일 잔여 출금 한도
	RemainingDaily string `json:"remaining_daily,omitempty"`
	// 통합 1일 잔여 출금 한도
	RemainingDailyKrw string `json:"remaining_daily_krw,omitempty"`
	// 출금 금액/수량 소수점 자리 수
	Fixed float32 `json:"fixed,omitempty"`
	// 출금 지원 여부
	CanWithdraw bool `json:"can_withdraw,omitempty"`
}
