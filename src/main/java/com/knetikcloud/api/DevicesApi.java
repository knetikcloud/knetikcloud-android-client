package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.DeviceResource;
import com.knetikcloud.model.PageResourceDeviceResource;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.PatchResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.SimpleUserResource;
import com.knetikcloud.model.TemplateResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface DevicesApi {
  /**
   * Add device users
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; DEVICES_ADMIN or owner
   * @param userResources userResources (required)
   * @param id id (required)
   * @return Call&lt;DeviceResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("devices/{id}/users")
  Call<DeviceResource> addDeviceUser(
    @retrofit2.http.Body List<SimpleUserResource> userResources, @retrofit2.http.Path("id") String id
  );

  /**
   * Create a device
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param device device (required)
   * @return Call&lt;DeviceResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("devices")
  Call<DeviceResource> createDevice(
    @retrofit2.http.Body DeviceResource device
  );

  /**
   * Create a device template
   * Device Templates define a type of device and the properties they have.&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; POST
   * @param deviceTemplateResource The device template resource object (optional)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("devices/templates")
  Call<TemplateResource> createDeviceTemplate(
    @retrofit2.http.Body TemplateResource deviceTemplateResource
  );

  /**
   * Delete a device
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; DEVICES_ADMIN or owner
   * @param id id (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("devices/{id}")
  Call<Void> deleteDevice(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Delete an device template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects.&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE
   * @param id The id of the template (required)
   * @param cascade The value needed to delete used templates (optional)
   * @return Call&lt;Void&gt;
   */
  @DELETE("devices/templates/{id}")
  Call<Void> deleteDeviceTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("cascade") String cascade
  );

  /**
   * Delete a device user
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; DEVICES_ADMIN or owner
   * @param id The id of the device (required)
   * @param userId The user id of the device user (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("devices/{id}/users/{user_id}")
  Call<Void> deleteDeviceUser(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Path("user_id") Integer userId
  );

  /**
   * Delete all device users
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; DEVICES_ADMIN or owner
   * @param id The id of the device (required)
   * @param filterId Filter for device users to delete with a user id in a given comma separated list of ids (optional)
   * @return Call&lt;Void&gt;
   */
  @DELETE("devices/{id}/users")
  Call<Void> deleteDeviceUsers(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("filter_id") String filterId
  );

  /**
   * Get a single device
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; DEVICES_ADMIN or owner
   * @param id id (required)
   * @return Call&lt;DeviceResource&gt;
   */
  @GET("devices/{id}")
  Call<DeviceResource> getDevice(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Get a single device template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; GET
   * @param id The id of the template (required)
   * @return Call&lt;TemplateResource&gt;
   */
  @GET("devices/templates/{id}")
  Call<TemplateResource> getDeviceTemplate(
    @retrofit2.http.Path("id") String id
  );

  /**
   * List and search device templates
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; LIST
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceTemplateResource&gt;
   */
  @GET("devices/templates")
  Call<PageResourceTemplateResource> getDeviceTemplates(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * List and search devices
   * Get a list of devices with optional filtering. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; DEVICES_ADMIN or user
   * @param filterMake Filter for devices with specified make (optional)
   * @param filterModel Filter for devices with specified model (optional)
   * @param filterOs Filter for devices with specified OS (optional)
   * @param filterSerial Filter for devices with specified serial (optional)
   * @param filterType Filter for devices with specified type (optional)
   * @param filterTag A comma separated list without spaces to filter for devices with specified tags (matches any) (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceDeviceResource&gt;
   */
  @GET("devices")
  Call<PageResourceDeviceResource> getDevices(
    @retrofit2.http.Query("filter_make") String filterMake, @retrofit2.http.Query("filter_model") String filterModel, @retrofit2.http.Query("filter_os") String filterOs, @retrofit2.http.Query("filter_serial") String filterSerial, @retrofit2.http.Query("filter_type") String filterType, @retrofit2.http.Query("filter_tag") String filterTag, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Update a device
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; CUSTOMERS_ADMIN
   * @param device device (required)
   * @param id id (required)
   * @return Call&lt;DeviceResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("devices/{id}")
  Call<DeviceResource> updateDevice(
    @retrofit2.http.Body DeviceResource device, @retrofit2.http.Path("id") String id
  );

  /**
   * Update an device template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; PUT
   * @param id The id of the template (required)
   * @param templatePatchResource The patch resource object (optional)
   * @param testValidation If true, this will test validation but not submit the patch request (optional)
   * @return Call&lt;TemplateResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("devices/templates/{id}")
  Call<TemplateResource> updateDeviceTemplate(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body PatchResource templatePatchResource, @retrofit2.http.Query("test_validation") Boolean testValidation
  );

}
