--[[
  Upbit Open API
 
  ## REST API for Upbit Exchange - Base URL: [https://api.upbit.com] - Official Upbit API Documents: [https://docs.upbit.com] - Official Support email: [open-api@upbit.com] 
 
  OpenAPI spec version: 1.0.0
  Contact: ujhin942@gmail.com
  Generated by: https://github.com/swagger-api/swagger-codegen.git
]]

-- market class
local market = {}
local market_mt = {
	__name = "market";
	__index = market;
}

local function cast_market(t)
	return setmetatable(t, market_mt)
end

local function new_market(id, name, order_types, order_sides, bid, ask, max_total, state)
	return cast_market({
		["id"] = id;
		["name"] = name;
		["order_types"] = order_types;
		["order_sides"] = order_sides;
		["bid"] = bid;
		["ask"] = ask;
		["max_total"] = max_total;
		["state"] = state;
	})
end

return {
	cast = cast_market;
	new = new_market;
}
