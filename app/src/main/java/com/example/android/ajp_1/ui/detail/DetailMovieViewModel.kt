package com.example.android.ajp_1.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.android.ajp_1.entity.remote.Repository
import com.example.android.ajp_1.entity.remote.response.MovieResponse
import com.example.android.ajp_1.entity.remote.response.TvShowResult

class DetailMovieViewModel(private val repository: Repository): ViewModel() {
    private lateinit var id: String

    fun setSelectedMovie(id: String){
        this.id = id
    }

    fun getDetailMovie(): LiveData<MovieResponse> = repository.getDetailMovie(id)

    fun getDetailTvShow() : LiveData<TvShowResult> = repository.getDetailTv(id)

}