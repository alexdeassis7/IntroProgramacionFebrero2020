package com.utn.ejercicio1array;

import java.util.Scanner;

public class AppPrincipal {
//	Calcular el promedio de 10 valores almacenados en un Vector. Determinar además cuantos son
//	mayores que el promedio, imprimir el promedio, el número de datos mayores que el promedio
//	y una lista de valores mayores que el promedio .

	public static void main(String[] args) {		
		/*definimos las variables de trabajo*/
		float sumatoria = 0 , promedio = 0;
		float[] notas = new float[10];
		int mayores = 0 ;
		Scanner teclado = new Scanner(System.in);
		
		/**solicitamos al usuario ingrese las notas 
		 * y las guardamos en cada indice del array (notas)*/
		for (int i = 0; i < notas.length; i++) {		
			System.out.println("ingrese la nota " + (i+1));
			notas[i] = teclado.nextFloat();
			sumatoria += notas[i];			
		}	
		//Calculamos el promedio
		promedio = sumatoria / notas.length ;
		//contamos los valores mayores al promedio 
		for (int i = 0; i < notas.length; i++) {
			if(notas[i] > promedio) {
				mayores ++;
			}
		}
		
		float [] listaDeMayores = new float[mayores];
		int j = 0;
		System.out.println("PROMEDIO" +promedio);
		for (int i = 0; i < notas.length; i++) {
			
			if(notas[i] > promedio) {
				listaDeMayores[j] = notas[i];
				j ++;
			}
		}
		
		//mostramos los datos procesados
		System.out.println("Promedio : " + promedio);
		System.out.println("Cantidad Mayores al promedio :" + mayores);
		System.out.println("valores mayores son :");
		
		for (int i = 0; i < listaDeMayores.length; i++) {
			System.out.println(listaDeMayores[i]);
		}
		
		
		
		
		
		
		
		
		
		
	
	}
}
