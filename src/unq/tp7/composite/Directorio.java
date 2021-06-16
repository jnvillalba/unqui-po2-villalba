package unq.tp7.composite;

import java.util.ArrayList;
import java.util.Date;



public class Directorio implements FyleSystem {
	private String nombre;
	private Date fechaCreacion;
	private ArrayList<FileSystem> contenido;
	
	public Directorio(String nombre, Date fechaCreacion ,ArrayList<FileSystem> contenido) {
		super();
		this.setContenido(contenido);
		this.setFechaCreacion(fechaCreacion);
		this.setNombre(nombre);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public ArrayList<FileSystem> getContenido() {
		return contenido;
	}
	public void setContenido(ArrayList<FileSystem> contenido) {
		this.contenido = contenido;
	}

	@Override
	public int totalSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void printStructure() {
		System.out.println(this.getNombre());
		
	}

	@Override
	public Date lastModified() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void oldestElement() {
		// TODO Auto-generated method stub
		//ultimo o primero de la lista?
		
	}

}
