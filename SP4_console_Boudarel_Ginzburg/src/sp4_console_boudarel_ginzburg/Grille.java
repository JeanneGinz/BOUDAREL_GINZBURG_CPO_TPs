/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_boudarel_ginzburg;

/**
 *
 * @author luluxontheflux
 */
public class Grille {// Création de la classe grille

    Cellule[][] CellulesJeu = new Cellule[6][7]; // Création de l'objet de type de cellule

    public Grille() { //le constructeur de la classe
        for (int i = 0; i < 6; i++) { //boucle pour parcourir le tableau
            for (int j = 0; j < 7; j++) {
                CellulesJeu[i][j] = new Cellule(); //Création d'une cellule
            }
        }

    }

    public boolean ajouterJetonDansColonne(Jeton jet, int col) { //Création de la classe ajoutant les jetons
        int i = 0;
        while (CellulesJeu[i][col] != null) {//Parcourir la colonne pour placer le jeton au plus bas de la grille
            i++;
            if (i > 6) {// on a parcouru toute la colonne 
                return false; //la ligne est pleine
            }
        }
        return CellulesJeu[i][col].affecterJeton(jet);//renvois du jeton placé
    }

    public boolean etreRemplie() {
        for (int i = 0; i < 6; i++) {//boucle pour parcourir le tableau
            for (int j = 0; j < 7; j++) {
                if (CellulesJeu[i][j].jetonCourant == null) { //Si le tableau n'est pas totalement remplis
                    return false; //Renvoyer que la grille n 'est pas remplis
                }
            }
        }

        return true; //Le tableau est remplis
    }

    public void viderGrille() { //Verifier que la grille est vider 
        for (int i = 0; i < 6; i++) {//boucle pour parcourir le tableau
            for (int j = 0; j < 7; j++) {
                CellulesJeu[i][j].jetonCourant = null; //supprimer tout les jetons
            }
        }
    }
    
//BUG
    public void afficherGrilleSurConsole() { // classe pour afficher la grille
        for (int i = 0; i < 6; i++) {//boucle pour parcourir le tableau
            for (int j = 0; j < 7; j++) {
                if (CellulesJeu[i][j].jetonCourant == null) {
                    
                    affiche -
                            
                    lireCouleurDuJeton().jetonCourant == null;
                }
                else {
                   if (CellulesJeu[i][j].lireCouleurDuJeton() =="Rouge" ) affirce R
                           else  jaune     " ");
                }

            }
            System.out.println("");
        }
    }
    

    public boolean celluleOccupee(int i, int j) {
        if (CellulesJeu[i][j].jetonCourant != null) { //
            return false;
        }
        return true;
    }
    
    public String lireCouleurDuJeton (int i, int j){
        String couleur;
    couleur = CellulesJeu[i][j].jetonCourant.lireCouleur();
    return couleur;
    }
    
     public boolean etreGagnantePourJoueur(Joueur j){
         
       // a compléter
     return true;    
     }
    

         
}
