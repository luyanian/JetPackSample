package com.ryon.base

import androidx.appcompat.app.AppCompatActivity
import com.ryon.utils.mutils.ToastUtils

open class BaseActivity : AppCompatActivity() {
    fun toast(s:String){
        ToastUtils.showShort(s);
    }
    fun toast(id:Int){
        ToastUtils.showShort(id);
    }
}