package com.knetikcloud.api;

import com.knetikcloud.client.ApiClient;
import com.knetikcloud.model.Cart;
import com.knetikcloud.model.CartItemRequest;
import com.knetikcloud.model.CartShippableResponse;
import com.knetikcloud.model.CartShippingAddressRequest;
import com.knetikcloud.model.CouponDefinition;
import com.knetikcloud.model.IntWrapper;
import com.knetikcloud.model.PageResourceCartSummary;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.SampleCountriesResponse;
import com.knetikcloud.model.SkuRequest;
import com.knetikcloud.model.StringWrapper;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StoreShoppingCartsApi
 */
public class StoreShoppingCartsApiTest {

    private StoreShoppingCartsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(StoreShoppingCartsApi.class);
    }

    /**
     * Adds a custom discount to the cart
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN
     */
    @Test
    public void addCustomDiscountTest() {
        String id = null;
        CouponDefinition customDiscount = null;
        // Void response = api.addCustomDiscount(id, customDiscount);

        // TODO: test validations
    }
    /**
     * Adds a discount coupon to the cart
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
     */
    @Test
    public void addDiscountToCartTest() {
        String id = null;
        SkuRequest skuRequest = null;
        // Void response = api.addDiscountToCart(id, skuRequest);

        // TODO: test validations
    }
    /**
     * Add an item to the cart
     *
     * Currently, carts cannot contain virtual and real currency items at the same time. Furthermore, the API only support a single virtual item at the moment. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
     */
    @Test
    public void addItemToCartTest() {
        String id = null;
        CartItemRequest cartItemRequest = null;
        // Void response = api.addItemToCart(id, cartItemRequest);

        // TODO: test validations
    }
    /**
     * Create a cart
     *
     * You don&#39;t have to have a user to create a cart but the API requires authentication to checkout. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     */
    @Test
    public void createCartTest() {
        Integer owner = null;
        String currencyCode = null;
        // StringWrapper response = api.createCart(owner, currencyCode);

        // TODO: test validations
    }
    /**
     * Returns the cart with the given GUID
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
     */
    @Test
    public void getCartTest() {
        String id = null;
        // Cart response = api.getCart(id);

        // TODO: test validations
    }
    /**
     * Get a list of carts
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
     */
    @Test
    public void getCartsTest() {
        Integer filterOwnerId = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageResourceCartSummary response = api.getCarts(filterOwnerId, size, page, order);

        // TODO: test validations
    }
    /**
     * Returns whether a cart requires shipping
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
     */
    @Test
    public void getShippableTest() {
        String id = null;
        // CartShippableResponse response = api.getShippable(id);

        // TODO: test validations
    }
    /**
     * Get the list of available shipping countries per vendor
     *
     * Since a cart can have multiple vendors with different shipping options, the countries are broken down by vendors. Please see notes about the response object as the fields are variable. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
     */
    @Test
    public void getShippingCountriesTest() {
        String id = null;
        // SampleCountriesResponse response = api.getShippingCountries(id);

        // TODO: test validations
    }
    /**
     * Removes a discount coupon from the cart
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
     */
    @Test
    public void removeDiscountFromCartTest() {
        String id = null;
        String code = null;
        // Void response = api.removeDiscountFromCart(id, code);

        // TODO: test validations
    }
    /**
     * Sets the currency to use for the cart
     *
     * May be disallowed by site settings. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
     */
    @Test
    public void setCartCurrencyTest() {
        String id = null;
        StringWrapper currencyCode = null;
        // Void response = api.setCartCurrency(id, currencyCode);

        // TODO: test validations
    }
    /**
     * Sets the owner of a cart if none is set already
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
     */
    @Test
    public void setCartOwnerTest() {
        String id = null;
        IntWrapper userId = null;
        // Void response = api.setCartOwner(id, userId);

        // TODO: test validations
    }
    /**
     * Changes the quantity of an item already in the cart
     *
     * A quantity of zero will remove the item from the cart altogether. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
     */
    @Test
    public void updateItemInCartTest() {
        String id = null;
        CartItemRequest cartItemRequest = null;
        // Void response = api.updateItemInCart(id, cartItemRequest);

        // TODO: test validations
    }
    /**
     * Modifies or sets the order shipping address
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; SHOPPING_CARTS_ADMIN or owner
     */
    @Test
    public void updateShippingAddressTest() {
        String id = null;
        CartShippingAddressRequest cartShippingAddressRequest = null;
        // Void response = api.updateShippingAddress(id, cartShippingAddressRequest);

        // TODO: test validations
    }
}
