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

class Page2Fragment : Fragment() {

    companion object {
        fun newInstance() = Page2Fragment()
    }

    private lateinit var viewModel: Page2ViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.page2_fragment, container, false)
        view.findViewById<Button>(R.id.button2).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.secondActivity)
        }
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(Page2ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
