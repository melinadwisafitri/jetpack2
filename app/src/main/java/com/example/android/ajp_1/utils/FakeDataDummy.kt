package com.example.android.ajp_1.utils


import com.example.android.ajp_1.entity.remote.response.MovieResponse
import com.example.android.ajp_1.entity.remote.response.TvShowResult

object FakeDataDummy {
    fun generateDummyMovie(): List<MovieResponse> {
        val movie = ArrayList<MovieResponse>()

        movie.add(
            MovieResponse(
                "1234",
                "A Star Is Born",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/wrFpXMNBRj2PBiN4Z5kix51XaIZ.jpg",
                "https://image.tmdb.org/t/p/w533_and_h300_bestv2/mnDvPokXpvsdPcWSjNRPhiiLOKu.jpg",
                "A country music star whose career is starting to fade, Jackson Maine (Bradley Cooper) discovers a very talented talent in a young musician named Ally (Lady Gaga). Maine managed to orbit Ally into a promising young star. But the two of them are involved in a relationship that goes beyond just mentors and students. As Ally and himself skyrocketed, Maine ran into a dilemma regarding this matter.",
                "05/10/2018 (US)",
                7.5,
                "The fight for the future has begun.",
                "realeses"
            )
        )

        return movie
    }

    fun generateDummyTv(): List<TvShowResult> {
        val tv = ArrayList<TvShowResult>()

        tv.add(
            TvShowResult(
                "1234",
                "A Star Is Born",
                "A country music star whose career is starting to fade, Jackson Maine (Bradley Cooper) discovers a very talented talent in a young musician named Ally (Lady Gaga). Maine managed to orbit Ally into a promising young star. But the two of them are involved in a relationship that goes beyond just mentors and students. As Ally and himself skyrocketed, Maine ran into a dilemma regarding this matter",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/wrFpXMNBRj2PBiN4Z5kix51XaIZ.jpg",
                7.5,
                "",
                "05/10/2018 (US)",
                10,
                2,
                "The fight for the future has begun.",
            )
        )

        return tv
    }
}