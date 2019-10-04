package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.PageResourceVerificationRequest;
import com.knetikcloud.model.PatchResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TemplateResource;
import com.knetikcloud.model.VerificationRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface VerificationApi {
  /**
   * Create a request template
   * Request Templates define a type of request and the properties they have.
   * @param requestTemplateResource The request template resource object (optional)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("verification/templates")
  Call<TemplateResource> createRequestTemplate(
    @retrofit2.http.Body TemplateResource requestTemplateResource
  );

  /**
   * Create a new request
   * Verification requests ask for a user to respond and confirm something, like their email address of an invitation to join a group.&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; POST
   * @param verificationRequest The request (optional)
   * @param originator Optional originator id, admin only (optional)
   * @return Call&lt;VerificationRequest&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("verification/requests")
  Call<VerificationRequest> createVerificationRequest(
    @retrofit2.http.Body VerificationRequest verificationRequest, @retrofit2.http.Query("originator") Integer originator
  );

  /**
   * Delete a request template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects.
   * @param id The id of the template (required)
   * @param cascade The value needed to delete used templates (optional)
   * @return Call&lt;Void&gt;
   */
  @DELETE("verification/templates/{id}")
  Call<Void> deleteRequestTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("cascade") String cascade
  );

  /**
   * Delete an existing request
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE
   * @param code The code (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("verification/requests/{code}")
  Call<Void> deleteVerificationRequest(
    @retrofit2.http.Path("code") String code
  );

  /**
   * Get a single request template
   * 
   * @param id The id of the template (required)
   * @return Call&lt;TemplateResource&gt;
   */
  @GET("verification/templates/{id}")
  Call<TemplateResource> getRequestTemplate(
    @retrofit2.http.Path("id") String id
  );

  /**
   * List and search request templates
   * 
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceTemplateResource&gt;
   */
  @GET("verification/templates")
  Call<PageResourceTemplateResource> getRequestTemplates(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Get a single verification request
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; GET
   * @param code The code (required)
   * @return Call&lt;VerificationRequest&gt;
   */
  @GET("verification/requests/{code}")
  Call<VerificationRequest> getVerificationRequest(
    @retrofit2.http.Path("code") String code
  );

  /**
   * List requests
   * Get a list of verification requests.&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LIST
   * @param filterTemplate Filter for verifications with specified template (optional)
   * @param filterTarget Filter for verifications with specified user id as the target (optional)
   * @param filterOriginator Filter for verifications with specified user id as the originator (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceVerificationRequest&gt;
   */
  @GET("verification/requests")
  Call<PageResourceVerificationRequest> getVerificationRequests(
    @retrofit2.http.Query("filter_template") String filterTemplate, @retrofit2.http.Query("filter_target") String filterTarget, @retrofit2.http.Query("filter_originator") String filterOriginator, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Update a request template
   * 
   * @param id The id of the template (required)
   * @param templatePatchResource The patch resource object (optional)
   * @param testValidation If true, this will test validation but not submit the patch request (optional)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("verification/templates/{id}")
  Call<TemplateResource> updateRequestTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body PatchResource templatePatchResource, @retrofit2.http.Query("test_validation") Boolean testValidation
  );

  /**
   * Update an existing request
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; PUT
   * @param code The request code (required)
   * @param verificationRequest The request (optional)
   * @return Call&lt;VerificationRequest&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("verification/requests/{code}")
  Call<VerificationRequest> updateVerificationRequest(
    @retrofit2.http.Path("code") String code, @retrofit2.http.Body VerificationRequest verificationRequest
  );

  /**
   * Verify a request
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; VERIFY
   * @param code The code (required)
   * @return Call&lt;VerificationRequest&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("verification/requests/{code}/responses")
  Call<VerificationRequest> verifyRequest(
    @retrofit2.http.Path("code") String code
  );

}
