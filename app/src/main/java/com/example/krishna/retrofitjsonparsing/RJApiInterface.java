package com.example.krishna.retrofitjsonparsing;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RJApiInterface {
    @GET("photos/")
    Call<List<RJDataModel>> getData(@Query("client_id") String clientId);
}
