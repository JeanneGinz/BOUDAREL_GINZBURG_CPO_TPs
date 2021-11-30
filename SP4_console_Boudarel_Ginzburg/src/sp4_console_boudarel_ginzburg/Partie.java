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
    Grille grilleJeu;
    
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
      grilleJeu.CellulesJeu[DesinC][DesinC].placerDesintegrateur();  } // placer le désinteagrateur
      else i--; // recommencer car il y a deja un trou noir
    }
    }
     //placement des 3 désintégrateurs hor trou noir
    
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
    


    
public int debuterPartie(){

    
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
       if (joueurCourant==ListeJoueurs[0]){
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
                    int col=sc.nextInt()-1; // entre le numéro de la colonne où il veut jouer
                    if (col<=-1||col>8){
                        System.out.println("Hors grille, veuillez re-saisir un chiffre compris entre 1 et 8"); // notre grille de jeu possède 7 colonnes 
                    }
                    if (grilleJeu.colonneRemplie(col) == true){
                    System.out.println("Colonne remplie. Réessayer.");
                    col = col -1;
                    }
                    grilleJeu.ajouterJetonDansColonne(joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants - 1], col);

                case 2: //Désintégrer un jeton adverse
                    

               // sc = new Scanner(System.in);
                System.out.println("Entrez un numéro de ligne: ");
                int lign = sc.nextInt() - 1; // car on commence à 0
                if (lign > 5 || lign < 0) {
                    System.out.println("Hors grille, veuillez re-saisir un chiffre compris entre 0 et 5"); // grille composée de 6 lignes
                    lign = sc.nextInt() - 1;
                }
                System.out.println("Entrez un chiffre pour la ligne: ");

                 coll = sc.nextInt() - 1;

                if (coll > 6 || coll < 0) {

                    System.out.println("Hors grille, veuillez re-saisir un chiffre compris entre 0 et 5");

                    coll = sc.nextInt() - 1;
                }
                
                if (grilleJeu.CellulesJeu[lign][coll].lireCouleurDuJeton() != joueurCourant.Couleur) { // vérification que le jeton appartient bien au joueurCourant
                    System.out.println("Le jeton sélectionné n'est pas le votre, veuillez re-saisir ");
                    coll = sc.nextInt();
                    lign =sc.nextInt();
                    break;
                    
                }
                
                joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants - 1] = grilleJeu.recupererJeton();
                grilleJeu.tasserGrille(coll);
                
            case 3 : // action Récupérer un jeton
                  
                if( (joueurCourant.nombreDesintegrateurs != 0)) { //utilisation d'un desintégrateur

                

               System.out.println("Entrez un chiffre pour la ligne: ");

                lign = sc.nextInt() - 1;

                while (lign > 5 || lign < 0) {

                    System.out.println("Hors grille, veuillez re-saisir un chiffre compris entre 1 et 6");

                    lign = sc.nextInt() - 1;

                }

                System.out.println("Rentrez le chiffre de la colonne que vous voulez joueur, entre 1 et 8");

                int colonne = sc.nextInt() - 1;

                while (colonne > 6 || colonne < 0) {

                    System.out.println("ERREUR: Veuillez ressaisir un numéro de colonne correct:");

                    colonne = sc.nextInt() - 1;

                }

                joueurCourant.utiliserDesintegrateur();

 

                // verifier la couleur de la cellule, identique a celle du joueur

                while (grilleJeu.CellulesJeu[lign][coll].lireCouleurDuJeton() != joueurCourant.Couleur) {

                    System.out.println("Hors grille, veuillez re-saisir un chiffre compris entre 0 et 5");

                }

 

                grilleJeu.supprimerJeton(lign, coll);

                grilleJeu.tasserGrille(ligne, colonne);

                changerJoueur();

            } else if (saisie == 3 && (joueurCourant.nombreDesintegrateurs == 0)) {

                System.out.println("ERREUR: Vous n'avez pas de désintégrateur à utiliser");

            }

} 
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
                default:
                    System.out.println("Choix non valide"); //message d'erreur si l'utilisateur rentre un numéro de choix non valide (inférieur à 1 ou supérieur à 6)
            } 
           
           
          // Joueur nombreJetonsRestants;
          //if (int i=0; i<nombreJetonsRestants; i++){
          
           }
          
           grilleJeu.afficherGrilleSurConsole();
           joueurCourant=ListeJoueurs[1];// le prochain joueur à joueur est l'autre joueur
           
           
     
           
   }
System.out.println(joueurCourant.Nom + " a gagné la partie");
}

}

Jeton JetonCourant =joueurCourant.ListeJetons[]joueurCourant.nombreJetonsRestants-1];
                    
                    
                    break; // importance du break pour couper la boucle
