package com.johnyalam.koindependency

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    fun networkCall(){
        println("Networking is calling")
    }
}