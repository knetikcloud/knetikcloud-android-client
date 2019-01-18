# AuthTypesApi

All URIs are relative to *https://devsandbox.knetikcloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**allowedResourceActions**](AuthTypesApi.md#allowedResourceActions) | **GET** access/resources/{type}/{id}/actions | Get allowed action
[**allowedTypeActions**](AuthTypesApi.md#allowedTypeActions) | **GET** access/types/{type}/actions | Get allowed actions on a type
[**createResource**](AuthTypesApi.md#createResource) | **POST** access/resources/{type} | Create or update resource
[**createType**](AuthTypesApi.md#createType) | **POST** access/types | Create a new type
[**deleteAllOfType**](AuthTypesApi.md#deleteAllOfType) | **DELETE** access/resources/{type} | Delete all resources of a type
[**deleteResource**](AuthTypesApi.md#deleteResource) | **DELETE** access/resources/{type}/{id} | Delete a resource
[**deleteType**](AuthTypesApi.md#deleteType) | **DELETE** access/types/{type} | Delete a root type
[**getResource**](AuthTypesApi.md#getResource) | **GET** access/resources/{type}/{id} | Get a single resource
[**getResources**](AuthTypesApi.md#getResources) | **GET** access/resources/{type} | List and search resources
[**getType**](AuthTypesApi.md#getType) | **GET** access/types/{type} | Get a single root type
[**getTypes**](AuthTypesApi.md#getTypes) | **GET** access/types | List and search types
[**updateResource**](AuthTypesApi.md#updateResource) | **PUT** access/resources/{type}/{id} | Update a resource
[**updateType**](AuthTypesApi.md#updateType) | **PUT** access/types/{type} | Update a root type


<a name="allowedResourceActions"></a>
# **allowedResourceActions**
> PageResourceAccessResultsResource allowedResourceActions(type, id, size, page)

Get allowed action

Checks for which actions can be taken against a given resource by the caller. &lt;b&gt;Types Needed:&lt;/b&gt; any

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.AuthTypesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

AuthTypesApi apiInstance = new AuthTypesApi();
String type = "type_example"; // String | The type value
String id = "id_example"; // String | The resource id
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    PageResourceAccessResultsResource result = apiInstance.allowedResourceActions(type, id, size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthTypesApi#allowedResourceActions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| The type value |
 **id** | **String**| The resource id |
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**PageResourceAccessResultsResource**](PageResourceAccessResultsResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="allowedTypeActions"></a>
# **allowedTypeActions**
> PageResourceAccessResultsResource allowedTypeActions(type, size, page)

Get allowed actions on a type

Checks for which actions can be taken against a given type by the caller. &lt;b&gt;Types Needed:&lt;/b&gt; any

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.AuthTypesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

AuthTypesApi apiInstance = new AuthTypesApi();
String type = "type_example"; // String | The type value
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    PageResourceAccessResultsResource result = apiInstance.allowedTypeActions(type, size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthTypesApi#allowedTypeActions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| The type value |
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**PageResourceAccessResultsResource**](PageResourceAccessResultsResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createResource"></a>
# **createResource**
> AccessTypeResource createResource(type, accessResource)

Create or update resource

Creates the access control for a resource if it does not exist, and updates parent information if it does not.&lt;b&gt;Resources Needed:&lt;/b&gt; ROLE_SUPER_ADMIN

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.AuthTypesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

AuthTypesApi apiInstance = new AuthTypesApi();
String type = "type_example"; // String | The resource type
AccessResourceCreateRequest accessResource = new AccessResourceCreateRequest(); // AccessResourceCreateRequest | The access rules for the resource
try {
    AccessTypeResource result = apiInstance.createResource(type, accessResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthTypesApi#createResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| The resource type |
 **accessResource** | [**AccessResourceCreateRequest**](AccessResourceCreateRequest.md)| The access rules for the resource | [optional]

### Return type

[**AccessTypeResource**](AccessTypeResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createType"></a>
# **createType**
> AccessTypeResource createType(typeResource)

Create a new type

&lt;b&gt;Types Needed:&lt;/b&gt; ROLE_SUPER_ADMIN

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.AuthTypesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

AuthTypesApi apiInstance = new AuthTypesApi();
AccessTypeResource typeResource = new AccessTypeResource(); // AccessTypeResource | The type resource object
try {
    AccessTypeResource result = apiInstance.createType(typeResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthTypesApi#createType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **typeResource** | [**AccessTypeResource**](AccessTypeResource.md)| The type resource object | [optional]

### Return type

[**AccessTypeResource**](AccessTypeResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAllOfType"></a>
# **deleteAllOfType**
> Void deleteAllOfType(type)

Delete all resources of a type

&lt;b&gt;Types Needed:&lt;/b&gt; ROLE_SUPER_ADMIN

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.AuthTypesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

AuthTypesApi apiInstance = new AuthTypesApi();
String type = "type_example"; // String | The type value
try {
    Void result = apiInstance.deleteAllOfType(type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthTypesApi#deleteAllOfType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| The type value |

### Return type

[**Void**](.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteResource"></a>
# **deleteResource**
> Void deleteResource(type, id)

Delete a resource

Deletes a non-root level type&lt;br /&gt;&lt;b&gt;Types Needed:&lt;/b&gt; ROLE_SUPER_ADMIN

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.AuthTypesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

AuthTypesApi apiInstance = new AuthTypesApi();
String type = "type_example"; // String | The type value
String id = "id_example"; // String | The resource id
try {
    Void result = apiInstance.deleteResource(type, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthTypesApi#deleteResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| The type value |
 **id** | **String**| The resource id |

### Return type

[**Void**](.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteType"></a>
# **deleteType**
> Void deleteType(type)

Delete a root type

Deletes a root level type with no id&lt;br /&gt;&lt;b&gt;Types Needed:&lt;/b&gt; ROLE_SUPER_ADMIN

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.AuthTypesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

AuthTypesApi apiInstance = new AuthTypesApi();
String type = "type_example"; // String | The type value
try {
    Void result = apiInstance.deleteType(type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthTypesApi#deleteType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| The type value |

### Return type

[**Void**](.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getResource"></a>
# **getResource**
> AccessTypeResource getResource(type, id)

Get a single resource

&lt;b&gt;Types Needed:&lt;/b&gt; VIEW_ACCESS

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.AuthTypesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

AuthTypesApi apiInstance = new AuthTypesApi();
String type = "type_example"; // String | The type value
String id = "id_example"; // String | The resource id
try {
    AccessTypeResource result = apiInstance.getResource(type, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthTypesApi#getResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| The type value |
 **id** | **String**| The resource id |

### Return type

[**AccessTypeResource**](AccessTypeResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getResources"></a>
# **getResources**
> PageResourceAccessTypeResource getResources(type, filterType, size, page, order)

List and search resources

&lt;b&gt;Types Needed:&lt;/b&gt; ROLE_SUPER_ADMIN

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.AuthTypesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

AuthTypesApi apiInstance = new AuthTypesApi();
String type = "type_example"; // String | The type value
String filterType = "filterType_example"; // String | Filter for a specific type
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "type:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceAccessTypeResource result = apiInstance.getResources(type, filterType, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthTypesApi#getResources");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| The type value |
 **filterType** | **String**| Filter for a specific type | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to type:ASC]

### Return type

[**PageResourceAccessTypeResource**](PageResourceAccessTypeResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getType"></a>
# **getType**
> AccessTypeResource getType(type)

Get a single root type

&lt;b&gt;Types Needed:&lt;/b&gt; VIEW_ACCESS

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.AuthTypesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

AuthTypesApi apiInstance = new AuthTypesApi();
String type = "type_example"; // String | The type value
try {
    AccessTypeResource result = apiInstance.getType(type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthTypesApi#getType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| The type value |

### Return type

[**AccessTypeResource**](AccessTypeResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTypes"></a>
# **getTypes**
> PageResourceAccessTypeResource getTypes(size, page, order)

List and search types

&lt;b&gt;Types Needed:&lt;/b&gt; ROLE_SUPER_ADMIN

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.AuthTypesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

AuthTypesApi apiInstance = new AuthTypesApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "type:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceAccessTypeResource result = apiInstance.getTypes(size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthTypesApi#getTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to type:ASC]

### Return type

[**PageResourceAccessTypeResource**](PageResourceAccessTypeResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateResource"></a>
# **updateResource**
> AccessTypeResource updateResource(type, id, typeResource)

Update a resource

&lt;b&gt;Types Needed:&lt;/b&gt; ACCESS_CONTROL

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.AuthTypesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

AuthTypesApi apiInstance = new AuthTypesApi();
String type = "type_example"; // String | The type value
String id = "id_example"; // String | The resource id
AccessTypeResource typeResource = new AccessTypeResource(); // AccessTypeResource | The resource object
try {
    AccessTypeResource result = apiInstance.updateResource(type, id, typeResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthTypesApi#updateResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| The type value |
 **id** | **String**| The resource id |
 **typeResource** | [**AccessTypeResource**](AccessTypeResource.md)| The resource object | [optional]

### Return type

[**AccessTypeResource**](AccessTypeResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateType"></a>
# **updateType**
> AccessTypeResource updateType(type, typeResource)

Update a root type

&lt;b&gt;Types Needed:&lt;/b&gt; ACCESS_CONTROL

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.AuthTypesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

AuthTypesApi apiInstance = new AuthTypesApi();
String type = "type_example"; // String | The type value
AccessTypeResource typeResource = new AccessTypeResource(); // AccessTypeResource | The type resource object
try {
    AccessTypeResource result = apiInstance.updateType(type, typeResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthTypesApi#updateType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| The type value |
 **typeResource** | [**AccessTypeResource**](AccessTypeResource.md)| The type resource object | [optional]

### Return type

[**AccessTypeResource**](AccessTypeResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

