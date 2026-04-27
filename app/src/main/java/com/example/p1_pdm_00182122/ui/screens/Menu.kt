package com.example.p1_pdm_00182122.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Menu(){

    Column(
        Modifier.fillMaxSize()
    ){

        Card(

        ){
            AsyncImage(
                model = "https://example.com/image.jpg",
                contentDescription = null,

            )
        }


//        LazyColumn {
//            items(
//                items = messages,
//                key = { message ->
//                    // Return a stable + unique key for the item
//                    message.id
//                }
//            ) { message ->
//                MessageRow(message)
//            }
//        }
    }

}

@Composable
fun AsyncImage(model: String, contentDescription: Nothing?) {
    TODO("Not yet implemented")
}