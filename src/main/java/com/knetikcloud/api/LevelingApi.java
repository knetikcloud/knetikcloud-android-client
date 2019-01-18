package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.PatchResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TemplateResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface LevelingApi {
  /**
   * Create a leveling template
   * Leveling Templates define a type of level schema and the properties they have.&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; POST
   * @param levelingTemplateResource The leveling template resource object (optional)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("leveling/templates")
  Call<TemplateResource> createLevelingTemplate(
    @retrofit2.http.Body TemplateResource levelingTemplateResource
  );

  /**
   * Delete a leveling template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects.&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE
   * @param id The id of the template (required)
   * @param cascade The value needed to delete used templates (optional)
   * @return Call&lt;Void&gt;
   */
  @DELETE("leveling/templates/{id}")
  Call<Void> deleteLevelingTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("cascade") String cascade
  );

  /**
   * Get a single leveling template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; GET
   * @param id The id of the template (required)
   * @return Call&lt;TemplateResource&gt;
   */
  @GET("leveling/templates/{id}")
  Call<TemplateResource> getLevelingTemplate(
    @retrofit2.http.Path("id") String id
  );

  /**
   * List and search leveling templates
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; LIST
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceTemplateResource&gt;
   */
  @GET("leveling/templates")
  Call<PageResourceTemplateResource> getLevelingTemplates(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Update a leveling template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; PUT
   * @param id The id of the template (required)
   * @param templatePatchResource The patch resource object (optional)
   * @param testValidation If true, this will test validation but not submit the patch request (optional)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("leveling/templates/{id}")
  Call<TemplateResource> updateLevelingTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body PatchResource templatePatchResource, @retrofit2.http.Query("test_validation") Boolean testValidation
  );

}
