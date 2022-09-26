package com.example.grocshop

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [GroceryItems::class], version = 1)
abstract class GroceryDatabase : RoomDatabase() {
    abstract fun getGrocShopDao(): GrocShopDao

    companion object {
        @Volatile
        private var instance: GroceryDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK)
        {
           instance?: createDatabases(context).also {
               instance=it
           }
        }

        private fun createDatabases(context: Context) =
            Room.databaseBuilder(context.applicationContext, GroceryDatabase::class.java, "Grocery.db")
                .build()
    }
}

