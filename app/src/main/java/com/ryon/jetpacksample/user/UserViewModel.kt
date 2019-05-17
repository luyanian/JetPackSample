package com.ryon.jetpacksample.user

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.ryon.repositories.room.AppDatabaseUtils
import com.ryon.repositories.room.entity.User

class UserViewModel(application: Application) : AndroidViewModel(application) {
    var userList: MutableLiveData<List<User>>? = null
        get() {
            if (field == null) {
                field = MutableLiveData()
            }
            return field
        }

    fun addUser() {
        val user = User(0)
        user.userName = "a"
        user.userAge = 19
        AppDatabaseUtils.database.userDao().insertUsers(user)
    }

    fun deleteUser(user: User) {
        AppDatabaseUtils.database.userDao().deleteUser(user)
    }

    fun list(): LiveData<List<User>> {
        return AppDatabaseUtils.database.userDao().loadUsers()
    }

    companion object {
        private const val PAGE_SIZE = 5
        private const val ENABLE_PLACEHOLDER = false
    }

    fun UsersDataSource(): DataSource.Factory<Int, User> {
        return AppDatabaseUtils.database.userDao().loadUsersDataSource()
    }

    val users = LivePagedListBuilder(UsersDataSource(), PagedList
        .Config.Builder()
        .setPageSize(PAGE_SIZE)
        .setEnablePlaceholders(ENABLE_PLACEHOLDER).build()).build()

}