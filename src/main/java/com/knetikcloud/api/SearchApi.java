package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.DocumentRemoveRequest;
import com.knetikcloud.model.ReindexRequest;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.SearchDocument;
import com.knetikcloud.model.SearchObjectDefinition;
import com.knetikcloud.model.SearchQuery;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface SearchApi {
  /**
   * Adds a document to be indexed. For system use only.
   * 
   * @param document document (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("search/documents")
  Call<Void> indexDocument(
    @retrofit2.http.Body SearchDocument document
  );

  /**
   * Register a new index definition. For system use only.
   * 
   * @param definition definition (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("search/definitions")
  Call<Void> registerDefinition(
    @retrofit2.http.Body SearchObjectDefinition definition
  );

  /**
   * Triggers a full re-indexing of all documents of the specified type. For system use only.
   * 
   * @param request request (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("search/reindex")
  Call<Void> reindex(
    @retrofit2.http.Body ReindexRequest request
  );

  /**
   * Remove a document from the index. For system use only.
   * 
   * @param request request (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("search/documents")
  Call<Void> removeDocument(
    @retrofit2.http.Body DocumentRemoveRequest request
  );

  /**
   * Count matches with no template
   * This is a 1 to 1 mapping of a ElasticSearch call to _count.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH
   * @param type The index type (required)
   * @return Call&lt;Object&gt;
   */
  @GET("search/count/{type}")
  Call<Object> searchCountGET(
    @retrofit2.http.Path("type") String type
  );

  /**
   * Count matches with no template
   * This is a 1 to 1 mapping of a ElasticSearch call to _count.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH
   * @param type The index type (required)
   * @param query The query to be used for the search (optional)
   * @return Call&lt;Object&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("search/count/{type}")
  Call<Object> searchCountPOST(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Body Object query
  );

  /**
   * Count matches with a template
   * This is a 1 to 1 mapping of a ElasticSearch call to _count.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH
   * @param type The index type (required)
   * @param template The index template (required)
   * @return Call&lt;Object&gt;
   */
  @GET("search/count/{type}/{template}")
  Call<Object> searchCountWithTemplateGET(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Path("template") String template
  );

  /**
   * Count matches with a template
   * This is a 1 to 1 mapping of a ElasticSearch call to _count.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH
   * @param type The index type (required)
   * @param template The index template (required)
   * @param query The query to be used for the search (optional)
   * @return Call&lt;Object&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("search/count/{type}/{template}")
  Call<Object> searchCountWithTemplatePOST(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Path("template") String template, @retrofit2.http.Body Object query
  );

  /**
   * Get document with no template
   * This is a 1 to 1 mapping of a ElasticSearch call.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH
   * @param type The index type (required)
   * @param id The index id (required)
   * @return Call&lt;Object&gt;
   */
  @GET("search/documents/{type}/{id}")
  Call<Object> searchDocumentGET(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Path("id") String id
  );

  /**
   * Get document with a template
   * This is a 1 to 1 mapping of a ElasticSearch call.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH
   * @param type The index type (required)
   * @param id The index id (required)
   * @param template The index template (required)
   * @return Call&lt;Object&gt;
   */
  @GET("search/documents/{type}/{template}/{id}")
  Call<Object> searchDocumentWithTemplateGET(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Path("id") String id, @retrofit2.http.Path("template") String template
  );

  /**
   * Explain matches with no template
   * This is a 1 to 1 mapping of a ElasticSearch call to _explain.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH
   * @param type The index type (required)
   * @param id The index id (required)
   * @return Call&lt;Object&gt;
   */
  @GET("search/explain/{type}/{id}")
  Call<Object> searchExplainGET(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Path("id") String id
  );

  /**
   * Explain matches with no template
   * This is a 1 to 1 mapping of a ElasticSearch call to _explain.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH
   * @param type The index type (required)
   * @param id The index id (required)
   * @param query The query to be used for the search (optional)
   * @return Call&lt;Object&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("search/explain/{type}/{id}")
  Call<Object> searchExplainPOST(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Path("id") String id, @retrofit2.http.Body Object query
  );

  /**
   * Explain matches with a template
   * This is a 1 to 1 mapping of a ElasticSearch call to _explain.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH
   * @param type The index type (required)
   * @param id The index id (required)
   * @param template The index template (required)
   * @return Call&lt;Object&gt;
   */
  @GET("search/explain/{type}/{template}/{id}")
  Call<Object> searchExplainWithTemplateGET(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Path("id") String id, @retrofit2.http.Path("template") String template
  );

  /**
   * Explain matches with a template
   * This is a 1 to 1 mapping of a ElasticSearch call to _explain.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH
   * @param type The index type (required)
   * @param id The index id (required)
   * @param template The index template (required)
   * @param query The query to be used for the search (optional)
   * @return Call&lt;Object&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("search/explain/{type}/{template}/{id}")
  Call<Object> searchExplainWithTemplatePOST(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Path("id") String id, @retrofit2.http.Path("template") String template, @retrofit2.http.Body Object query
  );

  /**
   * Search an index with no template
   * This is a 1 to 1 mapping of a ElasticSearch call to _search.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH
   * @param type The index type (required)
   * @param query The query to be used for the search (optional)
   * @return Call&lt;Object&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("search/index/{type}")
  Call<Object> searchIndex(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Body Object query
  );

  /**
   * Search an index with no template
   * This is a 1 to 1 mapping of a ElasticSearch call to _search.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH
   * @param type The index type (required)
   * @return Call&lt;Object&gt;
   */
  @GET("search/index/{type}")
  Call<Object> searchIndexGET(
    @retrofit2.http.Path("type") String type
  );

  /**
   * Search an index with a template
   * This is a 1 to 1 mapping of a ElasticSearch call to _search.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH
   * @param type The index type (required)
   * @param template The index template (required)
   * @return Call&lt;Object&gt;
   */
  @GET("search/index/{type}/{template}")
  Call<Object> searchIndexWithTemplateGET(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Path("template") String template
  );

  /**
   * Search an index with a template
   * This is a 1 to 1 mapping of a ElasticSearch call to _search.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH
   * @param type The index type (required)
   * @param template The index template (required)
   * @param query The query to be used for the search (optional)
   * @return Call&lt;Object&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("search/index/{type}/{template}")
  Call<Object> searchIndexWithTemplatePOST(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Path("template") String template, @retrofit2.http.Body Object query
  );

  /**
   * Get indices
   * This is a 1 to 1 mapping of a ElasticSearch call to _cat/indices for indices.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/indices-get-mapping.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
   * @return Call&lt;Object&gt;
   */
  @GET("search/indices")
  Call<Object> searchIndicesGET();
    

  /**
   * Get mapping with no template
   * This is a 1 to 1 mapping of a ElasticSearch call to _mapping.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/indices-get-mapping.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH
   * @param type The index type (required)
   * @return Call&lt;Object&gt;
   */
  @GET("search/mappings/{type}")
  Call<Object> searchMappingsGET(
    @retrofit2.http.Path("type") String type
  );

  /**
   * Get mapping with a template
   * This is a 1 to 1 mapping of a ElasticSearch call to _mapping.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/indices-get-mapping.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH
   * @param type The index type (required)
   * @param template The index template (required)
   * @return Call&lt;Object&gt;
   */
  @GET("search/mappings/{type}/{template}")
  Call<Object> searchMappingsWithTemplateGET(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Path("template") String template
  );

  /**
   * Search public index with no template
   * Make an ElasticSearch query against a public index. Results filtered for records the caller has GET permission on. Further information on query format can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
   * @param type The index type (required)
   * @param user A user to impersonate for security. Requires SEARCH permission for actual caller (optional)
   * @param query The query to be used for the search (optional)
   * @return Call&lt;Object&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("search/public/{type}")
  Call<Object> searchPublicIndex(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Query("user") Integer user, @retrofit2.http.Body SearchQuery query
  );

  /**
   * Search public index with template
   * Make an ElasticSearch query against a public index. Results filtered for records the caller has GET permission on.  Further information on query format can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
   * @param type The index type (required)
   * @param template The index type (required)
   * @param user A user to impersonate for security. Requires SEARCH permission for actual caller (optional)
   * @param query The query to be used for the search (optional)
   * @return Call&lt;Object&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("search/public/{type}/{template}")
  Call<Object> searchPublicIndexWithTemplate(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Path("template") String template, @retrofit2.http.Query("user") Integer user, @retrofit2.http.Body SearchQuery query
  );

  /**
   * Validate matches with no template
   * This is a 1 to 1 mapping of a ElasticSearch call to _validate/query.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-validate.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH
   * @param type The index type (required)
   * @return Call&lt;Object&gt;
   */
  @GET("search/validate/{type}")
  Call<Object> searchValidateGET(
    @retrofit2.http.Path("type") String type
  );

  /**
   * Validate matches with no template
   * This is a 1 to 1 mapping of a ElasticSearch call to _validate/query.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-validate.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH
   * @param type The index type (required)
   * @param query The query to be used for the search (optional)
   * @return Call&lt;Object&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("search/validate/{type}")
  Call<Object> searchValidatePOST(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Body Object query
  );

  /**
   * Validate matches with a template
   * This is a 1 to 1 mapping of a ElasticSearch call to _validate/query.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-validate.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH
   * @param type The index type (required)
   * @param template The index template (required)
   * @return Call&lt;Object&gt;
   */
  @GET("search/validate/{type}/{template}")
  Call<Object> searchValidateWithTemplateGET(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Path("template") String template
  );

  /**
   * Validate matches with a template
   * This is a 1 to 1 mapping of a ElasticSearch call to _validate/query.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-validate.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH
   * @param type The index type (required)
   * @param template The index template (required)
   * @param query The query to be used for the search (optional)
   * @return Call&lt;Object&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("search/validate/{type}/{template}")
  Call<Object> searchValidateWithTemplatePOST(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Path("template") String template, @retrofit2.http.Body Object query
  );

}
