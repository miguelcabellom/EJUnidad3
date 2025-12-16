package funciones;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] tablaenteros = new int[5];
		
		for (int i = 0; i < tablaenteros.length; i++) {
			System.out.println("Introduce un entero");
			tablaenteros[i] = sc.nextInt();
		}
		
		System.out.println("La suma de los enteros es " + sumatabla(tablaenteros));
		
		sc.close();
	}
	
	public static int sumatabla(int[] tabla) {
		int suma = 0;
		
		for (int i = 0; i < tabla.length; i++) {
			suma += tabla[i];
		}
		
		return suma;
	}

}
