
# AccessResourceCreateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access** | [**List&lt;AccessEntryResource&gt;**](AccessEntryResource.md) | The access list for the resource. If null on create, will take default from type |  [optional]
**id** | **String** | The id of the resource we are defining access for | 
**parentId** | **String** | The id of the parent resource (null if parent top level) |  [optional]
**parentType** | **String** | The type of the parent resource (null for top level) | 
**sidReplacements** | **Map&lt;String, String&gt;** | Sid placeholders mapped to sid replacement value. Useful for injecting owner/creator id. |  [optional]



