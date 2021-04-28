package unq.tp3;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Persona {
	
	private String nombre;
	private String apellido;
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
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int edad() {
		LocalDate fechaNac = this.convertToLocalDateViaInstant(this.getFecNacimiento());
		Period edad = Period.between(fechaNac, LocalDate.now());
		return  edad.getYears();
	}
	
	public LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
	    return dateToConvert.toInstant()
	      .atZone(ZoneId.systemDefault())
	      .toLocalDate();
	}
	
	/*Responder: Si un objeto cualquiera que le pide la edad a una Persona: 
	 * ¿Conoce cómo ésta calcula u obtiene tal valor? 
	 *
	 * Solo conoce el dato que devuelve, no como se obtiene
	 *
	 *¿Cómo se llama el mecanismo de abstracción que permite esto?
	 *
	 *Encapsulamiento
	 *
	 */
	
	public boolean menorQue(Persona persona) {
		return this.edad() < persona.edad();
	}
	
	public Persona(String nombre,String apellido, Date fechaNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecNacimiento = fechaNacimiento;
	}


}
