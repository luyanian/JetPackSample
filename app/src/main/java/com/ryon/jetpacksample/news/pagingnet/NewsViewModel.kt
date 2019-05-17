package com.ryon.jetpacksample.news.pagingnet

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.ryon.repositories.retrofit.entity.News

class NewsViewModel(application: Application) : AndroidViewModel(application) {
    var newsList: MutableLiveData<List<News>>? = null
        get() {
            if (field == null) {
                field = MutableLiveData()
            }
            return field
        }

//    fun list():LiveData<List<User>> {
//        return AppDatabaseUtils.database.userDao().loadUsers()
//    }

//    fun UsersDataSource(): DataSource.Factory<Int, User> {
//        return AppDatabaseUtils.database.userDao().loadUsersDataSource()
//    }


    fun listNews() {
//        model.list().observe(this@UserRoomActivity, Observer{
//            userAdapter.freshUserList(it)
//        })
//        ToastUtils.showShort("news list")
    }


    companion object {
        private const val PAGE_SIZE = 5
        private const val ENABLE_PLACEHOLDER = false
    }

}