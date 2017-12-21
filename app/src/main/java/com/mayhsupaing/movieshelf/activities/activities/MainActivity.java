package com.mayhsupaing.movieshelf.activities.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.mayhsupaing.movieshelf.R;
import com.mayhsupaing.movieshelf.activities.activities.adapters.MoviesAdapter;
import com.mayhsupaing.movieshelf.activities.activities.delegates.MovieActionDelegate;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MovieActionDelegate{

    @BindView(R.id.rv_movie)
    RecyclerView rvMovie;

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.fab)
    FloatingActionButton floatingActionButton;

    private MoviesAdapter moviesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this,this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        moviesAdapter=new MoviesAdapter(this);
        LinearLayoutManager LinearLayoutManager=new LinearLayoutManager(getApplicationContext(),
                android.support.v7.widget.LinearLayoutManager.VERTICAL,false);
        rvMovie.setLayoutManager(LinearLayoutManager);
        rvMovie.setAdapter(moviesAdapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onTapMovieItems() {
        Intent intent=new Intent(getApplicationContext(),MoviesDetailsActivity.class);
        startActivity(intent);
    }

    @Override
    public void onTapMovieTitle() {

    }

    @Override
    public void onTapMovieOverViewButton() {

    }
}
