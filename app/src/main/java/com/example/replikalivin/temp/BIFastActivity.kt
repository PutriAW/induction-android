package com.example.replikalivin.temp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.replikalivin.databinding.ActivityBiFastBinding

class BIFastActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBiFastBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBiFastBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.buttonDaftar.setOnClickListener{ view ->
            val moveIntent = Intent(this@BIFastActivity, NewsRecycleViewActivity::class.java)
            moveIntent.putExtra("textToBeSend",  binding.textBI.text)
            startActivity(moveIntent)
        }


    }
}