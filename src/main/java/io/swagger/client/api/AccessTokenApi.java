/**
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import io.swagger.client.model.OAuth2Resource;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class AccessTokenApi {
  String basePath = "https://sandbox.knetikcloud.com";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Get access token
  * 
   * @param grantType Grant type
   * @param clientId The id of the client
   * @param clientSecret The secret key of the client.  Used only with a grant_type of client_credentials
   * @param username The username of the client.  Used only with a grant_type of password
   * @param password The password of the client.  Used only with a grant_type of password
   * @return OAuth2Resource
  */
  public OAuth2Resource getOAuthToken (String grantType, String clientId, String clientSecret, String username, String password) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'grantType' is set
    if (grantType == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'grantType' when calling getOAuthToken",
        new ApiException(400, "Missing the required parameter 'grantType' when calling getOAuthToken"));
    }
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'clientId' when calling getOAuthToken",
        new ApiException(400, "Missing the required parameter 'clientId' when calling getOAuthToken"));
    }

    // create path and map variables
    String path = "/oauth/token";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      if (grantType != null) {
        localVarBuilder.addTextBody("grant_type", ApiInvoker.parameterToString(grantType), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (clientId != null) {
        localVarBuilder.addTextBody("client_id", ApiInvoker.parameterToString(clientId), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (clientSecret != null) {
        localVarBuilder.addTextBody("client_secret", ApiInvoker.parameterToString(clientSecret), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (username != null) {
        localVarBuilder.addTextBody("username", ApiInvoker.parameterToString(username), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      if (password != null) {
        localVarBuilder.addTextBody("password", ApiInvoker.parameterToString(password), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("grant_type", ApiInvoker.parameterToString(grantType));
      formParams.put("client_id", ApiInvoker.parameterToString(clientId));
      formParams.put("client_secret", ApiInvoker.parameterToString(clientSecret));
      formParams.put("username", ApiInvoker.parameterToString(username));
      formParams.put("password", ApiInvoker.parameterToString(password));
    }

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (OAuth2Resource) ApiInvoker.deserialize(localVarResponse, "", OAuth2Resource.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
       if (ex.getCause() instanceof VolleyError) {
         VolleyError volleyError = (VolleyError)ex.getCause();
         if (volleyError.networkResponse != null) {
           throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
         }
       }
       throw ex;
    } catch (TimeoutException ex) {
       throw ex;
    }
  }

      /**
   * Get access token
   * 
   * @param grantType Grant type   * @param clientId The id of the client   * @param clientSecret The secret key of the client.  Used only with a grant_type of client_credentials   * @param username The username of the client.  Used only with a grant_type of password   * @param password The password of the client.  Used only with a grant_type of password
  */
  public void getOAuthToken (String grantType, String clientId, String clientSecret, String username, String password, final Response.Listener<OAuth2Resource> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'grantType' is set
    if (grantType == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'grantType' when calling getOAuthToken",
         new ApiException(400, "Missing the required parameter 'grantType' when calling getOAuthToken"));
    }
    
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'clientId' when calling getOAuthToken",
         new ApiException(400, "Missing the required parameter 'clientId' when calling getOAuthToken"));
    }
    

    // create path and map variables
    String path = "/oauth/token".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (grantType != null) {
        localVarBuilder.addTextBody("grant_type", ApiInvoker.parameterToString(grantType), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (clientId != null) {
        localVarBuilder.addTextBody("client_id", ApiInvoker.parameterToString(clientId), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (clientSecret != null) {
        localVarBuilder.addTextBody("client_secret", ApiInvoker.parameterToString(clientSecret), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (username != null) {
        localVarBuilder.addTextBody("username", ApiInvoker.parameterToString(username), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (password != null) {
        localVarBuilder.addTextBody("password", ApiInvoker.parameterToString(password), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("grant_type", ApiInvoker.parameterToString(grantType));
formParams.put("client_id", ApiInvoker.parameterToString(clientId));
formParams.put("client_secret", ApiInvoker.parameterToString(clientSecret));
formParams.put("username", ApiInvoker.parameterToString(username));
formParams.put("password", ApiInvoker.parameterToString(password));
    }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((OAuth2Resource) ApiInvoker.deserialize(localVarResponse,  "", OAuth2Resource.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
