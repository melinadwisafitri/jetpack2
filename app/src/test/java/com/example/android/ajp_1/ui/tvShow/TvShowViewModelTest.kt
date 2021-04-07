package com.example.android.ajp_1.ui.tvShow

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.example.android.ajp_1.entity.remote.Repository
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

@RunWith(org.mockito.runners.MockitoJUnitRunner::class)
class TvShowViewModelTest {
    private lateinit var viewModel: TvShowViewModel

    @get:Rule
    var instantTaskRule= InstantTaskExecutorRule()

    @Mock
    private lateinit var repository: Repository

    @Mock
    private lateinit var observer: Observer<List<TvShowResult>>

    @Before
    fun setUp(){
        viewModel = TvShowViewModel(repository)
    }

    @Test
    fun getTvShow() {
        val fakeDummy = FakeDataDummy.generateDummyTv()
        val tv = MutableLiveData<List<TvShowResult>>()
        tv.value = fakeDummy

        `when`(repository.getTvShowTop()).thenReturn(tv)
        val entity =viewModel.getTvShow().value
        verify<Repository>(repository).getTvShowTop()
        assertNotNull(entity)
        assertEquals(1, entity?.size)

        viewModel.getTvShow().observeForever(observer)
        verify(observer).onChanged(fakeDummy)
    }
}