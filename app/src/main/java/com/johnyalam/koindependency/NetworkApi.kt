package com.johnyalam.koindependency

import retrofit2.http.GET

interface NetworkApi {
    @GET("api/method_name")
    fun callApi()
}