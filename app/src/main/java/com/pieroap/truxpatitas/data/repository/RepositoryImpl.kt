package com.pieroap.truxpatitas.data.repository

import android.util.Log
import com.pieroap.truxpatitas.data.network.PetsApiService
import com.pieroap.truxpatitas.domain.model.PetsModel
import com.pieroap.truxpatitas.domain.repository.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val apiService: PetsApiService
) : Repository {
    override suspend fun getPets() : PetsModel? {
        //call retrofit
        runCatching { apiService.getPets() }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("error", "ocurrio un error ${it.message}") }
        return null
    }
}