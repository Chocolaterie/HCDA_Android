# Énoncé 

## Pouvoir faire la moyennes de x notes (à votre guise)

Créer une première fonction qui permet de calculer la moyenne des notes saisies. Affichage attendu : 

- La formule pour calculer une moyenne
- Les notes sont saisies en dur (assignées en dur)

Entrez le nombre de valeurs :  

```kt
var notes1 = 15.0f;
var notes2 = 20.0f;
...
La moyenne est 14,5 
```

Dans votre code :

```kt
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    // Mettre notes en dur

    // Calculer la moyenne (des notes en dur)
    // ...

    // Affiche la moyenne avec println
}
```

### Partie 2
- Calculer la moyenne générale (additioner la moyenne de toute les matières)
- Sans tableau (exemple: math, français, histoire, sport, à votre guise)

```kt
println(String.format("La moyenne en math est : %f", mathMoyenne))

println(String.format("La moyenne en français est : %f", francaisMoyenne))

...
val moyenneGeneral = la formule pour avoir la moyenne generale
```

### Dernière partie (version tableau)
- version tableau/liste
- Quelques mot-clés:

listOf, List<Float>, arrayOf, Array<Float>
