package unq.tp8.SueldosRecargados;

public class EmpleadoPlanta extends Empleado {

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
