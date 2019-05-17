package com.ryon.jetpacksample.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.alibaba.android.arouter.launcher.ARouter
import com.ryon.common.RoutPath

class MainViewModel(application: Application) : AndroidViewModel(application) {
    fun goRoom(){
        ARouter.getInstance().build(RoutPath.User.Room).navigation()
    }
    fun goPagingRoom(){
        ARouter.getInstance().build(RoutPath.User.PagingRoom).navigation()
    }
    fun goNews(){
        ARouter.getInstance().build(RoutPath.News.PagingNet).navigation()
    }
}