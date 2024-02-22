package com.example.movieinfo.features.feed.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.movieinfo.features.common.repository.IMovieDataSource
import com.example.movieinfo.features.feed.presentation.input.IFeedViewModelInput
import com.example.movieinfo.features.feed.presentation.output.FeedState
import com.example.movieinfo.features.feed.presentation.output.FeedUiEffect
import com.example.movieinfo.features.feed.presentation.output.IFeedViewModelOutput
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FeedViewModel @Inject constructor(
    private val movieRepository: IMovieDataSource
) : ViewModel(), IFeedViewModelInput, IFeedViewModelOutput {

    // 화면에 보여주기 위한 flow
    private val _feedState: MutableStateFlow<FeedState> =
        MutableStateFlow(FeedState.Loading)
    override val feedState : StateFlow<FeedState>
        get() = _feedState

    // 유저로부터 입력을 받아서 Fragment 단에서 액션을 수행하기 위한 flow
    private val _feedUiEffect = MutableSharedFlow<FeedUiEffect>(replay = 0)
    override val feedUiEffect : SharedFlow<FeedUiEffect>
        get() = _feedUiEffect



    fun getMovies() {
        viewModelScope.launch {
            movieRepository.getMovieList()
        }
    }

    override fun openDetail(movieName: String) {
        TODO("Not yet implemented")
    }

    override fun openInfoDialog() {
        TODO("Not yet implemented")
    }

    override fun refreshFeed() {
        TODO("Not yet implemented")
    }
}