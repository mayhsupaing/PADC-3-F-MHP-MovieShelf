package com.mayhsupaing.movieshelf.activities.activities.data.vo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Lenovo on 12/19/2017.
 */

public class MovieVO {

    @SerializedName("vote_count")
    private int voteCount;
    private int id;
    private boolean video;

    @SerializedName("vote_average")
    private double voteAverage;
    private String title;
    private float popularity;

    @SerializedName("poster_path")
    private String posterPath;

    @SerializedName("original_language")
    private String originalLanguage;

    @SerializedName("original_title")
    private String originalTitle;

    @SerializedName("backdrop_path")
    private String backdropPath;
    private boolean adult;
    private String overview;

    @SerializedName("release_date")
    private String releaseDate;

    @SerializedName("genre_ids")
    private List<Integer> genresId;


    public int getVoteCount() {
        return voteCount;
    }

    public int getId() {
        return id;
    }

    public boolean isVideo() {
        return video;
    }

    public double getVoteAverage() {
        return voteAverage;
    }

    public String getTitle() {
        return title;
    }

    public float getPopularity() {
        return popularity;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public boolean isAdult() {
        return adult;
    }

    public String getOverview() {
        return overview;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public List<Integer> getGenresId() {
        return genresId;
    }
}
