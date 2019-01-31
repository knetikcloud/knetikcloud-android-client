
# MonitoringMetricDatapointResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dimensions** | **Map&lt;String, String&gt;** | Dimensions giving context to the datapoint. Map of keys to values (example: {\&quot;location\&quot;: \&quot;USA\&quot;, \&quot;user\&quot;: \&quot;75\&quot;}). Cannot include the | symbol |  [optional]
**id** | **String** | The id of the metric. Required for batch endpoint |  [optional]
**timestamp** | **Long** | The unix timestamp in seconds the datapoint occurred, default: now |  [optional]
**value** | [**BigDecimal**](BigDecimal.md) | The value of the datapoint | 



