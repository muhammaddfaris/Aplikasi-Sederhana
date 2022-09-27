package com.example.mymobil.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import coil.load
import coil.transform.RoundedCornersTransformation
import com.example.mymobil.data.Mobil
import com.example.mymobil.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_DETAIL = "extra_detail"
    }

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mobil = intent.getParcelableExtra<Mobil>(EXTRA_DETAIL)

        binding.tvName.text = mobil?.name
        binding.tvPrice.text = mobil?.price
        binding.tvColor.text = mobil?.color
        binding.tvOverview.text = mobil?.overview
        binding.imgPoster.load(mobil?.poster) {
            crossfade(true)
            crossfade(1000)
            transformations(RoundedCornersTransformation(10f))
        }

        binding.icBack.setOnClickListener { finish() }
    }
}