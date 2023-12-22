package com.bitcodetech.roomdemo

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(version = 1, entities = [Product::class, User::class])
abstract class EcomDatabase : RoomDatabase() {
    abstract fun getProductDao() : ProductDao
    abstract fun getUserDao() : UserDao
}