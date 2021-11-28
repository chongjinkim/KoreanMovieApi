package com.soomgo.moiveapiproject.remotedatasource

import com.soomgo.moiveapiproject.model.MovieResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface KoreanMovieAPI {

    @GET("/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json")
    suspend fun getDailyMovies(
        @Query("key") key : String?,
        @Query("targetDt") tagetDt : String?
    ) : MovieResponse

}