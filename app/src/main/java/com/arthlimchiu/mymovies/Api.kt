package com.arthlimchiu.mymovies

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface Api {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "35e5fd00b89c5a2c22603e8a08329aa5",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/top_rated")
    fun getTopRatedMovies(
        @Query("api_key") apiKey: String = "35e5fd00b89c5a2c22603e8a08329aa5",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/upcoming")
    fun getUpcomingMovies(
        @Query("api_key") apiKey: String = "35e5fd00b89c5a2c22603e8a08329aa5",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}