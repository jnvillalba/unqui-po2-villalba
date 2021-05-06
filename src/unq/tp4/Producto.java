package unq.tp4;

public class Producto {
	
	private Float precio;
	private Float stock;
	
	public Producto(Float precio, Float stock) {
		super();
		this.setPrecio(precio);
		this.setStock(stock);
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public Float getStock() {
		return stock;
	}

	public void setStock(Float stock) {
		this.stock = stock;
	}
	
	public void decrementarStock() {
		stock-= 1;
	}
	
}
