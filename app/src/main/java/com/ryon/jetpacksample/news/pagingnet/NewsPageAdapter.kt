package com.ryon.jetpacksample.news.pagingnet

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import com.ryon.jetpacksample.R
import com.ryon.repositories.retrofit.entity.News

class NewsPageAdapter(val context: Context, val model:NewsViewModel) : PagedListAdapter<News.StoriesBean, NewsViewHodler>(
    diffCallBack
) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHodler {
        return NewsViewHodler(
            DataBindingUtil.inflate(
                LayoutInflater.from(context),
                R.layout.activity_news_item,
                null,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: NewsViewHodler, position: Int) {
        getItem(position)?.let {
            holder.bind(it, model)
        }
    }

    companion object {
        private val diffCallBack = object : DiffUtil.ItemCallback<News.StoriesBean>() {

            override fun areItemsTheSame(oldItem: News.StoriesBean, newItem: News.StoriesBean): Boolean {
                return oldItem.id == newItem.id
            }

            @SuppressLint("DiffUtilEquals")
            override fun areContentsTheSame(oldItem: News.StoriesBean, newItem: News.StoriesBean): Boolean {
                return oldItem == newItem
            }

            override fun getChangePayload(oldItem: News.StoriesBean, newItem: News.StoriesBean): Any? {
                return null
            }
        }
    }
}