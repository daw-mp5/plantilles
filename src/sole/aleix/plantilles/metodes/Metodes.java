package sole.aleix.plantilles.metodes;

public class Metodes {

    // Aquest mètode no retorna res, per tant és void. Tampoc té cap paràmetre.
    // Només escriu un missatge per pantalla.
    public static void imprimeixHola() {
        System.out.println("Hola!");
    }

    // Aquest mètode no retorna res, però accepta un paràmetre de tipus String.
    // Escriu el missatge que li passem com a paràmetre per pantalla.
    public static void imprimeixMissatge(String missatge) {
        System.out.println(missatge);
    }

    // Aquest mètode retorna un enter, però no accepta cap paràmetre.
    // Retorna el valor 42.
    public static int retornaQuarantaDos() {
        return 42;
    }

    // Aquest mètode retorna un enter, i accepta dos paràmetres de tipus int.
    // Retorna la suma dels dos paràmetres.
    public static int retornaSuma(int a, int b) {
        return a + b;
    }


    // main
    public static void main(String[] args) {
        
        // Cridem al mètode imprimeixHola().
        imprimeixHola();

        // Cridem al mètode imprimeixMissatge() i li passem un String com a paràmetre.
        imprimeixMissatge("Aquest és el missatge que li passem com a paràmetre.");

        // Cridem al mètode retornaQuarantaDos() i guardem el valor que retorna en una variable.
        int valor = retornaQuarantaDos();
        System.out.println(valor);

        // Cridem al mètode retornaSuma() i li passem dos enters com a paràmetres.
        // Guardem el valor que retorna en una variable.
        int suma = retornaSuma(3, 5);
        System.out.println(suma);
    }
}

