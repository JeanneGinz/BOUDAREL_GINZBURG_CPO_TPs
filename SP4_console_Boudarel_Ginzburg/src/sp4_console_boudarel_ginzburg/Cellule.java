/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_boudarel_ginzburg;

/**
 *
 * @author luluxontheflux
 */
public class Cellule {

    boolean trouNoir, desintegrateur;

    Jeton jetonCourant;

    public Cellule() {
        jetonCourant = null; // Le jeton présent ou non sur une case de la grille
    }

    public boolean affecterJeton(Jeton j) { // permet de placer un jeton sur une case
        //jetonCourant = j;   
        if (j != null) {
            return false; // la case posséde déjà un jeton
        } else {
            jetonCourant=j;
            return true;// la case est vide   
        }
    }

    public String lireCouleurDuJeton() {
        if (jetonCourant == null) {
            return "vide";
        } else {
            return jetonCourant.lireCouleur();
        }
    }
}
