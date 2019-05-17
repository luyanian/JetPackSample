package com.ryon.jetpacksample

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter
import com.ryon.utils.mutils.Utils

class App : Application() {
    companion object{
        lateinit var instance:App
    }
    override fun onCreate() {
        super.onCreate()
        instance = this
        Utils.init(this);
        if (BuildConfig.IS_DEBUG) {
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(this);
    }
}