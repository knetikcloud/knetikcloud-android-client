/**
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

import com.knetikcloud.client.ApiInvoker;
import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.Pair;

import com.knetikcloud.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import com.knetikcloud.model.PageResourceChallengeEventParticipantResource;
import com.knetikcloud.model.Result;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ReportingChallengesApi {
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
  * Retrieve a challenge event leaderboard details
  * Lists all leaderboard entries with additional user details
   * @param filterEvent A sepecific challenge event id
   * @param size The number of objects returned per page
   * @param page The number of the page returned
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
   * @return PageResourceChallengeEventParticipantResource
  */
  public PageResourceChallengeEventParticipantResource getChallengeEventLeaderboard (Long filterEvent, Integer size, Integer page, String order) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;

    // create path and map variables
    String path = "/reporting/events/leaderboard";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "filter_event", filterEvent));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "size", size));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "order", order));
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
         return (PageResourceChallengeEventParticipantResource) ApiInvoker.deserialize(localVarResponse, "", PageResourceChallengeEventParticipantResource.class);
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
   * Retrieve a challenge event leaderboard details
   * Lists all leaderboard entries with additional user details
   * @param filterEvent A sepecific challenge event id   * @param size The number of objects returned per page   * @param page The number of the page returned   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
  */
  public void getChallengeEventLeaderboard (Long filterEvent, Integer size, Integer page, String order, final Response.Listener<PageResourceChallengeEventParticipantResource> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;


    // create path and map variables
    String path = "/reporting/events/leaderboard".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "filter_event", filterEvent));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "size", size));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "order", order));


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
              responseListener.onResponse((PageResourceChallengeEventParticipantResource) ApiInvoker.deserialize(localVarResponse,  "", PageResourceChallengeEventParticipantResource.class));
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
  * Retrieve a challenge event participant details
  * Lists all user submitted scores sorted by value, including those that do not apear in the leaderboard due to value or aggregation
   * @param filterEvent A sepecific challenge event id
   * @param size The number of objects returned per page
   * @param page The number of the page returned
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
   * @return PageResourceChallengeEventParticipantResource
  */
  public PageResourceChallengeEventParticipantResource getChallengeEventParticipants (Long filterEvent, Integer size, Integer page, String order) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;

    // create path and map variables
    String path = "/reporting/events/participants";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "filter_event", filterEvent));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "size", size));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "order", order));
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
         return (PageResourceChallengeEventParticipantResource) ApiInvoker.deserialize(localVarResponse, "", PageResourceChallengeEventParticipantResource.class);
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
   * Retrieve a challenge event participant details
   * Lists all user submitted scores sorted by value, including those that do not apear in the leaderboard due to value or aggregation
   * @param filterEvent A sepecific challenge event id   * @param size The number of objects returned per page   * @param page The number of the page returned   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
  */
  public void getChallengeEventParticipants (Long filterEvent, Integer size, Integer page, String order, final Response.Listener<PageResourceChallengeEventParticipantResource> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;


    // create path and map variables
    String path = "/reporting/events/participants".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "filter_event", filterEvent));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "size", size));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "order", order));


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
              responseListener.onResponse((PageResourceChallengeEventParticipantResource) ApiInvoker.deserialize(localVarResponse,  "", PageResourceChallengeEventParticipantResource.class));
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
