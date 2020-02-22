package com.educacionit.clase2;

public class AppPrincipal {
	public static void main(String[] args) {
		// creamos una instancia de la clase Persona
		// invocamos al metodo constructor!
		Persona p1 = new Persona();

		System.out.println(p1.verEstadoDeAtributos());
		// Utilizamos el constructor 2
		Persona p2 = new Persona(234234, "leila", "otazu");

		System.out.println(p2.verEstadoDeAtributos());
		
		p2.DepositarSaldoCuentaSueldo(800);
		
		p2.DepositarSaldoCuentaSueldo(800 , "Caja De AHOROOOOOOOO en patacones");
		
		
	}

	// seteamo estado a los atributos Public
	// p1.edad = 26 ;
	// p1.sexo = 'm';
	// p1.nombre = "Alex";
	// System.out.println(p1.getNombre());
	//
	// p1.setNombre("Alex");
	// System.out.println(p1.getNombre());
	//
	//
	//// p1.apellido= "De Assis";
	//// p1.dni = 36963986;
	//// p1.cuit = 2036963986;
	//// p1.estadoCivil = "Soltero";
	//
	// p1.DepositarSaldoCuentaSueldo(500);
	// System.out.println("saldo : "+p1.getSaldoCuentaSueldo());
	// }
	//
}
