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

import io.swagger.client.model.PageSavedAddressResource;
import io.swagger.client.model.SavedAddressResource;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class UsersAddressesApi {
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
  * Save a new address
  * 
   * @param userId The id of the user
   * @param savedAddressResource The new address
   * @return SavedAddressResource
  */
  public SavedAddressResource createAddressUsingPOST (String userId, SavedAddressResource savedAddressResource) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = savedAddressResource;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'userId' when calling createAddressUsingPOST",
        new ApiException(400, "Missing the required parameter 'userId' when calling createAddressUsingPOST"));
    }

    // create path and map variables
    String path = "/users/{user_id}/addresses".replaceAll("\\{format\\}","json").replaceAll("\\{" + "user_id" + "\\}", apiInvoker.escapeString(userId.toString()));

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
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (SavedAddressResource) ApiInvoker.deserialize(localVarResponse, "", SavedAddressResource.class);
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
   * Save a new address
   * 
   * @param userId The id of the user   * @param savedAddressResource The new address
  */
  public void createAddressUsingPOST (String userId, SavedAddressResource savedAddressResource, final Response.Listener<SavedAddressResource> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = savedAddressResource;

  
    // verify the required parameter 'userId' is set
    if (userId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'userId' when calling createAddressUsingPOST",
         new ApiException(400, "Missing the required parameter 'userId' when calling createAddressUsingPOST"));
    }
    

    // create path and map variables
    String path = "/users/{user_id}/addresses".replaceAll("\\{format\\}","json").replaceAll("\\{" + "user_id" + "\\}", apiInvoker.escapeString(userId.toString()));

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
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((SavedAddressResource) ApiInvoker.deserialize(localVarResponse,  "", SavedAddressResource.class));
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
  * Delete an address
  * 
   * @param userId The id of the user
   * @param id The id of the address
   * @return void
  */
  public void deleteAddressUsingDELETE (String userId, Integer id) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'userId' when calling deleteAddressUsingDELETE",
        new ApiException(400, "Missing the required parameter 'userId' when calling deleteAddressUsingDELETE"));
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'id' when calling deleteAddressUsingDELETE",
        new ApiException(400, "Missing the required parameter 'id' when calling deleteAddressUsingDELETE"));
    }

    // create path and map variables
    String path = "/users/{user_id}/addresses/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "user_id" + "\\}", apiInvoker.escapeString(userId.toString())).replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return ;
      } else {
         return ;
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
   * Delete an address
   * 
   * @param userId The id of the user   * @param id The id of the address
  */
  public void deleteAddressUsingDELETE (String userId, Integer id, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'userId' is set
    if (userId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'userId' when calling deleteAddressUsingDELETE",
         new ApiException(400, "Missing the required parameter 'userId' when calling deleteAddressUsingDELETE"));
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'id' when calling deleteAddressUsingDELETE",
         new ApiException(400, "Missing the required parameter 'id' when calling deleteAddressUsingDELETE"));
    }
    

    // create path and map variables
    String path = "/users/{user_id}/addresses/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "user_id" + "\\}", apiInvoker.escapeString(userId.toString())).replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
      apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
              responseListener.onResponse(localVarResponse);
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
  * Get a single address
  * 
   * @param userId The id of the user
   * @param id The id of the address
   * @return SavedAddressResource
  */
  public SavedAddressResource getAddressUsingGET (String userId, Integer id) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'userId' when calling getAddressUsingGET",
        new ApiException(400, "Missing the required parameter 'userId' when calling getAddressUsingGET"));
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'id' when calling getAddressUsingGET",
        new ApiException(400, "Missing the required parameter 'id' when calling getAddressUsingGET"));
    }

    // create path and map variables
    String path = "/users/{user_id}/addresses/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "user_id" + "\\}", apiInvoker.escapeString(userId.toString())).replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
         return (SavedAddressResource) ApiInvoker.deserialize(localVarResponse, "", SavedAddressResource.class);
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
   * Get a single address
   * 
   * @param userId The id of the user   * @param id The id of the address
  */
  public void getAddressUsingGET (String userId, Integer id, final Response.Listener<SavedAddressResource> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'userId' is set
    if (userId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'userId' when calling getAddressUsingGET",
         new ApiException(400, "Missing the required parameter 'userId' when calling getAddressUsingGET"));
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'id' when calling getAddressUsingGET",
         new ApiException(400, "Missing the required parameter 'id' when calling getAddressUsingGET"));
    }
    

    // create path and map variables
    String path = "/users/{user_id}/addresses/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "user_id" + "\\}", apiInvoker.escapeString(userId.toString())).replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
              responseListener.onResponse((SavedAddressResource) ApiInvoker.deserialize(localVarResponse,  "", SavedAddressResource.class));
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
  * List and search addresses
  * 
   * @param userId The id of the user
   * @param size The number of objects returned per page
   * @param page The number of the page returned, starting with 1
   * @param order a comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
   * @return PageSavedAddressResource
  */
  public PageSavedAddressResource getAddressesUsingGET (String userId, Integer size, Integer page, String order) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'userId' when calling getAddressesUsingGET",
        new ApiException(400, "Missing the required parameter 'userId' when calling getAddressesUsingGET"));
    }

    // create path and map variables
    String path = "/users/{user_id}/addresses".replaceAll("\\{format\\}","json").replaceAll("\\{" + "user_id" + "\\}", apiInvoker.escapeString(userId.toString()));

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

    String[] authNames = new String[] { "OAuth2" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (PageSavedAddressResource) ApiInvoker.deserialize(localVarResponse, "", PageSavedAddressResource.class);
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
   * List and search addresses
   * 
   * @param userId The id of the user   * @param size The number of objects returned per page   * @param page The number of the page returned, starting with 1   * @param order a comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
  */
  public void getAddressesUsingGET (String userId, Integer size, Integer page, String order, final Response.Listener<PageSavedAddressResource> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'userId' is set
    if (userId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'userId' when calling getAddressesUsingGET",
         new ApiException(400, "Missing the required parameter 'userId' when calling getAddressesUsingGET"));
    }
    

    // create path and map variables
    String path = "/users/{user_id}/addresses".replaceAll("\\{format\\}","json").replaceAll("\\{" + "user_id" + "\\}", apiInvoker.escapeString(userId.toString()));

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

      String[] authNames = new String[] { "OAuth2" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((PageSavedAddressResource) ApiInvoker.deserialize(localVarResponse,  "", PageSavedAddressResource.class));
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
  * Update an address
  * 
   * @param userId The id of the user
   * @param id The id of the address
   * @param savedAddressResource The saved address resource object
   * @return void
  */
  public void updateAddressUsingPUT (String userId, Integer id, SavedAddressResource savedAddressResource) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = savedAddressResource;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'userId' when calling updateAddressUsingPUT",
        new ApiException(400, "Missing the required parameter 'userId' when calling updateAddressUsingPUT"));
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'id' when calling updateAddressUsingPUT",
        new ApiException(400, "Missing the required parameter 'id' when calling updateAddressUsingPUT"));
    }

    // create path and map variables
    String path = "/users/{user_id}/addresses/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "user_id" + "\\}", apiInvoker.escapeString(userId.toString())).replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return ;
      } else {
         return ;
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
   * Update an address
   * 
   * @param userId The id of the user   * @param id The id of the address   * @param savedAddressResource The saved address resource object
  */
  public void updateAddressUsingPUT (String userId, Integer id, SavedAddressResource savedAddressResource, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = savedAddressResource;

  
    // verify the required parameter 'userId' is set
    if (userId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'userId' when calling updateAddressUsingPUT",
         new ApiException(400, "Missing the required parameter 'userId' when calling updateAddressUsingPUT"));
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'id' when calling updateAddressUsingPUT",
         new ApiException(400, "Missing the required parameter 'id' when calling updateAddressUsingPUT"));
    }
    

    // create path and map variables
    String path = "/users/{user_id}/addresses/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "user_id" + "\\}", apiInvoker.escapeString(userId.toString())).replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
      apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
              responseListener.onResponse(localVarResponse);
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
