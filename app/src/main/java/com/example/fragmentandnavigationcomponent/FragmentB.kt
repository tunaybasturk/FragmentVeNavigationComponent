package com.example.fragmentandnavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.fragmentandnavigationcomponent.databinding.FragmentBBinding


class FragmentB : Fragment() {
    private lateinit var binding:FragmentBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBBinding.inflate(inflater, container, false)

        val bundle:FragmentBArgs by navArgs()

        binding.textViewBilgi.text = bundle.bilgi

        return binding.root
    }

}