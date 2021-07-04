package unq.tp10.Cuenta;

public class CuentaCorriente extends CuentaBancaria{
	private Integer limiteDescubierto;
	
	public CuentaCorriente(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo, Integer limiteDescubierto) {
		super(historialDeMovimientos, notificador, saldo);
		this.limiteDescubierto = limiteDescubierto;
	}
	
	@Override
	protected boolean condicionDeExtraccion(Integer monto) {
		// TODO Auto-generated method stub
		return this.saldo + this.limiteDescubierto >= monto;
	}

}
