package com.example.android.ajp_1.api

import com.example.android.ajp_1.entity.remote.response.MovieResponse
import com.example.android.ajp_1.entity.remote.response.MovieResult
import com.example.android.ajp_1.entity.remote.response.TvShowResponse
import com.example.android.ajp_1.entity.remote.response.TvShowResult
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

class ApiClient {
    companion object{
        private val retrofit: Retrofit by lazy{
            Retrofit.Builder()
                .baseUrl("https://api.themoviedb.org/3/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        val service by lazy {
            val create: ApiServices = retrofit.create(ApiServices::class.java)
            create
        }
    }
}
interface ApiServices {

    @GET("movie/popular")
    fun getMovieTop(
        @Query("api_key") api_key: String,
        @Query("language") language: String,
        @Query("page") page: Int
    ): Call<MovieResult>

    @GET("movie/{movie_id}")
    fun getDetailMovie(
        @Path("movie_id") id: String,
        @Query("api_key") api_key: String,
        @Query("language") language: String
    ): Call<MovieResponse>

    @GET("tv/popular")
    fun getTvShowTop(
        @Query("api_key") api_key: String,
        @Query("language") language: String,
        @Query("page") page: Int
    ): Call<TvShowResponse>

    @GET("tv/{tv_id}")
    fun getDetailTvShow(
        @Path("tv_id") tv_id: String,
        @Query("api_key") api_key: String,
        @Query("language") language: String
    ): Call<TvShowResult>
}