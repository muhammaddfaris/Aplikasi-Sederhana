package com.example.mymobil.data

import android.net.Uri

object DataMobil {
    fun getDataMobil(): List<Mobil> {
        val listMobil = mutableListOf<Mobil>()

        listMobil.add(
            Mobil(
                "Toyota Fortuner",
                "Rp 584.000.000",
                "Silver",
                "2393 cc - 148 hp",
                "4.8",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                        "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                        "when an unknown printer took a galley of type and scrambled it to make a type " +
                        "specimen book. It has survived not only five centuries, but also the leap into " +
                        "electronic typesetting, remaining essentially unchanged.",
                "${Uri.parse("android.resource://com.example.mymobil/drawable/fortuner")}"
            )
        )

        listMobil.add(
            Mobil(
                "Toyota Avanza",
                "Rp 233.000.000 - Rp 295.000.000",
                "Abu-Abu",
                "1496 cc - 103 hp",
                "4.9",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                        "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                        "when an unknown printer took a galley of type and scrambled it to make a type " +
                        "specimen book. It has survived not only five centuries, but also the leap into " +
                        "electronic typesetting, remaining essentially unchanged.",
                "${Uri.parse("android.resource://com.example.mymobil/drawable/avanza")}"
            )
        )

        listMobil.add(
            Mobil(
                "Mitsubishi Xpander",
                "Rp 253.400.000 - Rp 307.100.000",
                "Silver",
                "1499 cc - 104 hp",
                "4.8",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                        "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                        "when an unknown printer took a galley of type and scrambled it to make a type " +
                        "specimen book. It has survived not only five centuries, but also the leap into " +
                        "electronic typesetting, remaining essentially unchanged.",
                "${Uri.parse("android.resource://com.example.mymobil/drawable/xpander")}"
            )
        )

        listMobil.add(
            Mobil(
                "Toyota Alphard Transformer",
                "Rp 1.103.000.000 - Rp 1.653.400.000",
                "Putih",
                "2494 cc - 178 hp",
                "5.0",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                        "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                        "when an unknown printer took a galley of type and scrambled it to make a type " +
                        "specimen book. It has survived not only five centuries, but also the leap into " +
                        "electronic typesetting, remaining essentially unchanged.",
                "${Uri.parse("android.resource://com.example.mymobil/drawable/alpard")}"
            )
        )

        listMobil.add(
            Mobil(
                "Toyota Yaris",
                "Rp 295.800.000 - Rp 395.800.000",
                "Hijau Kuning",
                "1496 cc - 106 hp",
                "5.0",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                        "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                        "when an unknown printer took a galley of type and scrambled it to make a type " +
                        "specimen book. It has survived not only five centuries, but also the leap into " +
                        "electronic typesetting, remaining essentially unchanged.",
                "${Uri.parse("android.resource://com.example.mymobil/drawable/yaris")}"
            )
        )

        listMobil.add(
            Mobil(
                "Toyota Innova",
                "Rp 369.600.000 - Rp 411.000.000",
                "Putih",
                "1998 cc - 137 hp",
                "4.5",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                        "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                        "when an unknown printer took a galley of type and scrambled it to make a type " +
                        "specimen book. It has survived not only five centuries, but also the leap into " +
                        "electronic typesetting, remaining essentially unchanged.",
                "${Uri.parse("android.resource://com.example.mymobil/drawable/innova")}"
            )
        )

        listMobil.add(
            Mobil(
                "Mitsubishi Pajero Sport",
                "Rp 529.600.000 - Rp 712.500.000",
                "Silver",
                "2477 cc - 134 hp",
                "4.7",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                        "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                        "when an unknown printer took a galley of type and scrambled it to make a type " +
                        "specimen book. It has survived not only five centuries, but also the leap into " +
                        "electronic typesetting, remaining essentially unchanged.",
                "${Uri.parse("android.resource://com.example.mymobil/drawable/pajero")}"
            )
        )

        listMobil.add(
            Mobil(
                "Toyota Agya",
                "Rp 158.500.000 - Rp 179.700.000",
                "Kuning",
                "1197 cc - 87 hp",
                "4.9",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                        "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                        "when an unknown printer took a galley of type and scrambled it to make a type " +
                        "specimen book. It has survived not only five centuries, but also the leap into " +
                        "electronic typesetting, remaining essentially unchanged.",
                "${Uri.parse("android.resource://com.example.mymobil/drawable/agya")}"
            )
        )

        listMobil.add(
            Mobil(
                "Daihatsu Terios",
                "Rp 232.300.000 - Rp 287.400.000",
                "Putih",
                "1496 cc - 103 hp",
                "4.9",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                        "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                        "when an unknown printer took a galley of type and scrambled it to make a type " +
                        "specimen book. It has survived not only five centuries, but also the leap into " +
                        "electronic typesetting, remaining essentially unchanged.",
                "${Uri.parse("android.resource://com.example.mymobil/drawable/terios")}"
            )
        )

        listMobil.add(
            Mobil(
                "Honda CR-V",
                "Rp 515.900.000 - Rp 668.900.000",
                "Putih",
                "1498 cc - 119 hp",
                "5.0",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                        "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                        "when an unknown printer took a galley of type and scrambled it to make a type " +
                        "specimen book. It has survived not only five centuries, but also the leap into " +
                        "electronic typesetting, remaining essentially unchanged.",
                "${Uri.parse("android.resource://com.example.mymobil/drawable/crv")}"
            )
        )

        return listMobil
    }
}