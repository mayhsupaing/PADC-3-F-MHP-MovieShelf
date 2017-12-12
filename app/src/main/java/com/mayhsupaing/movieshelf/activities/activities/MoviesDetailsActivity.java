package com.mayhsupaing.movieshelf.activities.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.WindowManager;
import android.widget.Adapter;
import android.widget.LinearLayout;
import android.widget.Toolbar;

import com.mayhsupaing.movieshelf.R;
import com.mayhsupaing.movieshelf.activities.activities.adapters.MoviesAdapter;
import com.mayhsupaing.movieshelf.activities.activities.adapters.MoviesDetailsAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;




public class MoviesDetailsActivity extends AppCompatActivity {

    @BindView(R.id.rv_movies_details_trailer)
    RecyclerView rvMoviesDetails;

    /*@BindView(R.id.fab)
    FloatingActionButton floatingActionButton;
*/
    private MoviesDetailsAdapter moviesDetailsAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies_details);
        ButterKnife.bind(this,this);


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        moviesDetailsAdapter=new MoviesDetailsAdapter();
        LinearLayoutManager LinearLayoutManager=new LinearLayoutManager(getApplicationContext(),
                android.support.v7.widget.LinearLayoutManager.HORIZONTAL,false);
        rvMoviesDetails.setLayoutManager(LinearLayoutManager);
        rvMoviesDetails.setAdapter(moviesDetailsAdapter);


    }
}
