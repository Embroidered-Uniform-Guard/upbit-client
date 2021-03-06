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
#include "SwaggerAPIKey.h"

#include "SwaggerModule.h"
#include "SwaggerHelpers.h"

#include "Templates/SharedPointer.h"

namespace Swagger 
{

void SwaggerAPIKey::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (AccessKey.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("access_key")); WriteJsonValue(Writer, AccessKey.GetValue());	
	}
	if (ExpireAt.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("expire_at")); WriteJsonValue(Writer, ExpireAt.GetValue());	
	}
	Writer->WriteObjectEnd();
}

bool SwaggerAPIKey::FromJson(const TSharedPtr<FJsonObject>& JsonObject)
{
	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(JsonObject, TEXT("access_key"), AccessKey);
	ParseSuccess &= TryGetJsonValue(JsonObject, TEXT("expire_at"), ExpireAt);

	return ParseSuccess;
}
}
