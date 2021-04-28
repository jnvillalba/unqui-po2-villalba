package unq.tp3;

import java.util.ArrayList;

public class EquipoDeTrabajo {
	private String nombre;
	private ArrayList<Persona> integrantes = new ArrayList<Persona>();
	
	public EquipoDeTrabajo(String nombre/*, ArrayList<Persona> integrantes*/) {
		super();
		this.nombre = nombre;
		//this.integrantes = integrantes;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Persona> getIntegrantes() {
		return integrantes;
	}
	public void setIntegrantes(ArrayList<Persona> integrantes) {
		this.integrantes = integrantes;
	}
	
	public float promedioEdadIntegrantes() {
		return this.edadTotalIntegrantes() / this.getIntegrantes().size() ;
	}
	
	public int edadTotalIntegrantes() {
		return this.getIntegrantes().stream()
			      .mapToInt(persona -> persona.edad())
			      .sum();
	}
	
	
}
