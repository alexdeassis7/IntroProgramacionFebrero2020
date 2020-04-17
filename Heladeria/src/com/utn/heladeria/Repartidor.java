package com.utn.heladeria;

public class Repartidor {
	public int id;
	public String nombre;
	public String apellido;
	public boolean ocu;
	public int logro;

	public void preparar() {

		logro++;
		ocu = true;
		System.out.println("Preparando el pedido");
		System.out.println("********************");
		System.out.println("El pedido ha sido entregado");
		ocu = false;

	}

	@Override
	public String toString() {
		return "Repartidor [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", logro=" + logro + "]";
	}

}
