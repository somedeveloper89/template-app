package com.example.modularapp.di

import com.example.modularapp.repository.VetRepository
import com.example.modularapp.repository.VetRepositoryImpl
import com.example.modularapp.service.VetService
import com.example.modularapp.service.VetServiceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

/**
 * Created by Mustafa Kabaktepe on 13/10/2020.
 */
@Module
@InstallIn(ActivityComponent::class)
abstract class VetModule {

    @Binds
    abstract fun bindVetService(
        vetServiceImpl: VetServiceImpl
    ): VetService

    @Binds
    abstract fun bindVetRepository(
        vetRepositoryImpl: VetRepositoryImpl
    ): VetRepository
}