package unq.tp7.composite;

import java.util.Date;

public class Archive {
	private String nombre;
	private Float tamaño;
	private Date ultimaModificacion;
	
	public Archive(String nombre, Float tamaño, Date ultimaModificacion) {
		super();
		this.setNombre(nombre);
		this.setTamaño(tamaño);
		this.setUltimaModificacion(ultimaModificacion);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Float getTamaño() {
		return tamaño;
	}
	public void setTamaño(Float tamaño) {
		this.tamaño = tamaño;
	}
	public Date getUltimaModificacion() {
		return ultimaModificacion;
	}
	public void setUltimaModificacion(Date ultimaModificacion) {
		this.ultimaModificacion = ultimaModificacion;
	}
	
	

}
