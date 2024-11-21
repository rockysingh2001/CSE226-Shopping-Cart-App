package com.example.shoppingcartapp

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface CartDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addOrUpdateItem(item: CartItem)

    @Query("SELECT * FROM CartItem")
    fun getAllCartItems(): LiveData<List<CartItem>>

    @Delete
    suspend fun removeItem(item: CartItem)
}