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

import io.swagger.client.model.PageChallengeEventParticipantResource;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ReportingChallengesApi {
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
  * Retrieve a challenge event leaderboard details
  * Lists all leaderboard entries with additional user details
   * @param filterEvent A sepecific challenge event id
   * @return PageChallengeEventParticipantResource
  */
  public PageChallengeEventParticipantResource getChallengeEventLeaderboardUsingGET (Long filterEvent) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
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
         return (PageChallengeEventParticipantResource) ApiInvoker.deserialize(localVarResponse, "", PageChallengeEventParticipantResource.class);
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
   * @param filterEvent A sepecific challenge event id
  */
  public void getChallengeEventLeaderboardUsingGET (Long filterEvent, final Response.Listener<PageChallengeEventParticipantResource> responseListener, final Response.ErrorListener errorListener) {
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
              responseListener.onResponse((PageChallengeEventParticipantResource) ApiInvoker.deserialize(localVarResponse,  "", PageChallengeEventParticipantResource.class));
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
   * @return PageChallengeEventParticipantResource
  */
  public PageChallengeEventParticipantResource getChallengeEventParticipantsUsingGET (Long filterEvent) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
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
         return (PageChallengeEventParticipantResource) ApiInvoker.deserialize(localVarResponse, "", PageChallengeEventParticipantResource.class);
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
   * @param filterEvent A sepecific challenge event id
  */
  public void getChallengeEventParticipantsUsingGET (Long filterEvent, final Response.Listener<PageChallengeEventParticipantResource> responseListener, final Response.ErrorListener errorListener) {
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
              responseListener.onResponse((PageChallengeEventParticipantResource) ApiInvoker.deserialize(localVarResponse,  "", PageChallengeEventParticipantResource.class));
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
