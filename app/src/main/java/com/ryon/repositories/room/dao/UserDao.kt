package com.ryon.repositories.room.dao

import androidx.room.*
import com.ryon.repositories.room.entity.User
import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import androidx.room.Dao



@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.ABORT)
    fun insertUsers(user: User);

    @Update(onConflict = OnConflictStrategy.ABORT)
    fun updateUser(user:User)

    @Delete
    fun deleteUser(user:User)

    @Query("select * from user")
    fun loadUsers(): LiveData<List<User>>

    @Query("select * from user")
    fun loadUsersDataSource(): DataSource.Factory<Int, User>

    @Query("select * from user where id = :id")
    fun loadUserById(id:Int):User

    @Query("SELECT * FROM user WHERE user_name IN (:regions)")
    fun loadUsersFromRegionsSync(regions: List<String>): LiveData<List<User>>

}