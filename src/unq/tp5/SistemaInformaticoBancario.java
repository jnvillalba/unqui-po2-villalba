package unq.tp5;

public class SistemaInformaticoBancario {

	public static void agregarNuevoClienteAlBanco(Cliente cliente, Banco banco) {
		banco.registrar(cliente);
	}
	
	public static void agregarNuevaSolicitudAlBanco(Solicitud solicitud, Banco banco) {
		banco.registarSolicitud(solicitud);
	}
	
	public static float montoTotalADesembolsar(Banco banco) {
		float montoFinal = 0;
		for(Solicitud solicitud: banco.solicitudesAceptadas()) {
			montoFinal+= solicitud.getMonto();
		}
		return montoFinal;
	}
	
	
}
