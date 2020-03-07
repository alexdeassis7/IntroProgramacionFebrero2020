package comutn.clase4;

import java.util.Scanner;

public class AppPrincipal {
	public static void main(String[] args) {

		int num_computadoras = 0;
		float precio = 0, total_a_pagar = 0;
		Scanner teclado = new Scanner(System.in);
//		boolean localAbierto = true;
		int opcionIngresada = 0;
		do {
			// solicitamos los datos al usuario
			System.out.println("ingrese el numero de computadoras");
			num_computadoras = teclado.nextInt();
			System.out.println("ingrese el precio unitario");
			precio = teclado.nextFloat();
			float total_compra = num_computadoras * precio;
			// validamos si compro mas de 3 computadoras
			if (num_computadoras >= 3) {
				// casteo : comversion de un tipo primitivo a otro tipo primitivo
				total_a_pagar = (float) (total_compra - total_compra * 0.20);
			} else {
				total_a_pagar = (float) (total_compra - total_compra * 0.10);
			}
			System.out.println("el total a pagar es :" + total_a_pagar);

			System.out.println("El local continua abierto ?? \n 1 = SI \n 0= NO");
			opcionIngresada = teclado.nextInt();
			
//			if (opcionIngresada == 1) {
//				localAbierto = true;
//			} else {
//				localAbierto = false;
//			}

//		} while (localAbierto == true);
			
		} while (opcionIngresada == 1);
		System.out.println("Bye bye , Vuelvas prontos al supermarket");

	}
}
