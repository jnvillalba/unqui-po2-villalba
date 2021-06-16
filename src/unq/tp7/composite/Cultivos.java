package unq.tp7.composite;

public abstract class Cultivos {
	
	private int gananciaAnualCultivo;

	public int getGananciaAnualCultivo() {
		return gananciaAnualCultivo;
	}

	public void setGananciaAnualCultivo(int gananciaAnual) {
		this.gananciaAnualCultivo = gananciaAnual;
	}

	public Cultivos(int gananciaAnual) {
		super();
		this.setGananciaAnualCultivo(gananciaAnual);
	}
	
	public abstract void agregarCultivo(Cultivos cultivo);
	
	public abstract void borrarCultivo(Cultivos cultivo);
	

}
