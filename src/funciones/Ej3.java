package funciones;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int longitud;
		int fin;
		
		System.out.println("Introduce longitud de la tabla: ");
		longitud = sc.nextInt();
		System.out.println("Introduce numero final del rango: ");
		fin = sc.nextInt();
		
		System.out.println(Arrays.toString(rellenaPares(longitud, fin)));
		
		
		sc.close();
	}
	
	public static  int[] rellenaPares(int longitud, int fin) {
		Random aleatorio = new Random();
		
		int[] tablaPares = new int[longitud];
		
		for (int i = 0; i < tablaPares.length; i++) {
			do {
				tablaPares[i] = aleatorio.nextInt(1, fin+1);
			} while (tablaPares[i]%2 != 0);
		}
		
		return tablaPares;
	}

}
