# LocationsApi

All URIs are relative to *https://devsandbox.knetikcloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCountries**](LocationsApi.md#getCountries) | **GET** location/countries | Get a list of countries
[**getCountryByGeoLocation**](LocationsApi.md#getCountryByGeoLocation) | **GET** location/geolocation/country | Get the iso3 code of your country
[**getCountryStates**](LocationsApi.md#getCountryStates) | **GET** location/countries/{country_code_iso3}/states | Get a list of a country&#39;s states
[**getCurrencyByGeoLocation**](LocationsApi.md#getCurrencyByGeoLocation) | **GET** location/geolocation/currency | Get the currency information of your country


<a name="getCountries"></a>
# **getCountries**
> PageResourceCountryResource getCountries(size, page)

Get a list of countries

&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.LocationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

LocationsApi apiInstance = new LocationsApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    PageResourceCountryResource result = apiInstance.getCountries(size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#getCountries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**PageResourceCountryResource**](PageResourceCountryResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCountryByGeoLocation"></a>
# **getCountryByGeoLocation**
> StringWrapper getCountryByGeoLocation()

Get the iso3 code of your country

Determined by geo ip location. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.LocationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

LocationsApi apiInstance = new LocationsApi();
try {
    StringWrapper result = apiInstance.getCountryByGeoLocation();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#getCountryByGeoLocation");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**StringWrapper**](StringWrapper.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCountryStates"></a>
# **getCountryStates**
> PageResourceStateResource getCountryStates(countryCodeIso3, size, page)

Get a list of a country&#39;s states

&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.LocationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

LocationsApi apiInstance = new LocationsApi();
String countryCodeIso3 = "countryCodeIso3_example"; // String | The iso3 code of the country
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    PageResourceStateResource result = apiInstance.getCountryStates(countryCodeIso3, size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#getCountryStates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCodeIso3** | **String**| The iso3 code of the country |
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**PageResourceStateResource**](PageResourceStateResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCurrencyByGeoLocation"></a>
# **getCurrencyByGeoLocation**
> CurrencyResource getCurrencyByGeoLocation()

Get the currency information of your country

Determined by geo ip location, currency to country mapping and a fallback setting. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.LocationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

LocationsApi apiInstance = new LocationsApi();
try {
    CurrencyResource result = apiInstance.getCurrencyByGeoLocation();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#getCurrencyByGeoLocation");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CurrencyResource**](CurrencyResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

