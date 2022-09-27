package com.example.mymobil.home

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mymobil.adapter.MobilAdapter
import com.example.mymobil.data.DataMobil
import com.example.mymobil.data.Mobil
import com.example.mymobil.databinding.ActivityHomeBinding
import com.example.mymobil.profile.ProfileActivity

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mobilAdapter = MobilAdapter(DataMobil.getDataMobil() as ArrayList<Mobil>)

        with(binding.rvMoto) {
            layoutManager = LinearLayoutManager(this@HomeActivity)
            setHasFixedSize(true)
            adapter = mobilAdapter
            mobilAdapter.notifyDataSetChanged()
        }



        binding.icPerson.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}