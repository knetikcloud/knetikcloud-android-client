# MonitoringApi

All URIs are relative to *https://devsandbox.knetikcloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAlert**](MonitoringApi.md#createAlert) | **POST** monitoring/alerts | Create a new alert
[**createMetric**](MonitoringApi.md#createMetric) | **POST** monitoring/metrics | Create a new metric
[**deleteAlert**](MonitoringApi.md#deleteAlert) | **DELETE** monitoring/alerts/{id} | Delete an existing alert
[**deleteIncident**](MonitoringApi.md#deleteIncident) | **DELETE** monitoring/incidents/{id} | End an existing incident
[**deleteMetric**](MonitoringApi.md#deleteMetric) | **DELETE** monitoring/metrics/{id} | Delete an existing metric
[**getAlert**](MonitoringApi.md#getAlert) | **GET** monitoring/alerts/{id} | Get a single alert
[**getAlerts**](MonitoringApi.md#getAlerts) | **GET** monitoring/alerts | List and search alerts
[**getIncident**](MonitoringApi.md#getIncident) | **GET** monitoring/incidents/{id} | Get a single incident
[**getIncidentEvents**](MonitoringApi.md#getIncidentEvents) | **GET** monitoring/incidents/{id}/events | Get the events of an incident
[**getIncidents**](MonitoringApi.md#getIncidents) | **GET** monitoring/incidents | List and search incidents
[**getMetric**](MonitoringApi.md#getMetric) | **GET** monitoring/metrics/{id} | Get a single metric
[**getMetrics**](MonitoringApi.md#getMetrics) | **GET** monitoring/metrics | List and search metrics
[**postDatapoint**](MonitoringApi.md#postDatapoint) | **POST** monitoring/metrics/{id}/datapoints | Post a metric datapoint
[**receiveEvent**](MonitoringApi.md#receiveEvent) | **POST** monitoring/incidents | Report an incident event
[**startRecordMetric**](MonitoringApi.md#startRecordMetric) | **POST** monitoring/metrics/{id}/start | Start recording a metric
[**stopRecordMetric**](MonitoringApi.md#stopRecordMetric) | **POST** monitoring/metrics/{id}/stop | Stop recording a metric
[**updateAlert**](MonitoringApi.md#updateAlert) | **PUT** monitoring/alerts/{id} | Update an existing alert
[**updateMetric**](MonitoringApi.md#updateMetric) | **PUT** monitoring/metrics/{id} | Update an existing metric


<a name="createAlert"></a>
# **createAlert**
> MonitoringAlertResource createAlert(alertResource)

Create a new alert

&lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions:&lt;/b&gt; POST&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; POST

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.MonitoringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

MonitoringApi apiInstance = new MonitoringApi();
MonitoringAlertResource alertResource = new MonitoringAlertResource(); // MonitoringAlertResource | The alert object
try {
    MonitoringAlertResource result = apiInstance.createAlert(alertResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonitoringApi#createAlert");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alertResource** | [**MonitoringAlertResource**](MonitoringAlertResource.md)| The alert object | [optional]

### Return type

[**MonitoringAlertResource**](MonitoringAlertResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createMetric"></a>
# **createMetric**
> MonitoringMetricResource createMetric(metricResource)

Create a new metric

&lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions:&lt;/b&gt; POST&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; POST

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.MonitoringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

MonitoringApi apiInstance = new MonitoringApi();
MonitoringMetricResource metricResource = new MonitoringMetricResource(); // MonitoringMetricResource | The new metric
try {
    MonitoringMetricResource result = apiInstance.createMetric(metricResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonitoringApi#createMetric");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **metricResource** | [**MonitoringMetricResource**](MonitoringMetricResource.md)| The new metric | [optional]

### Return type

[**MonitoringMetricResource**](MonitoringMetricResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAlert"></a>
# **deleteAlert**
> Void deleteAlert(id)

Delete an existing alert

&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.MonitoringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

MonitoringApi apiInstance = new MonitoringApi();
String id = "id_example"; // String | The alert id
try {
    Void result = apiInstance.deleteAlert(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonitoringApi#deleteAlert");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The alert id |

### Return type

[**Void**](.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteIncident"></a>
# **deleteIncident**
> Void deleteIncident(id)

End an existing incident

Does not delete the incident, but marks it as resolved by setting the end date.&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.MonitoringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

MonitoringApi apiInstance = new MonitoringApi();
String id = "id_example"; // String | The incident id
try {
    Void result = apiInstance.deleteIncident(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonitoringApi#deleteIncident");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The incident id |

### Return type

[**Void**](.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteMetric"></a>
# **deleteMetric**
> Void deleteMetric(id)

Delete an existing metric

This will delete all metrics referencing this metric as its parent.  &lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.MonitoringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

MonitoringApi apiInstance = new MonitoringApi();
String id = "id_example"; // String | The metric id
try {
    Void result = apiInstance.deleteMetric(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonitoringApi#deleteMetric");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The metric id |

### Return type

[**Void**](.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAlert"></a>
# **getAlert**
> MonitoringAlertResource getAlert(id)

Get a single alert

&lt;b&gt;Permissions Needed:&lt;/b&gt; GET&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; GET

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.MonitoringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

MonitoringApi apiInstance = new MonitoringApi();
String id = "id_example"; // String | The alert id
try {
    MonitoringAlertResource result = apiInstance.getAlert(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonitoringApi#getAlert");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The alert id |

### Return type

[**MonitoringAlertResource**](MonitoringAlertResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAlerts"></a>
# **getAlerts**
> PageResourceMonitoringAlertResource getAlerts(size, page, order)

List and search alerts

Get a list of alerts with optional filtering. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LIST&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; NONE

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.MonitoringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

MonitoringApi apiInstance = new MonitoringApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceMonitoringAlertResource result = apiInstance.getAlerts(size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonitoringApi#getAlerts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to id:ASC]

### Return type

[**PageResourceMonitoringAlertResource**](PageResourceMonitoringAlertResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIncident"></a>
# **getIncident**
> MonitoringIncidentResource getIncident(id)

Get a single incident

&lt;b&gt;Permissions Needed:&lt;/b&gt; GET&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; GET

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.MonitoringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

MonitoringApi apiInstance = new MonitoringApi();
String id = "id_example"; // String | The incident id
try {
    MonitoringIncidentResource result = apiInstance.getIncident(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonitoringApi#getIncident");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The incident id |

### Return type

[**MonitoringIncidentResource**](MonitoringIncidentResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIncidentEvents"></a>
# **getIncidentEvents**
> PageResourceMonitoringIncidentEventResource getIncidentEvents(id, size, page, order)

Get the events of an incident

&lt;b&gt;Permissions Needed:&lt;/b&gt; LIST&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LIST

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.MonitoringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

MonitoringApi apiInstance = new MonitoringApi();
String id = "id_example"; // String | The incident id
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceMonitoringIncidentEventResource result = apiInstance.getIncidentEvents(id, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonitoringApi#getIncidentEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The incident id |
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to id:ASC]

### Return type

[**PageResourceMonitoringIncidentEventResource**](PageResourceMonitoringIncidentEventResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIncidents"></a>
# **getIncidents**
> PageResourceMonitoringIncidentResource getIncidents(size, page, order)

List and search incidents

Get a list of incidents with optional filtering. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LIST&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; NONE

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.MonitoringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

MonitoringApi apiInstance = new MonitoringApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceMonitoringIncidentResource result = apiInstance.getIncidents(size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonitoringApi#getIncidents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to id:ASC]

### Return type

[**PageResourceMonitoringIncidentResource**](PageResourceMonitoringIncidentResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMetric"></a>
# **getMetric**
> MonitoringMetricResource getMetric(id)

Get a single metric

&lt;b&gt;Permissions Needed:&lt;/b&gt; GET&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; GET

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.MonitoringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

MonitoringApi apiInstance = new MonitoringApi();
String id = "id_example"; // String | The metric id
try {
    MonitoringMetricResource result = apiInstance.getMetric(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonitoringApi#getMetric");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The metric id |

### Return type

[**MonitoringMetricResource**](MonitoringMetricResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMetrics"></a>
# **getMetrics**
> PageResourceMonitoringMetricResource getMetrics(size, page, order)

List and search metrics

Get a list of metrics with optional filtering. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LIST&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LIST

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.MonitoringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

MonitoringApi apiInstance = new MonitoringApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceMonitoringMetricResource result = apiInstance.getMetrics(size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonitoringApi#getMetrics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to id:ASC]

### Return type

[**PageResourceMonitoringMetricResource**](PageResourceMonitoringMetricResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postDatapoint"></a>
# **postDatapoint**
> Void postDatapoint(id, metricDatapoint)

Post a metric datapoint

Only works with counter and gauge metrics. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; RECORD&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; RECORD

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.MonitoringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

MonitoringApi apiInstance = new MonitoringApi();
String id = "id_example"; // String | The metric id
MonitoringMetricDatapointResource metricDatapoint = new MonitoringMetricDatapointResource(); // MonitoringMetricDatapointResource | The metric datapoint
try {
    Void result = apiInstance.postDatapoint(id, metricDatapoint);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonitoringApi#postDatapoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The metric id |
 **metricDatapoint** | [**MonitoringMetricDatapointResource**](MonitoringMetricDatapointResource.md)| The metric datapoint | [optional]

### Return type

[**Void**](.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="receiveEvent"></a>
# **receiveEvent**
> MonitoringIncidentResource receiveEvent(incidentResource)

Report an incident event

Updates the current incident for an alert or starts a new one if none current. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions:&lt;/b&gt; POST&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; POST

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.MonitoringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

MonitoringApi apiInstance = new MonitoringApi();
MonitoringIncidentEventResource incidentResource = new MonitoringIncidentEventResource(); // MonitoringIncidentEventResource | The new incident
try {
    MonitoringIncidentResource result = apiInstance.receiveEvent(incidentResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonitoringApi#receiveEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **incidentResource** | [**MonitoringIncidentEventResource**](MonitoringIncidentEventResource.md)| The new incident | [optional]

### Return type

[**MonitoringIncidentResource**](MonitoringIncidentResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="startRecordMetric"></a>
# **startRecordMetric**
> Void startRecordMetric(id, metricRecord)

Start recording a metric

Only works with delta and timer metrics. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; RECORD&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; RECORD

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.MonitoringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

MonitoringApi apiInstance = new MonitoringApi();
String id = "id_example"; // String | The metric id
MonitoringMetricRecordResource metricRecord = new MonitoringMetricRecordResource(); // MonitoringMetricRecordResource | The metric record
try {
    Void result = apiInstance.startRecordMetric(id, metricRecord);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonitoringApi#startRecordMetric");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The metric id |
 **metricRecord** | [**MonitoringMetricRecordResource**](MonitoringMetricRecordResource.md)| The metric record | [optional]

### Return type

[**Void**](.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="stopRecordMetric"></a>
# **stopRecordMetric**
> Void stopRecordMetric(id, metricRecord)

Stop recording a metric

Only works with delta and timer metrics. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; RECORD&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; RECORD

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.MonitoringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

MonitoringApi apiInstance = new MonitoringApi();
String id = "id_example"; // String | The metric id
MonitoringMetricRecordResource metricRecord = new MonitoringMetricRecordResource(); // MonitoringMetricRecordResource | The metric record
try {
    Void result = apiInstance.stopRecordMetric(id, metricRecord);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonitoringApi#stopRecordMetric");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The metric id |
 **metricRecord** | [**MonitoringMetricRecordResource**](MonitoringMetricRecordResource.md)| The metric record | [optional]

### Return type

[**Void**](.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAlert"></a>
# **updateAlert**
> Void updateAlert(id, alertResource)

Update an existing alert

&lt;b&gt;Permissions Needed:&lt;/b&gt; PUT&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PUT

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.MonitoringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

MonitoringApi apiInstance = new MonitoringApi();
String id = "id_example"; // String | The alert id
MonitoringAlertResource alertResource = new MonitoringAlertResource(); // MonitoringAlertResource | The alert object
try {
    Void result = apiInstance.updateAlert(id, alertResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonitoringApi#updateAlert");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The alert id |
 **alertResource** | [**MonitoringAlertResource**](MonitoringAlertResource.md)| The alert object | [optional]

### Return type

[**Void**](.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateMetric"></a>
# **updateMetric**
> Void updateMetric(id, metricResource)

Update an existing metric

&lt;b&gt;Permissions Needed:&lt;/b&gt; PUT&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PUT

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.MonitoringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

MonitoringApi apiInstance = new MonitoringApi();
String id = "id_example"; // String | The metric id
MonitoringMetricResource metricResource = new MonitoringMetricResource(); // MonitoringMetricResource | The metric object
try {
    Void result = apiInstance.updateMetric(id, metricResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonitoringApi#updateMetric");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The metric id |
 **metricResource** | [**MonitoringMetricResource**](MonitoringMetricResource.md)| The metric object | [optional]

### Return type

[**Void**](.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

