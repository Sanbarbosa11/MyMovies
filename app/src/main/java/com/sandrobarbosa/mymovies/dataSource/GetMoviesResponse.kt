package com.sandrobarbosa.mymovies.dataSource

import com.google.gson.annotations.SerializedName
import com.sandrobarbosa.mymovies.dataSource.Movie

data class GetMoviesResponse(
    @SerializedName("page") val page: Int,
    @SerializedName("results") val movies: List<Movie>,
    @SerializedName("total_pages") val pages: Int
)

