package com.example.movieinfo.features.detail.domain.usecase

import com.example.movieinfo.features.common.entity.MovieDetailEntity

interface IGetMovieDetailUseCase {
    suspend operator fun invoke(name: String): MovieDetailEntity
}