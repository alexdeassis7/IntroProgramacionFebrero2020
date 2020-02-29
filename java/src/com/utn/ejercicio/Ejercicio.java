package com.utn.ejercicio;


	import java.util.Scanner;

	public class Ejercicio {

	public static void main(String[] args) {

	           Scanner sc = new Scanner(System.in);
	          // definos la variables a utilizar

	           int num, hor, min, seg;

	         // solicitamos el dato al usuario
	           System.out.println("ingrese los segundos ");

	         // capturamos le dato ingresado por teclado
	          num = sc.nextInt();

	             // procesamos el dato ingresado y calculamos horas minutos y segundos
	           
	            min = (num ) / 60;
	            seg = num -  (min * 60);

	            // mostramos resultado por pantalla
	           System.out.println( + min + "m " + seg + "s");

	      }
	}

