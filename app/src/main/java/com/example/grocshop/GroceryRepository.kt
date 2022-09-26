package com.example.grocshop

class GroceryRepository(private val db:GroceryDatabase){
      suspend fun insert(items:GroceryItems)=db.getGrocShopDao().insert(items)
      suspend fun delete(items:GroceryItems)=db.getGrocShopDao().delete(items)

      fun getAllItems()=db.getGrocShopDao().getAllGroceryItems()
}
