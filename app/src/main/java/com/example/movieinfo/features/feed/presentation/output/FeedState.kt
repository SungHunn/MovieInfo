package com.example.movieinfo.features.feed.presentation.output

import com.example.movieinfo.features.common.entity.MovieFeedItemEntity

sealed class FeedState {
    object Loading : FeedState()
    class Main(
        val movieList : List<MovieFeedItemEntity>
    ) : FeedState()

    class Failed(
        val reason: String
    ) : FeedState()
}
