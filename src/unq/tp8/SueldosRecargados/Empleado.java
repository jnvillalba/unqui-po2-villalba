package unq.tp8.SueldosRecargados;



public abstract class Empleado {
	private String estadoCivil;
	private int sueldoBasico;
	private int cantHijes;
	
	public Empleado(String estadoCivil, int sueldoBasico, int cantHijes) {
		super();
		this.setEstadoCivil(estadoCivil);
		this.setSueldoBasico(sueldoBasico);
		this.setCantHijes(cantHijes);
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
	
	protected final int sueldoBruto() {
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
	
	protected int retenciones(){
		return  (this.sueldoBruto()*13)/100;
	}
	
	public final float sueldo() {
		return this.sueldoBruto() - this.retenciones();		
	}
	

}
