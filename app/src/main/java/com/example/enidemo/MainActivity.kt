package com.example.enidemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.enidemo.databinding.ActivityMainBinding
import com.example.enidemo.fragment.BlankFragmentDirections
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        onClick();
    }

    fun onClick() {
        // Naviguer sans arguments
        //findNavController(R.id.navExample).navigate(R.id.action_blankFragment_to_twoFragment)

        // Naviguer avec arguments
        // Methode 1
        /*
        var action = BlankFragmentDirections.actionBlankFragmentToTwoFragment();
        action.arguments.putInt("code",10)
        action.arguments.putString("nom", "Test")
        */

        // Methode 2
        var action = BlankFragmentDirections.actionBlankFragmentToTwoFragment();
        action.nom = "Isaac"
        action.code = 20
        findNavController(R.id.navExample).navigate(action)

    }

}