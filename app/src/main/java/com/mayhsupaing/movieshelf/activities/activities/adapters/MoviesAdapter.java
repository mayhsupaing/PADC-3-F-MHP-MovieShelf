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
import com.mayhsupaing.movieshelf.activities.activities.viewholders.ItemsMovieViewHolder;

import org.w3c.dom.Text;

import java.util.zip.Inflater;

/**
 * Created by Lenovo on 12/6/2017.
 */

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MovieViewHolder>{

    private String[] movieTitle={"Cook Up With Storm",
                        "Konfu Yoga",
                        "Dog Days",
                        "Diary of a Wimpy Kids",
                        "CJ7",
                        "Home Alone",
                        "Good Doctor",
                        "Pirate of Caribbean",
                        "Battle Ship Island",
                        "It"};

    private int[] movieLogo={R.drawable.img_dummy_cook_up_a_storm,
                R.drawable.img_dummy_kungfu_yoga,
                R.drawable.img_dummy_dog_days,
                R.drawable.img_dummy_diary_of_wimpy_kids,
                R.drawable.img_dummy_cj7,
                R.drawable.img_dummy_home_alone,
                R.drawable.img_dummy_good_doctor,
                R.drawable.img_dummy_pirates_of_caribbean,
                R.drawable.img_dummy_battle_ship_island,
                R.drawable.img_dummy_it};

    private String[] movieGenres={
            "(Food, Comedy, Romance)",
            "(Action, Adventure, Mystery, Comedy)",
            "(Comedy, Family)",
            "(Comedy, Family)",
            "( Fantasy, Drama)",
            "(Comedy, Family)",
            "(Adventure, Comedy)",
            "Medical",
            "(Fantasy, Action)",
            "(Thriller, Drama)"};



    class MovieViewHolder extends RecyclerView.ViewHolder{

        public int currentItems;
        public ImageView movieImage;
        public TextView movietitle;
        public TextView moviegenres;

        public MovieViewHolder(View itemView) {
            super(itemView);
            movieImage=(ImageView) itemView.findViewById(R.id.iv_movie_logo);
            movietitle=(TextView) itemView.findViewById(R.id.tv_movie_title);
            moviegenres=(TextView) itemView.findViewById(R.id.tv_movie_genres);
        }

    }
    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);
        View movieItemView=inflater.inflate(R.layout.items_movie,parent,false);
        MovieViewHolder movieViewHolder=new MovieViewHolder(movieItemView);
        return movieViewHolder;

    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int i) {
        holder.movieImage.setImageResource(movieLogo[i]);
        holder.movietitle.setText(movieTitle[i]);
        holder.moviegenres.setText(movieGenres[i]);

    }

    @Override
    public int getItemCount() {
        return 10;
    }


}
