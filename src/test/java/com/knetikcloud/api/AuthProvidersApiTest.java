package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.OAuth2ProviderResource;
import com.knetikcloud.model.PageResourceOAuth2ProviderResource;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthProvidersApi
 */
public class AuthProvidersApiTest {

    private AuthProvidersApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AuthProvidersApi.class);
    }

    /**
     * Create a new OAuth 2 provider
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; POST
     */
    @Test
    public void createProviderTest() {
        OAuth2ProviderResource providerResource = null;
        // OAuth2ProviderResource response = api.createProvider(providerResource);

        // TODO: test validations
    }
    /**
     * Delete an existing OAuth 2 provider
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE
     */
    @Test
    public void deleteProviderTest() {
        String providerId = null;
        // Void response = api.deleteProvider(providerId);

        // TODO: test validations
    }
    /**
     * Get an existing OAuth 2 provider
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; GET
     */
    @Test
    public void getProviderTest() {
        String providerId = null;
        // OAuth2ProviderResource response = api.getProvider(providerId);

        // TODO: test validations
    }
    /**
     * List OAuth 2 providers
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; LIST
     */
    @Test
    public void getProvidersTest() {
        // PageResourceOAuth2ProviderResource response = api.getProviders();

        // TODO: test validations
    }
    /**
     * Update an existing OAuth 2 provider
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; PUT
     */
    @Test
    public void updateProviderTest() {
        String providerId = null;
        OAuth2ProviderResource providerResource = null;
        // Void response = api.updateProvider(providerId, providerResource);

        // TODO: test validations
    }
}
