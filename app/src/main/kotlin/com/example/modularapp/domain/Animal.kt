package com.example.modularapp.domain

/**
 * Created by Mustafa Kabaktepe on 13/10/2020.
 */
abstract class Animal(
    open val id: Long,
    open val age: Int,
    open val category: String
)