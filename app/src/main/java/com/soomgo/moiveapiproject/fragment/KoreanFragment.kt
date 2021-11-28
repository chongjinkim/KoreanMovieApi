package com.soomgo.moiveapiproject.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.soomgo.moiveapiproject.adapter.MainAdapter
import com.soomgo.moiveapiproject.databinding.LayoutFragmentKoreanBinding
import com.soomgo.moiveapiproject.viewmodel.KoreanViewModel
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

class KoreanFragment : Fragment() {

    lateinit var binding : LayoutFragmentKoreanBinding

    private val viewModel : KoreanViewModel by viewModel()

    val adapter = MainAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = LayoutFragmentKoreanBinding.inflate(inflater,container,false).apply {
        lifecycleOwner = viewLifecycleOwner
        binding = this
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.moiveRecyclerView.adapter = adapter

        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.getList()
        }

        viewModel.list.observe(viewLifecycleOwner){
            adapter.submitList(it.movie)
        }
    }
}