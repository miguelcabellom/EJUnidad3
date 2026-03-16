package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random aleatorio = new Random();
		
		// Realiza un programa que genere 30 números enteros aleatorios, 
		// con valores comprendidos entre 1 y 10. Se deben almacenar en una colección 
		// de forma ordenada. Pinta la colección por consola una vez rellena.
		
		List<Integer> enteros = new ArrayList<>();
		
		for (int i = 0; i < 30; i++) {
			int num = aleatorio.nextInt(1,10);
			enteros.add(num);
		}
		
		Collections.sort(enteros);	
		
		System.out.println(enteros);
		
		sc.close();
	}

}
