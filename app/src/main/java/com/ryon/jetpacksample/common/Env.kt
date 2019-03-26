package com.ryon.jetpacksample.common

import com.ryon.jetpacksample.BuildConfig
import com.ryon.utils.mutils.AppUtils

class Env {
    val env_type:String = BuildConfig.ENV_TYPE.toString();
    val env_api_domain = BuildConfig.ENV_API_DOMAIN;
    val applicationId = BuildConfig.APPLICATION_ID;
    val pakage  = AppUtils.getAppPackageName();
}