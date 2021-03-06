package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.PageResourcePaymentMethodResource;
import com.knetikcloud.model.PageResourcePaymentMethodTypeResource;
import com.knetikcloud.model.PaymentAuthorizationResource;
import com.knetikcloud.model.PaymentMethodResource;
import com.knetikcloud.model.PaymentMethodTypeResource;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface PaymentsApi {
  /**
   * Create a new payment method for a user
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; PAYMENTS_ADMIN or owner
   * @param userId ID of the user for whom the payment method is being created (required)
   * @param paymentMethod Payment method being created (optional)
   * @return Call&lt;PaymentMethodResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users/{user_id}/payment-methods")
  Call<PaymentMethodResource> createPaymentMethod(
    @retrofit2.http.Path("user_id") Integer userId, @retrofit2.http.Body PaymentMethodResource paymentMethod
  );

  /**
   * Delete an existing payment method for a user
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; PAYMENTS_ADMIN or owner
   * @param userId ID of the user for whom the payment method is being updated (required)
   * @param id ID of the payment method being deleted (required)
   * @return Call&lt;Void&gt;
   */
  @DELETE("users/{user_id}/payment-methods/{id}")
  Call<Void> deletePaymentMethod(
    @retrofit2.http.Path("user_id") Integer userId, @retrofit2.http.Path("id") Integer id
  );

  /**
   * Get a single payment method for a user
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; PAYMENTS_ADMIN or owner
   * @param userId ID of the user for whom the payment method is being retrieved (required)
   * @param id ID of the payment method being retrieved (required)
   * @return Call&lt;PaymentMethodResource&gt;
   */
  @GET("users/{user_id}/payment-methods/{id}")
  Call<PaymentMethodResource> getPaymentMethod(
    @retrofit2.http.Path("user_id") Integer userId, @retrofit2.http.Path("id") Integer id
  );

  /**
   * Get a single payment method type
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param id ID of the payment method type being retrieved (required)
   * @return Call&lt;PaymentMethodTypeResource&gt;
   */
  @GET("payment/types/{id}")
  Call<PaymentMethodTypeResource> getPaymentMethodType(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * Get all payment method types
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param filterName Filter for payment method types whose name matches a given string (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order a comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourcePaymentMethodTypeResource&gt;
   */
  @GET("payment/types")
  Call<PageResourcePaymentMethodTypeResource> getPaymentMethodTypes(
    @retrofit2.http.Query("filter_name") String filterName, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Get all payment methods for a user
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; PAYMENTS_ADMIN or owner
   * @param userId ID of the user for whom the payment methods are being retrieved (required)
   * @param filterName Filter for payment methods whose name starts with a given string (optional)
   * @param filterPaymentType Filter for payment methods with a specific payment type (optional)
   * @param filterPaymentMethodTypeId Filter for payment methods with a specific payment method type by id (optional)
   * @param filterPaymentMethodTypeName Filter for payment methods whose payment method type name starts with a given string (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order a comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return Call&lt;PageResourcePaymentMethodResource&gt;
   */
  @GET("users/{user_id}/payment-methods")
  Call<PageResourcePaymentMethodResource> getPaymentMethods(
    @retrofit2.http.Path("user_id") Integer userId, @retrofit2.http.Query("filter_name") String filterName, @retrofit2.http.Query("filter_payment_type") String filterPaymentType, @retrofit2.http.Query("filter_payment_method_type_id") Integer filterPaymentMethodTypeId, @retrofit2.http.Query("filter_payment_method_type_name") String filterPaymentMethodTypeName, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page, @retrofit2.http.Query("order") String order
  );

  /**
   * Authorize payment of an invoice for later capture
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; PAYMENTS_ADMIN or PAYMENTS_USER
   * @param request Payment authorization request (optional)
   * @return Call&lt;PaymentAuthorizationResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("payment/authorizations")
  Call<PaymentAuthorizationResource> paymentAuthorization(
    @retrofit2.http.Body PaymentAuthorizationResource request
  );

  /**
   * Capture an existing invoice payment authorization
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; PAYMENTS_ADMIN
   * @param id ID of the payment authorization to capture (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("payment/authorizations/{id}/capture")
  Call<Void> paymentCapture(
    @retrofit2.http.Path("id") Integer id
  );

  /**
   * Update an existing payment method for a user
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; PAYMENTS_ADMIN or owner
   * @param userId ID of the user for whom the payment method is being updated (required)
   * @param id ID of the payment method being updated (required)
   * @param paymentMethod The updated payment method data (optional)
   * @return Call&lt;PaymentMethodResource&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users/{user_id}/payment-methods/{id}")
  Call<PaymentMethodResource> updatePaymentMethod(
    @retrofit2.http.Path("user_id") Integer userId, @retrofit2.http.Path("id") Integer id, @retrofit2.http.Body PaymentMethodResource paymentMethod
  );

}
