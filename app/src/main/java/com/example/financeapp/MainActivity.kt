package com.example.financeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.financeapp.components.SummarySection
import com.example.financeapp.components.TopBarGreeting
import com.example.financeapp.components.TransactionListSection
import com.example.financeapp.models.currentUser
import com.example.financeapp.models.transactionList


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                HomeScreen(innerPadding = PaddingValues(25.dp))
            }
        }
    }
}

@Composable
fun HomeScreen(innerPadding: PaddingValues) {
    Scaffold(
        containerColor = Color.White
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(horizontal = 24.dp)
        ) {
            Spacer(modifier = Modifier.height(16.dp))
            TopBarGreeting(currentUser)

            Spacer(modifier = Modifier.height(24.dp))
            SummarySection()

            Spacer(modifier = Modifier.height(24.dp))
            TransactionListSection(transactionList)
        }
    }
}

@Preview(showBackground = true,
    showSystemUi = true)
@Composable
fun GreetingPreview() {
    MaterialTheme {
        HomeScreen(innerPadding = PaddingValues(25.dp))
    }
}