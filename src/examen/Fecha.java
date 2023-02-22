package examen;

/**
 * Lo que hace este programa es comprobar si una fecha es valida
 * 
 * @author dam108
 * @version 1.0
 *
 */
public class Fecha {
	/**
	 * Lo que hace es devolver si la fecha es valida o no dependiendo los valores que se ingresen 
	 * 
	 * @param anio
	 * 			Este dato que se ingresa nos indica el año que queremos 
	 * @param mes
	 * 			Este dato que se ingresa nos indica el mes que queremos
	 * @param dia
	 * 			Este dato que se ingresa nos indica el dia que queremos 
	 * @return
	 * 			Devuelve si la fecha es valida
	 */
	public static boolean validarFecha(int anio, int mes, int dia) {
		boolean fechaValida = false;
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			if ((mes <= 12) && (dia <= 31)) {
				if (mes == 2) {
					fechaValida = dia <= 28;
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		return fechaValida;
	}
}