package com.androiddevs.mvvmnewsapp.UI.Fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.androiddevs.mvvmnewsapp.R
import com.androiddevs.mvvmnewsapp.UI.MainActivity
import com.androiddevs.mvvmnewsapp.UI.NewsViewModel

class SearchNewsFragment:Fragment(R.layout.fragment_search_news) {
    lateinit var viewModel : NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as MainActivity).viewModel
    }
}