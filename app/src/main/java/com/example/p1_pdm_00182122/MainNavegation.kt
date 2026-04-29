package com.example.p1_pdm_00182122

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
//import androidx.navigation.compose.rememberNavController
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.example.p1_pdm_00182122.ui.components.TopBar
import com.example.p1_pdm_00182122.ui.screens.HomeScreen
import com.example.p1_pdm_00182122.ui.screens.Routes
import com.example.p1_pdm_00182122.ui.screens.Screen1


@Composable
fun App(modifier: Modifier = Modifier){
    //1. creamos el backstack iniciando en home
    val backStack = rememberNavBackStack(Routes.Home)

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { TopBar(title = "Nav3 App") },

    ) { innerPadding ->

        //2. NavDisplay es el contenedor que renderiza las pantallas
        NavDisplay(
            backStack = backStack,
            modifier = Modifier.padding(innerPadding),
            onBack = { backStack.removeLastOrNull() }, //maneja boton de atras
            entryProvider = entryProvider {
                //3. Mapear cada objeto de Routes.kt a un composable
                entry<Routes.Home> {
                    HomeScreen(onNavigate = { backStack.add(Routes.Screen1) })
                }

                entry<Routes.Screen1> {
                    Screen1(onBack = { backStack.removeLastOrNull() })
                }


            }
        )
    }

}
