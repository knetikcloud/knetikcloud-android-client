/*
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com.
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.model.IntWrapper;
import com.knetikcloud.model.InventorySubscriptionResource;
import com.knetikcloud.model.InvoiceResource;
import com.knetikcloud.model.ReactivateSubscriptionRequest;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StringWrapper;
import com.knetikcloud.model.SubscriptionPriceOverrideRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersSubscriptionsApi
 */
@Ignore
public class UsersSubscriptionsApiTest {

    private final UsersSubscriptionsApi api = new UsersSubscriptionsApi();

    
    /**
     * Get details about a user&#39;s subscription
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserSubscriptionDetailsTest() throws ApiException {
        Integer userId = null;
        Integer inventoryId = null;
        InventorySubscriptionResource response = api.getUserSubscriptionDetails(userId, inventoryId);

        // TODO: test validations
    }
    
    /**
     * Get details about a user&#39;s subscriptions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsersSubscriptionDetailsTest() throws ApiException {
        Integer userId = null;
        List<InventorySubscriptionResource> response = api.getUsersSubscriptionDetails(userId);

        // TODO: test validations
    }
    
    /**
     * Reactivate a subscription and charge fee
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reactivateUserSubscriptionTest() throws ApiException {
        Integer userId = null;
        Integer inventoryId = null;
        ReactivateSubscriptionRequest reactivateSubscriptionRequest = null;
        InvoiceResource response = api.reactivateUserSubscription(userId, inventoryId, reactivateSubscriptionRequest);

        // TODO: test validations
    }
    
    /**
     * Set a new date to bill a subscription on
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setSubscriptionBillDateTest() throws ApiException {
        Integer userId = null;
        Integer inventoryId = null;
        Long billDate = null;
        api.setSubscriptionBillDate(userId, inventoryId, billDate);

        // TODO: test validations
    }
    
    /**
     * Set the payment method to use for a subscription
     *
     * May send null to use floating default
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setSubscriptionPaymentMethodTest() throws ApiException {
        Integer userId = null;
        Integer inventoryId = null;
        IntWrapper paymentMethodId = null;
        api.setSubscriptionPaymentMethod(userId, inventoryId, paymentMethodId);

        // TODO: test validations
    }
    
    /**
     * Set the status of a subscription
     *
     * Note that the new status may be blocked if the system is not configured to allow the current status to be changed to the new, to enforce proper flow. The default options for statuses are shown below but may be altered for special use cases
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setSubscriptionStatusTest() throws ApiException {
        Integer userId = null;
        Integer inventoryId = null;
        StringWrapper status = null;
        api.setSubscriptionStatus(userId, inventoryId, status);

        // TODO: test validations
    }
    
    /**
     * Set a new subscription plan for a user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setUserSubscriptionPlanTest() throws ApiException {
        Integer userId = null;
        Integer inventoryId = null;
        StringWrapper planId = null;
        api.setUserSubscriptionPlan(userId, inventoryId, planId);

        // TODO: test validations
    }
    
    /**
     * Set a new subscription price for a user
     *
     * This new price will be what the user is charged at the begining of each new period. This override is specific to the current subscription and will not carry over if they end and later re-subscribe. It will persist if the plan is changed using the setUserSubscriptionPlan endpoint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setUserSubscriptionPriceTest() throws ApiException {
        Integer userId = null;
        Integer inventoryId = null;
        SubscriptionPriceOverrideRequest theOverrideDetails = null;
        api.setUserSubscriptionPrice(userId, inventoryId, theOverrideDetails);

        // TODO: test validations
    }
    
}