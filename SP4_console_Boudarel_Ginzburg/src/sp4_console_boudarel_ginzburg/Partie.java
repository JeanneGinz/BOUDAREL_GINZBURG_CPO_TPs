/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_boudarel_ginzburg;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author jeann
 */
public class Partie {
    Joueur[] ListeJoueurs = new Joueur[2];
    Joueur joueurCourant;
    Grille grilleJeu= new Grille();
    
    public Partie(Joueur joueur1, Joueur joueur2){
     ListeJoueurs[0] = joueur1; // declaration des 2 joueurs
    ListeJoueurs[1] = joueur2;

}
    @SuppressWarnings("empty-statement")
    
    
    
    public void initialiserPartie(){
        grilleJeu=new Grille();
        for(int v=0; v<22; v++){ // on crée 21 jetons pour le 1er joueur
            Jeton piece1=new Jeton("rouge"); // creation d'un jeton piece1 qui est rouge
            ListeJoueurs[0].ajouterJeton(piece1);
            Jeton piece2=new Jeton("jaune");//creation d'un jeton piece2 qui est jaune
            ListeJoueurs[1].ajouterJeton(piece2);
        }
        
      int nb=0; // initialisation pour determiner le joueur qui commence
       Random random = new Random(); // initialisation de notre fonctions random
      nb = random.nextInt(2);
      if (nb==0){ // si nb=0 alors le joueur rouge commence 
         String coul="rouge";
             if (coul==ListeJoueurs[0].Couleur){
             joueurCourant = ListeJoueurs[0];
         }
         else{ joueurCourant=ListeJoueurs[1];}
         
      }
       if (nb==1){ // si nb=0 alors le joueur jaune commence 
         String coul="jaune";
         if (coul==ListeJoueurs[0].Couleur){
             joueurCourant = ListeJoueurs[0];
         }
         else{ joueurCourant=ListeJoueurs[1];}
         
        }
      int i;
      //placement des trous noirs
      for (i=0;i<=3;i++) { //boucle placer les 5 trous noirs
      int trouNoirL = random.nextInt(6);//randomiser les coordonées en ligne
      int trouNoirC = random.nextInt(7);//randomiser les coordonées en colonne
      if (grilleJeu.CellulesJeu[trouNoirL][trouNoirC].presenceTrouNoir()==false){ // verifier qu'il n'y est pas déjà de trou noir
      grilleJeu.CellulesJeu[trouNoirL][trouNoirC].placerTrouNoir();  } // placer le trou noir
      else i--; // recommencer car il y a deja un trou noir
    }
      //placement des trous noir et désintégrateurs sur la même case
            for (i=0;i<=2;i++) { //boucle placer les 5 trous noirs
      int trouNoirL = random.nextInt(6);//randomiser les coordonées en ligne
      int trouNoirC = random.nextInt(7);//randomiser les coordonées en colonne
      if (grilleJeu.CellulesJeu[trouNoirL][trouNoirC].presenceTrouNoir()==false){ // verifier qu'il n'y est pas déjà de trou noir
      grilleJeu.CellulesJeu[trouNoirL][trouNoirC].placerTrouNoir();
       grilleJeu.CellulesJeu[trouNoirL][trouNoirC].placerDesintegrateur() ;
               } // placer le trou noir
      else i--; // recommencer car il y a deja un trou noir
    }
      
     //placement des 3 désintégrateurs 
     for (i=0;i<=3;i++) { //boucle placer les 5 trous noirs
      int DesinL = random.nextInt(6);//randomiser les coordonées en ligne
      int DesinC = random.nextInt(7);//randomiser les coordonées en colonne
      if (grilleJeu.CellulesJeu[DesinL][DesinC].presenceTrouNoir()==false){ // verifier qu'il n'y est pas déjà de trou noir
      grilleJeu.CellulesJeu[DesinL][DesinC].placerDesintegrateur();  } // placer le désinteagrateur
      else i--; // recommencer car il y a deja un trou noir
    }
    }
     //placement des 3 désintégrateurs ou trou noir */
    
    public void attribuerCouleursAuxJoueurs(){
  
    String couleur;
  
  Random random = new Random(); // initialisation de notre fonctions random
    int nb; //initialisation d'un nombre pour y affecter la randomisation
    nb = random.nextInt(2); //Génére un chiffre entre 0 et 1
if (nb==0){ //si le chiffre est 0, le joueur sera rouge
      couleur = "rouge";
      ListeJoueurs[0].affecterCouleur(couleur); //joueur 1 devient rouge
      ListeJoueurs[1].affecterCouleur("jaune"); //joueur 2 devient jaune
 }
else  { couleur="jaune";  //si le chiffre est 1, le joueur sera jaune*/
      ListeJoueurs[0].affecterCouleur(couleur);  //joueur 1 devient jaune
     ListeJoueurs[1].affecterCouleur("rouge"); }//joueur 2 devient rouge
    }
    
    
public void debuterPartie(){

    
grilleJeu.viderGrille(); // on vérifie ue la grille soit bien vide pour ne pas créer de pbs
initialiserPartie(); // préparation de la grille de jeu
    
    System.out.println("Bienvenue sur le Super Puissance 4"); 
  
 Scanner sc; //initialisation du scanner
 sc=new Scanner (System.in);
 String nom1, nom2;
 
 //Créations des joueurs et de leurs noms
   System.out.println("Comment s'appelle le premier joueur ?"); //demande des pseusos
   nom1 = sc.nextLine(); //Enregistrement dans la mémoire des pseudos
  
   ListeJoueurs[0]=new Joueur(nom1); //affectation de son nom dans la classe
  
   System.out.println("Comment s'appelle le deuxième joueur ?");//Création de l'objet étant le deuxième joueur
   nom2 = sc.nextLine();
      
 
   ListeJoueurs[1]=new Joueur(nom2);//affectation de son nom dans la classe
   
    initialiserPartie(); // préparation de la grille de jeu
    attribuerCouleursAuxJoueurs();
   //boucle verifie while 
   while(grilleJeu.etreRemplie()==false || grilleJeu.etreGagnantePourJoueur(ListeJoueurs[0])==false && grilleJeu.etreGagnantePourJoueur(ListeJoueurs[1])==false){
       // boucle qui continue la partie tant que la grille n'est pas rempli ou qu'un des joueurs n'a pas gagné
       if (joueurCourant==ListeJoueurs[0]){ // cas si le premier joueur à joueur est le joueur1
           System.out.println("C'est au tour "+ nom1 + " de jouer");
            int Action = 0; 
            int ligne=0;
            System.out.println("Les différentes actions possibles : "); // differentes actions possibles pour le joueur
            System.out.println("1. Poser un jeton");
            System.out.println("2. Désintégrer un jeton adverse");
            System.out.println("3. Récupérer un jeton");
            Action = sc.nextInt();
        
            switch (Action) { // differentes possibilitées pour joueur 
                case 1: 
                    System.out.println("Rentrez le chiffre de la colonne que vous voulez joueur, entre 1 et 8");
                    int colonne=sc.nextInt()-1; // entre le numéro de la colonne où il veut jouer
                    if (colonne<=-1||colonne>8){
                        System.out.println("Hors grille, veuillez re-saisir un chiffre compris entre 1 et 8"); // notre grille de jeu possède 7 colonnes 
                    }
                    if (grilleJeu.colonneRemplie(colonne) == true){ // condition qui vérifie si le colonne est remplie, si oui on redemande une nouvelle colonne
                    System.out.println("Colonne remplie. Réessayer.");
                    colonne = colonne -1; 
                    }
                    grilleJeu.ajouterJetonDansColonne(joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants - 1], colonne);
                    break; // sort du cas 1
                    
                case 2: //Désintégrer un jeton adverse
                  
                System.out.println("Entrez un numéro de ligne: ");
                 ligne = sc.nextInt() - 1; // car on commence à 0 dpnc chaque valeur doit être diminuer de 1
                if (ligne > 5 || ligne < 0) {
                    System.out.println("Hors grille, veuillez re-saisir un chiffre compris entre 0 et 5"); // grille composée de 6 lignes
                    ligne = sc.nextInt() - 1;
                }
                System.out.println("Entrez un chiffre pour la colonne: "); 
                 colonne = sc.nextInt() - 1;
                if (colonne > 6 || colonne < 0) {
                    System.out.println("Hors grille, veuillez re-saisir un chiffre compris entre 0 et 5");
                    colonne = sc.nextInt() - 1;
                }
                
                if (grilleJeu.CellulesJeu[ligne][colonne].lireCouleurDuJeton() != joueurCourant.Couleur) { // vérification que le jeton appartient bien au joueurCourant
                    System.out.println("Le jeton sélectionné n'est pas le votre, veuillez re-saisir ");
                    colonne = sc.nextInt();
                    ligne =sc.nextInt();
                    break;
                    
                }
                
                joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants - 1] = grilleJeu.recupererJeton(ligne,colonne);
                grilleJeu.tasserGrille(colonne);
                
            case 3 : // action Récupérer un jeton
                  
                if( (joueurCourant.nombreDesintegrateurs != 0)) { //utilisation d'un desintégrateur si il y a au moins 1 intégrateur dans la réserve

                

               System.out.println("Entrez un chiffre pour la ligne: ");

                ligne = sc.nextInt() - 1;

                while (ligne > 5 || ligne < 0) {

                    System.out.println("Hors grille, veuillez re-saisir un chiffre compris entre 1 et 6");

                    ligne = sc.nextInt() - 1;

                }

                System.out.println("Rentrez le chiffre de la colonne que vous voulez joueur, entre 1 et 8");

                 colonne = sc.nextInt() - 1;

                while (colonne > 6 || colonne < 0) {

                    System.out.println("Hors grille, veuillez re-saisir un chiffre compris entre 0 et 8");

                    colonne = sc.nextInt() - 1;

                }

                joueurCourant.utiliserDesintegrateur();

 

                // verifier la couleur de la cellule, identique a celle du joueur

                if (grilleJeu.CellulesJeu[ligne][colonne].lireCouleurDuJeton() != joueurCourant.Couleur) {

                    System.out.println("Hors grille, veuillez re-saisir un chiffre compris entre 0 et 5");

                }

                grilleJeu.supprimerJeton(ligne, colonne);

                grilleJeu.tasserGrille( colonne);
            } else if (joueurCourant.nombreDesintegrateurs == 0) {

                System.out.println(" Vous ne possédez pas de désintégrateur à utiliser"); 
            }
} 
            grilleJeu.afficherGrilleSurConsole();
            joueurCourant=ListeJoueurs[1]; // on change de joueur 
            
}
        

if (joueurCourant==ListeJoueurs[1]){ // cas si le premier joueur à joueur est le joueur2
             System.out.println("C'est au tour "+ nom2 + " de jouer"); // affiche le joueur qui joue à chaque tour
            int Action = 0; 
            int ligne=0;
            System.out.println("Les différentes actions possibles : "); // differentes actions possibles pour le joueur
            System.out.println("1. Poser un jeton");
            System.out.println("2. Désintégrer un jeton adverse");
            System.out.println("3. Récupérer un jeton");
            Action = sc.nextInt();
        
            switch (Action) { // differentes possibilitées pour le joueur 
                case 1: 
                    System.out.println("Rentrez le chiffre de la colonne que vous voulez joueur, entre 1 et 8");
                    int colonne=sc.nextInt()-1; // entre le numéro de la colonne où il veut jouer
                    if (colonne<=-1||colonne>8){
                        System.out.println("Hors grille, veuillez re-saisir un chiffre compris entre 1 et 8"); // notre grille de jeu possède 7 colonnes 
                    }
                    if (grilleJeu.colonneRemplie(colonne) == true){
                    System.out.println("La colonne est remplie. Veuillez resaisir");
                    colonne = colonne -1;
                    }
                    grilleJeu.ajouterJetonDansColonne(joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants-1], colonne);
                    break;

                case 2: //Désintégrer un jeton adverse
                System.out.println("Entrez un numéro de ligne: ");
                 ligne = sc.nextInt() - 1; // car on commence à 0
                if (ligne > 5 || ligne < 0) {
                    System.out.println("Hors grille, veuillez re-saisir un chiffre compris entre 0 et 5: "); // grille composée de 6 lignes
                    ligne = sc.nextInt() - 1;
                }
                System.out.println("Entrez un chiffre pour la ligne: ");

                 colonne = sc.nextInt() - 1;

                if (colonne > 6 || colonne < 0) {

                    System.out.println("Hors grille, veuillez re-saisir un chiffre compris entre 0 et 5: ");

                    colonne = sc.nextInt() - 1;
                }
                
                if (grilleJeu.CellulesJeu[ligne][colonne].lireCouleurDuJeton() != joueurCourant.Couleur) { // vérification que le jeton appartient bien au joueurCourant
                    System.out.println("Le jeton sélectionné n'est pas le votre, veuillez re-saisir ");
                    colonne = sc.nextInt();
                    ligne =sc.nextInt();
                    break;
                    
                }
                
                joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants - 1] = grilleJeu.recupererJeton(ligne,colonne);
                grilleJeu.tasserGrille(colonne);
                break;
                
            case 3 : // action Récupérer un jeton
                  
                if( (joueurCourant.nombreDesintegrateurs != 0)) { //utilisation d'un desintégrateur si il y a au moins 1 intégrateur dans la réserve

                

               System.out.println("Entrez un chiffre pour la ligne: ");

                ligne = sc.nextInt() - 1;

                while (ligne > 5 || ligne < 0) {

                    System.out.println("Hors grille, veuillez re-saisir un chiffre compris entre 1 et 6");

                    ligne = sc.nextInt() - 1;

                }

                System.out.println("Rentrez le chiffre de la colonne que vous voulez joueur, entre 1 et 8");

                 colonne = sc.nextInt() - 1;

                while (colonne > 6 || colonne < 0) {

                    System.out.println("Hors grille, veuillez re-saisir un chiffre compris entre 0 et 8");

                    colonne = sc.nextInt() - 1;

                }

                joueurCourant.utiliserDesintegrateur();

 

                // verifier la couleur de la cellule, identique a celle du joueur

                if (grilleJeu.CellulesJeu[ligne][colonne].lireCouleurDuJeton() != joueurCourant.Couleur) {

                    System.out.println("Hors grille, veuillez re-saisir un chiffre compris entre 0 et 5");

                }

                grilleJeu.supprimerJeton(ligne, colonne);

                grilleJeu.tasserGrille( colonne);
            } else if (joueurCourant.nombreDesintegrateurs == 0) {

                System.out.println(" Vous ne possédez pas de désintégrateur à utiliser");
                break;
            }

} 
            grilleJeu.afficherGrilleSurConsole();
            joueurCourant=ListeJoueurs[0]; // on change de joueur
            
}
        if (grilleJeu.etreGagnantePourJoueur(ListeJoueurs[0]) == true) {

            System.out.println(ListeJoueurs[0].Nom + " a gagné !");

        }

        if (grilleJeu.etreGagnantePourJoueur(ListeJoueurs[1]) == true) {

            System.out.println(ListeJoueurs[1].Nom + " a gagné!");

        }

        if (grilleJeu.etreRemplie() == true) {

            System.out.println("La grille est pleine,aucun gagnant");

        }
 

    }
} 
}



 


    


  