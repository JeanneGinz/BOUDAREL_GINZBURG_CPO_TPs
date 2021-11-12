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

public String affecterCouleur (String couleur) { //CRéation de la méthode choissisant 
    
    Random random = new Random();
    int nb;
    nb = random.nextInt(2);

if (nb==0){
    couleur="rouge";  }
else   couleur="jaune"; 
        
return couleur;
   
}


    
    
}
