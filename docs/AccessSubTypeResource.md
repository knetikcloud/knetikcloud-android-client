
# AccessSubTypeResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actions** | **List&lt;String&gt;** | The actions that are possible for the resource type | 
**defaultAccess** | [**List&lt;AccessEntryResource&gt;**](AccessEntryResource.md) | An access list to be copied into new resources of this sub type under this parent. Can include SIDs from the replacement_sid list, which will be replaced when the sub resource if first created | 
**inheritedAccess** | [**List&lt;AccessEntryResource&gt;**](AccessEntryResource.md) | An access list to provide blanket access to all sub resources of this type under this parent | 
**replacementSids** | **List&lt;String&gt;** | A list of placeholder sids that can be included in the access list to be replaced when a resource is first created |  [optional]
**subTypes** | [**List&lt;AccessSubTypeResource&gt;**](AccessSubTypeResource.md) | List of resource types that can inherit from this one, to define default access lists on creation | 
**type** | **String** | The sub type we are defining access for | 



