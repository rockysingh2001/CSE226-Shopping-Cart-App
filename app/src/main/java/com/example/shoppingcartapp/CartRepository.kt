package com.example.shoppingcartapp

import androidx.lifecycle.LiveData

class CartRepository(private val cartDao: CartDao) {
    val cartItems: LiveData<List<CartItem>> = cartDao.getAllCartItems()

   suspend fun addOrUpdateItem(item: CartItem) {
        cartDao.addOrUpdateItem(item)
    }

    suspend fun removeItem(item: CartItem) {
        cartDao.removeItem(item)
    }
}