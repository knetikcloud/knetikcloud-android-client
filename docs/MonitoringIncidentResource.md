
# MonitoringIncidentResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alert** | [**SimpleReferenceResourcestring**](SimpleReferenceResourcestring.md) | The alert this incident is for | 
**currentLevel** | **String** | The name of the current alert level | 
**endDate** | **Long** | The endDate as a unix timestamp in seconds the incident was manually ended. Null if still open |  [optional]
**id** | **String** | The id of the incident. Cannot be changed | 
**insufficientData** | **Boolean** | Whether the most recent check for any level had too little data to determine status, and alert level missing_data_policy is &#39;missing&#39; |  [optional]
**levels** | [**List&lt;MonitoringIncidentLevelResource&gt;**](MonitoringIncidentLevelResource.md) | The statuses of each level | 
**startDate** | **Long** | The startDate as a unix timestamp in seconds the incident first started |  [optional]
**triggerValue** | **String** | The value that triggered the incident | 



