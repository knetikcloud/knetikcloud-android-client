# StoreApi

All URIs are relative to *https://devsandbox.knetikcloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createItemTemplate**](StoreApi.md#createItemTemplate) | **POST** store/items/templates | Create an item template
[**createStoreItem**](StoreApi.md#createStoreItem) | **POST** store/items | Create a store item
[**deleteItemTemplate**](StoreApi.md#deleteItemTemplate) | **DELETE** store/items/templates/{id} | Delete an item template
[**deleteStoreItem**](StoreApi.md#deleteStoreItem) | **DELETE** store/items/{id} | Delete a store item
[**getBehaviors**](StoreApi.md#getBehaviors) | **GET** store/items/behaviors | List available item behaviors
[**getItemTemplate**](StoreApi.md#getItemTemplate) | **GET** store/items/templates/{id} | Get a single item template
[**getItemTemplates**](StoreApi.md#getItemTemplates) | **GET** store/items/templates | List and search item templates
[**getStoreItem**](StoreApi.md#getStoreItem) | **GET** store/items/{id} | Get a single store item
[**getStoreItems**](StoreApi.md#getStoreItems) | **GET** store/items | List and search store items
[**quickBuy**](StoreApi.md#quickBuy) | **POST** store/quick-buy | One-step purchase and pay for a single SKU item from a user&#39;s wallet
[**quickNew**](StoreApi.md#quickNew) | **POST** store/quick-new | One-step invoice creation
[**quickPaid**](StoreApi.md#quickPaid) | **POST** store/quick-paid | One-step purchase when already paid
[**quickProcessing**](StoreApi.md#quickProcessing) | **POST** store/quick-processing | One-step invoice creation when already processing
[**updateItemTemplate**](StoreApi.md#updateItemTemplate) | **PATCH** store/items/templates/{id} | Update an item template
[**updateStoreItem**](StoreApi.md#updateStoreItem) | **PUT** store/items/{id} | Update a store item


<a name="createItemTemplate"></a>
# **createItemTemplate**
> StoreItemTemplateResource createItemTemplate(itemTemplateResource)

Create an item template

Item Templates define a type of item and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; POST

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.StoreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

StoreApi apiInstance = new StoreApi();
StoreItemTemplateResource itemTemplateResource = new StoreItemTemplateResource(); // StoreItemTemplateResource | The new item template
try {
    StoreItemTemplateResource result = apiInstance.createItemTemplate(itemTemplateResource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#createItemTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemTemplateResource** | [**StoreItemTemplateResource**](StoreItemTemplateResource.md)| The new item template | [optional]

### Return type

[**StoreItemTemplateResource**](StoreItemTemplateResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createStoreItem"></a>
# **createStoreItem**
> StoreItem createStoreItem(cascade, storeItem)

Create a store item

SKUs have to be unique in the entire store. If a duplicate SKU is found, a 400 error is generated and the response will have a \&quot;parameters\&quot; field that is a list of duplicates. A duplicate is an object like {item_id, offending_sku_list}. Ex:&lt;br /&gt; {..., parameters: [[{item: 1, skus: [\&quot;SKU-1\&quot;]}]]}&lt;br /&gt; If an item is brand new and has duplicate SKUs within itself, the item ID will be 0.  Item subclasses are not allowed here, you will have to use their respective endpoints. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; STORE_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; NONE

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.StoreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

StoreApi apiInstance = new StoreApi();
Boolean cascade = false; // Boolean | Whether to cascade group changes, such as in the limited gettable behavior. A 400 error will return otherwise if the group is already in use with different values.
StoreItem storeItem = new StoreItem(); // StoreItem | The store item object
try {
    StoreItem result = apiInstance.createStoreItem(cascade, storeItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#createStoreItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cascade** | **Boolean**| Whether to cascade group changes, such as in the limited gettable behavior. A 400 error will return otherwise if the group is already in use with different values. | [optional] [default to false]
 **storeItem** | [**StoreItem**](StoreItem.md)| The store item object | [optional]

### Return type

[**StoreItem**](StoreItem.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteItemTemplate"></a>
# **deleteItemTemplate**
> Void deleteItemTemplate(id, cascade)

Delete an item template

&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; DELETE

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.StoreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

StoreApi apiInstance = new StoreApi();
String id = "id_example"; // String | The id of the template
String cascade = "cascade_example"; // String | force deleting the template if it's attached to other objects, cascade = detach
try {
    Void result = apiInstance.deleteItemTemplate(id, cascade);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#deleteItemTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the template |
 **cascade** | **String**| force deleting the template if it&#39;s attached to other objects, cascade &#x3D; detach | [optional]

### Return type

[**Void**](.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteStoreItem"></a>
# **deleteStoreItem**
> Void deleteStoreItem(id)

Delete a store item

&lt;b&gt;Permissions Needed:&lt;/b&gt; STORE_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; NONE

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.StoreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

StoreApi apiInstance = new StoreApi();
Integer id = 56; // Integer | The id of the item
try {
    Void result = apiInstance.deleteStoreItem(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#deleteStoreItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the item |

### Return type

[**Void**](.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBehaviors"></a>
# **getBehaviors**
> PageResourceBehaviorDefinitionResource getBehaviors(size, page)

List available item behaviors

&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; NONE

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.StoreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

StoreApi apiInstance = new StoreApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
try {
    PageResourceBehaviorDefinitionResource result = apiInstance.getBehaviors(size, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#getBehaviors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]

### Return type

[**PageResourceBehaviorDefinitionResource**](PageResourceBehaviorDefinitionResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemTemplate"></a>
# **getItemTemplate**
> StoreItemTemplateResource getItemTemplate(id)

Get a single item template

Item Templates define a type of item and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; GET

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.StoreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

StoreApi apiInstance = new StoreApi();
String id = "id_example"; // String | The id of the template
try {
    StoreItemTemplateResource result = apiInstance.getItemTemplate(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#getItemTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the template |

### Return type

[**StoreItemTemplateResource**](StoreItemTemplateResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getItemTemplates"></a>
# **getItemTemplates**
> PageResourceStoreItemTemplateResource getItemTemplates(size, page, order)

List and search item templates

&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; LIST

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.StoreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

StoreApi apiInstance = new StoreApi();
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceStoreItemTemplateResource result = apiInstance.getItemTemplates(size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#getItemTemplates");
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

[**PageResourceStoreItemTemplateResource**](PageResourceStoreItemTemplateResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStoreItem"></a>
# **getStoreItem**
> StoreItem getStoreItem(id)

Get a single store item

&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; NONE

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.StoreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

StoreApi apiInstance = new StoreApi();
Integer id = 56; // Integer | The id of the item
try {
    StoreItem result = apiInstance.getStoreItem(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#getStoreItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the item |

### Return type

[**StoreItem**](StoreItem.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStoreItems"></a>
# **getStoreItems**
> PageResourceStoreItem getStoreItems(filterNameSearch, filterUniqueKey, filterPublished, filterDisplayable, filterStart, filterEnd, filterStartDate, filterStopDate, filterSku, filterPrice, filterTag, filterItemsByType, filterBundledSkus, filterVendor, size, page, order)

List and search store items

If called without permission STORE_ADMIN the only items marked displayable, whose start and end date are null or appropriate to the current date, and whose geo policy allows the caller&#39;s country will be returned. Similarly skus will be filtered, possibly resulting in an item returned with no skus the user can purchase. br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; NONE

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.StoreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

StoreApi apiInstance = new StoreApi();
String filterNameSearch = "filterNameSearch_example"; // String | Filter for items whose name starts with a given string.
String filterUniqueKey = "filterUniqueKey_example"; // String | Filter for items whose unique_key is a given string.
Boolean filterPublished = true; // Boolean | Filter for skus that have been published.
Boolean filterDisplayable = true; // Boolean | Filter for items that are displayable.
String filterStart = "filterStart_example"; // String | A comma separated string without spaces.  First value is the operator to search on, second value is the store start date, a unix timestamp in seconds.  Allowed operators: (LT, GT, LTE, GTE, EQ).
String filterEnd = "filterEnd_example"; // String | A comma separated string without spaces.  First value is the operator to search on, second value is the store end date, a unix timestamp in seconds.  Allowed operators: (LT, GT, LTE, GTE, EQ).
String filterStartDate = "filterStartDate_example"; // String | A comma separated string without spaces.  First value is the operator to search on, second value is the sku start date, a unix timestamp in seconds.  Allowed operators: (LT, GT, LTE, GTE, EQ).
String filterStopDate = "filterStopDate_example"; // String | A comma separated string without spaces.  First value is the operator to search on, second value is the sku end date, a unix timestamp in seconds.  Allowed operators: (LT, GT, LTE, GTE, EQ).
String filterSku = "filterSku_example"; // String | Filter for skus whose name starts with a given string.
String filterPrice = "filterPrice_example"; // String | A colon separated string without spaces.  First value is the operator to search on, second value is the price of a sku.  Allowed operators: (LT, GT, LTE, GTE, EQ).
String filterTag = "filterTag_example"; // String | A comma separated list without spaces of the names of tags. Will only return items with at least one of the tags.
String filterItemsByType = "filterItemsByType_example"; // String | Filter for item type based on its type hint.
String filterBundledSkus = "filterBundledSkus_example"; // String | Filter for skus inside bundles whose name starts with a given string.  Used only when type hint is 'bundle_item'
Integer filterVendor = 56; // Integer | Filter for items from a given vendor, by id.
Integer size = 25; // Integer | The number of objects returned per page
Integer page = 1; // Integer | The number of the page returned, starting with 1
String order = "id:ASC"; // String | A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC]
try {
    PageResourceStoreItem result = apiInstance.getStoreItems(filterNameSearch, filterUniqueKey, filterPublished, filterDisplayable, filterStart, filterEnd, filterStartDate, filterStopDate, filterSku, filterPrice, filterTag, filterItemsByType, filterBundledSkus, filterVendor, size, page, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#getStoreItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterNameSearch** | **String**| Filter for items whose name starts with a given string. | [optional]
 **filterUniqueKey** | **String**| Filter for items whose unique_key is a given string. | [optional]
 **filterPublished** | **Boolean**| Filter for skus that have been published. | [optional]
 **filterDisplayable** | **Boolean**| Filter for items that are displayable. | [optional]
 **filterStart** | **String**| A comma separated string without spaces.  First value is the operator to search on, second value is the store start date, a unix timestamp in seconds.  Allowed operators: (LT, GT, LTE, GTE, EQ). | [optional]
 **filterEnd** | **String**| A comma separated string without spaces.  First value is the operator to search on, second value is the store end date, a unix timestamp in seconds.  Allowed operators: (LT, GT, LTE, GTE, EQ). | [optional]
 **filterStartDate** | **String**| A comma separated string without spaces.  First value is the operator to search on, second value is the sku start date, a unix timestamp in seconds.  Allowed operators: (LT, GT, LTE, GTE, EQ). | [optional]
 **filterStopDate** | **String**| A comma separated string without spaces.  First value is the operator to search on, second value is the sku end date, a unix timestamp in seconds.  Allowed operators: (LT, GT, LTE, GTE, EQ). | [optional]
 **filterSku** | **String**| Filter for skus whose name starts with a given string. | [optional]
 **filterPrice** | **String**| A colon separated string without spaces.  First value is the operator to search on, second value is the price of a sku.  Allowed operators: (LT, GT, LTE, GTE, EQ). | [optional]
 **filterTag** | **String**| A comma separated list without spaces of the names of tags. Will only return items with at least one of the tags. | [optional]
 **filterItemsByType** | **String**| Filter for item type based on its type hint. | [optional]
 **filterBundledSkus** | **String**| Filter for skus inside bundles whose name starts with a given string.  Used only when type hint is &#39;bundle_item&#39; | [optional]
 **filterVendor** | **Integer**| Filter for items from a given vendor, by id. | [optional]
 **size** | **Integer**| The number of objects returned per page | [optional] [default to 25]
 **page** | **Integer**| The number of the page returned, starting with 1 | [optional] [default to 1]
 **order** | **String**| A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] | [optional] [default to id:ASC]

### Return type

[**PageResourceStoreItem**](PageResourceStoreItem.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="quickBuy"></a>
# **quickBuy**
> InvoiceResource quickBuy(quickBuyRequest)

One-step purchase and pay for a single SKU item from a user&#39;s wallet

Used to create and automatically pay an invoice for a single unit of a single SKU from a user&#39;s wallet. SKU must be priced in virtual currency and must not be an item that requires shipping. PAYMENTS_ADMIN permission is required if user ID is specified and is not the ID of the currently logged in user. If invoice price does not match expected price, purchase is aborted. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PAYMENTS_USER and owner, or PAYMENTS_ADMIN

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.StoreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

StoreApi apiInstance = new StoreApi();
QuickBuyRequest quickBuyRequest = new QuickBuyRequest(); // QuickBuyRequest | Quick buy details
try {
    InvoiceResource result = apiInstance.quickBuy(quickBuyRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#quickBuy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quickBuyRequest** | [**QuickBuyRequest**](QuickBuyRequest.md)| Quick buy details | [optional]

### Return type

[**InvoiceResource**](InvoiceResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="quickNew"></a>
# **quickNew**
> InvoiceResource quickNew(quickNewRequest)

One-step invoice creation

Used to create an invoice. PAYMENTS_ADMIN permission is required if user ID is specified and is not the ID of the currently logged in user. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PAYMENTS_USER and owner, or PAYMENTS_ADMIN

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.StoreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

StoreApi apiInstance = new StoreApi();
QuickPaidRequest quickNewRequest = new QuickPaidRequest(); // QuickPaidRequest | Quick new details
try {
    InvoiceResource result = apiInstance.quickNew(quickNewRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#quickNew");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quickNewRequest** | [**QuickPaidRequest**](QuickPaidRequest.md)| Quick new details | [optional]

### Return type

[**InvoiceResource**](InvoiceResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="quickPaid"></a>
# **quickPaid**
> InvoiceResource quickPaid(quickPaidRequest)

One-step purchase when already paid

Used to create and automatically mark paid an invoice. Must not be an item that requires shipping. PAYMENTS_ADMIN permission is required if user ID is specified and is not the ID of the currently logged in user. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PAYMENTS_USER and owner, or PAYMENTS_ADMIN

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.StoreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

StoreApi apiInstance = new StoreApi();
QuickPaidRequest quickPaidRequest = new QuickPaidRequest(); // QuickPaidRequest | Quick buy details
try {
    InvoiceResource result = apiInstance.quickPaid(quickPaidRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#quickPaid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quickPaidRequest** | [**QuickPaidRequest**](QuickPaidRequest.md)| Quick buy details | [optional]

### Return type

[**InvoiceResource**](InvoiceResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="quickProcessing"></a>
# **quickProcessing**
> InvoiceResource quickProcessing(quickProcessingRequest)

One-step invoice creation when already processing

Used to create and automatically mark processing an invoice. Must not be an item that requires shipping. PAYMENTS_ADMIN permission is required if user ID is specified and is not the ID of the currently logged in user. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PAYMENTS_USER and owner, or PAYMENTS_ADMIN

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.StoreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

StoreApi apiInstance = new StoreApi();
QuickPaidRequest quickProcessingRequest = new QuickPaidRequest(); // QuickPaidRequest | Quick processing details
try {
    InvoiceResource result = apiInstance.quickProcessing(quickProcessingRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#quickProcessing");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quickProcessingRequest** | [**QuickPaidRequest**](QuickPaidRequest.md)| Quick processing details | [optional]

### Return type

[**InvoiceResource**](InvoiceResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateItemTemplate"></a>
# **updateItemTemplate**
> StoreItemTemplateResource updateItemTemplate(id, templatePatchResource, testValidation)

Update an item template

&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; PUT

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.StoreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

StoreApi apiInstance = new StoreApi();
String id = "id_example"; // String | The id of the template
PatchResource templatePatchResource = new PatchResource(); // PatchResource | The patch resource object
Boolean testValidation = true; // Boolean | If true, this will test validation but not submit the patch request
try {
    StoreItemTemplateResource result = apiInstance.updateItemTemplate(id, templatePatchResource, testValidation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#updateItemTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the template |
 **templatePatchResource** | [**PatchResource**](PatchResource.md)| The patch resource object | [optional]
 **testValidation** | **Boolean**| If true, this will test validation but not submit the patch request | [optional]

### Return type

[**StoreItemTemplateResource**](StoreItemTemplateResource.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateStoreItem"></a>
# **updateStoreItem**
> StoreItem updateStoreItem(id, cascade, storeItem)

Update a store item

&lt;b&gt;Permissions Needed:&lt;/b&gt; STORE_ADMIN&lt;br /&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; NONE

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiClient;
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.client.Configuration;
//import com.knetikcloud.client.auth.*;
//import com.knetikcloud.api.StoreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth2_client_credentials_grant
OAuth oauth2_client_credentials_grant = (OAuth) defaultClient.getAuthentication("oauth2_client_credentials_grant");
oauth2_client_credentials_grant.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth2_password_grant
OAuth oauth2_password_grant = (OAuth) defaultClient.getAuthentication("oauth2_password_grant");
oauth2_password_grant.setAccessToken("YOUR ACCESS TOKEN");

StoreApi apiInstance = new StoreApi();
Integer id = 56; // Integer | The id of the item
Boolean cascade = false; // Boolean | Whether to cascade group changes, such as in the limited gettable behavior. A 400 error will return otherwise if the group is already in use with different values.
StoreItem storeItem = new StoreItem(); // StoreItem | The store item object
try {
    StoreItem result = apiInstance.updateStoreItem(id, cascade, storeItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoreApi#updateStoreItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the item |
 **cascade** | **Boolean**| Whether to cascade group changes, such as in the limited gettable behavior. A 400 error will return otherwise if the group is already in use with different values. | [optional] [default to false]
 **storeItem** | [**StoreItem**](StoreItem.md)| The store item object | [optional]

### Return type

[**StoreItem**](StoreItem.md)

### Authorization

[oauth2_client_credentials_grant](../README.md#oauth2_client_credentials_grant), [oauth2_password_grant](../README.md#oauth2_password_grant)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

