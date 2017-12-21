package com.mayhsupaing.movieshelf.activities.activities.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mayhsupaing.movieshelf.R;
import com.mayhsupaing.movieshelf.activities.activities.viewholders.ItemsMoviesDetailsGenres;

/**
 * Created by Lenovo on 12/16/2017.
 */

public class MoviesDetailsGenres extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);
        View movieItemsDetailsGenresView=inflater.inflate(R.layout.items_movies_genres,parent,false);
        ItemsMoviesDetailsGenres itemsMovieDetailsGenresViewHolder=new ItemsMoviesDetailsGenres(movieItemsDetailsGenresView);
        return itemsMovieDetailsGenresViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
