package com.utn.clase3ejercicio2;

import java.util.Scanner;

public class AppPrincipal {
	public static void main(String[] args) {
		/*
		 * leer 2 numeros : si son iguales que los
		 *  multiplique , si el primero es mayor
		 * que el segundo que los reste y si no que 
		 * los sume
		 **/
		int num1 = 0, num2 = 0, resultado = 0;
		Scanner teclado = new Scanner(System.in);
		
		//solicitamos los datos a usuario
		System.out.println("ingrese numero 1");
		num1 = teclado.nextInt();
		
		System.out.println("ingrese numero 2");
		num2 = teclado.nextInt();
		//IF - ELSE anidados
		if( num1 == num2	) {
			
		System.out.println("mutiplicacion:"+(num1 * num2));
		
		}else if (num1 > num2) {
			resultado = num1 - num2;
			System.out.println("resta :" + resultado);
		}else {
			System.out.println("resultado suma:"+(num1 + num2));
		}
		
		
		
		
	}

}
