package unq.tp10.Cuenta;

public class CajaAhorro extends CuentaBancaria{

	public CajaAhorro(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo) {
		super(historialDeMovimientos, notificador, saldo);
	}

	@Override
	protected boolean condicionDeExtraccion(Integer monto) {
		return this.saldo >= monto;
	}
	

}
