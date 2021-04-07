package com.example.android.ajp_1.ui.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.android.ajp_1.entity.remote.Repository
import com.example.android.ajp_1.entity.remote.response.MovieResponse

class MovieViewModel(private val repository: Repository) : ViewModel() {

    fun getMovie(): LiveData<List<MovieResponse>> = repository.getMovieTop()
}