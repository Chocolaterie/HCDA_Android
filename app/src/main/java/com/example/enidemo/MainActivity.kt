package com.example.enidemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.enidemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding //Le nom du XML en PascalCase avec suffix Binding:

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        activityMainBinding.tvTest.text = "Coucou ! Tu veux voir ma Bière ?"

        // lier la personne Isaac dans la vue
        activityMainBinding.myPerson = Person("Isaac")
    }

}