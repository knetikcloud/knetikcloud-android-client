package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.MonitoringAlertResource;
import com.knetikcloud.model.MonitoringIncidentEventResource;
import com.knetikcloud.model.MonitoringIncidentResource;
import com.knetikcloud.model.MonitoringMetricDatapointResource;
import com.knetikcloud.model.MonitoringMetricRecordResource;
import com.knetikcloud.model.MonitoringMetricResource;
import com.knetikcloud.model.PageResourceMonitoringAlertResource;
import com.knetikcloud.model.PageResourceMonitoringIncidentEventResource;
import com.knetikcloud.model.PageResourceMonitoringIncidentResource;
import com.knetikcloud.model.PageResourceMonitoringMetricResource;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MonitoringApi
 */
public class MonitoringApiTest {

    private MonitoringApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MonitoringApi.class);
    }

    /**
     * Create a new alert
     *
     * &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions:&lt;/b&gt; POST&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; POST
     */
    @Test
    public void createAlertTest() {
        MonitoringAlertResource alertResource = null;
        // MonitoringAlertResource response = api.createAlert(alertResource);

        // TODO: test validations
    }
    /**
     * Create a new metric
     *
     * &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions:&lt;/b&gt; POST&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; POST
     */
    @Test
    public void createMetricTest() {
        MonitoringMetricResource metricResource = null;
        // MonitoringMetricResource response = api.createMetric(metricResource);

        // TODO: test validations
    }
    /**
     * Delete an existing alert
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE
     */
    @Test
    public void deleteAlertTest() {
        String id = null;
        // Void response = api.deleteAlert(id);

        // TODO: test validations
    }
    /**
     * End an existing incident
     *
     * Does not delete the incident, but marks it as resolved by setting the end date.&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE
     */
    @Test
    public void deleteIncidentTest() {
        String id = null;
        // Void response = api.deleteIncident(id);

        // TODO: test validations
    }
    /**
     * Delete an existing metric
     *
     * This will delete all metrics referencing this metric as its parent.  &lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE
     */
    @Test
    public void deleteMetricTest() {
        String id = null;
        // Void response = api.deleteMetric(id);

        // TODO: test validations
    }
    /**
     * Get a single alert
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; GET&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; GET
     */
    @Test
    public void getAlertTest() {
        String id = null;
        // MonitoringAlertResource response = api.getAlert(id);

        // TODO: test validations
    }
    /**
     * List and search alerts
     *
     * Get a list of alerts with optional filtering. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LIST&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; NONE
     */
    @Test
    public void getAlertsTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceMonitoringAlertResource response = api.getAlerts(size, page, order);

        // TODO: test validations
    }
    /**
     * Get a single incident
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; GET&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; GET
     */
    @Test
    public void getIncidentTest() {
        String id = null;
        // MonitoringIncidentResource response = api.getIncident(id);

        // TODO: test validations
    }
    /**
     * Get the events of an incident
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; LIST&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LIST
     */
    @Test
    public void getIncidentEventsTest() {
        String id = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceMonitoringIncidentEventResource response = api.getIncidentEvents(id, size, page, order);

        // TODO: test validations
    }
    /**
     * List and search incidents
     *
     * Get a list of incidents with optional filtering. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LIST&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; NONE
     */
    @Test
    public void getIncidentsTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceMonitoringIncidentResource response = api.getIncidents(size, page, order);

        // TODO: test validations
    }
    /**
     * Get a single metric
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; GET&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; GET
     */
    @Test
    public void getMetricTest() {
        String id = null;
        // MonitoringMetricResource response = api.getMetric(id);

        // TODO: test validations
    }
    /**
     * List and search metrics
     *
     * Get a list of metrics with optional filtering. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LIST&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LIST
     */
    @Test
    public void getMetricsTest() {
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceMonitoringMetricResource response = api.getMetrics(size, page, order);

        // TODO: test validations
    }
    /**
     * Post a metric datapoint
     *
     * Only works with counter and gauge metrics. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; RECORD&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; RECORD
     */
    @Test
    public void postDatapointTest() {
        String id = null;
        MonitoringMetricDatapointResource metricDatapoint = null;
        // Void response = api.postDatapoint(id, metricDatapoint);

        // TODO: test validations
    }
    /**
     * Report an incident event
     *
     * Updates the current incident for an alert or starts a new one if none current. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions:&lt;/b&gt; POST&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; POST
     */
    @Test
    public void receiveEventTest() {
        MonitoringIncidentEventResource incidentResource = null;
        // MonitoringIncidentResource response = api.receiveEvent(incidentResource);

        // TODO: test validations
    }
    /**
     * Start recording a metric
     *
     * Only works with delta and timer metrics. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; RECORD&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; RECORD
     */
    @Test
    public void startRecordMetricTest() {
        String id = null;
        MonitoringMetricRecordResource metricRecord = null;
        // Void response = api.startRecordMetric(id, metricRecord);

        // TODO: test validations
    }
    /**
     * Stop recording a metric
     *
     * Only works with delta and timer metrics. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; RECORD&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; RECORD
     */
    @Test
    public void stopRecordMetricTest() {
        String id = null;
        MonitoringMetricRecordResource metricRecord = null;
        // Void response = api.stopRecordMetric(id, metricRecord);

        // TODO: test validations
    }
    /**
     * Update an existing alert
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; PUT&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PUT
     */
    @Test
    public void updateAlertTest() {
        String id = null;
        MonitoringAlertResource alertResource = null;
        // Void response = api.updateAlert(id, alertResource);

        // TODO: test validations
    }
    /**
     * Update an existing metric
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; PUT&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PUT
     */
    @Test
    public void updateMetricTest() {
        String id = null;
        MonitoringMetricResource metricResource = null;
        // Void response = api.updateMetric(id, metricResource);

        // TODO: test validations
    }
}
