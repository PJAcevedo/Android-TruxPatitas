package com.pieroap.truxpatitas.data.network

import com.pieroap.truxpatitas.data.repository.RepositoryImpl
import com.pieroap.truxpatitas.domain.repository.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideRetrofit() : Retrofit {
        return Retrofit
            .Builder()
            .baseUrl("https://localhost:8080/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    fun providePetsApiService(retrofit: Retrofit) : PetsApiService {
        return retrofit.create(PetsApiService::class.java)
    }

    @Provides
    fun provideRepository(apiService: PetsApiService) : Repository {
        return RepositoryImpl(apiService)
    }

}