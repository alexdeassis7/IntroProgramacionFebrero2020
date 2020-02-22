package com.educacionit.clase2;

public class Persona {
	// atributos Encapsulados de la clase persona
	private String nombre, apellido, estadoCivil;
	private int edad;
	private char sexo = 'M';
	private long dni = 0;
	private long cuit;
	private double saldoCuentaSueldo = 1000;
	// Metodo constructor 1 VACIO
	public Persona() {

	}
	//Constructor 2 Sobrecargado , que recibe 3 parametros
	// SObrecarga de metodo constructor
	public Persona(long DNI , String NOMBRE , String APELLIDO) {
		dni = DNI ;
		nombre = NOMBRE ;
		apellido = APELLIDO;
		
	}
	
	

	public double getSaldoCuentaSueldo() {
		return saldoCuentaSueldo;
	}

	// SETTER
	public void DepositarSaldoCuentaSueldo(double saldoNuevo) {

		if (saldoNuevo < 0) {
			System.out.println(
					"no podes tener un saldo negativo en tu caja de ahorro , debes crearte una cuenta corriente");
		} else {
			saldoCuentaSueldo = saldoCuentaSueldo + saldoNuevo;
			System.out.println("depocitamos su dinero ");
		}

	}
	public void DepositarSaldoCuentaSueldo(double saldoNuevo , String tipodecuenta) {
		if (saldoNuevo < 0) {
			System.out.println(
					"no podes tener un saldo negativo en tu " + tipodecuenta);
		} else {
			saldoCuentaSueldo = saldoCuentaSueldo + saldoNuevo;
			System.out.println("depocitamos su dinero en " + tipodecuenta);
		}

	}
	// FUNCION GETTERS
	public String getNombre() {
		return nombre;
	}

	// SETTERS PROCEDIMIENTO
	public void setNombre(String name) {
		nombre = name;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public long getCuit() {
		return cuit;
	}

	public void setCuit(long cuit) {
		this.cuit = cuit;
	}

	public String verEstadoDeAtributos() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", estadoCivil=" + estadoCivil + ", edad="
				+ edad + ", sexo=" + sexo + ", dni=" + dni + ", cuit=" + cuit + ", saldoCuentaSueldo="
				+ saldoCuentaSueldo + "]";
	}

}
