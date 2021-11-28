package com.soomgo.moiveapiproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import com.soomgo.moiveapiproject.adapter.MainAdapter
import com.soomgo.moiveapiproject.databinding.ActivityMainBinding
import com.soomgo.moiveapiproject.fragment.KoreanFragment
import com.soomgo.moiveapiproject.viewmodel.KoreanViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity(){

    lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.apply {
            startBtn.setOnClickListener {
                Intent(this@MainActivity, KoreanFragment::class.java).apply {
                    startActivity(this)
                }
            }
        }

    }

}

