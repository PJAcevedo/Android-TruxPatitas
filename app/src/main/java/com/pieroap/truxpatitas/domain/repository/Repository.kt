package com.pieroap.truxpatitas.domain.repository

import com.pieroap.truxpatitas.domain.model.PetsModel

interface Repository {
    suspend fun getPets() : PetsModel?
}