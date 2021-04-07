package com.example.android.ajp_1.entity.remote

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.android.ajp_1.api.ApiCall
import com.example.android.ajp_1.entity.remote.response.MovieResponse
import com.example.android.ajp_1.entity.remote.response.TvShowResult

class Repository private constructor(private val apiCall: ApiCall): CatalogueDataSource {

    companion object{
        @Volatile
        private var instance: Repository? =null

        fun getInstance(apiCall: ApiCall): Repository =
            instance?: synchronized(this){
                instance?: Repository(apiCall)
            }
    }

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