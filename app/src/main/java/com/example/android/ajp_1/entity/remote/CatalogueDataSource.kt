package com.example.android.ajp_1.entity.remote

import androidx.lifecycle.LiveData
import com.example.android.ajp_1.entity.remote.response.MovieResponse
import com.example.android.ajp_1.entity.remote.response.TvShowResult

interface CatalogueDataSource{

    fun getMovieTop(): LiveData<List<MovieResponse>>

    fun getDetailMovie(movie_id: String): LiveData<MovieResponse>

    fun getTvShowTop(): LiveData<List<TvShowResult>>

    fun getDetailTv(tv_id: String): LiveData<TvShowResult>
}