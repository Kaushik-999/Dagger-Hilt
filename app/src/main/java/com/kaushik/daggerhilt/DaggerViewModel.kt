package com.kaushik.daggerhilt

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class DaggerViewModel @Inject constructor(
     @Named("String2") testString2: String
)  : ViewModel() {
    init {
        Log.d("view model", "Test String from view model -- $testString2")
    }
}