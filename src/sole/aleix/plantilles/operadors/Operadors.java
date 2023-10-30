package sole.aleix.plantilles.operadors;

public class Operadors {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// Operadores
		
		// SEMPRE posar espais entre operadors i operands!
		
		// Exemple:
		
		int a = 2+4;   // MALAMENT
		int b = 2 + 4; // BÉ
		
		// Encara que coneguem la precedència dels operadors, 
		// cal col·locar parèntesis per millorar la claredat del codi.
		
		int c = 2 + 3 * 4;	 // MAL
		int d = 2 + (3 * 4); // BIEN
		
		// El mòdul
		
		int resto = 21 % 2;
		
		System.out.println("resto: " + resto);
		
		// Un altre cas de males pràctiques
		
		int e = 100;
		
		e = e + 1; // Escriptura poc clara.
		
		e++; 		// Altra opció
		
		++e; 		// Altra opció
		
		System.out.println("e: " + e);
		System.out.println("e: " + e++);
		System.out.println("e ha quedat en " + e);
		
		e += 66; // Altra opció
		
		System.out.println("e final: " + e);
		
		// También existe el *= y /=
		
	}
}