package com.utn.modelos;

import java.util.Arrays;

public class Masajista {
	
	public int id;
	public int edad;
	public int aniosExperiencia;
	public boolean hsTurnos[] = new boolean [24];
	public String nombre;
	public String apellido;
	public String titulacion;
	
	public void concentrarse() {
		System.out.println("soy " + nombre + apellido + " y estoy en la concentrancion haciendo masajes para que luego se juege el partido ");
	}
	
	public void viajar() {
		System.out.println("mi id es " + id + " y estoy de viaje a la temporada de verano en mar del plata .");
	}
	
	public void darMasaje (Futbolista f) {
		
		System.out.println("estoy dandole un masaje a " + f.nombre +" " +  f.apellido);
	
		
	}
	
	
	@Override
	public String toString() {
		return "Masajista [id=" + id + ", edad=" + edad + ", aniosExperiencia=" + aniosExperiencia + ", hsTurnos="
				+ Arrays.toString(hsTurnos) + ", nombre=" + nombre + ", apellido=" + apellido + ", titulacion="
				+ titulacion + "]";
	}


	
	
}
