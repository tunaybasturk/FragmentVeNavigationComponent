package com.example.fragmentandnavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.fragmentandnavigationcomponent.databinding.FragmentABinding


class FragmentA : Fragment() {
    private lateinit var binding:FragmentABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentABinding.inflate(inflater, container, false)

        binding.buttonGecis.setOnClickListener {
            val bilgi = binding.editTextBilgi.text.toString()

            val gecis = FragmentADirections.bilgiGecis(bilgi = bilgi)

            Navigation.findNavController(it).navigate(gecis)
        }

        return binding.root
    }

}