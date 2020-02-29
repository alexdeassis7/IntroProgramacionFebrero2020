package com.utn.clase3;

import java.util.Scanner;

public class AppPrincipal {

	public static void main(String[] args) {
		/*
		 * determinar si un alumno aprueba o reprueba un curso de programacion ,sabiendo
		 * que aprobara ssi su promedio de tres calificaciones es mayor o igual a siete
		 * , caso contrario REPRUEBA
		 */
		/* Variables */
		float nota1 = 0, nota2 = 0, nota3 = 0;
		float promedio = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.println("ingrese nota 1");
		nota1 = teclado.nextFloat();

		System.out.println("ingrese nota 2");
		nota2 = teclado.nextFloat();

		System.out.println("ingrese nota 3");
		nota3 = teclado.nextFloat();

		promedio = (nota1 + nota2 + nota3) / 3;
		System.out.println("Promedio :" + promedio);
	
		if (promedio >= 7) {
			System.out.println("Alumno Aprobado");
		} else {
			System.out.println("Alumno Reprobado");
		}

	}

}
