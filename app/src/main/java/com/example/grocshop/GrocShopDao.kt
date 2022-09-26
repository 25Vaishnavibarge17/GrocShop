package com.example.grocshop

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface GrocShopDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item:GroceryItems)

    @Delete
    suspend fun delete(item:GroceryItems)

    @Query("SELECT * FROM grocerryitems")
    fun getAllGroceryItems():LiveData<List<GroceryItems>>

    /*@Query("SELECT * FROM grocerryitems")
      fun getAllGroceryItems() : LiveData<List<GroceryItems>>*/
}