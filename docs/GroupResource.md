
# GroupResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalProperties** | [**Map&lt;String, Property&gt;**](Property.md) | A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type |  [optional]
**createdDate** | **Long** | The date the group was created as a unix timestamp |  [optional]
**description** | **String** | A description of the group |  [optional]
**memberCount** | **Integer** | The number of users in the group |  [optional]
**messageOfTheDay** | **String** | A message of the day for members of the group |  [optional]
**name** | **String** | The name of the group. Max 50 characters | 
**parent** | **String** | The unique name of another group that this group is a subset of |  [optional]
**status** | **String** | The status of the group. Max size 50 |  [optional]
**subMemberCount** | **Integer** | The number of users in child groups |  [optional]
**tags** | **List&lt;String&gt;** | Tags for search |  [optional]
**template** | **String** | A group template this group is validated against. May be null and no validation of additional_properties will be done |  [optional]
**uniqueName** | **String** | Unique name used in url and references. Uppercase, lowercase, numbers and hyphens only. Max 50 characters. Cannot be altered once created. Default: random UUID |  [optional]
**updatedDate** | **Long** | The date the group&#39;s info was last updated as a unix timestamp |  [optional]



