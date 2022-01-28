package com.example.replikalivin.temp

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.example.replikalivin.R
import com.example.replikalivin.databinding.ActivityNextBinding

class NextActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNextBinding

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNextBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Action Bar
        val actionBar = supportActionBar

        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.elevation = 0f

        // Deklarasi langsung ke xml
        var text = intent.getStringExtra("textToBeSend")
        binding.nextActivityTextView.text = text

        // Fragment menggunakan logic dan container frame layout
        supportFragmentManager.beginTransaction().add(R.id.exampleFragment2, NewFragment()).commit()

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }


}