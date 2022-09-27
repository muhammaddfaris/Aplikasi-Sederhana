package com.example.mymobil.profile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import coil.load
import coil.transform.CircleCropTransformation
import com.example.mymobil.R
import com.example.mymobil.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgPhoto.load(R.drawable.user) {
            crossfade(true)
            crossfade(2000)
            transformations(CircleCropTransformation())
        }

        binding.icBack.setOnClickListener { finish() }
    }
}