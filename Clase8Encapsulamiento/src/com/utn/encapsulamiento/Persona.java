package com.utn.encapsulamiento;

public class Persona {
	// atributos encapsulados
	// modificadores de visibilidad (private)
	private String nombre;
	private String apellido;
	private int edad;
	private long dni;

	public Persona() {

	}

	public Persona(String nombre, String apellido, int edad, long dni) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
	}

	// Getters: obtener un valor de un atributo ,siempre es funcion
	// Setters : setear un nuevo estado a un atributo PRIVADO ,simepre es
	// procedimiento
	public int getEdad() {
		return edad;
	}

	// set
	public void setEdad(int edad) {
		if (edad >= 1)
			this.edad = edad;
		else
			System.out.println("edad invalidad");
	}

	// alt + shift +s ->generate getters and setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni + "]";
	}

}
