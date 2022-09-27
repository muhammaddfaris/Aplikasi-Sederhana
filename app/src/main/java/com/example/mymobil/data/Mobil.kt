package com.example.mymobil.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Mobil(
    val name: String,
    val price: String,
    val color: String,
    val engine: String,
    val star: String,
    val overview: String,
    val poster: String
) : Parcelable
