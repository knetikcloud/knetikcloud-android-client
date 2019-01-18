package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.PageResourceActionResource;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface RuleEngineActionsApi {
  /**
   * Get a list of available actions
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_ACTIONS_USER
   * @param filterCategory Filter for actions that are within a specific category (optional)
   * @param filterName Filter for actions that have names containing the given string (optional)
   * @param filterTags Filter for actions that have all of the given tags (comma separated list) (optional)
   * @param filterSearch Filter for actions containing the given words somewhere within name, description and tags (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourceActionResource&gt;
   */
  @GET("bre/actions")
  Call<PageResourceActionResource> getBREActions(
    @retrofit2.http.Query("filter_category") String filterCategory, @retrofit2.http.Query("filter_name") String filterName, @retrofit2.http.Query("filter_tags") String filterTags, @retrofit2.http.Query("filter_search") String filterSearch, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

}
