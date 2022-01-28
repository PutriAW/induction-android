package com.example.replikalivin.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.replikalivin.databinding.FragmentBIFastBinding
import com.example.replikalivin.ui.HomebaseActivity

class BIFastFragment : Fragment() {
    private lateinit var binding: FragmentBIFastBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBIFastBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        binding.buttonDaftar.setOnClickListener{
//            it.findNavController().navigate(R.id.action_BIFastFragment_to_newsRecyclerViewFragment)
//        }
    }


}