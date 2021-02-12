--[[
  Upbit Open API
 
  ## REST API for Upbit Exchange - Base URL: [https://api.upbit.com] - Official Upbit API Documents: [https://docs.upbit.com] - Official Support email: [open-api@upbit.com] 
 
  OpenAPI spec version: 1.0.0
  Contact: ujhin942@gmail.com
  Generated by: https://github.com/swagger-api/swagger-codegen.git
]]

-- deposit class
local deposit = {}
local deposit_mt = {
	__name = "deposit";
	__index = deposit;
}

local function cast_deposit(t)
	return setmetatable(t, deposit_mt)
end

local function new_deposit(type, uuid, currency, txid, state, created_at, done_at, amount, fee, transaction_type)
	return cast_deposit({
		["type"] = type;
		["uuid"] = uuid;
		["currency"] = currency;
		["txid"] = txid;
		["state"] = state;
		["created_at"] = created_at;
		["done_at"] = done_at;
		["amount"] = amount;
		["fee"] = fee;
		["transaction_type"] = transaction_type;
	})
end

return {
	cast = cast_deposit;
	new = new_deposit;
}
