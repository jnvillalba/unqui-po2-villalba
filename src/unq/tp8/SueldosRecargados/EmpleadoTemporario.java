package unq.tp8.SueldosRecargados;


public class EmpleadoTemporario extends Empleado{
	
	//private Date fechaFinDesignacion;
	private int cantHorasTrabajo;
	
	public int getCantHorasTrabajo() {
		return cantHorasTrabajo;
	}

	public void setCantHorasTrabajo(int cantHorasTrabajo) {
		this.cantHorasTrabajo = cantHorasTrabajo;
	}

	
	@Override
	protected int extraFamiliar() {
	if (this.esCasade() || this.tieneHijes()) {
		return 100;
	}
	else {
		return 0;
	}
}

	@Override
	protected int extraHorasDeTrabajo() {
		return 5*this.getCantHorasTrabajo();
	}

	

}
