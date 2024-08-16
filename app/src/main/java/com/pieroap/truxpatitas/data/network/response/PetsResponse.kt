package com.pieroap.truxpatitas.data.network.response

import com.google.gson.annotations.SerializedName
import com.pieroap.truxpatitas.domain.model.PetsModel

data class PetsResponse(
    @SerializedName("image") val image: String,
    @SerializedName("name") val name: String
) {
    fun toDomain() = PetsModel(
        image = image,
        name = name
    )
}
