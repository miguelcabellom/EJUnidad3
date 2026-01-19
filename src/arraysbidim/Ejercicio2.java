package arraysbidim;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[][] notas = new double[4][8];
		
		int minima = 5;
		int maxima = 6;
		int media = 7;
		
		for (int alumno = 0; alumno < notas.length; alumno++) {
			double sumaNotas = 0;
			for (int asignatura = 0; asignatura < 5; asignatura++) {
				System.out.println("Introduce la nota del alumno " + (alumno+1) + " en la asignatura " + (asignatura+1));
				double notaActual = sc.nextDouble();
				notas[alumno][asignatura] = notaActual;
				sumaNotas += notaActual;
				if (alumno == 0) {
					notas[alumno][minima] = notaActual;
				}
				if (notaActual > notas[alumno][maxima]) {
					notas[alumno][maxima] = notaActual;
				} else if (notaActual < notas[alumno][minima]) {
					notas[alumno][minima] = notaActual;
				}
			}
			notas[alumno][media] = sumaNotas/5;
		}
		
		System.out.println("=====================================");
		System.out.println("Alumno \t \t Min \t Max \t Media");
		for (int alumno = 0; alumno < notas.length; alumno++) {
			System.out.println("Alumno "+(alumno+1)+"\t "+notas[alumno][minima]+"\t "+notas[alumno][maxima]+"\t "+notas[alumno][media]);
		}
		
		sc.close();
	}

}
