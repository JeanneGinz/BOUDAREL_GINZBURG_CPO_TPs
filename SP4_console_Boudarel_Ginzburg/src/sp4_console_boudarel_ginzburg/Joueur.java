/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_boudarel_ginzburg;

import java.util.Random;

/**
 *
 * @author luluxontheflux
 */
public class Joueur { //Données liées au joueur 
    
String Nom,Couleur; //initialisation des valeurs
int nombreDesintegrateurs, nombreJetonsRestants;//initialisation des valeurs

Jeton[] ListeJetons= new Jeton[21]; // Permet au joueur d'avoir des jetons 


public Joueur(String n){   
    Nom=n;
    
}


public void affecterCouleur (String c) { //Création de la méthode affectant les couleurs de pions aux joueurs 
Couleur=c;   
}


   
}

//public boolean ajouterJeton(Jeton listeJeton) {
    
    
  //return false;  
//}




    
    
}
