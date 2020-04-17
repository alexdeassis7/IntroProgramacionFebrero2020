package com.utn.heladeria;

public class Pedido {
	public int sabores = 0, cono = 0, vaso = 0, pote = 0, chocolate = 0, opcional = 0, vainilla = 0, almendras = 0;

	public void adicional(int opcion) {
		switch (opcion) {
		case 1:
			vainilla += 1;
			break;

		case 2:
			chocolate += 1;
			break;

		case 3:
			if (almendras <= pote) {
				almendras += 1;
			} else {
				System.out.println("Superó el limite de almendras");
			}
			break;
		default:
			System.out.println("la opción ingresada no es válida");
			break;
		}
	}

	public void recipiente(int tipo) {
		switch (tipo) {
		case 1:
			cono += 1;
			sabores += 2;
			break;

		case 2:
			vaso += 1;
			sabores += 3;
			opcional += 1;
			break;

		case 3:
			pote += 1;
			sabores += 4;
			opcional += 1;
			break;
		default:
			System.out.println("la opción ingresada no es válida");
			break;

		}
	}

	public String toString() {
		return "Pedido [sabores=" + sabores + ", cono=" + cono + ", vaso=" + vaso + ", pote=" + pote + ", chocolate="
				+ chocolate + ", vainilla=" + vainilla + ", almendras=" + almendras + "]";
	}

}
