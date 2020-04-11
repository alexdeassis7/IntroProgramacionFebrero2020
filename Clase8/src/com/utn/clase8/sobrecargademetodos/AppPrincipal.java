package com.utn.clase8.sobrecargademetodos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AppPrincipal {

	public static void main(String[] args) {

		Fecha mifecha = new Fecha(15, 5, 1999);

		System.out.println(mifecha.toString());

		// instanciamos un Objeto de la clase Fecha
		// mediante el metodo constructor Vacio
		// heredado de clase object
//		Fecha f1 = new Fecha();
//		
//		//utilizamos el constructo 1
//		Fecha f8 = new Fecha(25, 07, 1995);
//		System.out.println(f1.toString());
//		
//		//utilizamos el constructor 2 
//		Fecha f7 =  new Fecha(5, 1998);
//		System.out.println(f7.toString());		
//		
//		
//		// invocamos al metodo 1 asignarFecha();
//		f1.asignarFecha();
//
//		System.out.println("f1 :" + f1.toString());
//
//		Fecha f2 = new Fecha();
//
//		Scanner teclado = new Scanner(System.in);
//		System.out.println("ingrese el dia : ");
//		int diaIngresado = teclado.nextInt();
//		f2.asignarFecha(diaIngresado);
//
//		System.out.println("f2 :" + f2.toString());
//		
//		f2.asignarFecha(26,8);
//		System.out.println("f2 :" + f2.toString());
//		
//		f2.asignarFecha(20, 7, 1992);
//		System.out.println("f2 :" + f2.toString());
//		
//		Fecha f3 = new Fecha();
//		f3.asignarFecha(23);
//		System.out.println(f3.toString());
//
//		String nombre = JOptionPane.showInputDialog("ingrese su nombre");
//		JOptionPane.showMessageDialog(null, "el nombre ingresado es "+nombre);

	}
}
