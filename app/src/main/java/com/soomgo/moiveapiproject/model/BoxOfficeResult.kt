package com.soomgo.moiveapiproject.model

data class BoxOfficeResult(
    val boxofficeType: String,
    val dailyBoxOfficeList: List<DailyBoxOffice>,
    val showRange: String
)