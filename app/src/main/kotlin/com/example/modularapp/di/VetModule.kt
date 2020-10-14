package com.example.modularapp.di

import com.example.modularapp.service.VetService
import com.example.modularapp.service.VetServiceImpl
import dagger.Binds
import dagger.Module

/**
 * Created by Mustafa Kabaktepe on 13/10/2020.
 */
@Module
abstract class VetModule {

    @Binds
    abstract fun provideVetService(vetServiceImpl: VetServiceImpl): VetService
}