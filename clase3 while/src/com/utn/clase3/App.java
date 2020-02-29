package com.utn.clase3;

public class App {

	public static void main(String[] args) {
		//mostramos todos los pares del cero al cien 	
		int x = 0 ; //variable de tipo contador 
			
		while (x <= 100) {
			System.out.println(x);
			x = x + 2;
		}
		x= 100;
		System.out.println("utilizamos Do While");
		
		do {
			System.out.println(x);
			x = x - 2; 
		}while(x >= 0);
		
		
	}

}
