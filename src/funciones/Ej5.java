package funciones;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Random aleatorio = new Random();
		
		int[] tablaEnteros = new int[10];
		int clave;
		
		for (int i = 0; i < tablaEnteros.length; i++) {
			tablaEnteros[i] = aleatorio.nextInt(1, 11);
		}
		
		System.out.println("Introduce el numero que quieres que busque: ");
		clave = sc.nextInt();
		
		System.out.println("El numero esta en las posiciones: " + Arrays.toString(buscarTodos(tablaEnteros, clave)));
		
		
		sc.close();
	}
	
	public static int[] buscarTodos(int t[], int valor) {
		int contador = 0;
		
		for (int i = 0; i < t.length; i++) {
			if (t[i] == valor) {
				contador++;
			}
		}
		
		int[] posiciones = new int[contador];
		
		int posicion = 0;
		for (int i = 0; i < t.length; i++) {
			if (t[i] == valor) {
				posiciones[posicion] = i;
				posicion++;
			}
		}
		
		return posiciones;
	}

}
