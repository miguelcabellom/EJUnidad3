package funciones;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] tablaenteros = new int[5];
		
		for (int i = 0; i < tablaenteros.length; i++) {
			System.out.println("Introduce un entero");
			tablaenteros[i] = sc.nextInt();
		}
		
		System.out.println("El entero mas alto en la tabla es " + maximo(tablaenteros));
		
		sc.close();
	}
	
	public static  int maximo(int t[]) {
		int max = t[0];
		
		for (int i = 1; i < t.length; i++) {
			if (t[i] > max) {
				max = t[i];
			}
		}
		
		return max;
	}

}
