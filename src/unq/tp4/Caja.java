package unq.tp4;

public class Caja {
	
	public float montoTotal(Cliente cliente) {
		float montoTotal = 0;
		for (Pagable producto: cliente.getProductos()) {
			montoTotal+= producto.montoAPagar();
		}
		return montoTotal;
	}

}
