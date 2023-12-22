package com.bitcodetech.roomdemo

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
class User {
    @PrimaryKey
    var id : Int = -1
    var name : String = ""
}