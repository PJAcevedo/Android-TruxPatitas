package com.pieroap.truxpatitas.ui.pets.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.pieroap.truxpatitas.databinding.ItemPetsBinding
import com.pieroap.truxpatitas.domain.model.PetsInfo

class PetsViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemPetsBinding.bind(view)
    fun render(petsInfo: PetsInfo, onItemSelected: (PetsInfo) -> Unit) {
        binding.txtPetName.text = petsInfo.name
        binding.parent.setOnClickListener { onItemSelected(petsInfo) }
    }
}