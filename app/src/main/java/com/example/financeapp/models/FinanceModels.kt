package com.example.financeapp.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector


data class User(
    val name: String,
    val balance: Double
)

data class SummaryCard(
    val title: String,
    val amount: String,
    val backgroundColor: Color
)

data class Transaction(
    val name: String,
    val category: String,
    val amount: Double,
    val time: String,
    val icon: ImageVector
)

val currentUser = User(name = "Juan", balance = 561.98)

val transactionList = listOf(
    Transaction("Supermarket", "Groceries", 45.99, "10:30 AM", Icons.Default.ShoppingCart),
    Transaction("Gas Station", "Fuel", -30.50, "12:15 PM", Icons.Default.ShoppingCart),
    Transaction("Coffee Shop", "Food & Drinks", 5.75, "8:00 AM", Icons.Default.ShoppingCart),
    Transaction("Electronics Store", "Electronics", 120.00, "3:45 PM", Icons.Default.ShoppingCart),
    Transaction("Bookstore", "Books", 25.99, "2:00 PM", Icons.Default.ShoppingCart),
    Transaction("Restaurant", "Dining", 60.00, "7:30 PM", Icons.Default.ShoppingCart)
)
