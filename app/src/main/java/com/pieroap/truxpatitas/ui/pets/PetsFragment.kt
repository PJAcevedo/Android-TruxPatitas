package com.pieroap.truxpatitas.ui.pets

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.GridLayoutManager
import com.pieroap.truxpatitas.databinding.FragmentPetsBinding
import com.pieroap.truxpatitas.ui.pets.adapter.PetsAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class PetsFragment : Fragment() {

    private val petsViewModel by viewModels<PetsViewModel>()
    private var _binding: FragmentPetsBinding? = null
    private lateinit var petsAdapter: PetsAdapter
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUi()
    }

    private fun initUi() {
        initList()
        initUiState()
    }

    private fun initList() {
        petsAdapter = PetsAdapter(onItemSelected = {
            Toast.makeText(context, it.name, Toast.LENGTH_LONG).show()
        })
        binding.rvPets.apply {
            layoutManager = GridLayoutManager(context, 2)
            adapter = petsAdapter
        }
    }

    private fun initUiState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                petsViewModel.pets.collect {
                    petsAdapter.updateList(it)
                    Log.i("itemsPets", it.toString())
                }
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPetsBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}