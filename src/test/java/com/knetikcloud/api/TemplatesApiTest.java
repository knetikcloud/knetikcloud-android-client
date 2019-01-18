package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.BasicTemplatedResource;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.PatchResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TemplateResource;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TemplatesApi
 */
public class TemplatesApiTest {

    private TemplatesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(TemplatesApi.class);
    }

    /**
     * Create a template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATES_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; POST
     */
    @Test
    public void createTemplateTest() {
        String typeHint = null;
        TemplateResource template = null;
        // TemplateResource response = api.createTemplate(typeHint, template);

        // TODO: test validations
    }
    /**
     * Delete a template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATES_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE
     */
    @Test
    public void deleteTemplateTest() {
        String typeHint = null;
        String id = null;
        String cascade = null;
        // Void response = api.deleteTemplate(typeHint, id, cascade);

        // TODO: test validations
    }
    /**
     * Get a template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATES_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; GET
     */
    @Test
    public void getTemplateTest() {
        String typeHint = null;
        String id = null;
        // TemplateResource response = api.getTemplate(typeHint, id);

        // TODO: test validations
    }
    /**
     * List and search templates
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATES_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LIST
     */
    @Test
    public void getTemplatesTest() {
        String typeHint = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceTemplateResource response = api.getTemplates(typeHint, size, page, order);

        // TODO: test validations
    }
    /**
     * Patch a template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATES_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PUT
     */
    @Test
    public void patchTemplateTest() {
        String typeHint = null;
        String id = null;
        PatchResource templatePatchResource = null;
        Boolean testValidation = null;
        // Void response = api.patchTemplate(typeHint, id, templatePatchResource, testValidation);

        // TODO: test validations
    }
    /**
     * Validate a templated resource
     *
     * Error code thrown if invalid.&lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATES_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; GET
     */
    @Test
    public void validateTest() {
        String typeHint = null;
        BasicTemplatedResource resource = null;
        // Void response = api.validate(typeHint, resource);

        // TODO: test validations
    }
}
