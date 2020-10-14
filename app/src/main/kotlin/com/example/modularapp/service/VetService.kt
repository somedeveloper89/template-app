package com.example.modularapp.service

import com.example.modularapp.domain.Animal

/**
 * Created by Mustafa Kabaktepe on 13/10/2020.
 */
interface VetService {

    fun retrieveAllAnimals() : List<Animal>
}