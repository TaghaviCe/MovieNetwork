package com.example.moviedbsample

import android.database.DatabaseUtils
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.example.moviedbsample.databinding.FragmentMovieListBinding
import com.example.moviedbsample.ui.MovieListViewModel

class MovieListFragment : Fragment() {
   lateinit var binding: FragmentMovieListBinding
   val viewModel:MovieListViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      binding= DataBindingUtil.inflate(inflater,R.layout.fragment_movie_list,container,false)
        binding.viewModel=viewModel
        binding.lifecycleOwner=this.viewLifecycleOwner
        return binding.root
    }


}