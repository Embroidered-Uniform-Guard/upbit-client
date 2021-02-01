#import <Foundation/Foundation.h>
#import "SWGError.h"
#import "SWGApi.h"

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



@interface SWGTradeApi: NSObject <SWGApi>

extern NSString* kSWGTradeApiErrorDomain;
extern NSInteger kSWGTradeApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(SWGApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// 시세 Ticker 조회
/// ## 현재가 정보 요청 당시 종목의 스냅샷을 반환한다. 
///
/// @param markets 반점으로 구분되는 마켓 코드 (ex. KRW-BTC, BTC-BCC) 
/// 
///  code:200 message:"OK",
///  code:400 message:"Status: Bad Request ",
///  code:401 message:"Status: Unauthorized ",
///  code:403 message:"Status: Forbidden ",
///  code:404 message:"Status: Not Found ",
///  code:500 message:"Status: Internal Server Error "
///
/// @return NSObject*
-(NSURLSessionTask*) tradeTickerWithMarkets: (NSString*) markets
    completionHandler: (void (^)(NSObject* output, NSError* error)) handler;


/// 시세 체결 조회
/// ## 최근 체결 내역 
///
/// @param market 마켓 코드 (ex. KRW-BTC, BTC-BCC) 
/// @param to 마지막 체결 시각. 형식 : &#x60;[HHmmss 또는 HH:mm:ss]&#x60;. 비워서 요청시 가장 최근 데이터  (optional)
/// @param count 체결 개수  (optional)
/// @param cursor 페이지네이션 커서 (sequentialId) &#x60;sequential_id&#x60; 필드는 체결의 유일성 판단을 위한 근거로 쓰일 수 있습니다. 하지만 체결의 순서를 보장하지는 못합니다.  (optional)
/// @param daysAgo 최근 체결 날짜 기준 7일 이내의 이전 데이터 조회 가능. 비워서 요청 시 가장 최근 체결 날짜 반환. (범위: 1 ~ 7)  (optional)
/// 
///  code:200 message:"OK",
///  code:400 message:"Status: Bad Request ",
///  code:401 message:"Status: Unauthorized ",
///  code:403 message:"Status: Forbidden ",
///  code:404 message:"Status: Not Found ",
///  code:500 message:"Status: Internal Server Error "
///
/// @return NSObject*
-(NSURLSessionTask*) tradeTicksWithMarket: (NSString*) market
    to: (NSString*) to
    count: (NSNumber*) count
    cursor: (NSString*) cursor
    daysAgo: (NSNumber*) daysAgo
    completionHandler: (void (^)(NSObject* output, NSError* error)) handler;



@end