package com.soomgo.moiveapiproject.remotedatasource

import com.soomgo.moiveapiproject.model.MovieResponse
import com.soomgo.moiveapiproject.network.Client

interface KoreanMovieRepository {

    suspend fun couroutineGetMovies(key : String, targetDt : String) : MovieResponse
}

class KoreanMovieRepositoryImpl(val client : Client) : KoreanMovieRepository{

    override suspend fun couroutineGetMovies(key: String, targetDt: String): MovieResponse {
        return client.koreanAPI.getDailyMovies(key, targetDt)
    }

}