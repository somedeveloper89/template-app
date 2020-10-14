package com.example.modularapp.domain

/**
 * Created by Mustafa Kabaktepe on 13/10/2020.
 */
sealed class VetOverviewUiState {

    object Loading : VetOverviewUiState()

    data class Finished(val animals: List<Animal>) : VetOverviewUiState()
}