package com.sandrobarbosa.mymovies.repository

import com.sandrobarbosa.mymovies.dataSource.GetMoviesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {
    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "efac251a13e221211b0d4b426e6794ff",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}
