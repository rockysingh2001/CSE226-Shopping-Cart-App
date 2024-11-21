package com.example.shoppingcartapp

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CartItem(
    @PrimaryKey val productId: Int,
    val name: String,
    val price: Double,
    var quantity: Int
)