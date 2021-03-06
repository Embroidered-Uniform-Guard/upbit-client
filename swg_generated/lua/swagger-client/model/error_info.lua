--[[
  Upbit Open API
 
  ## REST API for Upbit Exchange - Base URL: [https://api.upbit.com] - Official Upbit API Documents: [https://docs.upbit.com] - Official Support email: [open-api@upbit.com] 
 
  OpenAPI spec version: 1.0.0
  Contact: ujhin942@gmail.com
  Generated by: https://github.com/swagger-api/swagger-codegen.git
]]

-- error_info class
local error_info = {}
local error_info_mt = {
	__name = "error_info";
	__index = error_info;
}

local function cast_error_info(t)
	return setmetatable(t, error_info_mt)
end

local function new_error_info(message, name)
	return cast_error_info({
		["message"] = message;
		["name"] = name;
	})
end

return {
	cast = cast_error_info;
	new = new_error_info;
}
