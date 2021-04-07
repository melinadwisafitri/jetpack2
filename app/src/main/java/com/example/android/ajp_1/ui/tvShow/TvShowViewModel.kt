package com.example.android.ajp_1.ui.tvShow


import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.android.ajp_1.entity.remote.Repository
import com.example.android.ajp_1.entity.remote.response.TvShowResult

class TvShowViewModel(private val repository: Repository) : ViewModel() {

    fun getTvShow(): LiveData<List<TvShowResult>> = repository.getTvShowTop()
}