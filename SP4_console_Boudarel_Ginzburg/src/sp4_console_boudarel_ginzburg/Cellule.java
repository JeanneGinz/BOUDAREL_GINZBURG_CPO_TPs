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

    boolean trouNoir, desintegrateur; //initialisation
    Jeton jetonCourant; //Création d'un jeton relié à la classe jeton 

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

    public String lireCouleurDuJeton() { // méthode pour lire la couleur du jeton
        if (jetonCourant == null) { //Cas ou il n'y a aps de jeton dans la cellule
            return "vide";
        } else {
            return jetonCourant.lireCouleur(); // méthode lisant la couleur du jeton dans la cellule
        }
    }
   
    public boolean  supprimerJeton(){ // méthode pour supprimer un jeton
        
         if ( jetonCourant != null) {//verification de la presence d'un jeton
             jetonCourant=null;// rend la cellule  vide
               return true; //le jeton est supprimé
         }
        
        return false; //il n'y a pas de jeton dans la case 
      
    }
    
      public Jeton recupererJeton(){ // méthode pour récupérer un jeton

     Jeton jetonRecup = jetonCourant; //initialisation d'un jeton à récuperer
     jetonCourant=null; //Rendre la cellule vide
     return jetonRecup; //retourner le jeton récuperé 
          
       }
    
        public boolean placerTrouNoir(){
  if (trouNoir == false){ // Si il n'y a pas de trou noir
       trouNoir = true; //  placer un trou noir
        return true;
    }  
      return false; /// il y a deja un trou noir
    }
        public boolean placerDesintegrateur(){
            
            if (desintegrateur == false){ //Si il n'y a pas de desintegrateur
       desintegrateur = true; //placer un desintegrateur
        return true;
    }  
      return false; // il y a deja un desintegrateur
      
        }
        
       public boolean presenceTrouNoir(){
           
           if (trouNoir == true){ // Il y a un trou noir
               return true;
           }
           return false; //Il n'y a pas de trou noir
           
       }
       
       public boolean presenceDesintegrateur(){
           
             if (desintegrateur == true){  //Il y a un desintegrateur
               return true;
           }
           return false; // Il n'y a pas de desintegrateur
           
       }
       
        public boolean recupererDesintegrateur(){ 
             
            if (desintegrateur == true){ //Il y a un désintegrateur
                 desintegrateur = false; // on le supprime
                   return true;
           }
           return false; //il n'y a pas de desintegrateurs présents
            
            
        }
        public boolean activerTrouNoir(){
            
            
            if (trouNoir==true){ //verification de la présence d'un trou noir
                supprimerJeton();
                trouNoir=false;  // supression du trou noir
                return true; //La méthode s'est correctement réalisé
            }
            return false; // Il n'y avait pas de trouNoir
            
        }
     
      }
    
    
    
    
    
    
    
    
    

