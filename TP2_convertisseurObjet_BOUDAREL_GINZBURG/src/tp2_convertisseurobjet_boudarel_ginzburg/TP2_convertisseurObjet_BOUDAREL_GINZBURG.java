
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_boudarel_ginzburg;

import java.util.Scanner;

/**
 *
 * @author jeann
 */
public class TP2_convertisseurObjet_BOUDAREL_GINZBURG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner sc; 
      sc=new Scanner (System.in);
        double temp;
        int conver;
        
        System.out.println("Choisissez une température /n"); 
         temp = sc.nextDouble();
       System.out.println("Quel conversion souhaitez vous faire ?\n 1) De Celcius vers Kelvin \n 2) De Kelvin vers Celcius\n 3) De Farenheit Vers Celcius \n 4) De Celcius Vers Farenheit\n 5)De Kelvin Vers Farenheit \n 6) De Farenheit vers Kelvin");      
      conver = sc.nextInt();
      
convertisseur ConversionUn ;
ConversionUn= new convertisseur();    
     
      switch(conver){
              
              case 1 -> {
                  //programme pour Clecius -> Kelvin
                 
                 System.out.println("La température est "+temp); 
                  ConversionUn.CelciusVersKelvin(temp);
                  System.out.println("La température est  "+temp);
                  
            }
              case 2 -> {
                  //programme pour  Kelvin->Clecius
                  
                  
                   System.out.println("La température est "+temp); 
                  ConversionUn.KelvinVersCelcius(temp);
                  System.out.println("La température est  "+temp);
                  
            }
              case 3 -> {
                  //programme pour Celcius-> Farenheit
                  
                 
                 System.out.println("La température est "+temp); 
                     ConversionUn.CelciusVersFarenheit(temp); 
                  System.out.println("La température est  "+temp);
              
            }
              case 4 -> {
                  //programme pour Farenheit-> Clecius
                  
                  
                   System.out.println("La température est "+temp); 
                  ConversionUn.FarenheitVersCelcius(temp); 
                  System.out.println("La température est  "+temp);
                 
            }
        
              case 5 -> {
                  //programme pour Kelvin->Farenheit
                  
                 
                  System.out.println("La température est "+temp); 
                  ConversionUn.KelvinVersFarenheit(temp);
                  System.out.println("La température est  "+temp);
            }
        
              case 6 -> {
                  //programme pour Farenheit->Kelvin
                
                 System.out.println("La température est "+temp); 
                  ConversionUn.FarenheitVersKelvin(temp); 
                  System.out.println("La température est  "+temp);
            }
     
            
    }
    }

  
}
    


        
        
        

        
    
 
