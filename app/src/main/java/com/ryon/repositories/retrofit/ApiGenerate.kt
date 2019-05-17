package com.ryon.repositories.retrofit

import com.ryon.repositories.retrofit.interceptor.HttpLogger
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import java.util.concurrent.TimeUnit

object ApiGenerate {

    val client = OkHttpClient.Builder()
        .addNetworkInterceptor(HttpLoggingInterceptor(HttpLogger()).setLevel(HttpLoggingInterceptor.Level.BODY))
        .connectTimeout(10,TimeUnit.SECONDS)
        .readTimeout(20,TimeUnit.SECONDS)
        .retryOnConnectionFailure(true)
        .build()
    private val retrofit = Retrofit.Builder()
        .client(client)
        .baseUrl("https://news-at.zhihu.com/api/4/news/")
        .addConverterFactory(ScalarsConverterFactory.create())
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()

    fun getNewsService(): NewsService = retrofit.create(NewsService::class.java)
}