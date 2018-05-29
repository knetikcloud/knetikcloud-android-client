
# AccessTypeResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access** | [**List&lt;AccessEntryResource&gt;**](AccessEntryResource.md) | The access list. Combines with parent access to determine permission | 
**actions** | **List&lt;String&gt;** | The actions that are possible for the resource type |  [optional]
**id** | **String** | The id of the resource we are defining access for (null for top level) |  [optional]
**parentId** | **String** | The id of the parent resource (null if parent top level) |  [optional]
**parentType** | **String** | The type of the parent resource (null for top level) |  [optional]
**subTypes** | [**List&lt;AccessSubTypeResource&gt;**](AccessSubTypeResource.md) | List of resource types that can inherit from this one, to define default access lists on creation | 
**type** | **String** | The resource type we are defining access for | 



