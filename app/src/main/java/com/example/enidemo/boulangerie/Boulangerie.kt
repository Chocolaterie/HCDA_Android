package com.example.enidemo.boulangerie

class Boulangerie {

    lateinit var nourritures : List<Nourriture>;

    fun getNourritureByName(nom : String) : Nourriture?{
        for (nourriture in nourritures){
            if (nourriture.nom == nom){
                return nourriture;
            }
        }
        return null;
    }
}