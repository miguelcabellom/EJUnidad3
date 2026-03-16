package colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random aleatorio = new Random();
		
		// Realiza un programa que introduzca valores aleatorios (entre 0 y 100) 
		// en un ArrayList y que luego calcule la suma, la media, el máximo y 
		// el mínimo de esos números. El tamaño de la lista también será aleatorio y 
		// podrá oscilar entre 5 y 10 elementos ambos inclusive.
		
		int tamano = aleatorio.nextInt(5,11);
		
		List<Integer> enteros = new ArrayList<>();
		
		int suma = 0, media, maximo = 0, minimo = 0;
		
		for (int i = 0; i <= tamano; i++) {
			int num = aleatorio.nextInt(0,100);
			enteros.add(num);
			suma += num;
			maximo = num > maximo ? num : maximo;
			if (i == 0) minimo = num;
			minimo = num < minimo ? num : minimo;
		}
		
		media = suma / tamano;
		
		System.out.println(enteros);
		System.out.println("Suma = "+suma+" | Media = "+media+" | Maximo = "+maximo+" | Minimo = "+minimo);

		sc.close();
	}

}
