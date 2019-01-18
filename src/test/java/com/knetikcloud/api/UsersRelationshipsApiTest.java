package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.PageResourceUserRelationshipResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.UserRelationshipResource;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersRelationshipsApi
 */
public class UsersRelationshipsApiTest {

    private UsersRelationshipsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(UsersRelationshipsApi.class);
    }

    /**
     * Create a user relationship
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; RELATIONSHIPS_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; NONE
     */
    @Test
    public void createUserRelationshipTest() {
        UserRelationshipResource relationship = null;
        // UserRelationshipResource response = api.createUserRelationship(relationship);

        // TODO: test validations
    }
    /**
     * Delete a user relationship
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; RELATIONSHIPS_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; NONE
     */
    @Test
    public void deleteUserRelationshipTest() {
        Long id = null;
        // Void response = api.deleteUserRelationship(id);

        // TODO: test validations
    }
    /**
     * Get a user relationship
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; RELATIONSHIPS_USER or RELATIONSHIPS_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; NONE
     */
    @Test
    public void getRelationshipTest() {
        Long id = null;
        // UserRelationshipResource response = api.getRelationship(id);

        // TODO: test validations
    }
    /**
     * Get a list of user relationships
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; RELATIONSHIPS_USER or RELATIONSHIPS_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; NONE
     */
    @Test
    public void getUserRelationshipsTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceUserRelationshipResource response = api.getUserRelationships(size, page, order);

        // TODO: test validations
    }
    /**
     * Update a user relationship
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; RELATIONSHIPS_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; NONE
     */
    @Test
    public void updateUserRelationshipTest() {
        Long id = null;
        UserRelationshipResource relationship = null;
        // UserRelationshipResource response = api.updateUserRelationship(id, relationship);

        // TODO: test validations
    }
}
