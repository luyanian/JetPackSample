package com.ryon.jetpacksample

import android.app.Application
import com.ryon.utils.mutils.Utils

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Utils.init(this);
    }
}