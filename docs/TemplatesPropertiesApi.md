# TemplatesPropertiesApi

All URIs are relative to *https://devsandbox.knetikcloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTemplatePropertyType**](TemplatesPropertiesApi.md#getTemplatePropertyType) | **GET** templates/properties/{type} | Get details for a template property type
[**getTemplatePropertyTypes**](TemplatesPropertiesApi.md#getTemplatePropertyTypes) | **GET** templates/properties | List template property types


<a name="getTemplatePropertyType"></a>
# **getTemplatePropertyType**
> PropertyFieldListResource getTemplatePropertyType(type, size, page)

Get details for a template property type

&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; NONE

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.TemplatesPropertiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

TemplatesPropertiesApi apiInstance = new TemplatesPropertiesApi();
String type = "type_example"; // String | type
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    PropertyFieldListResource result = apiInstance.getTemplatePropertyType(type, size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplatesPropertiesApi#getTemplatePropertyType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| type |
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**PropertyFieldListResource**](PropertyFieldListResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTemplatePropertyTypes"></a>
# **getTemplatePropertyTypes**
> PageResourcePropertyFieldListResource getTemplatePropertyTypes()

List template property types

&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; NONE

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.TemplatesPropertiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

TemplatesPropertiesApi apiInstance = new TemplatesPropertiesApi();
try {
    PageResourcePropertyFieldListResource result = apiInstance.getTemplatePropertyTypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplatesPropertiesApi#getTemplatePropertyTypes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PageResourcePropertyFieldListResource**](PageResourcePropertyFieldListResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

