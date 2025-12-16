package funciones;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Random aleatorio = new Random();
		
		int[] tablaEnteros = new int[10];
		int numConsec;
		
		for (int i = 0; i < tablaEnteros.length; i++) {
			tablaEnteros[i] = aleatorio.nextInt(1, 11);
		}
		
		System.out.println("Introduce la cantidad de numeros que quieres que se sumen consecutivamente: ");
		numConsec = sc.nextInt();
		
		System.out.println("Tabla con los enteros: " + Arrays.toString(tablaEnteros));
		System.out.println("Tabla con los numeros sumados consecutivamente: " + Arrays.toString(suma(tablaEnteros, numConsec)));
		
		
		sc.close();
	}
	
	public static int[] suma(int t[], int numElementos) {
		
		int[] sumaConsec = new int[t.length - numElementos + 1];
		
		for (int i = 0; i < sumaConsec.length; i++) {
			int suma = 0;
			for (int j = 0; j < numElementos; j++) {
				suma += t[i+j];
			}
			sumaConsec[i] = suma;
		}
		
		return sumaConsec;
	}

}
