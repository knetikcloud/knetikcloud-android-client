package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.MonitoringAlertResource;
import com.knetikcloud.model.MonitoringIncidentEventResource;
import com.knetikcloud.model.MonitoringIncidentResource;
import com.knetikcloud.model.MonitoringMetricDatapointResource;
import com.knetikcloud.model.MonitoringMetricResource;
import com.knetikcloud.model.PageResourceMonitoringAlertResource;
import com.knetikcloud.model.PageResourceMonitoringIncidentEventResource;
import com.knetikcloud.model.PageResourceMonitoringIncidentResource;
import com.knetikcloud.model.PageResourceMonitoringMetricResource;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface MonitoringApi {
  /**
   * Create a new alert
   * &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions:&lt;/b&gt; POST&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; POST
   * @param alertResource The alert object (optional)
   * @return Call&lt;MonitoringAlertResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("monitoring/alerts")
  Call<MonitoringAlertResource> createAlert(
    @retrofit2.http.Body MonitoringAlertResource alertResource
  );

  /**
   * Create a new metric
   * &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions:&lt;/b&gt; POST&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; POST
   * @param metricResource The new metric (optional)
   * @return Call&lt;MonitoringMetricResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("monitoring/metrics")
  Call<MonitoringMetricResource> createMetric(
    @retrofit2.http.Body MonitoringMetricResource metricResource
  );

  /**
   * Delete an existing alert
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE
   * @param id The alert id (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("monitoring/alerts/{id}")
  Call<Void> deleteAlert(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Delete a metric datapoint
   * Only works for counter and guage type. &lt;b&gt;Permissions Needed:&lt;/b&gt; RECORD&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; RECORD
   * @param id The metric id (required)
   * @param dimensions The dimensions of the specific datapoint to delete, in the form key1:value1,key2:val2 (optional)
   * @return Call&lt;Void&gt;
   */
  @DELETE("monitoring/metrics/{id}/datapoints")
  Call<Void> deleteDatapoint(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("dimensions") String dimensions
  );

  /**
   * End an existing incident
   * Does not delete the incident, but marks it as resolved by setting the end date.&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE
   * @param id The incident id (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("monitoring/incidents/{id}")
  Call<Void> deleteIncident(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Delete an existing metric
   * This will delete all metrics referencing this metric as its parent.  &lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE
   * @param id The metric id (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("monitoring/metrics/{id}")
  Call<Void> deleteMetric(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Get a single alert
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; GET&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; GET
   * @param id The alert id (required)
   * @return Call&lt;MonitoringAlertResource&gt;
   */
  @GET("monitoring/alerts/{id}")
  Call<MonitoringAlertResource> getAlert(
    @retrofit2.http.Path("id") String id
  );

  /**
   * List and search alerts
   * Get a list of alerts with optional filtering. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LIST&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; NONE
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceMonitoringAlertResource&gt;
   */
  @GET("monitoring/alerts")
  Call<PageResourceMonitoringAlertResource> getAlerts(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Get a single incident
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; GET&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; GET
   * @param id The incident id (required)
   * @return Call&lt;MonitoringIncidentResource&gt;
   */
  @GET("monitoring/incidents/{id}")
  Call<MonitoringIncidentResource> getIncident(
    @retrofit2.http.Path("id") String id
  );

  /**
   * Get the events of an incident
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; LIST&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LIST
   * @param id The incident id (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceMonitoringIncidentEventResource&gt;
   */
  @GET("monitoring/incidents/{id}/events")
  Call<PageResourceMonitoringIncidentEventResource> getIncidentEvents(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * List and search incidents
   * Get a list of incidents with optional filtering. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LIST&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; NONE
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceMonitoringIncidentResource&gt;
   */
  @GET("monitoring/incidents")
  Call<PageResourceMonitoringIncidentResource> getIncidents(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Get a single metric
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; GET&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; GET
   * @param id The metric id (required)
   * @return Call&lt;MonitoringMetricResource&gt;
   */
  @GET("monitoring/metrics/{id}")
  Call<MonitoringMetricResource> getMetric(
    @retrofit2.http.Path("id") String id
  );

  /**
   * List and search metrics
   * Get a list of metrics with optional filtering. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LIST&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LIST
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourceMonitoringMetricResource&gt;
   */
  @GET("monitoring/metrics")
  Call<PageResourceMonitoringMetricResource> getMetrics(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Post a metric datapoint batch
   * Only works with counter and gauge metrics. Re-submit the entire batch in case of failure. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; RECORD&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; NONE
   * @param batch The metric datapoints (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("monitoring/metrics/datapoints")
  Call<Void> postBatch(
    @retrofit2.http.Body List<MonitoringMetricDatapointResource> batch
  );

  /**
   * Post a metric datapoint
   * Only works with counter and gauge metrics. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; RECORD&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; RECORD
   * @param id The metric id (required)
   * @param metricDatapoint The metric datapoint (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("monitoring/metrics/{id}/datapoints")
  Call<Void> postDatapoint(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body MonitoringMetricDatapointResource metricDatapoint
  );

  /**
   * Report an incident event
   * Updates the current incident for an alert or starts a new one if none current. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions:&lt;/b&gt; POST&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; POST
   * @param incidentResource The new incident (optional)
   * @return Call&lt;MonitoringIncidentResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("monitoring/incidents")
  Call<MonitoringIncidentResource> receiveEvent(
    @retrofit2.http.Body MonitoringIncidentEventResource incidentResource
  );

  /**
   * Update an existing alert
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; PUT&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PUT
   * @param id The alert id (required)
   * @param alertResource The alert object (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("monitoring/alerts/{id}")
  Call<Void> updateAlert(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body MonitoringAlertResource alertResource
  );

  /**
   * Update an existing metric
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; PUT&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PUT
   * @param id The metric id (required)
   * @param metricResource The metric object (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("monitoring/metrics/{id}")
  Call<Void> updateMetric(
    @retrofit2.http.Path("id") String id, @retrofit2.http.Body MonitoringMetricResource metricResource
  );

}
