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
	@Override
	public String toString() {
		return "Masajista [id=" + id + ", edad=" + edad + ", aniosExperiencia=" + aniosExperiencia + ", hsTurnos="
				+ Arrays.toString(hsTurnos) + ", nombre=" + nombre + ", apellido=" + apellido + ", titulacion="
				+ titulacion + "]";
	}


	
	
}
