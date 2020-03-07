package com.utn.clase4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AppPrincipal {

	public static void main(String[] args) {
		// definimos las variables de trabajo
		float calificacion = 0, promedio = 0, suma = 0;
		Scanner teclado = new Scanner(System.in);

		for (int cantNotas = 0; cantNotas < 7; cantNotas++) {

			System.out.println("Ingrese la calificacion " + (cantNotas + 1));
			calificacion = teclado.nextFloat();
			suma += calificacion;

		}
		DecimalFormat formato1 = new DecimalFormat("#.00");
		// calculamos el promedio
		promedio = suma / 7;
		System.out.println("el promedio es " +formato1.format(promedio));
		System.out.println("el promedio es " + promedio);
		
		System.out.printf("el promedio es %.2f" , promedio);
	}

}
