# AuthUsersApi

All URIs are relative to *https://devsandbox.knetikcloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSid**](AuthUsersApi.md#addSid) | **POST** access/users/{user_id}/sids | Add a sid to a user
[**getResources1**](AuthUsersApi.md#getResources1) | **GET** access/users/{user_id}/sids | List and search user sids
[**getSid**](AuthUsersApi.md#getSid) | **GET** access/users/{user_id}/sids/{sid} | Get a user sid
[**removeSid**](AuthUsersApi.md#removeSid) | **DELETE** access/users/{user_id}/sids/{sid} | Remove a sid from a user


<a name="addSid"></a>
# **addSid**
> UserSidResource addSid(userId, sid)

Add a sid to a user

No error returned if the user already has the sid. &lt;b&gt;Resources Needed:&lt;/b&gt; ROLE_SUPER_ADMIN

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.AuthUsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

AuthUsersApi apiInstance = new AuthUsersApi();
Integer userId = 56; // Integer | The user id
UserSidResource sid = new UserSidResource(); // UserSidResource | The new sid for the user
try {
    UserSidResource result = apiInstance.addSid(userId, sid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthUsersApi#addSid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The user id |
 **sid** | [**UserSidResource**](UserSidResource.md)| The new sid for the user | [optional]

### Return type

[**UserSidResource**](UserSidResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getResources1"></a>
# **getResources1**
> PageResourceUserSidResource getResources1(userId, size, page, order)

List and search user sids

&lt;b&gt;Resources Needed:&lt;/b&gt; VIEW_ACCESS

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.AuthUsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

AuthUsersApi apiInstance = new AuthUsersApi();
Integer userId = 56; // Integer | The resource type
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "resource:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceUserSidResource result = apiInstance.getResources1(userId, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthUsersApi#getResources1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The resource type |
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to resource:ASC]

### Return type

[**PageResourceUserSidResource**](PageResourceUserSidResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSid"></a>
# **getSid**
> UserSidResource getSid(userId, sid)

Get a user sid

Http error 404 means the user does not have the sid&lt;b&gt;Resources Needed:&lt;/b&gt; VIEW_ACCESS

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.AuthUsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

AuthUsersApi apiInstance = new AuthUsersApi();
Integer userId = 56; // Integer | The user id
String sid = "sid_example"; // String | The security id
try {
    UserSidResource result = apiInstance.getSid(userId, sid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthUsersApi#getSid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The user id |
 **sid** | **String**| The security id |

### Return type

[**UserSidResource**](UserSidResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeSid"></a>
# **removeSid**
> Void removeSid(userId, sid)

Remove a sid from a user

No error returned if the suer does not have the sid. &lt;b&gt;Resources Needed:&lt;/b&gt; ROLE_SUPER_ADMIN

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.AuthUsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

AuthUsersApi apiInstance = new AuthUsersApi();
Integer userId = 56; // Integer | The user id
String sid = "sid_example"; // String | The security id
try {
    Void result = apiInstance.removeSid(userId, sid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthUsersApi#removeSid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**| The user id |
 **sid** | **String**| The security id |

### Return type

[**Void**](.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

