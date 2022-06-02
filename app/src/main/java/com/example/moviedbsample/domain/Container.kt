package com.example.moviedbsample.domain

import com.example.moviedbsample.data.MovieRemoteDataSource
import com.example.moviedbsample.data.MovieRepository

object Container {
    val movieRemoteDataSource=MovieRemoteDataSource()
    val movieRepository=MovieRepository(movieRemoteDataSource)
}