package com.example.enidemo.moyenne

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.enidemo.R
import com.example.enidemo.databinding.ActivityMoyenneBinding

class MoyenneActivity : AppCompatActivity() {

    lateinit var moyenneViewModel : MoyenneViewModel;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Je récupère ma vue dans data binding
        val activityMoyenneBinding = DataBindingUtil.setContentView<ActivityMoyenneBinding>(this, R.layout.activity_moyenne)

        // Instancier view model moyenne
        moyenneViewModel = MoyenneViewModel()

        // Mettre à jour le view model dans la vue
        activityMoyenneBinding.moyenneViewModel = moyenneViewModel;

    }

}