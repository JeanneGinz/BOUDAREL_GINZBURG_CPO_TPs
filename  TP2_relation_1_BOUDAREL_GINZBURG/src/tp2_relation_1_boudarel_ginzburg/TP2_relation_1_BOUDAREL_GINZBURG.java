/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_boudarel_ginzburg;

/**
 *
 * @author luluxontheflux
 */
public class TP2_relation_1_BOUDAREL_GINZBURG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ; 
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ; 
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");

        System.out.println("liste des voitures disponibles "+ uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        
        bob.ajouter_voiture(uneClio); //méthode permet d'alléger le code
    System.out.println("la premiere voiture de Bob est " + bob.liste_voitures[0] ) ;
    bob.ajouter_voiture(une2008);
    System.out.println("la deuxième voiture de Bob est " + bob.liste_voitures[1] ) ;

         reno.ajouter_voiture(uneMicra);
    System.out.println("la premiere voiture de Reno est " + reno.liste_voitures[0] ) ;
    reno.ajouter_voiture(uneAutreClio);
    System.out.println("la deuxième voiture de Reno est " + reno.liste_voitures[1] ) ;
        Voiture autrevoiture = null;
    
    
   bob.ajouter_voiture(autrevoiture);
        Voiture uneAudi = null;
   bob.ajouter_voiture(uneAudi); //bob possède déja 3 voitures donc ne peut pas en avoir plus
   reno.ajouter_voiture(uneClio); // la Clio est déjà possédée par bob donc reno ne peut pas l'avoir
   System.out.println(bob);
   System.out.println(reno);
    }
    
}
