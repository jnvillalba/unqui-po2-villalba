package unq.tp4;

public class Impuesto implements Pagable{
	
	private float tasa;
	
	public Impuesto(float tasa) {
		this.setTasa(tasa);
	}
	
	public float montoAPagar() {
		return getTasa();
	}

	public float getTasa() {
		return tasa;
	}

	public void setTasa(float tasa) {
		this.tasa = tasa;
	}

	@Override
	public void regsitrar() {
		//registrarPago(Factura factura);
		
	}

}
