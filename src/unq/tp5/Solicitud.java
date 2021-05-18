package unq.tp5;

public abstract class Solicitud {
	
	private Cliente cliente;
	private float monto;
	private float plazoEnMeses;
	
	public Solicitud(Cliente cliente, float monto, float plazoEnMeses ) {
		super();
		this.setCliente(cliente);
		this.setMonto(monto);
		this.setPlazoEnMeses(plazoEnMeses);
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public float getMonto() {
		return monto;
	}
	public void setMonto(float monto) {
		this.monto = monto;
	}
	public float getPlazoEnMeses() {
		return plazoEnMeses;
	}
	public void setPlazoEnMeses(float plazoEnMeses) {
		this.plazoEnMeses = plazoEnMeses;
	}
	
	public float montoCuotaMensual() {
		return this.getMonto()/ this.getPlazoEnMeses();
		
	}
	
	public boolean evaluar() {
		return false;
	}

}
