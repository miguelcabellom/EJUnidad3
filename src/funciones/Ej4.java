package funciones;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] tablaEnteros = new int[10];
		int clave;
		
		for (int i = 0; i < tablaEnteros.length; i++) {
			System.out.println("Introduce entero " + i+1 + ": ");
			tablaEnteros[i] = sc.nextInt();
		}
		
		System.out.println("Introduce el numero que quieres que busque: ");
		clave = sc.nextInt();
		
		System.out.println("El numero esta en la posicion: " + buscar(tablaEnteros, clave));
		
		
		sc.close();
	}
	
	public static  int buscar(int t[], int clave) {
		int posicion = -1;
		for (int i = 0; i < t.length; i++) {
			if (t[i] == clave) {
				posicion = i;
			}
		}
		
		return posicion;
	}

}
