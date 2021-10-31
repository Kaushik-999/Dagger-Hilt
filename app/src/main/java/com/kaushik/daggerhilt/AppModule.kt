package com.kaushik.daggerhilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    // @Singleton is only used in SingletonComponent::class
    @Singleton
    @Provides
    @Named("String1")
    fun provideString() = "This is a string we will inject"

}