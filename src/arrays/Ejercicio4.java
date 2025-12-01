package arrays ;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[12];
		
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;
	
		System.out.println(Arrays.toString(num));
		
		// Lo que pasa con los valores sin inicializar es que se les añade 0 porque no pueden estar vacios
		
		sc.close();
	}
}