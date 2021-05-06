package unq.tp4;

import java.util.ArrayList;

public class Cliente {
	
	private ArrayList<Pagable> pagables;
	
	public Cliente() {
		super();
		this.pagables = new ArrayList<Pagable>();
		
	}
	
	public void registrar(Pagable pagable){
		this.getProductos().add(pagable);
		pagable.regsitrar();
	}

	public ArrayList<Pagable> getProductos() {
		return pagables;
	}

	public void setProductos(ArrayList<Pagable> productos) {
		this.pagables = productos;
	}

}


