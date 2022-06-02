package com.example.moviedbsample.data

import com.example.moviedbsample.MovieList
import com.example.moviedbsample.network.ApiService
import com.example.moviedbsample.network.MoviesApi

class MovieRemoteDataSource {
    suspend fun getMovie():List<MovieList>{
        return MoviesApi.retrofitService.getMovies().results
    }
//    fun getSampleMovie():List<MovieList>{
//        return listOf(
//            MovieList(),
//            MovieList("firelight")
//        )
//    }
}