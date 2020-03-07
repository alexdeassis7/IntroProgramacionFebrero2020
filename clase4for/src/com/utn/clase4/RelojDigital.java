package com.utn.clase4;

public class RelojDigital {

	public static void main(String[] args) {

		for (int horas = 0; horas < 24; horas++) {
			for (int minutos = 0; minutos < 60; minutos++) {
				for (int segundos = 0; segundos < 60; segundos++) {
					//System.out.printf("%i : %i : %i \n", horas, minutos, segundos);
					System.out.println(horas + " : " + ":" + minutos + ":" + segundos);
				}
			}

		}

	}

}
