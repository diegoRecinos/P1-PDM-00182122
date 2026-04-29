package com.example.p1_pdm_00182122.ui.screens

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

// In Nav3, each destination is an object or a data class
@Serializable
sealed interface Routes : NavKey {

    @Serializable
    data object Home : Routes

    @Serializable
    data object Screen1 : Routes

    @Serializable
    data object Screen2 : Routes


}
