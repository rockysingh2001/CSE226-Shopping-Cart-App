package com.example.shoppingcartapp

data class Product(
    val id: Int,
    val name: String,
    val price: Double,
    val description: String,
    val imageResId: Int // Replace with URL if fetching images from the web
)