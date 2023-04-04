package com.example.enidemo.counter

import android.view.View
import android.widget.EditText
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.enidemo.R

class CounterViewModel : ViewModel() {

    // le compteur est observable
    var counter = MutableLiveData<Int>()

    var dataList = MutableLiveData<ArrayList<Float>>()

    // Constructuer
    init {
        counter.value = 5

        dataList.value = arrayListOf(12.0f, 14.0f, 16.0f)
    }

    // Fonctionne pour modifier la valeur du compteur
    fun addCounter(){
        // Les deux fonctionnent
        // -- incrementer
        counter.value = (counter.value)?.plus(1)
        // -- set
        dataList.value?.add(6.0f)
        dataList.value = dataList.value
        // counter.value = 20;
    }

    // Evenement clique
    fun onClickAddCounter(view: View){
        addCounter();
    }
}