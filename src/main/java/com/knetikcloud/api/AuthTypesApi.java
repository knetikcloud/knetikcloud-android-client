package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.AccessResourceCreateRequest;
import com.knetikcloud.model.AccessTypeResource;
import com.knetikcloud.model.PageResourceAccessTypeResource;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface AuthTypesApi {
  /**
   * Get allowed action
   * Checks for which actions can be taken against a given resource by the caller. &lt;b&gt;Types Needed:&lt;/b&gt; any
   * @param type The type value (required)
   * @param id The resource id (required)
   * @return Call&lt;List&lt;String&gt;&gt;
   */
  @GET("access/resources/{type}/{id}/actions")
  Call<List<String>> allowedResourceActions(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Path("id") String id
  );

  /**
   * Get allowed actions on a type
   * Checks for which actions can be taken against a given type by the caller. &lt;b&gt;Types Needed:&lt;/b&gt; any
   * @param type The type value (required)
   * @return Call&lt;List&lt;String&gt;&gt;
   */
  @GET("access/types/{type}/actions")
  Call<List<String>> allowedTypeActions(
    @retrofit2.http.Path("type") String type
  );

  /**
   * Create or update resource
   * Creates the access control for a resource if it does not exist, and updates parent information if it does not.&lt;b&gt;Resources Needed:&lt;/b&gt; ROLE_SUPER_ADMIN
   * @param type The resource type (required)
   * @param accessResource The access rules for the resource (optional)
   * @return Call&lt;AccessTypeResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("access/resources/{type}")
  Call<AccessTypeResource> createResource(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Body AccessResourceCreateRequest accessResource
  );

  /**
   * Create a new type
   * &lt;b&gt;Types Needed:&lt;/b&gt; ROLE_SUPER_ADMIN
   * @param typeResource The type resource object (optional)
   * @return Call&lt;AccessTypeResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("access/types")
  Call<AccessTypeResource> createType(
    @retrofit2.http.Body AccessTypeResource typeResource
  );

  /**
   * Delete a resource
   * Deletes a non-root level type&lt;br /&gt;&lt;b&gt;Types Needed:&lt;/b&gt; ROLE_SUPER_ADMIN
   * @param type The type value (required)
   * @param id The resource id (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("access/resources/{type}/{id}")
  Call<Void> deleteResource(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Path("id") String id
  );

  /**
   * Delete all resources of a type
   * &lt;b&gt;Types Needed:&lt;/b&gt; ROLE_SUPER_ADMIN
   * @param type The type value (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("access/resources/{type}")
  Call<Void> deleteResources(
    @retrofit2.http.Path("type") String type
  );

  /**
   * Delete a root type
   * Deletes a root level type with no id&lt;br /&gt;&lt;b&gt;Types Needed:&lt;/b&gt; ROLE_SUPER_ADMIN
   * @param type The type value (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("access/types/{type}")
  Call<Void> deleteType(
    @retrofit2.http.Path("type") String type
  );

  /**
   * Get a single resource
   * &lt;b&gt;Types Needed:&lt;/b&gt; VIEW_ACCESS
   * @param type The type value (required)
   * @param id The resource id (required)
   * @return Call&lt;AccessTypeResource&gt;
   */
  @GET("access/resources/{type}/{id}")
  Call<AccessTypeResource> getResource(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Path("id") String id
  );

  /**
   * List and search resources
   * &lt;b&gt;Types Needed:&lt;/b&gt; ROLE_SUPER_ADMIN
   * @param type The type value (required)
   * @param filterType Filter for a specific type (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to type:ASC)
   * @return Call&lt;PageResourceAccessTypeResource&gt;
   */
  @GET("access/resources/{type}")
  Call<PageResourceAccessTypeResource> getResources(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Query("filter_type") String filterType, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Get a single root type
   * &lt;b&gt;Types Needed:&lt;/b&gt; VIEW_ACCESS
   * @param type The type value (required)
   * @return Call&lt;AccessTypeResource&gt;
   */
  @GET("access/types/{type}")
  Call<AccessTypeResource> getType(
    @retrofit2.http.Path("type") String type
  );

  /**
   * List and search types
   * &lt;b&gt;Types Needed:&lt;/b&gt; ROLE_SUPER_ADMIN
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to type:ASC)
   * @return Call&lt;PageResourceAccessTypeResource&gt;
   */
  @GET("access/types")
  Call<PageResourceAccessTypeResource> getTypes(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Update a resource
   * &lt;b&gt;Types Needed:&lt;/b&gt; ACCESS_CONTROL
   * @param type The type value (required)
   * @param id The resource id (required)
   * @param typeResource The resource object (optional)
   * @return Call&lt;AccessTypeResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("access/resources/{type}/{id}")
  Call<AccessTypeResource> updateResource(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Path("id") String id, @retrofit2.http.Body AccessTypeResource typeResource
  );

  /**
   * Update a root type
   * &lt;b&gt;Types Needed:&lt;/b&gt; ACCESS_CONTROL
   * @param type The type value (required)
   * @param typeResource The type resource object (optional)
   * @return Call&lt;AccessTypeResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("access/types/{type}")
  Call<AccessTypeResource> updateType(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Body AccessTypeResource typeResource
  );

}
