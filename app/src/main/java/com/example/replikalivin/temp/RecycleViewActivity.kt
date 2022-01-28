package com.example.replikalivin.temp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.replikalivin.utils.ListUser
import com.example.replikalivin.adapter.RecycleViewAdapter
import com.example.replikalivin.databinding.ActivityRecycleViewBinding

class RecycleViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecycleViewBinding
//    private lateinit var listUser: RecyclerView
//    private val listName : ArrayList<String> = arrayListOf("Swandy", "Putri", "Rafi", "Togan")
//    private val listPhoto : ArrayList<Int> = arrayListOf(R.drawable.male, R.drawable.female, R.drawable.male, R.drawable.male)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecycleViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

//        listUser = findViewById(R.id.listRV)
        binding.listRV.layoutManager = LinearLayoutManager(this)
        binding.listRV.adapter = RecycleViewAdapter(ListUser)


    }

}