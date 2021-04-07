package com.example.android.ajp_1.entity

data class MovieEntity (
    var movieId: String,
    var title:String,
    var imgPath:String,
    var imgPathBgr: String,
    var description : String,
    var rilis : String,
    var genre: String,
    var duration: String,
    var user_score: Double,
    var director : String,
    var link: String,
    var share_link: String
)