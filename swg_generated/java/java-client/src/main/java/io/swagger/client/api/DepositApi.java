/*
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


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.math.BigDecimal;
import io.swagger.client.model.Deposit;
import io.swagger.client.model.DepositCompleteResponse;
import io.swagger.client.model.DepositTransferResponse;
import io.swagger.client.model.Error;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DepositApi {
    private ApiClient apiClient;

    public DepositApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DepositApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for depositCoinAddress
     * @param currency Currency symbol  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call depositCoinAddressCall(String currency, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/deposits/coin_address";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Bearer" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call depositCoinAddressValidateBeforeCall(String currency, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'currency' is set
        if (currency == null) {
            throw new ApiException("Missing the required parameter 'currency' when calling depositCoinAddress(Async)");
        }
        

        com.squareup.okhttp.Call call = depositCoinAddressCall(currency, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 개별 입금 주소 조회
     * ## 개별 입금 주소 조회  **NOTE**: 입금 주소 조회 요청 API 유의사항  입금 주소 생성 요청 이후 아직 발급되지 않은 상태일 경우 deposit_address가 null일 수 있습니다. 
     * @param currency Currency symbol  (required)
     * @return DepositCompleteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DepositCompleteResponse depositCoinAddress(String currency) throws ApiException {
        ApiResponse<DepositCompleteResponse> resp = depositCoinAddressWithHttpInfo(currency);
        return resp.getData();
    }

    /**
     * 개별 입금 주소 조회
     * ## 개별 입금 주소 조회  **NOTE**: 입금 주소 조회 요청 API 유의사항  입금 주소 생성 요청 이후 아직 발급되지 않은 상태일 경우 deposit_address가 null일 수 있습니다. 
     * @param currency Currency symbol  (required)
     * @return ApiResponse&lt;DepositCompleteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DepositCompleteResponse> depositCoinAddressWithHttpInfo(String currency) throws ApiException {
        com.squareup.okhttp.Call call = depositCoinAddressValidateBeforeCall(currency, null, null);
        Type localVarReturnType = new TypeToken<DepositCompleteResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 개별 입금 주소 조회 (asynchronously)
     * ## 개별 입금 주소 조회  **NOTE**: 입금 주소 조회 요청 API 유의사항  입금 주소 생성 요청 이후 아직 발급되지 않은 상태일 경우 deposit_address가 null일 수 있습니다. 
     * @param currency Currency symbol  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call depositCoinAddressAsync(String currency, final ApiCallback<DepositCompleteResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = depositCoinAddressValidateBeforeCall(currency, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DepositCompleteResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for depositCoinAddresses
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call depositCoinAddressesCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/deposits/coin_addresses";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Bearer" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call depositCoinAddressesValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = depositCoinAddressesCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * 전체 입금 주소 조회
     * ## 내가 보유한 자산 리스트를 보여줍니다.  **NOTE**: 입금 주소 조회 요청 API 유의사항  입금 주소 생성 요청 이후 아직 발급되지 않은 상태일 경우 deposit_address가 null일 수 있습니다. 
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object depositCoinAddresses() throws ApiException {
        ApiResponse<Object> resp = depositCoinAddressesWithHttpInfo();
        return resp.getData();
    }

    /**
     * 전체 입금 주소 조회
     * ## 내가 보유한 자산 리스트를 보여줍니다.  **NOTE**: 입금 주소 조회 요청 API 유의사항  입금 주소 생성 요청 이후 아직 발급되지 않은 상태일 경우 deposit_address가 null일 수 있습니다. 
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> depositCoinAddressesWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = depositCoinAddressesValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 전체 입금 주소 조회 (asynchronously)
     * ## 내가 보유한 자산 리스트를 보여줍니다.  **NOTE**: 입금 주소 조회 요청 API 유의사항  입금 주소 생성 요청 이후 아직 발급되지 않은 상태일 경우 deposit_address가 null일 수 있습니다. 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call depositCoinAddressesAsync(final ApiCallback<Object> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = depositCoinAddressesValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for depositGenerateCoinAddress
     * @param currency Currency 코드  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call depositGenerateCoinAddressCall(String currency, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/deposits/generate_coin_address";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (currency != null)
        localVarFormParams.put("currency", currency);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Bearer" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call depositGenerateCoinAddressValidateBeforeCall(String currency, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'currency' is set
        if (currency == null) {
            throw new ApiException("Missing the required parameter 'currency' when calling depositGenerateCoinAddress(Async)");
        }
        

        com.squareup.okhttp.Call call = depositGenerateCoinAddressCall(currency, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 입금 주소 생성 요청
     * 입금 주소 생성을 요청한다.  **NOTE**: 입금 주소 생성 요청 API 유의사항  입금 주소의 생성은 서버에서 비동기적으로 이뤄집니다. 비동기적 생성 특성상 요청과 동시에 입금 주소가 발급되지 않을 수 있습니다. 주소 발급 요청 시 결과로 Response1이 반환되며 주소 발급 완료 이전까지 계속 Response1이 반환됩니다. 주소가 발급된 이후부터는 새로운 주소가 발급되는 것이 아닌 이전에 발급된 주소가 Response2 형태로 반환됩니다. 정상적으로 주소가 생성되지 않는다면 일정 시간 이후 해당 API를 다시 호출해주시길 부탁드립니다. 
     * @param currency Currency 코드  (required)
     * @return DepositCompleteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DepositCompleteResponse depositGenerateCoinAddress(String currency) throws ApiException {
        ApiResponse<DepositCompleteResponse> resp = depositGenerateCoinAddressWithHttpInfo(currency);
        return resp.getData();
    }

    /**
     * 입금 주소 생성 요청
     * 입금 주소 생성을 요청한다.  **NOTE**: 입금 주소 생성 요청 API 유의사항  입금 주소의 생성은 서버에서 비동기적으로 이뤄집니다. 비동기적 생성 특성상 요청과 동시에 입금 주소가 발급되지 않을 수 있습니다. 주소 발급 요청 시 결과로 Response1이 반환되며 주소 발급 완료 이전까지 계속 Response1이 반환됩니다. 주소가 발급된 이후부터는 새로운 주소가 발급되는 것이 아닌 이전에 발급된 주소가 Response2 형태로 반환됩니다. 정상적으로 주소가 생성되지 않는다면 일정 시간 이후 해당 API를 다시 호출해주시길 부탁드립니다. 
     * @param currency Currency 코드  (required)
     * @return ApiResponse&lt;DepositCompleteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DepositCompleteResponse> depositGenerateCoinAddressWithHttpInfo(String currency) throws ApiException {
        com.squareup.okhttp.Call call = depositGenerateCoinAddressValidateBeforeCall(currency, null, null);
        Type localVarReturnType = new TypeToken<DepositCompleteResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 입금 주소 생성 요청 (asynchronously)
     * 입금 주소 생성을 요청한다.  **NOTE**: 입금 주소 생성 요청 API 유의사항  입금 주소의 생성은 서버에서 비동기적으로 이뤄집니다. 비동기적 생성 특성상 요청과 동시에 입금 주소가 발급되지 않을 수 있습니다. 주소 발급 요청 시 결과로 Response1이 반환되며 주소 발급 완료 이전까지 계속 Response1이 반환됩니다. 주소가 발급된 이후부터는 새로운 주소가 발급되는 것이 아닌 이전에 발급된 주소가 Response2 형태로 반환됩니다. 정상적으로 주소가 생성되지 않는다면 일정 시간 이후 해당 API를 다시 호출해주시길 부탁드립니다. 
     * @param currency Currency 코드  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call depositGenerateCoinAddressAsync(String currency, final ApiCallback<DepositCompleteResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = depositGenerateCoinAddressValidateBeforeCall(currency, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DepositCompleteResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for depositInfo
     * @param uuid 입금 UUID  (optional)
     * @param txid 입금 TXID  (optional)
     * @param currency Currency 코드  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call depositInfoCall(String uuid, String txid, String currency, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/deposit";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (uuid != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("uuid", uuid));
        if (txid != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("txid", txid));
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Bearer" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call depositInfoValidateBeforeCall(String uuid, String txid, String currency, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = depositInfoCall(uuid, txid, currency, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 개별 입금 조회
     * ## 개별 입금 조회 
     * @param uuid 입금 UUID  (optional)
     * @param txid 입금 TXID  (optional)
     * @param currency Currency 코드  (optional)
     * @return Deposit
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Deposit depositInfo(String uuid, String txid, String currency) throws ApiException {
        ApiResponse<Deposit> resp = depositInfoWithHttpInfo(uuid, txid, currency);
        return resp.getData();
    }

    /**
     * 개별 입금 조회
     * ## 개별 입금 조회 
     * @param uuid 입금 UUID  (optional)
     * @param txid 입금 TXID  (optional)
     * @param currency Currency 코드  (optional)
     * @return ApiResponse&lt;Deposit&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Deposit> depositInfoWithHttpInfo(String uuid, String txid, String currency) throws ApiException {
        com.squareup.okhttp.Call call = depositInfoValidateBeforeCall(uuid, txid, currency, null, null);
        Type localVarReturnType = new TypeToken<Deposit>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 개별 입금 조회 (asynchronously)
     * ## 개별 입금 조회 
     * @param uuid 입금 UUID  (optional)
     * @param txid 입금 TXID  (optional)
     * @param currency Currency 코드  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call depositInfoAsync(String uuid, String txid, String currency, final ApiCallback<Deposit> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = depositInfoValidateBeforeCall(uuid, txid, currency, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Deposit>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for depositInfoAll
     * @param currency Currency 코드  (optional)
     * @param state 출금 상태 - submitting : 처리 중 - submitted : 처리완료 - almost_accepted : 입금 대기 중 - rejected : 거절 - accepted : 승인됨 - processing : 처리 중  (optional)
     * @param uuids 입금 UUID의 목록  (optional)
     * @param txids 입금 TXID의 목록  (optional)
     * @param limit 개수 제한 (default: 100, max: 100)  (optional)
     * @param page 페이지 수, default: 1  (optional)
     * @param orderBy 정렬 방식 - asc : 오름차순 - desc : 내림차순 (default)  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call depositInfoAllCall(String currency, String state, List<String> uuids, List<String> txids, BigDecimal limit, BigDecimal page, String orderBy, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/deposits";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (currency != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("currency", currency));
        if (state != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("state", state));
        if (uuids != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "uuids", uuids));
        if (txids != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "txids", txids));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (orderBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("order_by", orderBy));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Bearer" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call depositInfoAllValidateBeforeCall(String currency, String state, List<String> uuids, List<String> txids, BigDecimal limit, BigDecimal page, String orderBy, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = depositInfoAllCall(currency, state, uuids, txids, limit, page, orderBy, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 입금 리스트 조회
     * ## 입금 리스트 조회 
     * @param currency Currency 코드  (optional)
     * @param state 출금 상태 - submitting : 처리 중 - submitted : 처리완료 - almost_accepted : 입금 대기 중 - rejected : 거절 - accepted : 승인됨 - processing : 처리 중  (optional)
     * @param uuids 입금 UUID의 목록  (optional)
     * @param txids 입금 TXID의 목록  (optional)
     * @param limit 개수 제한 (default: 100, max: 100)  (optional)
     * @param page 페이지 수, default: 1  (optional)
     * @param orderBy 정렬 방식 - asc : 오름차순 - desc : 내림차순 (default)  (optional)
     * @return List&lt;Deposit&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Deposit> depositInfoAll(String currency, String state, List<String> uuids, List<String> txids, BigDecimal limit, BigDecimal page, String orderBy) throws ApiException {
        ApiResponse<List<Deposit>> resp = depositInfoAllWithHttpInfo(currency, state, uuids, txids, limit, page, orderBy);
        return resp.getData();
    }

    /**
     * 입금 리스트 조회
     * ## 입금 리스트 조회 
     * @param currency Currency 코드  (optional)
     * @param state 출금 상태 - submitting : 처리 중 - submitted : 처리완료 - almost_accepted : 입금 대기 중 - rejected : 거절 - accepted : 승인됨 - processing : 처리 중  (optional)
     * @param uuids 입금 UUID의 목록  (optional)
     * @param txids 입금 TXID의 목록  (optional)
     * @param limit 개수 제한 (default: 100, max: 100)  (optional)
     * @param page 페이지 수, default: 1  (optional)
     * @param orderBy 정렬 방식 - asc : 오름차순 - desc : 내림차순 (default)  (optional)
     * @return ApiResponse&lt;List&lt;Deposit&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Deposit>> depositInfoAllWithHttpInfo(String currency, String state, List<String> uuids, List<String> txids, BigDecimal limit, BigDecimal page, String orderBy) throws ApiException {
        com.squareup.okhttp.Call call = depositInfoAllValidateBeforeCall(currency, state, uuids, txids, limit, page, orderBy, null, null);
        Type localVarReturnType = new TypeToken<List<Deposit>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 입금 리스트 조회 (asynchronously)
     * ## 입금 리스트 조회 
     * @param currency Currency 코드  (optional)
     * @param state 출금 상태 - submitting : 처리 중 - submitted : 처리완료 - almost_accepted : 입금 대기 중 - rejected : 거절 - accepted : 승인됨 - processing : 처리 중  (optional)
     * @param uuids 입금 UUID의 목록  (optional)
     * @param txids 입금 TXID의 목록  (optional)
     * @param limit 개수 제한 (default: 100, max: 100)  (optional)
     * @param page 페이지 수, default: 1  (optional)
     * @param orderBy 정렬 방식 - asc : 오름차순 - desc : 내림차순 (default)  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call depositInfoAllAsync(String currency, String state, List<String> uuids, List<String> txids, BigDecimal limit, BigDecimal page, String orderBy, final ApiCallback<List<Deposit>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = depositInfoAllValidateBeforeCall(currency, state, uuids, txids, limit, page, orderBy, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Deposit>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
