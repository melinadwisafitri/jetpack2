package com.example.android.ajp_1.ui.tvShow

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.android.ajp_1.R
import com.example.android.ajp_1.entity.remote.response.TvShowResult
import com.example.android.ajp_1.ui.detail.DetailTvShowActivity
import kotlinx.android.synthetic.main.item_list.view.*

class TvShowAdapter : RecyclerView.Adapter<TvShowAdapter.TvShowVieHolder>() {
    private var listTvShow = ArrayList<TvShowResult>()

    fun setTvShow(tvShow: List<TvShowResult>?){
        if (tvShow == null) return
        listTvShow.clear()
        listTvShow.addAll(tvShow)
    }


    class TvShowVieHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(tvShow: TvShowResult){
            with(itemView){
                tv_title.text = tvShow.title
                tv_desc.text = tvShow.decription
                tv_director.text = tvShow.date
                setOnClickListener {
                    val intent = Intent(context, DetailTvShowActivity::class.java)
                    intent.putExtra(DetailTvShowActivity.EXTRA_TVSHOWS, tvShow.tvShowId)
                    context.startActivity(intent)
                }
                Glide.with(context)
                    .load("https://image.tmdb.org/t/p/w600_and_h900_bestv2"+tvShow.imagePath)
                    .apply(RequestOptions.placeholderOf(R.drawable.ic_baseline_refresh))
                    .error(R.drawable.ic_baseline_broken_image)
                    .into(img_poster)
                ratingbar.rating =tvShow.user_score.toFloat()
                tv_userscore.text = tvShow.user_score.toString()
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowVieHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return TvShowVieHolder(view)
    }

    override fun onBindViewHolder(holder: TvShowVieHolder, position: Int) {
        val tvShow = listTvShow[position]
        holder.bind(tvShow)
    }

    override fun getItemCount(): Int= listTvShow.size

}