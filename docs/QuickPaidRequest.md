
# QuickPaidRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**giftTarget** | **Integer** | An optional target user to give the item to as a gift | 
**itemNotes** | **String** | An optional note to add to the item |  [optional]
**paidAmount** | [**BigDecimal**](BigDecimal.md) | The amount already paid. Must match final price to complete purchase. Minimum 0 | 
**priceOverride** | [**BigDecimal**](BigDecimal.md) | Override the price of an item, if the behavior configuration permits it. Do not send if taking standard pricing. Minimum 0 |  [optional]
**sku** | **String** | SKU of item being purchased | 
**transactionDetails** | **String** | Transaction details |  [optional]
**transactionType** | **String** | Transaction type | 
**userId** | **Integer** | ID of the user making the purchase. If null, currently logged in user will be used. |  [optional]



