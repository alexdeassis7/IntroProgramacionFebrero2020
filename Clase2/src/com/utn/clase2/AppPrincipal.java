package com.utn.clase2;

import java.util.Scanner;

public class AppPrincipal {
	public static void main(String[] args) {
		// Creamos un Scanner para interactuar con el teclado!
		Scanner teclado = new Scanner(System.in);

		System.out.println("Hello Alex Welcome To App");
		// definimos en inicializamos las variables
		float numero1 = 0;
		float numero2 = 0;
		float resultado = 0;

		// solicitamos los datos al usuario
		System.out.println("Ingrese el numero uno");
		numero1 = teclado.nextFloat();
		System.out.println("Ingrese el numero dos");
		numero2 = teclado.nextFloat();

		// realizamos el procesamiento de lols datos ingresados
		resultado = numero1 + numero2;
		// mostramos el resultado por pantalla
		System.out.println("El resultado de la suma es : " + resultado);

	}

}
