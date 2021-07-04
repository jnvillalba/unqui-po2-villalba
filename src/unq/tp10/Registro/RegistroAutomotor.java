package unq.tp10.Registro;

import java.time.LocalDate;

public class RegistroAutomotor {

	public Boolean debeRealizarVtv(Vehiculo vehiculo, LocalDate fecha) {

		//LocalDate fechaFabricacion = vehiculo.getFechaFabricacion();
		//Boolean esVehiculoPolicial = vehiculo.esVehiculoPolicial();
		//String ciudadRadicacion = vehiculo.ciudadRadicacion();
		
		// vehiculos policiales no realizan vtv, ya que tienen otro tipo de control
		// si lo realizan vtv los vehiculos con mas de 1 anio de antiguedad y radicados
		// en 'Buenos Aires'
		
		//Long Method
		return (!vehiculo.esVehiculoPolicial() && this.vehiculoConMasDeUnAñoDeAntiguedad(vehiculo, fecha)
				&& this.vehiculoRadicadoEnBsAs(vehiculo) );

	}
	
	private boolean vehiculoConMasDeUnAñoDeAntiguedad(Vehiculo vehiculo, LocalDate fecha) {
		return fecha.minusYears(1).isAfter(vehiculo.getFechaFabricacion());
	}
	
	private boolean vehiculoRadicadoEnBsAs(Vehiculo vehiculo) {
		return vehiculo.ciudadRadicacion().equalsIgnoreCase("Buenos Aires");
	}
	
}
