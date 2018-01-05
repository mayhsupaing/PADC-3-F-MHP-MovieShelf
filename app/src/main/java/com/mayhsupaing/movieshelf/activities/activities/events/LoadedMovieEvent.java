package com.mayhsupaing.movieshelf.activities.activities.events;

import com.mayhsupaing.movieshelf.activities.activities.data.vo.MovieVO;

import java.util.List;

/**
 * Created by Lenovo on 12/28/2017.
 */

public class LoadedMovieEvent {

    private List<MovieVO> movieList;

    public LoadedMovieEvent(List<MovieVO> movieList) {
        this.movieList = movieList;
    }

    public List<MovieVO> getMovieList() {
        return movieList;
    }
}
