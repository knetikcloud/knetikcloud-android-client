/**
 * Knetik Platform API Documentation Latest
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: Latest
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

import io.swagger.client.model.PageUsageInfo;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ReportingUsageApi {
  String basePath = "https://localhost:8080/";
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
  * Returns aggregated endpoint usage information by the day
  * 
   * @param startDate The beginning of the range being requested, unix timestamp in seconds
   * @param endDate The ending of the range being requested, unix timestamp in seconds
   * @param combineEndpoints Whether to combine counts from different endpoint. Removes the url and method from the result object
   * @param size The number of objects returned per page
   * @param page The number of the page returned, starting with 1
   * @return PageUsageInfo
  */
  public PageUsageInfo getUsageByDayUsingGET (Long startDate, Long endDate, Boolean combineEndpoints, Integer size, Integer page) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'startDate' when calling getUsageByDayUsingGET",
        new ApiException(400, "Missing the required parameter 'startDate' when calling getUsageByDayUsingGET"));
    }
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'endDate' when calling getUsageByDayUsingGET",
        new ApiException(400, "Missing the required parameter 'endDate' when calling getUsageByDayUsingGET"));
    }

    // create path and map variables
    String path = "/reporting/usage/day".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "start_date", startDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "end_date", endDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "combine_endpoints", combineEndpoints));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "size", size));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "OAuth2" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (PageUsageInfo) ApiInvoker.deserialize(localVarResponse, "", PageUsageInfo.class);
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
   * Returns aggregated endpoint usage information by the day
   * 
   * @param startDate The beginning of the range being requested, unix timestamp in seconds   * @param endDate The ending of the range being requested, unix timestamp in seconds   * @param combineEndpoints Whether to combine counts from different endpoint. Removes the url and method from the result object   * @param size The number of objects returned per page   * @param page The number of the page returned, starting with 1
  */
  public void getUsageByDayUsingGET (Long startDate, Long endDate, Boolean combineEndpoints, Integer size, Integer page, final Response.Listener<PageUsageInfo> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'startDate' when calling getUsageByDayUsingGET",
         new ApiException(400, "Missing the required parameter 'startDate' when calling getUsageByDayUsingGET"));
    }
    
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'endDate' when calling getUsageByDayUsingGET",
         new ApiException(400, "Missing the required parameter 'endDate' when calling getUsageByDayUsingGET"));
    }
    

    // create path and map variables
    String path = "/reporting/usage/day".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "start_date", startDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "end_date", endDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "combine_endpoints", combineEndpoints));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "size", size));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));


    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] { "OAuth2" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((PageUsageInfo) ApiInvoker.deserialize(localVarResponse,  "", PageUsageInfo.class));
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
  /**
  * Returns aggregated endpoint usage information by hour
  * 
   * @param startDate The beginning of the range being requested, unix timestamp in seconds
   * @param endDate The ending of the range being requested, unix timestamp in seconds
   * @param combineEndpoints Whether to combine counts from different endpoint. Removes the url and method from the result object
   * @param size The number of objects returned per page
   * @param page The number of the page returned, starting with 1
   * @return PageUsageInfo
  */
  public PageUsageInfo getUsageByHourUsingGET (Long startDate, Long endDate, Boolean combineEndpoints, Integer size, Integer page) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'startDate' when calling getUsageByHourUsingGET",
        new ApiException(400, "Missing the required parameter 'startDate' when calling getUsageByHourUsingGET"));
    }
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'endDate' when calling getUsageByHourUsingGET",
        new ApiException(400, "Missing the required parameter 'endDate' when calling getUsageByHourUsingGET"));
    }

    // create path and map variables
    String path = "/reporting/usage/hour".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "start_date", startDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "end_date", endDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "combine_endpoints", combineEndpoints));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "size", size));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "OAuth2" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (PageUsageInfo) ApiInvoker.deserialize(localVarResponse, "", PageUsageInfo.class);
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
   * Returns aggregated endpoint usage information by hour
   * 
   * @param startDate The beginning of the range being requested, unix timestamp in seconds   * @param endDate The ending of the range being requested, unix timestamp in seconds   * @param combineEndpoints Whether to combine counts from different endpoint. Removes the url and method from the result object   * @param size The number of objects returned per page   * @param page The number of the page returned, starting with 1
  */
  public void getUsageByHourUsingGET (Long startDate, Long endDate, Boolean combineEndpoints, Integer size, Integer page, final Response.Listener<PageUsageInfo> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'startDate' when calling getUsageByHourUsingGET",
         new ApiException(400, "Missing the required parameter 'startDate' when calling getUsageByHourUsingGET"));
    }
    
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'endDate' when calling getUsageByHourUsingGET",
         new ApiException(400, "Missing the required parameter 'endDate' when calling getUsageByHourUsingGET"));
    }
    

    // create path and map variables
    String path = "/reporting/usage/hour".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "start_date", startDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "end_date", endDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "combine_endpoints", combineEndpoints));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "size", size));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));


    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] { "OAuth2" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((PageUsageInfo) ApiInvoker.deserialize(localVarResponse,  "", PageUsageInfo.class));
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
  /**
  * Returns aggregated endpoint usage information by minute
  * 
   * @param startDate The beginning of the range being requested, unix timestamp in seconds
   * @param endDate The ending of the range being requested, unix timestamp in seconds
   * @param combineEndpoints Whether to combine counts from different endpoint. Removes the url and method from the result object
   * @param size The number of objects returned per page
   * @param page The number of the page returned, starting with 1
   * @return PageUsageInfo
  */
  public PageUsageInfo getUsageByMinuteUsingGET (Long startDate, Long endDate, Boolean combineEndpoints, Integer size, Integer page) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'startDate' when calling getUsageByMinuteUsingGET",
        new ApiException(400, "Missing the required parameter 'startDate' when calling getUsageByMinuteUsingGET"));
    }
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'endDate' when calling getUsageByMinuteUsingGET",
        new ApiException(400, "Missing the required parameter 'endDate' when calling getUsageByMinuteUsingGET"));
    }

    // create path and map variables
    String path = "/reporting/usage/minute".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "start_date", startDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "end_date", endDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "combine_endpoints", combineEndpoints));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "size", size));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "OAuth2" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (PageUsageInfo) ApiInvoker.deserialize(localVarResponse, "", PageUsageInfo.class);
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
   * Returns aggregated endpoint usage information by minute
   * 
   * @param startDate The beginning of the range being requested, unix timestamp in seconds   * @param endDate The ending of the range being requested, unix timestamp in seconds   * @param combineEndpoints Whether to combine counts from different endpoint. Removes the url and method from the result object   * @param size The number of objects returned per page   * @param page The number of the page returned, starting with 1
  */
  public void getUsageByMinuteUsingGET (Long startDate, Long endDate, Boolean combineEndpoints, Integer size, Integer page, final Response.Listener<PageUsageInfo> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'startDate' when calling getUsageByMinuteUsingGET",
         new ApiException(400, "Missing the required parameter 'startDate' when calling getUsageByMinuteUsingGET"));
    }
    
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'endDate' when calling getUsageByMinuteUsingGET",
         new ApiException(400, "Missing the required parameter 'endDate' when calling getUsageByMinuteUsingGET"));
    }
    

    // create path and map variables
    String path = "/reporting/usage/minute".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "start_date", startDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "end_date", endDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "combine_endpoints", combineEndpoints));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "size", size));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));


    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] { "OAuth2" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((PageUsageInfo) ApiInvoker.deserialize(localVarResponse,  "", PageUsageInfo.class));
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
  /**
  * Returns aggregated endpoint usage information by month
  * 
   * @param startDate The beginning of the range being requested, unix timestamp in seconds
   * @param endDate The ending of the range being requested, unix timestamp in seconds
   * @param combineEndpoints Whether to combine counts from different endpoint. Removes the url and method from the result object
   * @param size The number of objects returned per page
   * @param page The number of the page returned, starting with 1
   * @return PageUsageInfo
  */
  public PageUsageInfo getUsageByMonthUsingGET (Long startDate, Long endDate, Boolean combineEndpoints, Integer size, Integer page) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'startDate' when calling getUsageByMonthUsingGET",
        new ApiException(400, "Missing the required parameter 'startDate' when calling getUsageByMonthUsingGET"));
    }
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'endDate' when calling getUsageByMonthUsingGET",
        new ApiException(400, "Missing the required parameter 'endDate' when calling getUsageByMonthUsingGET"));
    }

    // create path and map variables
    String path = "/reporting/usage/month".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "start_date", startDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "end_date", endDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "combine_endpoints", combineEndpoints));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "size", size));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "OAuth2" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (PageUsageInfo) ApiInvoker.deserialize(localVarResponse, "", PageUsageInfo.class);
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
   * Returns aggregated endpoint usage information by month
   * 
   * @param startDate The beginning of the range being requested, unix timestamp in seconds   * @param endDate The ending of the range being requested, unix timestamp in seconds   * @param combineEndpoints Whether to combine counts from different endpoint. Removes the url and method from the result object   * @param size The number of objects returned per page   * @param page The number of the page returned, starting with 1
  */
  public void getUsageByMonthUsingGET (Long startDate, Long endDate, Boolean combineEndpoints, Integer size, Integer page, final Response.Listener<PageUsageInfo> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'startDate' when calling getUsageByMonthUsingGET",
         new ApiException(400, "Missing the required parameter 'startDate' when calling getUsageByMonthUsingGET"));
    }
    
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'endDate' when calling getUsageByMonthUsingGET",
         new ApiException(400, "Missing the required parameter 'endDate' when calling getUsageByMonthUsingGET"));
    }
    

    // create path and map variables
    String path = "/reporting/usage/month".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "start_date", startDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "end_date", endDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "combine_endpoints", combineEndpoints));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "size", size));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));


    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] { "OAuth2" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((PageUsageInfo) ApiInvoker.deserialize(localVarResponse,  "", PageUsageInfo.class));
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
  /**
  * Returns aggregated endpoint usage information by year
  * 
   * @param startDate The beginning of the range being requested, unix timestamp in seconds
   * @param endDate The ending of the range being requested, unix timestamp in seconds
   * @param combineEndpoints Whether to combine counts from different endpoint. Removes the url and method from the result object
   * @param size The number of objects returned per page
   * @param page The number of the page returned, starting with 1
   * @return PageUsageInfo
  */
  public PageUsageInfo getUsageByYearUsingGET (Long startDate, Long endDate, Boolean combineEndpoints, Integer size, Integer page) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'startDate' when calling getUsageByYearUsingGET",
        new ApiException(400, "Missing the required parameter 'startDate' when calling getUsageByYearUsingGET"));
    }
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'endDate' when calling getUsageByYearUsingGET",
        new ApiException(400, "Missing the required parameter 'endDate' when calling getUsageByYearUsingGET"));
    }

    // create path and map variables
    String path = "/reporting/usage/year".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "start_date", startDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "end_date", endDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "combine_endpoints", combineEndpoints));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "size", size));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "OAuth2" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (PageUsageInfo) ApiInvoker.deserialize(localVarResponse, "", PageUsageInfo.class);
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
   * Returns aggregated endpoint usage information by year
   * 
   * @param startDate The beginning of the range being requested, unix timestamp in seconds   * @param endDate The ending of the range being requested, unix timestamp in seconds   * @param combineEndpoints Whether to combine counts from different endpoint. Removes the url and method from the result object   * @param size The number of objects returned per page   * @param page The number of the page returned, starting with 1
  */
  public void getUsageByYearUsingGET (Long startDate, Long endDate, Boolean combineEndpoints, Integer size, Integer page, final Response.Listener<PageUsageInfo> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'startDate' when calling getUsageByYearUsingGET",
         new ApiException(400, "Missing the required parameter 'startDate' when calling getUsageByYearUsingGET"));
    }
    
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'endDate' when calling getUsageByYearUsingGET",
         new ApiException(400, "Missing the required parameter 'endDate' when calling getUsageByYearUsingGET"));
    }
    

    // create path and map variables
    String path = "/reporting/usage/year".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "start_date", startDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "end_date", endDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "combine_endpoints", combineEndpoints));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "size", size));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));


    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] { "OAuth2" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((PageUsageInfo) ApiInvoker.deserialize(localVarResponse,  "", PageUsageInfo.class));
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
