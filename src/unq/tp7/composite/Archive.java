package unq.tp7.composite;

import java.util.Date;

public class Archive implements FyleSystem{
	private String nombre;
	private int tama�o;
	private Date ultimaModificacion;
	
	public Archive(String nombre, int tama�o, Date ultimaModificacion) {
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
	public int getTama�o() {
		return tama�o;
	}
	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
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
		return this.getTama�o();
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
