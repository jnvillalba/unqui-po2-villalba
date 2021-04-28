package unq.tp3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Persona {
	
	private String nombre;
	private Date fecNacimiento;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFecNacimiento() {
		return fecNacimiento;
	}
	public void setFecNacimiento(Date fecNacimiento) {
		this.fecNacimiento = fecNacimiento;
	}
	
	public int edad() {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNac = LocalDate.parse("this.getFecNacimiento()", fmt);
		LocalDate ahora = LocalDate.now();
		Period periodo = Period.between( fechaNac, ahora);
		return  periodo.getYears();
	}
	
	/*Responder: Si un objeto cualquiera que le pide la edad a una Persona: 
	 * ¿Conoce cómo ésta calcula u obtiene tal valor? 
	 *
	 * Solo conoce el dato que devuelve, no como se obtiene
	 *
	 *¿Cómo se llama el mecanismo de abstracción que permite esto?
	 *
	 *
	 *
	 */
	
	public boolean menorQue(Persona persona) {
		return this.edad() < persona.edad();
	}
	
	public Persona(String nombre, Date fechaNacimiento) {
		this.nombre = nombre;
		this.fecNacimiento = fechaNacimiento;
	}


}
