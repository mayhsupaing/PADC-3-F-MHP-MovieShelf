package com.mayhsupaing.movieshelf.activities.activities.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mayhsupaing.movieshelf.R;
import com.mayhsupaing.movieshelf.activities.activities.MainActivity;
import com.mayhsupaing.movieshelf.activities.activities.data.vo.MovieVO;
import com.mayhsupaing.movieshelf.activities.activities.delegates.MovieActionDelegate;
import com.mayhsupaing.movieshelf.activities.activities.viewholders.ItemsMovieViewHolder;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by Lenovo on 12/6/2017.
 */

public class MoviesAdapter extends RecyclerView.Adapter<ItemsMovieViewHolder>{
    public MovieActionDelegate mMovieActionDelegate;

    private List<MovieVO> mMovieList;

    public MoviesAdapter(MovieActionDelegate movieActionDelegate) {
        mMovieActionDelegate = movieActionDelegate;
        mMovieList=new ArrayList<>();
    }

    @Override
    public ItemsMovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);
        View movieItemView=inflater.inflate(R.layout.items_movie,parent,false);
        ItemsMovieViewHolder itemMovieHolder=new ItemsMovieViewHolder(movieItemView,mMovieActionDelegate);
        return itemMovieHolder;
    }

    @Override
    public void onBindViewHolder(ItemsMovieViewHolder holder, int position) {
        holder.setMovie(mMovieList.get(position));
    }

    @Override
    public int getItemCount() {
        return mMovieList.size();
    }

    public void setMovies(List<MovieVO> movieList){
        mMovieList=movieList;
        notifyDataSetChanged();
    }

}
