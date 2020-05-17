package com.github.yuk7.picolle.ui.main.main

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.github.yuk7.picolle.R
import com.github.yuk7.picolle.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private val mainViewModel =
        MainViewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = DataBindingUtil.inflate<FragmentMainBinding>(
            inflater,
            R.layout.fragment_main,
            container,
            false
        )
        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = mainViewModel
        mainViewModel.onStartActivity.observe(viewLifecycleOwner, Observer { value ->
            val intent = Intent(context, value.first::class.java)
            if (value.second != null) {
                intent.putExtras(value.second!!)
            }
            startActivity(intent)
        })
        return binding.root
    }

}
