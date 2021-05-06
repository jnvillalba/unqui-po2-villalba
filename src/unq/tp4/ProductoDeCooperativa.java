package unq.tp4;

public class ProductoDeCooperativa extends Producto{
	
	private float iva;

	public ProductoDeCooperativa(float precio, int stock, float iva) {
		super(precio, stock);
		this.setIva(iva);
	}

	public float getIva() {
		return iva;
	}

	public void setIva(Float iva) {
		this.iva = iva;
	}
	
}
