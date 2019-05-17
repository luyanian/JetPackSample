package com.ryon.repositories.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ryon.repositories.room.dao.UserDao
import com.ryon.repositories.room.entity.User

@Database(entities =[User::class], version = 3,exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}