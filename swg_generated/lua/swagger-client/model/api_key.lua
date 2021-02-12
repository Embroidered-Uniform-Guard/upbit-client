--[[
  Upbit Open API
 
  ## REST API for Upbit Exchange - Base URL: [https://api.upbit.com] - Official Upbit API Documents: [https://docs.upbit.com] - Official Support email: [open-api@upbit.com] 
 
  OpenAPI spec version: 1.0.0
  Contact: ujhin942@gmail.com
  Generated by: https://github.com/swagger-api/swagger-codegen.git
]]

-- api_key class
local api_key = {}
local api_key_mt = {
	__name = "api_key";
	__index = api_key;
}

local function cast_api_key(t)
	return setmetatable(t, api_key_mt)
end

local function new_api_key(access_key, expire_at)
	return cast_api_key({
		["access_key"] = access_key;
		["expire_at"] = expire_at;
	})
end

return {
	cast = cast_api_key;
	new = new_api_key;
}
