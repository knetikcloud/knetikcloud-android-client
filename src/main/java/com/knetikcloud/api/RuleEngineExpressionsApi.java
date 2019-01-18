package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.ExpressionResource;
import com.knetikcloud.model.PageResourceExpressionResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StringWrapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface RuleEngineExpressionsApi {
  /**
   * Lookup a specific expression
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_EXPRESSIONS_USER
   * @param type Specifiy the type of expression as returned by the listing endpoint (required)
   * @return Call&lt;ExpressionResource&gt;
   */
  @GET("bre/expressions/{type}")
  Call<ExpressionResource> getBREExpression(
    @retrofit2.http.Path("type") String type
  );

  /**
   * Get a list of supported expressions to use in conditions or actions.
   * Each resource contains a type and a definition that are read-only, all the other fields must be provided when using the expression in a rule. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_EXPRESSIONS_USER
   * @param filterTypeGroup Filter for expressions by type group (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourceExpressionResource&gt;
   */
  @GET("bre/expressions")
  Call<PageResourceExpressionResource> getBREExpressions(
    @retrofit2.http.Query("filter_type_group") String filterTypeGroup, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

  /**
   * Returns the textual representation of an expression
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; BRE_RULE_ENGINE_EXPRESSIONS_USER
   * @param expression The expression resource to be converted (optional)
   * @return Call&lt;StringWrapper&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("bre/expressions")
  Call<StringWrapper> getExpressionAsText(
    @retrofit2.http.Body ExpressionResource expression
  );

}
