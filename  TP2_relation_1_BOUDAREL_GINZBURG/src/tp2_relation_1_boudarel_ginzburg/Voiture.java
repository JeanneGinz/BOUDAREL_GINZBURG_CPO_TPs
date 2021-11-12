/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_boudarel_ginzburg;

/**
 *
 * @author luluxontheflux
 */
public class Voiture {
    //Attribut 
    String modele,marque;
    int puissanceCV;
    Personne proprio; 
    Object Propriétaire;
    
   public Voiture(String UnModele, String UneMarque, int LaPuissance, Personne individu ) {
       modele= UnModele;
       marque=UneMarque;
       puissanceCV=LaPuissance;
       proprio=individu;
       
       
       
   }

    Voiture(String clio, String renault, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   @Override
    public String toString() {
        return modele+" de la marque "+marque+" de puissance "+puissanceCV;
    }
    
    
    
  
    
}
