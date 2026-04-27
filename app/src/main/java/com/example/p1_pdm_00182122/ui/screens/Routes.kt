package com.example.p1_pdm_00182122.ui.screens

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
sealed interface Routes : NavKey {

    @Serializable
    data object Menu : Routes

    @Serializable
    data object Screen1 : Routes

}