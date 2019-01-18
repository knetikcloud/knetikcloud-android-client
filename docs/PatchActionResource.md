
# PatchActionResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**op** | [**OpEnum**](#OpEnum) | The action you wish to perform on the resource | 
**path** | **String** | The JSON Pointer (JSON key) you wish to patch | 
**value** | **Object** | The new value for the JSON path |  [optional]


<a name="OpEnum"></a>
## Enum: OpEnum
Name | Value
---- | -----
REPLACE | &quot;replace&quot;
ADD | &quot;add&quot;
REMOVE | &quot;remove&quot;
TEST | &quot;test&quot;



