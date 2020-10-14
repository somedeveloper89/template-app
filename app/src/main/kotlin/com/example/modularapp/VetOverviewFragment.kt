package com.example.modularapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.modularapp.viewmodel.VetViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class VetOverviewFragment : Fragment() {
    private val vetViewModel: VetViewModel by viewModels()
}