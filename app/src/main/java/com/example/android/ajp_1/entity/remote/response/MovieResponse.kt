package com.example.android.ajp_1.entity.remote.response

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MovieResponse (

    @field:SerializedName("id")
    val movieId: String,
    @SerializedName("title")
    val title:String,
    @SerializedName("poster_path")
    val imgPath:String,
    @SerializedName("backdrop_path")
    var imgPathBgr: String,
    @SerializedName("overview")
    var description : String,
    @SerializedName("release_date")
    var rilis : String,
    @SerializedName("vote_average")
    var user_score: Double,
    @SerializedName("tagline")
    val tageline:String,
    @SerializedName("status")
    val status:String

) : Parcelable


data class MovieResult(
    @SerializedName("page")
    val page: Int,
    @SerializedName("total_results")
    val total_result: Int,
    @SerializedName("total_pages")
    val total_page:Int,
    @SerializedName("results")
    val result: List<MovieResponse> = mutableListOf()
)
