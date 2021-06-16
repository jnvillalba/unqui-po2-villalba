package unq.tp8.SueldosRecargados;



public abstract class Empleado {
	private String nombre;
	private String estadoCivil;
	private int sueldoBasico;
	private int cantHijes;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	public int getSueldoBasico() {
		return sueldoBasico;
	}
	public void setSueldoBasico(int sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
	
	public int getCantHijes() {
		return cantHijes;
	}
	public void setCantHijes(int cantHijes) {
		this.cantHijes = cantHijes;
	}
	
	private int sueldoBruto() {
		return this.getSueldoBasico() + this.extraHorasDeTrabajo() + this.extraFamiliar();
	}
	
	protected abstract int extraHorasDeTrabajo();
	
	protected abstract int extraFamiliar();
	
	public boolean esCasade() {
		return this.estadoCivil == "Casade";
	}
	
	public boolean tieneHijes() {
		return this.getCantHijes() >= 1;
	}
	
	private int retenciones(){
		return (this.sueldoBruto() *13)/100;
	}
	
	public final int sueldo() {
		return this.sueldoBruto() - this.retenciones();		
	}
	

}
