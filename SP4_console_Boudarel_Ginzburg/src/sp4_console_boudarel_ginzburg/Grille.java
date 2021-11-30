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
public boolean ajouterJetonDansColonne(Jeton Jet, int c){ // prend en paramètre un jeton et une colonne
    for (int l=0; l<6; l++){ // parcours des lignes
        if (CellulesJeu[l][c].jetonCourant == null){ // dès qu' une case de la colonne fixée est vide on affecte le jeton
           // CellulesJeu[l][c].affecterJeton(Jet);
           CellulesJeu[l][c].jetonCourant=Jet;
            return true;
        }
    }
return false; // colonne remplie
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
    public void  afficherGrilleSurConsole() {
  // affiche la grille dans la console

    for (int l=5; l>=0; l--){ // boucle décrémentée car l'affichage conventionnel et celui pris par les tableaux est inversé
        for (int c=0; c<7; c++){
            if (CellulesJeu[l][c].trouNoir != false){
                System.out.print("*"); // T sur la cellule pour signifier sa présence
            }
            else if (CellulesJeu[l][c].desintegrateur != false){
                System.out.print("X");
            }
            else if (CellulesJeu[l][c].jetonCourant == null){
                System.out.print("-");
            }
            else if ((CellulesJeu[l][c].lireCouleurDuJeton() == "rouge")){
                    System.out.print("J");
                 }
            else{
                    System.out.print("R");
                }
                  
        }
        System.out.println(" " + (l+1)); // affichage des numéros de lignes (l+1) car tableau commence à 0
    }
    for (int c=0; c<7; c++){
        System.out.print((c+1)); // affichage des colonnes (c+1) car tableau commence à 0
    }
    System.out.println(); // affichage global du tableau
}


    /*public void afficherGrilleSurConsole() { // classe pour afficher la grille
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
            System.out.println("-"); //affichage pour donner la forme au tableau
        }
    }*/
    /*public void afficherGrilleSurConsole(){
        for (int i=5;i>=0;i--){
            for(int j=0;j<=6;j++){
                if (celluleOccupee(i,j)==true){
                    if ("Rouge".equals(CellulesJeu[i][j].lireCouleurDuJeton())) {
                    System.out.print(" \033[31m X \033[30m ");      
                    }
                    else if ("Jaune".equals(CellulesJeu[i][j].lireCouleurDuJeton())) {
                    System.out.print(" \033[33m X \033[30m ");      
                    }
                }
                else if(CellulesJeu[i][j].presenceTrouNoir()==true){
                    System.out.print(" \033[37m X \033[30m ");
                }
                else  {
                System.out.print("  -  ");      
                }
               
       
      }  System.out.println();
     
    }
    }
   /*

    public boolean celluleOccupee(int i, int j) {
        if (CellulesJeu[i][j].jetonCourant != null) { 
           // System.out.println("Cellule occupée par jeton");
            return true;
        }
        return false;
    }
*/
    public String lireCouleurDuJeton(int i, int j) {
        //String couleur;
        //couleur = CellulesJeu[i][j].jetonCourant.lireCouleurDuJeton();
       return (CellulesJeu[i][j].lireCouleurDuJeton());
       // return couleur;
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
  

   /* public boolean etreGagnantePourJoueur(Joueur j) {

 if (gagnantEnLigne()==true||gagnantEnColonne()==true||gagnantEnDiagonalMont()==true||gagnantEnDiagonalDesc()==true){
        return true;
 }
 
        return false;
    }
  */
boolean colonneRemplie (int colonne){

        return CellulesJeu[5][colonne].jetonCourant!=null ; 

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

   
    /*public boolean gagnantEnColonne() {
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
*/
    /*public boolean gagnantEnDiagonalMont() {

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

    
}*/
public boolean etreGagnantePourJoueur(Joueur personnageG){

        int Compt = 0;

        String CouleurGagnante = personnageG.Couleur;

 

        for (int i=0; i<6; i++) {

            for (int j=0; j<4; j++){ 

            Compt=0;

            String CouleurCase = lireCouleurDuJeton(i,j);

                if (CouleurCase == CouleurGagnante){

                    int k =j;

                    while (CellulesJeu[i][k].lireCouleurDuJeton()== CouleurGagnante){

                        Compt += 1;

                        k +=1;

                        if (Compt == 4){

                            return true;

                        }

                    }

                }

 

            }

        }

 

        for (int i=0; i<3; i++) {

            for (int j=0; j<7; j++){

                Compt=0;

            String Couleurcellule = lireCouleurDuJeton(i,j);

                if (Couleurcellule == CouleurGagnante){

                    int k =i;

                    while (CellulesJeu[k][j].lireCouleurDuJeton()== CouleurGagnante){

                        Compt += 1;

                        k +=1;

                        if (Compt == 4){

                            return true;

 

                        }

                    }

                }    

 

            }

        }

 

       

        for (int i=0; i<3; i++) {

            for (int j=0; j<4; j++){ 

                Compt=0;

            String Couleurcellule = lireCouleurDuJeton(i,j);

                if (Couleurcellule == CouleurGagnante){

                    int k =i;

                    int n = j;

                    while (CellulesJeu[k][n].lireCouleurDuJeton()== CouleurGagnante){

                        Compt += 1;

                        k +=1;

                        n +=1;

                        if (Compt == 4){

                            return true;

 

                        }

 

                    }

 

                }    

 

            }

 

        }

 

        

        for (int i=3; i<6; i++) {

            for (int j=0; j<4; j++){ 

                Compt=0;

            String Couleurcellule = lireCouleurDuJeton(i,j);

                if (Couleurcellule == CouleurGagnante){

                    int k =i;

                    int n = j;

                    while (CellulesJeu[k][n].lireCouleurDuJeton()== CouleurGagnante){

                        Compt += 1;

                        k +=1;

                        n -=1;

                        if (Compt == 4){

                            return true;

 

                        }

                    }

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
public Jeton recupererJeton(int ligne, int colone){

    Jeton recuperationJeton =  CellulesJeu[ligne][colone].jetonCourant;

    CellulesJeu[ligne][colone].supprimerJeton();

    return recuperationJeton;          

}
}
