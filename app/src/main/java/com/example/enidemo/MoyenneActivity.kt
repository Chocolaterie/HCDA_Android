package com.example.enidemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MoyenneActivity : AppCompatActivity() {
    // Liste de note
    var notes = arrayListOf<Float>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_moyenne)
    }

    // Lorsque j'ajoute une note
    fun OnAddNote(view: View) {
        // récuperer le champ edit text
        var edtNote = findViewById<EditText>(R.id.edt_note)
        // récupérer la valeur du champ en tant que float
        var note = edtNote.text.toString().toFloat()

        // ajouter la note dans la liste
        notes.add(note)

        // vider le champ
        edtNote.setText("")

        println(notes)
    }

    // Quand je clique sur le bouton terminer
    fun onClickEnd(view: View) {
        // je calcul la moyenne
        val averageNote = notes.average()

        // je recupère le TextView
        var tvAverageNote = findViewById<TextView>(R.id.tv_averageNote)

        // modifier le text du TextView pour afficher la moyenne
        tvAverageNote.text = String.format("La moyenne est : %f", averageNote);

        // reset
        notes.clear()
    }

}