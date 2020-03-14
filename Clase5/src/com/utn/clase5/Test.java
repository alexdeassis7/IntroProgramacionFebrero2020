package com.utn.clase5;

public class Test {
	
	/** ejemplo de constantes en java */
	static final int DIAS_SEMANA = 7;

	public static void main(String[] args) {
		
		final int DIAS_LABORALES = 5;
		/**Las constantes no se pueden modificar su valor*/
		//DIAS_SEMANA = 9;
		//DIAS_LABORALES = 8;

		System.out.println("el numero de dias de la semana son " + DIAS_SEMANA);
	    System.out.println("El numero de dias laborales de la semana son " + DIAS_LABORALES);
	}

}
