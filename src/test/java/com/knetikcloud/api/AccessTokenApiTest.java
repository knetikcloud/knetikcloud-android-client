/*
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com.
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.model.OAuth2Resource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccessTokenApi
 */
@Ignore
public class AccessTokenApiTest {

    private final AccessTokenApi api = new AccessTokenApi();

    
    /**
     * Get access token
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOAuthTokenTest() throws ApiException {
        String grantType = null;
        String clientId = null;
        String clientSecret = null;
        String username = null;
        String password = null;
        OAuth2Resource response = api.getOAuthToken(grantType, clientId, clientSecret, username, password);

        // TODO: test validations
    }
    
}
