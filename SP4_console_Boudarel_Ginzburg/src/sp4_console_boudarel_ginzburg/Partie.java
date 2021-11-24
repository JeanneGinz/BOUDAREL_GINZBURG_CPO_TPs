/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_boudarel_ginzburg;

import java.util.Random;
import java.util.Scanner;
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
    @SuppressWarnings("empty-statement")
    public void initialiserPartie(){
        grilleJeu=new Grille();
        for(int v=0; v<22; v++){ // on crée 21 jetons pour le 1er joueur
            Jeton piece1=new Jeton("rouge"); // creation d'un jeton piece1 qui est rouge
            ListeJoueurs[0].ajouterJeton(piece1);
            Jeton piece2=new Jeton("jaune");//creation d'un jeton piece2 qui est jaune
            ListeJoueurs[1].ajouterJeton(piece2);
        }
        
      int nb=0; // initialisation pour determiner le joueur qui commence
       Random random = new Random(); // initialisation de notre fonctions random
      nb = random.nextInt(2);
      if (nb==0){ // si nb=0 alors le joueur rouge commence 
         String coul="rouge";
             if (coul==ListeJoueurs[0].Couleur){
             joueurCourant = ListeJoueurs[0];
         }
         else{ joueurCourant=ListeJoueurs[1];}
         
      }
       if (nb==1){ // si nb=0 alors le joueur jaune commence 
         String coul="jaune";
         if (coul==ListeJoueurs[0].Couleur){
             joueurCourant = ListeJoueurs[0];
         }
         else{ joueurCourant=ListeJoueurs[1];}
         
        }
      int i;
      //placement des trous noirs
      for (i=0;i<=3;i++) { //boucle placer les 5 trous noirs
      int trouNoirL = random.nextInt(6);//randomiser les coordonées en ligne
      int trouNoirC = random.nextInt(7);//randomiser les coordonées en colonne
      if (grilleJeu.CellulesJeu[trouNoirL][trouNoirC].presenceTrouNoir()==false){ // verifier qu'il n'y est pas déjà de trou noir
      grilleJeu.CellulesJeu[trouNoirL][trouNoirC].placerTrouNoir();  } // placer le trou noir
      else i--; // recommencer car il y a deja un trou noir
    }
      //placement des trous noir et désintégrateurs sur la même case
            for (i=0;i<=2;i++) { //boucle placer les 5 trous noirs
      int trouNoirL = random.nextInt(6);//randomiser les coordonées en ligne
      int trouNoirC = random.nextInt(7);//randomiser les coordonées en colonne
      if (grilleJeu.CellulesJeu[trouNoirL][trouNoirC].presenceTrouNoir()==false){ // verifier qu'il n'y est pas déjà de trou noir
      grilleJeu.CellulesJeu[trouNoirL][trouNoirC].placerTrouNoir();
       grilleJeu.CellulesJeu[trouNoirL][trouNoirC].placerDesintegrateur() ;
               } // placer le trou noir
      else i--; // recommencer car il y a deja un trou noir
    }
      
     //placement des 3 désintégrateurs 
     for (i=0;i<=3;i++) { //boucle placer les 5 trous noirs
      int DesinL = random.nextInt(6);//randomiser les coordonées en ligne
      int DesinC = random.nextInt(7);//randomiser les coordonées en colonne
      if (grilleJeu.CellulesJeu[DesinL][DesinC].presenceTrouNoir()==false){ // verifier qu'il n'y est pas déjà de trou noir
      grilleJeu.CellulesJeu[DesinC][DesinC].placerDesintegrateur();  } // placer le désinteagrateur
      else i--; // recommencer car il y a deja un trou noir
    }
     
     //placement des 3 désintégrateurs hor trou noir
    
    public void attribuerCouleursAuxJoueurs(){
  
    String couleur;
  
  Random random = new Random(); // initialisation de notre fonctions random
    int nb; //initialisation d'un nombre pour y affecter la randomisation
    nb = random.nextInt(2); //Génére un chiffre entre 0 et 1
if (nb==0){ //si le chiffre est 0, le joueur sera rouge
      couleur = "rouge";
      ListeJoueurs[0].affecterCouleur(couleur); //joueur 1 devient rouge
      ListeJoueurs[1].affecterCouleur("jaune"); //joueur 2 devient jaune
 }
else  { couleur="jaune";  //si le chiffre est 1, le joueur sera jaune*/
      ListeJoueurs[0].affecterCouleur(couleur);  //joueur 1 devient jaune
     ListeJoueurs[1].affecterCouleur("rouge"); }//joueur 2 devient rouge
    }


    
public void debuterPartie(){

    
    grilleJeu.viderGrille(); // on vérifie ue la grille soit bien vide pour ne pas créer de pbs
    initialiserPartie(); // préparation de la grille de jeu
    
    System.out.println("Bienvenue sur le Super Puissance 4"); 
  
 Scanner sc; //initialisation du scanner
 sc=new Scanner (System.in);
 String nom1, nom2;
 
 //Créations des joueurs et de leurs noms
   System.out.println("Comment s'appelle le premier joueur ?"); //demande des pseusos
   nom1 = sc.nextLine(); //Enregistrement dans la mémoire des pseudos
  
   Joueur joueur1; //Création de l'objet étant le premier joueur
   joueur1=new Joueur(nom1); //affectation de son nom dans la classe
  
   System.out.println("Comment s'appelle le deuxième joueur ?");//Création de l'objet étant le deuxième joueur
   nom2 = sc.nextLine();
      
   Joueur joueur2;//Création de l'objet étant le premier joueur
   joueur2=new Joueur(nom2);//affectation de son nom dans la classe
   
    initialiserPartie(); // préparation de la grille de jeu
    attribuerCouleursAuxJoueurs();
   //boucle verifie while 
   while(){
       
     for (int i=0; i<42; i++){ // boucle pour poser remplir les 42 cellules de grille donc finir une partie dans le plus long cas
           
   }

}
}