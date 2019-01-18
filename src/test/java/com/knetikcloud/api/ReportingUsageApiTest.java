package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.PageResourceUsageInfo;
import com.knetikcloud.model.PageResourcestring;
import com.knetikcloud.model.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReportingUsageApi
 */
public class ReportingUsageApiTest {

    private ReportingUsageApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ReportingUsageApi.class);
    }

    /**
     * Returns aggregated endpoint usage information by day
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; USAGE_ADMIN
     */
    @Test
    public void getUsageByDayTest() {
        Long startDate = null;
        Long endDate = null;
        Boolean combineEndpoints = null;
        String method = null;
        String url = null;
        Integer size = null;
        Integer page = null;
        // PageResourceUsageInfo response = api.getUsageByDay(startDate, endDate, combineEndpoints, method, url, size, page);

        // TODO: test validations
    }
    /**
     * Returns aggregated endpoint usage information by hour
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; USAGE_ADMIN
     */
    @Test
    public void getUsageByHourTest() {
        Long startDate = null;
        Long endDate = null;
        Boolean combineEndpoints = null;
        String method = null;
        String url = null;
        Integer size = null;
        Integer page = null;
        // PageResourceUsageInfo response = api.getUsageByHour(startDate, endDate, combineEndpoints, method, url, size, page);

        // TODO: test validations
    }
    /**
     * Returns aggregated endpoint usage information by minute
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; USAGE_ADMIN
     */
    @Test
    public void getUsageByMinuteTest() {
        Long startDate = null;
        Long endDate = null;
        Boolean combineEndpoints = null;
        String method = null;
        String url = null;
        Integer size = null;
        Integer page = null;
        // PageResourceUsageInfo response = api.getUsageByMinute(startDate, endDate, combineEndpoints, method, url, size, page);

        // TODO: test validations
    }
    /**
     * Returns aggregated endpoint usage information by month
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; USAGE_ADMIN
     */
    @Test
    public void getUsageByMonthTest() {
        Long startDate = null;
        Long endDate = null;
        Boolean combineEndpoints = null;
        String method = null;
        String url = null;
        Integer size = null;
        Integer page = null;
        // PageResourceUsageInfo response = api.getUsageByMonth(startDate, endDate, combineEndpoints, method, url, size, page);

        // TODO: test validations
    }
    /**
     * Returns aggregated endpoint usage information by year
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; USAGE_ADMIN
     */
    @Test
    public void getUsageByYearTest() {
        Long startDate = null;
        Long endDate = null;
        Boolean combineEndpoints = null;
        String method = null;
        String url = null;
        Integer size = null;
        Integer page = null;
        // PageResourceUsageInfo response = api.getUsageByYear(startDate, endDate, combineEndpoints, method, url, size, page);

        // TODO: test validations
    }
    /**
     * Returns list of endpoints called (method and url)
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; USAGE_ADMIN
     */
    @Test
    public void getUsageEndpointsTest() {
        Long startDate = null;
        Long endDate = null;
        // PageResourcestring response = api.getUsageEndpoints(startDate, endDate);

        // TODO: test validations
    }
}
