package com.utn;

import java.util.Scanner;

public class Clase5Arrays {
	public static void main(String[] args) {
		/**
		 * la forma general de declarar un arreglo unidencional es : tipo nombreArray[]
		 * ; o tipo [] nombreArray ; por ejemplo :
		 */
		int miArray[]; // declarando un array
		miArray = new int[20]; // asignando memoria o instanciando el array

		/** ejemplo 2 > */
		int[] miArrayDos = new int[10];

		/** ejemplo 3 > Array Literal */
		int[] miArrayTres = new int[11] ;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("tamanio del array  :" + miArrayTres.length);

//		System.out.println("cuantos datos ingresara ??");
//		int cantidadDeDatos = teclado.nextInt();
//		int[] miArrayDinamico = new int[cantidadDeDatos];
//		
		/** mostramos por consola todos los elemento del array 3 */
		for (int i = 0; i < miArrayTres.length ; i++) {
			//int j = miArrayTres[i];
			//System.out.println("miArrayTres [" + i + "] = " + j);
			System.out.println("miArrayTres [" + i + "] = " + miArrayTres[i]);		
		}		
		
		/**Cargamos un array de elementos enteros */
		for (int i = 0; i < miArrayTres.length; i++) {
			System.out.println("ingrese el valor para miArrayTres [ " + i + " ]");
			//Guardamos el dato ingresado por teclado en un indice del Array
			miArrayTres[i] = teclado.nextInt();
		}
		
		/** mostramos nuevamente por consola todos los elemento del array 3 */
		for (int i = 0; i < miArrayTres.length ; i++) {		
			System.out.println("miArrayTres [" + i + "] = " + miArrayTres[i]);		
		}		
		
				
			
		
		
		

	}
}







