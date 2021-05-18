package com.danielchoi.valorantapp

import android.icu.text.CaseMap
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_title.view.*

class TitleFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_title, container, false)

        rootView.button_main_valorant.setOnClickListener {
            it.findNavController().navigate(R.id.action_titleFragment_to_valMenu)
        }

        return rootView
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            TitleFragment()
    }
}
