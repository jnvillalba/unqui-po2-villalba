package unq.tp4;

import java.util.ArrayList;

public class Cliente {
	
	private ArrayList<Producto> productos;
	
	public Cliente() {
		super();
		this.productos = new ArrayList<Producto>();
		
	}
	
	public void registrar(Producto producto){
		this.getProductos().add(producto);
		producto.decrementarStock();
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	
	public float montoTotal() {
		float montoTotal = 0;
		for (Producto producto: productos) {
			montoTotal+= producto.getPrecio();
		}
		return montoTotal;
	}
	
	
	

}


