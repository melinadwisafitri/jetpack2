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
import com.example.android.ajp_1.entity.remote.response.TvShowResult
import com.example.android.ajp_1.viemodel.ViewModelFactory
import kotlinx.android.synthetic.main.content_detailtvshow.*
import kotlinx.android.synthetic.main.content_detailtvshow.btn_bck_tvshow
import kotlinx.android.synthetic.main.content_detailtvshow.img_poster
import kotlinx.android.synthetic.main.content_detailtvshow.img_poster_bgr
import kotlinx.android.synthetic.main.content_detailtvshow.tv_desc
import kotlinx.android.synthetic.main.content_detailtvshow.tv_title

class DetailTvShowActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_TVSHOWS = "extra_tvshows"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_tv_show)

        btn_bck_tvshow.setBackgroundResource(0)
        btn_share.setBackgroundResource(0)
        progressbar_tvshow.visibility = View.VISIBLE

        val factory = ViewModelFactory.getInstance()
        val viewModel= ViewModelProvider(this, factory)[DetailMovieViewModel::class.java]

        val extras = intent.extras
        if (extras != null){
            val tvShowId = extras.getString(EXTRA_TVSHOWS)
            if (tvShowId != null){
                viewModel.setSelectedMovie(tvShowId)
                progressbar_tvshow.visibility = View.GONE
                viewModel.getDetailTvShow().observe(this, Observer { tv: TvShowResult->
                    getDetail(tv)
                })
                }
            }

        }

    @SuppressLint("SetTextI18n")
    private fun getDetail(tvShow: TvShowResult){
        tv_title.text = tvShow.title
        tv_desc.text = tvShow.decription
        tv_tagline.text = "#"+tvShow.tagline
        tv_episode.text = tvShow.nEpisode.toString()+" Episode"
        tv_season.text = tvShow.nSeason.toString()+" Seasons"

        Glide.with(this)
            .load("https://image.tmdb.org/t/p/w600_and_h900_bestv2"+tvShow.imagePath)
            .apply(RequestOptions.placeholderOf(R.drawable.ic_baseline_refresh))
            .error(R.drawable.ic_baseline_broken_image)
            .into(img_poster)
        Glide.with(this)
            .load("https://image.tmdb.org/t/p/w533_and_h300_bestv2"+tvShow.imagePath)
            .apply(RequestOptions.placeholderOf(R.drawable.ic_baseline_refresh))
            .error(R.drawable.ic_baseline_broken_image)
            .into(img_poster_bgr)
        btn_bck_tvshow.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        btn_share.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT,"visit the link for information \nhttps://www.themoviedb.org/tv/"+tvShow.tvShowId)
            startActivity(intent)
        }
    }
}