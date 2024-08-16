package com.pieroap.truxpatitas.ui.pets.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pieroap.truxpatitas.R
import com.pieroap.truxpatitas.domain.model.PetsInfo

class PetsAdapter(
    private var petsList: List<PetsInfo> = emptyList(),
    private val onItemSelected:(PetsInfo) -> Unit
) : RecyclerView.Adapter<PetsViewHolder>() {

    fun updateList(list: List<PetsInfo>) {
        petsList = list
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PetsViewHolder {
        return PetsViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_pets, parent, false))
    }

    override fun getItemCount(): Int = petsList.size

    override fun onBindViewHolder(holder: PetsViewHolder, position: Int) {
        holder.render(petsList[position], onItemSelected)
    }
}