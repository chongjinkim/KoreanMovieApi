package com.soomgo.moiveapiproject.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.soomgo.moiveapiproject.model.MovieResponse
import com.soomgo.moiveapiproject.remotedatasource.KoreanMovieRepository

class KoreanViewModel(private val repository: KoreanMovieRepository) : ViewModel() {

    val _list = MutableLiveData<MovieResponse>()
    val list : LiveData<MovieResponse>
        get() = _list

    suspend fun getList(key : String, targetDt : String){
        _list.value = repository.couroutineGetMovies(key, targetDt)
    }
}