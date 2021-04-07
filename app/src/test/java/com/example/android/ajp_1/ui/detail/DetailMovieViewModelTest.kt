package com.example.android.ajp_1.ui.detail

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.example.android.ajp_1.entity.remote.Repository
import com.example.android.ajp_1.entity.remote.response.MovieResponse
import com.example.android.ajp_1.entity.remote.response.TvShowResult
import com.example.android.ajp_1.utils.FakeDataDummy
import com.nhaarman.mockitokotlin2.verify
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.runners.MockitoJUnitRunner

@RunWith(org.mockito.junit.MockitoJUnitRunner::class)
class DetailMovieViewModelTest {
    private lateinit var viewModel: DetailMovieViewModel
    private val dummyDataMovie = FakeDataDummy.generateDummyMovie()[0]
    private var dummyDataTv = FakeDataDummy.generateDummyTv()[0]
    private val movieId = dummyDataMovie.movieId
    private val tvId = dummyDataTv.tvShowId

    @get:Rule
    var insTExecutor = InstantTaskExecutorRule()

    @Mock
    private lateinit var repository: Repository

    @Mock
    private lateinit var observer: Observer<MovieResponse>

    @Mock
    private lateinit var observertv: Observer<TvShowResult>


    @Before
    fun setUp(){
        viewModel= DetailMovieViewModel(repository)
        viewModel.setSelectedMovie(movieId)
        viewModel.setSelectedMovie(tvId)
    }

    @Test
    fun getDetailMovie() {
        val data = MutableLiveData<MovieResponse>()
        data.value = dummyDataMovie

        `when`(repository.getDetailMovie(movieId)).thenReturn(data)

        val movieEntity = viewModel.getDetailMovie().value as MovieResponse
        verify(repository).getDetailMovie(movieId)

        assertNotNull(movieEntity)
        viewModel.getDetailMovie().observeForever(observer)
        verify(observer).onChanged(dummyDataMovie)
    }

    @Test
    fun DetailTv(){
        val data = MutableLiveData<TvShowResult>()
        data.value = dummyDataTv

        `when`(repository.getDetailTv(tvId)).thenReturn(data)

        val tvShowEntity = viewModel.getDetailTvShow().value as TvShowResult
        verify(repository).getDetailTv(tvId)

        assertNotNull(tvShowEntity)
        viewModel.getDetailTvShow().observeForever(observertv)
        verify(observertv).onChanged(dummyDataTv)


    }
}