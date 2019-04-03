
# MonitoringMetricResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dimensionKeys** | **List&lt;String&gt;** | The sets of dimensions that datapoints may be recorded with (each datapoint must have dimensions keys exactly matching this set) |  [optional]
**id** | **String** | The id of the metric. Cannot be changed | 
**metricType** | [**MetricTypeEnum**](#MetricTypeEnum) | The type of metric.  Cannot be updated once set.  counter: a cumulative metric that represents a single monotonically increasing counter whose value can only increase or be reset to zero on restart.  delta: a metric to track the change in value of another gauge metric once started.  gauge: a metric that represents a single numerical value that can arbitrarily go up and down.  timer: a metric that functions as a running timer once started. | 
**name** | **String** | The name of the metric, for display purposes. Will default if not provided |  [optional]
**parentMetricId** | **String** | The id of the parent metric.  Cannot be updated once set.  Needed for delta metrics only. |  [optional]


<a name="MetricTypeEnum"></a>
## Enum: MetricTypeEnum
Name | Value
---- | -----
COUNTER | &quot;counter&quot;
GAUGE | &quot;gauge&quot;



