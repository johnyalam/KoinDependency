package com.johnyalam.koindependency

class MainRepositoryImpl(
    private val networkApi: NetworkApi
): MainRepository {
    override fun networkCall() {
        networkApi.callApi()
    }
}