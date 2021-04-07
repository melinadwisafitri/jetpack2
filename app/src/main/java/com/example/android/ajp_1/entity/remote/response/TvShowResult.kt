package com.example.android.ajp_1.entity.remote.response

import com.google.gson.annotations.SerializedName

data class TvShowResult (

    @field:SerializedName("id")
    var tvShowId: String,
    @SerializedName("name")
    var title: String,
    @SerializedName("overview")
    var decription: String,
    @SerializedName("poster_path")
    var imagePath: String,
    @SerializedName("vote_average")
    var user_score: Double,
    @SerializedName("backdrop_path")
    var ImgPathBgr: String,
    @SerializedName("first_air_date")
    val date: String,
    @SerializedName("number_of_episodes")
    val nEpisode: Int,
    @SerializedName("number_of_seasons")
    val nSeason: Int,
    @SerializedName("tagline")
    val tagline: String
)

data class TvShowResponse(
    @SerializedName("page")
    val page: Int,
    @SerializedName("total_results")
    val total_result: Int,
    @SerializedName("total_pages")
    val total_page:Int,
    @SerializedName("results")
    val results: List<TvShowResult> = mutableListOf()
)