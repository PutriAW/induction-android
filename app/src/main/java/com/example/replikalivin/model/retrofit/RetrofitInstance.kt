package com.example.replikalivin.model.retrofit

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Inject
import javax.inject.Singleton

class RetrofitInstance @Inject constructor(){

    private val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

    private val BASE_URL = "https://newsapi.org/"

    fun provideGetApiEndPoint(): ApiEndpoint = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .build()
        .create(ApiEndpoint::class.java)
}