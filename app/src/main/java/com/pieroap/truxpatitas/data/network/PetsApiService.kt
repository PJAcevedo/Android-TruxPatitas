package com.pieroap.truxpatitas.data.network

import com.pieroap.truxpatitas.data.network.response.PetsResponse
import retrofit2.http.GET

interface PetsApiService {

    @GET
    suspend fun getPets() : PetsResponse
}