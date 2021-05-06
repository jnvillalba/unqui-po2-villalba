package unq.tp4;

public class Servicio implements Pagable {
	
	private float costoPorUnidadConsumida;
	private float cantidadDeUnidadesConsumidas;
	
	public Servicio(float costo, float cantidad) {
		super();
		this.setCostoPorUnidadConsumida(costo);
		this.setCantidadDeUnidadesConsumidas(cantidad);
	}

	public float getCostoPorUnidadConsumida() {
		return costoPorUnidadConsumida;
	}

	public void setCostoPorUnidadConsumida(float costoPorUnidadConsumida) {
		this.costoPorUnidadConsumida = costoPorUnidadConsumida;
	}

	public float getCantidadDeUnidadesConsumidas() {
		return cantidadDeUnidadesConsumidas;
	}

	public void setCantidadDeUnidadesConsumidas(float cantidadDeUnidadesConsumidas) {
		this.cantidadDeUnidadesConsumidas = cantidadDeUnidadesConsumidas;
	}
	
	@Override
	public float montoAPagar() {
		return this.getCantidadDeUnidadesConsumidas()*this.getCostoPorUnidadConsumida();
	}

	@Override
	public void regsitrar() {
		//registrarPago(Factura factura);
		
	}
}
