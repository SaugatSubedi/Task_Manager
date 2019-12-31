package com.saugat.taskmanager.url;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class URL {

    //Internet url
    public static final String base_url = "http://172.100.100.5.:3000/";



    public static String token="";

    public static Retrofit getIntsance() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;

    }



}
