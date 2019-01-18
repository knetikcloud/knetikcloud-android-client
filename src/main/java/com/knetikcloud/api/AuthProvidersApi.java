package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.OAuth2ProviderResource;
import com.knetikcloud.model.PageResourceOAuth2ProviderResource;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface AuthProvidersApi {
  /**
   * Create a new OAuth 2 provider
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; POST
   * @param providerResource providerResource (required)
   * @return Call&lt;OAuth2ProviderResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("auth/providers")
  Call<OAuth2ProviderResource> createProvider(
    @retrofit2.http.Body OAuth2ProviderResource providerResource
  );

  /**
   * Delete an existing OAuth 2 provider
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE
   * @param providerId provider_id (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("auth/providers/{provider_id}")
  Call<Void> deleteProvider(
    @retrofit2.http.Path("provider_id") String providerId
  );

  /**
   * Get an existing OAuth 2 provider
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; GET
   * @param providerId provider_id (required)
   * @return Call&lt;OAuth2ProviderResource&gt;
   */
  @GET("auth/providers/{provider_id}")
  Call<OAuth2ProviderResource> getProvider(
    @retrofit2.http.Path("provider_id") String providerId
  );

  /**
   * List OAuth 2 providers
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; LIST
   * @return Call&lt;PageResourceOAuth2ProviderResource&gt;
   */
  @GET("auth/providers")
  Call<PageResourceOAuth2ProviderResource> getProviders();
    

  /**
   * Update an existing OAuth 2 provider
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; PUT
   * @param providerId provider_id (required)
   * @param providerResource providerResource (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("auth/providers/{provider_id}")
  Call<Void> updateProvider(
    @retrofit2.http.Path("provider_id") String providerId, @retrofit2.http.Body OAuth2ProviderResource providerResource
  );

}
