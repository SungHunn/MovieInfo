package com.example.movieinfo.features.detail.domain.usecase

import com.example.movieinfo.features.common.entity.MovieDetailEntity
import com.example.movieinfo.features.common.repository.IMovieDataSource
import javax.inject.Inject

class GetMovieDetailUseCase @Inject constructor(
    private val dataSource: IMovieDataSource
) : IGetMovieDetailUseCase {
    override suspend fun invoke(name: String): MovieDetailEntity {
        return dataSource.getMovieDetail(name)
    }
}