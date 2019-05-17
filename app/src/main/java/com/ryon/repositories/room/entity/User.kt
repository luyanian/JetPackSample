package com.ryon.repositories.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ryon.repositories.BaseEntity

@Entity(tableName = "user")
data class User constructor(@PrimaryKey(autoGenerate = true) val id: Int):BaseEntity() {
    @ColumnInfo(name = "user_name")
    var userName: String? = null;
    @ColumnInfo(name = "user_age")
    var userAge: Int = 0;
    @ColumnInfo(name = "user_phone")
    var userPhone: String? = null;

    override fun toString(): String {
        return "User(id=$id,userName=$userName,userAge=$userAge,userPhone=$userPhone)"
    }
}