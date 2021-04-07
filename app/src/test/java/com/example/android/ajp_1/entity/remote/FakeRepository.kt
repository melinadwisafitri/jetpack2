package com.example.android.ajp_1.entity.remote

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.android.ajp_1.api.ApiCall
import com.example.android.ajp_1.entity.remote.response.MovieResponse
import com.example.android.ajp_1.entity.remote.response.TvShowResult

class FakeRepository(private val apiCall: ApiCall): CatalogueDataSource {

    override fun getMovieTop(): LiveData<List<MovieResponse>> {
        val movie = MutableLiveData<List<MovieResponse>>()
        apiCall.getMovieTop(movie)
        return movie
    }

    override fun getDetailMovie(movie_id: String): LiveData<MovieResponse> {
        return apiCall.getDetailMovie(movie_id)
    }

    override fun getTvShowTop(): LiveData<List<TvShowResult>> {
        val tv = MutableLiveData<List<TvShowResult>>()
        apiCall.getTvShowTop(tv)
        return tv
    }

    override fun getDetailTv(tv_id: String): LiveData<TvShowResult> {
        return apiCall.getDetailTvShow(tv_id)
    }

}