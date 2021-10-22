/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_ginzburg_boudarel;

import java.util.Random;
import java.util.Scanner;

/**
 *6
 * @author luluxontheflux
 */
public class TP1_stats_GINZBURG_BOUDAREL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initialisation 
        double [] tab;// déclaration du tableau
        int m,j,i,n; //déclaration des variables pour les boucles 
        Scanner sc;
        sc = new Scanner (System.in); //déclaration du scanner

      //      
        tab = new double [6]; //création d’un tableau de 6 entiers
        for(j=0 ; j<6; j++){ //boucle permettant de parcourir le tableau
            tab[j]=0; //initialisation du tableau à 0
        }
        
      System.out.println("Choisissez un entier"); // demande d'un entier à l'utilisateur
        m = sc.nextInt(); //enregistrement dans la mémoire
        //System.out.println(m);
        
        for( i=1 ; i<=m; i++){ //boucle permettant de tirer aléatoirement un chiffre
        
            Random aleatoire = new Random(); //objet permettant la randomisation
            n= aleatoire.nextInt(6); 
            
            if (n==0) { //boucle pour incrémentez la case d’indice 1
            tab[0]=tab[0]+1;          
            }
            if (n==1) { //boucle pour incrémentez la case d’indice 2
            tab[1]=tab[1]+1;          
            }
            if (n==2) { //boucle pour incrémentez la case d’indice 3
            tab[2]=tab[2]+1;          
            }
            if (n==3) { //boucle pour incrémentez la case d’indice 4
            tab[3]=tab[3]+1;          
            }
            if (n==4) { //boucle pour incrémentez la case d’indice 5
            tab[4]=tab[4]+1;          
            }
            if (n==5) { //boucle pour incrémentez la case d’indice 6
            tab[5]=tab[5]+1;          
            }
            
            
            for (j=0; j<6; j++){ //boucle permettant d'affficher le tableau
                
                 System.out.println(tab[j]);
        }
            for (j=0; j<6; j++){ //boucle permettant d'affficher le tableau en pourcentage
                
                 System.out.println(((tab[j]*1.0)/m)*100+"%");
        } 
            
       }

    }
    
}
