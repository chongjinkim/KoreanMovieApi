package com.soomgo.moiveapiproject.model

import android.os.Parcelable
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DailyBoxOffice(
    val audiAcc: String,
    val audiChange: String,
    val audiCnt: String,
    val audiInten: String,
    val movieCd: String,
    val movieNm: String,
    val openDt: String,
    val rank: String,
    val rankInten: String,
    val rankOldAndNew: String,
    val rnum: String,
    val salesAcc: String,
    val salesAmt: String,
    val salesChange: String,
    val salesInten: String,
    val salesShare: String,
    val scrnCnt: String,
    val showCnt: String
) : Parcelable {
    companion object{
        val DiffUtil = object : DiffUtil.ItemCallback<DailyBoxOffice>(){
            override fun areItemsTheSame(
                oldItem: DailyBoxOffice,
                newItem: DailyBoxOffice
            ) = oldItem == newItem

            override fun areContentsTheSame(
                oldItem: DailyBoxOffice,
                newItem: DailyBoxOffice
            ) = oldItem == newItem

        }
    }
}

data class MovieResponse(

    val movie : List<DailyBoxOffice> = emptyList()
)