package com.example.replikalivin.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.replikalivin.databinding.ActivityMainBinding

class MainActivityBIFast : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.buttonDaftar.setOnClickListener{ view ->
            val moveIntent = Intent(this@MainActivityBIFast, NewsRecycleViewActivity::class.java)
            moveIntent.putExtra("textToBeSend",  binding.textBI.text)
            startActivity(moveIntent)
        }


    }
}