package com.mayhsupaing.movieshelf.activities.activities.networks.responses;

import com.google.gson.annotations.SerializedName;
import com.mayhsupaing.movieshelf.activities.activities.data.vo.MovieVO;

import java.util.List;

/**
 * Created by Lenovo on 12/28/2017.
 */

public class GetMoviesResponse {
    private int code;
    private String message;
    private String apiVersion;
    private String page;

    @SerializedName("popular-movies")
    private List<MovieVO> popularMovies;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public String getPage() {
        return page;
    }

    public List<MovieVO> getPopularMovies() {
        return popularMovies;
    }
}
