package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.PageResourceUserSidResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.UserSidResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface AuthUsersApi {
  /**
   * Add a sid to a user
   * No error returned if the user already has the sid. &lt;b&gt;Resources Needed:&lt;/b&gt; ROLE_SUPER_ADMIN
   * @param userId The user id (required)
   * @param sid The new sid for the user (optional)
   * @return Call&lt;UserSidResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("access/users/{user_id}/sids")
  Call<UserSidResource> addSid(
    @retrofit2.http.Path("user_id") Integer userId, @retrofit2.http.Body UserSidResource sid
  );

  /**
   * List and search user sids
   * &lt;b&gt;Resources Needed:&lt;/b&gt; VIEW_ACCESS
   * @param userId The resource type (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to resource:ASC)
   * @return Call&lt;PageResourceUserSidResource&gt;
   */
  @GET("access/users/{user_id}/sids")
  Call<PageResourceUserSidResource> getResources1(
    @retrofit2.http.Path("user_id") Integer userId, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Get a user sid
   * Http error 404 means the user does not have the sid&lt;b&gt;Resources Needed:&lt;/b&gt; VIEW_ACCESS
   * @param userId The user id (required)
   * @param sid The security id (required)
   * @return Call&lt;UserSidResource&gt;
   */
  @GET("access/users/{user_id}/sids/{sid}")
  Call<UserSidResource> getSid(
    @retrofit2.http.Path("user_id") Integer userId, @retrofit2.http.Path("sid") String sid
  );

  /**
   * Remove a sid from a user
   * No error returned if the suer does not have the sid. &lt;b&gt;Resources Needed:&lt;/b&gt; ROLE_SUPER_ADMIN
   * @param userId The user id (required)
   * @param sid The security id (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("access/users/{user_id}/sids/{sid}")
  Call<Void> removeSid(
    @retrofit2.http.Path("user_id") Integer userId, @retrofit2.http.Path("sid") String sid
  );

}
