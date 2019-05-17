package com.ryon.jetpacksample.news.pagingnet

import androidx.paging.DataSource
import com.ryon.repositories.retrofit.entity.News

class ByPageDataSourceFactory : DataSource.Factory<Long, News.StoriesBean>() {
    override fun create(): DataSource<Long, News.StoriesBean> = ByPageDataSource()
}