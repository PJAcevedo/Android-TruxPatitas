package com.pieroap.truxpatitas.ui.pets

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pieroap.truxpatitas.domain.model.PetsInfo
import com.pieroap.truxpatitas.domain.model.PetsInfo.*
import com.pieroap.truxpatitas.domain.usecase.GetPetsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class PetsViewModel @Inject constructor(
    private val petsUseCase: GetPetsUseCase
) : ViewModel() {

    private var _pets = MutableStateFlow<List<PetsInfo>>(emptyList())
    val pets: StateFlow<List<PetsInfo>> = _pets

    fun getPets() {
        /*viewModelScope.launch {
            withContext(Dispatchers.IO) { petsUseCase.invoke() }
        }*/
        _pets.value = listOf(Cooker, Snauzer)
    }

}