package com.utn.clase3;

import java.util.Scanner;

public class AppPrinicipal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float antiguedad = 0, salarioMensual = 0, utilidad = 0;

		System.out.println("ingrese su antiguedad");
		antiguedad = teclado.nextFloat();

		System.out.println("ingrese su salario ");
		salarioMensual = teclado.nextFloat();

		if (antiguedad < 1) {
			utilidad = salarioMensual * 0.05f;
		} else if (antiguedad >= 1 && antiguedad < 2) {
			utilidad = salarioMensual * 0.07f;
		} else if (antiguedad >= 2 && antiguedad < 5) {
			utilidad = salarioMensual * 0.1f;
		} else if (antiguedad >= 5 && antiguedad < 10) {
			utilidad = salarioMensual * 0.15f;
		} else {
			utilidad = salarioMensual * 0.2f;
		}
System.out.println("su bono anual sera de :"+utilidad);
	}

}
