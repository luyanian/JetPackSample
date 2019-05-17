package com.ryon.repositories.retrofit

import com.ryon.repositories.retrofit.entity.News
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface NewsService {
    @GET("before/{time}")
    fun getNews(@Path("time")time: Long): Observable<News>
}