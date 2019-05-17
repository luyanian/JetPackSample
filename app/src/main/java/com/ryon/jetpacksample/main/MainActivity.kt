package com.ryon.jetpacksample.main

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.alibaba.android.arouter.launcher.ARouter
import com.ryon.jetpacksample.R
import com.ryon.base.BaseActivity
import com.ryon.common.RoutPath
import com.ryon.common.Env
import com.ryon.jetpacksample.databinding.ActivityMainBinding
import com.ryon.jetpacksample.user.UserViewModel

class MainActivity : BaseActivity() {
    private lateinit var model:MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this,
            R.layout.activity_main
        )
        model = ViewModelProviders.of(this).get(MainViewModel::class.java)
        binding.env = Env();
        binding.model =model;
    }
}
