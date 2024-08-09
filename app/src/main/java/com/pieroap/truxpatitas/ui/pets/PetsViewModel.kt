package com.pieroap.truxpatitas.ui.pets

import androidx.lifecycle.ViewModel
import com.pieroap.truxpatitas.domain.model.PetsInfo
import com.pieroap.truxpatitas.domain.model.PetsInfo.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class PetsViewModel @Inject constructor(

) : ViewModel() {

    private var _pets = MutableStateFlow<List<PetsInfo>>(emptyList())
    val pets: StateFlow<List<PetsInfo>> = _pets

    init {
        _pets.value = listOf(Cooker, Snauzer)
    }

}