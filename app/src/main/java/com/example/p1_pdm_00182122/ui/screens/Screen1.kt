package com.example.p1_pdm_00182122.ui.screens

import android.window.BackEvent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage

@Composable
fun Screen1(onBack: () -> Unit){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Text("Screen 1", style = MaterialTheme.typography.headlineMedium)

        AsyncImage(
            model = "https://picsum.photos/seed/screen1/400/300",
            contentDescription = "Screen 1 image",
            modifier = Modifier
                .padding(16.dp)
                .size(200.dp),
            contentScale = ContentScale.Crop
        )
        Button(onClick = onBack){
            Text("Back")
        }
    }



}