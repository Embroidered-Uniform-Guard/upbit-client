# Upbit Open API
#
# ## REST API for Upbit Exchange - Base URL: [https://api.upbit.com] - Official Upbit API Documents: [https://docs.upbit.com] - Official Support email: [open-api@upbit.com] 
#
# OpenAPI spec version: 1.0.0
# Contact: ujhin942@gmail.com
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' MemberLevel Class
#'
#' @field security_level 
#' @field fee_level 
#' @field email_verified 
#' @field identity_auth_verified 
#' @field bank_account_verified 
#' @field kakao_pay_auth_verified 
#' @field locked 
#' @field wallet_locked 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MemberLevel <- R6::R6Class(
  'MemberLevel',
  public = list(
    `security_level` = NULL,
    `fee_level` = NULL,
    `email_verified` = NULL,
    `identity_auth_verified` = NULL,
    `bank_account_verified` = NULL,
    `kakao_pay_auth_verified` = NULL,
    `locked` = NULL,
    `wallet_locked` = NULL,
    initialize = function(`security_level`, `fee_level`, `email_verified`, `identity_auth_verified`, `bank_account_verified`, `kakao_pay_auth_verified`, `locked`, `wallet_locked`){
      if (!missing(`security_level`)) {
        self$`security_level` <- `security_level`
      }
      if (!missing(`fee_level`)) {
        self$`fee_level` <- `fee_level`
      }
      if (!missing(`email_verified`)) {
        self$`email_verified` <- `email_verified`
      }
      if (!missing(`identity_auth_verified`)) {
        self$`identity_auth_verified` <- `identity_auth_verified`
      }
      if (!missing(`bank_account_verified`)) {
        self$`bank_account_verified` <- `bank_account_verified`
      }
      if (!missing(`kakao_pay_auth_verified`)) {
        self$`kakao_pay_auth_verified` <- `kakao_pay_auth_verified`
      }
      if (!missing(`locked`)) {
        self$`locked` <- `locked`
      }
      if (!missing(`wallet_locked`)) {
        self$`wallet_locked` <- `wallet_locked`
      }
    },
    toJSON = function() {
      MemberLevelObject <- list()
      if (!is.null(self$`security_level`)) {
        MemberLevelObject[['security_level']] <- self$`security_level`
      }
      if (!is.null(self$`fee_level`)) {
        MemberLevelObject[['fee_level']] <- self$`fee_level`
      }
      if (!is.null(self$`email_verified`)) {
        MemberLevelObject[['email_verified']] <- self$`email_verified`
      }
      if (!is.null(self$`identity_auth_verified`)) {
        MemberLevelObject[['identity_auth_verified']] <- self$`identity_auth_verified`
      }
      if (!is.null(self$`bank_account_verified`)) {
        MemberLevelObject[['bank_account_verified']] <- self$`bank_account_verified`
      }
      if (!is.null(self$`kakao_pay_auth_verified`)) {
        MemberLevelObject[['kakao_pay_auth_verified']] <- self$`kakao_pay_auth_verified`
      }
      if (!is.null(self$`locked`)) {
        MemberLevelObject[['locked']] <- self$`locked`
      }
      if (!is.null(self$`wallet_locked`)) {
        MemberLevelObject[['wallet_locked']] <- self$`wallet_locked`
      }

      MemberLevelObject
    },
    fromJSON = function(MemberLevelJson) {
      MemberLevelObject <- jsonlite::fromJSON(MemberLevelJson)
      if (!is.null(MemberLevelObject$`security_level`)) {
        self$`security_level` <- MemberLevelObject$`security_level`
      }
      if (!is.null(MemberLevelObject$`fee_level`)) {
        self$`fee_level` <- MemberLevelObject$`fee_level`
      }
      if (!is.null(MemberLevelObject$`email_verified`)) {
        self$`email_verified` <- MemberLevelObject$`email_verified`
      }
      if (!is.null(MemberLevelObject$`identity_auth_verified`)) {
        self$`identity_auth_verified` <- MemberLevelObject$`identity_auth_verified`
      }
      if (!is.null(MemberLevelObject$`bank_account_verified`)) {
        self$`bank_account_verified` <- MemberLevelObject$`bank_account_verified`
      }
      if (!is.null(MemberLevelObject$`kakao_pay_auth_verified`)) {
        self$`kakao_pay_auth_verified` <- MemberLevelObject$`kakao_pay_auth_verified`
      }
      if (!is.null(MemberLevelObject$`locked`)) {
        self$`locked` <- MemberLevelObject$`locked`
      }
      if (!is.null(MemberLevelObject$`wallet_locked`)) {
        self$`wallet_locked` <- MemberLevelObject$`wallet_locked`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "security_level": %s,
           "fee_level": %s,
           "email_verified": %s,
           "identity_auth_verified": %s,
           "bank_account_verified": %s,
           "kakao_pay_auth_verified": %s,
           "locked": %s,
           "wallet_locked": %s
        }',
        self$`security_level`,
        self$`fee_level`,
        self$`email_verified`,
        self$`identity_auth_verified`,
        self$`bank_account_verified`,
        self$`kakao_pay_auth_verified`,
        self$`locked`,
        self$`wallet_locked`
      )
    },
    fromJSONString = function(MemberLevelJson) {
      MemberLevelObject <- jsonlite::fromJSON(MemberLevelJson)
      self$`security_level` <- MemberLevelObject$`security_level`
      self$`fee_level` <- MemberLevelObject$`fee_level`
      self$`email_verified` <- MemberLevelObject$`email_verified`
      self$`identity_auth_verified` <- MemberLevelObject$`identity_auth_verified`
      self$`bank_account_verified` <- MemberLevelObject$`bank_account_verified`
      self$`kakao_pay_auth_verified` <- MemberLevelObject$`kakao_pay_auth_verified`
      self$`locked` <- MemberLevelObject$`locked`
      self$`wallet_locked` <- MemberLevelObject$`wallet_locked`
    }
  )
)
