package com.mayhsupaing.movieshelf.activities.activities.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mayhsupaing.movieshelf.R;
import com.mayhsupaing.movieshelf.activities.activities.viewholders.ItemsMovieDetailsViewHolder;
import com.mayhsupaing.movieshelf.activities.activities.viewholders.ItemsMovieViewHolder;




public class MoviesDetailsAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);
        View movieItemsDetailsView=inflater.inflate(R.layout.items_movies_details_trailer,parent,false);
        ItemsMovieDetailsViewHolder itemsMovieDetailsViewHolder=new ItemsMovieDetailsViewHolder(movieItemsDetailsView);
        return itemsMovieDetailsViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
