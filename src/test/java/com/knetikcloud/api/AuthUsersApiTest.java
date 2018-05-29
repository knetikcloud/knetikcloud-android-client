package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.PageResourceUserSidResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.UserSidResource;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthUsersApi
 */
public class AuthUsersApiTest {

    private AuthUsersApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AuthUsersApi.class);
    }

    /**
     * Add a sid to a user
     *
     * No error returned if the user already has the sid. &lt;b&gt;Resources Needed:&lt;/b&gt; ROLE_SUPER_ADMIN
     */
    @Test
    public void addSidTest() {
        Integer userId = null;
        UserSidResource sid = null;
        // UserSidResource response = api.addSid(userId, sid);

        // TODO: test validations
    }
    /**
     * Get a user sid
     *
     * Http error 404 means the user does not have the sid&lt;b&gt;Resources Needed:&lt;/b&gt; VIEW_ACCESS
     */
    @Test
    public void getSidTest() {
        Integer userId = null;
        String sid = null;
        // UserSidResource response = api.getSid(userId, sid);

        // TODO: test validations
    }
    /**
     * List and search user sids
     *
     * &lt;b&gt;Resources Needed:&lt;/b&gt; VIEW_ACCESS
     */
    @Test
    public void getSidsTest() {
        Integer userId = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceUserSidResource response = api.getSids(userId, size, page, order);

        // TODO: test validations
    }
    /**
     * Remove a sid from a user
     *
     * No error returned if the suer does not have the sid. &lt;b&gt;Resources Needed:&lt;/b&gt; ROLE_SUPER_ADMIN
     */
    @Test
    public void removeSidTest() {
        Integer userId = null;
        String sid = null;
        // Void response = api.removeSid(userId, sid);

        // TODO: test validations
    }
}
