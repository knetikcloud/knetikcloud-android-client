
# MonitoringIncidentEventResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alertId** | **String** | The id of the alert | 
**date** | **Long** | The date as a unix timestamp in seconds for the event |  [optional]
**id** | **String** | The id of the incident event |  [optional]
**incidentId** | **String** | The id of the incident. will be added to any current incident for the alert or a new one created |  [optional]
**levelName** | **String** | The name of the alert level | 
**status** | [**StatusEnum**](#StatusEnum) | The new status of the alert level | 


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
OK | &quot;OK&quot;
ALARM | &quot;ALARM&quot;
INSUFFICIENT_DATA | &quot;INSUFFICIENT_DATA&quot;



