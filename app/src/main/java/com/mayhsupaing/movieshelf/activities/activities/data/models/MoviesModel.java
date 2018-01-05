package com.mayhsupaing.movieshelf.activities.activities.data.models;

import com.mayhsupaing.movieshelf.activities.activities.networks.HttpUrlConnectionDataAgent;
import com.mayhsupaing.movieshelf.activities.activities.networks.MoviesDataAgent;

/**
 * Created by Lenovo on 12/25/2017.
 */

public class MoviesModel {

    private MoviesDataAgent mDataAgent;

    private static MoviesModel sObjInstance;

    private MoviesModel(){
        mDataAgent= HttpUrlConnectionDataAgent.getsObjInstance();
    }

    public static MoviesModel getsObjInstance(){
        if(sObjInstance==null)
        {
            sObjInstance=new MoviesModel();
        }
        return sObjInstance;
    }

    /**
     *load movie from api.
     */
    public void loadMovies(){
        mDataAgent.loadMovies();
    }
}
