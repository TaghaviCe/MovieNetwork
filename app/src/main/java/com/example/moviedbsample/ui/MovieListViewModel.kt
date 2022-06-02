package com.example.moviedbsample.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.moviedbsample.MovieList
import com.example.moviedbsample.domain.Container
import kotlinx.coroutines.launch

enum class ApiStatus{LOADING,DONE,ERROR}
class MovieListViewModel:ViewModel() {
    var status=MutableLiveData<ApiStatus>()
    var movieList=MutableLiveData<List<MovieList>>()
    init {
        getMovies()
    }

   fun getMovies() {
       status.value=ApiStatus.LOADING
        viewModelScope.launch {
            val list=Container.movieRepository.getMovie()
            movieList.value=list
            status.value=ApiStatus.DONE

        }
    }
}