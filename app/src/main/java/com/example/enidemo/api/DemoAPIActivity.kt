package com.example.enidemo.api

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.example.enidemo.R
import kotlinx.coroutines.launch

class DemoAPIActivity : AppCompatActivity() {

    lateinit var progressDialog : ProgressDialog;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo_apiactivity)

        Func1()
    }

    fun Func1(){
        Func2()
    }

    fun Func2(){
      Func3()
    }

    fun test1(){
        val test = 0

        println("Test")
    }

    fun Func3(){
        // Affiche le chargement
        progressDialog = ProgressDialog(this@DemoAPIActivity)
        progressDialog.setTitle("Chargement")
        progressDialog.setMessage("Go to chuck noris service, please wait")
        progressDialog.show()

        test1();

        // Appel API
        lifecycleScope.launch {
            // appel du service https://api.chucknorris.io/jokes/random
            val joke = ChuckApi.retrofitService.randomFact()
            println(String.format("La blague %s", joke.value))
            // Fermer le chargement
            progressDialog.hide()
        }

        println("Test")
    }
}