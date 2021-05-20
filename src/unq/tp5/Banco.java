package unq.tp5;

import java.util.ArrayList;

public class Banco {
	
	private ArrayList<Cliente> clientes;
	private ArrayList<Solicitud> solicitudes;

	public Banco() {
		super();
		this.clientes = new ArrayList<Cliente>();
		this.solicitudes = new ArrayList<Solicitud>();
	}

	public ArrayList<Solicitud> getSolicitudes() {
		return solicitudes;
	}

	public void setSolicitudes(ArrayList<Solicitud> solicitudes) {
		this.solicitudes = solicitudes;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public void registrar(Cliente cliente) {
		this.getClientes().add(cliente);
	}
	
	public void registarSolicitud(Solicitud solicitud) {
		this.getSolicitudes().add(solicitud);
	}
	
	public void acpetarSolicitud(Solicitud solicitud) {
		solicitud.getCliente().recibirCredito(solicitud.getMonto());
	}
	
	public ArrayList<Solicitud> solicitudesAceptadas() {
		ArrayList<Solicitud> solicitudesAceptadas = new ArrayList<Solicitud>();
		for(Solicitud solicitud: this.getSolicitudes()) {
			if(solicitud.evaluar()) {
				solicitudesAceptadas.add(solicitud);
			}
		}
		return solicitudesAceptadas;
	}
	
	
}
