package unq.tp8.SueldosRecargados;

public class EmpleadoPlanta extends Empleado {
	
	public EmpleadoPlanta(String estadoCivil, int sueldoBasico, int cantHijes) {
		super(estadoCivil, sueldoBasico, cantHijes);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected int extraFamiliar() {
		// TODO Auto-generated method stub
		return 150 * this.getCantHijes();
	}

	@Override
	protected int extraHorasDeTrabajo() {
		// TODO Auto-generated method stub
		return 0;
	}

}
