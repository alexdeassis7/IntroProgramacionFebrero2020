package com.utn.clase7;

import java.util.Scanner;
import com.utn.modelos.*;

public class AppPrincipal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		// instanciamos los objetos
		Futbolista f1 = new Futbolista();
		Masajista m1 = new Masajista();
		Entrenador e1 = new Entrenador();
		
		System.out.println(f1.toString());
		System.out.println(m1.toString());
		System.out.println(e1.toString());
		System.out.println("********************* POST EDIT ATRIBUTTE ******************");
		// modificamos todos los estados de cada atributo
		
		// f1 cargado por teclado 
//		System.out.println("ingrese el nombre del futbolista");
//		f1.nombre = teclado.nextLine();
//		
//		System.out.println("ingrese el apellido del futbolista");
//		f1.apellido = teclado.nextLine();
//		
//		System.out.println("ingrese la edad del futbolista");
//		f1.edad = teclado.nextInt();
//		
//		System.out.println("ingrese el dorsal del futbolista");
//		f1.dorsal = teclado.nextInt();
//		
//		System.out.println("ingrese la demarcacion del futbolista");
//		f1.demarcacion = teclado.nextLine();
//		
//		System.out.println("ingrese el id del futbolista");
//		f1.id = teclado.nextInt();
//		
		// m1
		m1.apellido = "Guzman";
		m1.edad = 38;
		m1.nombre = "Martin";
		m1.id = 5599;
		m1.titulacion = "Licenciado en Fisioterapia deportiva";
		m1.aniosExperiencia = 5;
		m1.hsTurnos[14] = true;
		m1.hsTurnos[13] = true;
		m1.hsTurnos[12] = true;
		// e1
		e1.apellido = "Torres";
		e1.edad = 55;
		e1.nombre = "Jose";
		e1.id = 4897;
		e1.idFederacion = "02 Federacion espaniola de futbol";
		// MOSTRAMOS EL ESTADO DE CADA UNA DE LAS INSTANCIAS

		System.out.println(f1.toString());
		System.out.println(m1.toString());
		System.out.println(e1.toString());

	}

}
