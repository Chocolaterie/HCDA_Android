package com.example.enidemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.enidemo.databinding.ActivityMainBinding
import java.util.*
import kotlin.concurrent.schedule

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        Timer().schedule(1000){
            //do something
            onClick();
        }

    }

    fun onClick() {
        // get nav controller
        val navController = findNavController(R.id.navExample).navigate(R.id.action_blankFragment_to_twoFragment)
    }

}