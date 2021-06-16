package unq.tp7.composite;

import java.util.Date;

public class Archive implements FyleSystem{
	private String nombre;
	private int tamaño;
	private Date ultimaModificacion;
	
	public Archive(String nombre, int tamaño, Date ultimaModificacion) {
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
	public int getTamaño() {
		return tamaño;
	}
	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
	public Date getUltimaModificacion() {
		return ultimaModificacion;
	}
	public void setUltimaModificacion(Date ultimaModificacion) {
		this.ultimaModificacion = ultimaModificacion;
	}

	@Override
	public int totalSize() {
		// TODO Auto-generated method stub
		return this.getTamaño();
	}

	@Override
	public void printStructure() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Date lastModified() {
		return this.getUltimaModificacion();
		
	}

	@Override
	public void oldestElement() {
		// TODO Auto-generated method stub
		
	}
	
	

}
