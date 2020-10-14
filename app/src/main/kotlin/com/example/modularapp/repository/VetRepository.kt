package com.example.modularapp.repository

import com.example.modularapp.domain.Animal
import com.example.modularapp.service.VetService

/**
 * Created by Mustafa Kabaktepe on 13/10/2020.
 */
class VetRepository(val vetService: VetService) {

    fun getAllAnimals() : List<Animal> = vetService.retrieveAllAnimals()
}