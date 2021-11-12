/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_boudarel_ginzburg;

/**
 *
 * @author luluxontheflux
 */
class convertisseur {
    
     int nbConversions;
     public convertisseur () { //augmente à chaque conversion 
   nbConversions = 0 ;
}
  
    
 public double CelciusVersKelvin ( double tempCelcius ) { //sous programme pour la convertion
     double tempKelvin; //déclaration de la variable pour convertion
    tempKelvin = (double) (tempCelcius +273.15) ;

    nbConversions+=1;
        return tempKelvin;
   }
 public double KelvinVersCelcius ( double tempKelvin ) { //sous programme pour la convertion
     
        double tempCelcius;//déclaration de la variable pour convertion
        
    tempCelcius = (double) (tempKelvin - 273.15) ; //Calcul convertion
    nbConversions+=1;
        return tempCelcius;
   }

 public double CelciusVersFarenheit ( double tempCelcius) { //sous programme pour la convertion
     double tempFarenheit; //déclaration de la variable pour convertion
    tempFarenheit = (double) (tempCelcius * (9.0/5)+ 32) ; //Calcul convertion
    nbConversions+=1;
        return tempFarenheit;
   }

 public double FarenheitVersCelcius ( double tempFarenheit) { //sous programme pour la convertion
     double tempCelcius; //déclaration de la variable pour convertion
    tempCelcius = (double) ((tempFarenheit-32) * (5.0/9)) ;//Calcul convertion
    nbConversions+=1;
        return tempCelcius;
   }

 public double KelvinVersFarenheit ( double tempKelvin ) {//sous programme pour la convertion
     
        double tempFarenheit;//déclaration de la variable pour convertion
        
    tempFarenheit = (double) ((tempKelvin - 273.15)*9.0/5+32) ;//Calcul convertion
    nbConversions+=1;
        return tempFarenheit;
   }
 public double FarenheitVersKelvin ( double tempFarenheit) {//sous programme pour la convertion
     double tempKelvin; //déclaration de la variable pour convertion
    tempKelvin = (double) ((tempFarenheit-32) * (5.0/9)+273.15 ) ;//Calcul convertion2 
    nbConversions+=1;
        return tempKelvin;
   }




@Override
public String toString () {
  return "nb de conversions"+ nbConversions;
}


}