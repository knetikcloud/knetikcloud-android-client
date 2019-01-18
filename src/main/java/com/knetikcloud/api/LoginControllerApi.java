package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface LoginControllerApi {
  /**
   * login
   * 
   * @return Call&lt;String&gt;
   */
  @GET("login")
  Call<String> login();
    

}
