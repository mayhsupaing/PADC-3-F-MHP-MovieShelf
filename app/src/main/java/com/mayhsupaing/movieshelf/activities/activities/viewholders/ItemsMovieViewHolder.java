package com.mayhsupaing.movieshelf.activities.activities.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.mayhsupaing.movieshelf.R;
import com.mayhsupaing.movieshelf.activities.activities.delegates.MovieActionDelegate;

import org.w3c.dom.Text;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Lenovo on 12/6/2017.
 */

public class ItemsMovieViewHolder extends RecyclerView.ViewHolder {

    public MovieActionDelegate eMovieActionDelegate;

    public ItemsMovieViewHolder(View itemView,MovieActionDelegate movieActionDelegate) {
        super(itemView);

        ButterKnife.bind(this,itemView);
        eMovieActionDelegate=movieActionDelegate;

    }
    @OnClick(R.id.cv_movie_items)
    public void OnTapMoviesItem(View view)
    {
       /* Toast.makeText(view.getContext(),"User Listen",Toast.LENGTH_LONG).show();*/
       eMovieActionDelegate.onTapMovieItems();
    }

}
