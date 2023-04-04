package com.example.enidemo.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.enidemo.R
import com.example.enidemo.databinding.ActivityCounterBinding
import com.example.enidemo.databinding.ActivityMainBinding

class CounterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set content view version data binding
        val activityCounterBinding = DataBindingUtil.setContentView<ActivityCounterBinding>(this, R.layout.activity_counter)

        // Instancier par défaut le view model
        activityCounterBinding.counterViewModel = CounterViewModel()

    }
}