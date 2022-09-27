package com.example.mymobil.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.mymobil.data.Mobil
import com.example.mymobil.databinding.ItemMobilBinding
import com.example.mymobil.detail.DetailActivity
import java.util.*
import kotlin.collections.ArrayList

class MobilAdapter(listMobil: ArrayList<Mobil>) : RecyclerView.Adapter<MobilAdapter.ViewHolder>(), Filterable {

    private val searchList = ArrayList<Mobil>(listMobil)
    private val mainList = listMobil

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
                ItemMobilBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(mainList[position])
    }

    override fun getItemCount(): Int = mainList.size

    class ViewHolder(private val binding: ItemMobilBinding) :
            RecyclerView.ViewHolder(binding.root) {
        fun bind(mobil: Mobil) {
            binding.tvName.text = mobil.name
            binding.tvPrice.text = mobil.price
            binding.tvColor.text = mobil.color
            binding.tvEngine.text = mobil.engine
            binding.tvRating.text = mobil.star
            binding.imgPoster.load(mobil.poster) {
                crossfade(true)
                crossfade(1000)
            }

            itemView.setOnClickListener {
                val intent = Intent(itemView.context, DetailActivity::class.java).apply {
                    putExtra(DetailActivity.EXTRA_DETAIL, mobil)
                }
                it.context.startActivity(intent)
            }
        }
    }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence): FilterResults {
                val filteredList = ArrayList<Mobil>()
                if (constraint.isBlank() or constraint.isEmpty()) {
                    filteredList.addAll(searchList)
                } else {
                    val filterPattern = constraint.toString().toLowerCase(Locale.ROOT).trim()

                    searchList.forEach {
                        if (it.name.toLowerCase(Locale.ROOT).contains(filterPattern)) {
                            filteredList.add(it)
                        }
                    }
                }
                val result = FilterResults()
                result.values = filteredList

                return result
            }

            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                mainList.clear()
                mainList.addAll(results?.values as List<Mobil>)
                notifyDataSetChanged()
            }
        }
    }
}