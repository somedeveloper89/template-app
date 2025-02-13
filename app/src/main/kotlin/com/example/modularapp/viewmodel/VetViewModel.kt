package com.example.modularapp.viewmodel

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.modularapp.domain.VetOverviewUiEvent
import com.example.modularapp.domain.VetOverviewUiEvent.Init
import com.example.modularapp.repository.VetRepository

/**
 * Created by Mustafa Kabaktepe on 13/10/2020.
 */
class VetViewModel @ViewModelInject constructor(
    private val repository: VetRepository,
    @Assisted private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    fun dispatch(uiEvent: VetOverviewUiEvent) {
        when (uiEvent) {
            is Init -> init()
        }
    }

    private fun init() {
        val result = repository.getAllAnimals()
    }
}