package com.soomgo.moiveapiproject.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.soomgo.moiveapiproject.model.MovieResponse
import com.soomgo.moiveapiproject.remotedatasource.KoreanMovieRepository
import kotlinx.coroutines.launch

class KoreanViewModel(private val repository: KoreanMovieRepository) : ViewModel() {

    init {
        viewModelScope.launch {
            getList()
        }
    }

    val _list = MutableLiveData<MovieResponse>()
    val list : LiveData<MovieResponse>
        get() = _list

    //키값, 날짜 넣기
    suspend fun getList(){
        _list.value = repository.couroutineGetMovies("d907275c79eb170688f9bedcba7f3b90", "20211111")
    }
}