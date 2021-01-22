/*
 * Upbit Open API
 * ## REST API for Upbit Exchange - Base URL: [https://api.upbit.com] - Official Upbit API Documents: [https://docs.upbit.com] - Official Support email: [open-api@upbit.com] 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: ujhin942@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.18
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/Error', 'model/NewOrder', 'model/Order', 'model/OrderChance', 'model/OrderInfo', 'model/Orderbook'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/Error'), require('../model/NewOrder'), require('../model/Order'), require('../model/OrderChance'), require('../model/OrderInfo'), require('../model/Orderbook'));
  } else {
    // Browser globals (root is window)
    if (!root.UpbitOpenApi) {
      root.UpbitOpenApi = {};
    }
    root.UpbitOpenApi.OrderApi = factory(root.UpbitOpenApi.ApiClient, root.UpbitOpenApi.Error, root.UpbitOpenApi.NewOrder, root.UpbitOpenApi.Order, root.UpbitOpenApi.OrderChance, root.UpbitOpenApi.OrderInfo, root.UpbitOpenApi.Orderbook);
  }
}(this, function(ApiClient, Error, NewOrder, Order, OrderChance, OrderInfo, Orderbook) {
  'use strict';

  /**
   * Order service.
   * @module api/OrderApi
   * @version 1.0.0
   */

  /**
   * Constructs a new OrderApi. 
   * @alias module:api/OrderApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the orderCancel operation.
     * @callback module:api/OrderApi~orderCancelCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Order} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * 주문 취소 접수
     * ## 주문 UUID를 통해 해당 주문에 대한 취소 접수를 한다.  **NOTE**: `uuid` 혹은 `identifier` 둘 중 하나의 값이 반드시 포함되어야 합니다. 
     * @param {Object} opts Optional parameters
     * @param {String} opts.uuid 취소할 주문의 UUID 
     * @param {String} opts.identifier 조회용 사용자 지정 값 
     * @param {module:api/OrderApi~orderCancelCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Order}
     */
    this.orderCancel = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'uuid': opts['uuid'],
        'identifier': opts['identifier'],
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['Bearer'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = Order;

      return this.apiClient.callApi(
        '/order', 'DELETE',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the orderChance operation.
     * @callback module:api/OrderApi~orderChanceCallback
     * @param {String} error Error message, if any.
     * @param {module:model/OrderChance} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * 주문 가능 정보
     * ## 마켓별 주문 가능 정보를 확인한다. 
     * @param {String} market Market ID 
     * @param {module:api/OrderApi~orderChanceCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/OrderChance}
     */
    this.orderChance = function(market, callback) {
      var postBody = null;

      // verify the required parameter 'market' is set
      if (market === undefined || market === null) {
        throw new Error("Missing the required parameter 'market' when calling orderChance");
      }


      var pathParams = {
      };
      var queryParams = {
        'market': market,
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['Bearer'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = OrderChance;

      return this.apiClient.callApi(
        '/orders/chance', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the orderInfo operation.
     * @callback module:api/OrderApi~orderInfoCallback
     * @param {String} error Error message, if any.
     * @param {module:model/OrderInfo} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * 개별 주문 조회
     * ## 주문 UUID를 통해 개별 주문건을 조회한다.  **NOTE**: `uuid` 혹은 `identifier` 둘 중 하나의 값이 반드시 포함되어야 합니다. 
     * @param {Object} opts Optional parameters
     * @param {String} opts.uuid 주문 UUID 
     * @param {String} opts.identifier 조회용 사용자 지정 값 
     * @param {module:api/OrderApi~orderInfoCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/OrderInfo}
     */
    this.orderInfo = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'uuid': opts['uuid'],
        'identifier': opts['identifier'],
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['Bearer'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = OrderInfo;

      return this.apiClient.callApi(
        '/order', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the orderInfoAll operation.
     * @callback module:api/OrderApi~orderInfoAllCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/Order>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * 주문 리스트 조회
     * ## 주문 리스트를 조회한다. 
     * @param {Object} opts Optional parameters
     * @param {String} opts.market 마켓 아이디 
     * @param {String} opts.state 주문 상태   - wait : 체결 대기 (default)   - done : 전체 체결 완료   - cancel : 주문 취소 
     * @param {Array.<String>} opts.states 주문 상태의 목록 
     * @param {Array.<String>} opts.uuids 주문 UUID의 목록 
     * @param {Array.<String>} opts.identifiers 주문 identifier의 목록 
     * @param {Number} opts.page 페이지 수, default: 1 
     * @param {Number} opts.limit 요청 개수, default: 100 
     * @param {String} opts.orderBy 정렬 방식 - asc : 오름차순 - desc : 내림차순 (default) 
     * @param {module:api/OrderApi~orderInfoAllCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/Order>}
     */
    this.orderInfoAll = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'market': opts['market'],
        'state': opts['state'],
        'page': opts['page'],
        'limit': opts['limit'],
        'order_by': opts['orderBy'],
      };
      var collectionQueryParams = {
        'states': {
          value: opts['states'],
          collectionFormat: 'multi'
        },
        'uuids': {
          value: opts['uuids'],
          collectionFormat: 'multi'
        },
        'identifiers': {
          value: opts['identifiers'],
          collectionFormat: 'multi'
        },
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['Bearer'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = [Order];

      return this.apiClient.callApi(
        '/orders', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the orderNew operation.
     * @callback module:api/OrderApi~orderNewCallback
     * @param {String} error Error message, if any.
     * @param {module:model/NewOrder} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * 주문하기
     * ## 주문 요청을 한다.  **NOTE**: 원화 마켓 가격 단위를 확인하세요.  원화 마켓에서 주문을 요청 할 경우, [원화 마켓 주문 가격 단위](https://docs.upbit.com/docs/market-info-trade-price-detail)를 확인하여 값을 입력해주세요.  **NOTE**: identifier 파라미터 사용  `identifier`는 서비스에서 발급하는 `uuid`가 아닌 이용자가 직접 발급하는 키값으로, 주문을 조회하기 위해 할당하는 값입니다. 해당 값은 사용자의 전체 주문 내 유일한 값을 전달해야하며, 비록 주문 요청시 오류가 발생하더라도 같은 값으로 다시 요청을 보낼 수 없습니다.  주문의 성공 / 실패 여부와 관계없이 중복해서 들어온 `identifier` 값에서는 중복 오류가 발생하니, 매 요청시 새로운 값을 생성해주세요.  **NOTE**: 시장가 주문  시장가 주문은 `ord_type` 필드를 `price` or `market` 으로 설정해야됩니다. 매수 주문의 경우 `ord_type`을 `price`로 설정하고 `volume`을 `null` 혹은 제외해야됩니다. 매도 주문의 경우 `ord_type`을 `market`로 설정하고 `price`을 `null` 혹은 제외해야됩니다. 
     * @param {String} market 마켓 ID (필수) 
     * @param {String} side 주문 종류 (필수) - bid : 매수 - ask : 매도 
     * @param {String} ordType 주문 타입 (필수) - limit : 지정가 주문 - price : 시장가 주문(매수) - market : 시장가 주문(매도) 
     * @param {Object} opts Optional parameters
     * @param {String} opts.volume 주문량 (지정가, 시장가 매도 시 필수) 
     * @param {String} opts.price 주문 가격. (지정가, 시장가 매수 시 필수)  ex) KRW-BTC 마켓에서 1BTC당 1,000 KRW로 거래할 경우, 값은 1000 이 된다. ex) KRW-BTC 마켓에서 1BTC당 매도 1호가가 500 KRW 인 경우, 시장가 매수 시 값을 1000으로 세팅하면 2BTC가 매수된다. (수수료가 존재하거나 매도 1호가의 수량에 따라 상이할 수 있음) 
     * @param {String} opts.identifier 조회용 사용자 지정값 (선택) 
     * @param {module:api/OrderApi~orderNewCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/NewOrder}
     */
    this.orderNew = function(market, side, ordType, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'market' is set
      if (market === undefined || market === null) {
        throw new Error("Missing the required parameter 'market' when calling orderNew");
      }

      // verify the required parameter 'side' is set
      if (side === undefined || side === null) {
        throw new Error("Missing the required parameter 'side' when calling orderNew");
      }

      // verify the required parameter 'ordType' is set
      if (ordType === undefined || ordType === null) {
        throw new Error("Missing the required parameter 'ordType' when calling orderNew");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
        'market': market,
        'side': side,
        'volume': opts['volume'],
        'price': opts['price'],
        'ord_type': ordType,
        'identifier': opts['identifier']
      };

      var authNames = ['Bearer'];
      var contentTypes = ['application/x-www-form-urlencoded', 'multipart/form-data', 'application/json'];
      var accepts = ['application/json'];
      var returnType = NewOrder;

      return this.apiClient.callApi(
        '/orders', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the orderOrderbook operation.
     * @callback module:api/OrderApi~orderOrderbookCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/Orderbook>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * 시세 호가 정보(Orderbook) 조회
     * ## 호가 정보 조회 
     * @param {Array.<String>} markets 마켓 코드 목록 (ex. KRW-BTC,KRW-ADA) 
     * @param {module:api/OrderApi~orderOrderbookCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/Orderbook>}
     */
    this.orderOrderbook = function(markets, callback) {
      var postBody = null;

      // verify the required parameter 'markets' is set
      if (markets === undefined || markets === null) {
        throw new Error("Missing the required parameter 'markets' when calling orderOrderbook");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
        'markets': {
          value: markets,
          collectionFormat: 'multi'
        },
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['Bearer'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = [Orderbook];

      return this.apiClient.callApi(
        '/orderbook', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
