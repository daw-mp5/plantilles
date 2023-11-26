package sole.aleix.plantilles.gos;

// Declaració de la classe
public class Gos {
    // Crear les variables de dins la classe. Per defecte, són privades.
    public String nom = "nom_exemple";  // No és recomanable utilitzar variables públiques en les classes, ja que es poden modificar des de fora de la classe.
    String raça = "raça_exemple";       // Per això, s'ha de declarar com a private i utilitzar els mètodes "getters" i "setters" per accedir a les variables.
    int edat = 0;
    String color = "color_exemple";     // Es poden donar valors per defecte a les variables, però no és obligatori.
 
    // Constructor per declarar la Class - D'aquesta manera es pot definir l'ordre dels paràmetres quan es crea l'objecte.
    public Gos(String nom, String raça, int edat, String color)
    {
        this.nom = nom;
        this.raça = raça;
        this.edat = edat;
        this.color = color;
    }
 
    // Constructor per declarar la Class amb els valors per defecte.
    public Gos() {
    }

    // Definir mètodes "getters" - Permeten obtenir els valors de les variables des de l'exterior.
    public String getNom() { return nom; }
    public String getRaça() { return raça; }
    public int getEdat() { return edat; }
    public String getColor() { return color; }
 
    // Definir mètodes "setters" - Permeten modificar els valors de les variables des de l'exterior.
    public void setNom(String nom) { this.nom = nom; }
    public void setRaça(String raça) { this.raça = raça; }
    public void setColor(String color) { this.color = color; }

    // Mètode per comprovar que l'edat no sigui superior a 50
    public void setEdat(int edat) { 
        if (edat > 50) {
            System.out.println("No pot ser que tinguis més de 50 anys");
        } else {
            this.edat = edat;
        }
    }

    // Creació de mètodes personalitzats. 
    //Mètode per fer que el gos faci "guau"
    public void ferGuau() {
        System.out.println("Guau!");
    }

    // Utilitzant el @Override, es poden sobreescriure els mètodes de la classe "Object" per a que retornin el que nosaltres vulguem.
    @Override public String toString()
    {
        return ("Hola! el meu nom és " + this.getNom()
                + ".\nLa meva raça, edat i color són "
                + this.getRaça() + "," + this.getEdat()
                + "," + this.getColor());
    }

    // No és necessari crear un mètode main() per a cada classe.

}