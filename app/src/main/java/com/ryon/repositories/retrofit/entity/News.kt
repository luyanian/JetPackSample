package com.ryon.repositories.retrofit.entity

import com.ryon.repositories.BaseEntity

class News(
    var date: String = "",
    var stories: List<StoriesBean> = emptyList()
) : BaseEntity() {

    class StoriesBean {
        var type: Int = 0
        var id: Int = 0
        var ga_prefix: String? = null
        var title: String? = null
        var images: List<String>? = null
    }
}