package com.example.grocshop

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName ="grocerryitems")
data class GroceryItems (
    @ColumnInfo(name="itemName")
    var itemName: String,
    @ColumnInfo(name="itemQuantity")
    var itemQuantity: Int,
    @ColumnInfo(name="itemPrice")
    var itemPrice: Int,
){
    @PrimaryKey(autoGenerate = true)
    var id:Int? = null
}

