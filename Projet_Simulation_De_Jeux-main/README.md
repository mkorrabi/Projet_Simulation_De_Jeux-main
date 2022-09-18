# Projet_Simulation_De_Jeux

Deux équipes de joueurs de Volley sont créées au début de la simulation. Les joueurs peuvent être soit des attaquants ou des défenseurs. Ces deux équipes appartiennent à un manager qui a comme rôle la gestion des équipes. Il pourra ajouter ou supprimer des joueurs, remplacer un joueur, afficher des statistiques sur l’une des équipes, recruter un entraîneur etc..
Après avoir créé les équipes, le manager pourra simuler un match. Pour cela, la classe Match est utilisée. A l’instanciation de la classe Match, une fenêtre est ouverte pour représenter les joueurs de chaque équipe. Au début du jeu, la méthode lancerBal est utilisée pour créer la balle et commencer le jeu. En utilisant un random, la balle est placée aléatoirement à un joueur en position 1 pour faire le service. Après avoir lancé la balle, le reste du jeu se déroule en utilisant la méthode jouer dans la classe Match. Cette méthode va récupérer les coordonnées de la balle dans un premier temps qui seront eux mêmes les coordonnées du joueur qui va jouer la balle en utilisant la méthode jouer dans la classe Joueur. Cette méthode vérifie si la probabilité du joueur est satisfaite. Si elle l’est, le joueur joue la balle, sinon, l'équipe adversaire gagne un point. L'équipe qui vient de perdre un point fera la rotation en utilisant la méthode rotation qui est appelée au sein de la méthode jouer. Dans la rotation, les joueurs vont se déplacer ‘clockwise’. Après chaque rotation, la grille sera mise à jour dans la même fenêtre qui a été ouverte à l'instantiation de la classe Match. 
A la fin du match, la méthode finirMatch est appelée pour terminer le match si les scores des deux équipes ne sont pas égaux. Pour vérifier cette égalité, la méthode draw dans la classe statique ScoreBoard sera appelée. Si les scores sont égaux, la méthode jouer sera appelée une dernière fois.


Description des classes: 
Interface Personne: Une interface contenant les entêtes des méthodes définies dans les classes Joueur et Entraîneur qui implémentent ces interfaces. 

Classe Entraîneur: Classe implémentant l’interface personne 

Classe Joueur: classe qui  implémente l’interface personne, ayant une méthode abstraite ‘jouer’. Elle crée des joueurs, leurs attribue des Id, gére leurs win, defeat et énergie.  

Classe Attaquant: Classe qui étend la classe abstraite Jouer. ayant un attribut Pjouer  (probabilité forte de jouer la balle) qui est utilisé pour définir la méthode Jouer

Classe Défenseur: Classe qui étend la classe abstraite Jouer. ayant un attribut Pjouer  (probabilité faible  de jouer la balle) qui est utilisé pour définir la méthode Jouer

Classe Ballon: Classe Singleton pour placer placer la balle sur la grille et gérer ses déplacements 

Classe Équipe: Classe contenant une tableau de 6 joueurs. Elle gère l’ajout et la suppression des joueurs, les win et defeats de l'équipe et  le salaire obtenu par l'équipe

Classe ScoreBoard: Classe statique qui gère l’affichage de la scoreboard. Elle contient des méthodes pour gérer l’ajout des points, draw, reste, plus de points etc..

Classe Match: Classe contenant la grille ou les joueurs sont positionnés. Elle gère la création des 2 équipes, le lancement de la balle, la rotation, et la fin du match 

Classe SbFrame: Une classe qui gère l’ouverture d’une fenêtre pour représenter la gestion des points de chaque équipe.

Classe Manager: Classe dans laquelle le manager pourra gérer ces équipes. C’est aussi la classe main 
