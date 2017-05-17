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

package com.knetikcloud.api;

import com.knetikcloud.client.ApiInvoker;
import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.Pair;

import com.knetikcloud.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import com.knetikcloud.model.LeaderboardEntryResource;
import com.knetikcloud.model.LeaderboardResource;
import com.knetikcloud.model.Result;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class GamificationLeaderboardsApi {
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
  * Retrieves leaderboard details and paginated entries
  * The context type identifies the type of entity (i.e., &#39;activity&#39;) being tracked on the leaderboard. The context ID is the unique ID of the actual entity tracked by the leaderboard. Sorting is based on the fields of LeaderboardEntryResource rather than the returned LeaderboardResource.
   * @param contextType The context type for the leaderboard
   * @param contextId The context id for the leaderboard
   * @param size The number of objects returned per page
   * @param page The number of the page returned, starting with 1
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
   * @return LeaderboardResource
  */
  public LeaderboardResource getLeaderboard (String contextType, String contextId, Integer size, Integer page, String order) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'contextType' is set
    if (contextType == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'contextType' when calling getLeaderboard",
        new ApiException(400, "Missing the required parameter 'contextType' when calling getLeaderboard"));
    }
    // verify the required parameter 'contextId' is set
    if (contextId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'contextId' when calling getLeaderboard",
        new ApiException(400, "Missing the required parameter 'contextId' when calling getLeaderboard"));
    }

    // create path and map variables
    String path = "/leaderboards/{context_type}/{context_id}".replaceAll("\\{" + "context_type" + "\\}", apiInvoker.escapeString(contextType.toString())).replaceAll("\\{" + "context_id" + "\\}", apiInvoker.escapeString(contextId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
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

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (LeaderboardResource) ApiInvoker.deserialize(localVarResponse, "", LeaderboardResource.class);
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
   * Retrieves leaderboard details and paginated entries
   * The context type identifies the type of entity (i.e., &#39;activity&#39;) being tracked on the leaderboard. The context ID is the unique ID of the actual entity tracked by the leaderboard. Sorting is based on the fields of LeaderboardEntryResource rather than the returned LeaderboardResource.
   * @param contextType The context type for the leaderboard   * @param contextId The context id for the leaderboard   * @param size The number of objects returned per page   * @param page The number of the page returned, starting with 1   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
  */
  public void getLeaderboard (String contextType, String contextId, Integer size, Integer page, String order, final Response.Listener<LeaderboardResource> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'contextType' is set
    if (contextType == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'contextType' when calling getLeaderboard",
         new ApiException(400, "Missing the required parameter 'contextType' when calling getLeaderboard"));
    }
    
    // verify the required parameter 'contextId' is set
    if (contextId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'contextId' when calling getLeaderboard",
         new ApiException(400, "Missing the required parameter 'contextId' when calling getLeaderboard"));
    }
    

    // create path and map variables
    String path = "/leaderboards/{context_type}/{context_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "context_type" + "\\}", apiInvoker.escapeString(contextType.toString())).replaceAll("\\{" + "context_id" + "\\}", apiInvoker.escapeString(contextId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

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

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((LeaderboardResource) ApiInvoker.deserialize(localVarResponse,  "", LeaderboardResource.class));
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
  * Retrieves a specific user entry with rank
  * The context type identifies the type of entity (i.e., &#39;activity&#39;) being tracked on the leaderboard. The context ID is the unique ID of the actual entity tracked by the leaderboard
   * @param contextType The context type for the leaderboard
   * @param contextId The context id for the leaderboard
   * @param id The id of a user
   * @return LeaderboardEntryResource
  */
  public LeaderboardEntryResource getLeaderboardRank (String contextType, String contextId, String id) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'contextType' is set
    if (contextType == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'contextType' when calling getLeaderboardRank",
        new ApiException(400, "Missing the required parameter 'contextType' when calling getLeaderboardRank"));
    }
    // verify the required parameter 'contextId' is set
    if (contextId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'contextId' when calling getLeaderboardRank",
        new ApiException(400, "Missing the required parameter 'contextId' when calling getLeaderboardRank"));
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'id' when calling getLeaderboardRank",
        new ApiException(400, "Missing the required parameter 'id' when calling getLeaderboardRank"));
    }

    // create path and map variables
    String path = "/leaderboards/{context_type}/{context_id}/users/{id}/rank".replaceAll("\\{" + "context_type" + "\\}", apiInvoker.escapeString(contextType.toString())).replaceAll("\\{" + "context_id" + "\\}", apiInvoker.escapeString(contextId.toString())).replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
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
         return (LeaderboardEntryResource) ApiInvoker.deserialize(localVarResponse, "", LeaderboardEntryResource.class);
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
   * Retrieves a specific user entry with rank
   * The context type identifies the type of entity (i.e., &#39;activity&#39;) being tracked on the leaderboard. The context ID is the unique ID of the actual entity tracked by the leaderboard
   * @param contextType The context type for the leaderboard   * @param contextId The context id for the leaderboard   * @param id The id of a user
  */
  public void getLeaderboardRank (String contextType, String contextId, String id, final Response.Listener<LeaderboardEntryResource> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'contextType' is set
    if (contextType == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'contextType' when calling getLeaderboardRank",
         new ApiException(400, "Missing the required parameter 'contextType' when calling getLeaderboardRank"));
    }
    
    // verify the required parameter 'contextId' is set
    if (contextId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'contextId' when calling getLeaderboardRank",
         new ApiException(400, "Missing the required parameter 'contextId' when calling getLeaderboardRank"));
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'id' when calling getLeaderboardRank",
         new ApiException(400, "Missing the required parameter 'id' when calling getLeaderboardRank"));
    }
    

    // create path and map variables
    String path = "/leaderboards/{context_type}/{context_id}/users/{id}/rank".replaceAll("\\{format\\}","json").replaceAll("\\{" + "context_type" + "\\}", apiInvoker.escapeString(contextType.toString())).replaceAll("\\{" + "context_id" + "\\}", apiInvoker.escapeString(contextId.toString())).replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



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
              responseListener.onResponse((LeaderboardEntryResource) ApiInvoker.deserialize(localVarResponse,  "", LeaderboardEntryResource.class));
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
  * Get a list of available leaderboard strategy names
  * 
   * @return List<String>
  */
  public List<String> getLeaderboardStrategies () throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;

    // create path and map variables
    String path = "/leaderboards/strategies";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
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

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (List<String>) ApiInvoker.deserialize(localVarResponse, "array", String.class);
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
   * Get a list of available leaderboard strategy names
   * 

  */
  public void getLeaderboardStrategies (final Response.Listener<List<String>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  

    // create path and map variables
    String path = "/leaderboards/strategies".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



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

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<String>) ApiInvoker.deserialize(localVarResponse,  "array", String.class));
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
