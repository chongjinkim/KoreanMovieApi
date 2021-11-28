package com.soomgo.moiveapiproject.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.soomgo.moiveapiproject.databinding.LayoutRecyclerviewItemBinding
import com.soomgo.moiveapiproject.model.DailyBoxOffice

class MainAdapter : ListAdapter<DailyBoxOffice, MainAdapter.MainViewHolder>(DailyBoxOffice.DiffUtil) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view = LayoutRecyclerviewItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return MainViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.binding.apply {
            title.text = getItem(position).movieNm
            subTitle.text = getItem(position).rank
        }
    }

    inner class MainViewHolder(val binding : LayoutRecyclerviewItemBinding) : RecyclerView.ViewHolder(binding.root)
}