package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greetingcard.ui.theme.GreetingCardTheme

import mobile.Mobile

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GreetingCardTheme {
                EnhancedGreetings()
            }
        }
    }
}

@Composable
fun EnhancedGreetings() {
    val extText = Mobile.getSomeText()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE3F2FD)) // Light blue background
            .padding(16.dp),
        contentAlignment = Alignment.Center // Center the content
    ) {
        Text(
            text = extText,
            fontSize = 24.sp, // Increase font size
            color = Color(0xFF1E88E5), // Darker blue text color
            modifier = Modifier
                .wrapContentSize()
                .padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreetingCardTheme {
        EnhancedGreetings()
    }
}