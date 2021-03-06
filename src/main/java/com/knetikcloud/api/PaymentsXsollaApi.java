package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.Result;
import com.knetikcloud.model.StringWrapper;
import com.knetikcloud.model.XsollaPaymentRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface PaymentsXsollaApi {
  /**
   * Create a payment token that should be used to forward the user to Xsolla so they can complete payment
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; XSOLLA_ADMIN or owner
   * @param request The payment request to be sent to XSolla (optional)
   * @return Call&lt;StringWrapper&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("payment/provider/xsolla/payment")
  Call<StringWrapper> createXsollaTokenUrl(
    @retrofit2.http.Body XsollaPaymentRequest request
  );

}
