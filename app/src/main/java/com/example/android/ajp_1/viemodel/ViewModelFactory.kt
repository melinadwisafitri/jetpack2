package com.example.android.ajp_1.viemodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.android.ajp_1.di.Injection
import com.example.android.ajp_1.entity.remote.Repository
import com.example.android.ajp_1.ui.detail.DetailMovieViewModel
import com.example.android.ajp_1.ui.movie.MovieViewModel
import com.example.android.ajp_1.ui.tvShow.TvShowViewModel

class ViewModelFactory private constructor(private val repository: Repository):
    ViewModelProvider.NewInstanceFactory() {

    companion object{
        @Volatile
        private var instance: ViewModelFactory? = null

        fun getInstance()=
            instance?: synchronized(this){
                instance?: ViewModelFactory(Injection.provideRepository())
            }
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        when{
            modelClass.isAssignableFrom(TvShowViewModel::class.java)->{
                return TvShowViewModel(repository) as T
            }
            modelClass.isAssignableFrom(MovieViewModel::class.java)->{
                return MovieViewModel(repository) as T
            }
            modelClass.isAssignableFrom(DetailMovieViewModel::class.java)->{
                return DetailMovieViewModel(repository) as T
            }
        }
        return super.create(modelClass)
    }
}