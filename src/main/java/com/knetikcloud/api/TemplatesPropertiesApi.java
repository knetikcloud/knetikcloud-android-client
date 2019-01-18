package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.PageResourcePropertyFieldListResource;
import com.knetikcloud.model.PropertyFieldListResource;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface TemplatesPropertiesApi {
  /**
   * Get details for a template property type
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; NONE
   * @param type type (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PropertyFieldListResource&gt;
   */
  @GET("templates/properties/{type}")
  Call<PropertyFieldListResource> getTemplatePropertyType(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

  /**
   * List template property types
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; NONE
   * @return Call&lt;PageResourcePropertyFieldListResource&gt;
   */
  @GET("templates/properties")
  Call<PageResourcePropertyFieldListResource> getTemplatePropertyTypes();
    

}
