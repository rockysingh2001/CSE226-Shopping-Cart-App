package com.example.shoppingcartapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: CartViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this)[CartViewModel::class.java]

        val productList = listOf(
            Product(1, "Shoes", 10.0, "Comfortable running shoes", R.drawable.shoes),
            Product(2, "Pants", 20.0, "Stylish jeans", R.drawable.pant)
        )

        val productAdapter = ProductAdapter(productList) { product ->
            viewModel.addOrUpdateItem(CartItem(product.id, product.name, product.price, 1))
        }

        findViewById<RecyclerView>(R.id.productRecyclerView).apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = productAdapter
        }
    }
}