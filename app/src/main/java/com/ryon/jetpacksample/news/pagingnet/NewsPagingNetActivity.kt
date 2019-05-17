package com.ryon.jetpacksample.news.pagingnet
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.alibaba.android.arouter.facade.annotation.Route
import com.ryon.jetpacksample.R
import com.ryon.base.BaseActivity
import com.ryon.common.RoutPath
import com.ryon.jetpacksample.databinding.ActivityNewsMainBinding

@Route(path = RoutPath.News.PagingNet)
class NewsPagingNetActivity : BaseActivity() {
    private lateinit var binding: ActivityNewsMainBinding
    private lateinit var newsAdapter: NewsPageAdapter
    private lateinit var model: NewsViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_news_main)
        model = ViewModelProviders.of(this).get(NewsViewModel::class.java)
        binding.model = model

        val layoutManager = LinearLayoutManager(this)
        binding.recyclerView.layoutManager = layoutManager

        newsAdapter = NewsPageAdapter(this, model)
        binding.recyclerView.adapter = newsAdapter
//        model.news.observe(this, Observer (userAdapter::submitList))
    }
}