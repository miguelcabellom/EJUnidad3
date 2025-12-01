package arrays ;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random aleatorio = new Random();
		int enteros[] = new int[10];
		
		for (int i = 0; i <= 9; i++) {
			enteros[i] = aleatorio.nextInt(100);
		}
		
		System.out.println(Arrays.toString(enteros));
		
		sc.close();
	}
}