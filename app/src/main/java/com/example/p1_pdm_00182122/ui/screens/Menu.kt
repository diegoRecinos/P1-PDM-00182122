package com.example.p1_pdm_00182122.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import coil3.compose.AsyncImage

@Composable
fun Menu(){

    Column(
        Modifier.fillMaxSize()
    ){

        Card(

        ){
            LazyColumn(
                verticalItemSpacing = 4.dp,
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                content = {
                    val randomSizedPhotos = 0
                    items(randomSizedPhotos) { photo ->
                        AsyncImage(
                            model = photo,
                            contentScale = ContentScale.Crop,
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .wrapContentHeight()
                        )
                    }
                },
                modifier = Modifier.fillMaxSize()
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

