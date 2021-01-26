--[[
  Upbit Open API
 
  ## REST API for Upbit Exchange - Base URL: [https://api.upbit.com] - Official Upbit API Documents: [https://docs.upbit.com] - Official Support email: [open-api@upbit.com] 
 
  OpenAPI spec version: 1.0.0
  Contact: ujhin942@gmail.com
  Generated by: https://github.com/swagger-api/swagger-codegen.git
]]

-- bid_account class
local bid_account = {}
local bid_account_mt = {
	__name = "bid_account";
	__index = bid_account;
}

local function cast_bid_account(t)
	return setmetatable(t, bid_account_mt)
end

local function new_bid_account(currency, balance, locked, avg_buy_price, avg_buy_price_modified, unit_currency)
	return cast_bid_account({
		["currency"] = currency;
		["balance"] = balance;
		["locked"] = locked;
		["avg_buy_price"] = avg_buy_price;
		["avg_buy_price_modified"] = avg_buy_price_modified;
		["unit_currency"] = unit_currency;
	})
end

return {
	cast = cast_bid_account;
	new = new_bid_account;
}