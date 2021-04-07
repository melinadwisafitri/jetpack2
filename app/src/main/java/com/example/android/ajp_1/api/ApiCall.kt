package com.example.android.ajp_1.api

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.android.ajp_1.BuildConfig
import com.example.android.ajp_1.entity.remote.response.*
import com.example.android.ajp_1.utils.EspressoIdlingResource
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ApiCall {
    private var LANGUAGE:String = "en-US"

    companion object{
        @Volatile
        private var instance: ApiCall?= null

        fun getInstance(): ApiCall=
            instance?: synchronized(this){
                instance?: ApiCall()
        }
    }

    fun getMovieTop(liveData : MutableLiveData<List<MovieResponse>>) {
        EspressoIdlingResource.increment()
        val call = ApiClient.service.getMovieTop(BuildConfig.ApiKey, LANGUAGE, 1)
        call.enqueue(object : Callback<MovieResult>{
            override fun onResponse(call: Call<MovieResult>, response: Response<MovieResult>) {
                if (response.isSuccessful){
                    val list = response.body()?.result
                    liveData.postValue(list)
                }
            }

            override fun onFailure(call: Call<MovieResult>?, t: Throwable?) {

            }
        })
        EspressoIdlingResource.decrement()
    }

    fun getDetailMovie(id: String): LiveData<MovieResponse>{
        EspressoIdlingResource.increment()
        val detailResult = MutableLiveData<MovieResponse>()
        val call = ApiClient.service.getDetailMovie(id, BuildConfig.ApiKey, LANGUAGE)
        call.enqueue(object : Callback<MovieResponse>{
            override fun onResponse(call: Call<MovieResponse>,
                response: Response<MovieResponse>
            ) {
                if (response.isSuccessful){
                    val list = response.body()
                    detailResult.postValue(list)
                }
            }

            override fun onFailure(call: Call<MovieResponse>?, t: Throwable?) {
                TODO("Not yet implemented")
            }
        })
        EspressoIdlingResource.decrement()
        return detailResult

    }
    fun getTvShowTop(liveData: MutableLiveData<List<TvShowResult>>){
        EspressoIdlingResource.increment()
        val call = ApiClient.service.getTvShowTop(BuildConfig.ApiKey, LANGUAGE, 1)
        call.enqueue(object : Callback<TvShowResponse>{
            override fun onResponse(call: Call<TvShowResponse>, response: Response<TvShowResponse>) {
                if (response.isSuccessful) {
                    val list = response.body().results
                    liveData.postValue(list)
                }
            }

            override fun onFailure(call: Call<TvShowResponse>?, t: Throwable?) {

            }
        })
        EspressoIdlingResource.decrement()
    }
    fun getDetailTvShow(id: String): LiveData<TvShowResult>{
       EspressoIdlingResource.increment()
        val detail = MutableLiveData<TvShowResult>()
        val  call = ApiClient.service.getDetailTvShow(id, BuildConfig.ApiKey, LANGUAGE)
        call.enqueue(object :Callback<TvShowResult>{
            override fun onResponse(call: Call<TvShowResult>, response: Response<TvShowResult>) {
                if (response.isSuccessful){
                    val list = response.body()
                    detail.postValue(list)
                }
            }

            override fun onFailure(call: Call<TvShowResult>?, t: Throwable?) {
                TODO("Not yet implemented")
            }
        })
        EspressoIdlingResource.decrement()
        return detail
    }

}