package com.ryon.jetpacksample.news.pagingnet

import androidx.recyclerview.widget.RecyclerView
import com.ryon.jetpacksample.databinding.ActivityNewsItemBinding
import com.ryon.repositories.retrofit.entity.News

class NewsViewHodler(private val binding: ActivityNewsItemBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(news: News,model: NewsViewModel){
        binding.news = news
        binding.model = model
    }
}