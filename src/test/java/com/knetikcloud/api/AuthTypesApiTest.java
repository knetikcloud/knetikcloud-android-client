package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.AccessResourceCreateRequest;
import com.knetikcloud.model.AccessTypeResource;
import com.knetikcloud.model.PageResourceAccessResultsResource;
import com.knetikcloud.model.PageResourceAccessTypeResource;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthTypesApi
 */
public class AuthTypesApiTest {

    private AuthTypesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AuthTypesApi.class);
    }

    /**
     * Get allowed action
     *
     * Checks for which actions can be taken against a given resource by the caller. &lt;b&gt;Types Needed:&lt;/b&gt; any
     */
    @Test
    public void allowedResourceActionsTest() {
        String type = null;
        String id = null;
        Integer size = null;
        Integer page = null;
        // PageResourceAccessResultsResource response = api.allowedResourceActions(type, id, size, page);

        // TODO: test validations
    }
    /**
     * Get allowed actions on a type
     *
     * Checks for which actions can be taken against a given type by the caller. &lt;b&gt;Types Needed:&lt;/b&gt; any
     */
    @Test
    public void allowedTypeActionsTest() {
        String type = null;
        Integer size = null;
        Integer page = null;
        // PageResourceAccessResultsResource response = api.allowedTypeActions(type, size, page);

        // TODO: test validations
    }
    /**
     * Create or update resource
     *
     * Creates the access control for a resource if it does not exist, and updates parent information if it does not.&lt;b&gt;Resources Needed:&lt;/b&gt; ROLE_SUPER_ADMIN
     */
    @Test
    public void createResourceTest() {
        String type = null;
        AccessResourceCreateRequest accessResource = null;
        // AccessTypeResource response = api.createResource(type, accessResource);

        // TODO: test validations
    }
    /**
     * Create a new type
     *
     * &lt;b&gt;Types Needed:&lt;/b&gt; ROLE_SUPER_ADMIN
     */
    @Test
    public void createTypeTest() {
        AccessTypeResource typeResource = null;
        // AccessTypeResource response = api.createType(typeResource);

        // TODO: test validations
    }
    /**
     * Delete all resources of a type
     *
     * &lt;b&gt;Types Needed:&lt;/b&gt; ROLE_SUPER_ADMIN
     */
    @Test
    public void deleteAllOfTypeTest() {
        String type = null;
        // Void response = api.deleteAllOfType(type);

        // TODO: test validations
    }
    /**
     * Delete a resource
     *
     * Deletes a non-root level type&lt;br /&gt;&lt;b&gt;Types Needed:&lt;/b&gt; ROLE_SUPER_ADMIN
     */
    @Test
    public void deleteResourceTest() {
        String type = null;
        String id = null;
        // Void response = api.deleteResource(type, id);

        // TODO: test validations
    }
    /**
     * Delete a root type
     *
     * Deletes a root level type with no id&lt;br /&gt;&lt;b&gt;Types Needed:&lt;/b&gt; ROLE_SUPER_ADMIN
     */
    @Test
    public void deleteTypeTest() {
        String type = null;
        // Void response = api.deleteType(type);

        // TODO: test validations
    }
    /**
     * Get a single resource
     *
     * &lt;b&gt;Types Needed:&lt;/b&gt; VIEW_ACCESS
     */
    @Test
    public void getResourceTest() {
        String type = null;
        String id = null;
        // AccessTypeResource response = api.getResource(type, id);

        // TODO: test validations
    }
    /**
     * List and search resources
     *
     * &lt;b&gt;Types Needed:&lt;/b&gt; ROLE_SUPER_ADMIN
     */
    @Test
    public void getResourcesTest() {
        String type = null;
        String filterType = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceAccessTypeResource response = api.getResources(type, filterType, size, page, order);

        // TODO: test validations
    }
    /**
     * Get a single root type
     *
     * &lt;b&gt;Types Needed:&lt;/b&gt; VIEW_ACCESS
     */
    @Test
    public void getTypeTest() {
        String type = null;
        // AccessTypeResource response = api.getType(type);

        // TODO: test validations
    }
    /**
     * List and search types
     *
     * &lt;b&gt;Types Needed:&lt;/b&gt; ROLE_SUPER_ADMIN
     */
    @Test
    public void getTypesTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceAccessTypeResource response = api.getTypes(size, page, order);

        // TODO: test validations
    }
    /**
     * Update a resource
     *
     * &lt;b&gt;Types Needed:&lt;/b&gt; ACCESS_CONTROL
     */
    @Test
    public void updateResourceTest() {
        String type = null;
        String id = null;
        AccessTypeResource typeResource = null;
        // AccessTypeResource response = api.updateResource(type, id, typeResource);

        // TODO: test validations
    }
    /**
     * Update a root type
     *
     * &lt;b&gt;Types Needed:&lt;/b&gt; ACCESS_CONTROL
     */
    @Test
    public void updateTypeTest() {
        String type = null;
        AccessTypeResource typeResource = null;
        // AccessTypeResource response = api.updateType(type, typeResource);

        // TODO: test validations
    }
}
