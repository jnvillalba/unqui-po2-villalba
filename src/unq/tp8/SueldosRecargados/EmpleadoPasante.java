package unq.tp8.SueldosRecargados;

public class EmpleadoPasante extends Empleado {
	
	private int cantHorasTrabajoMensuales;
	
	public int getCantHorasTrabajoMensuales() {
		return cantHorasTrabajoMensuales;
	}

	public void setCantHorasTrabajoMensuales(int cantHorasTrabajoMensuales) {
		this.cantHorasTrabajoMensuales = cantHorasTrabajoMensuales;
	}
	
	@Override
	protected int extraHorasDeTrabajo() {
		return 40 * this.getCantHorasTrabajoMensuales();
	}

	@Override
	protected int extraFamiliar() {
		// TODO Auto-generated method stub
		return 0;
	}

	

	

}
