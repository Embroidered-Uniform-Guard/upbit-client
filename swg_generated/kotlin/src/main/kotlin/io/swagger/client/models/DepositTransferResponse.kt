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
package io.swagger.client.models


/**
 * 
 * @param success 요청 성공 여부
 * @param message 요청 결과에 대한 메시지
 */
data class DepositTransferResponse (
    /* 요청 성공 여부 */
    val success: kotlin.Boolean? = null,
    /* 요청 결과에 대한 메시지 */
    val message: kotlin.String? = null
) {

}

