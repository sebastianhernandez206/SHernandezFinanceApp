package com.example.financeapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.financeapp.models.Transaction

@Composable
fun TransactionListSection(transactions: List<Transaction>) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Transactions", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                Text(text = "See All", fontSize = 14.sp, color = Color.Gray)
            }
            Spacer(modifier = Modifier.height(8.dp))
        }

        items(transactions) { transaction ->
            TransactionItem(transaction)
        }
    }
}

@Composable
fun TransactionItem(transaction: Transaction) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(48.dp)
                .clip(CircleShape)
                .background(Color.Black),
            contentAlignment = Alignment.Center
        ) {
            Icon(transaction.icon, contentDescription = null, tint = Color.White)
        }

        Spacer(modifier = Modifier.width(16.dp))

        Column(modifier = Modifier.weight(1f)) {
            Text(text = transaction.name, fontWeight = FontWeight.Bold, fontSize = 16.sp)
            Text(text = transaction.category, color = Color.Gray, fontSize = 12.sp)
        }

        Column(horizontalAlignment = Alignment.End) {
            Text(
                text = if (transaction.amount >= 0) "$${transaction.amount}" else "\$${transaction.amount}",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = Color.Black
            )
            Text(text = transaction.time, color = Color.Gray, fontSize = 12.sp)
        }
    }
}
