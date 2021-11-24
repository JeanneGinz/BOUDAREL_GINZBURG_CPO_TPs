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
boolean trouNoir, desintegrateur;

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

    public void afficherGrilleSurConsole() { // classe pour afficher la grille
        for (int i = 0; i < 6; i++) {//boucle pour parcourir le tableau
            for (int j = 0; j < 7; j++) {
                if (CellulesJeu[i][j].jetonCourant == null) { // affichage si il n'y a aps de jeton
                    System.out.print(" ");
                } else {
                    if (CellulesJeu[i][j].lireCouleurDuJeton() == "rouge") // affichage si il y a un jeton rouge
                    {
                        System.out.print(" R ");
                    } else {
                        System.out.print(" J "); // affichage si il y a un jeton jaune
                    }
                }

            }
            System.out.println(""); //affichage pour donner la forme au tableau
        }
    }

    public boolean celluleOccupee(int i, int j) {
        if (CellulesJeu[i][j].jetonCourant != null) { 
            return false;
        }
        return true;
    }

    public String lireCouleurDuJeton(int i, int j) {
        String couleur;
        couleur = CellulesJeu[i][j].jetonCourant.lireCouleur();
        
        return couleur;
    }
    
  
 
   
   
    public boolean placerTrouNoir(int i, int j){
      
        if (CellulesJeu[i][j].presenceTrouNoir() ==false){ //verifiez que la case n'a pas déjà un trou noir
        CellulesJeu[i][j].placerTrouNoir(); // placement du trou noir
        return true; 
        }
        return false; //il y a deja un trou noir
      }
      
     
    
  public boolean placerDesintegrateur(int i, int j){
      
     if (CellulesJeu[i][j].presenceDesintegrateur() ==false){ //verifiez que la case n'a pas déjà un Desintegrateur
        CellulesJeu[i][j].placerDesintegrateur(); // placement du Desintegrateur
        return true; 
        }
        return false; //il y a deja un trou noir
      }
      
  public  boolean supprimerJeton(int i,int j){
      

      return CellulesJeu[i][j].supprimerJeton();
    
  }
  

    public boolean etreGagnantePourJoueur(Joueur j) {

 if (gagnantEnLigne()==true||gagnantEnColonne()==true||gagnantEnDiagonalMont()==true||gagnantEnDiagonalDesc()==true){
        return true;
 }
 
        return false;
    }

    public boolean gagnantEnLigne() {

        //Test pour le joueur avec les jetons Rouges
        for (int i = 0; i < 6; i++) {//boucle pour parcourir le tableau
            for (int j = 0; j < 4; j++) {
                if (CellulesJeu[i][j].lireCouleurDuJeton() == "rouge") {
                    int cpt = 1;
                    while (cpt < 4 && CellulesJeu[i][j + cpt].jetonCourant != null) {
                        if (CellulesJeu[i][j + cpt].lireCouleurDuJeton() == "rouge") {
                            cpt++;
                        } else {
                            break;
                        }
                    }
                    return true;
                }

            }
        }
        //Test pour le joueur avec les jetons Jaunes
        for (int i = 0; i < 6; i++) {//boucle pour parcourir le tableau
            for (int j = 0; j < 4; j++) {
                if (CellulesJeu[i][j].lireCouleurDuJeton() == "jaune") {
                    int cpt = 1;
                    while (cpt < 4 && CellulesJeu[i][j + cpt].jetonCourant != null) {
                        if (CellulesJeu[i][j + cpt].lireCouleurDuJeton() == "jaune") {
                            cpt++;
                        } else {
                            break;
                        }
                    }
                    return true;
                }

            }
        }
        return false;
    }

    public boolean gagnantEnColonne() {
        //Test pour le joueur avec les jetons Rouges
        for (int i = 0; i < 2; i++) {//boucle pour parcourir le tableau
            for (int j = 0; j < 7; j++) {
                if (CellulesJeu[i][j].lireCouleurDuJeton() == "rouge") {
                    int cpt = 1;
                    while (cpt < 4 && CellulesJeu[i + cpt][j].jetonCourant != null) {
                        if (CellulesJeu[i + cpt][j].lireCouleurDuJeton() == "rouge") {
                            cpt++;
                        } else {
                            break;
                        }
                    }
                    return true;
                }

            }
        }
        //Test pour le joueur avec les jetons Jaunes
        for (int i = 0; i < 2; i++) {//boucle pour parcourir le tableau
            for (int j = 0; j < 7; j++) {
                if (CellulesJeu[i][j].lireCouleurDuJeton() == "jaune") {
                    int cpt = 1;
                    while (cpt < 4 && CellulesJeu[i + cpt][j].jetonCourant != null) {
                        if (CellulesJeu[i + cpt][j].lireCouleurDuJeton() == "jaune") {
                            cpt++;
                        } else {
                            break;
                        }
                    }
                    return true;
                }

            }
        }
        return false;

    }

    public boolean gagnantEnDiagonalMont() {

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (CellulesJeu[i][j].lireCouleurDuJeton() == "rouge") {
                    int cpt = 1;
                    while (cpt < 4 && CellulesJeu[i + cpt][j + cpt].jetonCourant != null) {
                        if (CellulesJeu[i + cpt][j + cpt].lireCouleurDuJeton() == "rouge") {
                            cpt++;
                        } else {
                            break;
                        }
                    }
                    return true;
                }

            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (CellulesJeu[i][j].lireCouleurDuJeton() == "jaune") {
                    int cpt = 1;
                    while (cpt < 4 && CellulesJeu[i + cpt][j + cpt].jetonCourant != null) {
                        if (CellulesJeu[i + cpt][j + cpt].lireCouleurDuJeton() == "jaune") {
                            cpt++;
                        } else {
                            break;
                        }
                    }
                    return true;
                }

            }
        }

        return false;
    }

    public boolean gagnantEnDiagonalDesc() {

        for (int i = 3; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                if (CellulesJeu[i][j].lireCouleurDuJeton() == "rouge") {
                    int cpt = 1;
                    while (cpt < 4 && CellulesJeu[i - cpt][j - cpt].jetonCourant != null) {
                        if (CellulesJeu[i - cpt][j - cpt].lireCouleurDuJeton() == "rouge") {
                            cpt++;
                        } else {
                            break;
                        }
                    }
                    return true;
                }

            }
        }

        for (int i = 3; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                if (CellulesJeu[i][j].lireCouleurDuJeton() == "jaune") {
                    int cpt = 1;
                    while (cpt < 4 && CellulesJeu[i - cpt][j - cpt].jetonCourant != null) {
                        if (CellulesJeu[i - cpt][j - cpt].lireCouleurDuJeton() == "jaune") {
                            cpt++;
                        } else {
                            break;
                        }
                    }
                    return true;
                }

            }
        }
        return false;

    
}
    
 public void tasserGrille(int j ) {
      for (int i=5; i>0;i--){
         
          while (i < 6 && CellulesJeu[i][j].jetonCourant != null){
              i--;  
          }
          
         CellulesJeu[i][j].jetonCourant= CellulesJeu[i+1][j].jetonCourant;
         CellulesJeu[i+1][j]=null;
      
      }
     
 }

}
