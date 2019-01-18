package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.ItemTemplateResource;
import com.knetikcloud.model.ObjectResource;
import com.knetikcloud.model.PageResourceItemTemplateResource;
import com.knetikcloud.model.PageResourceObjectResource;
import com.knetikcloud.model.PatchResource;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface ObjectsApi {
  /**
   * Create an object
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVENTORY_ADMIN
   * @param templateId The id of the template this object is to be part of (required)
   * @param cascade Whether to cascade group changes, such as in the limited gettable behavior. A 400 error will return otherwise if the group is already in use with different values. (optional, default to false)
   * @param objectItem The object item object (optional)
   * @return Call&lt;ObjectResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("objects/{template_id}")
  Call<ObjectResource> createObjectItem(
    @retrofit2.http.Path("template_id") String templateId, @retrofit2.http.Query("cascade") Boolean cascade, @retrofit2.http.Body ObjectResource objectItem
  );

  /**
   * Create an object template
   * Object templates define a type of entitlement and the properties they have.&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; POST
   * @param template The entitlement template to be created (optional)
   * @return Call&lt;ItemTemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("objects/templates")
  Call<ItemTemplateResource> createObjectTemplate(
    @retrofit2.http.Body ItemTemplateResource template
  );

  /**
   * Delete an object
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVENTORY_ADMIN
   * @param templateId The id of the template this object is part of (required)
   * @param objectId The id of the object (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("objects/{template_id}/{object_id}")
  Call<Void> deleteObjectItem(
    @retrofit2.http.Path("template_id") String templateId, @retrofit2.http.Path("object_id") Integer objectId
  );

  /**
   * Delete an entitlement template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects.&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE
   * @param id The id of the template (required)
   * @param cascade The value needed to delete used templates (optional)
   * @return Call&lt;Void&gt;
   */
  @DELETE("objects/templates/{id}")
  Call<Void> deleteObjectTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("cascade") String cascade
  );

  /**
   * Get a single object
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param templateId The id of the template this object is part of (required)
   * @param objectId The id of the object (required)
   * @return Call&lt;ObjectResource&gt;
   */
  @GET("objects/{template_id}/{object_id}")
  Call<ObjectResource> getObjectItem(
    @retrofit2.http.Path("template_id") String templateId, @retrofit2.http.Path("object_id") Integer objectId
  );

  /**
   * List and search objects
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param templateId The id of the template to get objects for (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceObjectResource&gt;
   */
  @GET("objects/{template_id}")
  Call<PageResourceObjectResource> getObjectItems(
    @retrofit2.http.Path("template_id") String templateId, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Get a single entitlement template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; GET
   * @param id The id of the template (required)
   * @return Call&lt;ItemTemplateResource&gt;
   */
  @GET("objects/templates/{id}")
  Call<ItemTemplateResource> getObjectTemplate(
    @retrofit2.http.Path("id") String id
  );

  /**
   * List and search entitlement templates
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; LIST
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceItemTemplateResource&gt;
   */
  @GET("objects/templates")
  Call<PageResourceItemTemplateResource> getObjectTemplates(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Update an object
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVENTORY_ADMIN
   * @param templateId The id of the template this object is part of (required)
   * @param objectId The id of the object (required)
   * @param cascade Whether to cascade group changes, such as in the limited gettable behavior. A 400 error will return otherwise if the group is already in use with different values. (optional, default to false)
   * @param objectItem The object item object (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("objects/{template_id}/{object_id}")
  Call<Void> updateObjectItem(
    @retrofit2.http.Path("template_id") String templateId, @retrofit2.http.Path("object_id") Integer objectId, @retrofit2.http.Query("cascade") Boolean cascade, @retrofit2.http.Body ObjectResource objectItem
  );

  /**
   * Update an entitlement template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; PUT
   * @param id The id of the template (required)
   * @param templatePatchResource The patch resource object (optional)
   * @param testValidation If true, this will test validation but not submit the patch request (optional)
   * @return Call&lt;ItemTemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("objects/templates/{id}")
  Call<ItemTemplateResource> updateObjectTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body PatchResource templatePatchResource, @retrofit2.http.Query("test_validation") Boolean testValidation
  );

}
