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

import io.swagger.client.model.CommentResource;
import io.swagger.client.model.CommentSearch;
import io.swagger.client.model.PageResourceCommentResource;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ContentCommentsApi {
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
  * Add a new comment
  * 
   * @param commentResource The comment to be added
   * @return CommentResource
  */
  public CommentResource addComment (CommentResource commentResource) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = commentResource;

    // create path and map variables
    String path = "/comments".replaceAll("\\{format\\}","json");

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

    String[] authNames = new String[] { "knetik_oauth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (CommentResource) ApiInvoker.deserialize(localVarResponse, "", CommentResource.class);
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
   * Add a new comment
   * 
   * @param commentResource The comment to be added
  */
  public void addComment (CommentResource commentResource, final Response.Listener<CommentResource> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = commentResource;

  

    // create path and map variables
    String path = "/comments".replaceAll("\\{format\\}","json");

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

      String[] authNames = new String[] { "knetik_oauth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((CommentResource) ApiInvoker.deserialize(localVarResponse,  "", CommentResource.class));
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
  * Delete a comment
  * 
   * @param id The comment id
   * @return void
  */
  public void deleteComment (Long id) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'id' when calling deleteComment",
        new ApiException(400, "Missing the required parameter 'id' when calling deleteComment"));
    }

    // create path and map variables
    String path = "/comments/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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

    String[] authNames = new String[] { "knetik_oauth" };

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
   * Delete a comment
   * 
   * @param id The comment id
  */
  public void deleteComment (Long id, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'id' is set
    if (id == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'id' when calling deleteComment",
         new ApiException(400, "Missing the required parameter 'id' when calling deleteComment"));
    }
    

    // create path and map variables
    String path = "/comments/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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

      String[] authNames = new String[] { "knetik_oauth" };

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
  * Return a comment
  * 
   * @param id The comment id
   * @return CommentResource
  */
  public CommentResource getComment (Long id) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'id' is set
    if (id == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'id' when calling getComment",
        new ApiException(400, "Missing the required parameter 'id' when calling getComment"));
    }

    // create path and map variables
    String path = "/comments/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
         return (CommentResource) ApiInvoker.deserialize(localVarResponse, "", CommentResource.class);
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
   * Return a comment
   * 
   * @param id The comment id
  */
  public void getComment (Long id, final Response.Listener<CommentResource> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'id' is set
    if (id == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'id' when calling getComment",
         new ApiException(400, "Missing the required parameter 'id' when calling getComment"));
    }
    

    // create path and map variables
    String path = "/comments/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
              responseListener.onResponse((CommentResource) ApiInvoker.deserialize(localVarResponse,  "", CommentResource.class));
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
  * Returns a page of comments
  * 
   * @param context Get comments by context type
   * @param contextId Get comments by context id
   * @param size The number of objects returned per page
   * @param page The number of the page returned, starting with 1
   * @return PageResourceCommentResource
  */
  public PageResourceCommentResource getComments (String context, Integer contextId, Integer size, Integer page) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'context' is set
    if (context == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'context' when calling getComments",
        new ApiException(400, "Missing the required parameter 'context' when calling getComments"));
    }
    // verify the required parameter 'contextId' is set
    if (contextId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'contextId' when calling getComments",
        new ApiException(400, "Missing the required parameter 'contextId' when calling getComments"));
    }

    // create path and map variables
    String path = "/comments".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "context", context));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "context_id", contextId));
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

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (PageResourceCommentResource) ApiInvoker.deserialize(localVarResponse, "", PageResourceCommentResource.class);
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
   * Returns a page of comments
   * 
   * @param context Get comments by context type   * @param contextId Get comments by context id   * @param size The number of objects returned per page   * @param page The number of the page returned, starting with 1
  */
  public void getComments (String context, Integer contextId, Integer size, Integer page, final Response.Listener<PageResourceCommentResource> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'context' is set
    if (context == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'context' when calling getComments",
         new ApiException(400, "Missing the required parameter 'context' when calling getComments"));
    }
    
    // verify the required parameter 'contextId' is set
    if (contextId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'contextId' when calling getComments",
         new ApiException(400, "Missing the required parameter 'contextId' when calling getComments"));
    }
    

    // create path and map variables
    String path = "/comments".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "context", context));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "context_id", contextId));
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

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((PageResourceCommentResource) ApiInvoker.deserialize(localVarResponse,  "", PageResourceCommentResource.class));
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
  * Search the comment index
  * The body is an ElasticSearch query json. Please see their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/index.html&#39;&gt;documentation&lt;/a&gt; for details on the format and search options
   * @param query The search query
   * @param size The number of objects returned per page
   * @param page The number of the page returned, starting with 1
   * @return CommentSearch
  */
  public CommentSearch searchComments (Object query, Integer size, Integer page) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = query;

    // create path and map variables
    String path = "/comments/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
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

    String[] authNames = new String[] {  };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (CommentSearch) ApiInvoker.deserialize(localVarResponse, "", CommentSearch.class);
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
   * Search the comment index
   * The body is an ElasticSearch query json. Please see their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/index.html&#39;&gt;documentation&lt;/a&gt; for details on the format and search options
   * @param query The search query   * @param size The number of objects returned per page   * @param page The number of the page returned, starting with 1
  */
  public void searchComments (Object query, Integer size, Integer page, final Response.Listener<CommentSearch> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = query;

  

    // create path and map variables
    String path = "/comments/search".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

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

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((CommentSearch) ApiInvoker.deserialize(localVarResponse,  "", CommentSearch.class));
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
  * Update a comment
  * 
   * @param id The comment id
   * @param content The comment content
   * @return void
  */
  public void updateComment (Long id, String content) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = content;
    // verify the required parameter 'id' is set
    if (id == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'id' when calling updateComment",
        new ApiException(400, "Missing the required parameter 'id' when calling updateComment"));
    }

    // create path and map variables
    String path = "/comments/{id}/content".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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

    String[] authNames = new String[] { "knetik_oauth" };

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
   * Update a comment
   * 
   * @param id The comment id   * @param content The comment content
  */
  public void updateComment (Long id, String content, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = content;

  
    // verify the required parameter 'id' is set
    if (id == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'id' when calling updateComment",
         new ApiException(400, "Missing the required parameter 'id' when calling updateComment"));
    }
    

    // create path and map variables
    String path = "/comments/{id}/content".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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

      String[] authNames = new String[] { "knetik_oauth" };

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
