package com.bitcodetech.roomdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ecommDatabase =
            Room.databaseBuilder(
                this,
                EcomDatabase::class.java,
                "db_ecomm"
            ).allowMainThreadQueries()
                .build()

        val productDao = ecommDatabase.getProductDao()

        /*productDao.insert(Product(101, "Laptop", 1020))
        productDao.insert(Product(202, "Bottle", 560))*/

        val products = productDao.getProducts()
        for(product in products) {
            mt(product.toString())
        }
    }

    private fun mt(text : String) {
        Log.e("tag", text)
    }
}