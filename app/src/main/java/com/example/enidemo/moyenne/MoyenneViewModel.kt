package com.example.enidemo.moyenne

import android.app.Activity
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModel
import com.example.enidemo.R

class MoyenneViewModel : ViewModel() {

    // Liste de note
    var notes = arrayListOf<Float>()
    var average = 0.0f;

    // Lorsque j'ajoute une note
    fun OnAddNote(view: View) {
        // récuperer le champ edit text
        // bonne version : (view.context as Activity)
        // je récupère l'activité du bouton
        val activity = view.context as Activity;

        // je récupère l'EditText R.id.edt_note de l'activity en question
        var edtNote = activity.findViewById<EditText>(R.id.edt_note)

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
        var tvAverageNote = view.findViewById<TextView>(R.id.tv_averageNote)

        // modifier le text du TextView pour afficher la moyenne
        tvAverageNote.text = String.format("La moyenne est : %f", averageNote);

        // reset
        notes.clear()
    }
}