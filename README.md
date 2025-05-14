Gestion des Tournois :

- Création de tournois avec différents formats :
  - Simple élimination
  - Double élimination
  - Round Robin (championnat)

 
- Configuration des tournois :
  - Jeu et mode de jeu 
  - Nombre de participants/équipes 
  - Format des matchs (BO1, BO3, BO5)
  - Prix et récompenses 
  - Dates d'inscription et de déroulement 

 
- Gestion du bracket (arbre du tournoi)

 
- Saisie et validation des résultats


- Mise à jour automatique du bracket


- Calcul et attribution des points ELO

TOURNOIS :
-
- ID
- Nom
- Date de début
- Date de fin

SimpleElimination :
-
- boolean hasThirdPlaceMatch

DoubleElimination :
- 
- boolean hasConsolationFinal

RoundRobin (CHAMPIONNAT) :
-
- boolean  matchRetour
