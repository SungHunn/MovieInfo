package com.example.movieinfo.features.common.repository

import com.example.movieinfo.features.common.entity.CategoryEntity
import com.example.movieinfo.features.common.entity.EntityWrapper
import com.example.movieinfo.features.common.entity.MovieDetailEntity
import com.example.movieinfo.features.feed.domain.enum.SortOrder

interface IMovieDataSource {
    suspend fun getCategories(sortOrder: SortOrder? = null): EntityWrapper<List<CategoryEntity>>
    suspend fun getMovieDetail(movieName: String): MovieDetailEntity
}