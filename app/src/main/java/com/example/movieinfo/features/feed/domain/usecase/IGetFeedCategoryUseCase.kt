package com.example.movieinfo.features.feed.domain.usecase

import com.example.movieinfo.features.common.entity.CategoryEntity
import com.example.movieinfo.features.common.entity.EntityWrapper
import com.example.movieinfo.features.feed.data.mapper.CategoryMapper
import com.example.movieinfo.features.feed.domain.enum.SortOrder

interface IGetFeedCategoryUseCase {
    suspend operator fun invoke(sortOrder: SortOrder? = null): EntityWrapper<List<CategoryEntity>>
}