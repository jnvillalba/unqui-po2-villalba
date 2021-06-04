package unq.tp7.composite;

import java.util.Date;

public class Archive {
	private String nombre;
	private Float tama�o;
	private Date ultimaModificacion;
	
	public Archive(String nombre, Float tama�o, Date ultimaModificacion) {
		super();
		this.setNombre(nombre);
		this.setTama�o(tama�o);
		this.setUltimaModificacion(ultimaModificacion);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Float getTama�o() {
		return tama�o;
	}
	public void setTama�o(Float tama�o) {
		this.tama�o = tama�o;
	}
	public Date getUltimaModificacion() {
		return ultimaModificacion;
	}
	public void setUltimaModificacion(Date ultimaModificacion) {
		this.ultimaModificacion = ultimaModificacion;
	}
	
	

}
