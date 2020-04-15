package com.utn.microondas.programaprincipal;

import java.util.Scanner;

import com.utn.microondas.DobleQuesoJamon;
import com.utn.microondas.GrandeMuzza;
import com.utn.microondas.Vegetariana;

public class Microondas {

	public static void main(String[] args) {

		char crearNewOrden = 'y';
		int opcion = 0;
		int tiempoMicro = 0;
		int cantPizzaMuzza = 0;
		int cantPizzaDobleQJ = 0;
		int cantPizzaVegetariana = 0;
		int cantMuzza = 0;
		int cantTomate = 0;
		int cantProvo = 0;
		int cantJamon = 0;
		int cantAcelga = 0;
		int cantSalsa = 0;
		int cantQueso = 0;

		Scanner s1 = new Scanner(System.in);
		System.out.println("Desea hacer ordenar una nueva pizza? (y/n)");
		crearNewOrden = s1.next().charAt(0);

		while (crearNewOrden == 'y' || crearNewOrden == 'Y') {

			System.out.println("");
			System.out.println("Seleccione la opción deseada:");
			System.out.println("1. Grande de Muzza");
			System.out.println("2. Doble Queso con Jamón");
			System.out.println("3. Vegetariana");
			System.out.println("************************");
			System.out.println("4. Finalizar pedido");
			opcion = s1.nextInt();

			switch (opcion) {
			case 1:
				GrandeMuzza muzza1 = new GrandeMuzza();
				tiempoMicro += muzza1.tiempo;
				cantMuzza += muzza1.mozzarella;
				cantTomate += muzza1.tomate;
				cantPizzaMuzza += 1;
				break;

			case 2:
				DobleQuesoJamon dqj1 = new DobleQuesoJamon();
				tiempoMicro += dqj1.tiempo;
				cantMuzza += dqj1.mozzarella;
				cantTomate += dqj1.tomate;
				cantProvo += dqj1.provolone;
				cantJamon += dqj1.jamon;
				cantPizzaDobleQJ += 1;
				break;

			case 3:
				Vegetariana veg1 = new Vegetariana();
				tiempoMicro += veg1.tiempo;
				cantMuzza += veg1.mozzarella;
				cantAcelga += veg1.acelga;
				cantSalsa += veg1.salsaBlanca;
				cantQueso += veg1.queso;
				cantPizzaVegetariana += 1;
				break;

			case 4:
				System.out.println("");
				System.out.println("Pedido finalizado");
				System.out.println("");
				crearNewOrden = 'n';
				break;

			default:
				System.out.println("No se reconoce esa opcion");
				System.out.println("Desea hacer ordenar una nueva pizza? (y/n)");
				crearNewOrden = s1.next().charAt(0);
				break;
			}

		}

		System.out.println("");
		System.out
				.println("Cantidad de Pizzas Cocinadas: " + (cantPizzaMuzza + cantPizzaDobleQJ + cantPizzaVegetariana));

		if (cantPizzaMuzza >= 1) {
			System.out
					.println("Grande de Muzza: " + cantPizzaMuzza + ((int) cantPizzaMuzza == 1 ? " pizza" : " pizzas"));
		}

		if (cantPizzaDobleQJ >= 1) {
			System.out.println(
					"Doble Queso Jamon: " + cantPizzaDobleQJ + ((int) cantPizzaDobleQJ == 1 ? " pizza" : " pizzas"));
		}

		if (cantPizzaVegetariana >= 1) {
			System.out.println(
					"Vegetariana: " + cantPizzaVegetariana + ((int) cantPizzaVegetariana == 1 ? " pizza" : " pizzas"));
		}

		System.out.println("Tiempo insumido: " + tiempoMicro + " minutos");
		System.out.println("********************************************");
		System.out.println(
				"Cantidad de Muzzarella utilizada: " + cantMuzza + ((int) cantMuzza == 1 ? " unidad" : " unidades"));
		System.out.println(
				"Cantidad de Tomate utilizado: " + cantTomate + ((int) cantTomate == 1 ? " unidad" : " unidades"));
		System.out.println(
				"Cantidad de Provolone utilizado: " + cantProvo + ((int) cantProvo == 1 ? " unidad" : " unidades"));
		System.out.println(
				"Cantidad de Jamón utilizado: " + cantJamon + ((int) cantJamon == 1 ? " unidad" : " unidades"));
		System.out.println(
				"Cantidad de Acelga utilizado: " + cantAcelga + ((int) cantAcelga == 1 ? " unidad" : " unidades"));
		System.out.println(
				"Cantidad de Salsa Blanca utilizado: " + cantSalsa + ((int) cantSalsa == 1 ? " unidad" : " unidades"));
		System.out.println("Cantidad de Queso Rayado: " + cantQueso + ((int) cantQueso == 1 ? " unidad" : " unidades"));
		System.out.println("");
		System.out.println("Gracias por su orden!!!");

	}

}
