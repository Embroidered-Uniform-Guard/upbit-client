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

type OrderInfo struct {
	// 주문의 고유 아이디
	Uuid string `json:"uuid,omitempty"`
	// 주문 종류
	Side string `json:"side,omitempty"`
	// 주문 방식
	OrdType string `json:"ord_type,omitempty"`
	// 주문 당시 화폐 가격
	Price string `json:"price,omitempty"`
	// 주문 상태
	State string `json:"state,omitempty"`
	// 마켓의 유일키
	Market string `json:"market,omitempty"`
	// 주문 생성 시간
	CreatedAt string `json:"created_at,omitempty"`
	// 사용자가 입력한 주문 양
	Volume string `json:"volume,omitempty"`
	// 체결 후 남은 주문 양
	RemainingVolume string `json:"remaining_volume,omitempty"`
	// 수수료로 예약된 비용
	ReservedFee string `json:"reserved_fee,omitempty"`
	// 남은 수수료
	RemainingFee string `json:"remaining_fee,omitempty"`
	// 사용된 수수료
	PaidFee string `json:"paid_fee,omitempty"`
	// 거래에 사용중인 비용
	Locked string `json:"locked,omitempty"`
	// 체결된 양
	ExecutedVolume string `json:"executed_volume,omitempty"`
	// 해당 주문에 걸린 체결 수
	TradesCount float32 `json:"trades_count,omitempty"`
	// 체결
	Trades []Trade `json:"trades,omitempty"`
}
