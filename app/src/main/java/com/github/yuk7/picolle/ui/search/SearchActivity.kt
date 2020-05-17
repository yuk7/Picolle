package com.github.yuk7.picolle.ui.search

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.github.yuk7.picolle.R
import com.github.yuk7.picolle.databinding.ActivitySearchBinding

class SearchActivity : AppCompatActivity() {
    companion object {
        fun newInstance() = SearchActivity()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivitySearchBinding>(this, R.layout.activity_search)
        binding.viewModel = SearchViewModel()
    }
}