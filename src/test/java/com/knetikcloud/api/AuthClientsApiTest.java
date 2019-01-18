package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.ClientResource;
import com.knetikcloud.model.PageResourceClientResource;
import com.knetikcloud.model.PageResourceGrantTypeResource;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthClientsApi
 */
public class AuthClientsApiTest {

    private AuthClientsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AuthClientsApi.class);
    }

    /**
     * Create a new client
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; CLIENTS_ADMIN
     */
    @Test
    public void createClientTest() {
        ClientResource clientResource = null;
        // ClientResource response = api.createClient(clientResource);

        // TODO: test validations
    }
    /**
     * Delete a client
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; CLIENTS_ADMIN
     */
    @Test
    public void deleteClientTest() {
        String clientKey = null;
        // Void response = api.deleteClient(clientKey);

        // TODO: test validations
    }
    /**
     * Get a single client
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; CLIENTS_ADMIN
     */
    @Test
    public void getClientTest() {
        String clientKey = null;
        // ClientResource response = api.getClient(clientKey);

        // TODO: test validations
    }
    /**
     * List available client grant types
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; CLIENTS_ADMIN
     */
    @Test
    public void getClientGrantTypesTest() {
        Integer size = null;
        Integer page = null;
        // PageResourceGrantTypeResource response = api.getClientGrantTypes(size, page);

        // TODO: test validations
    }
    /**
     * List and search clients
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; CLIENTS_ADMIN
     */
    @Test
    public void getClientsTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceClientResource response = api.getClients(size, page, order);

        // TODO: test validations
    }
    /**
     * Set grant types for a client
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; CLIENTS_ADMIN
     */
    @Test
    public void setClientGrantTypesTest() {
        String clientKey = null;
        List<String> grantList = null;
        // Void response = api.setClientGrantTypes(clientKey, grantList);

        // TODO: test validations
    }
    /**
     * Set redirect uris for a client
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; CLIENTS_ADMIN
     */
    @Test
    public void setClientRedirectUrisTest() {
        String clientKey = null;
        List<String> redirectList = null;
        // Void response = api.setClientRedirectUris(clientKey, redirectList);

        // TODO: test validations
    }
    /**
     * Update a client
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; CLIENTS_ADMIN
     */
    @Test
    public void updateClientTest() {
        String clientKey = null;
        ClientResource clientResource = null;
        // ClientResource response = api.updateClient(clientKey, clientResource);

        // TODO: test validations
    }
}
