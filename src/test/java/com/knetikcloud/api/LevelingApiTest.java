package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
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
 * API tests for LevelingApi
 */
public class LevelingApiTest {

    private LevelingApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(LevelingApi.class);
    }

    /**
     * Create a leveling template
     *
     * Leveling Templates define a type of level schema and the properties they have.&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; POST
     */
    @Test
    public void createLevelingTemplateTest() {
        TemplateResource levelingTemplateResource = null;
        // TemplateResource response = api.createLevelingTemplate(levelingTemplateResource);

        // TODO: test validations
    }
    /**
     * Delete a leveling template
     *
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects.&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE
     */
    @Test
    public void deleteLevelingTemplateTest() {
        String id = null;
        String cascade = null;
        // Void response = api.deleteLevelingTemplate(id, cascade);

        // TODO: test validations
    }
    /**
     * Get a single leveling template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; GET
     */
    @Test
    public void getLevelingTemplateTest() {
        String id = null;
        // TemplateResource response = api.getLevelingTemplate(id);

        // TODO: test validations
    }
    /**
     * List and search leveling templates
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; LIST
     */
    @Test
    public void getLevelingTemplatesTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceTemplateResource response = api.getLevelingTemplates(size, page, order);

        // TODO: test validations
    }
    /**
     * Update a leveling template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; PUT
     */
    @Test
    public void updateLevelingTemplateTest() {
        String id = null;
        PatchResource templatePatchResource = null;
        Boolean testValidation = null;
        // TemplateResource response = api.updateLevelingTemplate(id, templatePatchResource, testValidation);

        // TODO: test validations
    }
}
