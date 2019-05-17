package com.ryon.jetpacksample.user.room

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.alibaba.android.arouter.facade.annotation.Route
import com.ryon.jetpacksample.R
import com.ryon.base.BaseActivity
import com.ryon.common.RoutPath
import com.ryon.jetpacksample.databinding.ActivityUserMainBinding
import com.ryon.jetpacksample.user.UserViewModel

@Route(path = RoutPath.User.Room)
class UserRoomActivity : BaseActivity() {
    private lateinit var binding: ActivityUserMainBinding
    private lateinit var userAdapter: UserAdapter
    private lateinit var model: UserViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_user_main)
        model = ViewModelProviders.of(this).get(UserViewModel::class.java)
        binding.model = model

        val layoutManager = LinearLayoutManager(this)
        binding.recyclerView.layoutManager = layoutManager
        userAdapter = UserAdapter(this,model)
        binding.recyclerView.adapter = userAdapter

        model.list().observe(this,androidx.lifecycle.Observer {
            userAdapter.freshUserList(it)
        })
    }
}