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

public String affecterCouleur (String couleur) { //Création de la méthode affectant les couleurs de pions aux joueurs 
//public void affecterCouleur (String couleur) { 

    Random random = new Random(); // initialisation de notre fonctions random
    int nb; //initialisation d'un nombre pour y affecter la randomisation
    nb = random.nextInt(2); //Génére un chiffre entre 0 et 1

if (nb==0){ //si le chiffre est 0, le joueur sera rouge
    couleur="rouge";  }
else   couleur="jaune";  //si le chiffre est 1, le joueur sera jaune

return couleur;
   
}

public boolean ajouterJeton(Jeton listeJeton) {
    
    
    
}




    
    
}
