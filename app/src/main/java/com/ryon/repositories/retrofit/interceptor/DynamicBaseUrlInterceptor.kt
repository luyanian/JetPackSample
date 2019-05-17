package com.ryon.repositories.retrofit.interceptor

import android.text.TextUtils
import okhttp3.Interceptor
import okhttp3.Response

class DynamicBaseUrlInterceptor(val host: String) : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        var originalRequest = chain.request()
        if (!TextUtils.isEmpty(host)) {
            val newUrl = originalRequest.url().newBuilder()
                .host(host)
                .build()
            originalRequest = originalRequest.newBuilder()
                .url(newUrl)
                .build()
        }

        return chain.proceed(originalRequest)
    }
}