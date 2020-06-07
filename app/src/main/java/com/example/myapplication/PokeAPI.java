package com.example.myapplication;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PokeAPI {
    @GET("champions.json")
    Call<RestPokemonResponse> getPokemonResponse();

    @GET("/api/v2/ability")
    Call<RestPokemonResponse> getAbility();
}
