package com.github.chiiia12.jetpacksample.ui.main

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.github.chiiia12.jetpacksample.R

class Page1Fragment : Fragment() {

    companion object {
        fun newInstance() = Page1Fragment()
    }

    private lateinit var viewModel: Page1ViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.page1_fragment, container, false)
        view.findViewById<Button>(R.id.button).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.page2Fragment)
        }
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(Page1ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
