package com.johnyalam.koindependency

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


val appModule = module {
    single {
        Retrofit.Builder()
            .baseUrl("https://google.com")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create(NetworkApi::class.java)
    }
    single<MainRepository>{
        MainRepositoryImpl(get())
    }
    viewModel {
        MainViewModel(get())
    }
}