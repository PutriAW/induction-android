package com.example.replikalivin.model.retrofit

import com.example.replikalivin.model.ApiResponses
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface ApiEndpoint {

    @GET("/v2/everything")
    suspend fun getListNews(@Query("q") q: String,
                            @Header("x-api-key") apiKey: String,
                            @Query("pageSize") pageSize: Int,
                            @Query("page") page: Int): Response<ApiResponses>

}