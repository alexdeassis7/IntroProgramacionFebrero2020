package com.utn.ejercicio2;

import java.util.Scanner;

public class AppPrincipal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// defino las variables
		float numHombres = 0, numMujeres = 0, totalAlumnos = 0;
		float porcentajeH = 0, porcentajeM = 0;
		// solicitamos datos al usuario
		System.out.println("ingrese cantidad de Hombres");
		numHombres = teclado.nextFloat();
		System.out.println("ingrese cantidad de Mujeres");
		numMujeres = teclado.nextFloat();
		// procesamos la info ingresada por el user
		totalAlumnos = numHombres + numMujeres;
		porcentajeH = numHombres * 100 / totalAlumnos;
		porcentajeM = numMujeres * 100 / totalAlumnos;
		System.out.printf("el porcentaje de Mujeres es : \n");
		System.out.printf("%.1f", porcentajeH);

		System.out.println("el porcentaje de Hombres es : " + porcentajeH + " %");

	}

}
