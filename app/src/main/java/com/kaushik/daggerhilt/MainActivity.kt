package com.kaushik.daggerhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

/*
    1. Make My application.kt
    2. mention it in the manifest file
    3. Make module class (object actually)
        it contains the dependencies
    4. Annotate activity with @Android Entry point

    // View model is special case
 */


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    @Named("String1")
    lateinit var testString: String

    private val TAG ="main_activity"

    private val viewModel: DaggerViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "test string is: $testString")
        viewModel
    }
}