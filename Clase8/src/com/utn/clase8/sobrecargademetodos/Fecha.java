package com.utn.clase8.sobrecargademetodos;

import java.util.Calendar;

public class Fecha {
	// atributos de la clase fecha
	int dia = 0, mes = 0, anio = 0;

	// definimos explicitamente el constructor 0 (vacio) :
	public Fecha() {
	}

	// Creamos un Constructor 1 : con 3 parametros
	// alt + shift + s -> opcion : generrate Constructor using fields
	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
		
		if (!fechaCorrecta()) {
			// si algun dato ingresado es invalido tomamoms automaticamente todos los datos
			// del sistema
			Calendar fechaSistema = Calendar.getInstance();
			dia = fechaSistema.get(Calendar.DAY_OF_MONTH);
			mes = fechaSistema.get(Calendar.MONTH) + 1;
			anio = fechaSistema.get(Calendar.YEAR);
			System.out.println("usamos hora Sistema");

		}
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	// Sobrecarga de metodo constructor
	// Creamos un Constructor 2 : con 2 parametros
	public Fecha(int mes, int anio) {
		this.mes = mes;
		this.anio = anio;
	}

	// metodo 1 sobrecargador , parametros:Vacio
	public void asignarFecha() {
		// este metodo asigna la fecha completa del sistema
		Calendar fechaSistema = Calendar.getInstance();
		dia = fechaSistema.get(Calendar.DAY_OF_MONTH);
		mes = fechaSistema.get(Calendar.MONTH) + 1;
		anio = fechaSistema.get(Calendar.YEAR);
	}
	

	// metodo 2 sobrecargado, parametros : un int
	public void asignarFecha(int d) {
		// este metodo asigna el dia mediante un parametro
		Calendar fechaSistema = Calendar.getInstance();
		dia = d;
		mes = fechaSistema.get(Calendar.MONTH) + 1;
		anio = fechaSistema.get(Calendar.YEAR);
	}

	// metodo 3 sobrecargado, parametros : dos int
	public void asignarFecha(int d, int m) {
		// este metodo asigna el dia y el mes mediante parametros
		Calendar fechaSistema = Calendar.getInstance();
		dia = d;
		mes = m;
		anio = fechaSistema.get(Calendar.YEAR);
	}

	// metodo 4 sobrecargado, parametros : tres int
	public void asignarFecha(int d, int m, int a) {
		// este metodo recibe todos los datos por parametros
		dia = d;
		mes = m;
		anio = a;
	}

	public boolean fechaCorrecta() {
		boolean diaCorrecto, mesCorrecto, anioCorrecto;
		anioCorrecto = (anio > 0);// validamos el anio
		mesCorrecto = ((mes >= 1) && (mes <= 12)); // validamos el mes
		// validamos el dia
		switch (mes) {
		case 2:// febrero
//			mes 2 puede tener 29 o 28 dias si es bisiesto
			if (esBisiesto())
				diaCorrecto = ((dia >= 1) && (dia <= 29));
			else
				diaCorrecto = ((dia >= 1) && (dia <= 28));

			break;

		case 4:
		case 6:
		case 9:
		case 11:
//			mes 4 / 6 / 9 / 11 con  30 dias
			diaCorrecto = ((dia >= 1) && (dia <= 30));
			break;

		default:
//			mes 1 /3 /5 /7 /8 /10 /12 con 31
			diaCorrecto = ((dia >= 1) && (dia <= 31));
			break;
		}
		System.out.println("dia" + diaCorrecto);
		System.out.println("mes" + mesCorrecto);
		System.out.println("anio " + anioCorrecto);
		return (diaCorrecto && mesCorrecto && anioCorrecto);

	}

	public boolean esBisiesto() {
		return (anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0));

	}

	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", anio=" + anio + "]";
	}

}
