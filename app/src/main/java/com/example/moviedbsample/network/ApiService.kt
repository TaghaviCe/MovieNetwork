package com.example.moviedbsample.network

import com.example.moviedbsample.MovieList
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query


private const val BASE_URL = "https://api.themoviedb.org/3"

private const val API_KEY = "b8fb74a7f7ebe3f2402f6de80059d5a5"

/**
 * Build the Moshi object that Retrofit will be using, making sure to add the Kotlin adapter for
 * full Kotlin compatibility.
 */
private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

/**
 * Use the Retrofit builder to build a retrofit object using a Moshi converter with our Moshi
 * object.
 */
private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

/**
 * A public interface that exposes the [getPhotos] method
 */
interface ApiService {

    @GET("/movie/popular")
    suspend fun getMovies(
        @Query("page") page:Int=1,
        @Query("api_key") apikey:String= API_KEY
    ): List<MovieList>
}

/**
 * A public Api object that exposes the lazy-initialized Retrofit service
 */
object MoviesApi {
    val retrofitService: ApiService by lazy { retrofit.create(ApiService::class.java) }
}
