package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.ClientResource;
import com.knetikcloud.model.PageResourceRoleResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.RoleResource;
import com.knetikcloud.model.UserResource;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthRolesApi
 */
public class AuthRolesApiTest {

    private AuthRolesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AuthRolesApi.class);
    }

    /**
     * Create a new role
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ROLES_ADMIN
     */
    @Test
    public void createRoleTest() {
        RoleResource roleResource = null;
        // RoleResource response = api.createRole(roleResource);

        // TODO: test validations
    }
    /**
     * Delete a role
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ROLES_ADMIN
     */
    @Test
    public void deleteRoleTest() {
        String role = null;
        Boolean force = null;
        // Void response = api.deleteRole(role, force);

        // TODO: test validations
    }
    /**
     * Get roles for a client
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ROLES_ADMIN
     */
    @Test
    public void getClientRolesTest() {
        String clientKey = null;
        Integer size = null;
        Integer page = null;
        // PageResourceRoleResource response = api.getClientRoles(clientKey, size, page);

        // TODO: test validations
    }
    /**
     * Get a single role
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ROLES_ADMIN
     */
    @Test
    public void getRoleTest() {
        String role = null;
        // RoleResource response = api.getRole(role);

        // TODO: test validations
    }
    /**
     * List and search roles
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ROLES_ADMIN
     */
    @Test
    public void getRolesTest() {
        String filterName = null;
        String filterRole = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceRoleResource response = api.getRoles(filterName, filterRole, size, page, order);

        // TODO: test validations
    }
    /**
     * Get roles for a user
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ROLES_ADMIN
     */
    @Test
    public void getUserRolesTest() {
        Integer userId = null;
        Integer size = null;
        Integer page = null;
        // PageResourceRoleResource response = api.getUserRoles(userId, size, page);

        // TODO: test validations
    }
    /**
     * Set roles for a client
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ROLES_ADMIN
     */
    @Test
    public void setClientRolesTest() {
        String clientKey = null;
        List<String> rolesList = null;
        // ClientResource response = api.setClientRoles(clientKey, rolesList);

        // TODO: test validations
    }
    /**
     * Set permissions for a role
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ROLES_ADMIN
     */
    @Test
    public void setPermissionsForRoleTest() {
        String role = null;
        List<String> permissionsList = null;
        // RoleResource response = api.setPermissionsForRole(role, permissionsList);

        // TODO: test validations
    }
    /**
     * Set roles for a user
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ROLES_ADMIN
     */
    @Test
    public void setUserRolesTest() {
        Integer userId = null;
        List<String> rolesList = null;
        // UserResource response = api.setUserRoles(userId, rolesList);

        // TODO: test validations
    }
    /**
     * Update a role
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ROLES_ADMIN
     */
    @Test
    public void updateRoleTest() {
        String role = null;
        RoleResource roleResource = null;
        // RoleResource response = api.updateRole(role, roleResource);

        // TODO: test validations
    }
}
