package unq.tp5;

public class SolicitudCreditoPersonal extends Solicitud {
	
	public SolicitudCreditoPersonal(Cliente cliente, float monto, float plazoEnMeses) {
		super(cliente, monto, plazoEnMeses);
	}
	
	@Override
	public boolean evaluar() {
		return this.getCliente().sueldoNetoAnual() >= 15000 
				&& this.montoCuotaMensual() < (this.getCliente().getSueldo()*0.7);
	}
}
