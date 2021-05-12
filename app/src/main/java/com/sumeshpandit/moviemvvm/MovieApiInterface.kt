package com.sumeshpandit.moviemvvm

import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("/3/movie/popular?api_key=190468dc1c1669233fd28bec0dacca7d")
    fun getMovieList(): Call<MovieResponse>
}