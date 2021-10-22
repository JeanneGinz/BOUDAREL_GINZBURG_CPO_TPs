
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author luluxontheflux
 */
public class ManipNombreInt_GINZBURG_BOUDAREL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //initialisation des valeurs
    int var1,var2; //déclaration des deux variables
    int s,d,p,q,r;// initialisation de la somme, de la différence, du produit,du quotient et du reste
    Scanner sc; 
      sc=new Scanner (System.in); //initalisation de l'objet scanner
        
        // Programme partie 1
    System.out.println("Choisissez un entiers"); // demander à l'utilisateur le premier entier
    var1 = sc.nextInt(); //sotckage de l'entier
    System.out.println("Choisissez un entiers"); // demander à l'utilisateur le deuxième entier
    var2 = sc.nextInt(); //sotckage de l'entier
    System.out.println("Vos entiers sont "+var1+" et "+var2); //affichage des valeurs
    s= var1 + var2;
    d= var1-var2;
    p= var1*var2;
    System.out.println("la somme est "+s+" \nla différence est "+d+" \nle produit est "+p); 
    q = var1/var2;
    r = var1%var2;
   System.out.println("le quotient est "+q+"\nle reste est"+r);
    }
    
}
