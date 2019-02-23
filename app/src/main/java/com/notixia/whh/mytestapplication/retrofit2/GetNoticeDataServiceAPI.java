package com.notixia.whh.mytestapplication.retrofit2;

import com.notixia.whh.mytestapplication.utils.RestUtil;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GetNoticeDataServiceAPI {

    //@GET(RestUtil.URL + "operations/OPL_1-0-0-103D6E%7CJO_1-0-0-23E4B0/quantities?token=368d28e1-00bd-43f9-a455-3e99642fa390")
    @GET("operations/{opID}/quantities")
    Call<QuantityMapPOJO> getNoticeData(@Path("opID") String name, @Query("token") String token );
}
