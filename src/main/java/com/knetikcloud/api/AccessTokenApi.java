/*
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com.
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.knetikcloud.api;

import com.knetikcloud.client.ApiCallback;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiResponse;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;
import com.knetikcloud.client.ProgressRequestBody;
import com.knetikcloud.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.knetikcloud.model.OAuth2Resource;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccessTokenApi {
    private ApiClient apiClient;

    public AccessTokenApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AccessTokenApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getOAuthToken
     * @param grantType Grant type (required)
     * @param clientId The id of the client (required)
     * @param clientSecret The secret key of the client.  Used only with a grant_type of client_credentials (optional)
     * @param username The username of the client. Used only with a grant_type of password (optional)
     * @param password The password of the client. Used only with a grant_type of password (optional)
     * @param token The 3rd party authentication token. Used only with a grant_type of facebook, google, etc (social plugins) (optional)
     * @param refreshToken The refresh token obtained during prior authentication. Used only with a grant_type of refresh_token (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOAuthTokenCall(String grantType, String clientId, String clientSecret, String username, String password, String token, String refreshToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/oauth/token";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (grantType != null)
        localVarFormParams.put("grant_type", grantType);
        if (clientId != null)
        localVarFormParams.put("client_id", clientId);
        if (clientSecret != null)
        localVarFormParams.put("client_secret", clientSecret);
        if (username != null)
        localVarFormParams.put("username", username);
        if (password != null)
        localVarFormParams.put("password", password);
        if (token != null)
        localVarFormParams.put("token", token);
        if (refreshToken != null)
        localVarFormParams.put("refresh_token", refreshToken);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getOAuthTokenValidateBeforeCall(String grantType, String clientId, String clientSecret, String username, String password, String token, String refreshToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'grantType' is set
        if (grantType == null) {
            throw new ApiException("Missing the required parameter 'grantType' when calling getOAuthToken(Async)");
        }
        
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling getOAuthToken(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getOAuthTokenCall(grantType, clientId, clientSecret, username, password, token, refreshToken, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get access token
     * 
     * @param grantType Grant type (required)
     * @param clientId The id of the client (required)
     * @param clientSecret The secret key of the client.  Used only with a grant_type of client_credentials (optional)
     * @param username The username of the client. Used only with a grant_type of password (optional)
     * @param password The password of the client. Used only with a grant_type of password (optional)
     * @param token The 3rd party authentication token. Used only with a grant_type of facebook, google, etc (social plugins) (optional)
     * @param refreshToken The refresh token obtained during prior authentication. Used only with a grant_type of refresh_token (optional)
     * @return OAuth2Resource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OAuth2Resource getOAuthToken(String grantType, String clientId, String clientSecret, String username, String password, String token, String refreshToken) throws ApiException {
        ApiResponse<OAuth2Resource> resp = getOAuthTokenWithHttpInfo(grantType, clientId, clientSecret, username, password, token, refreshToken);
        return resp.getData();
    }

    /**
     * Get access token
     * 
     * @param grantType Grant type (required)
     * @param clientId The id of the client (required)
     * @param clientSecret The secret key of the client.  Used only with a grant_type of client_credentials (optional)
     * @param username The username of the client. Used only with a grant_type of password (optional)
     * @param password The password of the client. Used only with a grant_type of password (optional)
     * @param token The 3rd party authentication token. Used only with a grant_type of facebook, google, etc (social plugins) (optional)
     * @param refreshToken The refresh token obtained during prior authentication. Used only with a grant_type of refresh_token (optional)
     * @return ApiResponse&lt;OAuth2Resource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OAuth2Resource> getOAuthTokenWithHttpInfo(String grantType, String clientId, String clientSecret, String username, String password, String token, String refreshToken) throws ApiException {
        com.squareup.okhttp.Call call = getOAuthTokenValidateBeforeCall(grantType, clientId, clientSecret, username, password, token, refreshToken, null, null);
        Type localVarReturnType = new TypeToken<OAuth2Resource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get access token (asynchronously)
     * 
     * @param grantType Grant type (required)
     * @param clientId The id of the client (required)
     * @param clientSecret The secret key of the client.  Used only with a grant_type of client_credentials (optional)
     * @param username The username of the client. Used only with a grant_type of password (optional)
     * @param password The password of the client. Used only with a grant_type of password (optional)
     * @param token The 3rd party authentication token. Used only with a grant_type of facebook, google, etc (social plugins) (optional)
     * @param refreshToken The refresh token obtained during prior authentication. Used only with a grant_type of refresh_token (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOAuthTokenAsync(String grantType, String clientId, String clientSecret, String username, String password, String token, String refreshToken, final ApiCallback<OAuth2Resource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOAuthTokenValidateBeforeCall(grantType, clientId, clientSecret, username, password, token, refreshToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OAuth2Resource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
