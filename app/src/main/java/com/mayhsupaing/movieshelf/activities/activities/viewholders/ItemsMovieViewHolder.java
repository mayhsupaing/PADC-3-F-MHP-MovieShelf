package com.mayhsupaing.movieshelf.activities.activities.viewholders;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.mayhsupaing.movieshelf.R;
import com.mayhsupaing.movieshelf.activities.activities.data.vo.MovieVO;
import com.mayhsupaing.movieshelf.activities.activities.delegates.MovieActionDelegate;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Lenovo on 12/6/2017.
 */

public class ItemsMovieViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.tv_movie_title)
    TextView tvMovieTitle;

    @BindView(R.id.tv_rating)
    TextView tvRating;

    @BindView(R.id.iv_movie_logo)
    ImageView ivMoviePoster;

    public MovieActionDelegate mMovieActionDelegate;

    public ItemsMovieViewHolder(View itemView,MovieActionDelegate movieActionDelegate) {
        super(itemView);

        ButterKnife.bind(this,itemView);
        mMovieActionDelegate=movieActionDelegate;

    }
    @OnClick(R.id.cv_movie_items)
    public void OnTapMoviesItem(View view)
    {
       /* Toast.makeText(view.getContext(),"User Listen",Toast.LENGTH_LONG).show();*/
       mMovieActionDelegate.onTapMovieItems();
    }

    public void setMovie(MovieVO movies){
        tvMovieTitle.setText(movies.getOriginalTitle());
        tvRating.setText(Double.toString(movies.getVoteAverage()));

        Glide.with(ivMoviePoster.getContext())
                .load(movies.getPosterPath())
                .into(ivMoviePoster);

    }

}
