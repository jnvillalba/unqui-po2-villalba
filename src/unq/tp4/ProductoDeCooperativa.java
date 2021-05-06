package unq.tp4;

public class ProductoDeCooperativa extends Producto{
	
	private Float iva;

	public ProductoDeCooperativa(Float precio, Float stock, Float iva) {
		super(precio, stock);
		this.setIva(iva);
	}

	public Float getIva() {
		return iva;
	}

	public void setIva(Float iva) {
		this.iva = iva;
	}
	
}
