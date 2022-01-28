package com.example.replikalivin.temp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.replikalivin.databinding.ActivityUserDetailBinding

class UserDetail : AppCompatActivity() {
    private lateinit var binding: ActivityUserDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.detailAvatar.setImageResource(intent.getIntExtra("detailAvatar", 0))
        binding.nameDetail.text = intent.getStringExtra("nameDetail")
        binding.positionDetail.text = intent.getStringExtra("positionDetail")
        binding.departmentDetail.text = intent.getStringExtra("departmentDetail")
        binding.descriptionContent.text = intent.getStringExtra("descriptionContent")




    }
}