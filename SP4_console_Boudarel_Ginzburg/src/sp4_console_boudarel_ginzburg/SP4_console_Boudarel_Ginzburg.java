/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sp4_console_boudarel_ginzburg;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jeann
 */
public class SP4_console_Boudarel_Ginzburg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
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
  
 //Affecatation des couleurs et ordre de jeu
  String couleur;
  
  Random random = new Random(); // initialisation de notre fonctions random
    int nb; //initialisation d'un nombre pour y affecter la randomisation
    nb = random.nextInt(2); //Génére un chiffre entre 0 et 1
if (nb==0){ //si le chiffre est 0, le joueur sera rouge
      couleur = "rouge";
      joueur1.affecterCouleur(couleur); //joueur 1 devient rouge
      joueur2.affecterCouleur("jaune"); //joueur 2 devient jaune
 }
else  { couleur="jaune";  //si le chiffre est 1, le joueur sera jaune*/
      joueur1.affecterCouleur(couleur);  //joueur 1 devient jaune
      joueur2.affecterCouleur("rouge"); }//joueur 2 devient rouge

      /*nb=0; // réinitialisation pour determiner le joeur qui commence
      nb = random.nextInt(2);
      if (nb==0){
          String coul=2*/
      }
   
    //TEST 
    Jeton j=new Jeton("rouge");
    String a J.recupere(couleur);
    System.out.print(a);
    Cellule c = new Cellule();
    c.affecterJeton(j);
    
    
    
    
    }
    

