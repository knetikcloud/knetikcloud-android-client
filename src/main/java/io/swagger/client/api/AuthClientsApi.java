/**
 * Knetik Platform API Documentation Latest
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
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

import io.swagger.client.model.ClientResource;
import io.swagger.client.model.GrantTypeResource;
import java.util.*;
import io.swagger.client.model.PageClientResource;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class AuthClientsApi {
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
  * Set grant types for a client
  * 
   * @param clientKey The key of the client
   * @param grantList A list of unique grant types
   * @return void
  */
  public void assignClientGrantTypesUsingPUT (String clientKey, List<String> grantList) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = grantList;
    // verify the required parameter 'clientKey' is set
    if (clientKey == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'clientKey' when calling assignClientGrantTypesUsingPUT",
        new ApiException(400, "Missing the required parameter 'clientKey' when calling assignClientGrantTypesUsingPUT"));
    }

    // create path and map variables
    String path = "/auth/clients/{client_key}/grant-types".replaceAll("\\{format\\}","json").replaceAll("\\{" + "client_key" + "\\}", apiInvoker.escapeString(clientKey.toString()));

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
   * Set grant types for a client
   * 
   * @param clientKey The key of the client   * @param grantList A list of unique grant types
  */
  public void assignClientGrantTypesUsingPUT (String clientKey, List<String> grantList, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = grantList;

  
    // verify the required parameter 'clientKey' is set
    if (clientKey == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'clientKey' when calling assignClientGrantTypesUsingPUT",
         new ApiException(400, "Missing the required parameter 'clientKey' when calling assignClientGrantTypesUsingPUT"));
    }
    

    // create path and map variables
    String path = "/auth/clients/{client_key}/grant-types".replaceAll("\\{format\\}","json").replaceAll("\\{" + "client_key" + "\\}", apiInvoker.escapeString(clientKey.toString()));

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
  /**
  * Set redirect uris for a client
  * 
   * @param clientKey The key of the client
   * @param redirectList A list of unique redirect uris
   * @return void
  */
  public void assignClientRedirectUrisUsingPUT (String clientKey, List<String> redirectList) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = redirectList;
    // verify the required parameter 'clientKey' is set
    if (clientKey == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'clientKey' when calling assignClientRedirectUrisUsingPUT",
        new ApiException(400, "Missing the required parameter 'clientKey' when calling assignClientRedirectUrisUsingPUT"));
    }

    // create path and map variables
    String path = "/auth/clients/{client_key}/redirect-uris".replaceAll("\\{format\\}","json").replaceAll("\\{" + "client_key" + "\\}", apiInvoker.escapeString(clientKey.toString()));

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
   * Set redirect uris for a client
   * 
   * @param clientKey The key of the client   * @param redirectList A list of unique redirect uris
  */
  public void assignClientRedirectUrisUsingPUT (String clientKey, List<String> redirectList, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = redirectList;

  
    // verify the required parameter 'clientKey' is set
    if (clientKey == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'clientKey' when calling assignClientRedirectUrisUsingPUT",
         new ApiException(400, "Missing the required parameter 'clientKey' when calling assignClientRedirectUrisUsingPUT"));
    }
    

    // create path and map variables
    String path = "/auth/clients/{client_key}/redirect-uris".replaceAll("\\{format\\}","json").replaceAll("\\{" + "client_key" + "\\}", apiInvoker.escapeString(clientKey.toString()));

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
  /**
  * Create a new client
  * 
   * @param clientResource The client resource object
   * @return ClientResource
  */
  public ClientResource createClientUsingPOST (ClientResource clientResource) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = clientResource;

    // create path and map variables
    String path = "/auth/clients".replaceAll("\\{format\\}","json");

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
         return (ClientResource) ApiInvoker.deserialize(localVarResponse, "", ClientResource.class);
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
   * Create a new client
   * 
   * @param clientResource The client resource object
  */
  public void createClientUsingPOST (ClientResource clientResource, final Response.Listener<ClientResource> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = clientResource;

  

    // create path and map variables
    String path = "/auth/clients".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((ClientResource) ApiInvoker.deserialize(localVarResponse,  "", ClientResource.class));
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
  * Delete a client
  * 
   * @param clientKey The key of the client
   * @return void
  */
  public void deleteClientUsingDELETE (String clientKey) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'clientKey' is set
    if (clientKey == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'clientKey' when calling deleteClientUsingDELETE",
        new ApiException(400, "Missing the required parameter 'clientKey' when calling deleteClientUsingDELETE"));
    }

    // create path and map variables
    String path = "/auth/clients/{client_key}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "client_key" + "\\}", apiInvoker.escapeString(clientKey.toString()));

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
   * Delete a client
   * 
   * @param clientKey The key of the client
  */
  public void deleteClientUsingDELETE (String clientKey, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'clientKey' is set
    if (clientKey == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'clientKey' when calling deleteClientUsingDELETE",
         new ApiException(400, "Missing the required parameter 'clientKey' when calling deleteClientUsingDELETE"));
    }
    

    // create path and map variables
    String path = "/auth/clients/{client_key}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "client_key" + "\\}", apiInvoker.escapeString(clientKey.toString()));

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
  * Get a single client
  * 
   * @param clientKey The key of the client
   * @return ClientResource
  */
  public ClientResource getClientUsingGET (String clientKey) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'clientKey' is set
    if (clientKey == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'clientKey' when calling getClientUsingGET",
        new ApiException(400, "Missing the required parameter 'clientKey' when calling getClientUsingGET"));
    }

    // create path and map variables
    String path = "/auth/clients/{client_key}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "client_key" + "\\}", apiInvoker.escapeString(clientKey.toString()));

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
         return (ClientResource) ApiInvoker.deserialize(localVarResponse, "", ClientResource.class);
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
   * Get a single client
   * 
   * @param clientKey The key of the client
  */
  public void getClientUsingGET (String clientKey, final Response.Listener<ClientResource> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'clientKey' is set
    if (clientKey == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'clientKey' when calling getClientUsingGET",
         new ApiException(400, "Missing the required parameter 'clientKey' when calling getClientUsingGET"));
    }
    

    // create path and map variables
    String path = "/auth/clients/{client_key}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "client_key" + "\\}", apiInvoker.escapeString(clientKey.toString()));

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
              responseListener.onResponse((ClientResource) ApiInvoker.deserialize(localVarResponse,  "", ClientResource.class));
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
  * List and search clients
  * 
   * @param size The number of objects returned per page
   * @param page The number of the page returned, starting with 1
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
   * @return PageClientResource
  */
  public PageClientResource getClientsUsingGET (Integer size, Integer page, String order) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;

    // create path and map variables
    String path = "/auth/clients".replaceAll("\\{format\\}","json");

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
         return (PageClientResource) ApiInvoker.deserialize(localVarResponse, "", PageClientResource.class);
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
   * List and search clients
   * 
   * @param size The number of objects returned per page   * @param page The number of the page returned, starting with 1   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
  */
  public void getClientsUsingGET (Integer size, Integer page, String order, final Response.Listener<PageClientResource> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  

    // create path and map variables
    String path = "/auth/clients".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((PageClientResource) ApiInvoker.deserialize(localVarResponse,  "", PageClientResource.class));
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
  * List available client grant types
  * 
   * @return List<GrantTypeResource>
  */
  public List<GrantTypeResource> listAvailableGrantTypesUsingGET () throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;

    // create path and map variables
    String path = "/auth/clients/grant-types".replaceAll("\\{format\\}","json");

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
         return (List<GrantTypeResource>) ApiInvoker.deserialize(localVarResponse, "array", GrantTypeResource.class);
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
   * List available client grant types
   * 

  */
  public void listAvailableGrantTypesUsingGET (final Response.Listener<List<GrantTypeResource>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  

    // create path and map variables
    String path = "/auth/clients/grant-types".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((List<GrantTypeResource>) ApiInvoker.deserialize(localVarResponse,  "array", GrantTypeResource.class));
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
  * Update a client
  * 
   * @param clientKey The key of the client
   * @param clientResource The client resource object
   * @return void
  */
  public void updateClientUsingPUT (String clientKey, ClientResource clientResource) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = clientResource;
    // verify the required parameter 'clientKey' is set
    if (clientKey == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'clientKey' when calling updateClientUsingPUT",
        new ApiException(400, "Missing the required parameter 'clientKey' when calling updateClientUsingPUT"));
    }

    // create path and map variables
    String path = "/auth/clients/{client_key}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "client_key" + "\\}", apiInvoker.escapeString(clientKey.toString()));

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
   * Update a client
   * 
   * @param clientKey The key of the client   * @param clientResource The client resource object
  */
  public void updateClientUsingPUT (String clientKey, ClientResource clientResource, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = clientResource;

  
    // verify the required parameter 'clientKey' is set
    if (clientKey == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'clientKey' when calling updateClientUsingPUT",
         new ApiException(400, "Missing the required parameter 'clientKey' when calling updateClientUsingPUT"));
    }
    

    // create path and map variables
    String path = "/auth/clients/{client_key}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "client_key" + "\\}", apiInvoker.escapeString(clientKey.toString()));

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