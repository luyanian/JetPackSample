package com.ryon.jetpacksample.news.pagingnet

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.ryon.repositories.retrofit.entity.News

class NewsViewModel(application: Application) : AndroidViewModel(application) {

    companion object {
        private const val PAGE_SIZE = 5
        private const val ENABLE_PLACEHOLDER = false
    }

    val stories = LivePagedListBuilder(
        ByPageDataSourceFactory(),
        PagedList.Config.Builder()
            .setPageSize(PAGE_SIZE)
            .setEnablePlaceholders(ENABLE_PLACEHOLDER).build()
    ).build()
}