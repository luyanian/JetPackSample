package com.ryon.jetpacksample.news.pagingnet

import androidx.recyclerview.widget.RecyclerView
import com.ryon.jetpacksample.databinding.ActivityNewsItemBinding
import com.ryon.repositories.retrofit.entity.News

class NewsViewHodler(private val binding: ActivityNewsItemBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(store: News.StoriesBean,model: NewsViewModel){
        binding.store = store
        binding.model = model
    }
}