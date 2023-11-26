package sole.aleix.plantilles.classe1;

import sole.aleix.plantilles.gos.Gos;   // Importem la classe Gos per poder utilitzar-la.

public class Classe1 {
    public static void main(String[] args) {
        
        // Creació d'un objecte Gos utlitzant el constructor, posant totes les variables.
        Gos tuffy = new Gos("Tuffy", "papillon", 5, "white");
        
        System.out.println();
        System.out.println(tuffy.toString());   // Imprimirà el que retorni el mètode toString().

        System.out.println();
        System.out.println(tuffy);              // Per defecte, el print utilitza el mètode toString().

        // Creació d'un objecte Gos utlitzant el constructor, utilitzant les variables per defecte.
        Gos bobby = new Gos();
        System.out.println();
        System.out.println(bobby.toString());   // Imprimirà el que retorni el mètode toString().

        // Modificar les variables de l'objecte bobby.
        bobby.nom = "Bobby";    // Com que és publica la podem mofiicar directament. NO RECOMENABLE.
        //bobby.raça("Pastor Alemany");    // No permès, ja que és private. CORRECTE!
        bobby.setRaça("Pastor Alemany");    // Per modificar-la, s'ha de fer servir el mètode setter.

        System.out.println();
        System.out.println(bobby.toString());   // Imprimirà el que retorni el mètode toString().

        // Accedir a un sol valor de l'objecte bobby.
        System.out.println();
        System.out.println(bobby.nom);      // Podem accedir directament a la variable, ja que és publica. NO RECOMENABLE.
        //System.out.println(bobby.raça);   // No podem accedir directament a la variable, ja que és private. CORRECTE!
        System.out.println(bobby.getRaça()); // Per accedir-hi, s'ha de fer servir el mètode getter. CORRECTE!

        // Podem cridar els mètodes de l'objecte bobby.
        System.out.println();
        bobby.ferGuau();
    }
}

