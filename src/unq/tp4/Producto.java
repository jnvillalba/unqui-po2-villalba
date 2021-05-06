package unq.tp4;

public class Producto implements Pagable {
	
	private float precio;
	private int stock;
	
	public Producto(float i, int j) {
		super();
		this.setPrecio(i);
		this.setStock(j);
	}
	
	@Override
	public float montoAPagar() {
		return getPrecio();
	}
	
	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	
	public void decrementarStock() {
		stock-= 1;
	}

	@Override
	public void regsitrar() {
		this.decrementarStock();
		
	}
	
}
