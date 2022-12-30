package com.johnyalam.koindependency

import androidx.lifecycle.ViewModel

class MainViewModel(
    private val repository: MainRepository
) : ViewModel() {
    fun networkCall(){
        println("Networking is calling")
    }
}