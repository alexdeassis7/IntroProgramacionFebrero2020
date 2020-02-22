package com.utn.clase2ejecicio;

import java.util.Scanner;

public class AppPrincipal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		float montoADepocitar = 0;
		float capitalMasInteres = 0;

		System.out.println("ingrese el monto que desea depocitar ");
		montoADepocitar = teclado.nextFloat();
		capitalMasInteres = montoADepocitar * 1.02f;

		System.out.println("el dinero que se llevara es  " + capitalMasInteres);

	}

}
