package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.BasicTemplatedResource;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.PatchResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TemplateResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface TemplatesApi {
  /**
   * Create a template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATES_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; POST
   * @param typeHint The type for the resource this template applies to (required)
   * @param template The template (optional)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("templates/{type_hint}")
  Call<TemplateResource> createTemplate(
    @retrofit2.http.Path("type_hint") String typeHint, @retrofit2.http.Body TemplateResource template
  );

  /**
   * Delete a template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATES_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE
   * @param typeHint The type for the resource this template applies to (required)
   * @param id The id of the template (required)
   * @param cascade How to cascade the delete (optional)
   * @return Call&lt;Void&gt;
   */
  @DELETE("templates/{type_hint}/{id}")
  Call<Void> deleteTemplate(
    @retrofit2.http.Path("type_hint") String typeHint, @retrofit2.http.Path("id") String id, @retrofit2.http.Body String cascade
  );

  /**
   * Get a template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATES_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; GET
   * @param typeHint The type for the resource this template applies to (required)
   * @param id The id of the template (required)
   * @return Call&lt;TemplateResource&gt;
   */
  @GET("templates/{type_hint}/{id}")
  Call<TemplateResource> getTemplate(
    @retrofit2.http.Path("type_hint") String typeHint, @retrofit2.http.Path("id") String id
  );

  /**
   * List and search templates
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATES_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LIST
   * @param typeHint The type for the resource this template applies to (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceTemplateResource&gt;
   */
  @GET("templates/{type_hint}")
  Call<PageResourceTemplateResource> getTemplates(
    @retrofit2.http.Path("type_hint") String typeHint, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Patch a template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATES_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PUT
   * @param typeHint The type for the resource this template applies to (required)
   * @param id The id of the template (required)
   * @param templatePatchResource The patch resource object (optional)
   * @param testValidation If true, this will test validation but not submit the patch request (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("templates/{type_hint}/{id}")
  Call<Void> patchTemplate(
    @retrofit2.http.Path("type_hint") String typeHint, @retrofit2.http.Path("id") String id, @retrofit2.http.Body PatchResource templatePatchResource, @retrofit2.http.Query("test_validation") Boolean testValidation
  );

  /**
   * Validate a templated resource
   * Error code thrown if invalid.&lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATES_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; GET
   * @param typeHint The type for the resource this template applies to (required)
   * @param resource The resource to validate (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("templates/{type_hint}/validate")
  Call<Void> validate(
    @retrofit2.http.Path("type_hint") String typeHint, @retrofit2.http.Body BasicTemplatedResource resource
  );

}
