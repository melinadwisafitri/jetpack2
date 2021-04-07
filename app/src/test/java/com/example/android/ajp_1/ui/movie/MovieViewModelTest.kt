package com.example.android.ajp_1.ui.movie

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.example.android.ajp_1.entity.remote.Repository
import com.example.android.ajp_1.entity.remote.response.MovieResponse
import com.example.android.ajp_1.utils.FakeDataDummy
import com.nhaarman.mockitokotlin2.spy
import com.nhaarman.mockitokotlin2.verify
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnit
import org.mockito.junit.MockitoJUnitRunner

@RunWith(org.mockito.runners.MockitoJUnitRunner::class)
class MovieViewModelTest {
    private lateinit var viewModel: MovieViewModel

    @get:Rule
    var instantTaskRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var repository: Repository

    @Mock
    private lateinit var observer: Observer<List<MovieResponse>>

    @Before
    fun setUp(){
        viewModel = spy(MovieViewModel(repository))
    }

    @Test
    fun getMovie() {
        val fakeDummy = FakeDataDummy.generateDummyMovie()
        val movie = MutableLiveData<List<MovieResponse>>()
        movie.value = fakeDummy

        `when`(repository.getMovieTop()).thenReturn(movie)
        val entity = viewModel.getMovie().value
        verify(repository).getMovieTop()
        assertNotNull(entity)
        assertEquals(1, entity?.size)

        viewModel.getMovie().observeForever(observer)
        verify(observer).onChanged(fakeDummy)
    }
}