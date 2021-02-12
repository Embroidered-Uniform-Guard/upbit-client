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
#include "SwaggerMarketInfo.h"

#include "SwaggerModule.h"
#include "SwaggerHelpers.h"

#include "Templates/SharedPointer.h"

namespace Swagger 
{

void SwaggerMarketInfo::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (Market.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("market")); WriteJsonValue(Writer, Market.GetValue());	
	}
	if (KoreanName.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("korean_name")); WriteJsonValue(Writer, KoreanName.GetValue());	
	}
	if (EnglishName.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("english_name")); WriteJsonValue(Writer, EnglishName.GetValue());	
	}
	if (MarketWarning.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("market_warning")); WriteJsonValue(Writer, MarketWarning.GetValue());	
	}
	Writer->WriteObjectEnd();
}

bool SwaggerMarketInfo::FromJson(const TSharedPtr<FJsonObject>& JsonObject)
{
	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(JsonObject, TEXT("market"), Market);
	ParseSuccess &= TryGetJsonValue(JsonObject, TEXT("korean_name"), KoreanName);
	ParseSuccess &= TryGetJsonValue(JsonObject, TEXT("english_name"), EnglishName);
	ParseSuccess &= TryGetJsonValue(JsonObject, TEXT("market_warning"), MarketWarning);

	return ParseSuccess;
}
}
