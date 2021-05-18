package unq.tp5;

public class SolicitudCreditoHipotecario extends Solicitud {
	
	private Inmueble inmueble;	
	

	public Inmueble getInmueble() {
		return inmueble;
	}

	public void setInmueble(Inmueble inmueble) {
		this.inmueble = inmueble;
	}
	public SolicitudCreditoHipotecario(Cliente cliente, float monto, float plazoEnMeses, Inmueble inmueble) {
		super(cliente, monto, plazoEnMeses);
		this.setInmueble(inmueble);
	}
	
	@Override
	public boolean evaluar() {
		return this.montoCuotaMensual() < (this.getCliente().getSueldo()*0.5) 
				&& this.getMonto() < (this.getInmueble().getValorFiscal()*0.7)
				&& this.getCliente().getEdad() < 65;
	}
	
}
