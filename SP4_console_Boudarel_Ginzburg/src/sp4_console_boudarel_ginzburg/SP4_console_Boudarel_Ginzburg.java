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
  

      /*nb=0; // réinitialisation pour determiner le joeur qui commence
      nb = random.nextInt(2);
      if (nb==0){
          String coul=2*/
     //2// A ENLEVER }
   
   Jeton j=new Jeton("rouge");
   System.out.print(j.lireCouleur());
   Cellule c=new Cellule();
   System.out.print(c.lireCouleurduJeton());
   c.affecterJeton(j);
   System.out.print(c.lireCouleurduJeton());
   grille a=new Grille();
   a.afficherGrilleSurConsole();
   a.ajouterJetondansColonne(j,5);
   a.afficherGrilleSurConsole();
    }
}
    

