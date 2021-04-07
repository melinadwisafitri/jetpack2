package com.example.android.ajp_1.di


import com.example.android.ajp_1.api.ApiCall
import com.example.android.ajp_1.entity.remote.Repository

object Injection {
    fun provideRepository():  Repository{
        val apiCall = ApiCall.getInstance()
        return Repository.getInstance(apiCall)
    }
}