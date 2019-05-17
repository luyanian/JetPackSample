package com.ryon.repositories.retrofit.interceptor

import okhttp3.Headers
import okhttp3.Interceptor
import okhttp3.Response
import java.io.IOException

class HeadInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()
        val compressedRequest = originalRequest.newBuilder()
//            .headers(Headers.of(getHeaders()))
            .build()
        return chain.proceed(compressedRequest)
    }
}