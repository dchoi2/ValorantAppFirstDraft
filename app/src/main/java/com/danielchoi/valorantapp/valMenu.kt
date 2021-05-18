package com.danielchoi.valorantapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_val_menu.view.*

class valMenu : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView =  inflater.inflate(R.layout.fragment_val_menu, container, false)

        rootView.imageView_menu_agent.setOnClickListener{
            it.findNavController().navigate(R.id.action_valMenu_to_agentFragment)
        }
        rootView.imageView_menu_weapon.setOnClickListener{
            it.findNavController().navigate(R.id.action_valMenu_to_weaponFragment)
        }

        return rootView
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            valMenu()
    }
}