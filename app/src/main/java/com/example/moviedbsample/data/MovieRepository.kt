package com.example.moviedbsample.data

import com.example.moviedbsample.MovieList

class MovieRepository(val movieRemoteDataSource: MovieRemoteDataSource) {

    suspend fun getMovie():List<MovieList>{
        return movieRemoteDataSource.getMovie()
    }


}