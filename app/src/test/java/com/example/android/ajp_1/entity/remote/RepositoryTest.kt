package com.example.android.ajp_1.entity.remote

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import com.example.android.ajp_1.entity.remote.response.MovieResponse
import com.example.android.ajp_1.entity.remote.response.TvShowResult
import com.example.android.ajp_1.utils.FakeDataDummy
import com.example.android.ajp_1.utils.LiveDataUtils
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito.*


class RepositoryTest{

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private var repository = mock(FakeRepository::class.java)

    private val movieResponse = FakeDataDummy.generateDummyMovie()
    private val movieId = movieResponse[0].movieId
    private val tvResponse = FakeDataDummy.generateDummyTv()
    private val tvId = tvResponse[0].tvShowId

    @Test
    fun getMovie(){
        val movie = MutableLiveData<List<MovieResponse>>()
        movie.value = FakeDataDummy.generateDummyMovie()

        `when`(repository.getMovieTop()).thenReturn(movie)
        val result = LiveDataUtils.getVAlue(repository.getMovieTop())
        verify(repository).getMovieTop()

        assertNotNull(result)
        assertEquals(movieResponse.size.toLong(), movieResponse.size.toLong())
    }

    @Test
    fun getTv(){
        val tv = MutableLiveData<List<TvShowResult>>()
        tv.value = FakeDataDummy.generateDummyTv()

        `when`(repository.getTvShowTop()).thenReturn(tv)
        val result = LiveDataUtils.getVAlue(repository.getTvShowTop())
        verify(repository).getTvShowTop()

        assertNotNull(result)
        assertEquals(tvResponse.size.toLong(), tvResponse.size.toLong())

    }

    @Test
    fun getDetailMovie(){
        val detailMovie = MutableLiveData<MovieResponse>()
        detailMovie.value = FakeDataDummy.generateDummyMovie()[0]

        `when`(repository.getDetailMovie(movieId)).thenReturn(detailMovie)
        val result = LiveDataUtils.getVAlue(repository.getDetailMovie(movieId))
        verify(repository).getDetailMovie(movieId)

        assertNotNull(result)
        assertEquals(movieResponse.size.toLong(), movieResponse.size.toLong())

    }

    @Test
    fun getDeatilTv(){
        val detailTv = MutableLiveData<TvShowResult>()
        detailTv.value = FakeDataDummy.generateDummyTv()[0]

        `when`(repository.getDetailTv(tvId)).thenReturn(detailTv)
        val result = LiveDataUtils.getVAlue(repository.getDetailTv(tvId))
        verify(repository).getDetailTv(tvId)

        assertNotNull(result)
        assertEquals(tvResponse.size.toLong(), tvResponse.size.toLong())
    }
}