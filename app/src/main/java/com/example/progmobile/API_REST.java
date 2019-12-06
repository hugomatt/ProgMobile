package com.example.progmobile;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface API_REST {

    String URL = "https://demonuts.com/Demonuts/JsonTest/Tennis/";

    @GET("json_parsing.php")
    Call<List<Chiens>> GetChien();
}