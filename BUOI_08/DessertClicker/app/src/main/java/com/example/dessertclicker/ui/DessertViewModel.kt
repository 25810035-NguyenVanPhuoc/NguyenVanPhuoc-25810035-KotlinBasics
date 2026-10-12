package com.example.dessertclicker.ui

import androidx.lifecycle.ViewModel
import com.example.dessertclicker.data.Datasource
import com.example.dessertclicker.model.Dessert
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

/**
 * ViewModel holds the UI state and the business logic. It survives configuration changes
 * (e.g. rotating the screen), so the data is not lost.
 */
class DessertViewModel : ViewModel() {

    private val desserts: List<Dessert> = Datasource.dessertList

    private val _uiState = MutableStateFlow(
        DessertUiState(
            currentDessertPrice = desserts.first().price,
            currentDessertImageId = desserts.first().imageId
        )
    )
    val uiState: StateFlow<DessertUiState> = _uiState.asStateFlow()

    fun onDessertClicked() {
        _uiState.update { state ->
            val dessertsSold = state.dessertsSold + 1
            val dessertToShow = determineDessertToShow(desserts, dessertsSold)
            state.copy(
                revenue = state.revenue + state.currentDessertPrice,
                dessertsSold = dessertsSold,
                currentDessertPrice = dessertToShow.price,
                currentDessertImageId = dessertToShow.imageId
            )
        }
    }

    /**
     * Determine which dessert to show.
     */
    private fun determineDessertToShow(desserts: List<Dessert>, dessertsSold: Int): Dessert {
        var dessertToShow = desserts.first()
        for (dessert in desserts) {
            if (dessertsSold >= dessert.startProductionAmount) {
                dessertToShow = dessert
            } else {
                // The list is sorted by startProductionAmount, so stop at the first one not reached.
                break
            }
        }
        return dessertToShow
    }
}
