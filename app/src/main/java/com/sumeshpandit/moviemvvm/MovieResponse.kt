package com.sumeshpandit.moviemvvm

import com.google.gson.annotations.SerializedName

data class MovieResponse(
    @SerializedName("results")
    val movies : List<Movie>

) {
    constructor() : this(mutableListOf())
}