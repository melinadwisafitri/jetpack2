package com.example.android.ajp_1.ui.detail

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.android.ajp_1.MainActivity
import com.example.android.ajp_1.R
import com.example.android.ajp_1.entity.remote.response.MovieResponse
import com.example.android.ajp_1.viemodel.ViewModelFactory
import kotlinx.android.synthetic.main.content_detail.*
import kotlinx.android.synthetic.main.content_detail.btn_bck_movie
import kotlinx.android.synthetic.main.content_detail.img_poster_movie
import kotlinx.android.synthetic.main.content_detail.img_poster_bgr
import kotlinx.android.synthetic.main.content_detail.tv_desc
import kotlinx.android.synthetic.main.content_detail.tv_rilis
import kotlinx.android.synthetic.main.content_detail.tv_title_movie

class DetailMovieActivity : AppCompatActivity(), View.OnClickListener{
    companion object{
        const val EXTRA_POSTER ="extra_poster"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        btn_bck_movie.setBackgroundResource(0)
        btn_share_movie.setBackgroundResource(0)
        val factory = ViewModelFactory.getInstance()
        val viewModel = ViewModelProvider(this, factory)[DetailMovieViewModel::class.java]

        progressbar.visibility = View.VISIBLE

        val extras = intent.extras
        if (extras != null){
            val movieId = extras.getParcelable<MovieResponse>(EXTRA_POSTER)

            if (movieId != null){
                viewModel.setSelectedMovie(movieId.movieId)
                progressbar.visibility = View.GONE
                viewModel.getDetailMovie().observe(this, Observer { movie: MovieResponse->
                    getDetail(movie)
                })
            }

        }
    }
    @SuppressLint("SetTextI18n")
    private fun getDetail(movie: MovieResponse){
        tv_title_movie.text = movie.title
        tv_rilis.text = movie.rilis
        tv_desc.text = movie.description
        tv_tagline.text = "#"+movie.tageline
        rt_userScore.rating = movie.user_score.toFloat()
        tv_genre.text = movie.user_score.toString()
        tv_status.text = movie.status
        Glide.with(this)
            .load("https://image.tmdb.org/t/p/w600_and_h900_bestv2"+movie.imgPath)
            .apply(RequestOptions.placeholderOf(R.drawable.ic_baseline_refresh))
            .error(R.drawable.ic_baseline_broken_image)
            .into(img_poster_movie)
        Glide.with(this)
            .load("https://image.tmdb.org/t/p/w533_and_h300_bestv2"+movie.imgPathBgr)
            .apply(RequestOptions.placeholderOf(R.drawable.ic_baseline_refresh))
            .error(R.drawable.ic_baseline_broken_image)
            .into(img_poster_bgr)
        btn_share_movie.setOnClickListener{
            val intentshare =Intent(Intent.ACTION_SEND)
            intentshare.putExtra(Intent.EXTRA_TEXT, "visit the link for information \nhttps://www.themoviedb.org/movie/"+ movie.movieId)
            intentshare.type = "text/plain"
            startActivity(intentshare)
        }
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_bck_movie ->{
                startActivity(Intent(this, MainActivity::class.java))
            }
        }
    }
}