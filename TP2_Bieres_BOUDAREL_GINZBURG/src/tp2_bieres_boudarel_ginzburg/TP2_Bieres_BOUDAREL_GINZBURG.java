/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_boudarel_ginzburg;

/**
 *
 * @author luluxontheflux
 */
public class TP2_Bieres_BOUDAREL_GINZBURG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BouteilleBiere uneBiere = new BouteilleBiere("Leffe", (float)6.6,"Abbaye de Leffe") ;
               uneBiere.lireEtiquette();
               uneBiere.Décapsuler();
               System.out.println(uneBiere) ;
               
               BouteilleBiere secondeBiere = new BouteilleBiere("La chouffe",(float) 7.5,"L'Achouffe") ;
               secondeBiere.lireEtiquette();
               secondeBiere.Décapsuler();
                System.out.println(secondeBiere) ;
                
               BouteilleBiere troisiémeBiere = new BouteilleBiere("La 86", (float)6.6,"Lubullule") ;
               troisiémeBiere.lireEtiquette();
               troisiémeBiere.Décapsuler();
               System.out.println(troisiémeBiere) ;
               
               BouteilleBiere quatrièmeBiere = new BouteilleBiere("La mort subite", (float)4.0,"Cerisier") ;
               quatrièmeBiere.lireEtiquette();
               quatrièmeBiere.Décapsuler();
               System.out.println(quatrièmeBiere) ;
   
        
        
        
    }
    
}
