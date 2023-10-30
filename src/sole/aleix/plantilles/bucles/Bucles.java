package sole.aleix.plantilles.bucles;

public class Bucles {
    public static void main(String[] args) {
        
        System.out.println("Exemple de bucle while");
        int x = 0;
        while (x < 5) {
            System.out.println("Valor de x: " + x);
            x++;
        }
        System.out.println("");

        System.out.println("Exemple de bucle for");
        for (int i = 0; i < 5; i++) {
            System.out.println("Valor de i: " + i);
        }
        System.out.println("");

        System.out.println("Exemple de bucle do-while");
        int y = 0;
        do {
            System.out.println("Valor de y: " + y);
            y++;
        } while (y < 5);
        System.out.println("");

        System.out.println("Exemple de bucle for amb String");
        String text = "Hola";
        for (int j = 0; j < text.length(); j++) {
            System.out.println("Caràcter: " + text.charAt(j));
        }
        System.out.println("");

        System.out.println("Exemple de bucle for amb llista de lletres");
        char[] lletres = {'a', 'e', 'i', 'o', 'u'};
        for (char lletra : lletres) {
            System.out.println("Lletra: " + lletra);
        }




        
        }
    }
