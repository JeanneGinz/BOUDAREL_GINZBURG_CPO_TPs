/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_boudarel_ginzburg;

/**
 *
 * @author luluxontheflux
 */
public class BouteilleBiere { //Création de la classe bouteille bière

    String nom, brasserie; //initialisation des données reliés à la classe
    double degreAlcool;
    boolean ouverte;

    void lireEtiquette() { //action pour afficher l'etiquette

        System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degres) \nBrasserie : " + brasserie); // affichage de l'etiquette
    }

    boolean Décapsuler() { //Void renvoit un string, on utilise boolean pour renvoyer une variable boolean 

        if (ouverte == false) { //Boucle pour savoir si la biére est ouverte ou non
            ouverte = true; //ouvrir la biére
            System.out.println("La biére est bien ouverte"); //Vérification que la biére est bien ouverte
            return true; 
        } else { //Si la biére est déjà ouverte
            System.out.println("Erreur : Biére déja ouverte"); //afficher que la biére est déja ouverte
            return false;
        }
    }

    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) { //initialisation des informations de la biére
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false; //la biére est fermé
    }
@Override
public String toString() {
   String chaine_a_retourner;
   chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";
if (ouverte == true ) chaine_a_retourner += "oui" ; else chaine_a_retourner += "non" ;
return chaine_a_retourner ;
}
}
