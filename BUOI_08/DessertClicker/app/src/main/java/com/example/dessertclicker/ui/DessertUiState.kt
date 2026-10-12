package com.example.dessertclicker.ui

import androidx.annotation.DrawableRes

/**
 * Model of the screen state: the single source of truth that the View observes.
 */
data class DessertUiState(
    val revenue: Int = 0,
    val dessertsSold: Int = 0,
    val currentDessertIndex: Int = 0,
    val currentDessertPrice: Int = 0,
    @DrawableRes val currentDessertImageId: Int = 0
)
