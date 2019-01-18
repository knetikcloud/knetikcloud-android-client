# AuthProvidersApi

All URIs are relative to *https://devsandbox.knetikcloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProvider**](AuthProvidersApi.md#createProvider) | **POST** auth/providers | Create a new OAuth 2 provider
[**deleteProvider**](AuthProvidersApi.md#deleteProvider) | **DELETE** auth/providers/{provider_id} | Delete an existing OAuth 2 provider
[**getProvider**](AuthProvidersApi.md#getProvider) | **GET** auth/providers/{provider_id} | Get an existing OAuth 2 provider
[**getProviders**](AuthProvidersApi.md#getProviders) | **GET** auth/providers | List OAuth 2 providers
[**updateProvider**](AuthProvidersApi.md#updateProvider) | **PUT** auth/providers/{provider_id} | Update an existing OAuth 2 provider


<a name="createProvider"></a>
# **createProvider**
> OAuth2ProviderResource createProvider(providerResource)

Create a new OAuth 2 provider

&lt;b&gt;Permissions Needed:&lt;/b&gt; POST

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.AuthProvidersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

AuthProvidersApi apiInstance = new AuthProvidersApi();
OAuth2ProviderResource providerResource = new OAuth2ProviderResource(); // OAuth2ProviderResource | providerResource
try {
    OAuth2ProviderResource result = apiInstance.createProvider(providerResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthProvidersApi#createProvider");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providerResource** | [**OAuth2ProviderResource**](OAuth2ProviderResource.md)| providerResource |

### Return type

[**OAuth2ProviderResource**](OAuth2ProviderResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProvider"></a>
# **deleteProvider**
> Void deleteProvider(providerId)

Delete an existing OAuth 2 provider

&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.AuthProvidersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

AuthProvidersApi apiInstance = new AuthProvidersApi();
String providerId = "providerId_example"; // String | provider_id
try {
    Void result = apiInstance.deleteProvider(providerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthProvidersApi#deleteProvider");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providerId** | **String**| provider_id |

### Return type

[**Void**](.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProvider"></a>
# **getProvider**
> OAuth2ProviderResource getProvider(providerId)

Get an existing OAuth 2 provider

&lt;b&gt;Permissions Needed:&lt;/b&gt; GET

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.AuthProvidersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

AuthProvidersApi apiInstance = new AuthProvidersApi();
String providerId = "providerId_example"; // String | provider_id
try {
    OAuth2ProviderResource result = apiInstance.getProvider(providerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthProvidersApi#getProvider");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providerId** | **String**| provider_id |

### Return type

[**OAuth2ProviderResource**](OAuth2ProviderResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProviders"></a>
# **getProviders**
> PageResourceOAuth2ProviderResource getProviders()

List OAuth 2 providers

&lt;b&gt;Permissions Needed:&lt;/b&gt; LIST

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.AuthProvidersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

AuthProvidersApi apiInstance = new AuthProvidersApi();
try {
    PageResourceOAuth2ProviderResource result = apiInstance.getProviders();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthProvidersApi#getProviders");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PageResourceOAuth2ProviderResource**](PageResourceOAuth2ProviderResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateProvider"></a>
# **updateProvider**
> Void updateProvider(providerId, providerResource)

Update an existing OAuth 2 provider

&lt;b&gt;Permissions Needed:&lt;/b&gt; PUT

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.AuthProvidersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

AuthProvidersApi apiInstance = new AuthProvidersApi();
String providerId = "providerId_example"; // String | provider_id
OAuth2ProviderResource providerResource = new OAuth2ProviderResource(); // OAuth2ProviderResource | providerResource
try {
    Void result = apiInstance.updateProvider(providerId, providerResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthProvidersApi#updateProvider");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providerId** | **String**| provider_id |
 **providerResource** | [**OAuth2ProviderResource**](OAuth2ProviderResource.md)| providerResource |

### Return type

[**Void**](.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

