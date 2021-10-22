/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertisseur_ginzburg_boudarel;

import java.util.Scanner;

/**
 *
 * @author luluxontheflux
 */
public class Convertisseur_GINZBURG_BOUDAREL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     //initialisation
        double var1; //declaration de la température
        Scanner sc; 
      sc=new Scanner (System.in); //initalisation de l'objet scanner
        int c;
      //Menu
      
      System.out.println("Bonjour ! \n ");
      System.out.println("Choisissez votre température "); // demander à l'utilisateur le premier entier
    var1 = sc.nextDouble(); //sotckage de l'entier
    System.out.println("Quel conversion souhaitez vous faire ?\n 1) De Celcius vers Kelvin \n 2) De Kelvin vers Celcius\n 3) De Farenheit Vers Celcius \n 4) De Celcius Vers Farenheit\n 5)De Kelvin Vers Farenheit \n 6) De Farenheit vers Kelvin");
    c = sc.nextInt();
    
      switch(c){
              
              case 1 -> {
                  //programme pour Clecius -> Kelvin
                  System.out.println("La température est "+var1+"°C");// Affichage de la température en degrés
                  var1 = CelciusVersKelvin(var1) ; //Conversion de la température en Kelvin
                  System.out.println("La température est  "+var1+"K");//Affichaghe de la température en Kelvin
            }
              case 2 -> {
                  //programme pour  Kelvin->Clecius
                  
                  System.out.println("La température est "+var1+"K");// Affichage de la température en kelvin
                  var1 = KelvinVersCelcius(var1) ; //Conversion de la température en degrés
                  System.out.println("La température est  "+var1+"°C"); //Affichage de la température en degrés
            }
              case 3 -> {
                  //programme pour Celcius-> Farenheit
                  
                  System.out.println("La température est "+var1+"°C");// Affichage de la température en Celcius
                  var1 = CelciusVersFarenheit(var1) ; //Conversion de la température en degrés
                  System.out.println("La température est  "+var1+"F"); //Affichage de la température en Farenheit
            }
              case 4 -> {
                  //programme pour Farenheit-> Clecius
                  
                  System.out.println("La température est "+var1+"F");// Affichage de la température en Farenheit
                  var1 = FarenheitVersCelcius(var1) ; //Conversion de la température en degrés
                  System.out.println("La température est  "+var1+"°C"); //Affichage de la température en degrés
            }
        
              case 5 -> {
                  //programme pour Kelvin->Farenheit
                  
                  System.out.println("La température est "+var1+"K");// Affichage de la température en kelvin
                  var1 = KelvinVersFarenheit(var1) ; //Conversion de la température en degrés
                  System.out.println("La température est  "+var1+"F"); //Affichage de la température en Farenheit
            }
        
              case 6 -> {
                  //programme pour Farenheit->Kelvin
                  
                  System.out.println("La température est "+var1+"F");// Affichage de la température en Farenheit
                  var1 = FarenheitVersKelvin(var1) ; //Conversion de la température en degrés
                  System.out.println("La température est  "+var1+"K"); //Affichage de la température en Kelvin
            }
        
        default -> {
            }
            
    }
    }
    
    
    
        
    
    
    
   public static double CelciusVersKelvin ( double tempCelcius ) { //sous programme pour la convertion
     double tempKelvin; //déclaration de la variable pour convertion
    tempKelvin = (double) (tempCelcius +273.15) ;// 
    
        return tempKelvin;
   }
   
  
   
   public static double KelvinVersCelcius ( double tempKelvin ) { //sous programme pour la convertion
     
        double tempCelcius;//déclaration de la variable pour convertion
        
    tempCelcius = (double) (tempKelvin - 273.15) ; //Calcul convertion
    
        return tempCelcius;
   }
   
   public static double CelciusVersFarenheit ( double tempCelcius) { //sous programme pour la convertion
     double tempFarenheit; //déclaration de la variable pour convertion
    tempFarenheit = (double) (tempCelcius * (9.0/5)+ 32) ; //Calcul convertion
    
        return tempFarenheit;
   }
   
   public static double FarenheitVersCelcius ( double tempFarenheit) { //sous programme pour la convertion
     double tempCelcius; //déclaration de la variable pour convertion
    tempCelcius = (double) ((tempFarenheit-32) * (5.0/9)) ;//Calcul convertion
    
        return tempCelcius;
   }
   
   public static double KelvinVersFarenheit ( double tempKelvin ) {//sous programme pour la convertion
     
        double tempFarenheit;//déclaration de la variable pour convertion
        
    tempFarenheit = (double) ((tempKelvin - 273.15)*9.0/5+32) ;//Calcul convertion
    
        return tempFarenheit;
   }
   
   public static double FarenheitVersKelvin ( double tempFarenheit) {//sous programme pour la convertion
     double tempKelvin; //déclaration de la variable pour convertion
    tempKelvin = (double) ((tempFarenheit-32) * (5.0/9)+273.15 ) ;//Calcul convertion2 
    
        return tempKelvin;
   }
   
    
}
