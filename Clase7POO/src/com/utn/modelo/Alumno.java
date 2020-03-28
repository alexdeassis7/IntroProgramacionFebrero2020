package com.utn.modelo;

public class Alumno {
	//cuerpo de la clase
	//Atributo de la clase Alumno : definen las caracteristicas de la clase
	public String nombre ;
	public String apellido;
	public int edad ;

	//Metodos : funciones o procedimientos
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	
	public void estudiar(String materia) {
		System.out.println("soy " + nombre + " y estoy estudiando " + materia ); 
	}
	
	public void caminar() {
		System.out.println("soy " + nombre + " " + apellido + " y estoy caminando al colegio " );
	}
	
	public void rendirExamen (String tipoExamen , String materia) {  // Variables automaticas 
		System.out.println("estoy rindiendo el examen de " + materia + " de forma " + tipoExamen);
	}
	
	public void realizarTP(String materia) {
		System.out.println("estoy realizando el tp de " + materia );
	}

	
	
}
