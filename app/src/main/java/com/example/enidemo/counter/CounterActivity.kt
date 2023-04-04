package com.example.enidemo.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.example.enidemo.R
import com.example.enidemo.databinding.ActivityCounterBinding
import com.example.enidemo.databinding.ActivityMainBinding

class CounterActivity : AppCompatActivity() {

    // ViewModel c'est un membre de classe
    lateinit var counterViewModel: CounterViewModel;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set content view version data binding
        val activityCounterBinding = DataBindingUtil.setContentView<ActivityCounterBinding>(this, R.layout.activity_counter)

        // Instancier par défaut le view model
        counterViewModel = CounterViewModel()

        // Mettre à jour le view model dans la vue
        activityCounterBinding.counterViewModel = counterViewModel

        // Ecouter le changement du compteur
        counterViewModel.counter.observe(this, Observer {
            // Que faire lorsque je detecte un changement dans le compteur
            // Mettre à jour le view model dans la vue
            activityCounterBinding.counterViewModel = counterViewModel
        })
    }
}