/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_boudarel_ginzburg;

/**
 *
 * @author luluxontheflux
 */
public class Jeton {
  
    String couleurJet; 
     
  public Jeton ( String c){
    couleurJet = c; 
    
}
  public String lireCouleur(){
      
     return couleurJet; // retourne la couleur du jeton
     
  }
}