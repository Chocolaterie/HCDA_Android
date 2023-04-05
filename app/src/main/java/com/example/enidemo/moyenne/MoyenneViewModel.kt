package com.example.enidemo.moyenne

import android.app.Activity
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.enidemo.R

class MoyenneViewModel : ViewModel() {

    // Liste de note
    var notes = arrayListOf<Float>()
    var averageNote = MutableLiveData<Float>(0.0f);
    // lateinit var averageNote : MutableLiveData<Float>

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
        averageNote.value = notes.average().toFloat()

        // reset (optionnel)
        notes.clear()
    }
}