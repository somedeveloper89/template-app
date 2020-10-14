package com.example.modularapp.domain

/**
 * Created by Mustafa Kabaktepe on 13/10/2020.
 */
data class Cat(
    override val id: Long,
    override val age: Int,
    val name: String
) : Animal(id, age, "Mammal")