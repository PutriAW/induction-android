package com.example.replikalivin.ui

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.example.replikalivin.R
import com.example.replikalivin.databinding.ActivityNextBinding

class NextActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNextBinding

//    internal lateinit var receivedText : TextView

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
        //supportActionBar?.setBackgroundDrawable(ColorDrawable(getColor(R.color.white)))
//        actionBar?.setBackgroundDrawable(ColorDrawable(getColor(R.color.black)))

        // Deklarasi langsung ke xml
//        receivedText = findViewById(R.id.nextActivityTextView)
        var text = intent.getStringExtra("textToBeSend")
        binding.nextActivityTextView.text = text

        // Fragment menggunakan logic dan container frame layout
        supportFragmentManager.beginTransaction().add(R.id.exampleFragment2, NewFragment()).commit()

//        val SELECT_PICTURE = 1
//
//        val galleryIntent = Intent(Intent.ACTION_PICK)
//        galleryIntent.setType("image/*")
//        startActivityForResult(Intent.createChooser(galleryIntent, "Select Picture"), SELECT_PICTURE)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }


}