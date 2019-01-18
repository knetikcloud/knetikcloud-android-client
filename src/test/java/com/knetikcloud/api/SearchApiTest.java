package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.DocumentRemoveRequest;
import com.knetikcloud.model.ReindexRequest;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.SearchDocument;
import com.knetikcloud.model.SearchQuery;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SearchApi
 */
public class SearchApiTest {

    private SearchApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SearchApi.class);
    }

    /**
     * Adds a document to be indexed. For system use only.
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_MANAGEMENT
     */
    @Test
    public void indexDocumentTest() {
        SearchDocument document = null;
        // Void response = api.indexDocument(document);

        // TODO: test validations
    }
    /**
     * Triggers a full re-indexing of all documents of the specified type. For system use only.
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_MANAGEMENT
     */
    @Test
    public void reindexAllTest() {
        ReindexRequest request = null;
        // Void response = api.reindexAll(request);

        // TODO: test validations
    }
    /**
     * Remove a document from the index. For system use only.
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_MANAGEMENT
     */
    @Test
    public void removeDocumentTest() {
        DocumentRemoveRequest request = null;
        // Void response = api.removeDocument(request);

        // TODO: test validations
    }
    /**
     * Count matches with no template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _count.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH
     */
    @Test
    public void searchCountGETTest() {
        String type = null;
        // Object response = api.searchCountGET(type);

        // TODO: test validations
    }
    /**
     * Count matches with no template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _count.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH
     */
    @Test
    public void searchCountPOSTTest() {
        String type = null;
        Object query = null;
        // Object response = api.searchCountPOST(type, query);

        // TODO: test validations
    }
    /**
     * Get document with no template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH
     */
    @Test
    public void searchDocumentGETTest() {
        String type = null;
        String id = null;
        // Object response = api.searchDocumentGET(type, id);

        // TODO: test validations
    }
    /**
     * Explain matches with no template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _explain.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH
     */
    @Test
    public void searchExplainGETTest() {
        String type = null;
        String id = null;
        // Object response = api.searchExplainGET(type, id);

        // TODO: test validations
    }
    /**
     * Explain matches with no template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _explain.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH
     */
    @Test
    public void searchExplainPOSTTest() {
        String type = null;
        String id = null;
        Object query = null;
        // Object response = api.searchExplainPOST(type, id, query);

        // TODO: test validations
    }
    /**
     * Search an index with no template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _search.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH
     */
    @Test
    public void searchIndexTest() {
        String type = null;
        Object query = null;
        // Object response = api.searchIndex(type, query);

        // TODO: test validations
    }
    /**
     * Search an index with no template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _search.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH
     */
    @Test
    public void searchIndexGETTest() {
        String type = null;
        // Object response = api.searchIndexGET(type);

        // TODO: test validations
    }
    /**
     * Get indices
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _cat/indices for indices.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/indices-get-mapping.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
     */
    @Test
    public void searchIndicesGETTest() {
        // Object response = api.searchIndicesGET();

        // TODO: test validations
    }
    /**
     * Get mapping with no template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _mapping.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/indices-get-mapping.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH
     */
    @Test
    public void searchMappingsGETTest() {
        String type = null;
        // Object response = api.searchMappingsGET(type);

        // TODO: test validations
    }
    /**
     * Search public index with no template
     *
     * Make an ElasticSearch query against a public index. Results filtered for records the caller has GET permission on. Further information on query format can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
     */
    @Test
    public void searchPublicIndexTest() {
        String type = null;
        Integer user = null;
        SearchQuery query = null;
        // Object response = api.searchPublicIndex(type, user, query);

        // TODO: test validations
    }
    /**
     * Validate matches with no template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _validate/query.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-validate.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH
     */
    @Test
    public void searchValidateGETTest() {
        String type = null;
        // Object response = api.searchValidateGET(type);

        // TODO: test validations
    }
    /**
     * Validate matches with no template
     *
     * This is a 1 to 1 mapping of a ElasticSearch call to _validate/query.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-validate.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH
     */
    @Test
    public void searchValidatePOSTTest() {
        String type = null;
        Object query = null;
        // Object response = api.searchValidatePOST(type, query);

        // TODO: test validations
    }
}
