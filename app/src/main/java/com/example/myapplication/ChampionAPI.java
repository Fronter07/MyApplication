package com.example.myapplication;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ChampionAPI {
    @GET("champions.json")
    Call<RestChampionResponse> getPokemonResponse();

    @GET("/api/v2/ability")
    Call<RestChampionResponse> getAbility();
}
