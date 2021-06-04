package unq.tp7.composite;

import java.util.ArrayList;
import java.util.Date;



public class Directorio extends FileSystem {
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

}
