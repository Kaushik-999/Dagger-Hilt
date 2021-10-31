package com.kaushik.daggerhilt

import android.content.Context


import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityRetainedScoped
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton


@Module
@InstallIn(ActivityRetainedComponent::class)
object MainModule {

    // In ActivityComponent::class, @Singleton is replaced by @ActivityScoped
    @ActivityRetainedScoped
    @Provides
    @Named("String2")
    fun provideString2(
        @ApplicationContext context: Context, // give the context of the application
        @Named("String1") testString1: String
    ) = "${context.getString(R.string.string_to_inject)} -- $testString1" // string resource is accessed here
}