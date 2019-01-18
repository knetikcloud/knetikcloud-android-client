
# BreEventLog

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**age** | **Long** | The difference between received and handlded in ms |  [optional]
**customer** | **String** | The customer |  [optional]
**eventExpansionDuration** | **Long** | The time it took to expand the event parameters |  [optional]
**eventId** | **String** | The event id |  [optional]
**eventLoggingDuration** | **Long** | The time it took to log the event in IO |  [optional]
**eventName** | **String** | The event name |  [optional]
**eventReceivedDate** | **Long** | The date the event was fired |  [optional]
**eventStartDate** | **Long** | The date the event was handled |  [optional]
**id** | **String** | The id |  [optional]
**parameters** | **Object** | The event paramters |  [optional]
**rules** | [**List&lt;BreRuleLog&gt;**](BreRuleLog.md) | The rules |  [optional]
**runtime** | **Long** | The time it took to run all the rules for that event |  [optional]



