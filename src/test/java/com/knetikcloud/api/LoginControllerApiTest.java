package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LoginControllerApi
 */
public class LoginControllerApiTest {

    private LoginControllerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(LoginControllerApi.class);
    }

    /**
     * login
     *
     * 
     */
    @Test
    public void loginTest() {
        // String response = api.login();

        // TODO: test validations
    }
}
