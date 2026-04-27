package com.pdm0126.p1_resources

import Menu
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
//import androidx.navigation.compose.rememberNavController
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import coil3.compose.AsyncImage
import com.example.p1_pdm_00182122.ui.components.TopBar
import com.example.p1_pdm_00182122.ui.screens.Routes

//import com.example.p1_pdm_00182122.ui.components.TopBar

import com.example.p1_pdm_00182122.ui.screens.Menu
//import com.example.p1_pdm_00182122.ui.screens.Routes


@Composable
fun App() {

    val backStack = rememberNavBackStack(Routes.Menu)

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { TopBar(title = "Nav3") },
    ) { innerPadding ->

        NavDisplay(
            backStack = backStack,
            modifier = Modifier.padding(innerPadding),
            onBack = { backStack.removeLastOrNull() },
            entryProvider = entryProvider {

                entry<Routes.Menu> {
                    Menu(onNavigate = { backStack.add(Routes.Menu) })
                }

            }
        )
    }

    }

