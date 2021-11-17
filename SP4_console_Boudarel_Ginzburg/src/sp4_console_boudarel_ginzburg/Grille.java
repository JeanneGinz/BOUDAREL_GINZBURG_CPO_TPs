/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_boudarel_ginzburg;

/**
 *
 * @author luluxontheflux
 */
public class Grille {

    Cellule[][] CellulesJeu = new Cellule[6][7]; // Création de l'objet de type de cellule

    public Grille() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                CellulesJeu[i][j] = new Cellule();
            }
        }

    }

    public boolean ajouterJetonDansColonne(Jeton jet, int col) {
        int i = 0;
        while (CellulesJeu[i][col] != null) {
            i++;
            if (i > 6) {
                return false; // on a parcouru toute la colonne 
            }
        }
        return CellulesJeu[i][col].affecterJeton(jet);
    }

    public boolean etreRemplie() {
        for (int i = 0; i < 6;i++){
            for (int j = 0; j < 7; j++ ){
                    if ( jetonCourant.CellulesJeu[i][j] != null) {
                    return true;
                    }
                    else return false;                
            }

        }
    }

    public void viderGrille(){
         for (int i = 0; i < 6;i++){
            for (int j = 0; j < 7; j++ ){
                CellulesJeu[i][j]=null;
            }
        }
    }

 public void afficherGrilleSurConsole () {
    for (int i = 0; i < 6;i++){
            for (int j = 0; j < 7; j++ ){
               System.out.print(CellulesJeu[i][j]+" ");
}              System.out.println("");
}
}
 }
