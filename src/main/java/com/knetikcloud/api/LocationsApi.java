package com.knetikcloud.api;

import com.knetikcloud.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import com.knetikcloud.model.CurrencyResource;
import com.knetikcloud.model.PageResourceCountryResource;
import com.knetikcloud.model.PageResourceStateResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StringWrapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface LocationsApi {
  /**
   * Get a list of countries
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourceCountryResource&gt;
   */
  @GET("location/countries")
  Call<PageResourceCountryResource> getCountries(
    @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

  /**
   * Get the iso3 code of your country
   * Determined by geo ip location. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @return Call&lt;StringWrapper&gt;
   */
  @GET("location/geolocation/country")
  Call<StringWrapper> getCountryByGeoLocation();
    

  /**
   * Get a list of a country&#39;s states
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param countryCodeIso3 The iso3 code of the country (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @return Call&lt;PageResourceStateResource&gt;
   */
  @GET("location/countries/{country_code_iso3}/states")
  Call<PageResourceStateResource> getCountryStates(
    @retrofit2.http.Path("country_code_iso3") String countryCodeIso3, @retrofit2.http.Query("size") Integer size, @retrofit2.http.Query("page") Integer page
  );

  /**
   * Get the currency information of your country
   * Determined by geo ip location, currency to country mapping and a fallback setting. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @return Call&lt;CurrencyResource&gt;
   */
  @GET("location/geolocation/currency")
  Call<CurrencyResource> getCurrencyByGeoLocation();
    

}
