package colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Crear una lista de números enteros positivos introducidos por consola 
		// hasta que se introduzca uno negativo. A continuación, recorrer la lista y 
		// mostrar por pantalla los índices de los elementos de valor par.
		
		List<Integer> enteros = new ArrayList<>();
		List<Integer> indexPares = new ArrayList<>();
		
		do {
			System.out.println("Introduce entero");
			enteros.add(sc.nextInt());
		} while (enteros.get(enteros.size()-1) >= 0);
		
		for (int i = 0; i <= enteros.size()-1; i++) {
			if (enteros.get(i) % 2 == 0) {
				indexPares.add(i);
			}
		}
		
		System.out.println(enteros);
		System.out.println(indexPares);

		sc.close();
	}

}
