package com.utn.clase5;

import java.util.Scanner;

//Ejercicio 6 for 
public class AppPrincipal {
	public static void main(String[] args) {
		final int CONTADOR = 6;
		float suma = 0, calificacion = 0, baja = 999 ;
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < CONTADOR; i++) {
			System.out.println("ingrese la calificacion " + (i + 1));
			calificacion = teclado.nextInt();

			// acumulamos todas las notas en la variable suma
			suma += calificacion;

			// buscamos la nota mas baja del conjunto
			if (calificacion < baja) {
				baja = calificacion;
			}
		}
		System.out.println(" la calificacion mas baja fue " + baja);
		System.out.println("el promedio fue de  " + (suma / CONTADOR));

	}

}
