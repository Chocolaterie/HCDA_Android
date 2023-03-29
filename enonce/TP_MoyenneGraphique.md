# Partie 1

Afficher la moyenne génèrale dans un **TextView**

Procédez de la manière suivante:
- Ajouter le **TextView** dans la vue
- Faut récupérer le **TextView**
- Changer le texte de ce dernier lorsqu'on afficher la moyenne générale

# Partie 2

On travail avec une seule matière (on a uniquement une liste de note)

- Ajouter un champ pour saisir les notes (**EditText**) 

- A chaque fois qu'on saisie une note, cette note est ajoutée dans un tableau/liste de note

- Un **Button** "Terminer", au clique de ce bouton calculer la moyenne et l'afficher

### Algorithme
------
- On a une liste/tableau de note déclarée en tant que membre/variable de la classe **MainActivity**
- Lorsqu'on clique sur le bouton "**Ajouter la note**", on ajoute la note saisie (**EditText**) dans notre liste/tableau de note
    - Ajouter la note dans le tableau
    - Effacer/Vider le texte dans le **EditText** (texte vide). Utiliser la fonction **monEditText.setText("")** ou **monEditText.text.clear()** pour vider
---
- Lorsqu'on clique sur le bouton **Terminer**, on affiche la moyenne de ces notes (la liste/tableau de note)
    - **NOTE**: Le **TextView** est déjà sur la page mais vide par défaut (la propriété **text** est vide/="")

- *Information* : La fonction **average()** d'une liste existe déjà sur **kotlin**

# Partie 3

Réussir à gérer les matières avec l'interface graphique