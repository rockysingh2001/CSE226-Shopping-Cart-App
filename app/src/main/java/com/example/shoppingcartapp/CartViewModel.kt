package com.example.shoppingcartapp

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class CartViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: CartRepository
    private val cartItems: LiveData<List<CartItem>>

    init {
        val cartDao = CartDatabase.getInstance(application).cartDao()
        repository = CartRepository(cartDao)
        cartItems = repository.cartItems
    }

    // Add or update a cart item
    fun addOrUpdateItem(item: CartItem) = viewModelScope.launch {
        repository.addOrUpdateItem(item)
    }

}
