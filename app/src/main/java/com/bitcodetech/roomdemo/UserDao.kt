package com.bitcodetech.roomdemo

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {

    @Insert
    fun insert(user : User)

    @Query("select * from users")
    fun getUsers() : List<User>

    @Delete
    fun delete(user : User)

}