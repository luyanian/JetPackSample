package com.ryon.repositories.room

import androidx.room.Room
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.ryon.jetpacksample.App

object AppDatabaseUtils {
    val database:AppDatabase by lazy{
        Room.databaseBuilder(App.instance,AppDatabase::class.java,"test_room").allowMainThreadQueries().addMigrations(migrate_1_2).build()
    }

    object migrate_1_2: Migration(1,2) {
        override fun migrate(database: SupportSQLiteDatabase) {

        }

    }

}