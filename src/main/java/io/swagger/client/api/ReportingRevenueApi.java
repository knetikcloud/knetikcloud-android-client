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

import io.swagger.client.model.PageResourceRevenueCountryReportResource;
import io.swagger.client.model.PageResourceRevenueProductReportResource;
import io.swagger.client.model.Result;
import io.swagger.client.model.RevenueReportResource;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ReportingRevenueApi {
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
  * Get item revenue info
  * Get basic info about revenue from sales of items and bundles (not subscriptions, shipping, etc), summed up within a time range
   * @param currencyCode The code for a currency to get sales data for
   * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time
   * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time
   * @return RevenueReportResource
  */
  public RevenueReportResource getItemRevenue (String currencyCode, Long startDate, Long endDate) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'currencyCode' is set
    if (currencyCode == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'currencyCode' when calling getItemRevenue",
        new ApiException(400, "Missing the required parameter 'currencyCode' when calling getItemRevenue"));
    }

    // create path and map variables
    String path = "/reporting/revenue/item-sales/{currency_code}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "currency_code" + "\\}", apiInvoker.escapeString(currencyCode.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "start_date", startDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "end_date", endDate));
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
         return (RevenueReportResource) ApiInvoker.deserialize(localVarResponse, "", RevenueReportResource.class);
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
   * Get item revenue info
   * Get basic info about revenue from sales of items and bundles (not subscriptions, shipping, etc), summed up within a time range
   * @param currencyCode The code for a currency to get sales data for   * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time   * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time
  */
  public void getItemRevenue (String currencyCode, Long startDate, Long endDate, final Response.Listener<RevenueReportResource> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'currencyCode' is set
    if (currencyCode == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'currencyCode' when calling getItemRevenue",
         new ApiException(400, "Missing the required parameter 'currencyCode' when calling getItemRevenue"));
    }
    

    // create path and map variables
    String path = "/reporting/revenue/item-sales/{currency_code}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "currency_code" + "\\}", apiInvoker.escapeString(currencyCode.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "start_date", startDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "end_date", endDate));


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
              responseListener.onResponse((RevenueReportResource) ApiInvoker.deserialize(localVarResponse,  "", RevenueReportResource.class));
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
  * Get refund revenue info
  * Get basic info about revenue loss from refunds (for all item types), summed up within a time range.
   * @param currencyCode The code for a currency to get refund data for
   * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time
   * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time
   * @return RevenueReportResource
  */
  public RevenueReportResource getRefundRevenue (String currencyCode, Long startDate, Long endDate) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'currencyCode' is set
    if (currencyCode == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'currencyCode' when calling getRefundRevenue",
        new ApiException(400, "Missing the required parameter 'currencyCode' when calling getRefundRevenue"));
    }

    // create path and map variables
    String path = "/reporting/revenue/refunds/{currency_code}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "currency_code" + "\\}", apiInvoker.escapeString(currencyCode.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "start_date", startDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "end_date", endDate));
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
         return (RevenueReportResource) ApiInvoker.deserialize(localVarResponse, "", RevenueReportResource.class);
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
   * Get refund revenue info
   * Get basic info about revenue loss from refunds (for all item types), summed up within a time range.
   * @param currencyCode The code for a currency to get refund data for   * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time   * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time
  */
  public void getRefundRevenue (String currencyCode, Long startDate, Long endDate, final Response.Listener<RevenueReportResource> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'currencyCode' is set
    if (currencyCode == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'currencyCode' when calling getRefundRevenue",
         new ApiException(400, "Missing the required parameter 'currencyCode' when calling getRefundRevenue"));
    }
    

    // create path and map variables
    String path = "/reporting/revenue/refunds/{currency_code}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "currency_code" + "\\}", apiInvoker.escapeString(currencyCode.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "start_date", startDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "end_date", endDate));


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
              responseListener.onResponse((RevenueReportResource) ApiInvoker.deserialize(localVarResponse,  "", RevenueReportResource.class));
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
  * Get revenue info by country
  * Get basic info about revenue from sales of all types, summed up within a time range and split out by country. Sorted for largest revenue at the top
   * @param currencyCode The code for a currency to get sales data for
   * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time
   * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time
   * @param size The number of objects returned per page
   * @param page The number of the page returned, starting with 1
   * @return PageResourceRevenueCountryReportResource
  */
  public PageResourceRevenueCountryReportResource getRevenueByCountry (String currencyCode, Long startDate, Long endDate, Integer size, Integer page) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'currencyCode' is set
    if (currencyCode == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'currencyCode' when calling getRevenueByCountry",
        new ApiException(400, "Missing the required parameter 'currencyCode' when calling getRevenueByCountry"));
    }

    // create path and map variables
    String path = "/reporting/revenue/countries/{currency_code}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "currency_code" + "\\}", apiInvoker.escapeString(currencyCode.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "start_date", startDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "end_date", endDate));
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
         return (PageResourceRevenueCountryReportResource) ApiInvoker.deserialize(localVarResponse, "", PageResourceRevenueCountryReportResource.class);
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
   * Get revenue info by country
   * Get basic info about revenue from sales of all types, summed up within a time range and split out by country. Sorted for largest revenue at the top
   * @param currencyCode The code for a currency to get sales data for   * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time   * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time   * @param size The number of objects returned per page   * @param page The number of the page returned, starting with 1
  */
  public void getRevenueByCountry (String currencyCode, Long startDate, Long endDate, Integer size, Integer page, final Response.Listener<PageResourceRevenueCountryReportResource> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'currencyCode' is set
    if (currencyCode == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'currencyCode' when calling getRevenueByCountry",
         new ApiException(400, "Missing the required parameter 'currencyCode' when calling getRevenueByCountry"));
    }
    

    // create path and map variables
    String path = "/reporting/revenue/countries/{currency_code}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "currency_code" + "\\}", apiInvoker.escapeString(currencyCode.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "start_date", startDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "end_date", endDate));
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
              responseListener.onResponse((PageResourceRevenueCountryReportResource) ApiInvoker.deserialize(localVarResponse,  "", PageResourceRevenueCountryReportResource.class));
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
  * Get revenue info by item
  * Get basic info about revenue from sales of all types, summed up within a time range and split out by specific item. Sorted for largest revenue at the top
   * @param currencyCode The code for a currency to get sales data for
   * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time
   * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time
   * @param size The number of objects returned per page
   * @param page The number of the page returned, starting with 1
   * @return PageResourceRevenueProductReportResource
  */
  public PageResourceRevenueProductReportResource getRevenueByItem (String currencyCode, Long startDate, Long endDate, Integer size, Integer page) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'currencyCode' is set
    if (currencyCode == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'currencyCode' when calling getRevenueByItem",
        new ApiException(400, "Missing the required parameter 'currencyCode' when calling getRevenueByItem"));
    }

    // create path and map variables
    String path = "/reporting/revenue/products/{currency_code}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "currency_code" + "\\}", apiInvoker.escapeString(currencyCode.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "start_date", startDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "end_date", endDate));
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
         return (PageResourceRevenueProductReportResource) ApiInvoker.deserialize(localVarResponse, "", PageResourceRevenueProductReportResource.class);
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
   * Get revenue info by item
   * Get basic info about revenue from sales of all types, summed up within a time range and split out by specific item. Sorted for largest revenue at the top
   * @param currencyCode The code for a currency to get sales data for   * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time   * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time   * @param size The number of objects returned per page   * @param page The number of the page returned, starting with 1
  */
  public void getRevenueByItem (String currencyCode, Long startDate, Long endDate, Integer size, Integer page, final Response.Listener<PageResourceRevenueProductReportResource> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'currencyCode' is set
    if (currencyCode == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'currencyCode' when calling getRevenueByItem",
         new ApiException(400, "Missing the required parameter 'currencyCode' when calling getRevenueByItem"));
    }
    

    // create path and map variables
    String path = "/reporting/revenue/products/{currency_code}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "currency_code" + "\\}", apiInvoker.escapeString(currencyCode.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "start_date", startDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "end_date", endDate));
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
              responseListener.onResponse((PageResourceRevenueProductReportResource) ApiInvoker.deserialize(localVarResponse,  "", PageResourceRevenueProductReportResource.class));
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
  * Get subscription revenue info
  * Get basic info about revenue from sales of new subscriptions as well as recurring payemnts, summed up within a time range
   * @param currencyCode The code for a currency to get sales data for
   * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time
   * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time
   * @return RevenueReportResource
  */
  public RevenueReportResource getSubscriptionRevenue (String currencyCode, Long startDate, Long endDate) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'currencyCode' is set
    if (currencyCode == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'currencyCode' when calling getSubscriptionRevenue",
        new ApiException(400, "Missing the required parameter 'currencyCode' when calling getSubscriptionRevenue"));
    }

    // create path and map variables
    String path = "/reporting/revenue/subscription-sales/{currency_code}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "currency_code" + "\\}", apiInvoker.escapeString(currencyCode.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "start_date", startDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "end_date", endDate));
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
         return (RevenueReportResource) ApiInvoker.deserialize(localVarResponse, "", RevenueReportResource.class);
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
   * Get subscription revenue info
   * Get basic info about revenue from sales of new subscriptions as well as recurring payemnts, summed up within a time range
   * @param currencyCode The code for a currency to get sales data for   * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time   * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time
  */
  public void getSubscriptionRevenue (String currencyCode, Long startDate, Long endDate, final Response.Listener<RevenueReportResource> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'currencyCode' is set
    if (currencyCode == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'currencyCode' when calling getSubscriptionRevenue",
         new ApiException(400, "Missing the required parameter 'currencyCode' when calling getSubscriptionRevenue"));
    }
    

    // create path and map variables
    String path = "/reporting/revenue/subscription-sales/{currency_code}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "currency_code" + "\\}", apiInvoker.escapeString(currencyCode.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "start_date", startDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "end_date", endDate));


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
              responseListener.onResponse((RevenueReportResource) ApiInvoker.deserialize(localVarResponse,  "", RevenueReportResource.class));
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
