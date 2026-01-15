package arraysbidim;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tamaño de fila: ");
		int maximoFila = sc.nextInt();
		System.out.println("Introduce tamaño de columna: ");
		int maximoColumna = sc.nextInt();
		
		int[][] enteros = new int[maximoFila][maximoColumna];
		
		for (int fila = 0; fila < maximoFila; fila++) {
			for (int columna = 0; columna < maximoColumna; columna++) {
				enteros[fila][columna] = 10*fila+columna;
				System.out.print(enteros[fila][columna]+ " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
