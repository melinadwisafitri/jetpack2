package com.example.android.ajp_1.ui.movie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android.ajp_1.R
import com.example.android.ajp_1.entity.remote.response.MovieResponse
import com.example.android.ajp_1.viemodel.ViewModelFactory
import kotlinx.android.synthetic.main.fragment_movie.*

class MovieFragment : Fragment() {
    private lateinit var movieAdapter: MovieAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_movie, container, false)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        progressbar.visibility = View.VISIBLE
        if (activity != null){
            val factory = ViewModelFactory.getInstance()
            val viewModel = ViewModelProvider(this, factory)[MovieViewModel::class.java]
            viewModel.getMovie().observe(viewLifecycleOwner, Observer { list: List<MovieResponse>->
                movieAdapter.setmovie(list)
                movieAdapter.notifyDataSetChanged()
                progressbar.visibility = View.GONE
            })
            viewModel.getMovie()

            with(rv_movie){
                movieAdapter = MovieAdapter()
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = movieAdapter
            }
        }
    }

}