package com.example.movieinfo.features.common.network.api

import com.example.movieinfo.features.common.network.model.MovieResponse
import com.example.movieinfo.library.network.model.ApiResult

interface IMovieAppNetworkApi {
    suspend fun getMovies(): ApiResult<List<MovieResponse>>
}