package com.example.modularapp.repository

import com.example.modularapp.domain.Animal
import com.example.modularapp.service.VetService
import javax.inject.Inject

/**
 * Created by Mustafa Kabaktepe on 13/10/2020.
 */
interface VetRepository {

    fun getAllAnimals() : List<Animal>
}

class VetRepositoryImpl @Inject constructor(val vetService: VetService) : VetRepository {

    override fun getAllAnimals() : List<Animal> = vetService.retrieveAllAnimals()
}