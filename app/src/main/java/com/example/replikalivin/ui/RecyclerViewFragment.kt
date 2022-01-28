package com.example.replikalivin.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.replikalivin.adapter.RecycleViewAdapter
import com.example.replikalivin.databinding.FragmentRecyclerViewBinding
import com.example.replikalivin.ui.HomebaseActivity
import com.example.replikalivin.utils.ListUser

class RecyclerViewFragment : Fragment() {
    private lateinit var binding: FragmentRecyclerViewBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?) : View? {
        super.onCreate(savedInstanceState)
        binding = FragmentRecyclerViewBinding.inflate(inflater, container, false)
        return binding.root
//        return FragmentRecyclerViewBinding.inflate(inflater, container, false).root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val homebaseActivity = activity as HomebaseActivity
        homebaseActivity.actionBar?.show()

        homebaseActivity.actionBar?.setDisplayHomeAsUpEnabled(true)
        homebaseActivity.actionBar?.setDisplayShowTitleEnabled(true)
        homebaseActivity.actionBar?.setTitle("List User")
        homebaseActivity.actionBar?.elevation = 0f

        binding.listRV.layoutManager = LinearLayoutManager(view.context)
        binding.listRV.adapter = RecycleViewAdapter(ListUser)
    }


}