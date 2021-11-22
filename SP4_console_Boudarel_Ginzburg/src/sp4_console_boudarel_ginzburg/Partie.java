/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_boudarel_ginzburg;

import java.util.Random;

/**
 *
 * @author jeann
 */
public class Partie {
    Joueur[] ListeJoueurs = new Joueur[2];
    Joueur joueurCourant;
    Grille grilleJeu;
    
    public Partie(Joueur joueur1, Joueur joueur2){
     ListeJoueurs[0] = joueur1; // declaration des 2 joueurs
    ListeJoueurs[1] = joueur2;

}
    public void initialiserPartie(){
        grilleJeu=new Grille();
        for(int v=0; v<22; v++){ // on crée 21 jetons pour le 1er joueur
            Jeton piece1=new Jeton("rouge"); // creation d'un jeton piece1 qui est rouge
            ListeJoueurs[0].ajouterJeton(piece1);
            Jeton piece2=new Jeton("jaune");//creation d'un jeton piece2 qui est jaune
            ListeJoueurs[1].ajouterJeton(piece2);
        }
        
      int nb=0; // initialisation pour determiner le joueur qui commence
      nb = random.nextInt(2);
      if (nb==0){ // si nb=0 alors le joueur jaune commence 
          String coul=2
        }
      
    }
    
    public void attribuerCouleursAuxJoueurs(){
  
    String couleur;
  
  Random random = new Random(); // initialisation de notre fonctions random
    int nb; //initialisation d'un nombre pour y affecter la randomisation
    nb = random.nextInt(2); //Génére un chiffre entre 0 et 1
if (nb==0){ //si le chiffre est 0, le joueur sera rouge
      couleur = "rouge";
      ListeJoueurs[0].affecterCouleur(couleur); //joueur 1 devient rouge
      joueur2.affecterCouleur("jaune"); //joueur 2 devient jaune
 }
else  { couleur="jaune";  //si le chiffre est 1, le joueur sera jaune*/
      joueur1.affecterCouleur(couleur);  //joueur 1 devient jaune
     joueur2.affecterCouleur("rouge"); }//joueur 2 devient rouge
    }


    
public void debuterPartie(){

}
}