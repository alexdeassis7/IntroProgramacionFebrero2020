package com.utn.heladeria;

import java.util.Scanner;

public class AppPrincipal {

	public static void main(String[] args) {

		Caja c1 = new Caja(5);
		Caja c2 = new Caja(10);
		Caja c3 = new Caja(15);

		Pedido p[] = new Pedido[3];
		for (int i = 0; i < p.length; i++) {
			p[i] = new Pedido();
		}

		c1.id = 1;
		c2.id = 2;
		c3.id = 3;

		System.out.println("Ingrese la cantidad de despachantes del dia");
		Scanner teclado = new Scanner(System.in);
		int cantidadDesp = teclado.nextInt();

		// creamos un array con la cantidad de despachantes
		Repartidor r[] = new Repartidor[cantidadDesp];

		for (int i = 0; i < cantidadDesp; i++) {
			r[i] = new Repartidor();// necesitas instanciar cada objeto de todos los sub indices del array

			System.out.println("Ingrese id del despachante " + (1 + i));
			r[i].id = teclado.nextInt();

			System.out.println("Ingrese nombre del despachante " + (1 + i));
			r[i].nombre = teclado.next();

			System.out.println("Ingrese apellido del despachante " + (1 + i));
			r[i].apellido = teclado.next();

		}

		for (int i = 0; i < cantidadDesp; i++) {
			System.out.println(r[i].nombre);
		}

		boolean continuar = true;
		boolean otro = true;

		System.out.println("Bienvenido");

		do {

			System.out.println("Seleccione una caja, por favor. \n 1=caja 1 \n 2=caja 2 \n 3=caja 3");

			int opcion = teclado.nextInt();
			switch (opcion) {
			case 1:
				c1.seleccion();
				break;
			case 2:
				c2.seleccion();
				break;
			case 3:
				c3.seleccion();
				break;
			default:
				System.out.println("Usted no ha ingresado una opción válida");
				break;
			}
			// *********************************************************************

			System.out.println("Desea realizar un pedido? si (1)/ no (2)");
			int realizarPedido = teclado.nextInt();
			if (realizarPedido == 1) {
				System.out.println("Elija la caja, del 1 al 3");
				int e = teclado.nextInt();
				if (e - 1 >= 0 && e - 1 < p.length) {

					do {

						System.out.println("desea un cono (1), un vaso (2) o un pote (3)?");
						int tipo = teclado.nextInt();
						p[e - 1].recipiente(tipo);

						if (tipo == 2) {
							System.out.println("Puede agregar un adicional de vainilla (1), chocolate (2)");
							int opcion1 = teclado.nextInt();
							p[e - 1].adicional(opcion1);
						} else if (tipo == 3) {
							System.out.println(
									"Puede agregar un adicional de vainilla (1), chocolate (2) o almendras (3)");
							int opcion1 = teclado.nextInt();
							p[e - 1].adicional(opcion1);
						}

						System.out.println("Desea agregar otro helado a su pedido: sí (1) o no (2)?");
						int sig = teclado.nextInt();
						if (sig != 1) {
							otro = false;
						}

					} while (otro == true);

					System.out.println("Usted ha realizado el pedido exitosamente. A continuación el detalle: \n"
							+ p[e - 1].toString());
					otro = true;
					if (p[e - 1].sabores > 0) {
						System.out.println(
								"Por favor, asigne a un repartidor para completar la operación. Seleccione un número del 1 al "
										+ cantidadDesp);
						int j = teclado.nextInt();
						if (j - 1 >= 0 && j - 1 < cantidadDesp) {
							r[j - 1].preparar();
						}

					}
				}
			}

			// *********************************************************************

			// *********************************************************************

			System.out.println("Desea realizar otra operción? \n opcion 1=si / opción 2 =no");
			int fin = teclado.nextInt();
			if (fin == 2) {
				continuar = false;
			}

		} while (continuar == true);

		continuar = true;
		teclado.close();

		System.out.println("Presentando resultados laborales de los repartidores");

		for (int i = 0; i < r.length; i++) {
			System.out.println(r[i].toString());
		}

		System.out.println("Hasta mañana");

	}

}
