package com.pieroap.truxpatitas.domain.model

sealed class PetsInfo(val image: String, val name: String) {
    data object Cooker: PetsInfo("image", "Sabrina")
    data object Snauzer: PetsInfo("image", "Snauzer")
}