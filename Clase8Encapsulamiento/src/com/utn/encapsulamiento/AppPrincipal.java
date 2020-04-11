package com.utn.encapsulamiento;

public class AppPrincipal {
	public static void main(String[] args) {

		Persona p1 = new Persona();
		System.out.println(p1.toString());
//		p1.nombre = "alex";
//		p1.apellido = "de assis";
//		p1.edad = 26;
//		p1.dni = 36863835;

//		p1.edad = 25;
		//invocamos a los metodos setter para modificar el estrado de los atributos
		p1.setEdad(8);
		p1.setApellido("de assis");
		p1.setNombre("Alex");
		p1.setDni(36863835);
		
		System.out.println(p1.getApellido());
		System.out.println(p1.getNombre());
		System.out.println(p1.getEdad());
		System.out.println(p1.getDni());
		
		System.out.println(p1.toString());
		
		
		
		
		
		
		
		
//		p1.edad = -89;
//		Pilares de la POO:
//		Emcapsulamiento

	}
}
