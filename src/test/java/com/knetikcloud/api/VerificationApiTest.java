package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.PageResourceVerificationRequest;
import com.knetikcloud.model.PatchResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TemplateResource;
import com.knetikcloud.model.VerificationRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VerificationApi
 */
public class VerificationApiTest {

    private VerificationApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(VerificationApi.class);
    }

    /**
     * Create a request template
     *
     * Request Templates define a type of request and the properties they have.
     */
    @Test
    public void createRequestTemplateTest() {
        TemplateResource requestTemplateResource = null;
        // TemplateResource response = api.createRequestTemplate(requestTemplateResource);

        // TODO: test validations
    }
    /**
     * Create a new request
     *
     * Verification requests ask for a user to respond and confirm something, like their email address of an invitation to join a group.&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; POST
     */
    @Test
    public void createVerificationRequestTest() {
        VerificationRequest verificationRequest = null;
        Integer originator = null;
        // VerificationRequest response = api.createVerificationRequest(verificationRequest, originator);

        // TODO: test validations
    }
    /**
     * Delete a request template
     *
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects.
     */
    @Test
    public void deleteRequestTemplateTest() {
        String id = null;
        String cascade = null;
        // Void response = api.deleteRequestTemplate(id, cascade);

        // TODO: test validations
    }
    /**
     * Delete an existing request
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE
     */
    @Test
    public void deleteVerificationRequestTest() {
        String code = null;
        // Void response = api.deleteVerificationRequest(code);

        // TODO: test validations
    }
    /**
     * Get a single request template
     *
     * 
     */
    @Test
    public void getRequestTemplateTest() {
        String id = null;
        // TemplateResource response = api.getRequestTemplate(id);

        // TODO: test validations
    }
    /**
     * List and search request templates
     *
     * 
     */
    @Test
    public void getRequestTemplatesTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceTemplateResource response = api.getRequestTemplates(size, page, order);

        // TODO: test validations
    }
    /**
     * Get a single verification request
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; GET
     */
    @Test
    public void getVerificationRequestTest() {
        String code = null;
        // VerificationRequest response = api.getVerificationRequest(code);

        // TODO: test validations
    }
    /**
     * List requests
     *
     * Get a list of verification requests.&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LIST
     */
    @Test
    public void getVerificationRequestsTest() {
        String filterTemplate = null;
        String filterTarget = null;
        String filterOriginator = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceVerificationRequest response = api.getVerificationRequests(filterTemplate, filterTarget, filterOriginator, size, page, order);

        // TODO: test validations
    }
    /**
     * Update a request template
     *
     * 
     */
    @Test
    public void updateRequestTemplateTest() {
        String id = null;
        PatchResource templatePatchResource = null;
        Boolean testValidation = null;
        // TemplateResource response = api.updateRequestTemplate(id, templatePatchResource, testValidation);

        // TODO: test validations
    }
    /**
     * Update an existing request
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; PUT
     */
    @Test
    public void updateVerificationRequestTest() {
        String code = null;
        VerificationRequest verificationRequest = null;
        // VerificationRequest response = api.updateVerificationRequest(code, verificationRequest);

        // TODO: test validations
    }
    /**
     * Verify a request
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; VERIFY
     */
    @Test
    public void verifyRequestTest() {
        String code = null;
        // VerificationRequest response = api.verifyRequest(code);

        // TODO: test validations
    }
}
