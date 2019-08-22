
# QuickPaidRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalProperties** | [**Map&lt;String, Property&gt;**](Property.md) | A map of additional properties, keyed on the property name (private). Must match the names and types defined in the template for this invoice type, or be an extra not from the template |  [optional]
**federalTax** | [**BigDecimal**](BigDecimal.md) | The amount of federal tax to add (increases final price of invoice even if using price override). Minimum 0 |  [optional]
**giftTarget** | **Integer** | An optional target user to give the item to as a gift | 
**itemNotes** | **String** | An optional note to add to the item |  [optional]
**paidAmount** | [**BigDecimal**](BigDecimal.md) | The amount already paid. Must match final price to complete purchase. Ignored for non-paid endpoints. Minimum 0 |  [optional]
**priceOverride** | [**BigDecimal**](BigDecimal.md) | Override the price of an item, if the behavior configuration permits it. Do not send if taking standard pricing. Minimum 0 |  [optional]
**sku** | **String** | SKU of item being purchased | 
**stateTax** | [**BigDecimal**](BigDecimal.md) | The amount of state tax to add (increases final price of invoice even if using price override). Minimum 0 |  [optional]
**template** | **String** | An invoice template this invoice is validated against (private). May be null and no validation of properties will be done |  [optional]
**transactionDetails** | **String** | Transaction details |  [optional]
**transactionType** | **String** | Transaction type | 
**userId** | **Integer** | ID of the user making the purchase. If null, currently logged in user will be used. |  [optional]



