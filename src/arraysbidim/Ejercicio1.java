package arraysbidim;

public class Ejercicio1 {

	public static void main(String[] args) {
		int[][] enteros = new int[3][6];
		
		enteros[0][0] = 0;
		enteros[0][1] = 30;
		enteros[0][2] = 2;
		enteros[0][5] = 5;
		enteros[1][0] = 75;
		enteros[1][4] = 0;
		enteros[2][2] = -2;
		enteros[2][3] = 9;
		enteros[2][5] = 11;
		
		for (int i = 0; i < enteros.length; i++) {
			for (int j = 0; j < enteros[0].length; j++) {
				System.out.print(enteros[i][j] + "\t");
			}
			System.out.println();
		}
		
		

	}

}
