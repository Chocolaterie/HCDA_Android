package com.example.enidemo.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.enidemo.Person
import com.example.enidemo.R
import com.example.enidemo.databinding.ActivityRecyclerViewBinding

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // je récupère et charge mon xml/vue en version databinding
        val arvb = DataBindingUtil.setContentView<ActivityRecyclerViewBinding>(this, R.layout.activity_recycler_view)

        // Instancier un adapter
        val adapter = ListPersonAdapter()

        // Liaison du recycler view avec mon adapteur
        arvb.rvPersons.adapter = adapter

        // Une liste de 3 personnes
        val listPerson = mutableListOf(Person("Arthur"), Person("Raphael"), Person("Carole"))

        // Envoyer ces 3 personne dans le recycler view
        adapter.submitList(listPerson)
    }
}