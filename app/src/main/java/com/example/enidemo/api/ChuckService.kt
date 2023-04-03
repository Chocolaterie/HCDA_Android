package com.example.enidemo.api

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

interface ChuckService {

    // Singleton/Static
    companion object {

        // L'url de l'API
        val BASE_URL = "https://api.chucknorris.io/jokes/"

        // L'utilitaire permettant de mapper automatiquement le JSON en objet
        val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

        // Utilitaire retrofit
        val retrofit = Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .baseUrl(BASE_URL)
            .build()
    }

    @GET("random")
    suspend fun randomFact() : Joke
}