/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessmynumber_boudarel_ginzburg;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jeann
 */
public class GuessMyNumber_Boudarel_Ginzburg {

    /**
     * @param args the command line arguments
     */
    public static int main(String[] args) {
        // TODO code application logic here
    //1. declaration varaibles
Scanner sc;
sc= new Scanner(System.in);
int reponse; // decalaration qui prendra la chaine de charactere du mode choisi par l'utilisateur
int compteur=0; // declaration du compteur qui prendra le nombre de tentatives exécutées pour avoir utilisateur==nombreal
Random generateurAleat = new Random(); // initialisation de genrateur

//nombreal= generateurAleat.nextInt(100); 

System.out.println("Choix de la difficulté: 1 pour facile, 2 pour normal, 3 pour difficile?"); // affichage pour l'utilisateur afin de choisir le mode
reponse=sc.nextInt(); // prend la chaine de characteres entree par l'utilisateur

int ordinateur=generateurAleat.nextInt(100); // prend un nombre aleatoire qui restera le meme
System.out.print("Saisissez un nombre entre 0 et 100");
int utilisateur=sc.nextInt(); // premiere tentative pour le joueur de trouver le nombre


    
    switch(reponse){
        case 1: // niveau facile avec les aides deja faites dans la question 2 du tp
            while(utilisateur<101){ // boucle toujours vrai
                System.out.println("Saisissez un nombre entre 0 et 100");
                utilisateur=sc.nextInt();
                compteur=compteur+1;
                if (utilisateur<ordinateur){
                    System.out.print("trop petit");
                }
                if (utilisateur>ordinateur){
                    System.out.print("trop grand");
                }
                if(utilisateur==ordinateur){
                    System.out.print("gagné");
                    return 0; // quitte le programme
                }
            }
        case 2: 
            System.out.println("Vous avez 10 tentatives pour reussir a deviner le nombre de l'ordinateur");
            while(utilisateur<101){
                while (compteur<=10){
                System.out.println("Saisissez un nombre entre 0 et 100");
                utilisateur=sc.nextInt();
                compteur=compteur+1;
                if (utilisateur<ordinateur){
                    System.out.print("trop petit");
                }
                if (utilisateur>ordinateur){
                    System.out.print("trop grand");
                }
                if(utilisateur==ordinateur){
                    System.out.print("gagné");
                    return 0; // quitte le programme
                    }
                }
            System.out.println("Vous avez tenté 10 fois et vous avez echoué");
            return 0;
            }
        case 3: 
            System.out.println("Vous aurez des indications 1 fois sur 2 pour situer votre nombre par rapport à celui de l'oridnateur");
            while(utilisateur<101){
                while (compteur<=5){
                    System.out.println("Saisissez un nombre entre 0 et 100");
                    utilisateur=sc.nextInt();
                    compteur=compteur+1;
                    if (compteur%2==0){ // pour donner des indications 1 fois sur 2 à l'utilisateur
                        if (utilisateur<ordinateur){
                        System.out.print("trop petit");
                        }
                        if (utilisateur>ordinateur){
                            System.out.print("trop grand");
                        }
                        if(utilisateur==ordinateur){
                            System.out.print("gagné");
                            return 0; // quitte le programme
                        }
                    
                    }
            System.out.println("Vous avez perdu");
            return 0; // quitte le programme
                }
            }
            
    }
    }
}

        
    //for (int i=0;i<=5;i++){ partie 1 
//}

       





