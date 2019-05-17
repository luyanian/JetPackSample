package com.ryon.jetpacksample.user.pagingroom

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.alibaba.android.arouter.facade.annotation.Route
import com.ryon.jetpacksample.R
import com.ryon.base.BaseActivity
import com.ryon.common.RoutPath
import com.ryon.jetpacksample.databinding.ActivityUserMainBinding
import com.ryon.jetpacksample.user.UserViewModel
import com.ryon.utils.mutils.ToastUtils

@Route(path = RoutPath.User.PagingRoom)
class UserPagingRoomActivity : BaseActivity() {
    private lateinit var binding: ActivityUserMainBinding
    private lateinit var userAdapter: UserPageAdapter
    private lateinit var model: UserViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_user_main)
        model = ViewModelProviders.of(this).get(UserViewModel::class.java)
        binding.model = model

        val layoutManager = LinearLayoutManager(this)
        binding.recyclerView.layoutManager = layoutManager
        userAdapter = UserPageAdapter(this, model)
        binding.recyclerView.adapter = userAdapter

        model.users.observe(this, Observer {userAdapter.submitList(it)})
    }
}