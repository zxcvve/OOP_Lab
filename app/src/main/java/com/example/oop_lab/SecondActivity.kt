package com.example.oop_lab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import com.example.oop_lab.ui.theme.OOP_LabTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.graphics.Color


class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OOP_LabTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    SecondScreen(textRepeatCount = intent.getIntExtra("textRepeatCount", 0))
                }
            }
        }
    }
}


@Composable
fun SecondScreen(textRepeatCount: Int) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red)
    ) {
        for (i in 0..textRepeatCount) {
            Text(
                text = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA",
                color = Color.White,
                modifier = Modifier
                    .background(Color.Black)
            )

        }
    }
}


