package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_ana_sehife.view.*

class FragmentAnaSehife : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val home = inflater.inflate(R.layout.fragment_ana_sehife,container,false)

        home.button.setOnClickListener { Navigation.findNavController(home).navigate(R.id.action_fragmentAnaSehife2_to_mainActivity22)}
        home.button2.setOnClickListener { Navigation.findNavController(home).navigate(R.id.action_fragmentAnaSehife2_to_mainActivity3) }
        home.button3.setOnClickListener { Navigation.findNavController(home).navigate(R.id.action_fragmentAnaSehife2_to_mainActivity4) }

        return home
    }



}