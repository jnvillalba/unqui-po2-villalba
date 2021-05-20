package unq.tp5;

public class Inmueble {
	
	private String descripcion;
	private String direccion;
	private Float valorFiscal;
	
	public Inmueble(String descripcion, String direccion, float valorFiscal) {
		super();
		this.setDescripcion(descripcion);
		this.setDireccion(direccion);
		this.setValorFiscal(valorFiscal);
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Float getValorFiscal() {
		return valorFiscal;
	}
	public void setValorFiscal(Float valorFiscal) {
		this.valorFiscal = valorFiscal;
	}


}
