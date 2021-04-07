package com.example.android.ajp_1.utils

import androidx.test.espresso.IdlingResource
import androidx.test.espresso.idling.CountingIdlingResource

object EspressoIdlingResource {
    private val RESOURCE = "GLOBAL"
    val expressoTestIdlingResource= CountingIdlingResource(RESOURCE)

    fun increment(){
        expressoTestIdlingResource.increment()
    }

    fun decrement(){
        expressoTestIdlingResource.decrement()
    }

    fun getEspressoIdlingResourse(): IdlingResource {
        return expressoTestIdlingResource
    }

}