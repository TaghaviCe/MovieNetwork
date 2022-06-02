package com.example.moviedbsample.network

import com.example.moviedbsample.MovieList
import com.squareup.moshi.Json

data class ApiResult (
    @Json(name = "page")
    val page: Long,
    @Json(name = "results")
    val results: List<MovieList>,

//    @Json(name = "total_pages")
//    val totalPages: Long,
//
//    @Json(name = "total_results")
//    val totalResults: Long
)