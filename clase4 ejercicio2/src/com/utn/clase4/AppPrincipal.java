package com.utn.clase4;

import java.util.Scanner;

public class AppPrincipal {

	public static void main(String[] args) {
		int numeroIngresado = 0, positivos = 0, negativos = 0, neutros = 0;
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < 6; i++) {
			System.out.println("ingrese el numero " + (i + 1));
			numeroIngresado = teclado.nextInt();
			//evaluamos si el numero ingresado es + , - , 0
			if (numeroIngresado > 0)
				positivos++;
			else if (numeroIngresado < 0)
				negativos++;
			else
				neutros++;
		}		
		System.out.println("positivos = " + positivos);
		System.out.println("negativos = " + negativos);
		System.out.println("neutros = " + neutros);

	}

}
