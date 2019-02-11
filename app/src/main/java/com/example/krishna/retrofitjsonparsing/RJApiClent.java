package com.example.krishna.retrofitjsonparsing;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RJApiClent {
    public static final String BASE_URL="https://api.unsplash.com/";/*"http://192.168.31.124:3000/";*/

    public static Retrofit retrofit;

    public static Retrofit getApiClient(){
        if(retrofit==null){
            retrofit=new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
