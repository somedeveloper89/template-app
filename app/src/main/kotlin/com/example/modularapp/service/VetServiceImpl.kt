package com.example.modularapp.service

import com.example.modularapp.domain.Animal
import javax.inject.Inject

/**
 * Created by Mustafa Kabaktepe on 13/10/2020.
 */
interface VetService {

    fun retrieveAllAnimals() : List<Animal>
}

class VetServiceImpl @Inject constructor() : VetService {

    override fun retrieveAllAnimals(): List<Animal> = emptyList()
}