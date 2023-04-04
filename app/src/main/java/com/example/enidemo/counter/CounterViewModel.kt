package com.example.enidemo.counter

import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    var counter = 5

    fun addCounter(){
        counter++;
    }
}