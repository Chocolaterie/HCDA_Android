package com.example.enidemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    fun calculAverage(note1 : Float, note2 : Float, note3 : Float) : Float {
       return (note1 + note2 + note3) / 3.0f;
    }

    fun correctionWithoutTableau(){
        // Mettre notes en dur
        // Notes math
        var noteMath1 = 12.0f
        var noteMath2 = 8.0f
        var noteMath3 = 0.2f

        // Notes français
        var noteFrancais1 = 12.0f
        var noteFrancais2 = 8.0f
        var noteFrancais3 = 0.2f

        // Notes sports
        var noteSport1 = 12.0f
        var noteSport2 = 8.0f
        var noteSport3 = 0.2f


        // Calculer la moyenne de chaques matières
        val averageMath = calculAverage(noteMath1, noteMath2, noteMath3);
        val averageFrancais = calculAverage(noteFrancais1, noteFrancais2, noteFrancais3);
        val averageSport = calculAverage(noteSport1, noteSport2, noteSport3);

        // Calculer moyenne general (deux manières)
        val averageGeneral = (averageMath + averageFrancais + averageSport) / 3
        val averageGeneralVersion2 = calculAverage(averageMath, averageFrancais, averageSport);

        // Affiche la moyenne generale avec println
        println(String.format("EniDemoTp : Moyenne Generale %f", averageGeneral))
    }

    fun calculAverageTableau(notes : Array<Float>) : Float {
        // Additionner toute les notes
        var sum = 0.0f
        for (note in notes){
            sum += note;
        }
        //
        val noteList = listOf(10.0f,10F)
        for (i in (0..notes.size)){
            noteList.get(i)

        }
        // Diviser la somme des notes par le nombre de notes
        return sum / notes.size;
    }

    fun correctionWithTableau(){
        // Mettre notes en dur
        // Notes math
        var mathGrades : Array<Float> = arrayOf(12.0f, 8.0f, 0.2f) // Array<Float>

        // Notes français
        var francaisGrades : Array<Float> = arrayOf(12.0f, 8.0f, 0.2f) // Array<Float>

        // Notes sports
        var sportGrades : Array<Float> = arrayOf(12.0f, 8.0f, 0.2f) // Array<Float>

        // Calculer la moyenne de chaques matières
        // Un autre manière de faire est d'appeler une méthode déjà existante sur kotlin "average" dans un Array
        // example :
        /*
        val averageMath = mathGrades.average()
        val averageFrancais = francaisGrades.average()
        val averageSport = sportGrades.average()
        */
        val averageMath = calculAverageTableau(mathGrades);
        val averageFrancais = calculAverageTableau(francaisGrades);
        val averageSport = calculAverageTableau(sportGrades);

        // Calculer moyenne general (deux manières)
        val averageGeneral = (averageMath + averageFrancais + averageSport) / 3
        val averageGeneralVersion2 = calculAverage(averageMath, averageFrancais, averageSport);

        // Affiche la moyenne generale avec println
        println(String.format("EniDemoTp : Moyenne Generale %f", averageGeneral))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // La version sans tableau
        // correctionWithoutTableau();
        // correctionWithTableau();
        var personA = Person("Isaac")
        var personB = Person("Lucas")

        // personA += personB

        personA++; // personA.inc()

        var str1 = "Isaac"
        var str2 = "Lucas"

        var str3 = str1 + str2

        if (personA == personB){

        }


        personA += personB; // personA.plusAssign(personB)
        personA -= personB;
    }
}