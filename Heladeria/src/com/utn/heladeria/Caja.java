package com.utn.heladeria;

public class Caja {
	public int id;
	public int cont;
	public int tot;
	public boolean lim;
	public boolean uso;

	public Caja(int tot) {
		this.tot = tot;
	}

	public void seleccion() {

		if (cont < tot) {
			cont++;
			uso = true;
			System.out.println("Usted ha seleccionado la caja " + id + ".");

		} else {
			lim = true;
			System.out.println("La caja " + id + " ha llegado a su límite.\n Por favor, pruebe con otra distinta.  ");
		}
		;

	}

}
