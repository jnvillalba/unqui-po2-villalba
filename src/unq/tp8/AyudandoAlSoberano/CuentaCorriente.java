package unq.tp8.AyudandoAlSoberano;

public class CuentaCorriente extends CuentaBancaria {
	 private int descubierto;
	 
	 public CuentaCorriente(String titular, int descubierto){
		 super(titular);
		 this.descubierto=descubierto;
	 }
	 
	 public int getDescubierto(){
		 return this.descubierto;
	 }

	@Override
	protected boolean cumpleConLaCondicionDelTipoDeCuenta(int monto) {
		// TODO Auto-generated method stub
		return this.getSaldo()+this.getDescubierto()>=monto;
	}
	
	 

}

