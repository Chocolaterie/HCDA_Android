package com.example.enidemo.counter

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    // le compteur est observable
    var counter = MutableLiveData<Int>()

    // Constructuer
    init {
        counter.value = 5
    }

    // Fonctionne pour modifier la valeur du compteur
    fun addCounter(){
        // Les deux fonctionnent
        // -- incrementer
        counter.value = (counter.value)?.plus(1)
        // -- set
        // counter.value = 20;
    }

    // Evenement clique
    fun onClickAddCounter(view: View){
        addCounter();
    }
}