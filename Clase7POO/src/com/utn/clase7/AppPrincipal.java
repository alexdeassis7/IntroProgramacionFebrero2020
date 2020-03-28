package com.utn.clase7;

import com.utn.modelo.Alumno;
public class AppPrincipal {

	public static void main(String[] args) {
		//punto de inicio de ejecucion de
		//nuestra app
		/**Intanciamos  3 objetos (a1 ,a2 ,a3 ) de la clase Alumno*/
		Alumno a1 = new  Alumno();
		Alumno a2 = new  Alumno();
		Alumno a3 = new  Alumno();
		
		System.out.println("*****Estado Inicial de los atributos del objeto a1*****");
		System.out.println(a1.toString());		
		System.out.println("*****Estado Inicial de los atributos del objeto a2*****");
		System.out.println(a2.toString());		
		System.out.println("*****Estado Inicial de los atributos del objeto a3*****");
		System.out.println(a3.toString());
		
		//modificamos el estado de los atributos
		a1.nombre = "Marina";
		a1.apellido = "Munilla";
		a1.edad = 23 ;
		
		a2.nombre = "Carlos";
		a2.apellido = "Giavedoni";
		a2.edad = 26 ;
		
		a3.nombre = "Ezequiel";
		a3.apellido = "Santana";
		a3.edad = 29 ;
			
		System.out.println("***** Estado post modificacion de los atributos del objeto a1 *****" );
		System.out.println(a1.toString());		
		System.out.println("***** Estado post modificacion de los atributos del objeto a2 *****" );
		System.out.println(a2.toString());		
		System.out.println("***** Estado post modificacion de los atributos del objeto a3 *****" );
		System.out.println(a3.toString());
		
		
		
	}

}
