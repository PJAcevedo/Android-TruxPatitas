package com.pieroap.truxpatitas.domain.usecase

import com.pieroap.truxpatitas.domain.repository.Repository
import javax.inject.Inject

class GetPetsUseCase @Inject constructor(
    private val repository: Repository
) {

    suspend operator fun invoke() = repository.getPets()

}